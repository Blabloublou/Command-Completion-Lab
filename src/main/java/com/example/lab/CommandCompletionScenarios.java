package com.example.lab;

import java.util.List;

@SuppressWarnings("unused")
public final class CommandCompletionScenarios {

    private CommandCompletionScenarios() {
    }

    // TC-01 (supplement) — type '.' on an expression line for postfix / mixed list (contrast with '..' on blank line).
    public static void dotOnVariableShowsApiPostfixAndCommands() {
        String name = "x";
        name.length();
    }

    // TC-01 — blank line: '.' vs '..' triggers (mixed list vs commands-only); list filtering / search.
    // TC-03 — blank line: file-level actions (e.g. Reformat Code, Optimize Imports).
    public static void blankLineFileLevelActions() {

    }

    // TC-01 / TC-03 — use this file after editing to exercise Optimize Imports from file-level '.' / '..' flows.
    public static void optimizeImportsRemovesUnused() {
        List<String> xs = List.of("a");
        System.out.println(xs.get(0));
    }

    // TC-04 — Introduce local variable via '..' on List.of("a", "b").size()
    public static void introduceLocalVariableFlow() {
        List.of("a", "b").size();
    }

    // TC-05 — Generate toString() via CC (caret in class body, type '..').
    public static class PersonForToString {
        String first = "a";
        String last = "b";
    }

    // TC-06 — Convert class to record via CC (language level 16+).
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

    // TC-10 — Go to declaration on java.lang.String (read-only library source).
    public static void navigateToStringDeclaration() {
        String s = "";
        System.out.println(s.length());
    }

    // TC-07 — Rename: type '..' then filter with alias "change name".
    public static class RenameMePlease {
    }

    // TC-08 — Introduce local variable via '..' vs postfix .var on the expression below; compare after Ctrl+Z.
    public static void extractVariableOrPostfixVar() {
        new Person("Alice", 30);
    }

    /** Holder for TC-08 (extract variable / .var). */
    public static final class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // TC-09 — Extract method via CC (select loop + accumulation, type '..' → Extract method / introduce method).
    public static void extractMethodFromBlock() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
