package ym1;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.popoverMessage.GestaltPopoverMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final gm1.a p03 = (gm1.a) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        GestaltPopoverMessage gestaltPopoverMessage = (GestaltPopoverMessage) this.receiver;
        GestaltButton.SmallTertiaryButton smallTertiaryButton = gestaltPopoverMessage.f49455c;
        if (smallTertiaryButton != null) {
            final int i13 = 0;
            smallTertiaryButton.e(new gm1.a() { // from class: ym1.a
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i14 = i13;
                    gm1.a eventHandler = p03;
                    switch (i14) {
                        case 0:
                            fm1.c cVar = GestaltPopoverMessage.A;
                            Intrinsics.checkNotNullParameter(eventHandler, "$eventHandler");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof xl1.a) {
                                eventHandler.h3(new n(z.popover_button_end));
                                break;
                            }
                            break;
                        default:
                            fm1.c cVar2 = GestaltPopoverMessage.A;
                            Intrinsics.checkNotNullParameter(eventHandler, "$eventHandler");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                eventHandler.h3(new m(z.popover_dismiss_icon_button));
                                break;
                            }
                            break;
                    }
                }
            });
        }
        GestaltIconButton gestaltIconButton = gestaltPopoverMessage.f49453a;
        if (gestaltIconButton != null) {
            final int i14 = 1;
            gestaltIconButton.u(new gm1.a() { // from class: ym1.a
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i142 = i14;
                    gm1.a eventHandler = p03;
                    switch (i142) {
                        case 0:
                            fm1.c cVar = GestaltPopoverMessage.A;
                            Intrinsics.checkNotNullParameter(eventHandler, "$eventHandler");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof xl1.a) {
                                eventHandler.h3(new n(z.popover_button_end));
                                break;
                            }
                            break;
                        default:
                            fm1.c cVar2 = GestaltPopoverMessage.A;
                            Intrinsics.checkNotNullParameter(eventHandler, "$eventHandler");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                eventHandler.h3(new m(z.popover_dismiss_icon_button));
                                break;
                            }
                            break;
                    }
                }
            });
        }
        return Unit.f80348a;
    }
}
