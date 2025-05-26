package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class k2 extends u4 {

    @NotNull
    public static final j2 Companion = new j2();

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f64031i = {0.0f, 0.5f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f64032j = {0.5f, 0.5f};

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64033b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f64034c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f64035d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f64036e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f64037f;

    /* renamed from: g, reason: collision with root package name */
    public final g1 f64038g;

    /* renamed from: h, reason: collision with root package name */
    public final x f64039h;

    public k2(g1 g1Var, g1 g1Var2, o0 o0Var, o0 o0Var2, g1 g1Var3, g1 g1Var4, x xVar) {
        this.f64033b = g1Var;
        this.f64034c = g1Var2;
        this.f64035d = o0Var;
        this.f64036e = o0Var2;
        this.f64037f = g1Var3;
        this.f64038g = g1Var4;
        this.f64039h = xVar;
    }

    public final boolean a() {
        x xVar = this.f64039h;
        if (xVar != null) {
            return xVar.f64141c;
        }
        return false;
    }

    public final float b() {
        g1 g1Var = this.f64034c;
        if (g1Var != null) {
            return g1Var.f63991c;
        }
        return 1.0f;
    }

    public final float c() {
        g1 g1Var = this.f64038g;
        if (g1Var != null) {
            return g1Var.f63991c;
        }
        return 0.0f;
    }

    public final float d() {
        g1 g1Var = this.f64033b;
        if (g1Var != null) {
            return g1Var.f63991c;
        }
        return 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return Intrinsics.d(this.f64033b, k2Var.f64033b) && Intrinsics.d(this.f64034c, k2Var.f64034c) && Intrinsics.d(this.f64035d, k2Var.f64035d) && Intrinsics.d(this.f64036e, k2Var.f64036e) && Intrinsics.d(this.f64037f, k2Var.f64037f) && Intrinsics.d(this.f64038g, k2Var.f64038g) && Intrinsics.d(this.f64039h, k2Var.f64039h);
    }

    public final int hashCode() {
        g1 g1Var = this.f64033b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        g1 g1Var2 = this.f64034c;
        int hashCode2 = (hashCode + (g1Var2 == null ? 0 : g1Var2.hashCode())) * 31;
        o0 o0Var = this.f64035d;
        int hashCode3 = (hashCode2 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        o0 o0Var2 = this.f64036e;
        int hashCode4 = (hashCode3 + (o0Var2 == null ? 0 : o0Var2.hashCode())) * 31;
        g1 g1Var3 = this.f64037f;
        int hashCode5 = (hashCode4 + (g1Var3 == null ? 0 : g1Var3.hashCode())) * 31;
        g1 g1Var4 = this.f64038g;
        int hashCode6 = (hashCode5 + (g1Var4 == null ? 0 : g1Var4.hashCode())) * 31;
        x xVar = this.f64039h;
        return hashCode6 + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "Carousel(timeSpeed=" + this.f64033b + ", scale=" + this.f64034c + ", direction=" + this.f64035d + ", spacing=" + this.f64036e + ", spacingX=" + this.f64037f + ", spacingY=" + this.f64038g + ", mirror=" + this.f64039h + ")";
    }

    public k2(int i13, g1 g1Var, g1 g1Var2, o0 o0Var, o0 o0Var2, g1 g1Var3, g1 g1Var4, x xVar) {
        if ((i13 & 1) == 0) {
            this.f64033b = null;
        } else {
            this.f64033b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f64034c = null;
        } else {
            this.f64034c = g1Var2;
        }
        if ((i13 & 4) == 0) {
            this.f64035d = null;
        } else {
            this.f64035d = o0Var;
        }
        if ((i13 & 8) == 0) {
            this.f64036e = null;
        } else {
            this.f64036e = o0Var2;
        }
        if ((i13 & 16) == 0) {
            this.f64037f = null;
        } else {
            this.f64037f = g1Var3;
        }
        if ((i13 & 32) == 0) {
            this.f64038g = null;
        } else {
            this.f64038g = g1Var4;
        }
        if ((i13 & 64) == 0) {
            this.f64039h = null;
        } else {
            this.f64039h = xVar;
        }
    }
}
