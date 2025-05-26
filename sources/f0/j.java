package f0;

import androidx.appcompat.app.z;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class j implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f60739b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f60738a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final z f60740c = new z(this, 4);

    /* renamed from: d, reason: collision with root package name */
    public i f60741d = i.IDLE;

    /* renamed from: e, reason: collision with root package name */
    public long f60742e = 0;

    public j(Executor executor) {
        executor.getClass();
        this.f60739b = executor;
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
            r8.getClass()
            java.util.ArrayDeque r0 = r7.f60738a
            monitor-enter(r0)
            f0.i r1 = r7.f60741d     // Catch: java.lang.Throwable -> L6d
            f0.i r2 = f0.i.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            f0.i r2 = f0.i.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f60742e     // Catch: java.lang.Throwable -> L6d
            androidx.appcompat.widget.j r1 = new androidx.appcompat.widget.j     // Catch: java.lang.Throwable -> L6d
            r5 = 1
            r1.<init>(r5, r7, r8)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque r8 = r7.f60738a     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            f0.i r8 = f0.i.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f60741d = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f60739b     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            androidx.appcompat.app.z r6 = r7.f60740c     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r6)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            f0.i r0 = r7.f60741d
            if (r0 == r8) goto L2f
            return
        L2f:
            java.util.ArrayDeque r0 = r7.f60738a
            monitor-enter(r0)
            long r5 = r7.f60742e     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            f0.i r1 = r7.f60741d     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.f60741d = r2     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r8 = move-exception
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r8
        L45:
            r8 = move-exception
            goto L48
        L47:
            r8 = move-exception
        L48:
            java.util.ArrayDeque r2 = r7.f60738a
            monitor-enter(r2)
            f0.i r0 = r7.f60741d     // Catch: java.lang.Throwable -> L56
            f0.i r3 = f0.i.IDLE     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            f0.i r3 = f0.i.QUEUING     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L61
            goto L58
        L56:
            r8 = move-exception
            goto L6b
        L58:
            java.util.ArrayDeque r0 = r7.f60738a     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L61
            goto L62
        L61:
            r5 = 0
        L62:
            boolean r0 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L6a
            if (r5 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L56
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.ArrayDeque r1 = r7.f60738a     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.j.execute(java.lang.Runnable):void");
    }
}
