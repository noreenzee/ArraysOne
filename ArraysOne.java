
package arraysone;


public class ArraysOne
{

    
    public static void main(String[] args)
    {
        int[] values;
        String vs;
        int v, n, answer;
        i = 0;
        
        values = new int [10];
        do
        {
                
                
        
            vs = JOptionPane.showInputDialog("Enter a whole Number");
            values[0] = Integer.parseInt(vs);
            answer = JOptionPane.showConfirmDialog(null, "Do you want to enter another?");
        } while (answer == JOptionPane.YES_OPTION && i < 4);
        for(n = 0; n < 4; n++)
        {
            System.out.println(values[n]);
            
        }
        
       
            
        
    }
    
}
