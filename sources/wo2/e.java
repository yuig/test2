package wo2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class e extends i0 {

    /* renamed from: i, reason: collision with root package name */
    public static final ReentrantLock f130680i;

    /* renamed from: j, reason: collision with root package name */
    public static final Condition f130681j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f130682k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f130683l;

    /* renamed from: m, reason: collision with root package name */
    public static e f130684m;

    /* renamed from: f, reason: collision with root package name */
    public int f130685f;

    /* renamed from: g, reason: collision with root package name */
    public e f130686g;

    /* renamed from: h, reason: collision with root package name */
    public long f130687h;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f130680i = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        f130681j = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f130682k = millis;
        f130683l = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        ReentrantLock reentrantLock = f130680i;
        reentrantLock.lock();
        try {
            if (this.f130685f == 1) {
                ln2.k.c(this);
                this.f130685f = 3;
            }
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void j() {
        long j13 = this.f130708c;
        boolean z13 = this.f130706a;
        if (j13 != 0 || z13) {
            ReentrantLock reentrantLock = f130680i;
            reentrantLock.lock();
            try {
                if (this.f130685f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f130685f = 1;
                ln2.k.b(this, j13, z13);
                Unit unit = Unit.f80348a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean k() {
        ReentrantLock reentrantLock = f130680i;
        reentrantLock.lock();
        try {
            int i13 = this.f130685f;
            this.f130685f = 0;
            if (i13 != 1) {
                return i13 == 2;
            }
            ln2.k.c(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException l(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void m() {
    }
}
