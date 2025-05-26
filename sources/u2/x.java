package u2;

import kotlin.collections.z0;
import q3.c1;
import q3.o0;
import q3.q0;
import q3.r0;
import s3.c0;

/* loaded from: classes.dex */
public final class x extends p implements c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f120063n;

    @Override // s3.c0
    public final q0 i(r0 r0Var, o0 o0Var, long j13) {
        q0 s03;
        c1 Q = o0Var.Q(j13);
        s03 = r0Var.s0(Q.f102178a, Q.f102179b, z0.d(), new i2.i(2, Q, this));
        return s03;
    }

    public final String toString() {
        return d7.g.h(new StringBuilder("ZIndexModifier(zIndex="), this.f120063n, ')');
    }
}
