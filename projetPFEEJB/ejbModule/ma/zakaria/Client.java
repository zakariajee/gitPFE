package ma.zakaria;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Client
 */
@Stateless
@LocalBean
public class Client {

    /**
     * Default constructor. 
     */
    public Client() {
        // TODO Auto-generated constructor stub
    }
    
    public void tester(){
    	System.out.println("okiiii");
    }

}
