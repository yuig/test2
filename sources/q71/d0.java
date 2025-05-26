package q71;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPinCarousel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102706i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SearchTypeaheadPinCarousel f102707j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(SearchTypeaheadPinCarousel searchTypeaheadPinCarousel, int i13) {
        super(0);
        this.f102706i = i13;
        this.f102707j = searchTypeaheadPinCarousel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f102706i;
        SearchTypeaheadPinCarousel searchTypeaheadPinCarousel = this.f102707j;
        switch (i13) {
            case 0:
                return (PinterestRecyclerView) searchTypeaheadPinCarousel.findViewById(n42.c.pin_carousel);
            case 1:
                Context context = searchTypeaheadPinCarousel.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                m mVar = new m(context);
                mVar.s2();
                mVar.M = -1;
                mVar.setLayoutParams(new LinearLayout.LayoutParams(mVar.getResources().getDimensionPixelSize(n42.a.search_autocomplete_redesign_pin_image_width), mVar.getResources().getDimensionPixelSize(n42.a.search_autocomplete_redesign_pin_image_height)));
                float dimensionPixelSize = mVar.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
                mVar.g2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                mVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                mVar.f52564p = new oq.i(mVar, 11);
                mVar.setOnClickListener(new x61.e(mVar, 4));
                return mVar;
            default:
                return (GestaltText) searchTypeaheadPinCarousel.findViewById(n42.c.cell_title);
        }
    }
}
