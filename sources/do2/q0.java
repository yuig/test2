package do2;

/* loaded from: classes4.dex */
public final class q0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f55904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f55905c = 1;

    public /* synthetic */ q0(i iVar, int i13) {
        this.f55903a = i13;
        this.f55904b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    @Override // do2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(do2.j r9, bl2.c r10) {
        /*
            r8 = this;
            int r0 = r8.f55903a
            int r1 = r8.f55905c
            do2.i r2 = r8.f55904b
            r3 = 1
            switch(r0) {
                case 0: goto L65;
                default: goto La;
            }
        La:
            boolean r0 = r10 instanceof do2.w0
            if (r0 == 0) goto L1d
            r0 = r10
            do2.w0 r0 = (do2.w0) r0
            int r4 = r0.f55988s
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1d
            int r4 = r4 - r5
            r0.f55988s = r4
            goto L22
        L1d:
            do2.w0 r0 = new do2.w0
            r0.<init>(r8, r10)
        L22:
            java.lang.Object r10 = r0.f55987r
            cl2.a r4 = cl2.a.COROUTINE_SUSPENDED
            int r5 = r0.f55988s
            if (r5 == 0) goto L3c
            if (r5 != r3) goto L34
            java.lang.Object r9 = r0.f55990u
            ue.c.H(r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L32
            goto L61
        L32:
            r10 = move-exception
            goto L5d
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            ue.c.H(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            kotlin.jvm.internal.h0 r5 = new kotlin.jvm.internal.h0
            r5.<init>()
            do2.y0 r6 = new do2.y0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r6.<init>(r5, r1, r9, r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f55990u = r10     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f55988s = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            java.lang.Object r9 = r2.collect(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            if (r9 != r4) goto L61
            goto L63
        L59:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L5d:
            java.lang.Object r0 = r10.f80509a
            if (r0 != r9) goto L64
        L61:
            kotlin.Unit r4 = kotlin.Unit.f80348a
        L63:
            return r4
        L64:
            throw r10
        L65:
            kotlin.jvm.internal.h0 r0 = new kotlin.jvm.internal.h0
            r0.<init>()
            by1.f r4 = new by1.f
            r4.<init>(r0, r1, r9, r3)
            java.lang.Object r9 = r2.collect(r4, r10)
            cl2.a r10 = cl2.a.COROUTINE_SUSPENDED
            if (r9 != r10) goto L78
            goto L7a
        L78:
            kotlin.Unit r9 = kotlin.Unit.f80348a
        L7a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.q0.collect(do2.j, bl2.c):java.lang.Object");
    }
}
