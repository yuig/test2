package dm1;

import android.content.Context;
import android.content.res.TypedArray;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.callout.GestaltCallout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55353i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltCallout f55354j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GestaltCallout gestaltCallout, int i13) {
        super(1);
        this.f55353i = i13;
        this.f55354j = gestaltCallout;
    }

    public final void b(rn1.a titleTextDisplayState) {
        int i13 = this.f55353i;
        GestaltCallout gestaltCallout = this.f55354j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(titleTextDisplayState, "titleTextDisplayState");
                d dVar = GestaltCallout.f49346g;
                gestaltCallout.X().i(new j(titleTextDisplayState, 0));
                break;
            default:
                Intrinsics.checkNotNullParameter(titleTextDisplayState, "messageTextDisplayState");
                d dVar2 = GestaltCallout.f49346g;
                gestaltCallout.T().i(new j(titleTextDisplayState, 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f55353i;
        int i14 = 0;
        GestaltCallout gestaltCallout = this.f55354j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                d dVar = GestaltCallout.f49346g;
                gestaltCallout.getClass();
                String string = $receiver.getString(s.GestaltCallout_gestalt_calloutTitleText);
                f0 h23 = string != null ? bs1.c.h2(string) : null;
                String string2 = $receiver.getString(s.GestaltCallout_gestalt_calloutMessageText);
                f0 h24 = string2 != null ? bs1.c.h2(string2) : null;
                String string3 = $receiver.getString(s.GestaltCallout_gestalt_calloutPrimaryActionText);
                if (string3 == null) {
                    string3 = "";
                }
                f0 h25 = bs1.c.h2(string3);
                String string4 = $receiver.getString(s.GestaltCallout_gestalt_calloutSecondaryActionText);
                f0 h26 = bs1.c.h2(string4 != null ? string4 : "");
                int i15 = $receiver.getInt(s.GestaltCallout_gestalt_calloutVariant, -1);
                break;
            case 1:
                om1.c dismissIconButtonDisplayState = (om1.c) obj;
                Intrinsics.checkNotNullParameter(dismissIconButtonDisplayState, "dismissIconButtonDisplayState");
                if (gestaltCallout.f49353f == null && dismissIconButtonDisplayState.f96642d == fm1.c.VISIBLE) {
                    Context context = gestaltCallout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    GestaltIconButton gestaltIconButton = new GestaltIconButton(context, dismissIconButtonDisplayState);
                    gestaltCallout.f49353f = gestaltIconButton;
                    gestaltCallout.addView(gestaltIconButton);
                }
                GestaltIconButton gestaltIconButton2 = gestaltCallout.f49353f;
                if (gestaltIconButton2 != null) {
                    gestaltIconButton2.t(new h(dismissIconButtonDisplayState, i14));
                }
                break;
            case 2:
                rm1.d workflowStatusIconDisplayState = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(workflowStatusIconDisplayState, "workflowStatusIconDisplayState");
                if (gestaltCallout.f49351d == null && workflowStatusIconDisplayState.f108697c == fm1.c.VISIBLE) {
                    Context context2 = gestaltCallout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltIcon gestaltIcon = new GestaltIcon(context2);
                    gestaltCallout.f49351d = gestaltIcon;
                    gestaltCallout.addView(gestaltIcon);
                }
                GestaltIcon gestaltIcon2 = gestaltCallout.f49351d;
                if (gestaltIcon2 != null) {
                    gestaltIcon2.g2(new ks0.f(workflowStatusIconDisplayState, 7));
                }
                break;
            case 3:
                gestaltCallout.setId(((Number) obj).intValue());
                break;
            case 4:
                fm1.c it = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gestaltCallout.setVisibility(it.getVisibility());
                break;
            case 5:
                b((rn1.a) obj);
                break;
            case 6:
                b((rn1.a) obj);
                break;
            default:
                cm1.d buttonGroupDisplayState = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(buttonGroupDisplayState, "buttonGroupDisplayState");
                if (gestaltCallout.f49352e == null && buttonGroupDisplayState.f28017f == fm1.c.VISIBLE) {
                    Context context3 = gestaltCallout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    GestaltButtonGroup gestaltButtonGroup = new GestaltButtonGroup(context3, buttonGroupDisplayState);
                    gestaltCallout.f49352e = gestaltButtonGroup;
                    gestaltCallout.addView(gestaltButtonGroup);
                }
                GestaltButtonGroup gestaltButtonGroup2 = gestaltCallout.f49352e;
                if (gestaltButtonGroup2 != null) {
                    gestaltButtonGroup2.a(new cm1.h(buttonGroupDisplayState, 2));
                }
                break;
        }
        return Unit.f80348a;
    }
}
