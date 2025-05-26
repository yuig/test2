package tl;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118046a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f118047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f118048c;

    public /* synthetic */ i(k kVar, int i13) {
        this(kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r9.f118047b.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        r9.f118047b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        tl.k.f118049f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f118047b, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
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
            tl.k r2 = r9.f118048c     // Catch: java.lang.Throwable -> L56
            java.util.ArrayDeque r2 = r2.f118051b     // Catch: java.lang.Throwable -> L56
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L28
            tl.k r0 = r9.f118048c     // Catch: java.lang.Throwable -> L1c
            tl.j r3 = r0.f118052c     // Catch: java.lang.Throwable -> L1c
            tl.j r4 = tl.j.RUNNING     // Catch: java.lang.Throwable -> L1c
            if (r3 != r4) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1b:
            return
        L1c:
            r0 = move-exception
            goto L79
        L1e:
            long r5 = r0.f118053d     // Catch: java.lang.Throwable -> L1c
            r7 = 1
            long r5 = r5 + r7
            r0.f118053d = r5     // Catch: java.lang.Throwable -> L1c
            r0.f118052c = r4     // Catch: java.lang.Throwable -> L1c
            r0 = 1
        L28:
            tl.k r3 = r9.f118048c     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayDeque r3 = r3.f118051b     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
            r9.f118047b = r3     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L47
            tl.k r0 = r9.f118048c     // Catch: java.lang.Throwable -> L1c
            tl.j r3 = tl.j.IDLE     // Catch: java.lang.Throwable -> L1c
            r0.f118052c = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L46
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L56
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r9.f118047b     // Catch: java.lang.Throwable -> L58 java.lang.RuntimeException -> L5a
            r3.run()     // Catch: java.lang.Throwable -> L58 java.lang.RuntimeException -> L5a
        L53:
            r9.f118047b = r2     // Catch: java.lang.Throwable -> L56
            goto L2
        L56:
            r0 = move-exception
            goto L7b
        L58:
            r0 = move-exception
            goto L76
        L5a:
            r3 = move-exception
            java.util.logging.Logger r4 = tl.k.f118049f     // Catch: java.lang.Throwable -> L58
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r6.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L58
            java.lang.Runnable r7 = r9.f118047b     // Catch: java.lang.Throwable -> L58
            r6.append(r7)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L58
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L58
            goto L53
        L76:
            r9.f118047b = r2     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L56
        L79:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L56
        L7b:
            if (r1 == 0) goto L84
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L84:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.i.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f118046a) {
            case 0:
                this.f118047b.run();
                return;
            default:
                try {
                    a();
                    return;
                } catch (Error e13) {
                    synchronized (this.f118048c.f118051b) {
                        this.f118048c.f118052c = j.IDLE;
                        throw e13;
                    }
                }
        }
    }

    public final String toString() {
        switch (this.f118046a) {
            case 0:
                return this.f118047b.toString();
            default:
                Runnable runnable = this.f118047b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + this.f118048c.f118052c + "}";
        }
    }

    public i(k kVar, Runnable runnable) {
        this.f118048c = kVar;
        this.f118047b = runnable;
    }

    public i(k kVar) {
        this.f118048c = kVar;
    }
}
