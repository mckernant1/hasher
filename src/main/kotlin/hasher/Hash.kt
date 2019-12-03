package hasher

import picocli.CommandLine.*
import java.io.File

@Command(name = "hash", mixinStandardHelpOptions = true,
        description = ["Hashes files and saves them to be checked against in the future"])
class Hash : Runnable {

    @Parameters(index = "0", description = ["The file to hash"])
    private lateinit var file: File

    @Option(names = ["-a", "--algorithm"], description = [""])
    private var algorithm = "MD5"

    @Option(names = ["-t", "--timestamp"], description = ["include the timestamp in the hash"])
    private var addTimestamp = false

    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
