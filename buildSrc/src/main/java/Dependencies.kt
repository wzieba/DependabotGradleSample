object Versions {
    val kotlin = "1.4.0"
}

object Libs {
    private const val room_version = "2.2.5"

    val kotlinStd = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    val room = "androidx.room:room-runtime:$room_version"
    val roomCompiler = "androidx.room:room-compiler:$room_version"

    val material = "com.google.android.material:material:1.2.0"
}
