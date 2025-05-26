package ym1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.popoverMessage.GestaltPopoverMessage;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139410i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltPopoverMessage f139411j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GestaltPopoverMessage gestaltPopoverMessage, int i13) {
        super(1);
        this.f139410i = i13;
        this.f139411j = gestaltPopoverMessage;
    }

    public final void b(rn1.k bind) {
        int i13 = this.f139410i;
        GestaltPopoverMessage gestaltPopoverMessage = this.f139411j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String string = gestaltPopoverMessage.getContext().getString(b0.popover_educational_steps_placeholder, String.valueOf(gestaltPopoverMessage.f49460h), String.valueOf(gestaltPopoverMessage.f49461i));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                f0 text = new f0(string);
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f108886a = text;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String string2 = gestaltPopoverMessage.getContext().getString(b0.popover_educational_steps_placeholder, String.valueOf(gestaltPopoverMessage.f49460h), String.valueOf(gestaltPopoverMessage.f49461i));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                f0 text2 = new f0(string2);
                bind.getClass();
                Intrinsics.checkNotNullParameter(text2, "text");
                bind.f108886a = text2;
                bind.i(fm1.c.VISIBLE);
                bind.b(vn1.c.INVERSE);
                bind.h(vn1.g.BODY_100);
                bind.f108897l = z.popover_stepper_text;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d dVar = null;
        int i13 = this.f139410i;
        GestaltPopoverMessage gestaltPopoverMessage = this.f139411j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltPopoverMessage.A;
                gestaltPopoverMessage.getClass();
                int i14 = c0.GestaltPopover_gestalt_mainText;
                Intrinsics.checkNotNullParameter($receiver, "<this>");
                String string = $receiver.getString(i14);
                List b13 = e0.b(string != null ? new f0(string) : h0.f120562a);
                fm1.c Y = d7.b.Y($receiver, c0.GestaltPopover_android_visibility, GestaltPopoverMessage.A);
                String string2 = $receiver.getString(c0.GestaltPopover_gestalt_endButtonText);
                if (string2 != null) {
                    Intrinsics.checkNotNullParameter(string2, "string");
                    dVar = new d(new f0(string2), fm1.c.VISIBLE);
                }
                d dVar2 = dVar;
                int i15 = $receiver.getInt(c0.GestaltPopover_gestalt_idealCaretDirection, -1);
                e eVar = i15 >= 0 ? e.values()[i15] : GestaltPopoverMessage.C;
                int i16 = c0.GestaltPopover_gestalt_popoverVariant;
                g gVar = g.DEFAULT;
                int i17 = $receiver.getInt(i16, -1);
                break;
            case 1:
                b((rn1.k) obj);
                break;
            case 2:
                rn1.a stepperText = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(stepperText, "stepperText");
                break;
            case 3:
                b((rn1.k) obj);
                break;
            case 4:
                e caret = (e) obj;
                Intrinsics.checkNotNullParameter(caret, "caret");
                GestaltPopoverMessage.L(gestaltPopoverMessage, caret);
                break;
            case 5:
                List text = (List) obj;
                Intrinsics.checkNotNullParameter(text, "text");
                i0 i0Var = (i0) text.get(0);
                if (i0Var != null) {
                    Context context = gestaltPopoverMessage.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (bs1.c.i1(i0Var, context)) {
                        GestaltText gestaltText = gestaltPopoverMessage.f49458f;
                        if (gestaltText == null) {
                            Context context2 = gestaltPopoverMessage.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
                            gestaltPopoverMessage.f49458f = gestaltText2;
                            pp2.a.k(gestaltText2, new fx.e(12, i0Var));
                            gestaltText2.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                            gestaltPopoverMessage.X().addView(gestaltText2);
                        } else {
                            pp2.a.k(gestaltText, new fx.e(11, i0Var));
                        }
                    }
                }
                break;
            default:
                gestaltPopoverMessage.f49461i = ((Number) obj).intValue();
                break;
        }
        return Unit.f80348a;
    }
}
