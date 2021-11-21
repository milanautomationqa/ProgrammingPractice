public class PatternLearning {
    
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
    public static void main(String args[]) {
      
        pattern1(5);
        pattern2(5);
      
    }
}