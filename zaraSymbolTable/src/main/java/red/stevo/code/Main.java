package red.stevo.code;

public class Main {
    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable();

        symbolTable.addSymbol("globalVar", 100, "int", "global");


        symbolTable.enterNewScope("class");
        symbolTable.addSymbol("classVar", 42, "int", "local");


        symbolTable.enterNewScope("function");
        symbolTable.addSymbol("funcVar", "hello", "String", "local");
        symbolTable.addSymbol("funcVar2", 10.9, "Float", "local");


        symbolTable.enterNewScope("block");
        symbolTable.addSymbol("blockVar", true, "boolean", "local");

        symbolTable.existScope();
        symbolTable.existScope();

        symbolTable.enterNewScope("class");
        symbolTable.addSymbol("nestedClass", 42, "int", "local");

        //System.out.println(symbolTable.getSymbol("funcVar"));

       symbolTable.viewCurrentStackScopes();
    }
}