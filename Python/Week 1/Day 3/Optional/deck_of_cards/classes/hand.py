class Hand:
    def __init__(self,name,hidden=False):
        self.name=name
        self.cards=[]
        self.hidden=hidden

    def addCard(self,deck):
        self.cards.append(deck.getcard())
        
    def displayCard(self):
        print("The "+self.name+" has:")
        if self.hidden==True:
            self.cards[0].cards_info()
            print("Hidden Card")
        else:
            for c in self.cards:
                c.cards_info()
        print("--------")
    def sum(self):
        s=0
        for c in self.cards:
            s+=c.point_val
        for c in self.cards:
            if c.point_val==11 and s>21:
                s-=10
        return s