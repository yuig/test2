package com.pinterest.activity.create.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.v7;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import eo1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import vn1.c;
import yy1.d;
import yy1.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/activity/create/view/FloatingBoardPicker;", "Lcom/pinterest/design/widget/RoundedCornersLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "pinIt_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FloatingBoardPicker extends RoundedCornersLayout {

    /* renamed from: f, reason: collision with root package name */
    public v7 f34947f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingBoardPicker(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.floating_board_picker, this);
        i(true);
    }

    public final void i(boolean z13) {
        int i13;
        c cVar;
        rm1.c cVar2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean q03 = a0.q0(context);
        if (z13 && !q03) {
            i13 = a.base_color_grayscale_0;
            cVar = c.DARK;
            cVar2 = rm1.c.DEFAULT;
        } else if (!z13 && !q03) {
            i13 = a.base_color_grayscale_0;
            cVar = c.DISABLED;
            cVar2 = rm1.c.DISABLED;
        } else if (z13 && q03) {
            i13 = a.color_gray_roboflow_700;
            cVar = c.LIGHT;
            cVar2 = rm1.c.DEFAULT;
        } else {
            i13 = a.sema_color_background_secondary_default;
            cVar = c.SUBTLE;
            cVar2 = rm1.c.DISABLED;
        }
        ((LinearLayout) findViewById(yy1.c.floating_board_picker_text_container)).setBackgroundColor(b.y0(this, i13));
        View findViewById = findViewById(yy1.c.saving_to);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((GestaltText) findViewById).i(new sp.a(0, cVar));
        View findViewById2 = findViewById(yy1.c.board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ((GestaltText) findViewById2).i(new sp.a(0, cVar));
        View findViewById3 = findViewById(yy1.c.edit_board_picker_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ((GestaltIcon) findViewById3).g2(new sp.b(cVar2, 0));
        setEnabled(z13);
    }

    public final void j() {
        View findViewById = findViewById(yy1.c.saving_to);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        a0.o((GestaltText) findViewById, e.optional, new Object[0]);
        View findViewById2 = findViewById(yy1.c.board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        a0.o((GestaltText) findViewById2, e.choose_a_board, new Object[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingBoardPicker(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.floating_board_picker, this);
        i(true);
    }
}
