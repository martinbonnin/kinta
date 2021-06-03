plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.dokka")
}

dependencies {
    implementation(Libs.kotlinStdlib)

    implementation(Libs.coroutines)
    testImplementation(Libs.jUnit)
}

