# Copyright 2021 TechNexion
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Scorpion Production Image"
LICENSE = "MIT"

inherit core-image

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