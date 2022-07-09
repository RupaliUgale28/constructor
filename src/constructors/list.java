//Program for printing marks of 10 students
package constructors;
public class list 
{
	String name;
	int marathi_marks;
	int english_marks;
	int hindi_marks;
	
	list(String name,int marathi_marks,int english_marks,int hindi_marks)//constructor
	{
		this.name=name;
		this.marathi_marks=marathi_marks;
		this.english_marks=english_marks;
		this.hindi_marks=hindi_marks;
		System.out.println("");
		
		System.out.println("Name of student=" +name +
				"\n1)marathi marks="+marathi_marks+
				" \n2)English Marks=" +english_marks +
				"\n3)Hindi Marks=" +hindi_marks);
	}

	public static void main(String[] args) 
	{
		list l1=new list("saurabh",95,90,99);
		list l2=new list("Prajkta",95,90,99);
		list l3=new list("Vedant",56,78,64);
		list l4=new list("Pranjal",66,98,78);
		list l5=new list("Rahul",78,56,72);
		list l6=new list("Shashi",68,45,61);
		list l7=new list("Amruta",66,38,54);
		list l8=new list("Gayatri",67,39,57);
		list l9=new list("Heena",61,49,82);
		list l10=new list("pawan",78,88,74);
	}
}
//here this.name is a instance variable of current class
//