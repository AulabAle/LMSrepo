public class Jeeg {

    private Arm armDx;
    private Arm armSx;
    private Moveable moveable;
    
    public Jeeg(Arm armDx, Arm armSx, Moveable moveable){
        this.setArm(armSx, Side.Sx);
        this.setArm(armDx, Side.Dx);
        this.setMoveable(moveable);
    }

    public void setArm(Arm newArm, Side side){

        if(side == Side.Sx){
            this.armSx = newArm;
        }else{
            this.armDx = newArm;
        }
    }

    public Arm getArmDx() {
        return armDx;
    }

    public Arm getArmSx() {
        return armSx;
    }

    public void attacca(){
        this.armDx.attacca();
        this.armSx.attacca();
        this.armSx.attacca();
        this.armDx.attacca();
        
        if(this.moveable instanceof Tank){
            Tank t = (Tank) moveable;
            t.attacca();
        }
    }

    public Moveable getMoveable() {
        return moveable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public void muovitiInAvanti(){
        this.moveable.muovitiInAvanti();
    }

    public void muovitiIndietro(){
        this.moveable.muovitiIndietro();
    }

}
