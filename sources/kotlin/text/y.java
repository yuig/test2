package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class y extends x {
    public static Double d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (q.f80505b.e(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (q.f80505b.e(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
