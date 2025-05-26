package gw1;

import android.content.res.Resources;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import java.text.DateFormat;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66223i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f66224j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ProductTagCard f66225k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(a aVar, ProductTagCard productTagCard, int i13) {
        super(1);
        this.f66223i = i13;
        this.f66224j = aVar;
        this.f66225k = productTagCard;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f66223i;
        a aVar = this.f66224j;
        ProductTagCard productTagCard = this.f66225k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = productTagCard.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                g gVar = (g) aVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(resources, "resources");
                DateFormat dateInstance = DateFormat.getDateInstance(3);
                Object obj = gVar.f66228a;
                if (obj == null) {
                    obj = "";
                }
                String string = resources.getString(com.pinterest.partnerAnalytics.g.pin_stats_metrics_last_30_days_date_range, dateInstance.format(obj), dateInstance.format(new Date()));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources2 = productTagCard.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                ww1.c metricTypes = productTagCard.f50103s;
                ((g) aVar).getClass();
                Intrinsics.checkNotNullParameter(resources2, "resources");
                Intrinsics.checkNotNullParameter(metricTypes, "metricTypes");
                String string2 = resources2.getString(metricTypes.getDescription());
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources3 = productTagCard.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                g gVar2 = (g) aVar;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(resources3, "resources");
                int i14 = com.pinterest.partnerAnalytics.f.product_tag_product_total;
                int i15 = gVar2.f66229b.f101574e;
                String quantityString = resources3.getQuantityString(i14, i15, Integer.valueOf(i15));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                return rn1.a.y(it, bs1.c.h2(quantityString), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources4 = productTagCard.getResources();
                Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                ((g) aVar).getClass();
                Intrinsics.checkNotNullParameter(resources4, "resources");
                String quantityString2 = resources4.getQuantityString(com.pinterest.partnerAnalytics.f.topline_metrics_percent_disclaimer, 30, 30);
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                return rn1.a.y(it, bs1.c.h2(quantityString2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f66223i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.f66225k.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                ((g) this.f66224j).getClass();
                Intrinsics.checkNotNullParameter(resources, "resources");
                return yl1.b.f(it, d7.g.q(resources, com.pinterest.partnerAnalytics.g.product_tag_closeup_button, "getString(...)"), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
