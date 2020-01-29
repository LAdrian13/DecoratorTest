
public class BakingSim {

	public static void main(String []args) {
		BakedGood tastycake = new cake();
		
		tastycake = new chocolate(tastycake);
		tastycake = new iceCream(tastycake);
		
		System.out.println( "$" + tastycake.cost() + " " + tastycake.description() );
		
		BakedGood doublefudge = new brownies();
		
		doublefudge = new chocolate(doublefudge);
		doublefudge = new chocolate(doublefudge);
		doublefudge = new peanuts(doublefudge);
		doublefudge = new caramel(doublefudge);
		
		System.out.println();
		System.out.println( "$" + doublefudge.cost() + " " + doublefudge.description() );
		
		BakedGood applepie = new pie();
		
		applepie = new apple(applepie);
		applepie = new whipCream(applepie);
		
		System.out.println();
		System.out.println("$" + applepie.cost() + " " + applepie.description() );
	}
}
