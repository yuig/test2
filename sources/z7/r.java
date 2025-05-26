package z7;

/* loaded from: classes3.dex */
public final class r implements h7.k {

    /* renamed from: a, reason: collision with root package name */
    public final k f140966a;

    /* renamed from: b, reason: collision with root package name */
    public final long f140967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f140968c;

    /* renamed from: d, reason: collision with root package name */
    public long f140969d;

    /* renamed from: e, reason: collision with root package name */
    public int f140970e;

    public r(k kVar, long j13, int i13, long j14, int i14) {
        this.f140966a = kVar;
        this.f140967b = j13;
        this.f140968c = i13;
        this.f140969d = j14;
        this.f140970e = i14;
    }

    public final float a() {
        long j13 = this.f140967b;
        if (j13 != -1 && j13 != 0) {
            return (this.f140969d * 100.0f) / j13;
        }
        int i13 = this.f140968c;
        if (i13 != 0) {
            return (this.f140970e * 100.0f) / i13;
        }
        return -1.0f;
    }

    @Override // h7.k
    public final void g(long j13, long j14, long j15) {
        long j16 = this.f140969d + j15;
        this.f140969d = j16;
        ((h) this.f140966a).b(this.f140967b, j16, a());
    }
}
