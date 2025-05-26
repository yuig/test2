package we1;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends LinearLayout implements yk1.n, nx.v {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f129536d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ProportionalImageView f129537a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f129538b;

    /* renamed from: c, reason: collision with root package name */
    public uo0.c f129539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ProportionalImageView proportionalImageView = new ProportionalImageView(getContext());
        proportionalImageView.f52576J = 1.0f;
        proportionalImageView.U1(r82.b.shopping_category_bubble_corner_radius);
        Context context2 = proportionalImageView.getContext();
        int i13 = r82.a.pinterest_black_transparent_15;
        Object obj = d5.a.f53679a;
        proportionalImageView.setColorFilter(context2.getColor(i13), PorterDuff.Mode.SRC_ATOP);
        proportionalImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f129537a = proportionalImageView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_200);
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        gestaltText.setLayoutParams(layoutParams);
        gestaltText.i(o.f129509j);
        this.f129538b = gestaltText;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(proportionalImageView);
        addView(gestaltText);
        setOnClickListener(new lc1.b(this, 22));
    }

    public final void a(String imageUrl, u50.i placeHolderColor) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(placeHolderColor, "placeHolderColor");
        ProportionalImageView proportionalImageView = this.f129537a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        proportionalImageView.V1(imageUrl, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : new ColorDrawable(((Number) placeHolderColor.a(context)).intValue()), (r18 & 64) != 0 ? null : null, null);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129539c;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129539c;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
