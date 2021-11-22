//approach to solve any pattern related programming question
/*Following should be the approach:
        1. No. of Lines = No. of Rows = No. of times outer forloop will run
        2. Identify for every row number - How many columns are present and type of elements in the column
        3. What do you need to print
        
        E.g. *
             * * 
             * * *
             * * * *
             
        In the above pattern, we need to find out 1, 2, 3
        1. No. of Row = 4, so number of times outer for loop with run = 4
        2. For row 1 we have 1 column, for row 2 we have 2 columns ... so on
        3. We need to print "*"
         
*/
public class PatternLearning {
    
    /*Patter 1: 
    
        Print the following pattern
    
        * * * *
        * * *
        * * 
        *
    */
    static void pattern1(int val){
        
        for(int row=1; row<=val; row++)
        {
            for (int col=1; col<=val-row+1; col++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
    /*Patter 2: 
    
        Print the following pattern
    
        *
        * * 
        * * *
        * * * *
    */
    
    static void pattern2(int val){
        
        for(int row=1; row<=val; row++)
        {
            for (int col=1; col<=row; col++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
    /*Patter 3: 
    
        Print the following pattern
    
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
    */
    
    static void pattern3(int val){
        
        for(int row=1; row<=val; row++)
        {
            for (int col=1; col<=val; col++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
      
        //Draw the pattern by passing the row count to the function:
        pattern1(4);
        pattern2(4);
        System.out.println("=======================================");
        pattern3(5);
      
    }
}