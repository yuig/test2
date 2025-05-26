package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
@xk2.d
/* loaded from: classes4.dex */
public final class m3 extends u4 {

    @NotNull
    public static final l3 Companion = new l3();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64052b;

    public m3(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64052b = null;
        } else {
            this.f64052b = g1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3) && Intrinsics.d(this.f64052b, ((m3) obj).f64052b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64052b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "RotateCCW(timeSpeed=" + this.f64052b + ")";
    }
}
