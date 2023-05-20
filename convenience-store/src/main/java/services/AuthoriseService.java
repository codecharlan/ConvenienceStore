package services;

    public interface AuthoriseService {
        String cashierPassword = "B2345671";
        String managerPassword = "A3456782";


        String signIn(String password);

        String signOut();

}
