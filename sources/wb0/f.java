package wb0;

import b3.w;
import xk2.d0;
import xk2.e0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f128985a;

    /* renamed from: b, reason: collision with root package name */
    public final long f128986b;

    /* renamed from: c, reason: collision with root package name */
    public final float f128987c;

    public f(float f13, long j13, float f14) {
        this.f128985a = f13;
        this.f128986b = j13;
        this.f128987c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return n4.e.a(this.f128985a, fVar.f128985a) && w.c(this.f128986b, fVar.f128986b) && n4.e.a(this.f128987c, fVar.f128987c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f128985a) * 31;
        int i13 = w.f21391o;
        d0 d0Var = e0.f135207b;
        return Float.hashCode(this.f128987c) + a.a.c(this.f128986b, hashCode, 31);
    }

    public final String toString() {
        String b13 = n4.e.b(this.f128985a);
        String i13 = w.i(this.f128986b);
        return a.a.p(a.a.w("ActionButtonIconBackgroundStyle(size=", b13, ", color=", i13, ", cornerRadius="), n4.e.b(this.f128987c), ")");
    }
}
