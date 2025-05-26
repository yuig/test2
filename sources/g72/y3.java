package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class y3 extends u4 {

    @NotNull
    public static final x3 Companion = new x3();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64159b;

    /* renamed from: c, reason: collision with root package name */
    public final x f64160c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f64161d;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f64162e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f64163f;

    /* renamed from: g, reason: collision with root package name */
    public final g1 f64164g;

    public y3(g1 g1Var, x xVar, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5) {
        this.f64159b = g1Var;
        this.f64160c = xVar;
        this.f64161d = g1Var2;
        this.f64162e = g1Var3;
        this.f64163f = g1Var4;
        this.f64164g = g1Var5;
    }

    public final float a() {
        g1 g1Var = this.f64164g;
        if (g1Var != null) {
            return g1Var.f63991c;
        }
        return 0.0f;
    }

    public final float b() {
        g1 g1Var = this.f64163f;
        if (g1Var != null) {
            return g1Var.f63991c;
        }
        return 0.5f;
    }

    public final float c() {
        g1 g1Var = this.f64161d;
        if (g1Var != null) {
            return g1Var.f63991c;
        }
        return 0.0425f;
    }

    public final float d() {
        g1 g1Var = this.f64162e;
        if (g1Var != null) {
            return g1Var.f63991c;
        }
        return 0.05f;
    }

    public final boolean e() {
        x xVar = this.f64160c;
        if (xVar != null) {
            return xVar.f64141c;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return Intrinsics.d(this.f64159b, y3Var.f64159b) && Intrinsics.d(this.f64160c, y3Var.f64160c) && Intrinsics.d(this.f64161d, y3Var.f64161d) && Intrinsics.d(this.f64162e, y3Var.f64162e) && Intrinsics.d(this.f64163f, y3Var.f64163f) && Intrinsics.d(this.f64164g, y3Var.f64164g);
    }

    public final float f() {
        g1 g1Var = this.f64159b;
        if (g1Var != null) {
            return g1Var.f63991c;
        }
        return 1.0f;
    }

    public final int hashCode() {
        g1 g1Var = this.f64159b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        x xVar = this.f64160c;
        int hashCode2 = (hashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        g1 g1Var2 = this.f64161d;
        int hashCode3 = (hashCode2 + (g1Var2 == null ? 0 : g1Var2.hashCode())) * 31;
        g1 g1Var3 = this.f64162e;
        int hashCode4 = (hashCode3 + (g1Var3 == null ? 0 : g1Var3.hashCode())) * 31;
        g1 g1Var4 = this.f64163f;
        int hashCode5 = (hashCode4 + (g1Var4 == null ? 0 : g1Var4.hashCode())) * 31;
        g1 g1Var5 = this.f64164g;
        return hashCode5 + (g1Var5 != null ? g1Var5.hashCode() : 0);
    }

    public final String toString() {
        return "SimpleGlitch(timeSpeed=" + this.f64159b + ", glitch_signal=" + this.f64160c + ", glitch_dist_2=" + this.f64161d + ", glitch_lines=" + this.f64162e + ", glitch_aberration_radial=" + this.f64163f + ", drop_scale=" + this.f64164g + ")";
    }

    public y3(int i13, g1 g1Var, x xVar, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5) {
        if ((i13 & 1) == 0) {
            this.f64159b = null;
        } else {
            this.f64159b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f64160c = null;
        } else {
            this.f64160c = xVar;
        }
        if ((i13 & 4) == 0) {
            this.f64161d = null;
        } else {
            this.f64161d = g1Var2;
        }
        if ((i13 & 8) == 0) {
            this.f64162e = null;
        } else {
            this.f64162e = g1Var3;
        }
        if ((i13 & 16) == 0) {
            this.f64163f = null;
        } else {
            this.f64163f = g1Var4;
        }
        if ((i13 & 32) == 0) {
            this.f64164g = null;
        } else {
            this.f64164g = g1Var5;
        }
    }
}
