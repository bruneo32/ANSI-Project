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
