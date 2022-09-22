## Vision
The general vision for this project is providing a user with a simple yet practical event ticket purchasing system. The user will have the ability to purchase tickets and search for tickets that are within the database.
## Domain model
[domainModel360.pdf](https://github.com/CSCI-360-2022/Software-Chasers/files/9531151/domainModel360.pdf)
![Domain Model](https://raw.githubusercontent.com/wiki/CSCI-360-2022/Software-Chasers/assets/domainModel.png)
## Fully Dressed Use Cases
| **Use Case Section**                    | **Comment**                                                                     |
|-----------------------------------------|---------------------------------------------------------------------------------|
| **Use Case Name**                       | Purchasing A Ticket |
| **Scope**                               | Ticket Purchasing Website |
| **Level**                               | User-goal - the ability to purchase a ticket. |
| **Primary Actor**                       | A user wishing to purchase a ticket. |
| **Stakeholders and Interests**          | **User**: Primary actor who wishes to purchase a ticket<br>**Payment Processor**: supporting actor who verifies card information. needs to know credit card number and amount to charge for each purchase<br>**Event Host**: Offstage actor responsible for organizing event. Should have a list of users who are attending |
| **Preconditions**                       | A user must be logged-in and have a valid credit card |
| **Success Guarantee**                   | If an event has dedicated seats or a maximum capacity, the sale is marked so that the system does not sell the same seat twice or sell too many tickets. An email receipt is sent to the user confirming their purchase |
| **Main Success Scenario**               | A user must be logged in, navigate to purchase, and use a valid credit card.                |
| **Extensions**                          | If a user isn't logged in, the system requests for them to log in. If the credit card is invalid, the request to purchase is denied.                            |
| **Special Requirements**                | None|
| **Technology and Data Variations List** | **Credit Card Number**: A string of 13-19 numeric chars. Depending on credit card type, additional information may need to be captured from user (dates, name on card, cvv code, zip code, etc) Credit Card information is entered via a form on the purchase page <br> **Email**: upon successful completion, the system will send a digital receipt to the email address stored on a user's profile |
| **Frequency of Occurrence**             | Every instance that a user finds a ticket they wish to purchase.                |
| **Miscellaneous**                       | A decision needs to be made on whether or not a user should be able to purchase multiple tickets at once and research needs to be done to decide on whether or not the credit card information saves (with approval)|

| **Use Case Section**                    | **Comment**                                                                     |
|-----------------------------------------|---------------------------------------------------------------------------------|
| **Use Case Name**                       | Searching for a Ticket |
| **Scope**                               | Ticket Website. |
| **Level**                               | User-goal - the ability to search for a event |
| **Primary Actor**                       | A user wishing to search for an event. |
| **Stakeholders and Interests**          | User: A person wishing to search for specific events in the system. |
| **Preconditions**                       | A user must be able to connect to the website and type in the search box|
| **Success Guarantee**                   | The user's query is a reasonable size (eg: < 4kb of text) |
| **Main Success Scenario**               | A user types in a search box on the website and submits their query for events in the system database. |
| **Extensions**                          | Text given to the user on screen saying "No results" when a query does not yield any events | 
| **Special Requirements**                | When a user inputs a search, the input received must be confirmed with the database on whether or not the data is a valid search.                               |
| **Technology and Data Variations List** | A database will be used to store the names of the events. |
| **Frequency of Occurrence**             | Every instance that a user wishes to search for an event.              |
| **Miscellaneous**                       | Research needs to be done on whether or not the system should suggest the user a different event based on their previous searches.                                                                 |

## Supplementary Specifications
* Support for the event ticket purchasing system will include support on web-based browsers. No support will be added for mobile phones such as iOS and Android outside of the browser.

* No requirements for licensing is needed as this system will not be made available to the general public.

* Because this program is not meant to be available to the general public, care should be taken to avoid using GPL and AGPL licensed libraries.

* Reports on this system may be made to allow the CFO (Professor Hardie) to be kept up to date on the project progress.

* Documentation on the system for both users and future programmers should be provided.
## Glossary
* Event search - when a user searches for a particular event in the database by interacting with the front end search bar.

* Event ticket purchase - when a user purchases a ticket for an event they found.

* Log in - allows the user to verify their information with the database.


* Receipt - a confirmation of purchase given to the user.

