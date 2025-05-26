package q8;

/* loaded from: classes3.dex */
public final class g implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f102916a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102917b;

    /* renamed from: c, reason: collision with root package name */
    public final long f102918c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final long f102919d;

    /* renamed from: e, reason: collision with root package name */
    public final long f102920e;

    /* renamed from: f, reason: collision with root package name */
    public final long f102921f;

    /* renamed from: g, reason: collision with root package name */
    public final long f102922g;

    public g(i iVar, long j13, long j14, long j15, long j16, long j17) {
        this.f102916a = iVar;
        this.f102917b = j13;
        this.f102919d = j14;
        this.f102920e = j15;
        this.f102921f = j16;
        this.f102922g = j17;
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        f0 f0Var = new f0(j13, h.a(this.f102916a.d(j13), this.f102918c, this.f102919d, this.f102920e, this.f102921f, this.f102922g));
        return new d0(f0Var, f0Var);
    }

    @Override // q8.e0
    public final boolean h() {
        return true;
    }

    @Override // q8.e0
    public final long l() {
        return this.f102917b;
    }
}
