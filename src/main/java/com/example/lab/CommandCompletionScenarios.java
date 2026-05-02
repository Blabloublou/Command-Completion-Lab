package com.example.lab;

import java.util.Date;
import java.util.List;

@SuppressWarnings("unused")
public final class CommandCompletionScenarios {

    private CommandCompletionScenarios() {
    }

    public static void dotOnVariableShowsApiPostfixAndCommands() {
        String name = "x";
        name.length();
    }

    public static void removeUnneededExpression() {
        int keep = 40 + 2;
        System.out.println(keep);
    }

    public static void blankLineFileLevelActions() {

    }

    public static void optimizeImportsRemovesUnused() {
        List<String> xs = List.of("a");
        System.out.println(xs.get(0));
    }

    public static void introduceLocalVariableFlow() {
        List.of("a", "b").size();
    }

    public static class OuterForInnerDemo {
        public void takeName(String param) {
            System.out.println(param);
        }
    }

    public static class PersonForToString {
        String first = "a";
        String last = "b";
    }

    public static final class PointForRecord {
        private final int x;
        private final int y;

        public PointForRecord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int x() {
            return x;
        }

        public int y() {
            return y;
        }
    }

    public static void navigateToStringDeclaration() {
        String s = "";
        System.out.println(s.length());
    }

    public static class RenameMePlease {
    }

    public static void extractVariableOrPostfixVar() {
        "hello".length();
    }

    public static void postfixPrintDemo() {
        int n = 1;
        n++;
    }

    public static void java25SimpleIoPlaceholder() {
    }

    public static void extractMethodFromBlock() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void methodForJavaDocCompletionDemo(int x) {
        System.out.println(x);
    }
}
