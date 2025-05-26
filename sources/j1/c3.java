package j1;

/* loaded from: classes.dex */
public final class c3 implements v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f74025a;

    public c3(float f13, float f14, t tVar) {
        this.f74025a = new w2(tVar != null ? new s2(f13, f14, tVar) : new t2(f13, f14));
    }

    @Override // j1.r2
    public final t G(t tVar, t tVar2, t tVar3) {
        return this.f74025a.G(tVar, tVar2, tVar3);
    }

    @Override // j1.v2, j1.r2
    public final boolean a() {
        this.f74025a.getClass();
        return false;
    }

    @Override // j1.r2
    public final long b(t tVar, t tVar2, t tVar3) {
        return this.f74025a.b(tVar, tVar2, tVar3);
    }

    @Override // j1.r2
    public final t g(long j13, t tVar, t tVar2, t tVar3) {
        return this.f74025a.g(j13, tVar, tVar2, tVar3);
    }

    @Override // j1.r2
    public final t o(long j13, t tVar, t tVar2, t tVar3) {
        return this.f74025a.o(j13, tVar, tVar2, tVar3);
    }
}
