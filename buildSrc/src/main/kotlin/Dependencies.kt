object Versions {
    const val coreKtxVersion = "1.6.0"
    const val appCompatVersion = "1.4.0"
    const val constraintLayoutVersion = "2.1.2"

    const val materialVersion = "1.4.0"

    const val junitVersion = "4.13.2"
    const val extJunitVersion = "1.1.3"
    const val espressoVersion = "3.4.0"
}

object Deps {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"

    const val materialVersion = "com.google.android.material:material:${Versions.materialVersion}"
}

object UnitTest {
    const val junit = "junit:junit:${Versions.junitVersion}"
}

object AndroidTest {
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunitVersion}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
}