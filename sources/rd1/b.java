package rd1;

import c91.f;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import i1.h;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.f4;
import m60.u;
import m60.w;
import uk1.d;
import uk1.e;
import x02.x2;
import z32.m0;

/* loaded from: classes5.dex */
public final class b extends hd1.b {
    public final /* synthetic */ int R = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hd1.c listParams, String userId, x2 userRepository, h hVar, e presenterPinalyticsFactory) {
        super(listParams, null, 14);
        Intrinsics.checkNotNullParameter(listParams, "listParams");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        o(65, new yo0.a(((uk1.a) presenterPinalyticsFactory).e(userId, new e3.a(5)), listParams.f68887d, userRepository, (String) null, hVar, (f) null, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM));
    }

    @Override // hd1.b, com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.R) {
            case 0:
                s item = getItem(i13);
                if (!(item instanceof vh)) {
                    break;
                } else {
                    m0 m0Var = ((vh) item).f42868z;
                    if (m0Var == null || a.f107513a[m0Var.ordinal()] != 1) {
                        break;
                    }
                }
                break;
            default:
                s item2 = getItem(i13);
                if (!(item2 instanceof vh)) {
                    break;
                } else {
                    vh vhVar = (vh) item2;
                    m0 m0Var2 = vhVar.f42868z;
                    int i14 = m0Var2 == null ? -1 : gf1.a.f64865a[m0Var2.ordinal()];
                    if (i14 == 1) {
                        if (!vhVar.v0()) {
                            break;
                        }
                    } else if (i14 != 2) {
                        break;
                    }
                }
                break;
        }
        return super.getItemViewType(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hd1.c listParams, ze1.c shoppingNavigationApiParams, e presenterPinalyticsFactory, f4 experiments, r prefsManagerUser) {
        super(listParams, null, 14);
        Intrinsics.checkNotNullParameter(listParams, "listParams");
        Intrinsics.checkNotNullParameter(shoppingNavigationApiParams, "shoppingNavigationApiParams");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        hd1.c cVar = this.L;
        d dVar = cVar.f68886c;
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        o(RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE, new ke1.e(dVar, cVar.f68887d, true, wVar, cVar.f68889f, null, null, "feed_products", 96));
        c(c.f107514a, new se1.c(cVar.f68886c, cVar.f68887d, shoppingNavigationApiParams, experiments, listParams.f68901r, cVar.f68889f, ((uk1.a) presenterPinalyticsFactory).f122378a, null, false, false, null, prefsManagerUser, "feed", 8064));
    }
}
