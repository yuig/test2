package q8;

/* loaded from: classes3.dex */
public final class b0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0.k f102884a;

    /* renamed from: b, reason: collision with root package name */
    public final l0.k f102885b;

    /* renamed from: c, reason: collision with root package name */
    public long f102886c;

    public b0(long j13, long[] jArr, long[] jArr2) {
        bf.b.i(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f102884a = new l0.k(length, 1);
            this.f102885b = new l0.k(length, 1);
        } else {
            int i13 = length + 1;
            l0.k kVar = new l0.k(i13, 1);
            this.f102884a = kVar;
            l0.k kVar2 = new l0.k(i13, 1);
            this.f102885b = kVar2;
            kVar.g(0L);
            kVar2.g(0L);
        }
        this.f102884a.i(jArr);
        this.f102885b.i(jArr2);
        this.f102886c = j13;
    }

    public final void a(long j13, long j14) {
        l0.k kVar = this.f102885b;
        int i13 = kVar.f81235b;
        l0.k kVar2 = this.f102884a;
        if (i13 == 0 && j13 > 0) {
            kVar2.g(0L);
            kVar.g(0L);
        }
        kVar2.g(j14);
        kVar.g(j13);
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        l0.k kVar = this.f102885b;
        if (kVar.f81235b == 0) {
            f0 f0Var = f0.f102913c;
            return new d0(f0Var, f0Var);
        }
        int b13 = d7.n0.b(kVar, j13);
        long m13 = kVar.m(b13);
        l0.k kVar2 = this.f102884a;
        f0 f0Var2 = new f0(m13, kVar2.m(b13));
        if (m13 == j13 || b13 == kVar.f81235b - 1) {
            return new d0(f0Var2, f0Var2);
        }
        int i13 = b13 + 1;
        return new d0(f0Var2, new f0(kVar.m(i13), kVar2.m(i13)));
    }

    @Override // q8.e0
    public final boolean h() {
        return this.f102885b.f81235b > 0;
    }

    @Override // q8.e0
    public final long l() {
        return this.f102886c;
    }
}
