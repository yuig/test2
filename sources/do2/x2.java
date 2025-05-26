package do2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x2 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f56003a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f56004b;

    public x2(j jVar, Function2 function2) {
        this.f56003a = jVar;
        this.f56004b = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [eo2.k0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof do2.w2
            if (r0 == 0) goto L13
            r0 = r7
            do2.w2 r0 = (do2.w2) r0
            int r1 = r0.f55996v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55996v = r1
            goto L18
        L13:
            do2.w2 r0 = new do2.w2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f55994t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55996v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r7)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            eo2.k0 r2 = r0.f55993s
            do2.x2 r4 = r0.f55992r
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L3a
            goto L5a
        L3a:
            r7 = move-exception
            goto L79
        L3c:
            ue.c.H(r7)
            eo2.k0 r2 = new eo2.k0
            do2.j r7 = r6.f56003a
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2 r7 = r6.f56004b     // Catch: java.lang.Throwable -> L3a
            r0.f55992r = r6     // Catch: java.lang.Throwable -> L3a
            r0.f55993s = r2     // Catch: java.lang.Throwable -> L3a
            r0.f55996v = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r7 != r1) goto L59
            return r1
        L59:
            r4 = r6
        L5a:
            r2.releaseIntercepted()
            do2.j r7 = r4.f56003a
            boolean r2 = r7 instanceof do2.x2
            if (r2 == 0) goto L76
            do2.x2 r7 = (do2.x2) r7
            r2 = 0
            r0.f55992r = r2
            r0.f55993s = r2
            r0.f55996v = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L76:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L79:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.x2.a(bl2.c):java.lang.Object");
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        return this.f56003a.emit(obj, cVar);
    }
}
