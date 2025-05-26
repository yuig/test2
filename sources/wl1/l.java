package wl1;

import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gm1.a p03 = (gm1.a) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        GestaltBannerOverlay gestaltBannerOverlay = (GestaltBannerOverlay) this.receiver;
        GestaltButtonGroup gestaltButtonGroup = gestaltBannerOverlay.f49315i;
        if (gestaltButtonGroup != null) {
            gestaltButtonGroup.b(new a(gestaltBannerOverlay, p03));
        }
        GestaltIconButton gestaltIconButton = gestaltBannerOverlay.f49317k;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new a(p03, gestaltBannerOverlay));
        }
        return Unit.f80348a;
    }
}
