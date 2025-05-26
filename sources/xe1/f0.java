package xe1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f134712a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134713b;

    /* renamed from: c, reason: collision with root package name */
    public final int f134714c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134715d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134716e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f134717f;

    /* renamed from: g, reason: collision with root package name */
    public final int f134718g;

    /* renamed from: h, reason: collision with root package name */
    public final int f134719h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f134720i;

    public f0(int i13, int i14, int i15, int i16, int i17) {
        this(i13, i14, i15, i16, i17, null, -2, -2, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f134712a == f0Var.f134712a && this.f134713b == f0Var.f134713b && this.f134714c == f0Var.f134714c && this.f134715d == f0Var.f134715d && this.f134716e == f0Var.f134716e && Intrinsics.d(this.f134717f, f0Var.f134717f) && this.f134718g == f0Var.f134718g && this.f134719h == f0Var.f134719h && Intrinsics.d(this.f134720i, f0Var.f134720i);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f134716e, ep.b.b(this.f134715d, ep.b.b(this.f134714c, ep.b.b(this.f134713b, Integer.hashCode(this.f134712a) * 31, 31), 31), 31), 31);
        Integer num = this.f134717f;
        int b14 = ep.b.b(this.f134719h, ep.b.b(this.f134718g, (b13 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        Integer num2 = this.f134720i;
        return b14 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ViewConstraintsModel(viewID=");
        sb3.append(this.f134712a);
        sb3.append(", topId=");
        sb3.append(this.f134713b);
        sb3.append(", topConstraintSide=");
        sb3.append(this.f134714c);
        sb3.append(", bottomId=");
        sb3.append(this.f134715d);
        sb3.append(", bottomConstraintSide=");
        sb3.append(this.f134716e);
        sb3.append(", chainStyle=");
        sb3.append(this.f134717f);
        sb3.append(", height=");
        sb3.append(this.f134718g);
        sb3.append(", width=");
        sb3.append(this.f134719h);
        sb3.append(", topMargin=");
        return a.c.i(sb3, this.f134720i, ")");
    }

    public f0(int i13, int i14, int i15, int i16, int i17, Integer num, int i18, int i19, Integer num2) {
        this.f134712a = i13;
        this.f134713b = i14;
        this.f134714c = i15;
        this.f134715d = i16;
        this.f134716e = i17;
        this.f134717f = num;
        this.f134718g = i18;
        this.f134719h = i19;
        this.f134720i = num2;
    }
}
