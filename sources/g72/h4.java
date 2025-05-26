package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class h4 extends u4 {

    @NotNull
    public static final g4 Companion = new g4();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64004b;

    public h4(g1 g1Var) {
        this.f64004b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4) && Intrinsics.d(this.f64004b, ((h4) obj).f64004b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64004b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "Spinny(timeSpeed=" + this.f64004b + ")";
    }

    public h4(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64004b = null;
        } else {
            this.f64004b = g1Var;
        }
    }
}
