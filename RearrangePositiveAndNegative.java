//Rearrange positive and negative numbers with constant extra space
/*

Loop from i = 1 to n - 1.
  a) If the current element is positive, do nothing.
  b) If the current element arr[i] is negative, we 
     insert it into sequence arr[0..i-1] such that 
     all positive elements in arr[0..i-1] are shifted 
     one position to their right and arr[i] is inserted
     at index of first positive element.

*/

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
 
// Function to Rearrange positive and negative
// numbers in a array
void RearrangePosNeg(int arr[], int n)
{
    int key, j;
    for(int i = 1; i < n; i++)
    {
        key = arr[i];
 
        // if current element is positive
        // do nothing
        if (key > 0)
            continue;
 
        /* if current element is negative,
        shift positive elements of arr[0..i-1],
        to one position to their right */
        j = i - 1;
        while (j >= 0 && arr[j] > 0)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
 
        // Put negative element at its right position
        arr[j + 1] = key;
    }
}