package kv0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import nx.b0;
import nx.d0;
import qz.f0;

/* loaded from: classes5.dex */
public final class m extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public final HashMap L;
    public boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d0 pinalytics, HashMap apiParamMap, g0 pageSizeProvider, String apiEndpoint, yk1.v viewResources, nr0.l viewBinderDelegate, k81.k kVar, ku1.k screenNavigator, cg1.a productTaggingListener, b60.b activeUserManager, b0 pinAuxHelper) {
        super(apiEndpoint, viewBinderDelegate, null, null, null, null, null, null, kVar, 0L, null, 7164);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(apiParamMap, "apiParamMap");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(apiEndpoint, "apiEndpoint");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(productTaggingListener, "productTaggingListener");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.L = apiParamMap;
        this.M = true;
        f0 f0Var = new f0();
        f0Var.f(apiParamMap);
        f0Var.e("fields", n00.b.a(n00.c.STORY_PINS_PRODUCT_FEED_FIELDS));
        f0Var.e("page_size", pageSizeProvider.d());
        this.f49121k = f0Var;
        o(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, new dg1.c(pinalytics, viewResources, screenNavigator, activeUserManager, null, null, productTaggingListener, pinAuxHelper, 1008));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        return getItem(i13) instanceof f30 ? RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL : this.E.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        return this.M;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.w
    public final String w2() {
        String str = (String) this.L.get("search_query");
        return str == null ? "" : str;
    }
}
