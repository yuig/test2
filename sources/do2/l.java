package do2;

/* loaded from: classes4.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55839b;

    public /* synthetic */ l(Object obj, int i13) {
        this.f55838a = i13;
        this.f55839b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    @Override // do2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(do2.j r7, bl2.c r8) {
        /*
            r6 = this;
            int r0 = r6.f55838a
            java.lang.Object r1 = r6.f55839b
            switch(r0) {
                case 0: goto L37;
                case 1: goto L2b;
                default: goto L7;
            }
        L7:
            eo2.f0 r0 = new eo2.f0
            kl2.l r1 = (kl2.l) r1
            r2 = 0
            r0.<init>(r1, r7, r2)
            eo2.e0 r7 = new eo2.e0
            kotlin.coroutines.CoroutineContext r1 = r8.getContext()
            r7.<init>(r8, r1)
            java.lang.Object r7 = com.bumptech.glide.c.i1(r7, r7, r0)
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            if (r7 != r0) goto L25
            java.lang.String r1 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
        L25:
            if (r7 != r0) goto L28
            goto L2a
        L28:
            kotlin.Unit r7 = kotlin.Unit.f80348a
        L2a:
            return r7
        L2b:
            java.lang.Object r7 = r7.emit(r1, r8)
            cl2.a r8 = cl2.a.COROUTINE_SUSPENDED
            if (r7 != r8) goto L34
            goto L36
        L34:
            kotlin.Unit r7 = kotlin.Unit.f80348a
        L36:
            return r7
        L37:
            boolean r0 = r8 instanceof do2.k
            if (r0 == 0) goto L4a
            r0 = r8
            do2.k r0 = (do2.k) r0
            int r2 = r0.f55830s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L4a
            int r2 = r2 - r3
            r0.f55830s = r2
            goto L4f
        L4a:
            do2.k r0 = new do2.k
            r0.<init>(r6, r8)
        L4f:
            java.lang.Object r8 = r0.f55829r
            cl2.a r2 = cl2.a.COROUTINE_SUSPENDED
            int r3 = r0.f55830s
            r4 = 1
            if (r3 == 0) goto L6b
            if (r3 != r4) goto L63
            java.util.Iterator r7 = r0.f55833v
            do2.j r1 = r0.f55832u
            ue.c.H(r8)
            r8 = r1
            goto L77
        L63:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L6b:
            ue.c.H(r8)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r8 = r1.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
        L77:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r7.next()
            r0.f55832u = r8
            r0.f55833v = r7
            r0.f55830s = r4
            java.lang.Object r1 = r8.emit(r1, r0)
            if (r1 != r2) goto L77
            goto L90
        L8e:
            kotlin.Unit r2 = kotlin.Unit.f80348a
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.l.collect(do2.j, bl2.c):java.lang.Object");
    }
}
