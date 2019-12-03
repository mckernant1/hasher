package hasher

import picocli.CommandLine.Command

@Command(name = "check", mixinStandardHelpOptions = true,
        description = ["Checks hashes of existing files against stored hashes"])
class Check : Runnable {
    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
