package Live;

import Music.Playable;
import Music.string.Veena;
import Music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		Playable veen, sax;
		veen = new Veena();
		sax = new Saxophone();
		v.play();
		s.play();
		System.out.println("using Instamce---------------");
		veen.play();
		sax.play();

	}

}
