package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class f extends AtomicReference implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final g f76449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f76450b;

    public f(g gVar, int i13) {
        this.f76449a = gVar;
        this.f76450b = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        if (r4 == r2.length) goto L17;
     */
    @Override // uj2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r5 = this;
            jk2.g r0 = r5.f76449a
            int r1 = r5.f76450b
            monitor-enter(r0)
            java.lang.Object[] r2 = r0.f76467d     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            goto L2a
        Lb:
            r1 = move-exception
            goto L2b
        Ld:
            r1 = r2[r1]     // Catch: java.lang.Throwable -> Lb
            r3 = 1
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 != 0) goto L1f
            int r4 = r0.f76474k     // Catch: java.lang.Throwable -> Lb
            int r4 = r4 + r3
            r0.f76474k = r4     // Catch: java.lang.Throwable -> Lb
            int r2 = r2.length     // Catch: java.lang.Throwable -> Lb
            if (r4 != r2) goto L21
        L1f:
            r0.f76471h = r3     // Catch: java.lang.Throwable -> Lb
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L27
            r0.a()
        L27:
            r0.c()
        L2a:
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jk2.f.a():void");
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        boolean z13;
        g gVar = this.f76449a;
        int i13 = this.f76450b;
        synchronized (gVar) {
            try {
                Object[] objArr = gVar.f76467d;
                if (objArr == null) {
                    return;
                }
                Object obj2 = objArr[i13];
                int i14 = gVar.f76473j;
                if (obj2 == null) {
                    i14++;
                    gVar.f76473j = i14;
                }
                objArr[i13] = obj;
                if (i14 == objArr.length) {
                    gVar.f76468e.offer(objArr.clone());
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    gVar.c();
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r3 == r5.length) goto L20;
     */
    @Override // uj2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            jk2.g r0 = r4.f76449a
            int r1 = r4.f76450b
            pk2.c r2 = r0.f76472i
            r2.getClass()
            boolean r2 = pk2.h.a(r2, r5)
            if (r2 == 0) goto L3d
            boolean r5 = r0.f76469f
            if (r5 == 0) goto L36
            monitor-enter(r0)
            java.lang.Object[] r5 = r0.f76467d     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L40
        L1a:
            r5 = move-exception
            goto L34
        L1c:
            r1 = r5[r1]     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            if (r1 != 0) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 != 0) goto L2e
            int r3 = r0.f76474k     // Catch: java.lang.Throwable -> L1a
            int r3 = r3 + r2
            r0.f76474k = r3     // Catch: java.lang.Throwable -> L1a
            int r5 = r5.length     // Catch: java.lang.Throwable -> L1a
            if (r3 != r5) goto L30
        L2e:
            r0.f76471h = r2     // Catch: java.lang.Throwable -> L1a
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L39
            goto L36
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
        L36:
            r0.a()
        L39:
            r0.c()
            goto L40
        L3d:
            lb.l0.R0(r5)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jk2.f.onError(java.lang.Throwable):void");
    }
}
