# HyperionDevTHT
## Section A: Code Review
* This section folder contains a Notepad document that simulates a typical interaction that I might have with a student. 
* I chose Option 1: Python Task
* I answered the question and review the student's program looking at correctness, efficiency, style and documentation.
* The folder also contains a recommended solution file anagram.py

## Section B: Projects
* This folder contains a Notepad document with a GitHub URL to a project I am most proud of.

## Section C: Code Challenge
* This section folder contains two sub-folders: one has the Number to Word java program and the other has the documentation to the program.
* To build, test, and run this code on a Linux, macOS, or Windows operating system:<br>
> Save the code as two separate files: "NumberNames.java" and "NumberToWord.java" in a directory of your choice.<br>
> Open a terminal or command prompt and navigate to the directory where you saved the files.<br>
> Build the code using the following command:<br>
>> On Linux or macOS: javac NumberNames.java NumberToWord.java<br>
>> On Windows: javac NumberNames.java NumberToWord.java<br>

* Test the code by creating a Main class that calls the convert method, for example:<br>
![image](https://user-images.githubusercontent.com/60501135/213001695-354652b7-d36e-41c3-be82-33745bfc070f.png)

* Compile the Main class,<br>
> On Linux or macOS: javac Main.java<br>
> On Windows: javac Main.java<br>

* Run the Main class,<br>
> On Linux or macOS: java Main<br>
> On Windows: java Main<br>

* The worst-case space complexity of the code is O(1).

The code uses several arrays such as specialNames, tensNames, and numNames to store special names, tens names, and digit names respectively. These arrays are all defined as static final and are not resized throughout the program execution. Therefore, the amount of space they take up is constant and does not depend on the input size.

Additionally, the code uses several simple variables such as prefix, current, and place for storing temporary values. These variables are also not resized and the amount of space they take up is also constant.

Lastly, the code creates an instance of the NumberNames class, but the amount of space it takes up is also constant and does not depend on the input size.

## Section D: Loom Video Submission
* This section folder contains a Notepad document with the the link to my loom recording
