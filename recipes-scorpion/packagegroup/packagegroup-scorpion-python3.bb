# Copyright (C) 2021 TechNexion Ltd.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup used by Scorpion demo project providing packages and utilities \
for python3."
SUMMARY = "Scorpion packagegroup - python3"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Add python packages:
#   python3-modules brings in many useful python modules
#   python3-dev brings in libraries and include files required
#     for building some packages on the target when installing with pip
#   python-pip3 allow easy installation of external packages

#   Note: Some python packages installed with pip require compiling on the
#         target. Be sure to include packagegroup-core-buildessential in your
#         image recipe in order to include a native toolchain and other files
#         needed.

#   Note: Additional note here regarding python2. This is removed by default
#         in future releases of Yocto, and has been EOF since 2019.

RDEPENDS_${PN} = " \
    python3-modules \
    python3-dev\
    python3-pip \
"
