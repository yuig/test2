package gw1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import m60.u;
import nx.d0;

/* loaded from: classes4.dex */
public final /* synthetic */ class c extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66220a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj, int i13) {
        super(1, obj, ProductTagCard.class, "onProductTagClick", "onProductTagClick(Ljava/lang/String;)V", 0);
        this.f66220a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, k.class, "handleClick", "handleClick(Ljava/lang/String;)V", 0);
        }
    }

    public final void h(String p03) {
        switch (this.f66220a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ProductTagCard productTagCard = (ProductTagCard) this.receiver;
                int i13 = ProductTagCard.f50084v;
                productTagCard.getClass();
                u.f85943a.d(Navigation.z0((ScreenLocation) ex1.b.f60386a.getValue(), p03));
                d0 d0Var = productTagCard.f50085a;
                if (d0Var != null) {
                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.CLICK, (r18 & 2) != 0 ? null : u0.ANALYTICS_VIEW_PIN_LINK, (r18 & 4) != 0 ? null : g0.PIN_STATS_TAGGED_PRODUCTS_TABLE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : ep.b.o("analytics_next_value", p03), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((k) this.receiver).f66239d.invoke(p03);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f66220a) {
            case 0:
                h((String) obj);
                break;
            default:
                h((String) obj);
                break;
        }
        return Unit.f80348a;
    }
}
