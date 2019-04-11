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


This kata was paired on by Dave Schinkel and Turk

### IntelliJ
**To open this kata with IntelliJ:**

- Choose *import project*
- choose the _gradle.build_ file and open that
- in preferences for **gradle | Runner** check the box _"Delegate IDE build/run to gradle"_ or else your tests won't compile

### Building

**command-line**
[Gradle Command-line](https://docs.gradle.org/current/userguide/command_line_interface.html)
- `./gradlew clean build`
- `gradle build`

**Two Ways to Create a Kotlin Gradle Project**

- by running gradle init
- by creating a Gradle Project of type Kotlin through the IntelliJ Create Project Dialog

### Command-line history
Lists the commands we made while performing the kata.

Why?  Because It _might_ be helpful / interesting to look back at the commands we entered while we did this kata.

Dave uses [oh-my-zsh](https://github.com/robbyrussell/oh-my-zsh/wiki/Cheatsheet) so you are seeing the following aliases below:

```
ga . -> git add all
gcmsg -> git commit -m ""
gp -> git push
gl -> git pull
gst -> git status
gb -> git branch
gd -> git diff

```

```
mkdir katas |cd katas
gcl https://github.com/dschinkel/rock-paper-scisors-kotlin.git
git init
git remote add origin https://github.com/dschinkel/rock-paper-scisors-kotlin.git
git remote -vv
ga .
gcmsg "Results in tie for rock rock"
gp
gl --set-upstream origin master
gl
gb --set-upstream-to=origin/master
gp
gl
gl origin master --allow-unrelated-histories
gst
ga .
gcmsg "Add gitignore"
ga .
gcmsg "adding rock vs scissors"
gst
gl
ga .
gcmsg "Paper beats rock"
gp
ga .
git diff
gst
ga .
gcmsg "Scissors beat paper"
gp
ga .
gcmsg "Add credits"
```
