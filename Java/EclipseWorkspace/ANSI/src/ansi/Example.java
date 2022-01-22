package ansi;

public class Example {

	public static void main(String[] args) {

		System.out.println(		"Normal "	+
				ANSI.BOLD+		"BOLD "		+ANSI.RESET+
				ANSI.ITALIC+	"italic "	+ANSI.RESET+
				ANSI.UNDER+		"UnderLine"	+ANSI.RESET+" "+
				ANSI.HIDE+		"Hide "		+ANSI.RESET+
				ANSI.STRIKE+	"Strike"	+ANSI.RESET+"\n"
				);

		for (int i = 0; i < 256/4; i++) {
			System.out.print(ANSI.BK_RGB(i*4, i*4, i*4) + " ");
		}
		System.out.println(ANSI.RESET);

		for (int i = 0; i < 256/4; i++) {
			System.out.print(ANSI.BK_RGB(i*4, 0, 0) + " ");
		}
		System.out.println(ANSI.RESET);

		for (int i = 0; i < 256/4; i++) {
			System.out.print(ANSI.BK_RGB(0, i*4, 0) + " ");
		}
		System.out.println(ANSI.RESET);

		for (int i = 0; i < 256/4; i++) {
			System.out.print(ANSI.BK_RGB(0, 0, i*4) + " ");
		}


		System.out.println(ANSI.RESET); // Always RESET at end

	}
}
