package ho0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final class f extends LinearLayout implements yk1.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i13) {
        super(context);
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(context, "context");
            super(context);
            setOrientation(1);
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            View.inflate(context, iy1.e.view_pear_style_summary_topic_header, this);
            return;
        }
        if (i13 == 2) {
            super(context);
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, d70.e.view_line_separator, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, Integer num) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setPaddingRelative(0, 0, 0, num != null ? num.intValue() : getResources().getDimensionPixelOffset(d02.a.recycler_bottom_padding_footer));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String titleText, boolean z13, Context context) {
        super(context, null, 0);
        int dimensionPixelOffset;
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, f02.e.section_title_view, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (z13) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(f02.a.board_section_picker_section_title_margin_top);
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(f02.a.board_section_picker_board_title_margin_top);
        }
        View findViewById = findViewById(f02.c.section_title_tv);
        GestaltText gestaltText = (GestaltText) findViewById;
        Intrinsics.f(gestaltText);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).topMargin = dimensionPixelOffset;
            gestaltText.setLayoutParams(layoutParams);
            a0.p(gestaltText, titleText);
            Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
