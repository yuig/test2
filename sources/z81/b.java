package z81;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.c;
import java.util.HashMap;
import k81.k;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import nr0.l;
import nx.d0;
import qz.f0;

/* loaded from: classes5.dex */
public final class b extends c {
    public final g0 L;
    public boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d0 pinalytics, HashMap apiParamMap, g0 pageSizeProvider, dg1.c ideaPinProductTagViewBinder, l viewBinderDelegate, k kVar) {
        super("visual_search/virtual_try_on/makeup_products/", viewBinderDelegate, null, null, null, null, null, null, kVar, 0L, null, 7164);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(apiParamMap, "apiParamMap");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(ideaPinProductTagViewBinder, "ideaPinProductTagViewBinder");
        Intrinsics.checkNotNullParameter("visual_search/virtual_try_on/makeup_products/", "apiEndpoint");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        this.L = pageSizeProvider;
        this.M = true;
        f0(apiParamMap);
        o(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, ideaPinProductTagViewBinder);
    }

    public final void f0(HashMap paramMap) {
        Intrinsics.checkNotNullParameter(paramMap, "paramMap");
        f0 f0Var = new f0();
        f0Var.f(paramMap);
        f0Var.e("fields", n00.b.a(n00.c.VIRTUAL_TRY_ON));
        f0Var.e("page_size", this.L.d());
        this.f49121k = f0Var;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        return getItem(i13) instanceof f30 ? RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL : this.E.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        return this.M;
    }
}
