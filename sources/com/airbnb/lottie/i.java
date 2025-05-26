package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28415d;

    public /* synthetic */ i(int i13, Context context, String str, String str2) {
        this.f28412a = i13;
        this.f28413b = context;
        this.f28414c = str;
        this.f28415d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        throw r0;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            r10 = this;
            int r0 = r10.f28412a
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r10.f28413b
            java.lang.String r1 = r10.f28414c
            java.lang.String r2 = r10.f28415d
            com.airbnb.lottie.z r0 = com.airbnb.lottie.n.b(r0, r1, r2)
            return r0
        L10:
            android.content.Context r0 = r10.f28413b
            java.lang.String r1 = r10.f28414c
            java.lang.String r2 = r10.f28415d
            gc.e r3 = com.airbnb.lottie.b.f28382b
            if (r3 != 0) goto L5b
            java.lang.Class<gc.e> r4 = gc.e.class
            monitor-enter(r4)
            gc.e r3 = com.airbnb.lottie.b.f28382b     // Catch: java.lang.Throwable -> L55
            if (r3 != 0) goto L57
            gc.e r3 = new gc.e     // Catch: java.lang.Throwable -> L55
            android.content.Context r5 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L55
            gc.c r6 = com.airbnb.lottie.b.f28383c     // Catch: java.lang.Throwable -> L55
            if (r6 != 0) goto L49
            java.lang.Class<gc.c> r6 = gc.c.class
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L55
            gc.c r7 = com.airbnb.lottie.b.f28383c     // Catch: java.lang.Throwable -> L42
            if (r7 != 0) goto L44
            gc.c r7 = new gc.c     // Catch: java.lang.Throwable -> L42
            a8.v r8 = new a8.v     // Catch: java.lang.Throwable -> L42
            r9 = 9
            r8.<init>(r5, r9)     // Catch: java.lang.Throwable -> L42
            r5 = 0
            r7.<init>(r8, r5)     // Catch: java.lang.Throwable -> L42
            com.airbnb.lottie.b.f28383c = r7     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r0 = move-exception
            goto L47
        L44:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L42
            r6 = r7
            goto L49
        L47:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L42
            throw r0     // Catch: java.lang.Throwable -> L55
        L49:
            eb.d r5 = new eb.d     // Catch: java.lang.Throwable -> L55
            r7 = 7
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L55
            r3.<init>(r6, r5)     // Catch: java.lang.Throwable -> L55
            com.airbnb.lottie.b.f28382b = r3     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r0 = move-exception
            goto L59
        L57:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L55
            goto L5b
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L55
            throw r0
        L5b:
            com.airbnb.lottie.z r0 = r3.a(r0, r1, r2)
            if (r2 == 0) goto L6e
            java.lang.Object r1 = r0.f28505a
            if (r1 == 0) goto L6e
            cc.h r3 = cc.h.f27436b
            com.airbnb.lottie.h r1 = (com.airbnb.lottie.h) r1
            g1.r r3 = r3.f27437a
            r3.d(r2, r1)
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.i.call():java.lang.Object");
    }
}
