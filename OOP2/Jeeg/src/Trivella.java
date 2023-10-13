class Trivella extends Arm {
	public Trivella(String side){ 
        super(side); 
    }

	@Override
	public void attack(){
		System.out.println("Attacco con la trivella del braccio " + this.side);
	}
}

