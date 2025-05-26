package n62;

import do2.b0;
import do2.t2;
import do2.u2;
import java.util.ArrayList;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m62.i1;

/* loaded from: classes4.dex */
public final class f implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f89349a;

    public f(g gVar) {
        t2 a13 = u2.a(q0.f80391a);
        do2.q0 Y = l0.Y(a13);
        long j13 = g.f89350n;
        if (j13 <= 0) {
            throw new IllegalArgumentException("Sample period should be positive".toString());
        }
        l0.J0(l0.Q0(new e(gVar, null), new do2.l(new b0(j13, Y, null), 2)), gVar.f89355d);
        this.f89349a = a13;
    }

    @Override // m62.i1
    public final void S(ArrayList point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.f89349a.i(point);
    }
}
