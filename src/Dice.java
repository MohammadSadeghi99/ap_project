import java.awt.*;
import java.util.Random;
public class Dice implements Animatable{
    private int rand;
    private int x;
    private int y;
    Random random = new Random();
    public Dice(int x , int y){
        this.x = x;
        this.y = y;
        randomGenerator();
    }
    public void randomGenerator(){
        rand = random.nextInt(6)+1;
        System.out.println(rand);
    }

    @Override
    public void paint(Graphics2D graphics2D) {
        graphics2D.setColor(Color.BLACK);
        graphics2D.fillRect(x - 17,y - 30,50,50);
        graphics2D.setColor(Color.CYAN);
        graphics2D.setFont(new Font("test" , Font.BOLD , 30));
        graphics2D.drawString(Integer.toString(rand),x,y);
    }

    public int getMaxX() {
        return x + 33;
    }

    public int getMaxY() {
        return y + 20;
    }
    public int getMinX() {
        return x - 17;
    }

    public int getMinY() {
        return y -30;
    }
}