package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
@xk2.d
/* loaded from: classes4.dex */
public final class n4 extends u4 {

    @NotNull
    public static final m4 Companion = new m4();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64060b;

    public n4(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64060b = null;
        } else {
            this.f64060b = g1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4) && Intrinsics.d(this.f64060b, ((n4) obj).f64060b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64060b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "UpDown(timeSpeed=" + this.f64060b + ")";
    }
}
