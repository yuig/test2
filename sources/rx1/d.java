package rx1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku1.j;
import so.g1;
import xk2.m;
import xk2.v;
import yv1.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrx1/d;", "Lqx1/c;", "Lrx1/c;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends b implements c {

    /* renamed from: w0, reason: collision with root package name */
    public uk1.e f110204w0;

    /* renamed from: x0, reason: collision with root package name */
    public a f110205x0;

    /* renamed from: y0, reason: collision with root package name */
    public g1 f110206y0;

    /* renamed from: z0, reason: collision with root package name */
    public final v f110207z0 = m.b(new i(this, 5));

    @Override // qx1.c, yk1.k
    public final yk1.m V7() {
        g1 g1Var = this.f110206y0;
        if (g1Var != null) {
            return g1Var.a((uk1.d) this.f110207z0.getValue());
        }
        Intrinsics.r("analyticsPresenterFactory");
        throw null;
    }

    @Override // qx1.c
    public final void g8() {
        ((j) o7()).f();
    }

    @Override // qx1.c
    public final void h8() {
        nl1.d Z7 = Z7();
        if (Z7 != null) {
            a aVar = this.f110205x0;
            if (aVar != null) {
                aVar.p3(Z7);
            } else {
                Intrinsics.r("analyticsListener");
                throw null;
            }
        }
    }

    @Override // qx1.c
    public final void i8(qx1.d tabPosition) {
        Intrinsics.checkNotNullParameter(tabPosition, "tabPosition");
        a aVar = this.f110205x0;
        if (aVar != null) {
            aVar.q3(tabPosition);
        } else {
            Intrinsics.r("analyticsListener");
            throw null;
        }
    }
}
