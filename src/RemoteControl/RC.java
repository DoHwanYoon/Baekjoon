package RemoteControl;

import java.util.*;

public class RC {
	private int volume;
	private int Channel;
	private String Power;
	Scanner scan = new Scanner(System.in);

	public RC() {
		volume = 0;
		Channel = 1;
		Power = "OFF";
	}
	void Status(int x) {
		System.out.print(x);
	}
	void Status(String x) {
		System.out.print(x);
	}
}
