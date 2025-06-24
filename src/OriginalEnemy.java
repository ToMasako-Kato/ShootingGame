
public class OriginalEnemy extends Enemy {
	public void draw(MyFrame f) {
		f.setColor(100, 100, 100);
		f.fillRect(x+10,y-5,10,40);
		f.fillRect(x-5,y+10,40,10);
		f.fillOval(x, y, 30, 30);
		f.setColor(55, 55, 55);
		f.fillOval(x + 5, y, 20, 30);
		f.setColor(255, 255, 255);
		f.fillOval(x + 10, y + 10, 10, 10);
	}

	public OriginalEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		if(Math.random()>0.5) {
			this.vx = 5 + (GameWorld.stage / 3);
		}
		else {
			this.vx = -(5 + (GameWorld.stage / 3));
		}
		life = 4 + (GameWorld.stage / 3);
	}

	public void move() {
		super.move();
		if (x >= 370 && vx>0) {
			vx = -5 - (GameWorld.stage / 3);
		} else if (x <= 0 && vx<0) {	
			vx = 5 + (GameWorld.stage / 3);
		}
	}
}