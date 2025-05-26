package m4;

import kh2.g0;
import kh2.m0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f85788b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f85789a;

    public static String a(int i13) {
        StringBuilder sb3 = new StringBuilder("LineBreak(strategy=");
        int i14 = i13 & 255;
        String str = "Invalid";
        sb3.append((Object) (g0.n(i14, 1) ? "Strategy.Simple" : g0.n(i14, 2) ? "Strategy.HighQuality" : g0.n(i14, 3) ? "Strategy.Balanced" : g0.n(i14, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb3.append(", strictness=");
        int i15 = (i13 >> 8) & 255;
        sb3.append((Object) (m0.u(i15, 1) ? "Strictness.None" : m0.u(i15, 2) ? "Strictness.Loose" : m0.u(i15, 3) ? "Strictness.Normal" : m0.u(i15, 4) ? "Strictness.Strict" : m0.u(i15, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb3.append(", wordBreak=");
        int i16 = (i13 >> 16) & 255;
        if (i16 == 1) {
            str = "WordBreak.None";
        } else if (i16 == 2) {
            str = "WordBreak.Phrase";
        } else if (i16 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb3.append((Object) str);
        sb3.append(')');
        return sb3.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f85789a == ((e) obj).f85789a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85789a);
    }

    public final String toString() {
        return a(this.f85789a);
    }
}
