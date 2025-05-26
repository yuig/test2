package m1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a1 extends t0 {
    public kl2.l A;
    public kl2.l B;
    public boolean C;

    /* renamed from: x, reason: collision with root package name */
    public b1 f85281x;

    /* renamed from: y, reason: collision with root package name */
    public f1 f85282y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f85283z;

    @Override // m1.t0
    public final Object T0(r0 r0Var, bl2.c cVar) {
        Object a13 = this.f85281x.a(k1.v1.UserInput, new x0(r0Var, this, null), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // m1.t0
    public final void U0(long j13) {
        if (!this.f120054m || Intrinsics.d(this.A, w0.f85613a)) {
            return;
        }
        kotlin.jvm.internal.j.z(z0(), null, null, new y0(this, j13, null), 3);
    }

    @Override // m1.t0
    public final void V0(long j13) {
        if (!this.f120054m || Intrinsics.d(this.B, w0.f85614b)) {
            return;
        }
        kotlin.jvm.internal.j.z(z0(), null, null, new z0(this, j13, null), 3);
    }

    @Override // m1.t0
    public final boolean W0() {
        return this.f85283z;
    }
}
