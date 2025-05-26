package i51;

import ao2.j0;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import zy.d0;
import zy.l0;

/* loaded from: classes5.dex */
public final class b0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final d0 f71576c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f71577d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.y f71578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 pinalyticsSEP, c0 visibilityModalSEP, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(visibilityModalSEP, "visibilityModalSEP");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f71576c = pinalyticsSEP;
        this.f71577d = visibilityModalSEP;
        l82.a0 a0Var = new l82.a0(scope);
        y stateTransformer = new y();
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f71578e = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f71578e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f71578e.e();
    }

    public final void h(String userId, f sortButtonAppearance, bq.b currentSortOrder, i0 i0Var) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(sortButtonAppearance, "sortButtonAppearance");
        Intrinsics.checkNotNullParameter(currentSortOrder, "currentSortOrder");
        if (i0Var == null) {
            i0Var = new i0(d4.USER, a4.USER_SELF, null, g0.BOARDS_TAB, null, null);
        }
        l0 l0Var = new l0(i0Var, 2);
        l82.y.i(this.f71578e, new a0(userId, false, false, false, sortButtonAppearance, currentSortOrder, l0Var, new x31.p(null, true, sortButtonAppearance == f.None ? Integer.valueOf(nz1.f.filter_bar_label_default) : null, q0.f80391a, l0Var, false, 433)), false, new j41.i(this, 9), 2);
    }
}
