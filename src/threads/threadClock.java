package threads;

import ui.RaceController;;

public class threadClock extends Thread {

	private RaceController race;

	public threadClock(RaceController rc) {
		race = rc;
	}

	@Override
	public void run() {

		while (true) {
			try {
				race.clock();
				sleep(10);
			} catch (InterruptedException ex) {

			}
		}
	}
}
