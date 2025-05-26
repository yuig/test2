package gw1;

import android.content.res.Resources;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.l;
import rm1.q;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66221i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ProductTagCard f66222j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ProductTagCard productTagCard, int i13) {
        super(1);
        this.f66221i = i13;
        this.f66222j = productTagCard;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f66221i;
        ProductTagCard productTagCard = this.f66222j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                if (productTagCard.f50086b == null) {
                    Intrinsics.r("viewAdapter");
                    throw null;
                }
                Resources resources = productTagCard.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Intrinsics.checkNotNullParameter(resources, "resources");
                return rn1.a.y(it, d7.g.q(resources, com.pinterest.partnerAnalytics.g.breakdown_by_product, "getString(...)"), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (productTagCard.f50086b == null) {
                    Intrinsics.r("viewAdapter");
                    throw null;
                }
                Resources resources2 = productTagCard.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                ww1.c metricTypes = productTagCard.f50103s;
                Intrinsics.checkNotNullParameter(resources2, "resources");
                Intrinsics.checkNotNullParameter(metricTypes, "metricTypes");
                String string = resources2.getString(metricTypes.getDescription());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final void e(rm1.k bind) {
        int i13 = this.f66221i;
        ProductTagCard productTagCard = this.f66222j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new d(productTagCard, 0));
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new d(productTagCard, 2));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductTagCard productTagCard = this.f66222j;
        int i13 = this.f66221i;
        switch (i13) {
            case 0:
                l standard = (l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(standard, "$this$standard");
                        standard.a(productTagCard.f50105u ? q.SORT_ASCENDING : q.SORT_DESCENDING);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(standard, "$this$standard");
                        standard.a(productTagCard.f50105u ? q.SORT_ASCENDING : q.SORT_DESCENDING);
                        break;
                }
                break;
            case 1:
                e((rm1.k) obj);
                break;
            case 2:
                l standard2 = (l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(standard2, "$this$standard");
                        standard2.a(productTagCard.f50105u ? q.SORT_ASCENDING : q.SORT_DESCENDING);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(standard2, "$this$standard");
                        standard2.a(productTagCard.f50105u ? q.SORT_ASCENDING : q.SORT_DESCENDING);
                        break;
                }
                break;
            case 3:
                e((rm1.k) obj);
                break;
        }
        return b((rn1.a) obj);
    }
}
