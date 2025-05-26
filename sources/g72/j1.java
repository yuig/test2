package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class j1 extends v1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f64025d = {1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64026b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f64027c;

    public j1(g1 g1Var, a1 a1Var) {
        this.f64026b = g1Var;
        this.f64027c = a1Var;
    }

    public final float[] a() {
        float[] fArr;
        a1 a1Var = this.f64027c;
        return (a1Var == null || (fArr = a1Var.f63926b) == null) ? f64025d : fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Intrinsics.d(this.f64026b, j1Var.f64026b) && Intrinsics.d(this.f64027c, j1Var.f64027c);
    }

    public final int hashCode() {
        g1 g1Var = this.f64026b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        a1 a1Var = this.f64027c;
        return hashCode + (a1Var != null ? a1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Border(width=" + this.f64026b + ", color=" + this.f64027c + ")";
    }

    public j1(int i13, g1 g1Var, a1 a1Var) {
        if ((i13 & 1) == 0) {
            this.f64026b = null;
        } else {
            this.f64026b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f64027c = null;
        } else {
            this.f64027c = a1Var;
        }
    }
}
