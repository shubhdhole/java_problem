package com.tunnel.problem;

public class Tunnel {

	// we are considering 1 unit = 20 m

	public static void main(String[] args) {

		NavigateBlocks navigateBlocks = new NavigateBlocks();

		BaseBlocksArray baseBlocksArray = new BaseBlocksArray(navigateBlocks);

		TopBlocksArray topBlocksArray = new TopBlocksArray(navigateBlocks);

		baseBlocksArray.start();
		
		topBlocksArray.start();

	}

}
