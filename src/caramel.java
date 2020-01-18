
public class caramel extends flavorDecorator {
	
	BakedGood bakedGood;
	
	public caramel(BakedGood bakedGood) {
		this.bakedGood = bakedGood;
	}
	
	public double cost() {
		return bakedGood.cost() + 1.00;
	}

	public String description() {
		return bakedGood.description() + "caramel";
	}

}
