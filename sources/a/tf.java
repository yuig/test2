package a;

import ads_mobile_sdk.d21;
import ads_mobile_sdk.e21;
import ads_mobile_sdk.jo;
import ads_mobile_sdk.yv2;

/* loaded from: classes2.dex */
public abstract class tf {
    public static boolean c(int i13, q3 q3Var, Object obj) {
        jo joVar = (jo) q3Var;
        int i14 = joVar.f6899b;
        int i15 = i14 >>> 3;
        int i16 = i14 & 7;
        if (i16 == 0) {
            joVar.b(0);
            ((yv2) obj).a(i15 << 3, Long.valueOf(joVar.f6898a.k()));
            return true;
        }
        if (i16 == 1) {
            joVar.b(1);
            ((yv2) obj).a((i15 << 3) | 1, Long.valueOf(joVar.f6898a.h()));
            return true;
        }
        if (i16 == 2) {
            joVar.b(2);
            ((yv2) obj).a((i15 << 3) | 2, joVar.f6898a.d());
            return true;
        }
        if (i16 != 3) {
            if (i16 == 4) {
                if (i13 != 0) {
                    return false;
                }
                throw new e21("Protocol message end-group tag did not match expected tag.");
            }
            if (i16 != 5) {
                int i17 = e21.f4580b;
                throw new d21();
            }
            joVar.b(5);
            ((yv2) obj).a(5 | (i15 << 3), Integer.valueOf(joVar.f6898a.g()));
            return true;
        }
        yv2 b13 = yv2.b();
        int i18 = i15 << 3;
        int i19 = i18 | 4;
        int i23 = i13 + 1;
        if (i23 >= 100) {
            throw new e21("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (joVar.a() != Integer.MAX_VALUE && c(i23, joVar, b13)) {
        }
        if (i19 != joVar.f6899b) {
            throw new e21("Protocol message end-group tag did not match expected tag.");
        }
        if (b13.f14428e) {
            b13.f14428e = false;
        }
        ((yv2) obj).a(i18 | 3, b13);
        return true;
    }

    public abstract yv2 a(Object obj);

    public abstract void b(Object obj, Object obj2);

    public abstract void d(Object obj);
}
