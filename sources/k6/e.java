package k6;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f78357a;

    /* renamed from: b, reason: collision with root package name */
    public final long f78358b;

    public e(double d2) {
        this((long) (d2 * 10000.0d), 10000L);
    }

    public final double a() {
        return this.f78357a / this.f78358b;
    }

    public final String toString() {
        return this.f78357a + "/" + this.f78358b;
    }

    public e(long j13, long j14) {
        if (j14 == 0) {
            this.f78357a = 0L;
            this.f78358b = 1L;
        } else {
            this.f78357a = j13;
            this.f78358b = j14;
        }
    }
}
