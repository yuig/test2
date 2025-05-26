package q71;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;
import x02.i2;
import x02.l2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq71/a1;", "Lq71/x;", "<init>", "()V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a1 extends l {
    public j22.b S0;
    public k22.m T0;
    public l2 U0;
    public i2 V0;
    public uk1.e W0;
    public vy.m X0;
    public ip1.b Y0;
    public i92.k Z0;

    /* renamed from: a1, reason: collision with root package name */
    public j3 f102693a1;

    /* renamed from: b1, reason: collision with root package name */
    public g70.h f102694b1;

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(1, new com.pinterest.feature.search.results.view.b0(requireContext, 17));
        adapter.G(2, new z0(this, 1));
        adapter.G(6, new com.pinterest.feature.search.results.view.b0(requireContext, 18));
        adapter.G(13, new com.pinterest.feature.search.results.view.b0(requireContext, 19));
        adapter.G(1003, new z0(this, 2));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, new b2.t(requireContext, n42.e.your_boards, 6));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE, new com.pinterest.feature.search.results.view.b0(requireContext, 20));
        adapter.G(16, new com.pinterest.feature.search.results.view.b0(requireContext, 21));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID, new com.pinterest.feature.search.results.view.b0(requireContext, 22));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL, new com.pinterest.feature.search.results.view.b0(requireContext, 15));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL, new com.pinterest.feature.search.results.view.b0(requireContext, 16));
        adapter.G(1004, new z0(this, 0));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.W0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        vy.m mVar = this.X0;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        ip1.b bVar = this.Y0;
        if (bVar == null) {
            Intrinsics.r("prefetchManager");
            throw null;
        }
        i92.k kVar = this.Z0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        m60.w f73 = f7();
        z61.b bVar2 = new z61.b();
        l2 l2Var = this.U0;
        if (l2Var == null) {
            Intrinsics.r("typeaheadRepository");
            throw null;
        }
        j22.b bVar3 = this.S0;
        if (bVar3 == null) {
            Intrinsics.r("searchService");
            throw null;
        }
        k22.m mVar2 = this.T0;
        if (mVar2 == null) {
            Intrinsics.r("userService");
            throw null;
        }
        i2 i2Var = this.V0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        boolean q13 = hf0.b.q();
        String str = this.E0;
        h61.n nVar = this.D0;
        j3 j3Var = this.f102693a1;
        if (j3Var == null) {
            Intrinsics.r("typeaheadExperiments");
            throw null;
        }
        g70.h hVar = this.f102694b1;
        if (hVar != null) {
            return new o71.j0(g13, p73, mVar, bVar, kVar, f73, bVar2, l2Var, bVar3, mVar2, i2Var, aVar, q13, str, nVar, j3Var, hVar);
        }
        Intrinsics.r("boardNavigator");
        throw null;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.H0 = Integer.valueOf(n42.e.search_view_your_pins_hint);
        Z8(true);
    }
}
