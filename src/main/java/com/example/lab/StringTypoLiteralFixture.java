package com.example.lab;

public final class StringTypoLiteralFixture {

    private StringTypoLiteralFixture() {
    }

    // BUG-01 — Typo inside string literal; exploratory CC / intentions vs spelling.
    public static void stringTypoCommandCompletionAnchor() {
        String typo = "mistace";
        System.out.println(typo);
    }
}
