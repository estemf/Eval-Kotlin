API choisie :

"The Rick and Morty API"

Fonctionnalité implémenter :

J'ai implémenté toute la partie graphique de l'API, les Card, leur contenu et l'entête, mais je n'ai pas eu le temps d'aller au-delà

Choix techniques :

j'ai choisi utiliser des données mockées

Architecture du projet :

Directory structure:
└── estemf-Eval-Kotlin.git
    ├── gradle.properties
    ├── gradlew.bat
    ├── gradle
    │   ├── libs.versions.toml
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── settings.gradle.kts
    ├── gradlew
    ├── build.gradle.kts
    └── app
        ├── .gitignore
        ├── proguard-rules.pro
        ├── build.gradle.kts
        └── src
            ├── main
            │   ├── AndroidManifest.xml
            │   ├── java
            │   │   └── com
            │   │       └── example
            │   │           └── eval_kotlin
            │   │               ├── domain
            │   │               │   └── models
            │   │               │       └── Characters.kt
            │   │               ├── ui
            │   │               │   ├── composables
            │   │               │   │   └── Card.kt
            │   │               │   ├── screens
            │   │               │   │   └── RickAndMortyScreens.kt
            │   │               │   └── theme
            │   │               │       ├── Theme.kt
            │   │               │       ├── Type.kt
            │   │               │       └── Color.kt
            │   │               └── MainActivity.kt
            │   └── res
            │       ├── xml
            │       │   ├── backup_rules.xml
            │       │   └── data_extraction_rules.xml
            │       ├── mipmap-mdpi
            │       │   ├── ic_launcher.webp
            │       │   └── ic_launcher_round.webp
            │       ├── values-en
            │       │   └── strings.xml
            │       ├── mipmap-xxxhdpi
            │       │   ├── ic_launcher.webp
            │       │   └── ic_launcher_round.webp
            │       ├── mipmap-hdpi
            │       │   ├── ic_launcher.webp
            │       │   └── ic_launcher_round.webp
            │       ├── mipmap-xxhdpi
            │       │   ├── ic_launcher.webp
            │       │   └── ic_launcher_round.webp
            │       ├── drawable
            │       │   ├── ic_launcher_background.xml
            │       │   └── ic_launcher_foreground.xml
            │       ├── mipmap-xhdpi
            │       │   ├── ic_launcher.webp
            │       │   └── ic_launcher_round.webp
            │       ├── mipmap-anydpi
            │       │   ├── ic_launcher.xml
            │       │   └── ic_launcher_round.xml
            │       └── values
            │           ├── strings.xml
            │           ├── themes.xml
            │           └── colors.xml
            ├── test
            │   └── java
            │       └── com
            │           └── example
            │               └── eval_kotlin
            │                   └── ExampleUnitTest.kt
            └── androidTest
                └── java
                    └── com
                        └── example
                            └── eval_kotlin
                                └── ExampleInstrumentedTest.kt
