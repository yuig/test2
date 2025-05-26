package h7;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f67908a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67909b;

    public m(long j13, long j14) {
        this.f67908a = j13;
        this.f67909b = j14;
    }

    public final boolean a(long j13, long j14) {
        long j15 = this.f67908a;
        if (j15 > j13) {
            return j14 == -1 || j13 + j14 > j15;
        }
        long j16 = this.f67909b;
        return j16 == -1 || j15 + j16 > j13;
    }
}
