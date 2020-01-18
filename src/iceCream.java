
public class iceCream extends flavorDecorator {
	
	BakedGood bakedGood;
	
	public iceCream(BakedGood bakedGood) {
		this.bakedGood = bakedGood;
	}
	
	public double cost() {
		return bakedGood.cost() + 2.50;
	}

	public String description() {
		return bakedGood.description() + "ice cream";
	}

}
