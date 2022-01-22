# The ANSI-Project for *C#*
Make quick ANSI formats to beautify terminal output

***WebPage: [bruneo32.github.io/ANSI-Project](https://bruneo32.github.io/ANSI-Project)***


# Installation
1. Download [ansi.cs](https://github.com/bruneo32/ANSI-Project/blob/main/C%23/dotnet/ANSI/ansi.cs) into your C# project folder
2. Add `using` statement
```cs
using ansi;
```

# Documentation
Check out the [**documentation** of the ANSI-Project for ***C#***](https://github.com/bruneo32/ANSI-Project/blob/main/C%23/doxygen/html/index.html)

# Quick Example
```cs
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

```
