package SelfPractice;
import java.util.Arrays;

class Solution {
int print2largest(int arr[], int n) {
// first sort the array so that the largest element is at the end
Arrays.sort(arr);
// set a variable to store the second largest element
int secondLargest = -1;
// loop through the array in reverse order
for(int i = n-1; i >= 0; i--) {
// if the current element is not equal to the second largest element and is not equal to the largest element
if(arr[i] != secondLargest && arr[i] != arr[n-1]) {
// set the second largest element to the current element
secondLargest = arr[i];
// break out of the loop
break;
}
}
// return the second largest element
return secondLargest;
}
}

// test the solution
public class FindSecondElementInArray {
public static void main(String[] args) {
Solution solution = new Solution();
int[] arr = {12, 35, 1, 10, 34, 1};
int n = 6;
int result = solution.print2largest(arr, n);
System.out.println(result); // should print 34
}
}




