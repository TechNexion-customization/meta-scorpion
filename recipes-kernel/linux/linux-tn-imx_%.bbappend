FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Change the source URL to point to a local git server. See:
# https://git-scm.com/book/en/v2/Git-on-the-Server-Setting-Up-the-Server
# for more information.
KERNEL_SRC_pn-scorpion = "git:///srv/git/linux.git"

# This is the branch we will use
KERNEL_BRANCH_pn-scorpion = "scorpion-kernel-test"

# Setting the SRCREV to ${AUTOREV} causes the HEAD of the branch
# to be used. Set this to a specific commit hash if only a specific
# commit is needed.
SRCREV_pn-scorpion = "${AUTOREV}"

# We do the same for the 'scorpion-8mp' machine as well.
# TODO: Change this to use COMPATIBLE_MACHINE instead and simplfy
# this recipe.
KERNEL_SRC_pn-scorpion-8mp = "git:///srv/git/linux.git"
KERNEL_BRANCH_pn-scorpion-8mp = "scorpion-kernel-test"
SRCREV_pn-scorpion-8mp = "${AUTOREV}"