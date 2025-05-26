package ao2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class n0 extends e1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final n0 f20177j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f20178k;

    static {
        Long l13;
        n0 n0Var = new n0();
        f20177j = n0Var;
        n0Var.A(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l13 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l13 = 1000L;
        }
        f20178k = timeUnit.toNanos(l13.longValue());
    }

    @Override // ao2.f1
    public final void M(long j13, c1 c1Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // ao2.e1
    public final void O(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.O(runnable);
    }

    @Override // ao2.e1, ao2.r0
    public final x0 a(long j13, Runnable runnable, CoroutineContext coroutineContext) {
        fi.b bVar = g1.f20155a;
        long j14 = j13 > 0 ? j13 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j13 : 0L;
        if (j14 >= 4611686018427387903L) {
            return h2.f20160a;
        }
        long nanoTime = System.nanoTime();
        b1 b1Var = new b1(runnable, j14 + nanoTime);
        W(nanoTime, b1Var);
        return b1Var;
    }

    public final synchronized void a0() {
        int i13 = debugStatus;
        if (i13 == 2 || i13 == 3) {
            debugStatus = 3;
            U();
            notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r14 = this;
            java.lang.ThreadLocal r0 = ao2.o2.f20188a
            r0.set(r14)
            r0 = 0
            monitor-enter(r14)     // Catch: java.lang.Throwable -> L36
            int r1 = ao2.n0.debugStatus     // Catch: java.lang.Throwable -> L71
            r2 = 2
            if (r1 == r2) goto L73
            r3 = 3
            if (r1 != r3) goto L10
            goto L73
        L10:
            r1 = 1
            ao2.n0.debugStatus = r1     // Catch: java.lang.Throwable -> L71
            r14.notifyAll()     // Catch: java.lang.Throwable -> L71
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L36
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r4
        L1d:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L36
            long r8 = r14.K()     // Catch: java.lang.Throwable -> L36
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r10 = 0
            if (r1 != 0) goto L52
            long r12 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L36
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L38
            long r6 = ao2.n0.f20178k     // Catch: java.lang.Throwable -> L36
            long r6 = r6 + r12
            goto L38
        L36:
            r1 = move-exception
            goto L85
        L38:
            long r12 = r6 - r12
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 > 0) goto L4d
            ao2.n0._thread = r0
            r14.a0()
            boolean r0 = r14.S()
            if (r0 != 0) goto L4c
            r14.z()
        L4c:
            return
        L4d:
            long r8 = ql2.s.d(r8, r12)     // Catch: java.lang.Throwable -> L36
            goto L53
        L52:
            r6 = r4
        L53:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L1d
            int r1 = ao2.n0.debugStatus     // Catch: java.lang.Throwable -> L36
            if (r1 == r2) goto L62
            if (r1 != r3) goto L5e
            goto L62
        L5e:
            java.util.concurrent.locks.LockSupport.parkNanos(r14, r8)     // Catch: java.lang.Throwable -> L36
            goto L1d
        L62:
            ao2.n0._thread = r0
            r14.a0()
            boolean r0 = r14.S()
            if (r0 != 0) goto L70
            r14.z()
        L70:
            return
        L71:
            r1 = move-exception
            goto L83
        L73:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L36
            ao2.n0._thread = r0
            r14.a0()
            boolean r0 = r14.S()
            if (r0 != 0) goto L82
            r14.z()
        L82:
            return
        L83:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L36
        L85:
            ao2.n0._thread = r0
            r14.a0()
            boolean r0 = r14.S()
            if (r0 != 0) goto L93
            r14.z()
        L93:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ao2.n0.run():void");
    }

    @Override // ao2.e1, ao2.f1
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // ao2.f0
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // ao2.f1
    public final Thread z() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f20177j.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }
}
