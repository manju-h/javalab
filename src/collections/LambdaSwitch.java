package collections;

public class LambdaSwitch {
	/*
	 * The switch expressions were added as a preview feature in Java 12. It became
	 * a standard feature in Java 14 release.
	 */
/*	private void multiSwitch12() {
		int choice = 2;

		int x = switch (choice) {
		case 1, 2, 3:
			yield choice;
		default:
			yield -1;
		};
		System.out.println("x = " + x); // x = 2
	}

	private void lambdaSwitch() {
		String day = "TH";
		String result = switch (day) {
		case "M", "W", "F" -> "MWF";
		case "T", "TH", "S" -> "TTS";
		default -> {
			if (day.isEmpty())
				yield "Please insert a valid day.";
			else
				yield "Looks like a Sunday.";
		}

		};
		System.out.println(result); // TTH

	}
	*/
}
