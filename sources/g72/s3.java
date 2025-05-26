package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class s3 extends u4 {

    @NotNull
    public static final r3 Companion = new r3();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64107b;

    public s3(g1 g1Var) {
        this.f64107b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3) && Intrinsics.d(this.f64107b, ((s3) obj).f64107b);
    }

    public final int hashCode() {
        g1 g1Var = this.f64107b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "Scaly(timeSpeed=" + this.f64107b + ")";
    }

    public s3(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f64107b = null;
        } else {
            this.f64107b = g1Var;
        }
    }
}
