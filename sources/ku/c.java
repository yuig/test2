package ku;

import cu.i;
import i32.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.q8;
import ur0.g;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lku/c;", "Lcu/m;", "Lut/b;", "Lku/a;", "Let/b;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends e<ut.b, a> implements et.b {
    public q8 A0;
    public kt.a B0;
    public et.a C0;
    public final v D0 = m.b(new lr.v(this, 12));

    @Override // ku.e, yk1.k
    public final yk1.m V7() {
        q8 q8Var = this.A0;
        if (q8Var != null) {
            return (ut.b) g8(new b(q8Var));
        }
        Intrinsics.r("adsProfilePresenterFactory");
        throw null;
    }

    @Override // cu.m
    public final void Y7() {
        et.a aVar = this.C0;
        if (aVar != null) {
            ((ut.b) aVar).G3();
        }
    }

    @Override // cu.m
    public final i a8() {
        return (a) this.D0.getValue();
    }

    @Override // at.b
    public final void z6(y0 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        g.d(placement, this, null);
    }
}
