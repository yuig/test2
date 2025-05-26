package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class s1 extends v1 {

    @NotNull
    public static final r1 Companion = new r1();

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f64097e = {0.5f, 0.5f};

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64098b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f64099c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f64100d;

    public s1(g1 g1Var, g1 g1Var2, o0 o0Var) {
        this.f64098b = g1Var;
        this.f64099c = g1Var2;
        this.f64100d = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Intrinsics.d(this.f64098b, s1Var.f64098b) && Intrinsics.d(this.f64099c, s1Var.f64099c) && Intrinsics.d(this.f64100d, s1Var.f64100d);
    }

    public final int hashCode() {
        g1 g1Var = this.f64098b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        g1 g1Var2 = this.f64099c;
        int hashCode2 = (hashCode + (g1Var2 == null ? 0 : g1Var2.hashCode())) * 31;
        o0 o0Var = this.f64100d;
        return hashCode2 + (o0Var != null ? o0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Shadow(alpha=" + this.f64098b + ", width=" + this.f64099c + ", direction=" + this.f64100d + ")";
    }

    public s1(int i13, g1 g1Var, g1 g1Var2, o0 o0Var) {
        if ((i13 & 1) == 0) {
            this.f64098b = null;
        } else {
            this.f64098b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f64099c = null;
        } else {
            this.f64099c = g1Var2;
        }
        if ((i13 & 4) == 0) {
            this.f64100d = null;
        } else {
            this.f64100d = o0Var;
        }
    }
}
