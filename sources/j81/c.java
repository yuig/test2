package j81;

import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import java.util.HashMap;
import k81.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.f4;
import m60.g0;
import nr0.l;
import qz.f0;
import uj2.q;
import xk2.m;
import xk2.n;
import z32.m0;

/* loaded from: classes5.dex */
public final class c extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public final String L;
    public boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String pinId, uk1.d presenterPinalytics, q networkStateStream, l viewBinderDelegate, sq0.f imagePreFetcher, k remoteRequestListener, ni0.e adsCarouselPresenterFactory, f4 experiments, String query, String navigationSource, String endpoint) {
        super(endpoint, viewBinderDelegate, imagePreFetcher, null, null, null, null, null, remoteRequestListener, 0L, null, 7160);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(imagePreFetcher, "imagePreFetcher");
        Intrinsics.checkNotNullParameter(remoteRequestListener, "remoteRequestListener");
        Intrinsics.checkNotNullParameter(adsCarouselPresenterFactory, "adsCarouselPresenterFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.L = query;
        xk2.k a13 = m.a(n.NONE, b.f74931j);
        this.M = true;
        HashMap hashMap = new HashMap();
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.UNIFIED_FLASHLIGHT_SHOPPING_FIELDS));
        f0Var.e("entry_source", "ads_stl_module");
        f0Var.e("search_query", query);
        f0Var.e("source", navigationSource);
        f0Var.e("page_size", ((g0) a13.getValue()).d());
        f0Var.f(hashMap);
        this.f49121k = f0Var;
        o(RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL, new ni0.f(networkStateStream, adsCarouselPresenterFactory, presenterPinalytics));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, qr0.d
    public final String g() {
        return this.f49111a + "?" + this.f49121k;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        boolean z13 = item instanceof vh;
        nr0.k kVar = this.E;
        if (!z13) {
            return kVar.getItemViewType(i13);
        }
        vh vhVar = (vh) item;
        m0 m0Var = vhVar.f42868z;
        if (m0Var == null || a.f74930a[m0Var.ordinal()] != 1) {
            return kVar.getItemViewType(i13);
        }
        String q13 = vhVar.q();
        Intrinsics.checkNotNullExpressionValue(q13, "getStoryType(...)");
        return z.p(q13, "closeup_stl_3p_ads_only_module", true) ? RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL : kVar.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        f0 f0Var;
        return this.M && (f0Var = this.f49121k) != null && f0Var.b("category");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.w
    public final String w2() {
        return this.L;
    }
}
