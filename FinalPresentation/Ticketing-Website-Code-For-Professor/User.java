package com.scticketing.ticketingwebsite.user;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private long userID;

    @Column(name = "first_name", nullable = false, length = 25)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(nullable = false, unique = true, length = 25)
    private String username;

    private long ticketId;



    //public Ticket tickets[];


    // Constructor with ID in case the database doesn't generate an ID or testing is needed.
    // Put this in constructor: //Ticket[] tickets)
    public User(long userID, String firstName, String lastName, String password, String email, String username) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        //this.tickets = tickets;
        this.username = username;
    }

    // Constructor without ID as database will probably generate an ID.
    // Add tickets[] to constructor.
    public User(String firstName, String lastName, String password, String email, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        //this.tickets = tickets;
        this.username = username;
    }

    public User(String firstName, String lastName, String password, String email, String username, long ticketId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        //this.tickets = tickets;
        this.ticketId = ticketId;
        this.username = username;
    }

    public User() {

    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }*/


    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                //tickets=" + Arrays.toString(tickets) +
                '}';
    }



}
