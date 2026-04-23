package SuperKeyword;

public class SuperConstructorChild extends SuperconstructorParent{
public void SuperConstructorChild() 
{
super(2,4);
 System.out.println("ann");

}
public static void main(String args[]) {
	
	SuperConst obj = new SuperConstructorChild();
}


}