#include <bits/stdc++.h>
//Increasing subsequence of length three with maximum product
using namespace std;
//function to find Largest small element on left
//search left part i.e 0 to index
int FindLSL(int array[], int index, int n)
{
    int maxValue = -1, maxIndex = -1;
    for (int i = 0; i < index; i++)
    {
        if ((array[i] < array[index]) && (array[i] > maxValue))
        {
            maxValue = array[i];
            maxIndex =i;
        }
    }
    
    return maxIndex;
}
//function to find Largest greater element on right
//search right part i.e index to last
int FindLGR(int array[], int index, int n)
{
    int maxValue = -1, maxIndex = -1;
    for (int i = index+1; i < n; i++)
    {
        if ((array[i] > array[index]) && (array[i] > maxValue))
        {
            maxValue = array[i];
            maxIndex =i;
        }
    }
    
    return maxIndex;
}
//function to find Increasing Sub-sequence of which would yield maximum product
//store it in sequence array
void FindSequence(int array[], int sequence[3], int n)
	    {
	        int maxProduct = 0;
	        for (int i = 0; i < n ; i++)
	        {
	             
	            int leftLargestIndex = FindLSL(array, i,n);
	            int leftLargestValue = leftLargestIndex == -1 ? 0:array[leftLargestIndex];
	            
	             
	            int rightLargestIndex = FindLGR(array, i,n);
	            int rightLargestValue = rightLargestIndex == -1 ? 0:array[rightLargestIndex];
	            
	            if (leftLargestValue*array[i]*rightLargestValue > maxProduct)
	            {
	                maxProduct = array[leftLargestIndex]*array[i]*array[rightLargestIndex];
	                sequence[0] = leftLargestValue;
	                sequence[1] = array[i];
	                sequence[2] = rightLargestValue;
	            }
	        }
	    }
int main()
{ 
    int testArray[] = {11, 12, 13, 6, 7, 8, 14,15};
    int N = sizeof(testArray)/sizeof(int);
    int sequence[3]; 
    FindSequence(testArray,sequence, N);
    
    cout<<"Increasing Sub-sequence of which would yield maximum product is: "<<endl;
    for (int i = 0; i < 3; i++)
    {
        cout<<sequence[i]<<", " ;
    }
	return 0;
}