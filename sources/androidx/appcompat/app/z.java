package androidx.appcompat.app;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16159a;

    /* renamed from: b */
    public final Object f16160b;

    public /* synthetic */ z(Object obj, int i13) {
        this.f16159a = i13;
        this.f16160b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        r3.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        kh2.m0.t("SequentialExecutor", "Exception while executing runnable " + r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f16160b     // Catch: java.lang.Throwable -> L5d
            f0.j r2 = (f0.j) r2     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayDeque r2 = r2.f60738a     // Catch: java.lang.Throwable -> L5d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L32
            java.lang.Object r0 = r9.f16160b     // Catch: java.lang.Throwable -> L21
            r3 = r0
            f0.j r3 = (f0.j) r3     // Catch: java.lang.Throwable -> L21
            f0.i r3 = r3.f60741d     // Catch: java.lang.Throwable -> L21
            f0.i r4 = f0.i.RUNNING     // Catch: java.lang.Throwable -> L21
            if (r3 != r4) goto L23
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L20
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L20:
            return
        L21:
            r0 = move-exception
            goto L77
        L23:
            r3 = r0
            f0.j r3 = (f0.j) r3     // Catch: java.lang.Throwable -> L21
            long r5 = r3.f60742e     // Catch: java.lang.Throwable -> L21
            r7 = 1
            long r5 = r5 + r7
            r3.f60742e = r5     // Catch: java.lang.Throwable -> L21
            f0.j r0 = (f0.j) r0     // Catch: java.lang.Throwable -> L21
            r0.f60741d = r4     // Catch: java.lang.Throwable -> L21
            r0 = 1
        L32:
            java.lang.Object r3 = r9.f16160b     // Catch: java.lang.Throwable -> L21
            f0.j r3 = (f0.j) r3     // Catch: java.lang.Throwable -> L21
            java.util.ArrayDeque r3 = r3.f60738a     // Catch: java.lang.Throwable -> L21
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L21
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L53
            java.lang.Object r0 = r9.f16160b     // Catch: java.lang.Throwable -> L21
            f0.j r0 = (f0.j) r0     // Catch: java.lang.Throwable -> L21
            f0.i r3 = f0.i.IDLE     // Catch: java.lang.Throwable -> L21
            r0.f60741d = r3     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L52
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L52:
            return
        L53:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5d
            r1 = r1 | r2
            r3.run()     // Catch: java.lang.Throwable -> L5d java.lang.RuntimeException -> L5f
            goto L2
        L5d:
            r0 = move-exception
            goto L79
        L5f:
            r2 = move-exception
            java.lang.String r4 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r5.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5d
            r5.append(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L5d
            kh2.m0.t(r4, r3, r2)     // Catch: java.lang.Throwable -> L5d
            goto L2
        L77:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L5d
        L79:
            if (r1 == 0) goto L82
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.z.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0386, code lost:
    
        if (r5 > 0) goto L445;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.z.run():void");
    }

    public z(df.n0 key) {
        this.f16159a = 20;
        Intrinsics.checkNotNullParameter(key, "key");
        this.f16160b = key;
    }

    public z(View view) {
        this.f16159a = 8;
        this.f16160b = view;
    }
}
