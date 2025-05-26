package m1;

/* loaded from: classes2.dex */
public final class j1 implements g1, n4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n4.b f85392a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f85393b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f85394c;

    /* renamed from: d, reason: collision with root package name */
    public final mo2.c f85395d;

    public j1(n4.b bVar) {
        this.f85392a = bVar;
        fi.b bVar2 = mo2.d.f87812a;
        this.f85395d = new mo2.c(false);
    }

    @Override // n4.b
    public final long A(float f13) {
        return this.f85392a.A(f13);
    }

    @Override // n4.b
    public final int R(float f13) {
        return this.f85392a.R(f13);
    }

    @Override // n4.b
    public final float T(long j13) {
        return this.f85392a.T(j13);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof m1.h1
            if (r0 == 0) goto L13
            r0 = r5
            m1.h1 r0 = (m1.h1) r0
            int r1 = r0.f85368u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85368u = r1
            goto L18
        L13:
            m1.h1 r0 = new m1.h1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f85366s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85368u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            m1.j1 r0 = r0.f85365r
            ue.c.H(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ue.c.H(r5)
            r0.f85365r = r4
            r0.f85368u = r3
            r5 = 0
            mo2.c r2 = r4.f85395d
            java.lang.Object r5 = r2.f(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            r0 = r4
        L43:
            r5 = 0
            r0.f85393b = r5
            r0.f85394c = r5
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.j1.a(bl2.c):java.lang.Object");
    }

    @Override // n4.b
    public final float b() {
        return this.f85392a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof m1.i1
            if (r0 == 0) goto L13
            r0 = r6
            m1.i1 r0 = (m1.i1) r0
            int r1 = r0.f85376u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85376u = r1
            goto L18
        L13:
            m1.i1 r0 = new m1.i1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f85374s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85376u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            m1.j1 r0 = r0.f85373r
            ue.c.H(r6)
            goto L4b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ue.c.H(r6)
            boolean r6 = r5.f85393b
            if (r6 != 0) goto L51
            boolean r6 = r5.f85394c
            if (r6 != 0) goto L51
            r0.f85373r = r5
            r0.f85376u = r4
            mo2.c r6 = r5.f85395d
            java.lang.Object r6 = r6.f(r3, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            mo2.c r6 = r0.f85395d
            r6.i(r3)
            goto L52
        L51:
            r0 = r5
        L52:
            boolean r6 = r0.f85393b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.j1.c(bl2.c):java.lang.Object");
    }

    @Override // n4.b
    public final float f0(int i13) {
        return this.f85392a.f0(i13);
    }

    @Override // n4.b
    public final float g0(float f13) {
        return this.f85392a.g0(f13);
    }

    @Override // n4.b
    public final float j0() {
        return this.f85392a.j0();
    }

    @Override // n4.b
    public final float l0(float f13) {
        return this.f85392a.l0(f13);
    }

    @Override // n4.b
    public final long o(float f13) {
        return this.f85392a.o(f13);
    }

    @Override // n4.b
    public final long p(long j13) {
        return this.f85392a.p(j13);
    }

    @Override // n4.b
    public final float t(long j13) {
        return this.f85392a.t(j13);
    }

    @Override // n4.b
    public final long v0(long j13) {
        return this.f85392a.v0(j13);
    }
}
