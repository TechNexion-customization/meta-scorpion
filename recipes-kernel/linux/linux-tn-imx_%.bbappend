FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

KERNEL_SRC = "git:///srv/git/linux.git"
KERNEL_BRANCH = "scorpion-kernel-test"
SRCREV = "${AUTOREV}"