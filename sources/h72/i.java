package h72;

import ao2.j0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public l f67977r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f67978s;

    /* renamed from: t, reason: collision with root package name */
    public int f67979t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f67980u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f67980u = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f67980u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[Catch: Exception -> 0x0017, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, Exception -> 0x0017, blocks: (B:7:0x0013, B:9:0x0052, B:11:0x0058, B:18:0x0074, B:22:0x0023, B:23:0x003c, B:25:0x0043, B:28:0x004a, B:29:0x0077, B:32:0x002a), top: B:2:0x0009 }] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f67979t
            r2 = 0
            r3 = 2
            r4 = 1
            h72.l r5 = r8.f67980u
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.util.Iterator r1 = r8.f67978s
            h72.l r4 = r8.f67977r
            ue.c.H(r9)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            goto L52
        L17:
            r9 = move-exception
            goto L7a
        L19:
            r9 = move-exception
            goto L84
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            ue.c.H(r9)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            goto L3c
        L27:
            ue.c.H(r9)
            r8.f67979t = r4     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            n72.a r9 = r5.f67991f     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            ao2.f0 r9 = r9.f89707c     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            h72.f r1 = new h72.f     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            r1.<init>(r5, r2)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r8, r9, r1)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            if (r9 != r0) goto L3c
            return r0
        L3c:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            if (r1 == 0) goto L77
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            if (r1 == 0) goto L4a
            goto L77
        L4a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            r1 = r9
            r4 = r5
        L52:
            boolean r9 = r1.hasNext()     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto L74
            java.lang.Object r9 = r1.next()     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            r72.r1 r9 = (r72.r1) r9     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            r8.f67977r = r4     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            r8.f67978s = r1     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            r8.f67979t = r3     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            n72.a r6 = r4.f67991f     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            ao2.f0 r6 = r6.f89707c     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            h72.h r7 = new h72.h     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            r7.<init>(r4, r9, r2)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r8, r6, r7)     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            if (r9 != r0) goto L52
            return r0
        L74:
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            return r9
        L77:
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Exception -> L17 java.util.concurrent.CancellationException -> L19
            return r9
        L7a:
            n72.m r0 = r5.f67992g
            h72.d r1 = h72.d.f67959m
            r0.d(r9, r1)
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        L84:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h72.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
