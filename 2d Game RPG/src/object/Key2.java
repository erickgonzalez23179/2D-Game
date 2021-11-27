package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Key2 extends SuperObject{
	
	public Key2() {
		name = "Key2";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/key2.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
