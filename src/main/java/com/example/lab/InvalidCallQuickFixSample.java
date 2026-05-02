package com.example.lab;

import java.nio.file.Files;
import java.nio.file.Path;

public final class InvalidCallQuickFixSample {

    private InvalidCallQuickFixSample() {
    }

    public static void unhandledIOExceptionCallSite() {
        Files.readString(Path.of("demo.txt"));
    }
}
