package wb0;

import b3.w;
import xk2.d0;
import xk2.e0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f128988a;

    /* renamed from: b, reason: collision with root package name */
    public final long f128989b;

    public g(float f13, long j13) {
        this.f128988a = f13;
        this.f128989b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return n4.e.a(this.f128988a, gVar.f128988a) && w.c(this.f128989b, gVar.f128989b);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f128988a) * 31;
        int i13 = w.f21391o;
        d0 d0Var = e0.f135207b;
        return Long.hashCode(this.f128989b) + hashCode;
    }

    public final String toString() {
        return a.a.m("ActionButtonIconStyle(size=", n4.e.b(this.f128988a), ", color=", w.i(this.f128989b), ")");
    }
}
