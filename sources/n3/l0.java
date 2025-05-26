package n3;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import t3.e4;

/* loaded from: classes.dex */
public final class l0 implements n4.b, bl2.c {

    /* renamed from: a, reason: collision with root package name */
    public final bl2.c f89083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f89084b;

    /* renamed from: c, reason: collision with root package name */
    public ao2.m f89085c;

    /* renamed from: d, reason: collision with root package name */
    public k f89086d = k.Main;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.j f89087e = kotlin.coroutines.j.f80412a;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f89088f;

    public l0(o0 o0Var, ao2.o oVar) {
        this.f89088f = o0Var;
        this.f89083a = oVar;
        this.f89084b = o0Var;
    }

    @Override // n4.b
    public final long A(float f13) {
        return this.f89084b.A(f13);
    }

    @Override // n4.b
    public final int R(float f13) {
        return this.f89084b.R(f13);
    }

    @Override // n4.b
    public final float T(long j13) {
        return this.f89084b.T(j13);
    }

    public final Object a(k kVar, bl2.c frame) {
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        this.f89086d = kVar;
        this.f89085c = oVar;
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    @Override // n4.b
    public final float b() {
        return this.f89084b.b();
    }

    public final long c() {
        o0 o0Var = this.f89088f;
        o0Var.getClass();
        long v03 = o0Var.v0(com.bumptech.glide.c.U0(o0Var).f110832t.d());
        long j13 = o0Var.f89105w;
        return bs1.c.c(Math.max(0.0f, a3.f.d(v03) - ((int) (j13 >> 32))) / 2.0f, Math.max(0.0f, a3.f.b(v03) - ((int) (j13 & 4294967295L))) / 2.0f);
    }

    public final e4 d() {
        o0 o0Var = this.f89088f;
        o0Var.getClass();
        return com.bumptech.glide.c.U0(o0Var).f110832t;
    }

    @Override // n4.b
    public final float f0(int i13) {
        return this.f89084b.f0(i13);
    }

    @Override // n4.b
    public final float g0(float f13) {
        return this.f89084b.g0(f13);
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return this.f89087e;
    }

    @Override // n4.b
    public final float j0() {
        return this.f89084b.j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ao2.o1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [ao2.o1] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(long r7, kotlin.jvm.functions.Function2 r9, bl2.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof n3.i0
            if (r0 == 0) goto L13
            r0 = r10
            n3.i0 r0 = (n3.i0) r0
            int r1 = r0.f89069u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89069u = r1
            goto L18
        L13:
            n3.i0 r0 = new n3.i0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f89067s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f89069u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ao2.k2 r7 = r0.f89066r
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L29
            goto L6a
        L29:
            r8 = move-exception
            goto L70
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ue.c.H(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4e
            ao2.m r10 = r6.f89085c
            if (r10 == 0) goto L4e
            xk2.q r2 = xk2.s.f135225b
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r2.<init>(r7)
            xk2.r r2 = ue.c.m(r2)
            r10.resumeWith(r2)
        L4e:
            n3.o0 r10 = r6.f89088f
            ao2.j0 r10 = r10.z0()
            n3.j0 r2 = new n3.j0
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            ao2.k2 r7 = kotlin.jvm.internal.j.z(r10, r4, r4, r2, r7)
            r0.f89066r = r7     // Catch: java.lang.Throwable -> L29
            r0.f89069u = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 != r1) goto L6a
            return r1
        L6a:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r8 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f17435a
            r7.cancel(r8)
            return r10
        L70:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f17435a
            r7.cancel(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.l0.l(long, kotlin.jvm.functions.Function2, bl2.c):java.lang.Object");
    }

    @Override // n4.b
    public final float l0(float f13) {
        return this.f89084b.b() * f13;
    }

    @Override // n4.b
    public final long o(float f13) {
        return this.f89084b.o(f13);
    }

    @Override // n4.b
    public final long p(long j13) {
        return this.f89084b.p(j13);
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        o0 o0Var = this.f89088f;
        synchronized (o0Var.f89102t) {
            o0Var.f89102t.n(this);
            Unit unit = Unit.f80348a;
        }
        this.f89083a.resumeWith(obj);
    }

    @Override // n4.b
    public final float t(long j13) {
        return this.f89084b.t(j13);
    }

    @Override // n4.b
    public final long v0(long j13) {
        return this.f89084b.v0(j13);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(long r5, m1.q2 r7, bl2.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof n3.k0
            if (r0 == 0) goto L13
            r0 = r8
            n3.k0 r0 = (n3.k0) r0
            int r1 = r0.f89079t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89079t = r1
            goto L18
        L13:
            n3.k0 r0 = new n3.k0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f89077r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f89079t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ue.c.H(r8)
            r0.f89079t = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            java.lang.Object r8 = r4.l(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            if (r8 != r1) goto L3c
            return r1
        L3b:
            r8 = 0
        L3c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.l0.z(long, m1.q2, bl2.c):java.lang.Object");
    }
}
