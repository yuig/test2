package do2;

/* loaded from: classes4.dex */
public final class y0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f56008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f56010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f56011d;

    public y0(kotlin.jvm.internal.h0 h0Var, int i13, j jVar, Object obj) {
        this.f56008a = h0Var;
        this.f56009b = i13;
        this.f56010c = jVar;
        this.f56011d = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof do2.x0
            if (r0 == 0) goto L13
            r0 = r8
            do2.x0 r0 = (do2.x0) r0
            int r1 = r0.f56002t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56002t = r1
            goto L18
        L13:
            do2.x0 r0 = new do2.x0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f56000r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f56002t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L5d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            ue.c.H(r8)
            goto L4f
        L36:
            ue.c.H(r8)
            kotlin.jvm.internal.h0 r8 = r6.f56008a
            int r2 = r8.f80426a
            int r2 = r2 + r4
            r8.f80426a = r2
            int r8 = r6.f56009b
            do2.j r5 = r6.f56010c
            if (r2 >= r8) goto L52
            r0.f56002t = r4
            java.lang.Object r7 = r5.emit(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L52:
            r0.f56002t = r3
            java.lang.Object r8 = r6.f56011d
            cl2.a r7 = dl2.b.i(r5, r7, r8, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.y0.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
