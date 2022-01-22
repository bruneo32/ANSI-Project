# The ANSI-Project for *Java*
Make quick ANSI formats to beautify terminal output

***WebPage: [bruneo32.github.io/ANSI-Project](https://bruneo32.github.io/ANSI-Project)***


# Installation
1. Download [ansi.jar](https://github.com/bruneo32/ANSI-Project/blob/main/Java/ansi.jar) and include it in your project folder
2. Add `ansi.jar` to buildpath
3. Import `ansi.ANSI` in your desired Class:
```java
import ansi.ANSI;
```

## Considerations
Your IDE console may not display ANSI characters. Known in *Eclipse IDE* you need to download a [plugin](https://marketplace.eclipse.org/content/ansi-escape-console) from MarketPlace.
Don't know for NetBeans or any other.

# Documentation
Check out the [**documentation** of the ANSI-Project for ***Java***](https://github.com/bruneo32/ANSI-Project/blob/main/Java/EclipseWorkspace/ANSI/doc/index.html)

# Quick Example
```java
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
```
