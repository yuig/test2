package s3;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a1 extends z0 implements q3.o0 {

    /* renamed from: l, reason: collision with root package name */
    public final q1 f110732l;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashMap f110734n;

    /* renamed from: p, reason: collision with root package name */
    public q3.q0 f110736p;

    /* renamed from: m, reason: collision with root package name */
    public long f110733m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final q3.n0 f110735o = new q3.n0(this);

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f110737q = new LinkedHashMap();

    public a1(q1 q1Var) {
        this.f110732l = q1Var;
    }

    public static final void K0(a1 a1Var, q3.q0 q0Var) {
        Unit unit;
        LinkedHashMap linkedHashMap;
        if (q0Var != null) {
            a1Var.getClass();
            a1Var.w0(lb.l0.d(q0Var.j(), q0Var.i()));
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            a1Var.w0(0L);
        }
        if (!Intrinsics.d(a1Var.f110736p, q0Var) && q0Var != null && ((((linkedHashMap = a1Var.f110734n) != null && !linkedHashMap.isEmpty()) || (!q0Var.c().isEmpty())) && !Intrinsics.d(q0Var.c(), a1Var.f110734n))) {
            q0 q0Var2 = a1Var.f110732l.f110898l.f110838z.f110985s;
            Intrinsics.f(q0Var2);
            q0Var2.f110889r.g();
            LinkedHashMap linkedHashMap2 = a1Var.f110734n;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                a1Var.f110734n = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(q0Var.c());
        }
        a1Var.f110736p = q0Var;
    }

    @Override // s3.z0
    public final z0 A0() {
        q1 q1Var = this.f110732l.f110900n;
        if (q1Var != null) {
            return q1Var.V0();
        }
        return null;
    }

    @Override // s3.z0
    public final q3.x B0() {
        return this.f110735o;
    }

    @Override // s3.z0
    public final boolean C0() {
        return this.f110736p != null;
    }

    @Override // s3.z0
    public final k0 D0() {
        return this.f110732l.f110898l;
    }

    @Override // s3.z0
    public final q3.q0 E0() {
        q3.q0 q0Var = this.f110736p;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // s3.z0
    public final z0 F0() {
        q1 q1Var = this.f110732l.f110901o;
        if (q1Var != null) {
            return q1Var.V0();
        }
        return null;
    }

    @Override // s3.z0
    public final long G0() {
        return this.f110733m;
    }

    @Override // s3.z0
    public final void J0() {
        u0(this.f110733m, 0.0f, null);
    }

    @Override // s3.z0, q3.s
    public final boolean K() {
        return true;
    }

    public final int L0(q3.a aVar) {
        Integer num = (Integer) this.f110737q.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final q1 M0() {
        return this.f110732l;
    }

    public final void N0(long j13) {
        if (!n4.h.a(this.f110733m, j13)) {
            this.f110733m = j13;
            q1 q1Var = this.f110732l;
            q0 q0Var = q1Var.f110898l.f110838z.f110985s;
            if (q0Var != null) {
                q0Var.G0();
            }
            z0.H0(q1Var);
        }
        if (this.f111014h) {
            return;
        }
        z0(new e2(E0(), this));
    }

    public final long O0(a1 a1Var, boolean z13) {
        long j13 = 0;
        a1 a1Var2 = this;
        while (!Intrinsics.d(a1Var2, a1Var)) {
            if (!a1Var2.f111012f || !z13) {
                j13 = n4.h.c(j13, a1Var2.f110733m);
            }
            q1 q1Var = a1Var2.f110732l.f110901o;
            Intrinsics.f(q1Var);
            a1Var2 = q1Var.V0();
            Intrinsics.f(a1Var2);
        }
        return j13;
    }

    @Override // q3.s0, q3.r
    public final Object a() {
        return this.f110732l.a();
    }

    @Override // n4.b
    public final float b() {
        return this.f110732l.b();
    }

    @Override // q3.s
    public final n4.k getLayoutDirection() {
        return this.f110732l.f110898l.f110831s;
    }

    @Override // n4.b
    public final float j0() {
        return this.f110732l.j0();
    }

    @Override // q3.c1
    public final void u0(long j13, float f13, Function1 function1) {
        N0(j13);
        if (this.f111013g) {
        }
        w wVar = (w) this;
        switch (wVar.f110989r) {
            case 0:
                q0 q0Var = wVar.f110732l.f110898l.f110838z.f110985s;
                Intrinsics.f(q0Var);
                q0Var.J0();
                break;
            default:
                wVar.E0().d();
                break;
        }
    }
}
