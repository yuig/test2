package ym1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.popoverMessage.GestaltPopoverMessage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139423i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltPopoverMessage f139424j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(GestaltPopoverMessage gestaltPopoverMessage, int i13) {
        super(0);
        this.f139423i = i13;
        this.f139424j = gestaltPopoverMessage;
    }

    public final Drawable b() {
        int i13 = this.f139423i;
        GestaltPopoverMessage gestaltPopoverMessage = this.f139424j;
        switch (i13) {
            case 3:
                return gestaltPopoverMessage.getContext().getDrawable(eo1.d.gestalt_popover_caret_bottom);
            case 4:
                return gestaltPopoverMessage.getContext().getDrawable(eo1.d.gestalt_popover_caret_left);
            case 5:
                return gestaltPopoverMessage.getContext().getDrawable(eo1.d.gestalt_popover_caret_right);
            case 6:
                return gestaltPopoverMessage.getContext().getDrawable(eo1.d.gestalt_popover_caret);
            case 7:
                return gestaltPopoverMessage.getContext().getDrawable(eo1.d.gestalt_popover_notification_caret_bottom);
            case 8:
                return gestaltPopoverMessage.getContext().getDrawable(eo1.d.gestalt_popover_notification_caret_left);
            case 9:
                return gestaltPopoverMessage.getContext().getDrawable(eo1.d.gestalt_popover_notification_caret_right);
            default:
                return gestaltPopoverMessage.getContext().getDrawable(eo1.d.gestalt_popover_notification_caret);
        }
    }

    public final Integer e() {
        int i13 = this.f139423i;
        GestaltPopoverMessage gestaltPopoverMessage = this.f139424j;
        switch (i13) {
            case 1:
                return Integer.valueOf(dl2.b.G0(gestaltPopoverMessage, eo1.a.space_500));
            case 2:
                return Integer.valueOf(dl2.b.G0(gestaltPopoverMessage, eo1.a.space_400));
            default:
                return Integer.valueOf(dl2.b.G0(gestaltPopoverMessage, eo1.a.comp_popover_main_text_margin_bottom));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GestaltPopoverMessage gestaltPopoverMessage = this.f139424j;
        int i13 = this.f139423i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return (ConstraintLayout) gestaltPopoverMessage.findViewById(z.popover_constraint_layout);
                    default:
                        return (ConstraintLayout) gestaltPopoverMessage.findViewById(z.popover);
                }
            case 1:
                return e();
            case 2:
                return e();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return b();
            case 7:
                return b();
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                return b();
            case 11:
                switch (i13) {
                    case 0:
                        return (ConstraintLayout) gestaltPopoverMessage.findViewById(z.popover_constraint_layout);
                    default:
                        return (ConstraintLayout) gestaltPopoverMessage.findViewById(z.popover);
                }
            case 12:
                return e();
            default:
                Context context = gestaltPopoverMessage.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return gm1.b.R1(context, eo1.a.comp_buttongroup_theme);
        }
    }
}
