package h01;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kh2.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rq.t0;

/* loaded from: classes5.dex */
public final class h extends AppCompatTextView {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f66438a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String name, boolean z13, int i13, int i14, int i15, Function0 onTapAction, int i16) {
        super(context, null);
        z13 = (i16 & 4) != 0 ? true : z13;
        i13 = (i16 & 8) != 0 ? eo1.b.color_black_900 : i13;
        i14 = (i16 & 16) != 0 ? eo1.b.color_white_0 : i14;
        i15 = (i16 & 32) != 0 ? eo1.c.font_size_300 : i15;
        onTapAction = (i16 & 64) != 0 ? g.f66437i : onTapAction;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(onTapAction, "onTapAction");
        int W = bs1.c.W(this, eo1.c.lego_actionable_icon_size);
        int W2 = bs1.c.W(this, eo1.c.space_300);
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, W));
        setGravity(17);
        setText(name);
        setBackground(z13 ? bs1.c.f0(this, ky1.a.bg_pear_primary_style_tag, Integer.valueOf(i14), null, 4) : bs1.c.f0(this, ky1.a.bg_pear_secondary_style_pill, null, null, 6));
        setPaddingRelative(W2, getPaddingTop(), W2, getPaddingBottom());
        j1.q1(this, i15);
        setTextColor(bs1.c.B(this, z13 ? i13 : eo1.b.color_white_0));
        setOnClickListener(new t0(19, onTapAction));
    }
}
