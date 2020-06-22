import com.squareup.moshi.JsonReader
import java.io.File

import okio.BufferedSource
import okio.buffer
import okio.source

fun main() {
    val inputStream = File("telegram_log.json")
    val bufferedSource: BufferedSource = inputStream.source().buffer()

    // Throws `Exception in thread "main" java.lang.NoSuchMethodError: okio.BufferedSource.getBuffer()Lokio/Buffer;`
    val jsonReader = JsonReader.of(bufferedSource)
}
