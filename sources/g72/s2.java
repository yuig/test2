package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class s2 extends u4 {

    @NotNull
    public static final r2 Companion = new r2();

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f64101g = {0.5f, 0.5f};

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64102b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f64103c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f64104d;

    /* renamed from: e, reason: collision with root package name */
    public final x f64105e;

    /* renamed from: f, reason: collision with root package name */
    public final x f64106f;

    public s2(g1 g1Var, g1 g1Var2, o0 o0Var, x xVar, x xVar2) {
        this.f64102b = g1Var;
        this.f64103c = g1Var2;
        this.f64104d = o0Var;
        this.f64105e = xVar;
        this.f64106f = xVar2;
    }

    public final float a() {
        f1 f1Var;
        g1 g1Var = this.f64103c;
        if (g1Var == null || (f1Var = g1Var.f63989a) == null) {
            return 0.5f;
        }
        return f1Var.f63982a;
    }

    public final boolean b() {
        x xVar = this.f64106f;
        if (xVar != null) {
            return xVar.f64141c;
        }
        return true;
    }

    public final boolean c() {
        x xVar = this.f64105e;
        if (xVar != null) {
            return xVar.f64141c;
        }
        return true;
    }

    public final float d() {
        f1 f1Var;
        g1 g1Var = this.f64102b;
        if (g1Var == null || (f1Var = g1Var.f63989a) == null) {
            return 1.0f;
        }
        return f1Var.f63982a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return Intrinsics.d(this.f64102b, s2Var.f64102b) && Intrinsics.d(this.f64103c, s2Var.f64103c) && Intrinsics.d(this.f64104d, s2Var.f64104d) && Intrinsics.d(this.f64105e, s2Var.f64105e) && Intrinsics.d(this.f64106f, s2Var.f64106f);
    }

    public final int hashCode() {
        g1 g1Var = this.f64102b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        g1 g1Var2 = this.f64103c;
        int hashCode2 = (hashCode + (g1Var2 == null ? 0 : g1Var2.hashCode())) * 31;
        o0 o0Var = this.f64104d;
        int hashCode3 = (hashCode2 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        x xVar = this.f64105e;
        int hashCode4 = (hashCode3 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        x xVar2 = this.f64106f;
        return hashCode4 + (xVar2 != null ? xVar2.hashCode() : 0);
    }

    public final String toString() {
        return "EchoNew(timeSpeed=" + this.f64102b + ", intensity=" + this.f64103c + ", center=" + this.f64104d + ", timeDirection=" + this.f64105e + ", linearity=" + this.f64106f + ")";
    }

    public s2(int i13, g1 g1Var, g1 g1Var2, o0 o0Var, x xVar, x xVar2) {
        if ((i13 & 1) == 0) {
            this.f64102b = null;
        } else {
            this.f64102b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f64103c = null;
        } else {
            this.f64103c = g1Var2;
        }
        if ((i13 & 4) == 0) {
            this.f64104d = null;
        } else {
            this.f64104d = o0Var;
        }
        if ((i13 & 8) == 0) {
            this.f64105e = null;
        } else {
            this.f64105e = xVar;
        }
        if ((i13 & 16) == 0) {
            this.f64106f = null;
        } else {
            this.f64106f = xVar2;
        }
    }
}
