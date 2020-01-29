
public class peanuts extends flavorDecorator {
	
	BakedGood bakedGood;
	
	public peanuts(BakedGood bakedGood) {
		this.bakedGood = bakedGood;
	}
	
	public double cost() {
		return bakedGood.cost() + .50;
	}

	public String description() {
		return bakedGood.description() + "peanuts ";
	}

}
