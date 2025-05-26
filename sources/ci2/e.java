package ci2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ih2.a f27772a;

    /* renamed from: b, reason: collision with root package name */
    public final hh2.a f27773b;

    /* renamed from: c, reason: collision with root package name */
    public final uh2.b f27774c;

    /* renamed from: d, reason: collision with root package name */
    public final ei2.a f27775d;

    public e(ih2.a gatingService, hh2.a sessionEnvelopeSource, uh2.b preferencesService, ei2.a currentSessionSpan) {
        Intrinsics.checkNotNullParameter(gatingService, "gatingService");
        Intrinsics.checkNotNullParameter(sessionEnvelopeSource, "sessionEnvelopeSource");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(currentSessionSpan, "currentSessionSpan");
        this.f27772a = gatingService;
        this.f27773b = sessionEnvelopeSource;
        this.f27774c = preferencesService;
        this.f27775d = currentSessionSpan;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02f6, code lost:
    
        if (kotlin.collections.CollectionsKt.J0(r2).contains("errors") != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03c7, code lost:
    
        if (r16 == false) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v48, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.embrace.android.embracesdk.internal.payload.Envelope a(e2.g0 r26) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci2.e.a(e2.g0):io.embrace.android.embracesdk.internal.payload.Envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yh2.c b(ci2.b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            ei2.a r0 = r9.f27775d
            java.util.concurrent.atomic.AtomicReference r1 = r0.f58966i
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L48
            java.util.concurrent.atomic.AtomicReference r1 = r0.f58966i
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference r2 = r0.f58966i     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L42
            java.util.concurrent.atomic.AtomicReference r2 = r0.f58966i     // Catch: java.lang.Throwable -> L40
            zi2.b r3 = r0.f58958a     // Catch: java.lang.Throwable -> L40
            long r3 = r3.now()     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L40
            long r3 = r5.toMillis(r3)     // Catch: java.lang.Throwable -> L40
            ei2.k r3 = r0.n(r3)     // Catch: java.lang.Throwable -> L40
            r2.set(r3)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.atomic.AtomicReference r0 = r0.f58966i     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L40
            ei2.q r0 = (ei2.q) r0     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3e
            ei2.k r0 = (ei2.k) r0     // Catch: java.lang.Throwable -> L40
            r0.b()     // Catch: java.lang.Throwable -> L40
        L3e:
            monitor-exit(r1)
            goto L57
        L40:
            r10 = move-exception
            goto L46
        L42:
            kotlin.Unit r2 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L40
            monitor-exit(r1)
            goto L48
        L46:
            monitor-exit(r1)
            throw r10
        L48:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f58966i
            java.lang.Object r0 = r0.get()
            ei2.q r0 = (ei2.q) r0
            if (r0 == 0) goto L57
            ei2.k r0 = (ei2.k) r0
            r0.b()
        L57:
            ei2.a r0 = r9.f27775d
            java.util.concurrent.atomic.AtomicReference r0 = r0.f58966i
            java.lang.Object r0 = r0.get()
            ei2.q r0 = (ei2.q) r0
            if (r0 == 0) goto L80
            ri2.e r1 = tj2.f.f117934a
            java.lang.String r2 = "SESSION_ID"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            ei2.k r0 = (ei2.k) r0
            java.lang.String r2 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.concurrent.ConcurrentHashMap r0 = r0.f59011m
            java.lang.String r1 = r1.f108404b
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L7e
            goto L80
        L7e:
            r2 = r0
            goto L83
        L80:
            java.lang.String r0 = ""
            goto L7e
        L83:
            long r3 = r10.f27765c
            boolean r7 = r10.f27763a
            th2.h r6 = r10.f27766d
            th2.i r8 = r10.f27764b
            uh2.b r0 = r9.f27774c
            java.lang.String r1 = "service"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int[] r1 = ci2.a.f27762a
            th2.h r10 = r10.f27766d
            int r10 = r10.ordinal()
            r10 = r1[r10]
            r1 = 1
            if (r10 == r1) goto Lb2
            r1 = 2
            if (r10 != r1) goto Lac
            uh2.a r0 = (uh2.a) r0
            java.lang.String r10 = "io.embrace.bgactivitynumber"
            int r10 = r0.b(r10)
        Laa:
            r5 = r10
            goto Lbb
        Lac:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        Lb2:
            uh2.a r0 = (uh2.a) r0
            java.lang.String r10 = "io.embrace.sessionnumber"
            int r10 = r0.b(r10)
            goto Laa
        Lbb:
            yh2.c r10 = new yh2.c
            r1 = r10
            r1.<init>(r2, r3, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ci2.e.b(ci2.b):yh2.c");
    }
}
