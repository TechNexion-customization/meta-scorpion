# Copyright (C) 2021 TechNexion Ltd.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup used by Scorpion demo project providing packages and utilities \
for hardware test."
SUMMARY = "Scorpion packagegroup - testapps"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    alsa-utils \
    alsa-tools \
    dosfstools \
    evtest \
    e2fsprogs-mke2fs \
    fbset \
    i2c-tools \
    iproute2 \
    tcpdump \
    memtester \
    stress-ng \
    hdparm \
    glmark2 \
    ethtool \
    mtd-utils \
    mtd-utils-ubifs \
"
