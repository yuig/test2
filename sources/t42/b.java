package t42;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.c;
import com.pinterest.selectPinsLibrary.datasource.SelectPinsFilter;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nr0.l;
import qa2.n;
import qz.f0;
import s42.k;
import wk1.e;
import yk1.v;

/* loaded from: classes4.dex */
public final class b extends c implements e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String remoteUrl, String apiFields, n gridFeatureConfig, l viewBinderDelegate, k selectPinsListener, v viewResources, String sourceRequestParams) {
        super(remoteUrl, viewBinderDelegate, null, null, null, new ke0.a[]{gh0.b.R()}, new SelectPinsFilter(), null, null, 0L, null, 8092);
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(apiFields, "apiFields");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(selectPinsListener, "selectPinsListener");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(sourceRequestParams, "sourceRequestParams");
        f0 f0Var = new f0();
        f0Var.e("fields", apiFields);
        if (!z.j(sourceRequestParams)) {
            f0Var.e("request_params", sourceRequestParams);
        }
        this.f49121k = f0Var;
        o(66, new yi0.a(gridFeatureConfig.f103320a, selectPinsListener));
        o(RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE, new u42.c(viewResources));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 166) {
            return true;
        }
        return this.E.f(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        if (item instanceof f30) {
            return 66;
        }
        return item instanceof hh0 ? RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE : this.E.getItemViewType(i13);
    }
}
