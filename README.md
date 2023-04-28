TODO:
- Display
- Main Menus (Screen 1)
  - have 3 buttons to access the other 3 screens 
  - header/logo for our project (title - Budget tracker app)
  
  ![image](https://user-images.githubusercontent.com/80778373/234632602-d23363bb-0536-45a5-b3b6-1a7b4112864a.png)


  
- Enter cost/recurring payment (Screen 2)

![image](https://user-images.githubusercontent.com/80778373/234632926-1d9181a5-1ca0-4437-a974-f1b71abda24b.png)


-----prompt with categories
- Enter income (Screen 3)

![image](https://user-images.githubusercontent.com/80778373/234633444-fc1c8dc3-7bea-49ba-86c9-cc5801d4414e.png)


- Display data (Screen 4)
  - get info from screen 2 and screen 3 (display error message if no info was given to screens 2 and 3)
  - possibly a button to take us back to main menu (screen 1)
  
  ![image](https://user-images.githubusercontent.com/80778373/234633599-86ad26d7-32dd-4374-92d8-3350af975201.png)




Classes:
CategoryTracker (loads file -> String)
	Instance Vars:
		HashMap<Category> bills;
		HashMap<Category> wants;
		Category savings;
	Methods:
		addCategory(String type, String name, double val)
		setCatagory(String type, String categoryName, double newExpenseNumber)
		getCategory(String type, String categoryName)
		getExpense(String type, String categoryName)
		getTotalBills()

Category -> abstract class
	Bills is a category
		String name
		double value
	Wants is a category
		String name
		double percentage
	Savings is a category
		String name
		double percentage
	
Categories -> equations = income(monthly/yearly) - bills (rest allocated by user %s)
Bills/Necessities
	housing/rent
	car insurance/car payments
	utilities
	cell phone
	childcare/school
	pet food/care/insurance
	health insurance
	monthly memberships/subscriptions (tv, gym, etc.)
	life insurance
	homeowners/renters insurance
	student loans
	credit card payments
Wants
	food
	emergency fund
	retirement
	entertainment
	clothing and personal upkeep
	travel
Savings (recommended is 20% of remainder after bills)
