//import com.squareup.moshi.JsonReader
//import java.io.File
//import okio.Okio
//
//fun main() {
//    val inputStream = File("telegram_log.json")
//    val source = Okio.source(inputStream)
//    val bufferedSource = Okio.buffer(source)
//
//    // Throws `Exception in thread "main" java.lang.NoSuchMethodError: okio.BufferedSource.getBuffer()Lokio/Buffer;`
//    val jsonReader = JsonReader.of(bufferedSource)
//}
