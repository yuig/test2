package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
@xk2.d
/* loaded from: classes4.dex */
public final class p3 extends u4 {

    @NotNull
    public static final o3 Companion = new o3();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64080b;

    public p3(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64080b = null;
        } else {
            this.f64080b = g1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3) && Intrinsics.d(this.f64080b, ((p3) obj).f64080b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64080b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "RotateCW(timeSpeed=" + this.f64080b + ")";
    }
}
