package com.tunnel.problem;

public class NavigateBlocks {

	boolean isBaseBlock = false;

	synchronized void navigateBaseBlocks(int baseBlockHeight) throws InterruptedException {

		if (isBaseBlock) {

			wait();
			
		}

		System.out.println("Hey Pilot, Alert !! The coming obstacle is blocks placed at base, which is "
				+ baseBlockHeight + "m above from ground ");

		isBaseBlock = true;
		Thread.sleep(2000);
		notify();
	}

	synchronized void navigateTopBlocks(int topBlockHeight) throws InterruptedException {

		if (!isBaseBlock) {
			wait();
		}

		System.out.println("Hey Pilot, Alert !! The coming obstacle is block suspended from top, which is "
				+ topBlockHeight + "m below from Roof ");

		isBaseBlock = false;
		Thread.sleep(2000);
		notify();

	}

}
