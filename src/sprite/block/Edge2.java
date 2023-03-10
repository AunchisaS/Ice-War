package sprite.block;

import resource.ImageHolder;
import interfaces.IDamageable;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import sprite.base.Sprite;

public class Edge2 extends Block{

	public Edge2(double x, double y) {
		super();
		health = 100;
		this.setPosition(new Point2D(x*getWidth(),y*getHeight()));
	}

	@Override
	public void draw(GraphicsContext gc) {

		Image image = (ImageHolder.getInstance()).edge2;
	    double x = getPosition().getX();
	    double y = getPosition().getY();		
		gc.drawImage(image, x, y, image.getWidth(), image.getHeight());	
	}

	@Override
	public void update() {}

	@Override
	public void takeDamage(int damage) {}


}

