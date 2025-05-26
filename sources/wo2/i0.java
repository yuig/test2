package wo2;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class i0 {

    /* renamed from: e */
    public static final h0 f130705e = new h0();

    /* renamed from: a */
    public boolean f130706a;

    /* renamed from: b */
    public long f130707b;

    /* renamed from: c */
    public long f130708c;

    /* renamed from: d */
    public volatile Object f130709d;

    public i0 a() {
        this.f130706a = false;
        return this;
    }

    public i0 b() {
        this.f130708c = 0L;
        return this;
    }

    public long c() {
        if (this.f130706a) {
            return this.f130707b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public i0 d(long j13) {
        this.f130706a = true;
        this.f130707b = j13;
        return this;
    }

    public boolean e() {
        return this.f130706a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f130706a && this.f130707b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public i0 g(long j13, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j13 < 0) {
            throw new IllegalArgumentException(a.a.g("timeout < 0: ", j13).toString());
        }
        this.f130708c = unit.toNanos(j13);
        return this;
    }

    public long h() {
        return this.f130708c;
    }
}
