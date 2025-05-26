package j1;

/* loaded from: classes.dex */
public final class d3 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f74040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74041b;

    /* renamed from: c, reason: collision with root package name */
    public final w2 f74042c;

    public d3(int i13, int i14, c0 c0Var) {
        this.f74040a = i13;
        this.f74041b = i14;
        this.f74042c = new w2(new l0(i13, i14, c0Var));
    }

    @Override // j1.r2
    public final t g(long j13, t tVar, t tVar2, t tVar3) {
        return this.f74042c.g(j13, tVar, tVar2, tVar3);
    }

    @Override // j1.u2
    public final int n() {
        return this.f74041b;
    }

    @Override // j1.r2
    public final t o(long j13, t tVar, t tVar2, t tVar3) {
        return this.f74042c.o(j13, tVar, tVar2, tVar3);
    }

    @Override // j1.u2
    public final int r() {
        return this.f74040a;
    }
}
