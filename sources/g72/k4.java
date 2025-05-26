package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class k4 extends u4 {

    @NotNull
    public static final j4 Companion = new j4();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64042b;

    public k4(g1 g1Var) {
        this.f64042b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4) && Intrinsics.d(this.f64042b, ((k4) obj).f64042b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64042b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "Swivel(timeSpeed=" + this.f64042b + ")";
    }

    public k4(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64042b = null;
        } else {
            this.f64042b = g1Var;
        }
    }
}
