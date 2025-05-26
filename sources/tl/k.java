package tl;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f118049f = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f118050a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f118051b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public j f118052c = j.IDLE;

    /* renamed from: d, reason: collision with root package name */
    public long f118053d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final i f118054e = new i(this, 0);

    public k(Executor executor) {
        com.bumptech.glide.d.t(executor);
        this.f118050a = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            com.bumptech.glide.d.t(r8)
            java.util.ArrayDeque r0 = r7.f118051b
            monitor-enter(r0)
            tl.j r1 = r7.f118052c     // Catch: java.lang.Throwable -> L6d
            tl.j r2 = tl.j.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            tl.j r2 = tl.j.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f118053d     // Catch: java.lang.Throwable -> L6d
            tl.i r1 = new tl.i     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque r8 = r7.f118051b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            tl.j r8 = tl.j.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f118052c = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f118050a     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            tl.i r5 = r7.f118054e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            tl.j r0 = r7.f118052c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.ArrayDeque r0 = r7.f118051b
            monitor-enter(r0)
            long r5 = r7.f118053d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            tl.j r1 = r7.f118052c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f118052c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.ArrayDeque r2 = r7.f118051b
            monitor-enter(r2)
            tl.j r0 = r7.f118052c     // Catch: java.lang.Throwable -> L55
            tl.j r3 = tl.j.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            tl.j r3 = tl.j.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.ArrayDeque r0 = r7.f118051b     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.ArrayDeque r1 = r7.f118051b     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.k.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f118050a + "}";
    }
}
