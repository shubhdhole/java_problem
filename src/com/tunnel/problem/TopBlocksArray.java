package com.tunnel.problem;

import java.util.Arrays;
import java.util.Random;

public class TopBlocksArray extends Thread {

	NavigateBlocks blocks;

	public TopBlocksArray(NavigateBlocks blocks) {
		this.blocks = blocks;
	}

	public static int[] secondHeightArray() {

		Random rand = new Random();
		int num;
		int arr[] = new int[5];
		for (int j = 0; j <= 4; j++) {
			num = 1 + rand.nextInt(15);
			arr[j] = num;
		}

		System.out
				.println("Second Array of Random height(Meter) of blocks suspended from top = " + Arrays.toString(arr));

		return arr;
	}

	@Override
	public void run() {

		int[] secondHeightArray = secondHeightArray();

		for (int i : secondHeightArray) {
			try {
				blocks.navigateTopBlocks(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}