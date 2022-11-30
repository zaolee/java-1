package com.kh.practice.p9;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			// 작성 위치
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			interrupt();
		}
	}

}
