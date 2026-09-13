package main.java;

import main.antlr.*;

public class MyVisitor extends BadakLangBaseVisitor<Integer> {
    @Override
    public Integer visitExpression(BadakLangParser.ExpressionContext ctx) {
        // Add custom evaluation logic here
        return super.visitExpression(ctx);
    }
}
