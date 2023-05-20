# JavaContest
10-Day Challenge : Learn and Win a Macbook Air

#Day 1:
Pascal Triangle Execution Flow

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
