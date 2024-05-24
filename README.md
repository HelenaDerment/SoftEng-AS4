# SoftEng-AS4

//File Information//
- Main.java is the console base application

- PostTestCases.java is the test data for both addPost() and addComment() fucntions

- Post.java is the Java implementation of the addPost() and addComment() functions

//Running the test data 

First complie the Main and Post code, Copy the following command into the termainal:
javac Post.java Main.java

To run the test code, Copy the following command into the terminal:
javac -cp .:junit-platform-console-standalone-1.7.0.jar Post.java PostTestCases.java
