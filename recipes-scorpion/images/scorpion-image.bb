# Copyright 2021 TechNexion
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Scorpion Production Image"
LICENSE = "MIT"

inherit core-image

# Uncomment to set root password and add "scorpion" user
#require recipes-scorpion/images/scorpion-users.inc

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