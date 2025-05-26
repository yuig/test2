package g8;

/* loaded from: classes.dex */
public final class y extends a7.b1 {

    /* renamed from: b, reason: collision with root package name */
    public final a7.i0 f64479b;

    public y(a7.i0 i0Var) {
        this.f64479b = i0Var;
    }

    @Override // a7.b1
    public final int b(Object obj) {
        return obj == x.f64469e ? 0 : -1;
    }

    @Override // a7.b1
    public final a7.z0 g(int i13, a7.z0 z0Var, boolean z13) {
        z0Var.o(z13 ? 0 : null, z13 ? x.f64469e : null, 0, -9223372036854775807L, 0L, a7.b.f945g, true);
        return z0Var;
    }

    @Override // a7.b1
    public final int i() {
        return 1;
    }

    @Override // a7.b1
    public final Object m(int i13) {
        return x.f64469e;
    }

    @Override // a7.b1
    public final a7.a1 n(int i13, a7.a1 a1Var, long j13) {
        Object obj = a7.a1.f927q;
        a1Var.c(this.f64479b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        a1Var.f939k = true;
        return a1Var;
    }

    @Override // a7.b1
    public final int p() {
        return 1;
    }
}
