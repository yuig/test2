package we1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.following.carousel.view.ImpressionableUserRep;
import com.pinterest.ui.imageview.GrayWebImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends LinearLayout implements yk1.n, nx.v {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f129444f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f129445a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorDrawable f129446b;

    /* renamed from: c, reason: collision with root package name */
    public uo0.c f129447c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f129448d;

    /* renamed from: e, reason: collision with root package name */
    public final ImpressionableUserRep f129449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        this.f129445a = arrayList;
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(View.generateViewId());
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        constraintLayout.setVisibility(4);
        this.f129448d = constraintLayout;
        this.f129449e = new ImpressionableUserRep(context);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f129446b = new ColorDrawable(bs1.c.B(this, eo1.b.color_themed_light_gray));
        float W = bs1.c.W(this, eo1.c.lego_corner_radius_medium);
        int W2 = bs1.c.W(this, r82.b.product_grid_image_spacing);
        GrayWebImageView grayWebImageView = new GrayWebImageView(getContext(), null);
        grayWebImageView.setId(View.generateViewId());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        grayWebImageView.setScaleType(scaleType);
        grayWebImageView.g2(W, 0.0f, 0.0f, 0.0f);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.G = "H,1:1";
        grayWebImageView.setLayoutParams(layoutParams);
        grayWebImageView.f52564p = new xd1.c(grayWebImageView, 2);
        constraintLayout.addView(grayWebImageView);
        arrayList.add(grayWebImageView);
        GrayWebImageView grayWebImageView2 = new GrayWebImageView(getContext(), null);
        grayWebImageView2.setId(View.generateViewId());
        grayWebImageView2.setScaleType(scaleType);
        grayWebImageView2.g2(0.0f, W, 0.0f, 0.0f);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams2.G = "H,1:1";
        grayWebImageView2.setLayoutParams(layoutParams2);
        grayWebImageView2.f52564p = new xd1.c(grayWebImageView2, 2);
        constraintLayout.addView(grayWebImageView2);
        arrayList.add(grayWebImageView2);
        GrayWebImageView grayWebImageView3 = new GrayWebImageView(getContext(), null);
        grayWebImageView3.setId(View.generateViewId());
        grayWebImageView3.setScaleType(scaleType);
        grayWebImageView3.g2(0.0f, 0.0f, W, 0.0f);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams3.G = "H,1:1";
        grayWebImageView3.setLayoutParams(layoutParams3);
        grayWebImageView3.f52564p = new xd1.c(grayWebImageView3, 2);
        constraintLayout.addView(grayWebImageView3);
        arrayList.add(grayWebImageView3);
        GrayWebImageView grayWebImageView4 = new GrayWebImageView(getContext(), null);
        grayWebImageView4.setId(View.generateViewId());
        grayWebImageView4.setScaleType(scaleType);
        grayWebImageView4.g2(0.0f, 0.0f, 0.0f, W);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams4.G = "H,1:1";
        grayWebImageView4.setLayoutParams(layoutParams4);
        grayWebImageView4.f52564p = new xd1.c(grayWebImageView4, 2);
        constraintLayout.addView(grayWebImageView4);
        arrayList.add(grayWebImageView4);
        ViewGroup.LayoutParams layoutParams5 = grayWebImageView.getLayoutParams();
        Intrinsics.g(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        layoutParams6.f17691t = constraintLayout.getId();
        layoutParams6.f17692u = grayWebImageView2.getId();
        layoutParams6.f17671i = constraintLayout.getId();
        layoutParams6.f17675k = grayWebImageView3.getId();
        grayWebImageView.setPaddingRelative(0, 0, W2, W2);
        ViewGroup.LayoutParams layoutParams7 = grayWebImageView2.getLayoutParams();
        Intrinsics.g(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        layoutParams8.f17690s = grayWebImageView.getId();
        layoutParams8.f17693v = constraintLayout.getId();
        layoutParams8.f17671i = constraintLayout.getId();
        layoutParams8.f17675k = grayWebImageView4.getId();
        grayWebImageView2.setPaddingRelative(W2, 0, 0, W2);
        ViewGroup.LayoutParams layoutParams9 = grayWebImageView3.getLayoutParams();
        Intrinsics.g(layoutParams9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
        layoutParams10.f17691t = constraintLayout.getId();
        layoutParams10.f17692u = grayWebImageView4.getId();
        layoutParams10.f17673j = grayWebImageView.getId();
        layoutParams10.f17677l = constraintLayout.getId();
        grayWebImageView3.setPaddingRelative(0, W2, W2, 0);
        ViewGroup.LayoutParams layoutParams11 = grayWebImageView4.getLayoutParams();
        Intrinsics.g(layoutParams11, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
        layoutParams12.f17690s = grayWebImageView3.getId();
        layoutParams12.f17693v = getId();
        layoutParams12.f17673j = grayWebImageView2.getId();
        layoutParams12.f17677l = getId();
        grayWebImageView4.setPaddingRelative(W2, W2, 0, 0);
        addView(constraintLayout);
        constraintLayout.setOnClickListener(new lc1.b(this, 24));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129447c;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129447c;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
