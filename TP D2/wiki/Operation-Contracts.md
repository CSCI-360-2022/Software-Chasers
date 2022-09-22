# Operation Contracts:
## Contract CO1: purchaseTicket
|
|-----------------------|-----------------------------------------------------------------------------------------------|
| Operation:		| purchaseTicket(userID: integer, ticketID: unsigned integer, cardInfo: struct, eventID)	|
| Cross References:	| Use Cases: Purchasing a ticket.								|
| Preconditions:	| * Buyer must use the application to submit a request to purchase a ticket to the server	\
			  * Buyer must have filled out the purchase form with credit card information.			\
			  * Buyer must be logged in.									|
| Postconditions	| - eventID.atendees was incremented by 1							\
			  - userID.account.tickets was updated with the ticket information				|

## Contract CO2: searchFor
|
|-----------------------|-----------------------------------------------|
| Operation: 		| searchFor(query: String)			|
| Cross References:	| Use Cases: Searching for a ticket.		|
| Preconditions: 	| A user must type into the search bar		|
| Postconditions:	| *  A query through the database was performed \
			  * event.information query results were displayed to the user in a presentable format.

## Contract CO3: generateReceipt
|
|-----------------------|-----------------------------------------------------------------------|
| Operation: 		| generateReceipt(userID: integer)					|
| Cross References:	| Use Cases: Purchasing a ticket.					|
| Preconditions: 	| Buyer must be logged in.    						\
			  Buyer must have purchased a ticket.					|
| Postconditions:	| ticket.information was generated and associated with the buyer.	|
   

## Contract CO4: sendReceipt
|
|-----------------------|---------------------------------------------------------------|
| Operation: 		| sendReceipt(receiptID: integer)				|
| Cross References:	| Use Cases: Purchasing a ticket.				|
| Preconditions: 	| * Buyer must be logged in.    				\
			  * Buyer must have purchased a ticket.				|
| Postconditions:	| - ticket.information was sent to the email of the buyer.	|

