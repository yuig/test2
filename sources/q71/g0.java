package q71;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.api.model.eh0;
import com.pinterest.navigation.Navigation;
import h32.a4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq71/g0;", "Lq71/x;", "<init>", "()V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class g0 extends j {
    public eh0 S0;
    public j22.b T0;
    public uk1.e U0;
    public vy.m V0;
    public ip1.b W0;
    public gp1.l X0;
    public j3 Y0;
    public j22.l Z0 = j22.l.PRODUCTS;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f102712a1;

    /* renamed from: b1, reason: collision with root package name */
    public String f102713b1;

    @Override // q71.x, k71.o
    public final void P2(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (this.Z0 != j22.l.PRODUCT_TAGGING) {
            super.P2(query);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_SEARCH_ENTERED_QUERY", query);
        X6("com.pinterest.EXTRA_STORY_PIN_PRODUCT_SEARCH_QUERY", bundle);
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(1, new com.pinterest.feature.search.results.view.b0(requireContext, 4));
    }

    @Override // q71.x, nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        h61.h G = navigation != null ? pe.i.G(navigation) : null;
        String g23 = navigation != null ? navigation.g2("com.pinterest.EXTRA_SHOP_SOURCE", "") : null;
        this.f102713b1 = g23;
        if (g23 == null || g23.length() == 0) {
            this.f102713b1 = null;
        }
        boolean z13 = G == h61.h.STORY_PIN_PRODUCTS;
        this.f102712a1 = z13;
        if (z13) {
            this.Z0 = j22.l.PRODUCT_TAGGING;
            this.H0 = Integer.valueOf(i42.c.search_view_story_product_hint);
            Z8(false);
        } else {
            this.Z0 = j22.l.PRODUCTS;
            this.H0 = Integer.valueOf(i42.c.search_view_pb_products_hint);
            Z8(true);
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        gp1.l lVar = this.X0;
        if (lVar == null) {
            Intrinsics.r("searchTypeaheadDownloadUtils");
            throw null;
        }
        boolean a13 = lVar.a();
        uk1.e eVar = this.U0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        vy.m mVar = this.V0;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        ip1.b bVar = this.W0;
        if (bVar == null) {
            Intrinsics.r("prefetchManager");
            throw null;
        }
        m60.w f73 = f7();
        z61.b bVar2 = new z61.b();
        j22.b bVar3 = this.T0;
        if (bVar3 == null) {
            Intrinsics.r("searchService");
            throw null;
        }
        j3 j3Var = this.Y0;
        if (j3Var == null) {
            Intrinsics.r("typeaheadExperiments");
            throw null;
        }
        eh0 eh0Var = this.S0;
        if (eh0Var != null) {
            return new o71.y(f13, p73, mVar, bVar, f73, bVar2, bVar3, j3Var, a13, eh0Var, new org.chromium.net.y(), hf0.b.q(), this.E0, this.D0, this.Z0, this.f102713b1, this.f102712a1);
        }
        Intrinsics.r("searchTypeaheadLocal");
        throw null;
    }

    @Override // q71.x, uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getD0() {
        return f0.f102708a[this.Z0.ordinal()] == 1 ? a4.PERSONAL_BOUTIQUE_SEARCH_AUTOCOMPLETE : this.N0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            j22.l lVar = j22.l.PRODUCTS;
            int i13 = bundle.getInt("com.pinterest.EXTRA_SEARCH_RESULTS_TAB_TYPE", lVar.ordinal());
            if (kotlin.collections.f0.j(Integer.valueOf(lVar.ordinal()), Integer.valueOf(j22.l.PRODUCT_TAGGING.ordinal())).contains(Integer.valueOf(i13))) {
                j22.l.Companion.getClass();
                this.Z0 = j22.k.a(i13);
            }
            if (bundle.containsKey("NAVIGATION_MODEL_BUNDLE_KEY")) {
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                if (!arguments.containsKey("NAVIGATION_MODEL_BUNDLE_KEY")) {
                    arguments.putParcelable("NAVIGATION_MODEL_BUNDLE_KEY", bundle.getParcelable("NAVIGATION_MODEL_BUNDLE_KEY"));
                }
                setArguments(arguments);
            }
        }
        super.onCreate(bundle);
    }

    @Override // yq0.t, yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("com.pinterest.EXTRA_SEARCH_RESULTS_TAB_TYPE", this.Z0.ordinal());
        Navigation navigation = this.I;
        if (navigation != null) {
            outState.putParcelable("NAVIGATION_MODEL_BUNDLE_KEY", navigation);
        }
    }
}
