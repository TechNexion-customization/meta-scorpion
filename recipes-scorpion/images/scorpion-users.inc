# ADD THIS TO MAKE IMAGE more secure
# Ensure ROOT password
# Add a default user and give the user a predefined password

# Remove debugging tweaks
IMAGE_FEATURES_remove += " \
    debug-tweaks \
"

# Add root password, and add the 'scorpion' user
inherit extrausers

#
# Setting a password in cleartext
#
# The'-P' option in usermod indicates that the password is CLEAR.
# If you wish to keep the root password secret, you need to ensure
# that this file is not visible to those outside of your organization.
EXTRA_USERS_PARAMS = " \
    usermod -P technexion root; \
    useradd -p '' scorpion \
"

# Setting an encrypted password
# The '-p' option in usermod indicates that the password is encrypted. Create an 
# encrypted password using the following command:
#
#   mkpasswd -m sha-512 <your_clear_password> -s "salt-string-between-8-and-16-chars-long"
#
# In the example below:
#
#   mkpasswd -m sha-512 technexion -s "rootpasswd"
#
#  Special characters need to be escaped (e.g. $) and the password needs to be enclosed
#  by single quotes ('')
#EXTRA_USERS_PARAMS = " \
#    usermod -p '\$6\$rootpasswd\$NTvL1vM6q9WC7PFgKYZawT1GZ9.yUwzN/wLUFSOBelqP3jDG.PINYQcagdPnGaZF9QZ17NgOlgNcOeT.8HGVL0' root; \
#    useradd -p '' scorpion \
#"