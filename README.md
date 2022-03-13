# terminal-playground

📚 Learning and exploring features of the terminal (i.e. iTerm2).

## Description

Different from the shell (like Bash or Z shell), the terminal is the software that houses the shell. The terminals we
know today are technically *terminal emulators* because they emulate old-school hardware terminals using graphical
windowing software.

Some neat features of terminals are their ability to stylize text with colors, font weights and more. They take
instructions from the output stream (in-band communication?) of the the program they are running. These instructions
take the form of [ASCII control characters](https://en.wikipedia.org/wiki/ASCII#Control_characters) and
[ANSI escape sequences](https://en.wikipedia.org/wiki/ANSI_escape_code). 

## Instructions

In this project, there are some simple Java programs that exercise the terminal. Any programming language can be used.
Bash scripts often make use of the escape sequences to stylize text in the terminal but there are so many layers of string
processing that can happen in a Bash command that it doesn't make for the most effective example for learning.

Follow these instructions to run the Java programs.

1. Use Java 17
2. Compile and run a program that produces a bell sound:
   * `java BellSound.java`
   * Note: Java's support for single-file source-code programs came in Java 11 with <https://openjdk.java.net/jeps/330>
3. Compile and run a program that produces stylized text output:
   * `java StylizedText.java`
4. Try the other programs:
   * `java CursorControl.java`

## Reference

* [Wikipedia: "SGR (Select Graphic Rendition) parameters"](https://en.wikipedia.org/wiki/ANSI_escape_code#SGR_(Select_Graphic_Rendition)_parameters)
* [Wikipedia: "ANSI escape code" sub-section "CSI (Control Sequence Introducer) sequences"](https://en.wikipedia.org/wiki/ANSI_escape_code#CSI_(Control_Sequence_Introducer)_sequences)
