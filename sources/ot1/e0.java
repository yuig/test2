package ot1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f97562a;

    public e0(j0 multiBitWriter) {
        Intrinsics.checkNotNullParameter(multiBitWriter, "multiBitWriter");
        this.f97562a = multiBitWriter;
    }

    public final void a(long j13) {
        long abs = Math.abs(j13);
        xk2.d0 d0Var = xk2.e0.f135207b;
        int F0 = j13 == 0 ? 0 : pp2.a.F0(abs);
        long j14 = ((j13 >> 63) & 1) | (abs << 1);
        j0 j0Var = this.f97562a;
        j0Var.a(F0, 0L);
        j0Var.a(1, 1L);
        j0Var.a(F0, j14);
    }

    public final void b(long j13) {
        long j14 = j13 + 1;
        xk2.d0 d0Var = xk2.e0.f135207b;
        int F0 = pp2.a.F0(j14) - 1;
        j0 j0Var = this.f97562a;
        j0Var.a(F0, 0L);
        j0Var.a(1, 1L);
        j0Var.a(F0, j14);
    }
}
