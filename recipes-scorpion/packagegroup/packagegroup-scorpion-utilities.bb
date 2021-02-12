# Copyright (C) 2021 TechNexion Ltd.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup used by TechNexion Scorpion Project providing runtime utilities"
SUMMARY = "Scorpion packagegroup - utilities"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    parted \
    e2fsprogs-resize2fs \
"
