package qv0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends FrameLayout implements yk1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f105188d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GridView f105189a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f105190b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f105191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.inflate(context, aq1.f.view_idea_pin_category_section, this);
        View findViewById = findViewById(aq1.d.grid_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f105189a = (GridView) findViewById;
        View findViewById2 = findViewById(aq1.d.see_all_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f105190b = (GestaltButton) findViewById2;
        View findViewById3 = findViewById(aq1.d.title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f105191c = (GestaltText) findViewById3;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (getLayoutParams().height == -2) {
            i14 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i13, i14);
    }
}
