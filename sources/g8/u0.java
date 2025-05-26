package g8;

/* loaded from: classes3.dex */
public final class u0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final g7.e f64435a;

    /* renamed from: b, reason: collision with root package name */
    public final a8.v f64436b;

    /* renamed from: c, reason: collision with root package name */
    public s7.i f64437c;

    /* renamed from: d, reason: collision with root package name */
    public a10.e f64438d;

    /* renamed from: e, reason: collision with root package name */
    public final int f64439e;

    public u0(g7.e eVar, q8.v vVar) {
        a8.v vVar2 = new a8.v(vVar, 1);
        s7.i iVar = new s7.i();
        a10.e eVar2 = new a10.e();
        this.f64435a = eVar;
        this.f64436b = vVar2;
        this.f64437c = iVar;
        this.f64438d = eVar2;
        this.f64439e = 1048576;
    }

    @Override // g8.d0
    public final a d(a7.i0 i0Var) {
        i0Var.f1073b.getClass();
        s7.q b13 = this.f64437c.b(i0Var);
        a10.e eVar = this.f64438d;
        return new v0(i0Var, this.f64435a, this.f64436b, b13, eVar, this.f64439e, 0, null);
    }

    @Override // g8.d0
    public final d0 e(s7.i iVar) {
        bf.b.o(iVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f64437c = iVar;
        return this;
    }

    @Override // g8.d0
    public final d0 g(a10.e eVar) {
        bf.b.o(eVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f64438d = eVar;
        return this;
    }
}
