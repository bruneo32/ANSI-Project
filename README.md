# The ANSI-Project
Make quick ANSI formats to beautify terminal output

`C/C++` `C#` `Java` `Python`

`Version: 1.0`


***WebPage: [bruneo32.github.io/ANSI-Project](https://bruneo32.github.io/ANSI-Project)***

***Doc Generated with: [Doxygen](https://www.doxygen.nl/index.html)*** (Except for *Java*)


[![logo](resources/logo.png)](https://bruneo32.github.io/ANSI-Project)
[![doxygen](resources/doxygen.png)](https://www.doxygen.nl/index.html)


## Outputs
ANSI interpretation depends on terminal support, so somethings may be different between terminals

![output](resources/exoutput.png)
![output](resources/exoutput2.png)
![output](resources/exoutput3.png)


### Windows 10
Starting with Windows 10, the console supports ANSI escape sequences, but only if the console is configured to NOT "use legacy console", and the program writing to the console must configure its output to interpret the sequences.

You can execute this command and restart the **cmd** to fix it
```
REG ADD HKCU\CONSOLE /f /v VirtualTerminalLevel /t REG_DWORD /d 1 >nul
```
