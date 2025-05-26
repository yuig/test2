package u9;

import androidx.media3.common.ParserException;
import d7.d0;
import d7.n0;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f121166a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(d0 d0Var) {
        d0Var.getClass();
        String l13 = d0Var.l(StandardCharsets.UTF_8);
        return l13 != null && l13.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i13 = n0.f53866a;
        String[] split = str.split("\\.", 2);
        long j13 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j13 = (j13 * 60) + Long.parseLong(str2);
        }
        long j14 = j13 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j14 += Long.parseLong(trim);
        }
        return j14 * 1000;
    }

    public static void d(d0 d0Var) {
        int i13 = d0Var.f53807b;
        if (a(d0Var)) {
            return;
        }
        d0Var.K(i13);
        throw ParserException.a("Expected WEBVTT. Got " + d0Var.l(StandardCharsets.UTF_8), null);
    }
}
