package rr1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a */
    public final int f109934a;

    /* renamed from: b */
    public final String f109935b;

    /* renamed from: c */
    public final IntRange f109936c;

    public a(int i13, String source, IntRange range) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f109934a = i13;
        this.f109935b = source;
        this.f109936c = range;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f109934a == aVar.f109934a && Intrinsics.d(this.f109935b, aVar.f109935b) && Intrinsics.d(this.f109936c, aVar.f109936c);
    }

    public final int hashCode() {
        return this.f109936c.hashCode() + cb.d(this.f109935b, Integer.hashCode(this.f109934a) * 31, 31);
    }

    public final String toString() {
        return "PasswordScore(score=" + this.f109934a + ", source=" + this.f109935b + ", range=" + this.f109936c + ")";
    }
}
