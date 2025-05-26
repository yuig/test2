package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o1 implements h0 {

    /* renamed from: a */
    public final float f74183a;

    /* renamed from: b */
    public final float f74184b;

    /* renamed from: c */
    public final Object f74185c;

    public /* synthetic */ o1(Object obj) {
        this(1.0f, 1500.0f, obj);
    }

    @Override // j1.n
    public final r2 a(p2 p2Var) {
        Object obj = this.f74185c;
        return new c3(this.f74183a, this.f74184b, obj == null ? null : (t) p2Var.f74197a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return o1Var.f74183a == this.f74183a && o1Var.f74184b == this.f74184b && Intrinsics.d(o1Var.f74185c, this.f74185c);
    }

    public final int hashCode() {
        Object obj = this.f74185c;
        return Float.hashCode(this.f74184b) + a.a.a(this.f74183a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public o1(float f13, float f14, Object obj) {
        this.f74183a = f13;
        this.f74184b = f14;
        this.f74185c = obj;
    }
}
