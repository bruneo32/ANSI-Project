# The ANSI-Project for *C/C++*
Make quick ANSI formats to beautify terminal output

***WebPage: [bruneo32.github.io/ANSI-Project](https://bruneo32.github.io/ANSI-Project)***


# Installation
Download [ansi.h](https://github.com/bruneo32/ANSI-Project/blob/main/C/ansi.h) and include it in your NASM program:
```c
#include "ansi.h"
```
It only contains macros, you can include it in `C++` without `extern`

# Documentation
Check out the [**documentation** of the ANSI-Project for ***C/C++***](https://bruneo32.github.io/ANSI-Project/doc/c/index.html)

# Quick Example
In ***C***
```c
#include <stdio.h>
#include "ansi.h"

int main(int argc, char *argv[]){

	printf(	"Normal "
			ANSI_BOLD		"BOLD "			ANSI_RESET
			ANSI_ITALIC		"italic "		ANSI_RESET
			ANSI_UNDER		"UnderLine"		ANSI_RESET " "
			ANSI_HIDE		"Hide "			ANSI_RESET
			ANSI_STRIKE		"Strike"		ANSI_RESET
			"\n\n"
		);

	for (int i=0; i < 256/4; i++) {
		printf(ANSI_BK_RGB(%i, %i, %i)" ", i*4, i*4, i*4);
	}
	printf(ANSI_RESET "\n");

	for (int i=0; i < 256/4; i++) {
		printf(ANSI_BK_RGB(%i, 0, 0)" ", i*4);
	}
	printf(ANSI_RESET "\n");

	for (int i=0; i < 256/4; i++) {
		printf(ANSI_BK_RGB(0, %i, 0)" ", i*4);
	}
	printf(ANSI_RESET "\n");

	for (int i=0; i < 256/4; i++) {
		printf(ANSI_BK_RGB(0, 0, %i)" ", i*4);
	}


	printf(ANSI_RESET "\n"); // Always RESET at end
	return 0;
}

```


In ***C++***
```cpp
#include <iostream>
#include "ansi.h"

using namespace std;

int main(int argc, char *argv[]){

	cout <<	"Normal "
			ANSI_BOLD		"BOLD "			ANSI_RESET
			ANSI_ITALIC		"italic "		ANSI_RESET
			ANSI_UNDER		"UnderLine"		ANSI_RESET " "
			ANSI_HIDE		"Hide "			ANSI_RESET
			ANSI_STRIKE		"Strike"		ANSI_RESET
			"\n\n"
		<< endl;

	for (int i=0; i < 256/4; i++) {
		cout << ansi::BK_RGB(i*4, i*4, i*4) << " ";
	}
	cout << ANSI_RESET << endl;

	for (int i=0; i < 256/4; i++) {
		cout << ansi::BK_RGB(i*4, 0, 0) << " ";
	}
	cout << ANSI_RESET << endl;

	for (int i=0; i < 256/4; i++) {
		cout << ansi::BK_RGB(0, i*4, 0) << " ";
	}
	cout << ANSI_RESET << endl;

	for (int i=0; i < 256/4; i++) {
		cout << ansi::BK_RGB(0, 0, i*4) << " ";
	}


	cout << ANSI_RESET << endl; // Always RESET at end
	return 0;
}
```
