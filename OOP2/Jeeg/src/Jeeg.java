public class Jeeg {
	private Arm armSx;
	private Arm armDx;
	private Moveable moveable;

    public Jeeg(Arm armSx, Arm armDx, Moveable moveable) {
        this.armSx = armSx;
        this.armDx = armDx;
        this.moveable = moveable;
    }

    public void attaccoDestro(){
		this.armDx.attack();
	}
	public void attaccoSinistro(){
		this.armSx.attack();
	}

    public void attaccoParteDiSotto(){
		if(this.moveable.getClass().isInstance(new Tank())){
            Tank t = (Tank) this.moveable;
            t.attack();
        }
	}

    public void muovitiInAvanti(){
        this.moveable.goForward();
    }

    public void muovitiIndietro(){
        this.moveable.goBackward();
    }

}

