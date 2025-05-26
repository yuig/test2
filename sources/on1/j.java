package on1;

import android.content.res.TypedArray;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96738i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSwitchWithLabel f96739j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(GestaltSwitchWithLabel gestaltSwitchWithLabel, int i13) {
        super(1);
        this.f96738i = i13;
        this.f96739j = gestaltSwitchWithLabel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f96738i;
        int i14 = 1;
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f96739j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltSwitchWithLabel.f49614g;
                gestaltSwitchWithLabel.getClass();
                b bVar = new b($receiver.getBoolean(x.GestaltSwitch_android_checked, false), $receiver.getBoolean(x.GestaltSwitch_android_enabled, true), RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                fm1.c Y = d7.b.Y($receiver, x.GestaltSwitch_android_visibility, GestaltSwitchWithLabel.f49614g);
                String string = $receiver.getString(x.GestaltSwitch_gestalt_switchLabel);
                i0 h23 = string != null ? bs1.c.h2(string) : GestaltSwitchWithLabel.f49615h;
                String string2 = $receiver.getString(x.GestaltSwitch_gestalt_switchSubtext);
                f0 h24 = string2 != null ? bs1.c.h2(string2) : null;
                int i15 = $receiver.getInt(x.GestaltSwitch_gestalt_switchTextAlignment, -1);
                n nVar = i15 >= 0 ? n.values()[i15] : GestaltSwitchWithLabel.f49616i;
                int i16 = $receiver.getInt(x.GestaltSwitch_gestalt_switchLabelPosition, -1);
                break;
            case 1:
                i event = (i) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                com.google.firebase.messaging.q qVar = gestaltSwitchWithLabel.f49618a;
                e doOnClick = e.f96724r;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(doOnClick, "doOnClick");
                Intrinsics.checkNotNullParameter(event, "event");
                Unit unit = Unit.f80348a;
                doOnClick.invoke(unit);
                qVar.s(event);
                break;
            case 2:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                fm1.c cVar2 = GestaltSwitchWithLabel.f49614g;
                pe.i.i(gestaltSwitchWithLabel.a0(), new j(gestaltSwitchWithLabel, i14));
                break;
            case 3:
                l it = (l) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                androidx.constraintlayout.widget.p pVar = gestaltSwitchWithLabel.f49623f;
                pVar.j(gestaltSwitchWithLabel);
                pVar.h(gestaltSwitchWithLabel.a0().getId(), 6);
                pVar.h(gestaltSwitchWithLabel.a0().getId(), 7);
                int i17 = o.f96748a[it.ordinal()];
                if (i17 == 1) {
                    pVar.l(gestaltSwitchWithLabel.a0().getId(), 7, 0, 7);
                    l lVar = l.LEFT;
                    gestaltSwitchWithLabel.L(lVar, gestaltSwitchWithLabel.d0());
                    GestaltText gestaltText = gestaltSwitchWithLabel.f49621d;
                    if (gestaltText != null) {
                        gestaltSwitchWithLabel.L(lVar, gestaltText);
                    }
                    pVar.b(gestaltSwitchWithLabel);
                } else if (i17 == 2) {
                    pVar.l(gestaltSwitchWithLabel.a0().getId(), 6, 0, 6);
                    l lVar2 = l.RIGHT;
                    gestaltSwitchWithLabel.L(lVar2, gestaltSwitchWithLabel.d0());
                    GestaltText gestaltText2 = gestaltSwitchWithLabel.f49621d;
                    if (gestaltText2 != null) {
                        gestaltSwitchWithLabel.L(lVar2, gestaltText2);
                    }
                    pVar.b(gestaltSwitchWithLabel);
                }
                break;
            case 4:
                gestaltSwitchWithLabel.setId(((Number) obj).intValue());
                break;
            case 5:
                fm1.c it2 = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gestaltSwitchWithLabel.setVisibility(it2.getVisibility());
                break;
            default:
                b it3 = (b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                fm1.c cVar3 = GestaltSwitchWithLabel.f49614g;
                gestaltSwitchWithLabel.a0().i(new an1.i(it3, 10));
                break;
        }
        return Unit.f80348a;
    }
}
