package u10;

import kotlin.Pair;
import kotlin.collections.d1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.j;
import kotlin.text.z;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Regex f119989a = new Regex("(\\d+\\.?\\d*)(?:/| *of *| *out of *)(\\d+\\.?\\d*)");

    /* renamed from: b, reason: collision with root package name */
    public static final Regex f119990b = new Regex("(\\d{1,3})(?:%)");

    public static final Pair a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean d2 = Intrinsics.d(value, "Not yet rated");
        Float valueOf = Float.valueOf(0.0f);
        if (!d2) {
            String upperCase = value.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (!Intrinsics.d(upperCase, "NAN") && !Intrinsics.d(value, "false") && !Intrinsics.d(value, "-1") && !Intrinsics.d(value, "{$recipe->avg_vote}")) {
                float b13 = b(value);
                if (b13 != -1.0f) {
                    return new Pair(Boolean.TRUE, Float.valueOf(b13));
                }
                float b14 = b(z.n(z.n(value, ",", "."), ">", ""));
                if (b14 != b13) {
                    return new Pair(Boolean.TRUE, Float.valueOf(b14));
                }
                float b15 = b(StringsKt.i0(z.n(value, "stars", "")).toString());
                if (b15 != b13) {
                    return new Pair(Boolean.TRUE, Float.valueOf(b15));
                }
                j b16 = f119989a.b(0, value);
                if (b16 != null && b16.f80495c.b() == 3) {
                    String str = (String) ((d1) b16.b()).get(1);
                    String str2 = (String) ((d1) b16.b()).get(2);
                    float b17 = b(str);
                    float b18 = b(str2);
                    if (b17 != -1.0f && b18 != -1.0f) {
                        return new Pair(Boolean.TRUE, Float.valueOf((b17 / b18) * 5.0f));
                    }
                }
                j d13 = f119990b.d(value);
                if (d13 != null && d13.f80495c.b() == 2) {
                    float b19 = b((String) ((d1) d13.b()).get(1));
                    if (b19 != -1.0f && b19 <= 100.0f) {
                        return new Pair(Boolean.TRUE, Float.valueOf((b19 / 100.0f) * 5.0f));
                    }
                }
                return new Pair(Boolean.FALSE, valueOf);
            }
        }
        return new Pair(Boolean.TRUE, valueOf);
    }

    public static final float b(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return -1.0f;
        }
    }
}
