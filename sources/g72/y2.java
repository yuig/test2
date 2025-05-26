package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class y2 extends u4 {

    @NotNull
    public static final x2 Companion = new x2();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64158b;

    public y2(g1 g1Var) {
        this.f64158b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2) && Intrinsics.d(this.f64158b, ((y2) obj).f64158b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64158b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "Floaty(timeSpeed=" + this.f64158b + ")";
    }

    public y2(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64158b = null;
        } else {
            this.f64158b = g1Var;
        }
    }
}
