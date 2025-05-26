package s3;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f111000a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f111001b;

    public y(k0 k0Var, q3.p0 p0Var) {
        this.f111000a = k0Var;
        this.f111001b = bs1.c.u1(p0Var, y3.f71400a);
    }

    public final q3.p0 a() {
        return (q3.p0) this.f111001b.getValue();
    }

    public final int b(int i13) {
        q3.p0 a13 = a();
        k0 k0Var = this.f111000a;
        return a13.h(k0Var.f110837y.f110806c, k0Var.n(), i13);
    }

    public final int c(int i13) {
        q3.p0 a13 = a();
        k0 k0Var = this.f111000a;
        return a13.d(k0Var.f110837y.f110806c, k0Var.n(), i13);
    }

    public final int d(int i13) {
        q3.p0 a13 = a();
        k0 k0Var = this.f111000a;
        return a13.h(k0Var.f110837y.f110806c, k0Var.m(), i13);
    }

    public final int e(int i13) {
        q3.p0 a13 = a();
        k0 k0Var = this.f111000a;
        return a13.d(k0Var.f110837y.f110806c, k0Var.m(), i13);
    }

    public final int f(int i13) {
        q3.p0 a13 = a();
        k0 k0Var = this.f111000a;
        return a13.b(k0Var.f110837y.f110806c, k0Var.n(), i13);
    }

    public final int g(int i13) {
        q3.p0 a13 = a();
        k0 k0Var = this.f111000a;
        return a13.e(k0Var.f110837y.f110806c, k0Var.n(), i13);
    }

    public final int h(int i13) {
        q3.p0 a13 = a();
        k0 k0Var = this.f111000a;
        return a13.b(k0Var.f110837y.f110806c, k0Var.m(), i13);
    }

    public final int i(int i13) {
        q3.p0 a13 = a();
        k0 k0Var = this.f111000a;
        return a13.e(k0Var.f110837y.f110806c, k0Var.m(), i13);
    }

    public final void j(q3.p0 p0Var) {
        this.f111001b.setValue(p0Var);
    }
}
