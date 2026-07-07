plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
rootProject.name = "kotlin-test-drives-gradle"
include("kotlin-arrow-optics")
include("kotlin-apps:microchip-maker:microchip-maker-gui")
include("kotlin-arrow-optics:kotlin-optics-crums-2")
include("kotlin-arrow-optics:kotlin-optics-crums-1")
include("experiments")
include("experiments:sealed-interfaces-interops")
include("kotlin-utilities:kotlin-number-operations")
include("kotlin-utilities:kotlin-string-operations")
findProject(":experiments:sealed-interfaces-interops")?.name = "sealed-interfaces-interops"
include("kotlin-apps:monads-are-no-nomads")
findProject(":kotlin-apps:monads-are-no-nomads")?.name = "monads-are-no-nomads"
include("kotlin-crums:module-common")
findProject(":kotlin-crums:module-common")?.name = "module-common"
include("kotlin-crums:module-use")
findProject(":kotlin-crums:module-use")?.name = "module-use"
include("kotlin-apps:json-to-builder-pattern")
findProject(":kotlin-apps:json-to-builder-pattern")?.name = "json-to-builder-pattern"
include("kotlin-apps:xml-adder")
findProject(":kotlin-apps:xml-adder")?.name = "xml-adder"
include("kotlin-apps:performance-projects:performance-input-test-generator")
include("kotlin-apps:performance-projects:performance-buffered-reader")
include("kotlin-apps:performance-projects:performance-jump-search")
include("kotlin-apps:string-array-paradigms:string-paradigm-api")
include("kotlin-apps:string-array-paradigms:string-paradigm-expression-api")
include("kotlin-apps:string-array-paradigms:string-paradigm-dependency_2")
include("kotlin-apps:string-array-paradigms:string-paradigm-expression-no-wrapper")
include("kotlin-apps:string-array-paradigms:string-paradigm-expression-original")
include("kotlin-apps:string-array-paradigms:string-paradigm-expression_1")
include("kotlin-apps:string-array-paradigms:string-paradigm-expression_2")
include("kotlin-apps:string-array-paradigms:string-paradigm-no-wrapper")
include("kotlin-apps:string-array-paradigms:string-paradigm-test-generator")
include("kotlin-apps:string-array-paradigms:string-paradigm_1")
include("kotlin-apps:string-array-paradigms:string-paradigm_original")
include("kotlin-apps:coin-archiver-gradle")
