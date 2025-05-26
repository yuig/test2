package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class t4 extends u4 {

    @NotNull
    public static final s4 Companion = new s4();

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f64117e = {0.5f, 0.5f};

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64118b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f64119c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f64120d;

    public t4(g1 g1Var, g1 g1Var2, o0 o0Var) {
        this.f64118b = g1Var;
        this.f64119c = g1Var2;
        this.f64120d = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return Intrinsics.d(this.f64118b, t4Var.f64118b) && Intrinsics.d(this.f64119c, t4Var.f64119c) && Intrinsics.d(this.f64120d, t4Var.f64120d);
    }

    public final int hashCode() {
        g1 g1Var = this.f64118b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        g1 g1Var2 = this.f64119c;
        int hashCode2 = (hashCode + (g1Var2 == null ? 0 : g1Var2.hashCode())) * 31;
        o0 o0Var = this.f64120d;
        return hashCode2 + (o0Var != null ? o0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Wobbly(timeSpeed=" + this.f64118b + ", intensity=" + this.f64119c + ", direction=" + this.f64120d + ")";
    }

    public t4(int i13, g1 g1Var, g1 g1Var2, o0 o0Var) {
        if ((i13 & 1) == 0) {
            this.f64118b = null;
        } else {
            this.f64118b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f64119c = null;
        } else {
            this.f64119c = g1Var2;
        }
        if ((i13 & 4) == 0) {
            this.f64120d = null;
        } else {
            this.f64120d = o0Var;
        }
    }
}
