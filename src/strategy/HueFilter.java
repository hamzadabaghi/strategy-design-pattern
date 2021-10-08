package strategy;

public class HueFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("Hue Filter");
    }
}
