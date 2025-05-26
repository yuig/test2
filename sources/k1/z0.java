package k1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class z0 extends u2.p implements s3.j2 {

    /* renamed from: o, reason: collision with root package name */
    public static final y0 f78106o = new y0();

    /* renamed from: n, reason: collision with root package name */
    public final Function1 f78107n;

    public z0(s2 s2Var) {
        this.f78107n = s2Var;
    }

    public final void M0(q3.x xVar) {
        this.f78107n.invoke(xVar);
        z0 z0Var = (z0) kh2.b0.g0(this);
        if (z0Var != null) {
            z0Var.M0(xVar);
        }
    }

    @Override // s3.j2
    public final Object l() {
        return f78106o;
    }
}
