package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
@xk2.d
/* loaded from: classes4.dex */
public final class b3 extends u4 {

    @NotNull
    public static final a3 Companion = new a3();

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f63934i = {0.0425f, 0.9575f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f63935j = {0.0f, 0.5f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f63936k = {0.5f, 0.6f};

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f63937l = {0.0f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    public final g1 f63938b;

    /* renamed from: c, reason: collision with root package name */
    public final x f63939c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f63940d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f63941e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f63942f;

    /* renamed from: g, reason: collision with root package name */
    public final o0 f63943g;

    /* renamed from: h, reason: collision with root package name */
    public final o0 f63944h;

    public b3(int i13, g1 g1Var, x xVar, o0 o0Var, o0 o0Var2, o0 o0Var3, o0 o0Var4, o0 o0Var5) {
        if ((i13 & 1) == 0) {
            this.f63938b = null;
        } else {
            this.f63938b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f63939c = null;
        } else {
            this.f63939c = xVar;
        }
        if ((i13 & 4) == 0) {
            this.f63940d = null;
        } else {
            this.f63940d = o0Var;
        }
        if ((i13 & 8) == 0) {
            this.f63941e = null;
        } else {
            this.f63941e = o0Var2;
        }
        if ((i13 & 16) == 0) {
            this.f63942f = null;
        } else {
            this.f63942f = o0Var3;
        }
        if ((i13 & 32) == 0) {
            this.f63943g = null;
        } else {
            this.f63943g = o0Var4;
        }
        if ((i13 & 64) == 0) {
            this.f63944h = null;
        } else {
            this.f63944h = o0Var5;
        }
    }

    public final boolean a() {
        x xVar = this.f63939c;
        if (xVar != null) {
            return xVar.f64141c;
        }
        return false;
    }

    public final float b() {
        g1 g1Var = this.f63938b;
        if (g1Var != null) {
            return g1Var.f63991c;
        }
        return 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return Intrinsics.d(this.f63938b, b3Var.f63938b) && Intrinsics.d(this.f63939c, b3Var.f63939c) && Intrinsics.d(this.f63940d, b3Var.f63940d) && Intrinsics.d(this.f63941e, b3Var.f63941e) && Intrinsics.d(this.f63942f, b3Var.f63942f) && Intrinsics.d(this.f63943g, b3Var.f63943g) && Intrinsics.d(this.f63944h, b3Var.f63944h);
    }

    public final int hashCode() {
        g1 g1Var = this.f63938b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        x xVar = this.f63939c;
        int hashCode2 = (hashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        o0 o0Var = this.f63940d;
        int hashCode3 = (hashCode2 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        o0 o0Var2 = this.f63941e;
        int hashCode4 = (hashCode3 + (o0Var2 == null ? 0 : o0Var2.hashCode())) * 31;
        o0 o0Var3 = this.f63942f;
        int hashCode5 = (hashCode4 + (o0Var3 == null ? 0 : o0Var3.hashCode())) * 31;
        o0 o0Var4 = this.f63943g;
        int hashCode6 = (hashCode5 + (o0Var4 == null ? 0 : o0Var4.hashCode())) * 31;
        o0 o0Var5 = this.f63944h;
        return hashCode6 + (o0Var5 != null ? o0Var5.hashCode() : 0);
    }

    public final String toString() {
        return "Glitch(timeSpeed=" + this.f63938b + ", glitch_signal=" + this.f63939c + ", drop_scale=" + this.f63940d + ", glitch_aberration_radial=" + this.f63941e + ", glitch_drops=" + this.f63942f + ", glitch_dist_1=" + this.f63943g + ", glitch_lines=" + this.f63944h + ")";
    }
}
