package q01;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFilterRepView;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101771i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RelatedPinsFiltersCarouselView f101772j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView, int i13) {
        super(0);
        this.f101771i = i13;
        this.f101772j = relatedPinsFiltersCarouselView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f101771i;
        RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView = this.f101772j;
        switch (i13) {
            case 0:
                int i14 = RelatedPinsFiltersCarouselView.f46960j;
                return Float.valueOf(((Number) relatedPinsFiltersCarouselView.f46967h.getValue()).intValue() / 2.5f);
            default:
                Context context = relatedPinsFiltersCarouselView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new RelatedPinsFilterRepView(6, context, (AttributeSet) null);
        }
    }
}
