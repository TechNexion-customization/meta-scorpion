# Copyright 2021 TechNexion
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Scorpion Production Image"
LICENSE = "MIT"

inherit core-image

# Uncomment to set root password and add "scorpion" user
require recipes-scorpion/images/scorpion-users.inc

# Select Image Features
IMAGE_FEATURES += " \
    ssh-server-dropbear \
    splash \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-core-buildessential \
    packagegroup-scorpion-utilities \
    packagegroup-scorpion-python3 \
"

# Enable local auto-login of the normal user (local = serial port and
# virtual console by default, can be configured).
SCORPION_LOCAL_GETTY ?= " \
    ${IMAGE_ROOTFS}${systemd_system_unitdir}/serial-getty@.service \
    ${IMAGE_ROOTFS}${systemd_system_unitdir}/getty@.service \
"
# Define a function that modifies the systemd unit config files with
# the autologin arguments. Note that the 'scorpion' user must be added
# using the useradd command for this image.
local_autologin () {
     sed -i -e 's/^\(ExecStart *=.*getty \)/\1--autologin scorpion /' ${SCORPION_LOCAL_GETTY}
}

# Add the function so that it is executed after the rootfs has been generated
ROOTFS_POSTPROCESS_COMMAND += "local_autologin; "
