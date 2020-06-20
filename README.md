# Anagram
Two Strings are said to be Anagram if they have same length(base condition) and they have same order.
Examples of Anagram are {Listen , Silent} , {Angle , Angel}, {A gentleman , Elegant Man}.
A Naive approach to solve this problem will be compare each and every charachter and keep track of the character count.
If the each character count in both the String are same and the base condition being the length of both the String being same then we can say the String are Anagram. 
Could use HashMap, containskeys, count, charAt to check the statement 5.
Another approach that I have used is convert the String to char array and then sort it and check if both the String are equal. Keeping in mind the base condition which is to check the length of both String should be same otherwise Return Anagram False.
I have solved this problem with the help of Collection ArraysSort in java.
You could try to minimise the cost heads with the help of MutliSet.
I hope you like this appraoch. Simple and reasonable.
