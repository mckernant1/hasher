# Hasher
Command line hasher for linux file verification


##To install
```bash
brew tap mckernant1/tools
brew install hasher
```

## Commands

To hash a file or directory with a given name
```bash
hasher hash myhash ~/Desktop/test.txt
```

To list all hashes
```bash
hash ls 
```

To list all files for a hash
```bash
hash ls myhash
```

To check a hash
```bash
hash check myhash
```

### Settings JSON Structure

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
