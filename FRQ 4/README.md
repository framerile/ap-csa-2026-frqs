## getPointsForRow Method
For this one I have a boolean variable sameColor, string variable firstColor (That is the color of the first object in the targetrow), and integer variable sum
Then I loop through each object in the 2d array's target row

I check if the current object's color is NOT the same as the first color, if so then I set sameColor to false
I add the points from each object in the targetlist to my sum variable

After the loop i check if sameColor is true, and if so then we return twice the sum variable, if not then we only return the sun variable
