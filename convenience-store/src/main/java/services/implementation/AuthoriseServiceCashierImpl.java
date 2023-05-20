package services.implementation;

import com.codecharlan.conveniencestore.models.Cashier;
import services.AuthoriseService;

public class AuthoriseServiceCashierImpl implements AuthoriseService {

    Cashier cashier = new Cashier("Tom", "A3452672", "03/06/2020", 200890.83);
    @Override
    public String signIn(String password) {
        if(cashierPassword != password){
            return "Access Denied!, Sign in Unsuccessful";
        }else {
//            System.out.println( "Welcome " + this.getEmployeeName()
//                    + "!" + "\n" + "Signed in Successfully");
        return "Welcome " + cashier.getEmployeeName()
                + "!" + "\n" + "Signed in Successfully";}
    }

    @Override
    public String signOut() {
//            System.out.println("GoodBye " + this.getEmployeeName()
//                    + "!" + "\n"+ "Signed out Successfully");
        return "GoodBye " + cashier.getEmployeeName()
                + "!" + "\n"+ "Signed out Successfully";
    }
}
