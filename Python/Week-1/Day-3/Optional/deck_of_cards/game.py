from classes.deck import Deck
from classes.hand import Hand

bicycle = Deck()
bicycle.shuffle()
playerHand=Hand("Player")
dealerHand=Hand("Dealer",True)

playerHand.addCard(bicycle)
dealerHand.addCard(bicycle)
playerHand.addCard(bicycle)
dealerHand.addCard(bicycle)

endGame=True

while endGame==False:
    dealerHand.displayCard()
    playerHand.displayCard()

    choise=input("Do you want to hit ,stand or quit ? [H|S|Q]").lower()
    # quit
    if choise=="q":
        print("thank you for playing, good bye")
        endGame=True
    # hit
    if choise=="h":
        playerHand.addCard(bicycle)
        playerHand.displayCard()
        if playerHand.sum()>21:
            print("Player Bust")
            endGame=True
    # Stand
    if choise=="s":
        dealerHand.hidden=False
        dealerHand.displayCard()
        while dealerHand.sum()<17:
            dealerHand.addCard(bicycle)
            dealerHand.displayCard()
            if dealerHand.sum()>21:
                print("dealer Bust")
                endGame=True
        if endGame==False:        
            if dealerHand.sum()>playerHand.sum():
                print("dealer Bust")
            if dealerHand.sum()<playerHand.sum():
                print("player win")
            if dealerHand.sum()==playerHand.sum():
                print("DROW")
        endGame=True

            




# bicycle.show_cards()