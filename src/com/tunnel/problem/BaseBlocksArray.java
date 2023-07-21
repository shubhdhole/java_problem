package com.tunnel.problem;

import java.util.Arrays;
import java.util.Random;

public class BaseBlocksArray extends Thread {

	NavigateBlocks blocks;

	public BaseBlocksArray(NavigateBlocks blocks) {
		this.blocks = blocks;
	}

	public static int[] firstHeightArray() {

		Random rand = new Random();
		int num;
		int arr[] = new int[5];
		for (int j = 0; j <= 4; j++) {
			num = 1 + rand.nextInt(15);
			arr[j] = num;
		}
		System.out.println("First array of Random height(Meter) of blocks placed at base = " + Arrays.toString(arr));
		return arr;
	}

	@Override
	public void run() {

		int[] firstHeightArray = firstHeightArray();

		for (int i : firstHeightArray) {
			try {
				blocks.navigateBaseBlocks(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
