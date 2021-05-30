import java.util.Scanner;

public class Main {
	public static int calcLength(int n){
			int length=0;
			while(n!=0){
				length=length+1;
				n=n/10;}
				return length;}
	
	public static void prime(int a){
		if(a%2==1)
		  System.out.println("Given number is prime");
		 else
		  System.out.println("Given number is non prime");
	}
	public static double factorial(int b){
		double fact=1;
		for(int i=b;i>0;i--){
			fact=fact*i;}
			return(fact);
	}
	public static void square(int c){
		int sqr=1;
		for(int i=1;i<c/2;i++){
			sqr=i*i;
			if(sqr==c)
			  break;}
			if(sqr==c)
			  System.out.println("Given number is square number");
			else
			  System.out.println("Given number is non sqare number");
	}
	public static void cube(int d){
		 int cub=1;
		 for(int i=1;i<=d/2;i++){
		 	cub=i*i*i;
		 	if(cub==d)
		 	 break;
		 }
		 if(cub==d)
		   System.out.println("Given number is cube number");
		  else
		    System.out.println("Given number is non cube number");
	}
	public static void palindrome(int e){
		int temp=e;
		int s=0;
		while(e>0){
			int r=e%10;
			s=(s*10)+r;
			e=e/10;}
		if(temp==s)
		  System.out.println("Palindrome");
		 else
		   System.out.println("Non palindrome");
	}
    public static void neon(int f){
    	int ne=f*f;
    	int s1=0;
    	while(ne>0){
    	 int r1=ne%10;
    	 s1=s1+r1;
    	 ne=ne/10;}
    	 if(s1==f)
    	    System.out.println("Neon number");
    	  else
    	     System.out.println("Non neon number");
    }
   public static void armstrong(int g){
   	 int temp1=g;
   	 int s2=0;
   	 while(g>0){
   	 	int r2=g%10;
   	 	int cu=r2*r2*r2;
   	 	s2=s2+cu;
   	 	g=g/10;}
   	 if(temp1==s2)
   	   System.out.println("Armstrong number");
   	  else
   	    System.out.println("Non armstrong number");}
	public static void fibbo(int h){
		int h1=0,h2=1,h3=0;
	System.out.print(h1+" "+h2);
	   while(h3<h){
		h3=h1+h2;
		if(h3>h)
		  break;	
		System.out.print(" "+h3);
		h1=h2;
		h2=h3;
		
		 }
		}
		
	public static void disarium(int j){
		int s3=0,temp2;
		int len=calcLength(j);
		temp2=j;
		while(j>0){
			int rem=j%10;
			s3=s3+(int)Math.pow(rem,len);
			j=j/10;
			len--;
		}
		if(s3==temp2)
		 System.out.println("Disarium number");
		else
		 System.out.println("Non disarium number");
	}
	
	public static void harshad(int k){
		int s4=0,temp3;
		temp3=k;
		while(k>0){
			int rem2=k%10;
			s4=s4+rem2;
			k=k/10;}
		if(temp3%s4==0)
		  System.out.println("Harshad number");
		 else
		  System.out.println("Non harshad number");	
	}
		
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\n INDEX\n1-The number is prime or not\n2-The factorial of given number\n3-The given number is square or not\n4-The given number is cube or not\n5-The given nymber is palindrome or not\n6-The given number is neon or not\n7-The given number is armstrong or not\n8-Fibonacci series till the given number\n9-The given number is Disarium or not\n10-The given number is Harshad number or not" );
	System.out.println("\n\nEnter a number");
	int n=sc.nextInt();
	System.out.println("\n\nEnter what to find from the index");
	int op=sc.nextInt();

     switch(op){
	 case 1:prime(n);
	              break;
	 case 2:double f=factorial(n);
	              System.out.println("\nFactorial of "+                          n+" is "+f);
	              break;
	 case 3:square(n);
	              break;
	 case 4:cube(n);
	              break;
	 case 5:palindrome(n);
	              break;
	 case 6:neon(n);
	              break;
	 case 7:armstrong(n);
	              break;
	 case 8:fibbo(n);
	              break;
	 case 9:disarium(n);
	              break;
	 case 10:harshad(n);
	               break;
	 default:System.out.println("Invalid input");
	      }}}
  
	
	