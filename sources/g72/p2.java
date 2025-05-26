package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
@xk2.d
/* loaded from: classes4.dex */
public final class p2 extends u4 {

    @NotNull
    public static final o2 Companion = new o2();

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f64073g = {0.5f, 0.5f};

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f64074h = {0.5f, 0.5f};

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64075b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f64076c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f64077d;

    /* renamed from: e, reason: collision with root package name */
    public final x f64078e;

    /* renamed from: f, reason: collision with root package name */
    public final x f64079f;

    public p2(int i13, g1 g1Var, o0 o0Var, o0 o0Var2, x xVar, x xVar2) {
        if ((i13 & 1) == 0) {
            this.f64075b = null;
        } else {
            this.f64075b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f64076c = null;
        } else {
            this.f64076c = o0Var;
        }
        if ((i13 & 4) == 0) {
            this.f64077d = null;
        } else {
            this.f64077d = o0Var2;
        }
        if ((i13 & 8) == 0) {
            this.f64078e = null;
        } else {
            this.f64078e = xVar;
        }
        if ((i13 & 16) == 0) {
            this.f64079f = null;
        } else {
            this.f64079f = xVar2;
        }
    }

    public final boolean a() {
        x xVar = this.f64079f;
        if (xVar != null) {
            return xVar.f64141c;
        }
        return true;
    }

    public final boolean b() {
        x xVar = this.f64078e;
        if (xVar != null) {
            return xVar.f64141c;
        }
        return true;
    }

    public final float c() {
        f1 f1Var;
        g1 g1Var = this.f64075b;
        if (g1Var == null || (f1Var = g1Var.f63989a) == null) {
            return 1.0f;
        }
        return f1Var.f63982a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return Intrinsics.d(this.f64075b, p2Var.f64075b) && Intrinsics.d(this.f64076c, p2Var.f64076c) && Intrinsics.d(this.f64077d, p2Var.f64077d) && Intrinsics.d(this.f64078e, p2Var.f64078e) && Intrinsics.d(this.f64079f, p2Var.f64079f);
    }

    public final int hashCode() {
        g1 g1Var = this.f64075b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        o0 o0Var = this.f64076c;
        int hashCode2 = (hashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        o0 o0Var2 = this.f64077d;
        int hashCode3 = (hashCode2 + (o0Var2 == null ? 0 : o0Var2.hashCode())) * 31;
        x xVar = this.f64078e;
        int hashCode4 = (hashCode3 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        x xVar2 = this.f64079f;
        return hashCode4 + (xVar2 != null ? xVar2.hashCode() : 0);
    }

    public final String toString() {
        return "Echo(timeSpeed=" + this.f64075b + ", distortion=" + this.f64076c + ", center=" + this.f64077d + ", timeDirection=" + this.f64078e + ", linearity=" + this.f64079f + ")";
    }
}
