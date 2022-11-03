package com.scticketing.ticketingwebsite.user;
import com.scticketing.ticketingwebsite.ticket.Ticket;
import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;

    @Column(name = "first_name", nullable = false, length = 25)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(nullable = false, unique = true, length = 45)
    private String email;


    //public Ticket tickets[];


    // Constructor with ID in case the database doesn't generate an ID or testing is needed.
    public User(long userID, String firstName, String lastName, String password, String email, Ticket[] tickets) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        //this.tickets = tickets;
    }

    // Constructor without ID as database will probably generate an ID.
    public User(String firstName, String lastName, String password, String email, Ticket[] tickets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        //this.tickets = tickets;
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
                //tickets=" + Arrays.toString(tickets) +
                '}';
    }



}
