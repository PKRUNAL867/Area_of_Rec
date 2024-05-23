import java.util.*;
public class area_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenth of area");
		double leanth=sc.nextDouble();
		System.out.println("Enter the breath of area");
		double breath=sc.nextDouble();
		area a1=new area();
		a1.setdim(leanth,breath);
		System.out.println("Area of rectange "+ a1.getarea());

	}

}
