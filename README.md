# spotless-configuration-repro

## Steps

#### Publish the convention and settings plugin to `mavenLocal` repository

```shell
cd plugins
./gradlew publishToMavenLocal
```

#### Assemble the consumer project of those plugins

```shell
cd ..
cd consumer
./gradlew assemble
```
