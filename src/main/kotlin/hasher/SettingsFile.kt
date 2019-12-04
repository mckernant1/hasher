package hasher

import kotlinx.serialization.Serializable

@Serializable
data class SettingsFile(
        val hashes: MutableMap<String, HashStore>
)

@Serializable
data class HashStore(
        val files: MutableMap<String, String>,
        val options: Options
)

@Serializable
data class Options(
        val includeWhitespace: Boolean,
        val includeTimestamp: Boolean,
        val algorithm: String
)
