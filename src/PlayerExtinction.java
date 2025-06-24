
public class PlayerExtinction extends Character{
	public  void draw(MyFrame f) {	
		f.setColor(101, 187, 233);
    	f.fillOval(x, y, 15, 15);
//		f.fillOval(x+10, y+20, 10, 10);
//		f.fillOval(x, y+10, 10, 10);
//		f.fillOval(x+20, y+10, 10, 10);
	}
	public PlayerExtinction(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	
}
