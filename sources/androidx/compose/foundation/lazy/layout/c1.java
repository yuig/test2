package androidx.compose.foundation.lazy.layout;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.b0 f17226a;

    /* renamed from: b, reason: collision with root package name */
    public final g1.b0 f17227b;

    /* renamed from: c, reason: collision with root package name */
    public long f17228c;

    /* renamed from: d, reason: collision with root package name */
    public long f17229d;

    public c1() {
        int i13 = g1.j0.f63277a;
        this.f17226a = new g1.b0(6);
        this.f17227b = new g1.b0(6);
    }

    public static final long a(c1 c1Var, long j13, long j14) {
        if (j14 == 0) {
            return j13;
        }
        long j15 = 4;
        return (j13 / j15) + ((j14 / j15) * 3);
    }
}
