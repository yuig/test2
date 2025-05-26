package g8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class q0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f64394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f64395b;

    public q0(t0 t0Var, int i13) {
        this.f64395b = t0Var;
        this.f64394a = i13;
    }

    @Override // g8.b1
    public final void b() {
        t0 t0Var = this.f64395b;
        t0Var.f64425v[this.f64394a].z();
        int w13 = t0Var.f64407d.w(t0Var.F);
        l8.w wVar = t0Var.f64417n;
        IOException iOException = wVar.f82099c;
        if (iOException != null) {
            throw iOException;
        }
        l8.t tVar = wVar.f82098b;
        if (tVar != null) {
            if (w13 == Integer.MIN_VALUE) {
                w13 = tVar.f82084a;
            }
            IOException iOException2 = tVar.f82088e;
            if (iOException2 != null && tVar.f82089f > w13) {
                throw iOException2;
            }
        }
    }

    @Override // g8.b1
    public final int i(qq2.c cVar, k7.e eVar, int i13) {
        t0 t0Var = this.f64395b;
        if (t0Var.G()) {
            return -3;
        }
        int i14 = this.f64394a;
        t0Var.z(i14);
        int C = t0Var.f64425v[i14].C(cVar, eVar, i13, t0Var.P);
        if (C == -3) {
            t0Var.B(i14);
        }
        return C;
    }

    @Override // g8.b1
    public final boolean j() {
        t0 t0Var = this.f64395b;
        return !t0Var.G() && t0Var.f64425v[this.f64394a].x(t0Var.P);
    }

    @Override // g8.b1
    public final int o(long j13) {
        t0 t0Var = this.f64395b;
        if (t0Var.G()) {
            return 0;
        }
        int i13 = this.f64394a;
        t0Var.z(i13);
        a1 a1Var = t0Var.f64425v[i13];
        int t13 = a1Var.t(j13, t0Var.P);
        a1Var.H(t13);
        if (t13 != 0) {
            return t13;
        }
        t0Var.B(i13);
        return t13;
    }
}
