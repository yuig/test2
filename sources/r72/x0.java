package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: e, reason: collision with root package name */
    public static final x0 f106703e = new x0(y0.f106715e, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final y0 f106704a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f106705b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f106706c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f106707d;

    public x0(y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4) {
        this.f106704a = y0Var;
        this.f106705b = y0Var2;
        this.f106706c = y0Var3;
        this.f106707d = y0Var4;
    }

    public static x0 a(x0 x0Var, y0 y0Var, y0 y0Var2, int i13) {
        y0 y0Var3 = x0Var.f106705b;
        y0 y0Var4 = x0Var.f106706c;
        if ((i13 & 8) != 0) {
            y0Var2 = x0Var.f106707d;
        }
        x0Var.getClass();
        return new x0(y0Var, y0Var3, y0Var4, y0Var2);
    }

    public final y0 b() {
        y0 y0Var = this.f106704a;
        if (y0Var != null) {
            return y0Var;
        }
        y0 y0Var2 = this.f106707d;
        if (y0Var2 != null) {
            return y0Var2;
        }
        y0 y0Var3 = this.f106705b;
        if (y0Var3 != null) {
            return y0Var3;
        }
        y0 y0Var4 = this.f106706c;
        if (y0Var4 != null) {
            return y0Var4;
        }
        y0 y0Var5 = y0.f106715e;
        return y0.f106715e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f106704a, x0Var.f106704a) && Intrinsics.d(this.f106705b, x0Var.f106705b) && Intrinsics.d(this.f106706c, x0Var.f106706c) && Intrinsics.d(this.f106707d, x0Var.f106707d);
    }

    public final int hashCode() {
        y0 y0Var = this.f106704a;
        int hashCode = (y0Var == null ? 0 : y0Var.hashCode()) * 31;
        y0 y0Var2 = this.f106705b;
        int hashCode2 = (hashCode + (y0Var2 == null ? 0 : y0Var2.hashCode())) * 31;
        y0 y0Var3 = this.f106706c;
        int hashCode3 = (hashCode2 + (y0Var3 == null ? 0 : y0Var3.hashCode())) * 31;
        y0 y0Var4 = this.f106707d;
        return hashCode3 + (y0Var4 != null ? y0Var4.hashCode() : 0);
    }

    public final String toString() {
        return "Image(largeInternal=" + this.f106704a + ", medium=" + this.f106705b + ", small=" + this.f106706c + ", original=" + this.f106707d + ")";
    }
}
