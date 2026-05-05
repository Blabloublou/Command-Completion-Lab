package com.example.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class InvalidCallQuickFixSample {

    private InvalidCallQuickFixSample() {
    }

    // TC-02 — Unhandled checked exception: F2 to error, use '..' vs Alt+Enter; compare fix lists (CC should be ≥ Alt+Enter options).
    public static void unhandledIOExceptionCallSite() throws IOException {
        Files.readString(Path.of("demo.txt"));
    }
}
