# Letters-Index

Program to index each letter in text, and map to the words in which it occurs. 
So, for example, when we have text ``1 ala ma 2 koty w 10m2``, program return elements, like:

```
a: ala, ma
k: koty
l: ala
m: m, ma
o: koty
t: koty
w: w
y: koty
```

The program is not case-sensitive. Words repeated in the input text should be only once in the indexed output. Output words are sorted alphabetically.

###Implementation
To make an implementation of this problem, I used two Java source files and one test file:
- source
    - Main.java 
        - class with main method to run program. Inside this class you can find read text from user console and nice formatter to print data from Tree Map.
    - Algorithm.java
        - This class include implementation of algorithm. Unnecessary characters are removed from the text and and a words from this text are added to the collection if it contains a character of that word.
- test
    - AlgorithmTest.java
        - Implemented 6 tests to check the correct operation of the algorithm.
        
### How to use it?
1. You can download this code or clone from this repository. 
2. Use your IDE to build project or use ``mvn clean install`` command to build this project.
3. If you use IDE, now you can run this project. If you use console, you can run Main class built by Maven (in target -> classes folder).
4. In console you will see information about the project and command prompt to input your text.
5. When you confirm the entered text (Enter key), you will see result of mapping.
6. To use once again this program, you should run it again.