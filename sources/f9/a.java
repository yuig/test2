package f9;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f61424a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61425b;

    public a(long j13, long j14) {
        this.f61424a = j14;
        this.f61425b = j13;
    }

    @Override // f9.b
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb3.append(this.f61424a);
        sb3.append(", identifier= ");
        return a.a.o(sb3, this.f61425b, " }");
    }
}
