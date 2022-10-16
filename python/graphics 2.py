from turtle import *
bgcolor("black")
speed(0)
hideturtle()
for i in range (1200):
    color("yellow")
    circle(i)
    color("green")
    circle(i*0.8)
    right(3)
    forward(3)
done()