package main.java;

import main.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Compiler {
    public static void main(String[] args) throws Exception {
        // Source code to parse
        String sourceCode = "int a = 5;";

        // Create a CharStream
        CharStream input = CharStreams.fromString(sourceCode);

        // Pass through the lexer
        BadakLangLexer lexer = new BadakLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass tokens to the parser
        BadakLangParser parser = new BadakLangParser(tokens);
        ParseTree tree = parser.program();

        // Print the parse tree
        System.out.println(tree.toStringTree(parser));
    }
}

