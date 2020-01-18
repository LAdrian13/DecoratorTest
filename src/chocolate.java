
public class chocolate extends flavorDecorator {
	
	BakedGood bakedGood;
	
	public chocolate(BakedGood bakedGood) {
		this.bakedGood = bakedGood;
	}
	
	public double cost() {
		return bakedGood.cost() + 1.00;
	}

	public String description() {
		return bakedGood.description() + "chocolate";
	}

}
