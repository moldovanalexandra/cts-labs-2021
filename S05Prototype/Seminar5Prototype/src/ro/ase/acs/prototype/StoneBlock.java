package ro.ase.acs.prototype;

public class StoneBlock extends BuildingBlock implements Cloneable{

    private Texture texture = null;

    public StoneBlock() {
        System.out.println("Loading textures...");
        try {
            Thread.sleep(3000);
            texture = new Texture("stone");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override//nu e obligatoriu, dar ii spun intentia: sa supraincarc o metoda, nu sa fac una noua
    public void render(){
        System.out.println(String.format("The %s block was rendered at %d %d %d", texture.getName(), getX(),getY(),getZ()));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        StoneBlock copy = (StoneBlock)super.clone();
        copy.texture = (Texture)texture.clone();
        return copy;
    }

}
