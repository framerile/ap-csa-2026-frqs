## Part A
I used a for-loop to keep count of the number of attempts/num of usernames while also checking if the username is NOT available. 
I put "!isAvailable(saved)" to esentially turn the for-loop into a while loop.
I have the string "saved" to have a saved username to edit before setting that to the actual username
YA


## Part B
I have "if(username.indexOf("-") == -1)" to do a quick return if theres no hyphen in username
I used a forloop to loop through each letter/symbol in the string to check if it's a hyphen
If it is a hyphen then I use substring to cut off the letter before the hyphen and the hypehn itself
I noticed that there may be an issue with the index i, so I set i back by 1 to make up for this

All of this is stored on a String variable "result" in order to keep the original username variable the same.
