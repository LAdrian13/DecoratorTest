
public class whipCream extends flavorDecorator {
	
	BakedGood bakedGood;
	
	public whipCream(BakedGood bakedGood) {
		this.bakedGood = bakedGood;
	}
	
	public double cost() {
		return bakedGood.cost() + .50;
	}

	public String description() {
		return bakedGood.description() + "whipcream";
	}

}
