public class Counter {
    public static void main(String[] args) throws Exception {
        
    }

    static void counter(int firstVal, int finalVal) throws InvalidParamsException 
    {    
        boolean isException = firstVal > finalVal ? true : false; 
        
        if(isException) 
            throw new InvalidParamsException();
        
        int diference = finalVal - firstVal; 

        for(int i = 0 ; i <= diference ; i++) {
            System.out.println("Printing number " + i);
        }
    }
}
