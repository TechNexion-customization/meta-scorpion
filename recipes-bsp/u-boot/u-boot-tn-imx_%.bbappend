FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Change the source URL to point to a local git server. See:
# https://git-scm.com/book/en/v2/Git-on-the-Server-Setting-Up-the-Server
# for more information.
SRCSERVER_pn-scorpion = "git:///srv/git/u-boot-edm.git"

# This is the branch we will use
SRCBRANCH_pn-scorpion = "scorpion_test"

# Setting the SRCREV to ${AUTOREV} causes the HEAD of the branch
# to be used. Set this to a specific commit hash if only a specific
# commit is needed.
SRCREV_pn-scorpion  = "${AUTOREV}"

# We do the same for the 'scorpion-8mp' machine as well.
# TODO: Change this to use COMPATIBLE_MACHINE instead and simplfy
# this recipe.
SRCSERVER_pn-scorpion-8mp = "git:///srv/git/u-boot-edm.git"
SRCBRANCH_pn-scorpion-8mp = "scorpion_test"
SRCREV_pn-scorpion-8mp  = "${AUTOREV}"