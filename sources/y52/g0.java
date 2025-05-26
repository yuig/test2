package y52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f137798a;

    /* renamed from: b, reason: collision with root package name */
    public final zy.l0 f137799b;

    /* renamed from: c, reason: collision with root package name */
    public final int f137800c;

    public g0(d params, zy.l0 pinalyticsVMState, int i13) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f137798a = params;
        this.f137799b = pinalyticsVMState;
        this.f137800c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f137798a, g0Var.f137798a) && Intrinsics.d(this.f137799b, g0Var.f137799b) && this.f137800c == g0Var.f137800c;
    }

    @Override // y52.i0
    public final zy.l0 h() {
        return this.f137799b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f137800c) + jq.b.a(this.f137799b, this.f137798a.hashCode() * 31, 31);
    }

    @Override // y52.i0
    public final int j() {
        return this.f137800c;
    }

    @Override // y52.i0
    public final d k() {
        return this.f137798a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Init(params=");
        sb3.append(this.f137798a);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f137799b);
        sb3.append(", tooltipShowCount=");
        return a.a.n(sb3, this.f137800c, ")");
    }
}
