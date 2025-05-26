package g8;

import java.util.List;

/* loaded from: classes3.dex */
public final class j0 implements k8.t {

    /* renamed from: a, reason: collision with root package name */
    public final k8.t f64303a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.c1 f64304b;

    public j0(k8.t tVar, a7.c1 c1Var) {
        this.f64303a = tVar;
        this.f64304b = c1Var;
    }

    @Override // k8.t
    public final int a() {
        return this.f64303a.a();
    }

    @Override // k8.t
    public final long b() {
        return this.f64303a.b();
    }

    @Override // k8.t
    public final boolean c(int i13, long j13) {
        return this.f64303a.c(i13, j13);
    }

    @Override // k8.t
    public final int d(androidx.media3.common.b bVar) {
        return this.f64303a.l(this.f64304b.b(bVar));
    }

    @Override // k8.t
    public final androidx.media3.common.b e(int i13) {
        return this.f64304b.f967d[this.f64303a.f(i13)];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f64303a.equals(j0Var.f64303a) && this.f64304b.equals(j0Var.f64304b);
    }

    @Override // k8.t
    public final int f(int i13) {
        return this.f64303a.f(i13);
    }

    @Override // k8.t
    public final void g() {
        this.f64303a.g();
    }

    @Override // k8.t
    public final boolean h(int i13, long j13) {
        return this.f64303a.h(i13, j13);
    }

    public final int hashCode() {
        return this.f64303a.hashCode() + ((this.f64304b.hashCode() + 527) * 31);
    }

    @Override // k8.t
    public final void i(float f13) {
        this.f64303a.i(f13);
    }

    @Override // k8.t
    public final Object j() {
        return this.f64303a.j();
    }

    @Override // k8.t
    public final void k() {
        this.f64303a.k();
    }

    @Override // k8.t
    public final int l(int i13) {
        return this.f64303a.l(i13);
    }

    @Override // k8.t
    public final int length() {
        return this.f64303a.length();
    }

    @Override // k8.t
    public final a7.c1 m() {
        return this.f64304b;
    }

    @Override // k8.t
    public final void n(boolean z13) {
        this.f64303a.n(z13);
    }

    @Override // k8.t
    public final void o() {
        this.f64303a.o();
    }

    @Override // k8.t
    public final int p(long j13, List list) {
        return this.f64303a.p(j13, list);
    }

    @Override // k8.t
    public final int q() {
        return this.f64303a.q();
    }

    @Override // k8.t
    public final androidx.media3.common.b r() {
        return this.f64304b.f967d[this.f64303a.q()];
    }

    @Override // k8.t
    public final boolean s(long j13, h8.f fVar, List list) {
        return this.f64303a.s(j13, fVar, list);
    }

    @Override // k8.t
    public final int t() {
        return this.f64303a.t();
    }

    @Override // k8.t
    public final void u(long j13, long j14, long j15, List list, h8.q[] qVarArr) {
        this.f64303a.u(j13, j14, j15, list, qVarArr);
    }

    @Override // k8.t
    public final void v() {
        this.f64303a.v();
    }
}
