package q3;

/* loaded from: classes2.dex */
public final class o implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f102260a;

    /* renamed from: b, reason: collision with root package name */
    public final t f102261b;

    /* renamed from: c, reason: collision with root package name */
    public final u f102262c;

    public o(r rVar, t tVar, u uVar) {
        this.f102260a = rVar;
        this.f102261b = tVar;
        this.f102262c = uVar;
    }

    @Override // q3.r
    public final int D(int i13) {
        return this.f102260a.D(i13);
    }

    @Override // q3.r
    public final int N(int i13) {
        return this.f102260a.N(i13);
    }

    @Override // q3.r
    public final int P(int i13) {
        return this.f102260a.P(i13);
    }

    @Override // q3.o0
    public final c1 Q(long j13) {
        u uVar = this.f102262c;
        u uVar2 = u.Width;
        t tVar = this.f102261b;
        r rVar = this.f102260a;
        if (uVar == uVar2) {
            return new p(tVar == t.Max ? rVar.P(n4.a.g(j13)) : rVar.N(n4.a.g(j13)), n4.a.c(j13) ? n4.a.g(j13) : 32767, 0);
        }
        return new p(n4.a.d(j13) ? n4.a.h(j13) : 32767, tVar == t.Max ? rVar.d(n4.a.h(j13)) : rVar.D(n4.a.h(j13)), 0);
    }

    @Override // q3.r
    public final Object a() {
        return this.f102260a.a();
    }

    @Override // q3.r
    public final int d(int i13) {
        return this.f102260a.d(i13);
    }
}
