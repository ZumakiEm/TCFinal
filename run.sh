#!/usr/bin/env bash

javac -sourcepath src/App src/App/App.java
java -cp lib/antlr-4.9.1-complete.jar:src/App App
rm src/App/*.class
rm src/App/SimbolTable/*.class