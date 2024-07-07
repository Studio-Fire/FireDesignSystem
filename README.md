# Intallation
---
## Gradle

1. Add below code block in root build.gradle at the end of repositories
```
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
  }
}
```
2. Add the dependency
```
dependencies {
  implementation 'com.github.Studio-Fire:FireDesignSystem:{version}'
}
```
