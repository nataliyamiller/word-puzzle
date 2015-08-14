| *Word-Puzzle Java Project by Natliya Bareeva-Miller
| *Epicodus Java/Android Summer 2015
| *First Week Java BDD Code Review
| **

-- **DESCRIPTION** --

Word-Puzzle application takes user input and replaces all the vowels with the dash symbol "-" 
creating a word puzzle to solve. Because the resulting word puzzle appears on a new page, 
it makes it hard for another player to guess it. 
The program accepts any input (letters, numbers, special characters). 





-- **EXAMPLE** --

user inputs "Cat is here since 5 am", the program converts this input to a puzzle "C-t is h-r- s-nc- 5 -m". 
Enjoy! :-)






-- **SETUP INSTRUCTIONS** --

Clone this repository
Run with Gradle ("gradle run" command)
Open localhost:4567 in your browser

Note: To run JUnit and FluentLenium tests use "gradle test" command



-- **TECHNOLOGIES USED** --

Java version 8 update 45
Velocity version 1.7
Spark version 2.1
Bootstrap version 3.2.0
jUnit version 4.+
FluentLenium version 0.10.3


Copyright © 8/14/15 Nataliya Bareeva-Miller
Contact info: <hidden for privacy purposes>


-- I tried to check if user's input is a string (wanted to allow only string inputs), however, 
I was not able to find/implement a good solution. I found this method, but not sure how I can 
use it in my program. Help needed :-)

--Method:
try {
int inputNumber = Integer.parseInt(inputString);
} catch (NumberFormatException exc) {
// inputString was a String and not a valid Integer
}





