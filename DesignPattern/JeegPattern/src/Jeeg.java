public class Jeeg {

    private Arm armDx;
    private Arm armSx;
    // private Legs legs;
    private Moveable moveable;
    
    public Jeeg(Arm armDx, Arm armSx, Moveable moveable){
        // this.armDx = armDx;
        // this.armSx = armSx;

        // this.setArm(armSx, "sx");
        // this.setArm(armDx, "dx");

        this.setArm(armSx, Side.Sx);
        this.setArm(armDx, Side.Dx);
        //this.setLegs(legs);
        this.setMoveable(moveable);

    }

    // public void setArm(Arm newArm, String side){

    //     if(side.equals("sx")){
    //         this.armSx = newArm;
    //     }else{
    //         this.armDx = newArm;
    //     }
    // }

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

    // public void setArmDx(Arm armDx) {
    //     this.armDx = armDx;
    // }

    public Arm getArmSx() {
        return armSx;
    }

    // public void setArmSx(Arm armSx) {
    //     this.armSx = armSx;
    // }

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

    // public Legs getLegs() {
    //     return legs;
    // }

    // public void setLegs(Legs legs) {
    //     this.legs = legs;
    // }

    // public void muovitiInAvanti(){
    //     this.legs.muovitiInAvanti();
    // }

    // public void muovitiIndietro(){
    //     this.legs.muovitiIndietro();
    // }


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
