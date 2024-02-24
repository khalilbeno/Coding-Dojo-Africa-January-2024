from . import card
import random

class Deck:


    def __init__( self ):
        suits = [ "spades" , "hearts" , "clubs" , "diamonds" ]
        self.cards = []

        for s in suits:
            for i in range(1,14):
                str_val = ""
                if i == 1:
                    str_val = "Ace"
                elif i == 11:
                    str_val = "Jack"
                elif i == 12:
                    str_val = "Queen"
                elif i == 13:
                    str_val = "King"
                else:
                    str_val = str(i)
                self.cards.append( card.Card( s , i , str_val ) )
        # give all image cards a vaue of 10
        for c in self .cards:
            if c.point_val>10:
                c.point_val =10
            elif c.point_val==1:
                c.point_val=11


    def show_cards(self):
        for card in self.cards:
            card.card_info()

    def shuffle(self):
        random.shuffle(self.cards)
    
    def getcard(self):
        onecard=self.cards[0]
        self.cards.pop(0)
        return onecard 