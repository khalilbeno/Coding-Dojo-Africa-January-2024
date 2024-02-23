class BankAccount:
    
    def __init__(self, int_rate=0.01, balance=0): 
        self.int_rate=int_rate
        self.balance=balance
    def deposit(self, amount):
        self.balance+=amount
        return self
    def withdraw(self, amount):
        if self.balance <amount :
            print("Insufficient funds: Charging a $5 fee")
        else:
            self.balance-=amount
        return self
    def display_account_info(self):
        print(f"balance: ${self.balance}")
    def yield_interest(self):
        self.balance+=self.balance*self.int_rate
        return self
client1=BankAccount(0.1,500)
client1.deposit(100).deposit(100).deposit(100).withdraw(400).yield_interest().display_account_info()
client2=BankAccount(0.1,1000)
client2.deposit(100).deposit(100).withdraw(10).withdraw(10).withdraw(10).withdraw(10).yield_interest().display_account_info()



class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)
    
    # other methods
    
    def make_deposit(self, amount):
        self.account.deposit(amount).display_account_info()

    def make_withdrawal (self,amount):
        self.account.withdraw(amount)

    def  display_user_balance(self):
        self.account.display_account_info()

