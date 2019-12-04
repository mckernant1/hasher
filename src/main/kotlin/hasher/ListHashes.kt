package hasher

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import picocli.CommandLine.*
import java.io.File
import kotlin.system.exitProcess

@Command(name = "ls", mixinStandardHelpOptions = true,
        description = ["Lists the available names of saved hashes"])
class ListHashes : Runnable {

    @Parameters(description = ["The name of the hash to retrieve"])
    private var names: List<String> = listOf()

    override fun run() {
        setup()
        val settingsJson = json.parse(SettingsFile.serializer(), Hash.settingsFile.readText())

        names.forEach { name ->
            println(settingsJson.hashes[name]?.files ?: "There is no hash with this name")
            println()
        }

    }


    companion object {
        val settingsResource: String? = System.getProperty("HASHER_CONF")
        val json = Json(JsonConfiguration.Stable)
        lateinit var settingsFile: File
    }

    fun setup() {
        if (settingsResource == null) {
            System.err.println("Please run hasher with no arguments to setup your environment")
            exitProcess(1)
        }
        println("Running from $settingsResource config file")
        settingsFile = File(settingsResource)
    }
}
