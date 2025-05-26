package i1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f70870a;

    /* renamed from: b, reason: collision with root package name */
    public final j1.h0 f70871b;

    public p1(float f13, j1.h0 h0Var) {
        this.f70870a = f13;
        this.f70871b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Float.compare(this.f70870a, p1Var.f70870a) == 0 && Intrinsics.d(this.f70871b, p1Var.f70871b);
    }

    public final int hashCode() {
        return this.f70871b.hashCode() + (Float.hashCode(this.f70870a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f70870a + ", animationSpec=" + this.f70871b + ')';
    }
}
