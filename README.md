# Java-two-dimensional-array

A program that performs the following operations:

1. Declare a two-dimensional array intended to store the results of a chess tournament. Assume that
7 players are participating in the tournament and they played 5 games. Assign the following initial values to all elements of the array
when declaring the array:
0.5 0.5 0.5 0.5 0.5
0 1 0 1 1
0.5 1 0.5 0.5 0
0 0.5 0 0.5 0
1 1 1 1 1
0 0 0 0.5 0.5
0 0.5 0 0 1
   
2. Ask the user how they want to populate the array: enter values from the keyboard (the user entered 1), with
random numbers (the user entered 2), or use the initial values specified when the array was declared
(the user entered 3). If the user entered 2, then populate the array randomly with
the values 0, 1, or 0.5 (0 = loss, 1 = win, 0.5 = tie)

3. Display the array elements on the screen in tabular form, separated by a single space (with one digit after the decimal point)
  
4. Display on the screen the numbers and the number (count) of athletes who have not lost a single match. Assume that
the athletes are numbered starting from 1. Before displaying the results, output the message “result:”. Output the athletes’
numbers after the message “numbers: ”, and the number of athletes after the message “count: ”

Note:
The program outputs information in the following format:


• First, you must enter a number (1, 2, or 3), which determines how the array is filled (if the user
entered 1, then also enter the array elements)

• Second, the elements of the array must be output (in table form)

• Third, the results obtained during array processing must be output
For example, if the user entered the number 3, the program must output the information as follows (the array’s
elements must be output with one decimal place):

mode (1, 2, or 3): 3

0.5 0.5 0.5 0.5 0.5
0.0 1.0 0.0 1.0 1.0
0.5 1.0 0.5 0.5 0.0
0.0 0.5 0.0 0.5 0.0
1.0 1.0 1.0 1.0 1.0
0.0 0.0 0.0 0.5 0.5
0.0 0.5 0.0 0.0 1.0

result:

numbers: 1 5

count: 2

Note:
- Input errors are not handled
