//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
Ver.25.07.07_001
----------------------------------------------
 submit
  1. Add variable package -> Var7,8
  2. Add Variable.ex package -> VarExQuestion

----------------------------------------------
Ver.25.06.21_002
----------------------------------------------
 submit
  1. Add variable package -> Var3,4,5,6

----------------------------------------------

Ver.25.06.21_001
----------------------------------------------
 submit
  1. Add variable package -> Var1, Var2


----------------------------------------------

Ver.25.06.19_002
----------------------------------------------
 submit
  1. Add HelloJava Source
  2. Add HelloJava2 Source


----------------------------------------------

Ver.25.06.19_001
----------------------------------------------
 submit
  1. first commit java program


----------------------------------------------
*/

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}