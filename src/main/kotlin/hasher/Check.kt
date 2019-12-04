package hasher

import picocli.CommandLine.Command
import picocli.CommandLine.Parameters
import java.io.File
import kotlin.system.exitProcess

@Command(name = "check", mixinStandardHelpOptions = true,
        description = ["Checks hashes of existing files against stored hashes"])
class Check : Runnable {

    @Parameters(index = "0", description = ["Name of the hash which to check"])
    lateinit var name: String


    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        val settingsResource: String? = System.getProperty("HASHER_CONF")
    }
    init {
        if (settingsResource == null) {
            System.err.println("Please run hasher with no arguments to setup your environment")
            exitProcess(1)
        }
        println("Running from ${Hash.settingsResource} config file")
        val settingsFile = File(settingsResource)
    }
}
