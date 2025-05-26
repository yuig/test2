package du;

import cu.i;
import g70.h;
import i32.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.j7;
import ur0.g;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldu/d;", "Lcu/m;", "Lrt/b;", "Ldu/a;", "Lbt/b;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends f<rt.b, a> implements bt.b {
    public j7 A0;
    public kt.a B0;
    public h C0;
    public bt.a D0;
    public final v E0 = m.b(new lr.v(this, 9));

    @Override // du.f, yk1.k
    public final yk1.m V7() {
        j7 j7Var = this.A0;
        if (j7Var != null) {
            return (rt.b) g8(new b(j7Var));
        }
        Intrinsics.r("adsBoardPresenterFactory");
        throw null;
    }

    @Override // cu.m
    public final void Y7() {
        bt.a aVar = this.D0;
        if (aVar != null) {
            ((rt.b) aVar).G3();
        }
    }

    @Override // cu.m
    public final i a8() {
        return (a) this.E0.getValue();
    }

    @Override // at.b
    public final void z6(y0 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        g.d(placement, this, null);
    }
}
