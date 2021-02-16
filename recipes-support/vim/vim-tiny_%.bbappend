# When building with xwayland, there are no GTK+3 libraries and headers
# provided, even though X11 is used as the backend. This causes a failure
# during compilation. To get around this, we disable x11 and gui versions
# of vim
PACKAGECONFIG_remove = "x11 gtkgui"