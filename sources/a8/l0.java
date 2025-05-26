package a8;

import androidx.media3.common.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: c */
    public static final l0 f1392c = new l0(0, -9223372036854775807L);

    /* renamed from: d */
    public static final Pattern f1393d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a */
    public final long f1394a;

    /* renamed from: b */
    public final long f1395b;

    public l0(long j13, long j14) {
        this.f1394a = j13;
        this.f1395b = j14;
    }

    public static l0 a(String str) {
        long parseFloat;
        Matcher matcher = f1393d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = j0.f1371a;
        if (!matches) {
            throw ParserException.b(str, null);
        }
        String group = matcher.group(1);
        if (group == null) {
            throw ParserException.b(str, null);
        }
        int i13 = d7.n0.f53866a;
        long parseFloat2 = group.equals("now") ? 0L : (long) (Float.parseFloat(group) * 1000.0f);
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = (long) (Float.parseFloat(group2) * 1000.0f);
                if (parseFloat < parseFloat2) {
                    throw ParserException.b(str, null);
                }
            } catch (NumberFormatException e13) {
                throw ParserException.b(group2, e13);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new l0(parseFloat2, parseFloat);
    }
}
