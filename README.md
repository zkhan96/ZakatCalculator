# Zakat Calculator
This is a simple program that will help you calculate Zakat if you've ever wanted to verify and 
back-date from your transaction history how much you are due.

## Assumptions
I am assuming that we are using the value of gold at £31.00 per gram and the amount of gold to be
 eligible to be 70 grams, that is £2170.00 in my locality, you should check at your nearest 
 dealer what the value of gold is there.
 
I am also assuming you have no liabilities to consider in this account, as that is a bit too 
 complex to figure out
 
## Method of calculation

My method of calculation as per my local imam is as follows:

* You find the very first date in which you exceeded the nisaab value (£2170 in this case)
* The next lunar year on the same day you check whether you still are above the nisaab threshold, 
if you are not, you do not pay Zakat and you return to the first step. If you are above the 
threshold, you pay 2.5% of whatever is in the account using the value of gold today.

## Example
This is the format that is required as a `.txt` file:
```$xslt
Date: 01/06/2017
Balance: 1156.07

Date: 01/06/2017
Balance: 1217.06

Date: 01/06/2017
Balance: 1235.05

Date: 31/05/2017
Balance: 1357.03

Date: 31/05/2017
Balance: 1367.03
```

I did this by going on my bank web portal and exporting my transactions, then using `Sublime 
Text` to format it so I can only see my balance on that date.


