package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class q4 extends u4 {

    @NotNull
    public static final p4 Companion = new p4();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64087b;

    public q4(g1 g1Var) {
        this.f64087b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4) && Intrinsics.d(this.f64087b, ((q4) obj).f64087b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64087b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "Watery(timeSpeed=" + this.f64087b + ")";
    }

    public q4(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64087b = null;
        } else {
            this.f64087b = g1Var;
        }
    }
}
