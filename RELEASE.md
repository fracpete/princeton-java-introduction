# RELEASE

Switch to Java 8.

Use the following command to make a new release:

```
mvn --batch-mode release:clean release:prepare release:perform
```

Push all changes

Go to the following URL and publish the artifacts:

```
https://central.sonatype.com/publishing/deployments
```

Update the Maven artifact version in [README.md](README.md#maven).
