package i1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f70901a;

    /* renamed from: b, reason: collision with root package name */
    public final long f70902b;

    /* renamed from: c, reason: collision with root package name */
    public final j1.h0 f70903c;

    public t1(float f13, long j13, j1.h0 h0Var) {
        this.f70901a = f13;
        this.f70902b = j13;
        this.f70903c = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return Float.compare(this.f70901a, t1Var.f70901a) == 0 && b3.b1.a(this.f70902b, t1Var.f70902b) && Intrinsics.d(this.f70903c, t1Var.f70903c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f70901a) * 31;
        int i13 = b3.b1.f21305c;
        return this.f70903c.hashCode() + a.a.c(this.f70902b, hashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f70901a + ", transformOrigin=" + ((Object) b3.b1.d(this.f70902b)) + ", animationSpec=" + this.f70903c + ')';
    }
}
