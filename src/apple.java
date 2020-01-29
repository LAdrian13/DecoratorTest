
public class apple extends flavorDecorator {
	
	BakedGood bakedGood; 
	
	public apple(BakedGood bakedGood) {
		this.bakedGood = bakedGood;
	}

	public double cost() {
		return bakedGood.cost() + 2.00;
	}
	
	public String description() {
		return bakedGood.description() + "apple ";
	}
}
