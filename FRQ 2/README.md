## Bottle Class
I have 2 private double variables called capacity and filled that represent the capacity of the bottle and the amount that is filled
In the class' contructor I set filled and capacity to whatever is passed in for the capacity

For the updateAmount method I first check to see if 
the amount filled - the amount taken out < 25% of the capacity

I used an if statement and said "< capacity / 4" because 25% of num = num*0.25= num * 1 / 4 = num / 4
If the conditions of the if statement is met it sets the fill to the capacity and returns the capacity

Otherwise we just take the amount from fill and return the new fill
