## Use Cases

### Purchasing a Ticket - UC1

| **Use Case Section**                    | **Comment**                                                                     |
|-----------------------------------------|---------------------------------------------------------------------------------|
| **Use Case Name**                       | Purchasing A Ticket |
| **Scope**                               | Ticket Purchasing Website |
| **Level**                               | User-goal - the ability to purchase a ticket. |
| **Primary Actor**                       | A registered user wishing to purchase a ticket. |
| **Stakeholders and Interests**          | **Registered User**: Primary actor who has a user account wishes to purchase a ticket<br>**Payment Processor**: supporting actor who verifies card information. needs to know credit card number and amount to charge for each purchase<br>**Event Host**: Offstage actor responsible for organizing event. Should have a list of users who are attending |
| **Preconditions**                       | User must be logged-into a user account, supply valid credit card information, and click "purchase" on an event that has availble seats |
| **Success Guarantee**                   | The ticket is sold (see CO1). If an event has dedicated seats or a maximum capacity, the sale is marked so that the system does not sell the same seat twice or sell too many tickets. An email receipt is sent to the user confirming their purchase (See CO3,CO4) |
| **Main Success Scenario**               | A user must be logged in, navigate to purchase, and use a valid credit card. (See CO1) |
| **Extensions**                          | If a user isn't logged in, the system requests for them to log in. If the credit card is invalid or the event is full, the request to purchase is denied (see Misuse Case #2). |
| **Special Requirements**                | None |
| **Technology and Data Variations List** | **Credit Card Information**: A struct containing a credit card number (13-19 digit number) and supplimentary information depending on credit card type (eg: expiratin dates, name on card, cvv code, zip code) Credit Card information is entered via a form on the purchase page (See CO1) <br> **Email Receipt**: The user's account must have a valid email address so that a digital receipt can be sent upon successful completion (see CO3,CO4) |
| **Frequency of Occurrence**             | Every time a registered user purchases a ticket |
| **Miscellaneous**                       | |

### Searching for a Ticket - UC2
| **Use Case Section**                    | **Comment**                                                                     |
|-----------------------------------------|---------------------------------------------------------------------------------|
| **Use Case Name**                       | Searching for a Ticket |
| **Scope**                               | Ticket Website. |
| **Level**                               | User-goal - the ability to search for a event |
| **Primary Actor**                       | User - a person wishing to search for an event. |
| **Stakeholders and Interests**          | **User**: A registered user or guest wishes to search for events in the system. |
| **Preconditions**                       | User types information into search box and hits submit |
| **Success Guarantee**                   | The system displays a list of events back to the user |
| **Main Success Scenario**               | A user types in a search box on the website and submits their query for events in the system database. |
| **Extensions**                          | Text given to the user on screen saying "No results" when a query does not yield any events. | 
| **Special Requirements**                | |                               |
| **Technology and Data Variations List** | A database that contains event info |
| **Frequency of Occurrence**             | Every time a user wishes to search for an event. |
| **Miscellaneous**                       | |

### Logging in - UC3
| **Use Case Section**                    | **Comment**                                                                     |
|-----------------------------------------|---------------------------------------------------------------------------------|
| **Use Case Name**                       | Logging In |
| **Scope**                               | Ticket Website. |
| **Level**                               | User-goal - the ability to sign into one's account|
| **Primary Actor**                       | A Registed User who wishes to sign into their account|
| **Stakeholders and Interests**          | User: the person who provides login information to the system|
| **Preconditions**                       | A user must present a valid username (email) and password to the website |
| **Success Guarantee**                   | The user is sent to their homepage|
| **Main Success Scenario**               | A user types in their username and password, hits enter, and is sent to a homepage. |
| **Extensions**                          | If a user provides an incoorect username/password pair, then they will be denied access, and given a link to create an account | 
| **Special Requirements**                | The password should be salted and hashed so as to be inaccessible by the system |
| **Technology and Data Variations List** | A database containing email / salted password pairs |
| **Frequency of Occurrence**             | Every time a user wishes to purchse a ticket |
| **Miscellaneous**                       | |

### Creating an Account - UC4
| **Use Case Section**                    | **Comment**                                                                     |
|-----------------------------------------|---------------------------------------------------------------------------------|
| **Use Case Name**                       | Creating an Account |
| **Scope**                               | Ticket Website. |
| **Level**                               | User-goal - the ability to create an account |
| **Primary Actor**                       | a non-user human who wishes to become a user |
| **Stakeholders and Interests**          | Prospective User - Wishes to register an account|
| **Preconditions**                       | Prospective User provides valid email address and valid password to system|
| **Success Guarantee**                   | A User is created with the information provided by the Prospective User, thereby making the Prospective User a User.|
| **Main Success Scenario**               | Prospective User provides a valid email address and a valid password to system||
| **Extensions**                          | If the user provides an invalid email / invalid password, the form will not submit and the user will be informed of their error. | 
| **Special Requirements**                | The system should be able to write a new user account into a user database |
| **Technology and Data Variations List** | Email Address: an ascii string that corresponds to a specific account on a mail server.<br>Password: An ordered set of fifteen UTF-8 charachters. Must include at least one lower case letter, one upper case letter, one number, and one special character.
| **Frequency of Occurrence**             | Once per user|
| **Miscellaneous**                       | |
