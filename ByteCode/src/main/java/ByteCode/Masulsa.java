package ByteCode;

import java.io.File;
import java.io.IOException;
import static net.bytebuddy.matcher.ElementMatchers.named;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;


public class Masulsa {

	public static void main(String[] args) throws IOException {
		
		
		
 new ByteBuddy().redefine(Moja.class)
		  .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
		  .make().saveIn(new
		  File("C:\\SW\\workspaces\\SpringBootStudy\\ByteCode\\bin\\main\\")) ;
		 
		 
		//Moja moja = new Moja();
		  
		
		  System.out.println("dongom");
		  System.out.println(new Moja().pullOut());
		  System.out.println("dongom");
		 
	}

}
