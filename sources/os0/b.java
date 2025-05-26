package os0;

import ey.e0;
import ey.l2;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import ny.d;
import ny.f;
import ny.m0;
import ny.n0;
import s92.o;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class b implements pr0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f97497a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final v f97498b = m.b(a.f97496i);

    public static w d() {
        Object value = f97498b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w) value;
    }

    @Override // pr0.a
    public final void b(Object obj) {
        new l2("SCROLL").i();
        new d(o.ABORTED, null, null, 0, null, true, 30).i();
    }

    @Override // pr0.a
    public final void c(Object obj) {
        new m0(17, 0).i();
    }

    @Override // pr0.a
    public final void o(int i13, f fVar, e0 e0Var, Object obj) {
        new d(o.COMPLETE, d4.FEED, a4.FEED_HOME, i13, fVar, false, 32).i();
        Intrinsics.checkNotNullParameter("coldStart", "scenarioName");
    }

    @Override // pr0.a
    public final void r(Object obj) {
        new n0(17, 0).i();
    }
}
