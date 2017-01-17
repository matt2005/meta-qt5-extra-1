SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "c12cb924bcf808369e262be1dc8f4e21eb935d33"
PV = "0.7.1"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
"
