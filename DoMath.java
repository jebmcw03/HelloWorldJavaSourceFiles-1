package cs3354_hello_world;

public class DoMath {
    protected int x;
    
    public int increment(int number) 
    {
        x = number; 
        return number++;
    }
      
    public int decrement(int number) 
    {
        x = number--;
        return number--;
    }
      

}
