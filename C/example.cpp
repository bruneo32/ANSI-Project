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
