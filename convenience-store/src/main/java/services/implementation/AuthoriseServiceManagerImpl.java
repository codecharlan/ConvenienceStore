package services.implementation;

import com.codecharlan.conveniencestore.models.Manager;
import services.AuthoriseService;

public class AuthoriseServiceManagerImpl implements AuthoriseService {
    static Manager manager = new Manager("Fred", "A3452671", "09/11/2024", 568676.66);
    @Override
    public String signIn(String password) {
        if(managerPassword != password){
            return "Access Denied! Sign in Unsuccessful";
        }else {
//            System.out.println( "Welcome " + this.getEmployeeName()
//                   + "!" + "\n" + "Signed in Successfully");
            return "Welcome " + manager.getEmployeeName()
                    + "!" + "\n" + "Signed in Successfully";
        }
//
    }

    @Override
    public String signOut() {
//
//            System.out.println("GoodBye " + this.getEmployeeName()
//                    + "!" + "\n"+ "Signed out Successfully");
        return "GoodBye " + manager.getEmployeeName()
                + "!" + "\n"+ "Signed out Successfully";
    }
}
