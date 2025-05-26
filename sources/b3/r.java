package b3;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public Function1 f21348n;

    public r(Function1 function1) {
        this.f21348n = function1;
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        q3.c1 Q = o0Var.Q(j13);
        s03 = r0Var.s0(Q.f102178a, Q.f102179b, kotlin.collections.z0.d(), new i2.i(3, Q, this));
        return s03;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f21348n + ')';
    }
}
