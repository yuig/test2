package q3;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements r0, s {

    /* renamed from: a, reason: collision with root package name */
    public final s3.d0 f102203a;

    public f(s3.d0 d0Var) {
        this.f102203a = d0Var;
    }

    @Override // n4.b
    public final long A(float f13) {
        return this.f102203a.A(f13);
    }

    @Override // q3.s
    public final boolean K() {
        return false;
    }

    @Override // n4.b
    public final int R(float f13) {
        return this.f102203a.R(f13);
    }

    @Override // n4.b
    public final float T(long j13) {
        return this.f102203a.T(j13);
    }

    @Override // q3.r0
    public final q0 Y(int i13, int i14, Map map, Function1 function1) {
        if ((i13 & (-16777216)) == 0 && ((-16777216) & i14) == 0) {
            return new e(i13, i14, map, function1, this);
        }
        jk.r.y("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    public final void a() {
        s3.a1 a1Var = this.f102203a.M;
        Intrinsics.f(a1Var);
        q0 E0 = a1Var.E0();
        E0.j();
        E0.i();
    }

    @Override // n4.b
    public final float b() {
        return this.f102203a.b();
    }

    @Override // n4.b
    public final float f0(int i13) {
        return this.f102203a.f0(i13);
    }

    @Override // n4.b
    public final float g0(float f13) {
        return this.f102203a.g0(f13);
    }

    @Override // q3.s
    public final n4.k getLayoutDirection() {
        return this.f102203a.f110898l.f110831s;
    }

    @Override // n4.b
    public final float j0() {
        return this.f102203a.j0();
    }

    @Override // n4.b
    public final float l0(float f13) {
        return this.f102203a.b() * f13;
    }

    @Override // n4.b
    public final long o(float f13) {
        return this.f102203a.o(f13);
    }

    @Override // n4.b
    public final long p(long j13) {
        return this.f102203a.p(j13);
    }

    @Override // q3.r0
    public final q0 s0(int i13, int i14, Map map, Function1 function1) {
        return this.f102203a.Y(i13, i14, map, function1);
    }

    @Override // n4.b
    public final float t(long j13) {
        return this.f102203a.t(j13);
    }

    @Override // n4.b
    public final long v0(long j13) {
        return this.f102203a.v0(j13);
    }
}
