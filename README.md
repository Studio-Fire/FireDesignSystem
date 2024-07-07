# FireDesignSystem
This is an Android design system for solo developers.


## Features
### Current
1. Color : Material3 based color 
2. Typography
3. Dimension

### TBD
* Planning to develop compose-based components


## Screenshots
|Color|Typography|Dimension-Spacing|Dimension-Padding|Dimension-Radius|
|:---:|:---:|:---:|:---:|:---:|
|![color](https://github.com/Studio-Fire/FireDesignSystem/blob/main/preview/preview_color.png?raw=true)|![typo](https://github.com/Studio-Fire/FireDesignSystem/blob/main/preview/preview_typo.png?raw=true)|![dimen_spacing](https://github.com/Studio-Fire/FireDesignSystem/blob/main/preview/preview_dimen_spacing.png?raw=true)|![dimen_padding](https://github.com/Studio-Fire/FireDesignSystem/blob/main/preview/preview_dimen_padding.png?raw=true)|![dimen_radius](https://github.com/Studio-Fire/FireDesignSystem/blob/main/preview/preview_diemen_radius.png?raw=true)|

## Installation
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
