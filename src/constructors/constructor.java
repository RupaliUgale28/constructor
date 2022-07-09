//Basic about constructor
package constructors;
public class constructor 
{
	String names;
	int marks;
	 constructor(String names,int marks)//Constructor 1
	{
		this.names=names;
		this.marks=marks;
		System.out.println(names + " " +marks);
	}
	
	public constructor()//constructor 2
	{
		System.out.println("hi rupa");
	}

	public static void main(String[] args) 
	{
		constructor d=new constructor("saurabh",98);
		constructor d1=new constructor("Rahul",94);
		constructor d2=new constructor();//calling con 2 ..because it has no arg
		
		

	}
	
}
//introduction==defn==purpose==syntax=return type==name as=modifiers==can't use==multiple==new keyword==
//types==method vs constructor==overloading and overridding==
