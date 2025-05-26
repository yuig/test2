package qh2;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f103926a = Pattern.compile("[A-Za-z0-9-._~:/\\[\\]@!$&'()*+,;=]+");

    public static Boolean a(String str) {
        if (!str.isEmpty() && str.length() <= 1024 && StandardCharsets.US_ASCII.newEncoder().canEncode(str) && str.startsWith("/") && f103926a.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
