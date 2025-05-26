package hq1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.c;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import n00.b;
import nr0.l;
import qz.f0;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends c {
    public final HashMap L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HashMap apiParamMap, g0 pageSizeProvider, boolean z13, String apiEndpoint, v viewResources, l viewBinderDelegate, HashMap hashMap) {
        super(apiEndpoint, viewBinderDelegate, null, null, null, null, null, null, null, 0L, null, 7164);
        Intrinsics.checkNotNullParameter(apiParamMap, "apiParamMap");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(apiEndpoint, "apiEndpoint");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        this.L = apiParamMap;
        f0 f0Var = new f0();
        f0Var.f(apiParamMap);
        f0Var.e("fields", b.a(n00.c.SHOPPING_FULL_FEED_FIELDS));
        f0Var.e("page_size", pageSizeProvider.d());
        this.f49121k = f0Var;
        o(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, new ef1.b(viewResources, hashMap, z13));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        return getItem(i13) instanceof f30 ? RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL : this.E.getItemViewType(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.w
    public final String w2() {
        String str = (String) this.L.get("search_query");
        return str == null ? "" : str;
    }
}
