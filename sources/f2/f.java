package f2;

import kotlin.collections.z0;
import p1.j0;
import q3.c1;
import q3.o0;
import q3.q0;
import q3.r0;

/* loaded from: classes2.dex */
public final class f extends u2.p implements s3.l, s3.c0 {
    @Override // s3.c0
    public final q0 i(r0 r0Var, o0 o0Var, long j13) {
        q0 s03;
        float f13 = 0;
        float a13 = ql2.s.a(((n4.e) com.bumptech.glide.c.w(this, e.f60833a)).f89175a, f13);
        c1 Q = o0Var.Q(j13);
        boolean z13 = this.f120054m && (Float.isNaN(a13) ^ true) && Float.compare(a13, f13) > 0;
        int R = true ^ Float.isNaN(a13) ? r0Var.R(a13) : 0;
        int max = z13 ? Math.max(Q.f102178a, R) : Q.f102178a;
        int max2 = z13 ? Math.max(Q.f102179b, R) : Q.f102179b;
        s03 = r0Var.s0(max, max2, z0.d(), new j0(max, Q, max2, 3));
        return s03;
    }
}
