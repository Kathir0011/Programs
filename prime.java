class prime
{
public static void main (String[] args)
{
System.out.println("20ITA28 - B.Kathir Pandian");		
int i =0;
int num =0;
String  no= "";
for (i = 1; i <= 100; i++)         
{ 		  	  
int counter=0; 	  
for(num =i; num>=1; num--)
{
if(i%num==0)
{
counter = counter + 1;
}
}
if (counter ==2)
{    
no = no + i + " ";
}	
}	
System.out.println("Prime numbers from 1 to 100 are :");
System.out.println(no);
}
}