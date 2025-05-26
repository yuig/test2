package do2;

/* loaded from: classes2.dex */
public final class p0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f55892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kl2.m f55893b;

    public p0(pb.k kVar, kl2.m mVar) {
        this.f55892a = kVar;
        this.f55893b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007c -> B:11:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008e -> B:14:0x008b). Please report as a decompilation issue!!! */
    @Override // do2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(do2.j r10, bl2.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof do2.o0
            if (r0 == 0) goto L13
            r0 = r11
            do2.o0 r0 = (do2.o0) r0
            int r1 = r0.f55876s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55876s = r1
            goto L18
        L13:
            do2.o0 r0 = new do2.o0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f55875r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55876s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            long r5 = r0.f55881x
            java.lang.Throwable r10 = r0.f55880w
            do2.j r2 = r0.f55879v
            do2.p0 r7 = r0.f55878u
            ue.c.H(r11)
            goto L7f
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            long r5 = r0.f55881x
            do2.j r10 = r0.f55879v
            do2.p0 r2 = r0.f55878u
            ue.c.H(r11)
            r7 = r2
        L44:
            r2 = r10
            goto L63
        L46:
            ue.c.H(r11)
            r5 = 0
            r11 = r9
        L4c:
            do2.i r2 = r11.f55892a
            r0.f55878u = r11
            r0.f55879v = r10
            r7 = 0
            r0.f55880w = r7
            r0.f55881x = r5
            r0.f55876s = r4
            java.io.Serializable r2 = lb.l0.F(r0, r2, r10)
            if (r2 != r1) goto L60
            return r1
        L60:
            r7 = r11
            r11 = r2
            goto L44
        L63:
            r10 = r11
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L8e
            kl2.m r11 = r7.f55893b
            java.lang.Long r8 = dl2.b.B(r5)
            r0.f55878u = r7
            r0.f55879v = r2
            r0.f55880w = r10
            r0.f55881x = r5
            r0.f55876s = r3
            java.lang.Object r11 = r11.c(r2, r10, r8, r0)
            if (r11 != r1) goto L7f
            return r1
        L7f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L8d
            r10 = 1
            long r5 = r5 + r10
            r10 = r4
        L8b:
            r11 = r7
            goto L90
        L8d:
            throw r10
        L8e:
            r10 = 0
            goto L8b
        L90:
            if (r10 != 0) goto L95
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        L95:
            r10 = r2
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.p0.collect(do2.j, bl2.c):java.lang.Object");
    }
}
