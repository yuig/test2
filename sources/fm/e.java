package fm;

import dm.l;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f62563d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f62564e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final l f62565a = l.a();

    /* renamed from: b, reason: collision with root package name */
    public long f62566b;

    /* renamed from: c, reason: collision with root package name */
    public int f62567c;

    public final synchronized long a(int i13) {
        if (i13 != 429 && (i13 < 500 || i13 >= 600)) {
            return f62563d;
        }
        double pow = Math.pow(2.0d, this.f62567c);
        this.f62565a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f62564e);
    }

    public final synchronized boolean b() {
        boolean z13;
        if (this.f62567c != 0) {
            this.f62565a.f55332a.getClass();
            z13 = System.currentTimeMillis() > this.f62566b;
        }
        return z13;
    }

    public final synchronized void c(int i13) {
        if ((i13 >= 200 && i13 < 300) || i13 == 401 || i13 == 404) {
            synchronized (this) {
                this.f62567c = 0;
            }
        } else {
            this.f62567c++;
            long a13 = a(i13);
            this.f62565a.f55332a.getClass();
            this.f62566b = System.currentTimeMillis() + a13;
        }
    }
}
