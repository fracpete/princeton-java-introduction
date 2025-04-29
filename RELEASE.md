# RELEASE

Use the following command to make a new release:

```
mvn --batch-mode release:clean release:prepare release:perform
```

Push all changes

Go to the following URL and publish the artifacts:

```
https://central.sonatype.com/publishing/deployments
```
