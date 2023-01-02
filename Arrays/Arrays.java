package Arrays;

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        // Reverse the string str
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }


    //MAx Min
    //Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.
    
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        Arrays.sort(A);
        return A[0]+A[N-1];
    }
}
}