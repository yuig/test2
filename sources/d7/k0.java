package d7;

import android.os.SystemClock;
import java.math.RoundingMode;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public long f53846a;

    /* renamed from: b, reason: collision with root package name */
    public long f53847b;

    /* renamed from: c, reason: collision with root package name */
    public long f53848c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f53849d = new ThreadLocal();

    public k0(long j13) {
        f(j13);
    }

    public final synchronized long a(long j13) {
        if (j13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long j14 = this.f53846a;
                if (j14 == 9223372036854775806L) {
                    Long l13 = (Long) this.f53849d.get();
                    l13.getClass();
                    j14 = l13.longValue();
                }
                this.f53847b = j14 - j13;
                notifyAll();
            }
            this.f53848c = j13;
            return j13 + this.f53847b;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized long b(long j13) {
        if (j13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j14 = this.f53848c;
            if (j14 != -9223372036854775807L) {
                int i13 = n0.f53866a;
                long g03 = n0.g0(j14, 90000L, 1000000L, RoundingMode.DOWN);
                long j15 = (4294967296L + g03) / 8589934592L;
                long j16 = ((j15 - 1) * 8589934592L) + j13;
                long j17 = (j15 * 8589934592L) + j13;
                j13 = Math.abs(j16 - g03) < Math.abs(j17 - g03) ? j16 : j17;
            }
            long j18 = j13;
            int i14 = n0.f53866a;
            return a(n0.g0(j18, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized long c(long j13) {
        if (j13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j14 = this.f53848c;
            if (j14 != -9223372036854775807L) {
                int i13 = n0.f53866a;
                long g03 = n0.g0(j14, 90000L, 1000000L, RoundingMode.DOWN);
                long j15 = g03 / 8589934592L;
                long j16 = (j15 * 8589934592L) + j13;
                j13 = j16 >= g03 ? j16 : ((j15 + 1) * 8589934592L) + j13;
            }
            long j17 = j13;
            int i14 = n0.f53866a;
            return a(n0.g0(j17, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized long d() {
        long j13;
        j13 = this.f53846a;
        if (j13 == Long.MAX_VALUE || j13 == 9223372036854775806L) {
            j13 = -9223372036854775807L;
        }
        return j13;
    }

    public final synchronized boolean e() {
        return this.f53847b != -9223372036854775807L;
    }

    public final synchronized void f(long j13) {
        this.f53846a = j13;
        this.f53847b = j13 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f53848c = -9223372036854775807L;
    }

    public final synchronized void g(long j13, long j14, boolean z13) {
        try {
            bf.b.t(this.f53846a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z13) {
                this.f53849d.set(Long.valueOf(j13));
            } else {
                long j15 = 0;
                long j16 = j14;
                while (!e()) {
                    if (j14 == 0) {
                        wait();
                    } else {
                        bf.b.t(j16 > 0);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        wait(j16);
                        j15 += SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j15 >= j14 && !e()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j14 + " milliseconds");
                        }
                        j16 = j14 - j15;
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
