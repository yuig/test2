package mk2;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f87364a;

    /* renamed from: b, reason: collision with root package name */
    public final d[] f87365b;

    /* renamed from: c, reason: collision with root package name */
    public long f87366c;

    public c(int i13, ThreadFactory threadFactory) {
        this.f87364a = i13;
        this.f87365b = new d[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            this.f87365b[i14] = new d(threadFactory);
        }
    }

    public final d a() {
        int i13 = this.f87364a;
        if (i13 == 0) {
            return e.f87371g;
        }
        long j13 = this.f87366c;
        this.f87366c = 1 + j13;
        return this.f87365b[(int) (j13 % i13)];
    }
}
