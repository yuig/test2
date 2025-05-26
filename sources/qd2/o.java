package qd2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd2.i0;
import pd2.p0;

@no2.g
/* loaded from: classes4.dex */
public final class o extends u {

    @NotNull
    public static final n Companion = new n();

    /* renamed from: c, reason: collision with root package name */
    public final int f103599c;

    /* renamed from: d, reason: collision with root package name */
    public final int f103600d;

    public o(int i13, int i14, int i15) {
        if (3 != (i13 & 3)) {
            kg.t.b1(i13, 3, m.f103598b);
            throw null;
        }
        this.f103599c = i14;
        this.f103600d = i15;
    }

    @Override // qd2.c
    public final boolean a(p0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof i0)) {
            throw new IllegalArgumentException("IntValueBounds can't accept non-int argument".toString());
        }
        int i13 = ((i0) value).f99845b;
        return this.f103599c <= i13 && i13 <= this.f103600d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f103599c == oVar.f103599c && this.f103600d == oVar.f103600d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103600d) + (Integer.hashCode(this.f103599c) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Bounds(minBound=");
        sb3.append(this.f103599c);
        sb3.append(", maxBound=");
        return cb.l(sb3, this.f103600d, ')');
    }

    public o(int i13, int i14) {
        this.f103599c = i13;
        this.f103600d = i14;
    }
}
