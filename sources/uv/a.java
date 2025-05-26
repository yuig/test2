package uv;

import com.pinterest.adsCollageHeroCutout.item.HeroCollagesCarouselCutoutDetailsView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123144i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HeroCollagesCarouselCutoutDetailsView f123145j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(HeroCollagesCarouselCutoutDetailsView heroCollagesCarouselCutoutDetailsView, int i13) {
        super(0);
        this.f123144i = i13;
        this.f123145j = heroCollagesCarouselCutoutDetailsView;
    }

    public final GestaltText b() {
        int i13 = this.f123144i;
        HeroCollagesCarouselCutoutDetailsView heroCollagesCarouselCutoutDetailsView = this.f123145j;
        switch (i13) {
            case 0:
                return (GestaltText) heroCollagesCarouselCutoutDetailsView.findViewById(qv.b.pin_details_description);
            case 1:
            case 2:
            default:
                return (GestaltText) heroCollagesCarouselCutoutDetailsView.findViewById(qv.b.pin_details_title);
            case 3:
                return (GestaltText) heroCollagesCarouselCutoutDetailsView.findViewById(qv.b.pin_details_price_metadata);
            case 4:
                return (GestaltText) heroCollagesCarouselCutoutDetailsView.findViewById(qv.b.pin_details_stock_metadata);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f123144i;
        HeroCollagesCarouselCutoutDetailsView heroCollagesCarouselCutoutDetailsView = this.f123145j;
        switch (i13) {
        }
        return b();
    }
}
