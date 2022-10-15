ffimport random
def choose():
    words=['rainbow','cow','boy','jumble','car']
    pick=random.choice(words)
    return pick
def jumble(word):
    jumbled="".join(random.sample(word,len(word)))
    return jumbled
def thank(p1n,p2n,p1,p2):
    print(p1n,"Your score is:",p1)
    print(p2n,"Your score is:",p2)
    print("Thanks for playing, have a nice day")
def play():
    p1name=input("Enter player 1 name:")
    p2name=input("ENter name of player 2")
    pp1=0
    pp2=0
    turn=0
    while(1):
        picked_word=choose ()
        qn=jumble(picked_word)
        print(qn)
        if turn%2==0:
            print(p1name,"YOur turn")
            ans=input("What's on my mind?"  )
            if ans==picked_word:
                pp1=pp1+1
                print("Your score is ",pp1)
            else:
                print("Better luck next time, i thought:",picked_word)
            c=input("Press 1 to continue and 0 to exit from the gamne")
            if c==0:
                thank(p1name,p2name,pp1,pp2)
                break
        if turn%2==0:
            print(p2name,"YOur turn")
            ans=input("What's on my mind?"  )
            if ans==picked_word:
                pp2=pp2+1
                print("Your score is ",pp1)
            else:
                print("Better luck next time, i thought:",picked_word)
            c=input("Press 1 to continue and 0 to exit from the gamne")
            if c==0:
                thank(p1name,p2name,pp1,pp2)
                break
        turn=turn+1
        
play()
        
        
                
            