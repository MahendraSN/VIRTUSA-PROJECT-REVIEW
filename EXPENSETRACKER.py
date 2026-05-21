# ============================================
# SMART EXPENSE TRACKER WITH INSIGHTS
# ============================================

# Importing classes from other files
from expense_manager import ExpenseManager
from analytics import Analytics


# Creating objects
manager = ExpenseManager()
analytics = Analytics()


# Infinite loop for menu system
while True:

    print("\n===================================")
    print(" SMART EXPENSE TRACKER ")
    print("===================================")

    print("1. Add Expense")
    print("2. View Expenses")
    print("3. Monthly Summary")
    print("4. Category Breakdown")
    print("5. Saving Suggestions")
    print("6. Exit")

    # Taking user input
    choice = input("Enter Choice: ")

    # Calling functions based on choice
    if choice == "1":
        manager.add_expense()

    elif choice == "2":
        manager.view_expenses()

    elif choice == "3":
        analytics.monthly_summary()

    elif choice == "4":
        analytics.category_breakdown()

    elif choice == "5":
        analytics.saving_suggestions()

    elif choice == "6":
        print("Thank You For Using Smart Expense Tracker")
        break

    else:
        print("Invalid Choice")
