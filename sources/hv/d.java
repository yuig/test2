package hv;

import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import n60.o;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70434i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f70435j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(1);
        this.f70434i = i13;
        this.f70435j = eVar;
    }

    public final void b(f30 fetchPin) {
        int i13 = this.f70434i;
        e eVar = this.f70435j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(fetchPin, "$this$fetchPin");
                eVar.getPinalytics().F(g0.PIN_CLOSEUP_GALLERY, u0.FLASHLIGHT_SEARCH_ICON);
                eVar.f70441h.d(new oq.c(fetchPin));
                break;
            default:
                Intrinsics.checkNotNullParameter(fetchPin, "$this$fetchPin");
                ((CloseupCarouselView) eVar.getView()).f35416J = o.B(fetchPin, "getIsPromoted(...)");
                CloseupCarouselView closeupCarouselView = (CloseupCarouselView) eVar.getView();
                String z43 = fetchPin.z4();
                boolean z13 = false;
                boolean z14 = (z43 == null || z43.length() == 0 || fetchPin.u4().booleanValue() || fetchPin.n5().booleanValue() || fetchPin.f5().booleanValue()) ? false : true;
                if (!closeupCarouselView.f35416J && z14) {
                    z13 = true;
                }
                closeupCarouselView.L = z13;
                GestaltIconButton gestaltIconButton = closeupCarouselView.G;
                if (!z13) {
                    com.bumptech.glide.c.d0(gestaltIconButton);
                    break;
                } else {
                    com.bumptech.glide.c.u1(gestaltIconButton);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f70434i) {
            case 0:
                b((f30) obj);
                break;
            default:
                b((f30) obj);
                break;
        }
        return Unit.f80348a;
    }
}
