package com.google.common.util.concurrent;

import a.y3;
import df.j1;

/* loaded from: classes3.dex */
public final class a extends s implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public c0 f33523e;

    /* renamed from: f, reason: collision with root package name */
    public Class f33524f;

    /* renamed from: g, reason: collision with root package name */
    public Object f33525g;

    public static a A(t tVar, Class cls, y3 y3Var, r rVar) {
        a aVar = new a();
        aVar.f33523e = tVar;
        aVar.f33524f = cls;
        aVar.f33525g = y3Var;
        tVar.d(aVar, j1.v1(rVar, aVar));
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // java.lang.Runnable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            com.google.common.util.concurrent.c0 r0 = r8.f33523e
            java.lang.Class r1 = r8.f33524f
            java.lang.Object r2 = r8.f33525g
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto La6
            boolean r3 = r8.isCancelled()
            if (r3 == 0) goto L21
            goto La6
        L21:
            r3 = 0
            r8.f33523e = r3
            boolean r4 = r0 instanceof tk.a     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            tk.a r4 = (tk.a) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = r4.a()     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = dl2.b.H0(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L6e
        L3c:
            r5 = r3
            goto L6e
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L6c
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Future type "
            r6.<init>(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L6c:
            r4 = r5
            goto L3c
        L6e:
            if (r4 != 0) goto L74
            r8.v(r5)
            return
        L74:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L7e
            r8.x(r0)
            return
        L7e:
            ok.t r2 = (ok.t) r2     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r2.apply(r4)     // Catch: java.lang.Throwable -> L8c
            r8.f33524f = r3
            r8.f33525g = r3
            r8.v(r0)
            return
        L8c:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L98
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La0
            r1.interrupt()     // Catch: java.lang.Throwable -> La0
        L98:
            r8.w(r0)     // Catch: java.lang.Throwable -> La0
            r8.f33524f = r3
            r8.f33525g = r3
            return
        La0:
            r0 = move-exception
            r8.f33524f = r3
            r8.f33525g = r3
            throw r0
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.run():void");
    }

    @Override // com.google.common.util.concurrent.b
    public final void k() {
        c0 c0Var = this.f33523e;
        if ((c0Var != null) & isCancelled()) {
            c0Var.cancel(y());
        }
        this.f33523e = null;
        this.f33524f = null;
        this.f33525g = null;
    }

    @Override // com.google.common.util.concurrent.b
    public final String t() {
        String str;
        c0 c0Var = this.f33523e;
        Class cls = this.f33524f;
        Object obj = this.f33525g;
        String t13 = super.t();
        if (c0Var != null) {
            str = "inputFuture=[" + c0Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (t13 != null) {
                return a.a.C(str, t13);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }
}
