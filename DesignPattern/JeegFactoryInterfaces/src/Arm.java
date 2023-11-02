// public class Arm implements CanAttack {
    
//     protected String sideLabel;

//     public Arm(String sideLabel) {
//         this.sideLabel = sideLabel;
//     }

//     @Override
//     public void attacca() {
//         System.out.println("Ti accacco con il bracci " + this.sideLabel);
//     }
// }

public abstract class Arm implements CanAttack {
    
    protected String sideLabel;

    public Arm(String sideLabel) {
        this.sideLabel = sideLabel;
    }

    public abstract void attacca();
}
