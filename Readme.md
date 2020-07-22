This repo is repro for Gradle swagger plugin [issue](https://github.com/gigaSproule/swagger-gradle-plugin/issues/188)


0. To build project with jdk 8 execute

    `docker run -w /app -v $(pwd):/app gradle:jdk8` 

0. To build with jdk 11 execute:

    `docker run -w /app -v $(pwd):/app gradle:jdk11`

0. To build with jdk 14 execute:

    `docker run -w /app -v $(pwd):/app gradle:jdk14`


All builds except for _jdk 14_ should failed because of compile class version error. Builds for jdk 13 also works.
