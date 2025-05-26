package px1;

import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.partnerAnalytics.feature.filter.FilterDateRangeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101678i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ FilterDateRangeView f101679j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(FilterDateRangeView filterDateRangeView, int i13) {
        super(1);
        this.f101678i = i13;
        this.f101679j = filterDateRangeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101678i;
        FilterDateRangeView filterDateRangeView = this.f101679j;
        switch (i13) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                zx.f fVar = (zx.f) filterDateRangeView.f50178m.get(it.f101681a);
                if (filterDateRangeView.f50166a) {
                    zx.f fVar2 = zx.f.HOURS_24;
                    GestaltSwitchWithLabel gestaltSwitchWithLabel = filterDateRangeView.f50170e;
                    if (fVar == fVar2) {
                        filterDateRangeView.f50177l = false;
                        gestaltSwitchWithLabel.T(e.f101642u);
                    } else {
                        gestaltSwitchWithLabel.T(e.f101643v);
                    }
                }
                filterDateRangeView.k(fVar);
                filterDateRangeView.f50180o.invoke(fVar);
                break;
            default:
                on1.i it2 = (on1.i) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                filterDateRangeView.k((zx.f) filterDateRangeView.f50178m.get(filterDateRangeView.f50171f.f50189e));
                if (filterDateRangeView.f50177l) {
                    filterDateRangeView.f50183r.invoke(Boolean.valueOf(it2 instanceof on1.g));
                } else {
                    filterDateRangeView.f50177l = true;
                }
                break;
        }
        return Unit.f80348a;
    }
}
