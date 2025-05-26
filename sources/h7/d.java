package h7;

/* loaded from: classes.dex */
public final class d implements g7.e {

    /* renamed from: a, reason: collision with root package name */
    public a f67863a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.p f67864b = new g7.p();

    /* renamed from: c, reason: collision with root package name */
    public g7.e f67865c;

    /* renamed from: d, reason: collision with root package name */
    public int f67866d;

    @Override // g7.e
    public final g7.f a() {
        g7.e eVar = this.f67865c;
        return c(eVar != null ? eVar.a() : null, this.f67866d, 0);
    }

    public final e b() {
        g7.e eVar = this.f67865c;
        return c(eVar != null ? eVar.a() : null, this.f67866d | 1, -4000);
    }

    public final e c(g7.f fVar, int i13, int i14) {
        a aVar = this.f67863a;
        aVar.getClass();
        return new e(aVar, fVar, this.f67864b.a(), fVar == null ? null : new c(aVar, 5242880L, 20480), i13);
    }
}
