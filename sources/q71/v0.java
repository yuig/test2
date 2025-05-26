package q71;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.api.model.eh0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.f3;
import lh0.j3;
import so.oa;
import x02.l2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq71/v0;", "Lq71/x;", "<init>", "()V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class v0 extends k {

    /* renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ int f102774e1 = 0;
    public eh0 S0;
    public j22.b T0;
    public l2 U0;
    public uk1.e V0;
    public vy.m W0;
    public ip1.b X0;
    public gp1.l Y0;
    public lh0.o Z0;

    /* renamed from: a1, reason: collision with root package name */
    public j3 f102775a1;

    /* renamed from: b1, reason: collision with root package name */
    public f3 f102776b1;

    /* renamed from: c1, reason: collision with root package name */
    public g70.h f102777c1;

    /* renamed from: d1, reason: collision with root package name */
    public final boolean f102778d1 = true;

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        j3 j3Var = this.f102775a1;
        if (j3Var == null) {
            Intrinsics.r("typeaheadExperiments");
            throw null;
        }
        if (j3Var.d()) {
            E8(0, false);
        }
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int i13 = 1;
        adapter.G(1, new com.pinterest.feature.search.results.view.b0(requireContext, 6));
        adapter.G(10, new com.pinterest.feature.search.results.view.b0(requireContext, 7));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL, new com.pinterest.feature.search.results.view.b0(requireContext, 8));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, new com.pinterest.feature.search.results.view.b0(requireContext, 9));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE, new com.pinterest.feature.search.results.view.b0(requireContext, 10));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, new com.pinterest.feature.search.results.view.b0(requireContext, 11));
        adapter.G(4, new com.pinterest.feature.search.results.view.b0(requireContext, 12));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, new com.pinterest.feature.search.results.view.b0(requireContext, 13));
        adapter.G(3, new com.pinterest.feature.search.results.view.b0(requireContext, 14));
        adapter.G(2, new com.pinterest.feature.search.results.view.b0(requireContext, 5));
        j3 j3Var = this.f102775a1;
        if (j3Var == null) {
            Intrinsics.r("typeaheadExperiments");
            throw null;
        }
        if (j3Var.c()) {
            return;
        }
        adapter.G(1004, new u0(this, 0));
        adapter.G(1005, new u0(this, i13));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        gp1.l lVar = this.Y0;
        if (lVar == null) {
            Intrinsics.r("searchTypeaheadDownloadUtils");
            throw null;
        }
        boolean a13 = lVar.a();
        uk1.e eVar = this.V0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        vy.m mVar = this.W0;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        ip1.b bVar = this.X0;
        if (bVar == null) {
            Intrinsics.r("prefetchManager");
            throw null;
        }
        Context context = kb0.a.f79058b;
        i92.k E2 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
        m60.w f73 = f7();
        z61.b bVar2 = new z61.b();
        l2 l2Var = this.U0;
        if (l2Var == null) {
            Intrinsics.r("typeaheadRepository");
            throw null;
        }
        j22.b bVar3 = this.T0;
        if (bVar3 == null) {
            Intrinsics.r("searchService");
            throw null;
        }
        lh0.o oVar = this.Z0;
        if (oVar == null) {
            Intrinsics.r("baseExperimentsHelper");
            throw null;
        }
        j3 j3Var = this.f102775a1;
        if (j3Var == null) {
            Intrinsics.r("typeaheadExperiments");
            throw null;
        }
        f3 f3Var = this.f102776b1;
        if (f3Var == null) {
            Intrinsics.r("libraryExperiments");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        eh0 eh0Var = this.S0;
        if (eh0Var == null) {
            Intrinsics.r("searchTypeaheadLocal");
            throw null;
        }
        org.chromium.net.y yVar = new org.chromium.net.y();
        boolean q13 = hf0.b.q();
        nu1.a aVar2 = this.A0;
        if (aVar2 == null) {
            Intrinsics.r("inAppNavigator");
            throw null;
        }
        String str = this.E0;
        h61.n nVar = this.D0;
        g70.h hVar = this.f102777c1;
        if (hVar != null) {
            return new o71.f0(f13, p73, mVar, bVar, E2, f73, bVar2, l2Var, bVar3, oVar, j3Var, f3Var, aVar, a13, eh0Var, yVar, q13, aVar2, str, nVar, hVar);
        }
        Intrinsics.r("boardNavigator");
        throw null;
    }

    @Override // yq0.t
    /* renamed from: j8, reason: from getter */
    public final boolean getF102778d1() {
        return this.f102778d1;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Z8(true);
    }

    @Override // yq0.t, k71.o
    public final void w() {
        E8(0, false);
    }
}
