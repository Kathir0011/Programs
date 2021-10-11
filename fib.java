class fib{  
public static void main(String args[])  
{ 
System.out.println("20ITA28 - B.Kathir Pandian");  
int a=0,b=1,c,i,count=12;    
System.out.print(a+" "+b);  
for(i=2;i<count;++i)
{    
c=a+b;    
System.out.print(" "+c);    
a=b;    
b=c;    
}    
}
}  