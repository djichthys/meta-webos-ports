DESCRIPTION = "LuneOS QML components"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

PV = "0.1.0+gitr${SRCPV}"
SRCREV = "7334fe60a918b4d3c2e3e438bcb6b0684eb36844"

DEPENDS = "qtbase qtdeclarative luna-service2"

SRC_URI = "${WEBOS_PORTS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

inherit qmake5
inherit webos_ports_repo
inherit webos_filesystem_paths

PACKAGES += "${PN}-examples"
FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/LuneOS/ \
    ${OE_QMAKE_PATH_QML}/QtQuick/Controls/Styles/LuneOS/ \
"
FILES_${PN}-examples += " \
    ${webos_applicationsdir}/org.luneos.components.gallery \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/LuneOS/*/.debug \
    ${OE_QMAKE_PATH_QML}/QtQuick/Controls/Styles/LuneOS/.debug \
"
