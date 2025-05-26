package m1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class t0 extends s3.n implements s3.f2, s3.l {

    /* renamed from: p, reason: collision with root package name */
    public f1 f85578p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f85579q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f85580r;

    /* renamed from: s, reason: collision with root package name */
    public o1.l f85581s;

    /* renamed from: t, reason: collision with root package name */
    public co2.q f85582t;

    /* renamed from: u, reason: collision with root package name */
    public o1.b f85583u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f85584v;

    /* renamed from: w, reason: collision with root package name */
    public n3.h0 f85585w;

    public t0(Function1 function1, boolean z13, o1.l lVar, f1 f1Var) {
        this.f85578p = f1Var;
        this.f85579q = function1;
        this.f85580r = z13;
        this.f85581s = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object P0(m1.t0 r5, bl2.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof m1.o0
            if (r0 == 0) goto L16
            r0 = r6
            m1.o0 r0 = (m1.o0) r0
            int r1 = r0.f85491u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f85491u = r1
            goto L1b
        L16:
            m1.o0 r0 = new m1.o0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f85489s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85491u
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            m1.t0 r5 = r0.f85488r
            ue.c.H(r6)
            goto L4f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            ue.c.H(r6)
            o1.b r6 = r5.f85583u
            if (r6 == 0) goto L52
            o1.l r2 = r5.f85581s
            if (r2 == 0) goto L4f
            o1.a r4 = new o1.a
            r4.<init>(r6)
            r0.f85488r = r5
            r0.f85491u = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 != r1) goto L4f
            goto L59
        L4f:
            r6 = 0
            r5.f85583u = r6
        L52:
            r0 = 0
            r5.V0(r0)
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.P0(m1.t0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object Q0(m1.t0 r6, m1.x r7, bl2.c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof m1.p0
            if (r0 == 0) goto L16
            r0 = r8
            m1.p0 r0 = (m1.p0) r0
            int r1 = r0.f85514w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f85514w = r1
            goto L1b
        L16:
            m1.p0 r0 = new m1.p0
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f85512u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85514w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            o1.b r6 = r0.f85511t
            m1.x r7 = r0.f85510s
            m1.t0 r0 = r0.f85509r
            ue.c.H(r8)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            m1.x r7 = r0.f85510s
            m1.t0 r6 = r0.f85509r
            ue.c.H(r8)
            goto L60
        L43:
            ue.c.H(r8)
            o1.b r8 = r6.f85583u
            if (r8 == 0) goto L60
            o1.l r2 = r6.f85581s
            if (r2 == 0) goto L60
            o1.a r5 = new o1.a
            r5.<init>(r8)
            r0.f85509r = r6
            r0.f85510s = r7
            r0.f85514w = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L60
            goto L87
        L60:
            o1.b r8 = new o1.b
            r8.<init>()
            o1.l r2 = r6.f85581s
            if (r2 == 0) goto L7c
            r0.f85509r = r6
            r0.f85510s = r7
            r0.f85511t = r8
            r0.f85514w = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L78
            goto L87
        L78:
            r0 = r6
            r6 = r8
        L7a:
            r8 = r6
            r6 = r0
        L7c:
            r6.f85583u = r8
            long r7 = r7.a()
            r6.U0(r7)
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.Q0(m1.t0, m1.x, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object R0(m1.t0 r5, m1.y r6, bl2.c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof m1.q0
            if (r0 == 0) goto L16
            r0 = r7
            m1.q0 r0 = (m1.q0) r0
            int r1 = r0.f85528v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f85528v = r1
            goto L1b
        L16:
            m1.q0 r0 = new m1.q0
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f85526t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85528v
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            m1.y r6 = r0.f85525s
            m1.t0 r5 = r0.f85524r
            ue.c.H(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ue.c.H(r7)
            o1.b r7 = r5.f85583u
            if (r7 == 0) goto L56
            o1.l r2 = r5.f85581s
            if (r2 == 0) goto L53
            o1.c r4 = new o1.c
            r4.<init>(r7)
            r0.f85524r = r5
            r0.f85525s = r6
            r0.f85528v = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 != r1) goto L53
            goto L5f
        L53:
            r7 = 0
            r5.f85583u = r7
        L56:
            long r6 = r6.a()
            r5.V0(r6)
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.t0.R0(m1.t0, m1.y, bl2.c):java.lang.Object");
    }

    @Override // u2.p
    public final void E0() {
        this.f85584v = false;
        S0();
    }

    public final void S0() {
        o1.b bVar = this.f85583u;
        if (bVar != null) {
            o1.l lVar = this.f85581s;
            if (lVar != null) {
                lVar.b(new o1.a(bVar));
            }
            this.f85583u = null;
        }
    }

    public abstract Object T0(r0 r0Var, bl2.c cVar);

    public abstract void U0(long j13);

    public abstract void V0(long j13);

    public void W(n3.j jVar, n3.k kVar, long j13) {
        if (this.f85580r && this.f85585w == null) {
            n0 n0Var = new n0(this, null);
            n3.j jVar2 = n3.f0.f89054a;
            n3.o0 o0Var = new n3.o0(null, null, null, n0Var);
            M0(o0Var);
            this.f85585w = o0Var;
        }
        n3.h0 h0Var = this.f85585w;
        if (h0Var != null) {
            ((n3.o0) h0Var).W(jVar, kVar, j13);
        }
    }

    public abstract boolean W0();

    public final void X0(Function1 function1, boolean z13, o1.l lVar, f1 f1Var, boolean z14) {
        this.f85579q = function1;
        if (this.f85580r != z13) {
            this.f85580r = z13;
            if (!z13) {
                S0();
                n3.h0 h0Var = this.f85585w;
                if (h0Var != null) {
                    N0(h0Var);
                }
                this.f85585w = null;
            }
            z14 = true;
        }
        if (!Intrinsics.d(this.f85581s, lVar)) {
            S0();
            this.f85581s = lVar;
        }
        if (this.f85578p != f1Var) {
            this.f85578p = f1Var;
        } else if (!z14) {
            return;
        }
        n3.h0 h0Var2 = this.f85585w;
        if (h0Var2 != null) {
            ((n3.o0) h0Var2).O0();
        }
    }

    @Override // s3.f2
    public final void c0() {
        n3.h0 h0Var = this.f85585w;
        if (h0Var != null) {
            ((n3.o0) h0Var).c0();
        }
    }
}
