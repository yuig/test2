package s1;

import java.util.concurrent.CancellationException;
import m1.f1;

/* loaded from: classes2.dex */
public final class a implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f110364a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f110365b;

    public a(o0 o0Var, f1 f1Var) {
        this.f110364a = o0Var;
        this.f110365b = f1Var;
    }

    @Override // m3.a
    public final long B(int i13, long j13) {
        if (i13 == 1) {
            o0 o0Var = this.f110364a;
            if (Math.abs(o0Var.f110493c.f110450c.h()) > 1.0E-6d) {
                i0 i0Var = o0Var.f110493c;
                float h10 = i0Var.f110450c.h() * o0Var.o();
                float f13 = ((((f0) o0Var.m()).f110419b + ((f0) o0Var.m()).f110420c) * (-Math.signum(i0Var.f110450c.h()))) + h10;
                if (i0Var.f110450c.h() > 0.0f) {
                    f13 = h10;
                    h10 = f13;
                }
                f1 f1Var = f1.Horizontal;
                f1 f1Var2 = this.f110365b;
                float f14 = -o0Var.f110500j.f(-ql2.s.f(f1Var2 == f1Var ? a3.c.d(j13) : a3.c.e(j13), h10, f13));
                float d2 = f1Var2 == f1Var ? f14 : a3.c.d(j13);
                if (f1Var2 != f1.Vertical) {
                    f14 = a3.c.e(j13);
                }
                return (Float.floatToRawIntBits(d2) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
            }
        }
        return 0L;
    }

    @Override // m3.a
    public final long Q(int i13, long j13, long j14) {
        if (i13 != 2) {
            return 0L;
        }
        if ((this.f110365b == f1.Horizontal ? a3.c.d(j14) : a3.c.e(j14)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // m3.a
    public final Object y0(long j13, long j14, bl2.c cVar) {
        return new n4.o(this.f110365b == f1.Vertical ? n4.o.b(j14, 0.0f, 0.0f, 2) : n4.o.b(j14, 0.0f, 0.0f, 1));
    }
}
