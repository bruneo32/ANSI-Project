using System;
using ansi;

namespace Example
{
	class Program
	{
		static void Main(string[] args)
		{

			Console.WriteLine(	"Normal "	+
				ANSI.BOLD+		"BOLD "		+ANSI.RESET+
				ANSI.ITALIC+	"italic "	+ANSI.RESET+
				ANSI.UNDER+		"UnderLine"	+ANSI.RESET+" "+
				ANSI.HIDE+		"Hide "		+ANSI.RESET+
				ANSI.STRIKE+	"Strike"	+ANSI.RESET+"\n"
				);

			for (int i = 0; i < 256/4; i++) {
				Console.Write(ANSI.BK_RGB(i*4, i*4, i*4) + " ");
			}
			Console.WriteLine(ANSI.RESET);

			for (int i = 0; i < 256/4; i++) {
				Console.Write(ANSI.BK_RGB(i*4, 0, 0) + " ");
			}
			Console.WriteLine(ANSI.RESET);

			for (int i = 0; i < 256/4; i++) {
				Console.Write(ANSI.BK_RGB(0, i*4, 0) + " ");
			}
			Console.WriteLine(ANSI.RESET);

			for (int i = 0; i < 256/4; i++) {
				Console.Write(ANSI.BK_RGB(0, 0, i*4) + " ");
			}


			Console.WriteLine(ANSI.RESET); // Always RESET at end

		}
	}
}
