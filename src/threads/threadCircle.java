package threads;

import ui.RaceController;;

public class threadCircle extends Thread {

	private RaceController race;

	public threadCircle(RaceController rc) {
		race = rc;
	}

	@Override
	public void run() {
		int one = 33, two = 10;
		boolean up = false;
		boolean change = false;
		while (true) {
			try {	
				race.animation(one,two,change);
				sleep(100);
				if(one==10)
					up = true;
				if(one == 33)
					up = false;
				if(one==21)
					change = !change;
				if(up == true) {
					one++;
					two--;
				}else {
					one--;
					two++;
				}
			} catch (InterruptedException ex) {

			}
		}
	}
}
