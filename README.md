# Anagram
Two Strings are said to be Anagram if they have same length(base condition) and they have same order.
Examples of Anagram are {Listen , Silent} , {Angle , Angel}, {A gentleman , Elegant Man}.
A Naive approach to solve this problem will be compare each and every charachter and keep track of the character count.
If the each character count in both the String are same and the base condition being the length of both the String being same then we can say the String are Anagram. 
Could use HashMap, containskeys, count, charAt to check the statement for the above statement.
Another approach that I have used is convert the String to char array and then sort it and check if both the arrays are equal. Keeping in mind the base condition which is to check the length of both String should be same otherwise Return Anagram False.
I have solved this problem with the help of Collection ArraysSort in java.
You could try to minimise the cost head with the help of MutliSet.
I hope you like this appraoch. Simple and reasonable.

Another great approach to check whether String are anagram or not is to use the string method equalsIgnoreCase which will ignore the lower or upper case.
Meaning Angel and angel will be considered same and could use the string method equalsIgnoreCase to check if two String are anagram or not.

I hope you like this approach.


Third approah which will take less time complexity than the above is to check whether string are of equal length or not. Traverse the array and check that conunt for both string converted to char array is same. If so anagram otherwise not.
