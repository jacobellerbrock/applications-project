TODO:
- Display
- Main Menus (Screen 1)
  - have 3 buttons to access the other 3 screens 
  - header/logo for our project (title - Budget tracker app)
  
- Enter cost/recurring payment (Screen 2)

-----prompt with categories
- Enter income (Screen 3)

- Display data (Screen 4)
  - get info from screen 2 and screen 3 (display error message if no info was given to screens 2 and 3)
  - possibility a button to take us back to main menu (screen 1)

Classes:
CategoryTracker (loads file -> String)
	Instance Vars:
		Map<String, List<String>> categories = new HashMap<String, List<String>>();
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
