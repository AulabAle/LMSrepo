public class Arm {
	protected String side;

	public Arm(String side){ 
        this.side = side ; 
    }

	public void attack(){
		System.out.println("Attacco con il braccio " + this.side);
	}
}

