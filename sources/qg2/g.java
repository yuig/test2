package qg2;

import io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCalls;
import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class g implements Closeable, c {

    /* renamed from: a, reason: collision with root package name */
    public final a f103862a;

    /* renamed from: b, reason: collision with root package name */
    public final ki2.e f103863b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f103864c;

    public g(a cacheService, ki2.e priorityWorker) {
        Intrinsics.checkNotNullParameter(cacheService, "cacheService");
        Intrinsics.checkNotNullParameter(priorityWorker, "priorityWorker");
        this.f103862a = cacheService;
        this.f103863b = priorityWorker;
        this.f103864c = new LinkedHashMap();
    }

    public final void a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        b bVar = (b) this.f103864c.get(sessionId);
        if (bVar != null) {
            ki2.f fVar = ki2.f.NORMAL;
            this.f103863b.a(new x62.c(this, bVar, sessionId, 4), fVar);
        }
    }

    public final void c(m queue, boolean z13) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        queue.getClass();
        PendingApiCalls pendingApiCalls = new PendingApiCalls(new HashMap(queue.f103879a));
        if (z13) {
            ((e) this.f103862a).a(pendingApiCalls, "failed_api_calls.json", PendingApiCalls.class);
            return;
        }
        ki2.f fVar = ki2.f.NORMAL;
        this.f103863b.a(new f(0, this, pendingApiCalls), fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(String sessionId, long j13, Function1 function1) {
        try {
            q qVar = s.f135225b;
            synchronized (this.f103864c) {
                Object obj = this.f103864c.get(sessionId);
                if (obj == null) {
                    Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                    obj = new b(sessionId, j13, "last_session." + j13 + '.' + sessionId + ".v2.json");
                }
                b bVar = (b) obj;
                function1.invoke(bVar.f103855c);
                if (!this.f103864c.containsKey(bVar.f103853a)) {
                    this.f103864c.put(bVar.f103853a, bVar);
                }
            }
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[LOOP:1: B:18:0x007c->B:19:0x007e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r9, kotlin.jvm.functions.Function1 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sessionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "transformer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.LinkedHashMap r1 = r8.f103864c
            java.lang.Object r9 = r1.get(r9)
            qg2.b r9 = (qg2.b) r9
            if (r9 == 0) goto L95
            java.lang.String r9 = r9.f103855c
            if (r9 != 0) goto L1a
            goto L95
        L1a:
            qg2.a r1 = r8.f103862a
            qg2.e r1 = (qg2.e) r1
            r1.getClass()
            java.lang.String r2 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.c(r9)
            java.lang.String r3 = "findLock(name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r0.readLock()
            int r4 = r0.getWriteHoldCount()
            r5 = 0
            if (r4 != 0) goto L42
            int r4 = r0.getReadHoldCount()
            goto L43
        L42:
            r4 = r5
        L43:
            r6 = r5
        L44:
            if (r6 >= r4) goto L4c
            r3.unlock()
            int r6 = r6 + 1
            goto L44
        L4c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            xk2.q r6 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L74
            com.squareup.moshi.internal.Util$ParameterizedTypeImpl r6 = io.embrace.android.embracesdk.internal.payload.Envelope.f73106f     // Catch: java.lang.Throwable -> L74
            java.lang.Object r7 = r1.d(r9, r6)     // Catch: java.lang.Throwable -> L74
            io.embrace.android.embracesdk.internal.payload.Envelope r7 = (io.embrace.android.embracesdk.internal.payload.Envelope) r7     // Catch: java.lang.Throwable -> L74
            if (r7 != 0) goto L60
            goto L7a
        L60:
            java.lang.Object r10 = r10.invoke(r7)     // Catch: java.lang.Throwable -> L74
            io.embrace.android.embracesdk.internal.payload.Envelope r10 = (io.embrace.android.embracesdk.internal.payload.Envelope) r10     // Catch: java.lang.Throwable -> L74
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "envelope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)     // Catch: java.lang.Throwable -> L74
            r1.a(r10, r9, r6)     // Catch: java.lang.Throwable -> L74
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L74
            goto L7a
        L74:
            r9 = move-exception
            xk2.q r10 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L88
            ue.c.m(r9)     // Catch: java.lang.Throwable -> L88
        L7a:
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L88
        L7c:
            if (r5 >= r4) goto L84
            r3.lock()
            int r5 = r5 + 1
            goto L7c
        L84:
            r0.unlock()
            return
        L88:
            r9 = move-exception
        L89:
            if (r5 >= r4) goto L91
            r3.lock()
            int r5 = r5 + 1
            goto L89
        L91:
            r0.unlock()
            throw r9
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.g.e(java.lang.String, kotlin.jvm.functions.Function1):void");
    }
}
