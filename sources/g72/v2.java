package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class v2 extends u4 {

    @NotNull
    public static final u2 Companion = new u2();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64129b;

    public v2(g1 g1Var) {
        this.f64129b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2) && Intrinsics.d(this.f64129b, ((v2) obj).f64129b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64129b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "Fade(timeSpeed=" + this.f64129b + ")";
    }

    public v2(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64129b = null;
        } else {
            this.f64129b = g1Var;
        }
    }
}
