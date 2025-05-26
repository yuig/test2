package g8;

/* loaded from: classes3.dex */
public final class p implements q8.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64368a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f64369b;

    public p(int i13) {
        if ((i13 & 1) != 0) {
            this.f64369b = new q8.g0(65496, 2, "image/jpeg");
        } else {
            this.f64369b = new x8.a();
        }
    }

    @Override // q8.s
    public final void a() {
        switch (this.f64368a) {
            case 0:
                break;
            default:
                ((q8.s) this.f64369b).a();
                break;
        }
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        switch (this.f64368a) {
            case 0:
                break;
            default:
                ((q8.s) this.f64369b).b(j13, j14);
                break;
        }
    }

    @Override // q8.s
    public final int d(q8.t tVar, q8.c0 c0Var) {
        switch (this.f64368a) {
            case 0:
                return tVar.n(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((q8.s) this.f64369b).d(tVar, c0Var);
        }
    }

    @Override // q8.s
    public final void f(q8.u uVar) {
        int i13 = this.f64368a;
        Object obj = this.f64369b;
        switch (i13) {
            case 0:
                q8.k0 D = uVar.D(0, 3);
                uVar.j(new q8.w(-9223372036854775807L));
                uVar.A();
                androidx.media3.common.b bVar = (androidx.media3.common.b) obj;
                a7.q a13 = bVar.a();
                a13.f1181n = a7.o0.r("text/x-unknown");
                a13.f1177j = bVar.f18765o;
                D.b(new androidx.media3.common.b(a13));
                break;
            default:
                ((q8.s) obj).f(uVar);
                break;
        }
    }

    @Override // q8.s
    public final boolean i(q8.t tVar) {
        switch (this.f64368a) {
            case 0:
                return true;
            default:
                return ((q8.s) this.f64369b).i(tVar);
        }
    }

    public p(androidx.media3.common.b bVar) {
        this.f64369b = bVar;
    }
}
