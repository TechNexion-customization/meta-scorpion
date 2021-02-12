# Copyright 2021 TechNexion
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Scorpion Test Image \
Contains utilities needed for test of Scorpion"
LICENSE = "MIT"

inherit core-image

## Select Image Features
IMAGE_FEATURES += " \
    debug-tweaks \
    tools-profile \
    tools-debug \
    ssh-server-dropbear \
    splash \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-core-buildessential \
    packagegroup-scorpion-testapps \
    packagegroup-scorpion-utilities \
    packagegroup-scorpion-python3 \
"