package jt0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import h32.a4;
import h32.d4;
import ht0.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r1;
import lp.k;
import m60.g0;
import ni1.d0;
import nr0.m;
import so.oa;
import x02.i2;
import xk2.v;
import xs0.l;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljt0/d;", "Lmm1/n;", "Ldl1/s;", "Lrs0/b;", "Lnr0/j;", "<init>", "()V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends f<s> implements rs0.b {
    public i2 W0;
    public r1 X0;
    public uk1.e Y0;
    public g0 Z0;

    /* renamed from: a1, reason: collision with root package name */
    public m f77578a1;

    /* renamed from: b1, reason: collision with root package name */
    public l f77579b1;

    /* renamed from: c1, reason: collision with root package name */
    public d0 f77580c1;

    /* renamed from: d1, reason: collision with root package name */
    public vs0.f f77581d1;

    /* renamed from: e1, reason: collision with root package name */
    public final d4 f77582e1 = d4.HOMEFEED_CONTROL;

    /* renamed from: f1, reason: collision with root package name */
    public final a4 f77583f1 = a4.HOMEFEED_CONTROL_ACTIVITY;

    /* renamed from: g1, reason: collision with root package name */
    public final v f77584g1 = xk2.m.b(new a(this, 1));

    @Override // rs0.b
    public final void M4(String filterSubtitle) {
        Intrinsics.checkNotNullParameter(filterSubtitle, "filterSubtitle");
    }

    @Override // rs0.b
    public final void O3(String filterSelected) {
        Intrinsics.checkNotNullParameter(filterSelected, "filterSelected");
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        if (((Boolean) this.f77584g1.getValue()).booleanValue()) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION, new a(this, 2));
        }
        adapter.G(9991, new a(this, 3));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.Y0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.W0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        g0 g0Var = this.Z0;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        m mVar = this.f77578a1;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        r1 r1Var = this.X0;
        if (r1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        b60.b activeUserManager = getActiveUserManager();
        l lVar = this.f77579b1;
        if (lVar == null) {
            Intrinsics.r("pinActivityCellViewBinder");
            throw null;
        }
        d0 d0Var = this.f77580c1;
        if (d0Var == null) {
            Intrinsics.r("pinRepVmStateConverterFactory");
            throw null;
        }
        vs0.f fVar = new vs0.f(g0Var, a13, mVar, r1Var, aVar, activeUserManager, lVar, d0Var);
        this.f77581d1 = fVar;
        return fVar;
    }

    @Override // ha2.f
    public final void Y4(ha2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        f7().d(new jc0.v(new k(configuration), false, 0L, 30));
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return 3;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF86878d0() {
        return this.f77583f1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF75509a1() {
        return this.f77582e1;
    }

    @Override // mm1.n
    public final Function0 h9() {
        return new a(this, 0);
    }

    @Override // mm1.n
    /* renamed from: i9 */
    public final int getF108113b1() {
        return 95;
    }

    @Override // mm1.n
    /* renamed from: j9 */
    public final int getF108114c1() {
        return 50;
    }

    @Override // mm1.n
    public final boolean l9() {
        return true;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        g9(b.f77577i);
        O8(u.a(this, xp1.d.homefeed_tuner_pin_recommendations_empty_experiment_uup), 49);
    }

    @Override // ha2.f
    public final void x2() {
        a.c.y(f7());
    }
}
