package i9;

import q8.n;

/* loaded from: classes3.dex */
public final class a extends n implements f {

    /* renamed from: h, reason: collision with root package name */
    public final long f71726h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71727i;

    /* renamed from: j, reason: collision with root package name */
    public final int f71728j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f71729k;

    /* renamed from: l, reason: collision with root package name */
    public final long f71730l;

    public a(int i13, int i14, long j13, long j14, boolean z13) {
        super(i13, i14, j13, j14, z13);
        this.f71726h = j14;
        this.f71727i = i13;
        this.f71728j = i14;
        this.f71729k = z13;
        this.f71730l = j13 == -1 ? -1L : j13;
    }

    @Override // i9.f
    public final long c(long j13) {
        return (Math.max(0L, j13 - this.f102965b) * 8000000) / this.f102968e;
    }

    @Override // i9.f
    public final long g() {
        return this.f71730l;
    }

    @Override // i9.f
    public final int k() {
        return this.f71727i;
    }
}
