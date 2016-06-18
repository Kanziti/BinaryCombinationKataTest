# BinaryCombinationKataTest
Date : 18/06/2016

Notice : For comfortable reading please use edit mode

Hello,

Please find here my answer for the KATA test in two steps corresponding to the two questions :

1st step :
I created this as simple java project named "BinaryCombinationKataTest" to get  a count of combinations
which meet the criteria demanded (binary numbers that don't have two adjacent "1" bits).

As an answer to the first question :

Sequence length ----> Combination matched
3               ---->         5
4               ---->         8
5               ---->        13
6               ---->        21
7               ---->        34
8               ---->        55
9               ---->        89
10              ---->       144
n               ---->     E(n)=E(n-1)+E(n-2) 

This relationship is till now due to observation and it will be proved in 2nd step.

2nd step related to the second question:

To prove the relationship observed above, let study the transition of the number of bits
from (n) to (n + 1):

Assuming the sets E(n)and E(n+1) contain the binary combinations respectively for  "n" and "n + 1" bits
with the criteria which excludes combinations that don’t have two adjacent 1 bits.

Since there are binary combinations we can split each set to two subsets:
E0(n) includes combinations that start with "0".
E1(n) includes combinations that start with "1".

So we have : 
(1): E(n)= E0(n)+E1(n)
(2): E(n+1)= E0(n+1)+E1(n+1)

Practically to go up from (n) bits to (n+1) bits we can just add 1 bit ("0" , "1") at the beginning
or at the end of each combination of the subsets E0(n) and E1(n) but we must keep in mind the defined
criteria, let see the Test table below: 

From     E(n)	  added*	  E(n+1)	Criteria matched
E0(n)     010     0        0010            yes
E1(n)     101     0        0101            yes
E0(n)     010     1        1010            yes
E1(n)     101     1        1101            No

* I add the new bit at the beginning (just a choice)

Regarding to the Test table, to meet the criteria for E(n+1) :

-We have to add "0" at the beginning of each combination of the subsets E0(n) and E1(n), so we can write :
(3): E0(n+1) = E0(n)+E1(n) 

-We have to add a "1" at the beginning of the combinations of the subset E0(n) only, so we can write :
(4): E1(n+1)= E0(n)

We get from (1) and (3) :
(5) : E(n)=E0(n+1) and so (6): E(n-1)=E0(n)

And from (4) and (6) we get :
(7) : E1(n+1)= E(n-1)

So by substitution using (2), (5) and (7) we get :
E(n+1)= E(n)+ E(n-1)

And finally :

E(n)= E(n-1)+ E(n-2)

