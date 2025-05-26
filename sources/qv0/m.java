package qv0;

import android.content.Context;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends LinearLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.l f105192a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f105193b;

    /* renamed from: c, reason: collision with root package name */
    public final GridView f105194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, com.bumptech.glide.l animatedGifLoader) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(animatedGifLoader, "animatedGifLoader");
        this.f105192a = animatedGifLoader;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View.inflate(context, aq1.f.view_idea_pin_sticker_recently_used_or_popular_section, this);
        View findViewById = findViewById(aq1.d.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f105193b = (GestaltText) findViewById;
        View findViewById2 = findViewById(aq1.d.grid_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f105194c = (GridView) findViewById2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (getLayoutParams().height == -2) {
            i14 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i13, i14);
    }
}
