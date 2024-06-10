// selection sort

class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
         int min = i ;
     
    
        for(int j =i+1 ; j< arr.length ; j++ )
        {
            if(arr[j] < arr[min ])
            {
               min = j ;
            }
        }
    
    return min;
	}

	
void selectionSort(int arr[], int n)
{
	    //code here
	    for(int i = 0 ; i < n ; i++)
	    {
    
          int min_index =  select(arr,i);
          int temp = arr[min_index];
          arr[min_index] = arr[i];
          arr[i] = temp;
    	}
	    
}
}
