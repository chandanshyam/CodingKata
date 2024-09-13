# Java JUnit5

A minimal setup with Java, [JUnit5](https://junit.org/junit5/), [AssertJ](https://assertj.github.io/doc/) and [Mockito](https://site.mockito.org/) to get you started.

You can use [gradle](https://gradle.org/) or [maven](https://maven.apache.org/)

[More complicated JUnit5 setups](https://github.com/junit-team/junit5-samples)

## Setup

    git clone https://github.com/swkBerlin/kata-bootstraps
    cd java/junit5

Open as preexisting project in your favorite IDE and choose between gradle or maven nature

## (optional) IDE Setup

Run `./gradlew idea` to build [idea](https://www.jetbrains.com/idea) project.

## Running Tests

To execute the tests either run `./gradlew test`, `mvn test` or run the tests from the IDE you are using

## Test Libraries Available from the Get-Go
- [JUnit 5.8.2](https://junit.org/junit5/docs/snapshot/release-notes/#release-notes-5.8.2)
- [AssertJ 3.22.0](https://assertj.github.io/doc/#assertj-core-release-notes)
- [Mockito 4.3.1](https://github.com/mockito/mockito/releases)


## Additional Libraries
- [Vavr](https://www.vavr.io/) a functional library for Java.


## Bowling Kata Rules

You divide 20 rolls into frams of 2 each 

* You have 21 total rolls available for you considering special cases.
* for a normal Frame you just add 2 rolls Scores and increment to the next Frame.
* if you score a Spare you add a roll from the next frame to the Score.
* If you Score a Strike you add the next frame as part of the score for the Current frame 
* If you get a perfect game your game totals to 300.





This repo was tested with [idea](https://www.jetbrains.com/idea) [2020.3.1](https://confluence.jetbrains.com/display/IDEADEV/IntelliJ+IDEA+2020.3.1+%28203.6682.168+build%29+Release+Notes), if you encounter problems please open an issue or send a pull request.

Have fun!
