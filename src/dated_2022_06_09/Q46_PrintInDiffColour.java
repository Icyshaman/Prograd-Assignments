package dated_2022_06_09;

class PrintBlue implements Runnable{
	private static final String RESET = "\033[0m";  
    private static final String BLUE = "\033[0;34m";

	@Override
	public void run() {
		System.out.println(BLUE + "Hello" + RESET);
		
	}
	
}

class PrintYellow implements Runnable{
	private static final String RESET = "\033[0m";  
	private static final String YELLOW = "\033[0;33m";
	
	@Override
	public void run() {
		System.out.println(YELLOW + "Hello" + RESET);
		
	}
	
}
class PrintGreen implements Runnable{
	
	private static final String RESET = "\033[0m";  
    private static final String GREEN = "\033[0;32m";
    
	@Override
	public void run() {
		System.out.println(GREEN + "Hello" + RESET);
		
	}
	
}

public class Q46_PrintInDiffColour {
  
    public static void main(String[] args)
    {
    	Thread t1 = new Thread(new PrintBlue());
    	Thread t2 = new Thread(new PrintYellow());
    	Thread t3 = new Thread(new PrintGreen());
    	t1.start();
    	t2.start();
    	t3.start();
    }

}
