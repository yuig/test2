package fk1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.o0;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f62357a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62358b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f62359c;

    public n(i0 literal, int i13, o0 o0Var) {
        Intrinsics.checkNotNullParameter(literal, "literal");
        this.f62357a = literal;
        this.f62358b = i13;
        this.f62359c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f62357a, nVar.f62357a) && this.f62358b == nVar.f62358b && Intrinsics.d(this.f62359c, nVar.f62359c);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f62358b, this.f62357a.hashCode() * 31, 31);
        o0 o0Var = this.f62359c;
        return b13 + (o0Var == null ? 0 : o0Var.hashCode());
    }

    public final String toString() {
        return "PromoterTextSpanAndLineCount(literal=" + this.f62357a + ", lineCount=" + this.f62358b + ", span=" + this.f62359c + ")";
    }
}
