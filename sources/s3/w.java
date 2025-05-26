package s3;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends a1 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f110989r = 1;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q1 f110990s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar) {
        super(xVar);
        this.f110990s = xVar;
    }

    @Override // q3.r
    public final int D(int i13) {
        switch (this.f110989r) {
            case 0:
                return this.f110732l.f110898l.u().h(i13);
            default:
                d0 d0Var = (d0) this.f110990s;
                c0 c0Var = d0Var.L;
                q1 q1Var = d0Var.f110900n;
                Intrinsics.f(q1Var);
                a1 V0 = q1Var.V0();
                Intrinsics.f(V0);
                return c0Var.e(this, V0, i13);
        }
    }

    @Override // q3.r
    public final int N(int i13) {
        switch (this.f110989r) {
            case 0:
                return this.f110732l.f110898l.u().i(i13);
            default:
                d0 d0Var = (d0) this.f110990s;
                c0 c0Var = d0Var.L;
                q1 q1Var = d0Var.f110900n;
                Intrinsics.f(q1Var);
                a1 V0 = q1Var.V0();
                Intrinsics.f(V0);
                return c0Var.a(this, V0, i13);
        }
    }

    @Override // q3.r
    public final int P(int i13) {
        switch (this.f110989r) {
            case 0:
                return this.f110732l.f110898l.u().e(i13);
            default:
                d0 d0Var = (d0) this.f110990s;
                c0 c0Var = d0Var.L;
                q1 q1Var = d0Var.f110900n;
                Intrinsics.f(q1Var);
                a1 V0 = q1Var.V0();
                Intrinsics.f(V0);
                return c0Var.h(this, V0, i13);
        }
    }

    @Override // q3.o0
    public final q3.c1 Q(long j13) {
        switch (this.f110989r) {
            case 0:
                x0(j13);
                q1 q1Var = this.f110732l;
                k2.e y13 = q1Var.f110898l.y();
                int i13 = y13.f78184c;
                if (i13 > 0) {
                    Object[] objArr = y13.f78182a;
                    int i14 = 0;
                    do {
                        q0 q0Var = ((k0) objArr[i14]).f110838z.f110985s;
                        Intrinsics.f(q0Var);
                        q0Var.f110880i = i0.NotUsed;
                        i14++;
                    } while (i14 < i13);
                }
                k0 k0Var = q1Var.f110898l;
                a1.K0(this, k0Var.f110828p.a(this, k0Var.m(), j13));
                break;
            default:
                d0 d0Var = (d0) this.f110990s;
                x0(j13);
                d0Var.getClass();
                c0 c0Var = d0Var.L;
                q1 q1Var2 = d0Var.f110900n;
                Intrinsics.f(q1Var2);
                a1 V0 = q1Var2.V0();
                Intrinsics.f(V0);
                a1.K0(this, c0Var.i(this, V0, j13));
                break;
        }
        return this;
    }

    @Override // q3.r
    public final int d(int i13) {
        switch (this.f110989r) {
            case 0:
                return this.f110732l.f110898l.u().d(i13);
            default:
                d0 d0Var = (d0) this.f110990s;
                c0 c0Var = d0Var.L;
                q1 q1Var = d0Var.f110900n;
                Intrinsics.f(q1Var);
                a1 V0 = q1Var.V0();
                Intrinsics.f(V0);
                return c0Var.d(this, V0, i13);
        }
    }

    @Override // s3.z0
    public final int y0(q3.a aVar) {
        LinkedHashMap linkedHashMap = this.f110737q;
        switch (this.f110989r) {
            case 0:
                q0 q0Var = this.f110732l.f110898l.f110838z.f110985s;
                Intrinsics.f(q0Var);
                boolean z13 = q0Var.f110881j;
                w0 w0Var = q0Var.f110889r;
                if (!z13) {
                    v0 v0Var = q0Var.f110896y;
                    if (v0Var.f110969c == g0.LookaheadMeasuring) {
                        w0Var.f110728f = true;
                        if (w0Var.f110724b) {
                            v0Var.f110974h = true;
                            v0Var.f110975i = true;
                        }
                    } else {
                        w0Var.f110729g = true;
                    }
                }
                a1 a1Var = q0Var.F().M;
                if (a1Var != null) {
                    a1Var.f111014h = true;
                }
                q0Var.x();
                a1 a1Var2 = q0Var.F().M;
                if (a1Var2 != null) {
                    a1Var2.f111014h = false;
                }
                Integer num = (Integer) w0Var.f110731i.get(aVar);
                int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
                linkedHashMap.put(aVar, Integer.valueOf(intValue));
                return intValue;
            default:
                int m13 = kh2.n.m(this, aVar);
                linkedHashMap.put(aVar, Integer.valueOf(m13));
                return m13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d0 d0Var) {
        super(d0Var);
        this.f110990s = d0Var;
    }
}
