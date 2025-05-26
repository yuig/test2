package do2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class h0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f55808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f55809b;

    public h0(Function2 function2, i iVar) {
        this.f55808a = function2;
        this.f55809b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // do2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(do2.j r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof do2.g0
            if (r0 == 0) goto L13
            r0 = r8
            do2.g0 r0 = (do2.g0) r0
            int r1 = r0.f55796s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55796s = r1
            goto L18
        L13:
            do2.g0 r0 = new do2.g0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f55795r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55796s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            eo2.k0 r7 = r0.f55800w
            do2.j r2 = r0.f55799v
            do2.h0 r4 = r0.f55798u
            ue.c.H(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5e
        L3c:
            r8 = move-exception
            goto L7a
        L3e:
            ue.c.H(r8)
            eo2.k0 r8 = new eo2.k0
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r8.<init>(r7, r2)
            kotlin.jvm.functions.Function2 r2 = r6.f55808a     // Catch: java.lang.Throwable -> L76
            r0.f55798u = r6     // Catch: java.lang.Throwable -> L76
            r0.f55799v = r7     // Catch: java.lang.Throwable -> L76
            r0.f55800w = r8     // Catch: java.lang.Throwable -> L76
            r0.f55796s = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L76
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r4 = r6
            r2 = r7
            r7 = r8
        L5e:
            r7.releaseIntercepted()
            do2.i r7 = r4.f55809b
            r8 = 0
            r0.f55798u = r8
            r0.f55799v = r8
            r0.f55800w = r8
            r0.f55796s = r3
            java.lang.Object r7 = r7.collect(r2, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L76:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L7a:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.h0.collect(do2.j, bl2.c):java.lang.Object");
    }
}
