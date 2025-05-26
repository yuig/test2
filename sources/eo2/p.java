package eo2;

/* loaded from: classes2.dex */
public final class p implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f59809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f59810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f59811c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ do2.j f59812d;

    public p(kotlin.jvm.internal.j0 j0Var, ao2.j0 j0Var2, r rVar, do2.j jVar) {
        this.f59809a = j0Var;
        this.f59810b = j0Var2;
        this.f59811c = rVar;
        this.f59812d = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof eo2.o
            if (r0 == 0) goto L13
            r0 = r9
            eo2.o r0 = (eo2.o) r0
            int r1 = r0.f59807w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59807w = r1
            goto L18
        L13:
            eo2.o r0 = new eo2.o
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f59805u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f59807w
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            ao2.o1 r8 = r0.f59804t
            ao2.o1 r8 = (ao2.o1) r8
            java.lang.Object r8 = r0.f59803s
            eo2.p r0 = r0.f59802r
            ue.c.H(r9)
            goto L5d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            ue.c.H(r9)
            kotlin.jvm.internal.j0 r9 = r7.f59809a
            java.lang.Object r9 = r9.f80434a
            ao2.o1 r9 = (ao2.o1) r9
            if (r9 == 0) goto L5c
            kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r2.<init>()
            r9.cancel(r2)
            r0.f59802r = r7
            r0.f59803s = r8
            r2 = r9
            ao2.o1 r2 = (ao2.o1) r2
            r0.f59804t = r2
            r0.f59807w = r3
            java.lang.Object r9 = r9.join(r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            r0 = r7
        L5d:
            kotlin.jvm.internal.j0 r9 = r0.f59809a
            ao2.l0 r1 = ao2.l0.UNDISPATCHED
            eo2.n r2 = new eo2.n
            do2.j r4 = r0.f59812d
            eo2.r r5 = r0.f59811c
            r6 = 0
            r2.<init>(r5, r4, r8, r6)
            ao2.j0 r8 = r0.f59810b
            ao2.k2 r8 = kotlin.jvm.internal.j.z(r8, r6, r1, r2, r3)
            r9.f80434a = r8
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: eo2.p.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
