# SortLab.java
A collection of sorting algorithms implemented in Java with JUnit tests highlighting their strengths and weaknesses

## Building
The goal of this project is to provide clearly documented base implementations while requiring as few external resources as possible (this includes build tools, or 3rd party libraries).  To achieve this you will still need to download [JUnit 5](https://github.com/junit-team/junit5) (specifically `junit-jupiter-api`, `junit-jupiter-engine` and `junit-platform-console-standalone`) and [@API Guardian](https://github.com/apiguardian-team/apiguardian).  This project includes the 5.0.0 release of JUnit and the 1.0.0 release of @API Guardian libraries in the `/lib` directory.  From the root you should be able to generate a full compile of the entire codebase with this command:

### On OSX (or other Unix like environments)
Build the source files:

    mkdir -p build
    find . -name "*.java" > sources.txt
    javac -classpath lib/junit-jupiter-api-5.0.0.jar:lib/apiguardian-api-1.0.0.jar -d build @sources.txt

Package the output:

    mkdir -p package
    jar cf package/SortLab.jar -C build .

Run the JUnit tests:

    java -jar lib/junit-platform-console-standalone-1.0.0.jar -classpath lib/junit-jupiter-api-5.0.0.jar:lib/apiguardian-api-1.0.0.jar:lib/junit-jupiter-engine-5.0.0.jar:package/SortLab.jar --scan-class-path

### On Windows
Build the source files:

    MKDIR build > nul 2> nul
    DIR /S /B *.java > sources.txt
    javac -classpath lib\junit-jupiter-api-5.0.0.jar;lib\apiguardian-api-1.0.0.jar -d build @sources.txt

Package the output:

    MKDIR package > nul 2> nul
    jar cf package\SortLab.jar -C build .

Run the JUnit tests:

    java -jar lib\junit-platform-console-standalone-1.0.0.jar -classpath lib\junit-jupiter-api-5.0.0.jar;lib\apiguardian-api-1.0.0.jar;lib\junit-jupiter-engine-5.0.0.jar;package\SortLab.jar --scan-class-path
