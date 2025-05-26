package wo2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public long f130697b;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f130700e;

    /* renamed from: f, reason: collision with root package name */
    public final Condition f130701f;

    /* renamed from: a, reason: collision with root package name */
    public long f130696a = System.nanoTime();

    /* renamed from: c, reason: collision with root package name */
    public long f130698c = 8192;

    /* renamed from: d, reason: collision with root package name */
    public long f130699d = 262144;

    public g0() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f130700e = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        this.f130701f = newCondition;
    }

    public static void b(g0 g0Var, long j13) {
        long j14 = g0Var.f130698c;
        long j15 = g0Var.f130699d;
        ReentrantLock reentrantLock = g0Var.f130700e;
        reentrantLock.lock();
        try {
            if (j13 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j14 <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j15 < j14) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            g0Var.f130697b = j13;
            g0Var.f130698c = j14;
            g0Var.f130699d = j15;
            g0Var.f130701f.signalAll();
            Unit unit = Unit.f80348a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long a(long j13, long j14) {
        if (this.f130697b == 0) {
            return j14;
        }
        long max = Math.max(this.f130696a - j13, 0L);
        long j15 = this.f130699d;
        long j16 = this.f130697b;
        long j17 = j15 - ((max * j16) / 1000000000);
        if (j17 >= j14) {
            this.f130696a = ((j14 * 1000000000) / j16) + j13 + max;
            return j14;
        }
        long j18 = this.f130698c;
        if (j17 >= j18) {
            this.f130696a = ((j15 * 1000000000) / j16) + j13;
            return j17;
        }
        long min = Math.min(j18, j14);
        long j19 = this.f130699d;
        long j23 = this.f130697b;
        long j24 = (((min - j19) * 1000000000) / j23) + max;
        if (j24 != 0) {
            return -j24;
        }
        this.f130696a = ((j19 * 1000000000) / j23) + j13;
        return min;
    }

    public final long c(long j13) {
        if (j13 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ReentrantLock reentrantLock = this.f130700e;
        reentrantLock.lock();
        while (true) {
            try {
                long a13 = a(System.nanoTime(), j13);
                if (a13 >= 0) {
                    return a13;
                }
                this.f130701f.awaitNanos(-a13);
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
