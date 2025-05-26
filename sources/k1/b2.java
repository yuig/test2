package k1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f77823a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.x0 f77824b;

    public b2() {
        long d2 = androidx.compose.ui.graphics.a.d(4284900966L);
        p1.y0 b13 = androidx.compose.foundation.layout.b.b(0.0f, 3);
        this.f77823a = d2;
        this.f77824b = b13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(b2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        b2 b2Var = (b2) obj;
        return b3.w.c(this.f77823a, b2Var.f77823a) && Intrinsics.d(this.f77824b, b2Var.f77824b);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return this.f77824b.hashCode() + (Long.hashCode(this.f77823a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OverscrollConfiguration(glowColor=");
        jq.b.t(this.f77823a, sb3, ", drawPadding=");
        sb3.append(this.f77824b);
        sb3.append(')');
        return sb3.toString();
    }
}
