package el;

import java.io.IOException;
import java.io.StringReader;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final h f59495a = new h(0);

    public static boolean a(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 != length) {
            char charAt = str.charAt(i13);
            int i14 = i13 + 1;
            if (!Character.isSurrogate(charAt)) {
                i13 = i14;
            } else {
                if (Character.isLowSurrogate(charAt) || i14 == length || !Character.isLowSurrogate(str.charAt(i14))) {
                    return false;
                }
                i13 += 2;
            }
        }
        return true;
    }

    public static nm.s b(String str) {
        try {
            um.a aVar = new um.a(new StringReader(str));
            aVar.O(nm.b0.LEGACY_STRICT);
            return f59495a.c(aVar);
        } catch (NumberFormatException e13) {
            throw new IOException(e13);
        }
    }
}
