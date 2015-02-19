#MATRIX COMPUTER

## Author : Shiza Tariq

This program reads a file to take matrices, the matrices are read such as, in a row each element is seperated by a space and every blank line seperates a matrix.
The user enters the number of matrices to be read from the file accordingly the number of matrices are read, firstly trim sperates all extra characters then it splits on basis of blank space,
and adds each row respectively.

Once the matrices are read, different functions are present to represent each of the basic matrix operation addition, subtraction and multiplication.

The main class is ReadFile and it contains different functions: 

##--Addition--
public static int[][] add(List<ArrayList<ArrayList<Integer>>> lst)
This function takes a list as an argument(  the list that is returned by read which has the specified number of matrices in list) and returns the resultant matrix.
Assumptions : This function works by taking the first matrix in list and so forthand not any matrix in between the list.
Firstly the first matrix is taken and saved in a temporary matrix, then the other matrices in the list are added by adding elements correspondingly given that they are of the same size.

##--subtraction--
public static int[][] subtract(List<ArrayList<ArrayList<Integer>>> lst)
This function takes a list as an argument(  the list that is returned by read which has the specified number of matrices in list) and returns the resultant matrix.
Firstly the first matrix is taken and saved in a temporary matrix, then the other matrices in the list are subtratced by subtracting elements correspondingly given that they are of the same size.

##--Multiplication--
public static int[][] multiply(List<ArrayList<ArrayList<Integer>>> lst)
This function takes a list as an argument(  the list that is returned by read which has the specified number of matrices in list) and returns the resultant matrix.
Firstly two matrices are taken from the list and saved in two temporary matrices, matrix A and matrix B. Then it is checked if column of first matrix and row of second are equal then multiplication is 
performed.
Then multiplication is performed using three nested for loops. 

