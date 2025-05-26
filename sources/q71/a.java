package q71;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.eh0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;
import so.oa;
import x02.l2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq71/a;", "Lq71/x;", "<init>", "()V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a extends g {
    public eh0 S0;
    public j22.b T0;
    public l2 U0;
    public uk1.e V0;
    public vy.m W0;
    public ip1.b X0;
    public gp1.l Y0;
    public j3 Z0;

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(1, new com.pinterest.feature.search.results.view.b0(requireContext, 1));
        adapter.G(10, new com.pinterest.feature.search.results.view.b0(requireContext, 2));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, new com.pinterest.feature.search.results.view.b0(requireContext, 3));
        adapter.G(1004, new w01.e0(this, 27));
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
        j3 j3Var = this.Z0;
        if (j3Var == null) {
            Intrinsics.r("typeaheadExperiments");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        eh0 eh0Var = this.S0;
        if (eh0Var != null) {
            return new o71.e(f13, p73, mVar, bVar, E2, f73, bVar2, l2Var, bVar3, j3Var, aVar, a13, eh0Var, new org.chromium.net.y(), hf0.b.q(), this.E0, this.D0);
        }
        Intrinsics.r("searchTypeaheadLocal");
        throw null;
    }

    @Override // q71.x, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Z8(false);
        return super.onCreateView(inflater, viewGroup, bundle);
    }
}
