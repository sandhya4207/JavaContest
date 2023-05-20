# JavaContest
10-Day Challenge : Learn and Win a Macbook Air

#Day 1:
Ref:
Pascal Triangle Formula:
Any particular number on any row of the triangle can be found using the binomial coefficient. The binomial coefficient is used to find the number of r outcomes from a net of n, if the order does not matter. This is otherwise known as the number of combinations of r out of n items. For example, if there are seven colors in the color spectrum, how many different groups of four colors are there? With a combination, order does not matter, so the group (yellow, green, red, orange) is the same as (green, yellow, orange, red). The combinations of r out of n items can be denoted nCr or (n/r)  Such a combination can be found using this equation:

![image](https://github.com/sandhya4207/JavaContest/assets/116782242/e37e8568-e8da-4bff-93ac-1e66d193d197)

In my code i have impletented above formula.
for better understanding read the code comments

****Pascal Triangle Execution Flow****
/*
output:
  1
 1 1
1 2 1

n=5
i=0; 0<5 true
4 space print(n-(i+1))

j=0; 0<=0 true
ncr(0,0) -> n=0,r=0
factorial(0) / (factorial(0)*factorial(0))
| | |
1 / 1 * 1

i++=>1; 1<5 true
3 space print

j=0; 0<=1 true
ncr(1,0) -> n=1, r=0
factorial(1) / factorial(1)*factorial(0) => 1/(1*1) => 1
j++=>1; 1<=1 true
ncr(1,1) -> n=1, r=1
reutrn 1
j++=>2; 2<=1 false


i++=>2; 2<5 true
2 space print

j=0; 0<=2 true
ncr(2,0) -> n=2, r=0
factorial(2)/factorial(2)*factorial(0) => 2/(2*1) => 1
j++=>1; 1<=2 true
ncr(2,1) -> n=2, r=1
factorial(2)/factorial(1)*factorial(1) => 2/(1*1) => 2
j++=>2; 2<=2 true
ncr(2,2) -> n=2, r=2
factorial(2)/factorial(0)*factorial(2) => 2/(1*2) => 1

*/
