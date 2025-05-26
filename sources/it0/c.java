package it0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import dl1.s;
import h32.a4;
import h32.d4;
import ht0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.r1;
import lp.k;
import m60.g0;
import ni1.d0;
import nr0.m;
import pk.a0;
import so.oa;
import vs0.f;
import x02.i2;
import xk2.v;
import xs0.l;
import yq0.z;

@xk2.d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lit0/c;", "Lwk1/k;", "Ldl1/s;", "Lrs0/b;", "Lnr0/j;", "<init>", "()V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends e<s> implements rs0.b {

    /* renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ int f73669e1 = 0;
    public i2 R0;
    public r1 S0;
    public uk1.e T0;
    public g0 U0;
    public m V0;
    public l W0;
    public d0 X0;
    public GestaltText Y0;
    public GestaltText Z0;

    /* renamed from: a1, reason: collision with root package name */
    public f f73670a1;

    /* renamed from: b1, reason: collision with root package name */
    public final d4 f73671b1 = d4.HOMEFEED_CONTROL;

    /* renamed from: c1, reason: collision with root package name */
    public final a4 f73672c1 = a4.HOMEFEED_CONTROL_ACTIVITY;

    /* renamed from: d1, reason: collision with root package name */
    public final v f73673d1 = xk2.m.b(new a(this, 0));

    @Override // rs0.b
    public final void M4(String filterSubtitle) {
        Intrinsics.checkNotNullParameter(filterSubtitle, "filterSubtitle");
        GestaltText gestaltText = this.Z0;
        if (gestaltText != null) {
            a0.p(gestaltText, filterSubtitle);
        }
    }

    @Override // rs0.b
    public final void O3(String filterSelected) {
        Intrinsics.checkNotNullParameter(filterSelected, "filterSelected");
        GestaltText gestaltText = this.Y0;
        if (gestaltText != null) {
            a0.p(gestaltText, filterSelected);
        }
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        if (((Boolean) this.f73673d1.getValue()).booleanValue()) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION, new a(this, 1));
        }
        adapter.G(9991, new a(this, 2));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.T0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.R0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        g0 g0Var = this.U0;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        m mVar = this.V0;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        r1 r1Var = this.S0;
        if (r1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        b60.b activeUserManager = getActiveUserManager();
        l lVar = this.W0;
        if (lVar == null) {
            Intrinsics.r("pinActivityCellViewBinder");
            throw null;
        }
        d0 d0Var = this.X0;
        if (d0Var == null) {
            Intrinsics.r("pinRepVmStateConverterFactory");
            throw null;
        }
        f fVar = new f(g0Var, a13, mVar, r1Var, aVar, activeUserManager, lVar, d0Var);
        this.f73670a1 = fVar;
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
        return this.f73672c1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF75509a1() {
        return this.f73671b1;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(xp1.b.fragment_activity, xp1.a.p_recycler_view);
        eVar.f979c = xp1.a.empty_state_container;
        eVar.c(xp1.a.loading_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        View findViewById;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (((Boolean) this.f73673d1.getValue()).booleanValue()) {
            View view = getView();
            this.Y0 = view != null ? (GestaltText) view.findViewById(xp1.a.tv_filter_title) : null;
            View view2 = getView();
            this.Z0 = view2 != null ? (GestaltText) view2.findViewById(xp1.a.tv_filter_subtitle) : null;
            View view3 = getView();
            if (view3 != null && (findViewById = view3.findViewById(xp1.a.filter_view)) != null) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new lj0.a(this, 29));
            }
        }
        O8(u.a(this, xp1.d.homefeed_tuner_pin_recommendations_empty_experiment_uup), 49);
    }

    @Override // ha2.f
    public final void x2() {
        a.c.y(f7());
    }
}
