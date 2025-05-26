package we1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GrayWebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends ViewGroup implements yk1.n, nx.v {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f129469m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f129470a;

    /* renamed from: b, reason: collision with root package name */
    public final float f129471b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f129472c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129473d;

    /* renamed from: e, reason: collision with root package name */
    public final GrayWebImageView f129474e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorDrawable f129475f;

    /* renamed from: g, reason: collision with root package name */
    public final int f129476g;

    /* renamed from: h, reason: collision with root package name */
    public int f129477h;

    /* renamed from: i, reason: collision with root package name */
    public uo0.c f129478i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f129479j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f129480k;

    /* renamed from: l, reason: collision with root package name */
    public final LayerDrawable f129481l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, boolean z13, float f13, boolean z14, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129470a = z13;
        this.f129471b = f13;
        this.f129472c = z14;
        this.f129473d = i13;
        this.f129476g = getResources().getDimensionPixelOffset(eo1.c.margin_half);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int i14 = r82.c.topic_tile_background_layer_list;
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i14);
        Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        this.f129481l = layerDrawable;
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(layerDrawable);
        addView(imageView, new ViewGroup.MarginLayoutParams(-1, -1));
        this.f129479j = imageView;
        GrayWebImageView grayWebImageView = new GrayWebImageView(getContext(), null);
        grayWebImageView.i2(false);
        float dimensionPixelSize = grayWebImageView.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        grayWebImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        grayWebImageView.g2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        grayWebImageView.f52564p = new xd1.c(grayWebImageView, 3);
        grayWebImageView.M1(grayWebImageView.getResources().getDimensionPixelSize(eo1.c.lego_border_width_small));
        grayWebImageView.o0(grayWebImageView.getContext().getColor(eo1.b.color_themed_background_default));
        addView(grayWebImageView, new ViewGroup.MarginLayoutParams(-1, -1));
        this.f129474e = grayWebImageView;
        this.f129475f = new ColorDrawable(context.getColor(eo1.b.color_themed_light_gray));
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new ic1.c(14, this, context));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dimensionPixelOffset = gestaltText.getResources().getDimensionPixelOffset(eo1.c.margin_half);
        gestaltText.setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        layoutParams.gravity = 16;
        dl2.b.y2(gestaltText);
        gestaltText.setLayoutParams(layoutParams);
        addView(gestaltText);
        this.f129480k = gestaltText;
        setOnClickListener(new lc1.b(this, 26));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129478i;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129478i;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        boolean z14 = this.f129472c;
        int i17 = this.f129473d;
        int i18 = z14 ? i17 * 2 : 0;
        ImageView imageView = this.f129479j;
        bs1.c.p1(imageView, i17, i18);
        bs1.c.G0(imageView);
        int i19 = this.f129476g;
        int i23 = i18 + i19;
        GrayWebImageView grayWebImageView = this.f129474e;
        bs1.c.p1(grayWebImageView, i17 + i19, i23);
        int G0 = bs1.c.G0(grayWebImageView) + i23 + i17;
        GestaltText gestaltText = this.f129480k;
        bs1.c.p1(gestaltText, i19 + i17, G0);
        bs1.c.I0(gestaltText);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int i15 = this.f129476g;
        int i16 = size - i15;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (i16 * this.f129471b), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        GrayWebImageView grayWebImageView = this.f129474e;
        measureChildWithMargins(grayWebImageView, makeMeasureSpec2, 0, makeMeasureSpec, 0);
        this.f129477h = bs1.c.G0(grayWebImageView) + i15;
        ImageView imageView = this.f129479j;
        measureChildWithMargins(imageView, makeMeasureSpec2, 0, makeMeasureSpec, 0);
        bs1.c.G0(imageView);
        int i17 = this.f129477h;
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size - (i15 * 2), 1073741824);
        GestaltText gestaltText = this.f129480k;
        measureChildWithMargins(gestaltText, makeMeasureSpec3, 0, makeMeasureSpec, 0);
        int G0 = bs1.c.G0(gestaltText);
        GestaltText gestaltText2 = this.f129480k;
        measureChildWithMargins(gestaltText2, makeMeasureSpec3, 0, i14, 0);
        bs1.c.I0(gestaltText2);
        int i18 = i17 + G0 + i15;
        if (this.f129472c) {
            i18 += this.f129473d * 2;
        }
        setMeasuredDimension(size, i18);
    }
}
