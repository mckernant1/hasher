# Hasher
Command line hasher for linux file verification

## Settings JSON Structure

```json5
{
  hashes: {
    hashName: {
      files: { // List of paths to verify with their corresponding hash value
        "/home/test.txt": "hashValue"
      },
      options: { // options with their default values
        includeWhitespace: false, 
        includeTimestamp: false,
        algorithm: "MD5"
      }
    }
  }
}
```
