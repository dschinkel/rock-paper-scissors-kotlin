# Rock Paper Scissors Kata

This kata was paired on by Dave Schinkel and Turk

The game of Rock-Paper-Scissors is simple: Rock beats Scissors, Scissors beats Paper, Paper beats Rock.

Your task is to create the core logic that checks which gesture wins in a matchup.   or example:

| Gesture 1 | Gesture 2 | Result              |
| --------- | --------- | ------------------- |
| rock      | scissors  | rock beats scissors |
| paper     | rock      | paper beats rock    |
| scissors  | paper     | scissors cuts paper |
| rock      | rock      | tie                 |
... and so on. Good luck!


### IntelliJ
To open an existing Kotlin or Java Project in IntelliJ:
- Choose *import project*
- choose the _gradle.build_ file and open that
- in preferences for **gradle | Runner** check the box _"Delegate IDE build/run to gradle"_ or else your tests won't compile

Running the build manually, there are a couple ways:

**command-line**

- `./gradlew clean build`
- `gradle build`

IntelliJ
- Double click the "build" task in the gradle pane (this pane lives on the right of your IDE)