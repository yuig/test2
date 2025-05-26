package we1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.ui.imageview.GrayWebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends LinearLayout implements yk1.n, nx.v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f129606e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ColorDrawable f129607a;

    /* renamed from: b, reason: collision with root package name */
    public uo0.c f129608b;

    /* renamed from: c, reason: collision with root package name */
    public final GrayWebImageView f129609c;

    /* renamed from: d, reason: collision with root package name */
    public final q1 f129610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        this.f129607a = new ColorDrawable(context.getColor(i13));
        GrayWebImageView grayWebImageView = new GrayWebImageView(context, null);
        float E0 = dl2.b.E0(grayWebImageView, eo1.a.space_400);
        float f13 = z13 ? 0.0f : E0;
        grayWebImageView.i2(false);
        grayWebImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        grayWebImageView.g2(E0, E0, f13, f13);
        grayWebImageView.f52564p = new xd1.c(grayWebImageView, 1);
        grayWebImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, grayWebImageView.getResources().getDimensionPixelSize(eo1.c.structured_feed_editorial_card_image_height)));
        grayWebImageView.setVisibility(8);
        this.f129609c = grayWebImageView;
        q1 q1Var = new q1(context);
        q1Var.setVisibility(8);
        this.f129610d = q1Var;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOnClickListener(new lc1.b(this, 23));
        addView(grayWebImageView);
        addView(q1Var);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129608b;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129608b;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
