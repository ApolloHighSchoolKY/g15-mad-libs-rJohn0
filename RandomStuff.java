 
//Import line for using new Random
import java.util.Random;

public class RandomStuff {

    public static void main (String[] args)
    {
    	//Math.random version
    	int x = (int)(Math.random()*50 + 1);

    	System.out.println(x);

    	//new Random version
    	Random rand = new Random();
    	int y = rand.nextInt(50) + 1;

    	System.out.println(y);

		
		
		System.out.println((int)(Math.random()*12 - 3));

		System.out.println((int)(Math.random()*15 + 13));
		System.out.println(rand.nextInt(15) + 13);
    }


}