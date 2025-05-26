package m3;

import androidx.activity.a0;
import ao2.j0;
import kh2.b0;
import s3.j2;
import u2.p;

/* loaded from: classes.dex */
public final class g extends p implements j2, a {

    /* renamed from: n, reason: collision with root package name */
    public a f85740n;

    /* renamed from: o, reason: collision with root package name */
    public d f85741o;

    /* renamed from: p, reason: collision with root package name */
    public final String f85742p;

    public g(a aVar, d dVar) {
        this.f85740n = aVar;
        this.f85741o = dVar == null ? new d() : dVar;
        this.f85742p = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // m3.a
    public final long B(int i13, long j13) {
        boolean z13 = this.f120054m;
        g gVar = null;
        if (z13 && z13) {
            gVar = (g) b0.g0(this);
        }
        long B = gVar != null ? gVar.B(i13, j13) : 0L;
        return a3.c.h(B, this.f85740n.B(i13, a3.c.g(j13, B)));
    }

    @Override // u2.p
    public final void D0() {
        d dVar = this.f85741o;
        dVar.f85726a = this;
        dVar.f85727b = new a0(this, 9);
        dVar.f85728c = z0();
    }

    @Override // u2.p
    public final void E0() {
        d dVar = this.f85741o;
        if (dVar.f85726a == this) {
            dVar.f85726a = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // m3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(long r10, bl2.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof m3.f
            if (r0 == 0) goto L13
            r0 = r12
            m3.f r0 = (m3.f) r0
            int r1 = r0.f85739v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85739v = r1
            goto L18
        L13:
            m3.f r0 = new m3.f
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f85737t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85739v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            long r10 = r0.f85736s
            ue.c.H(r12)
            goto L7f
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            long r10 = r0.f85736s
            m3.g r2 = r0.f85735r
            ue.c.H(r12)
            goto L5e
        L3d:
            ue.c.H(r12)
            boolean r12 = r9.f120054m
            if (r12 == 0) goto L4d
            if (r12 == 0) goto L4d
            s3.j2 r12 = kh2.b0.g0(r9)
            m3.g r12 = (m3.g) r12
            goto L4e
        L4d:
            r12 = r3
        L4e:
            if (r12 == 0) goto L68
            r0.f85735r = r9
            r0.f85736s = r10
            r0.f85739v = r5
            java.lang.Object r12 = r12.L(r10, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            r2 = r9
        L5e:
            n4.o r12 = (n4.o) r12
            long r5 = r12.j()
        L64:
            r7 = r10
            r10 = r5
            r5 = r7
            goto L6c
        L68:
            r5 = 0
            r2 = r9
            goto L64
        L6c:
            m3.a r12 = r2.f85740n
            long r5 = n4.o.f(r5, r10)
            r0.f85735r = r3
            r0.f85736s = r10
            r0.f85739v = r4
            java.lang.Object r12 = r12.L(r5, r0)
            if (r12 != r1) goto L7f
            return r1
        L7f:
            n4.o r12 = (n4.o) r12
            long r0 = r12.j()
            long r10 = n4.o.g(r10, r0)
            n4.o r10 = n4.o.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.g.L(long, bl2.c):java.lang.Object");
    }

    public final j0 M0() {
        g gVar = this.f120054m ? (g) b0.g0(this) : null;
        if (gVar != null) {
            return gVar.M0();
        }
        j0 j0Var = this.f85741o.f85728c;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // m3.a
    public final long Q(int i13, long j13, long j14) {
        long Q = this.f85740n.Q(i13, j13, j14);
        boolean z13 = this.f120054m;
        g gVar = null;
        if (z13 && z13) {
            gVar = (g) b0.g0(this);
        }
        g gVar2 = gVar;
        return a3.c.h(Q, gVar2 != null ? gVar2.Q(i13, a3.c.h(j13, Q), a3.c.g(j14, Q)) : 0L);
    }

    @Override // s3.j2
    public final Object l() {
        return this.f85742p;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // m3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y0(long r16, long r18, bl2.c r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof m3.e
            if (r2 == 0) goto L16
            r2 = r1
            m3.e r2 = (m3.e) r2
            int r3 = r2.f85734w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f85734w = r3
            goto L1b
        L16:
            m3.e r2 = new m3.e
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.f85732u
            cl2.a r9 = cl2.a.COROUTINE_SUSPENDED
            int r3 = r2.f85734w
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L44
            if (r3 == r4) goto L38
            if (r3 != r10) goto L30
            long r2 = r2.f85730s
            ue.c.H(r1)
            goto L94
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            long r3 = r2.f85731t
            long r5 = r2.f85730s
            m3.g r7 = r2.f85729r
            ue.c.H(r1)
            r13 = r3
            r11 = r5
            goto L62
        L44:
            ue.c.H(r1)
            m3.a r3 = r0.f85740n
            r2.f85729r = r0
            r11 = r16
            r2.f85730s = r11
            r13 = r18
            r2.f85731t = r13
            r2.f85734w = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.y0(r4, r6, r8)
            if (r1 != r9) goto L61
            return r9
        L61:
            r7 = r0
        L62:
            n4.o r1 = (n4.o) r1
            long r4 = r1.j()
            boolean r1 = r7.f120054m
            r3 = 0
            if (r1 == 0) goto L76
            if (r1 == 0) goto L76
            s3.j2 r1 = kh2.b0.g0(r7)
            m3.g r1 = (m3.g) r1
            goto L77
        L76:
            r1 = r3
        L77:
            if (r1 == 0) goto L9c
            long r6 = n4.o.g(r11, r4)
            long r11 = n4.o.f(r13, r4)
            r2.f85729r = r3
            r2.f85730s = r4
            r2.f85734w = r10
            r3 = r1
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.y0(r4, r6, r8)
            if (r1 != r9) goto L93
            return r9
        L93:
            r2 = r13
        L94:
            n4.o r1 = (n4.o) r1
            long r4 = r1.j()
            r13 = r2
            goto L9f
        L9c:
            r13 = r4
            r4 = 0
        L9f:
            long r1 = n4.o.g(r13, r4)
            n4.o r1 = n4.o.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.g.y0(long, long, bl2.c):java.lang.Object");
    }
}
