public class User {
    private int userID;
    private String userName;
    private String passwordHash;
    private String passwordSalt;
    private String email;
    private int CardInfo;
    //private Ticket tickets[];

    public User(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        if (verifyPassword(password)) {
            System.out.println("The cake is a lie.");
        } else {
            System.out.println("Wrong password.");
        }
    }

    private static boolean verifyPassword (String password){
        // TODO: Write password verification function.
        return false;
    }

    private static void passwordHashing(String password){
        // TODO: Write a password hashing function.
    }

    public static String searchForEvent(){
        // TODO: User input.
        return "This is a search";
    }

    public static void purchaseTicket(){
        // TODO: Write function to purchase a ticket (using fake information);
    }

    public String toString(){
        return "User\t"+userName +"\nEmail\t"+ email +"\nPassword\t"+ passwordHash;
    }
}
