Write a prefix stack and show how it works (in main). 

1.	Understanding Prefix Notation-
1.	Example: 
1.	Infix Notation or regular Notation :
(((((2*2)/3)+6)-5)/2);
2.	Postfix Notation:-
(256322*/+-/);
3.	Prefix Notation:- 
(/-+/*223652);

2.	Understanding Stack –
Stack is data structure of elements which work on 
“LAST IN FIRST OUT” BASIS
Example:- 
Infix Notation or regular Notation : (((((2*2)/3)+6)-5)/2);

In Stack form: we first convert the infix to post fix notation.
1.	Turn Infix to Postfix Notation: (256322*/+-/); (read left to right)
2.	If given prefix Notation: (/-+/*223652); (Read right to left)
/					
-					
+	/				
/	-				
*	+	/			
2	/	-			
2	4	+	/		
3	3	1	-		
6	6	5	6	/	
5	5	6	6	0	
2	2	2	2	2	0
Adding to stack (Integers only): 
1.	Use Push operator to add the operand or number to stack.
2.	When encounter a operator like “+”, “-“ etc. Use last two element with operator for outcome element that will be added to the stack.
3.	Loop the point “2” until stack has only 1 element left.
4.	As demonstrated by table



