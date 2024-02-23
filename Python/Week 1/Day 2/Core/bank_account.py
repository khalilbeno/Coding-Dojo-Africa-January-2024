class BankAccount:
    
    def __init__(self, int_rate=0.1, balance=0): 
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



