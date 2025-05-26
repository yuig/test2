package q71;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends LinearLayout implements yk1.d {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f102695e = 0;

    /* renamed from: a, reason: collision with root package name */
    public o71.q f102696a;

    /* renamed from: b, reason: collision with root package name */
    public final GrayWebImageView f102697b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f102698c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f102699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setOnClickListener(new x61.e(this, 7));
        View.inflate(context, n42.d.search_typeahead_nux_topic_cell_view, this);
        View findViewById = findViewById(n42.c.backgroundImageView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GrayWebImageView grayWebImageView = (GrayWebImageView) findViewById;
        this.f102697b = grayWebImageView;
        View findViewById2 = findViewById(n42.c.nux_topic_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById2;
        this.f102698c = webImageView;
        View findViewById3 = findViewById(n42.c.nux_topic_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById3;
        this.f102699d = gestaltText;
        float dimensionPixelOffset = grayWebImageView.getResources().getDimensionPixelOffset(eo1.c.lego_corner_radius_medium_border);
        grayWebImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        float dimensionPixelOffset2 = webImageView.getResources().getDimensionPixelOffset(eo1.c.lego_corner_radius_medium);
        webImageView.g2(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
        webImageView.M1(webImageView.getResources().getDimensionPixelSize(eo1.c.lego_border_width_small));
        int i13 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        webImageView.o0(context.getColor(i13));
        webImageView.setColorFilter(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_100));
        gestaltText.getLayoutParams().width = ((int) (hf0.b.f69002b / 3)) - bs1.c.W(this, n42.a.topic_subtitle_width_margin);
    }
}
