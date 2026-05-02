package com.example.lab;

import java.io.IOException;
import java.sql.SQLException;
import java.util.StringJoiner;
import java.util.concurrent.TimeoutException;

public final class JavadocGenerationStress {

    private static final int MAX_SINGLE_SEGMENT_CHARS = 4096;

    private JavadocGenerationStress() {
    }

    public static void invokeForDocumentationStress(
            String p01, String p02, String p03, String p04, String p05, String p06,
            String p07, String p08, String p09, String p10, String p11, String p12,
            String p13, String p14, String p15, String p16, String p17, String p18,
            String p19, String p20, String p21, String p22, String p23, String p24,
            String p25, String p26, String p27, String p28, String p29, String p30,
            String p31, String p32, String p33, String p34, String p35, String p36
    ) throws IOException, SQLException, ClassNotFoundException, InterruptedException, TimeoutException {
        String[] segments = {
                p01, p02, p03, p04, p05, p06, p07, p08, p09, p10, p11, p12,
                p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24,
                p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36
        };

        StringJoiner joiner = new StringJoiner("|");
        int rolling = 0;
        for (int i = 0; i < segments.length; i++) {
            String segment = segments[i];
            if (segment == null) {
                throw new IOException("segment " + i);
            }
            if ("TIMEOUT".equals(segment)) {
                throw new TimeoutException("TIMEOUT at " + i);
            }
            if (segment.length() > MAX_SINGLE_SEGMENT_CHARS) {
                throw new IOException("too long p" + i);
            }
            if ("SQL_FAIL".equals(segment)) {
                throw new SQLException("SQL_FAIL at " + i);
            }
            joiner.add(segment);
            rolling = 31 * rolling + segment.hashCode();
        }

        String payload = joiner.toString();
        if (payload.isEmpty()) {
            throw new IOException("empty payload");
        }

        String fqcnProbe = p36.trim();
        if (!fqcnProbe.isEmpty()) {
            Class.forName(fqcnProbe);
        }

        if (rolling == 0 && payload.length() > 10_000_000) {
            throw new TimeoutException("too large");
        }

        Thread.sleep(0);
    }
}
