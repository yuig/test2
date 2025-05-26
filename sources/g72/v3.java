package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class v3 extends u4 {

    @NotNull
    public static final u3 Companion = new u3();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64130b;

    public v3(g1 g1Var) {
        this.f64130b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3) && Intrinsics.d(this.f64130b, ((v3) obj).f64130b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64130b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "Shaky(timeSpeed=" + this.f64130b + ")";
    }

    public v3(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64130b = null;
        } else {
            this.f64130b = g1Var;
        }
    }
}
