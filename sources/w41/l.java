package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f128034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128035b;

    /* renamed from: c, reason: collision with root package name */
    public final int f128036c;

    /* renamed from: d, reason: collision with root package name */
    public final int f128037d;

    /* renamed from: e, reason: collision with root package name */
    public final q f128038e;

    public l(int i13, int i14, int i15, int i16, q qVar) {
        this.f128034a = i13;
        this.f128035b = i14;
        this.f128036c = i15;
        this.f128037d = i16;
        this.f128038e = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f128034a == lVar.f128034a && this.f128035b == lVar.f128035b && this.f128036c == lVar.f128036c && this.f128037d == lVar.f128037d && Intrinsics.d(this.f128038e, lVar.f128038e);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f128037d, ep.b.b(this.f128036c, ep.b.b(this.f128035b, Integer.hashCode(this.f128034a) * 31, 31), 31), 31);
        q qVar = this.f128038e;
        return b13 + (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        return "ProfilePinsEmptyState(iconResId=" + this.f128034a + ", titleResId=" + this.f128035b + ", messageResId=" + this.f128036c + ", ctaLabelResId=" + this.f128037d + ", ctaTapEvent=" + this.f128038e + ")";
    }
}
