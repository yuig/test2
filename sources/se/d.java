package se;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f112329a = new d();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #3 {, blocks: (B:12:0x001a, B:16:0x0032, B:18:0x0038, B:39:0x0040, B:41:0x0053, B:47:0x0050, B:52:0x002e, B:49:0x002a, B:44:0x004c), top: B:11:0x001a, outer: #1, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:12:0x001a, B:16:0x0032, B:18:0x0038, B:39:0x0040, B:41:0x0053, B:47:0x0050, B:52:0x002e, B:49:0x002a, B:44:0x004c), top: B:11:0x001a, outer: #1, inners: #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(android.content.Context r4) {
        /*
            java.lang.Class<se.d> r0 = se.d.class
            boolean r0 = p001if.a.b(r0)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "com.android.billingclient.api.Purchase"
            java.lang.Class r0 = se.l.b(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L17
            return
        L17:
            me.f r0 = se.g.f112334s     // Catch: java.lang.Throwable -> L99
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<se.g> r1 = se.g.class
            boolean r2 = p001if.a.b(r1)     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            if (r2 == 0) goto L2a
        L28:
            r1 = r3
            goto L32
        L2a:
            java.util.concurrent.atomic.AtomicBoolean r1 = se.g.f112335t     // Catch: java.lang.Throwable -> L2d
            goto L32
        L2d:
            r2 = move-exception
            p001if.a.a(r1, r2)     // Catch: java.lang.Throwable -> L3e
            goto L28
        L32:
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L40
            se.g r4 = se.g.a()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            goto L5c
        L3e:
            r4 = move-exception
            goto La6
        L40:
            me.f.f(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<se.g> r4 = se.g.class
            boolean r1 = p001if.a.b(r4)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L4c
            goto L53
        L4c:
            java.util.concurrent.atomic.AtomicBoolean r3 = se.g.f112335t     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r1 = move-exception
            p001if.a.a(r4, r1)     // Catch: java.lang.Throwable -> L3e
        L53:
            r4 = 1
            r3.set(r4)     // Catch: java.lang.Throwable -> L3e
            se.g r4 = se.g.a()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
        L5c:
            if (r4 != 0) goto L5f
            return
        L5f:
            java.util.concurrent.atomic.AtomicBoolean r0 = me.f.o()     // Catch: java.lang.Throwable -> L99
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto La5
            boolean r0 = se.i.d()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L9b
            java.lang.String r0 = "inapp"
            v.h r1 = new v.h     // Catch: java.lang.Throwable -> L99
            r2 = 10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L99
            boolean r2 = p001if.a.b(r4)     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L7f
            goto La5
        L7f:
            java.lang.String r2 = "skuType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "queryPurchaseHistoryRunnable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)     // Catch: java.lang.Throwable -> L94
            androidx.media3.ui.z r0 = new androidx.media3.ui.z     // Catch: java.lang.Throwable -> L94
            r2 = 16
            r0.<init>(r2, r4, r1)     // Catch: java.lang.Throwable -> L94
            r4.c(r0)     // Catch: java.lang.Throwable -> L94
            goto La5
        L94:
            r0 = move-exception
            p001if.a.a(r4, r0)     // Catch: java.lang.Throwable -> L99
            goto La5
        L99:
            r4 = move-exception
            goto La8
        L9b:
            v.h r0 = new v.h     // Catch: java.lang.Throwable -> L99
            r1 = 11
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L99
            r4.b(r0)     // Catch: java.lang.Throwable -> L99
        La5:
            return
        La6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            throw r4     // Catch: java.lang.Throwable -> L99
        La8:
            java.lang.Class<se.d> r0 = se.d.class
            p001if.a.a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: se.d.b(android.content.Context):void");
    }

    public final void a() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            i iVar = i.f112364a;
            me.f fVar = g.f112334s;
            ConcurrentHashMap m13 = me.f.m();
            ConcurrentHashMap concurrentHashMap = null;
            if (!p001if.a.b(g.class)) {
                try {
                    concurrentHashMap = g.f112339x;
                } catch (Throwable th3) {
                    p001if.a.a(g.class, th3);
                }
            }
            i.e(m13, concurrentHashMap);
            me.f.m().clear();
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }
}
