
TASK1
public class PriorityQueueUsingArray   
{   
    // create an array
  int arr[];
  int size;
  int index=0;
  
    // constructor
    PriorityQueueUsingArray(int size)
    {
        this.size=size; 
        arr=new int[size];
    }
    
    public void insert(int data) {    	 
    	// insert data in array in any order
    	// handle all possible exceptions/errors

         
                if(index==size)
                {
                    System.out.println("Sorry Array is full!");

                }
                else
                {
                arr[index] = data;
                index++;
                }
        
    }
        public void display()
        {
            for(int i=0; i<size; i++)
            {
                System.out.println("values are:"+ arr[i]);
                System.out.println();
            }
        
        }
    
    public int extractMax() 
    {   	 
    	// return and remove max value from array
    	// handle all possible exceptions/errors
        if(size==0)
        {
            System.out.println("Sorry array is empty!");
        }
        else 
        {
            for(int i=0; i<size; i++)
            {
                for(int j=i+1; j<size; j++)
                {
                if(arr[i]>arr[j])
                  {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                  }
                }
            }
        }
        int removedElement=arr[size-1];
            --size;
              
        
         return removedElement; 
    }
    
    public int getMax() 
    {      	 
    	// just return max value from array
    	// handle all possible exceptions/errors
        return arr[size-1];
    }
    
    public boolean searchData(int data) {      	 
    	// search data from array
    	// handle all possible exceptions/errors
    for(int i=0; i<size; i++)
    {
        if(data==arr[i])
        {
            return 1;
        
        }
        else
        {
            retrun 0;
        }
    }
        
    }
    
    public static void main(String[] args)   
    {   
        // Test the main method by creating object for PriorityQueueUsingArray class
    	
        PriorityQueueUsingArray obj1=new PriorityQueueUsingArray(3);
        
    	// insert some values using insert method
    	obj1.insert(4);
        obj1.insert(2);
        obj1.insert(6);
    	obj1.display();
    	// call extractMax method and print output
    	int removedElement=obj1.extractMax();
    	System.out.print("Removed Element is:"+removedElement);
    	int max=obj1.getMax();
    	System.out.print("Max value is:"+max);
    	boolean searchData1=obj1.searchData(4);
  System.out.println("The are present:"+searchData1);
    	// call extractMax method and print output
    	
    	
    	// insert some values using insert method
    	
    	
    	// call getMax method and print output
    	
    	
    	// call extractMax method and print output
    	
    	
    }   
}   

