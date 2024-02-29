
package atm_sang;

import controller.Application;
import view.ConsoleUI;

public class ATM_Sang {

    public static void main(String[] args) {
        ConsoleUI cui = new ConsoleUI();
        // create object View and pass to Application
        Application application = new Application(cui);    
        // call function to run program
        application.run();
    }
    
}
