SUMMARY = "Library for managing partitions"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-base cmake-lib pkgconfig

DEPENDS += " \
    ki18n \
    kiconthemes \
    kio \
    kservice \
    \
    parted \
    libatasmart \
"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "14570132ef88df21060198fdcc4b8e7a"
SRC_URI[sha256sum] = "aa4a89c8a3745b2c06971f916aef30d87b3393a3b8c55ffc791cf46eb86b2454"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KPMcore, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KPMcore, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
