package we1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.pinterest.ui.imageview.GrayWebImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 extends ViewGroup implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final float f129665a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f129666b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorDrawable f129667c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129668d;

    /* renamed from: e, reason: collision with root package name */
    public final int f129669e;

    /* renamed from: f, reason: collision with root package name */
    public int f129670f;

    /* renamed from: g, reason: collision with root package name */
    public int f129671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129665a = 0.6666667f;
        this.f129666b = new ArrayList();
        int i13 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        this.f129667c = new ColorDrawable(context.getColor(i13));
        this.f129668d = getResources().getDimensionPixelSize(eo1.c.space_200);
        this.f129669e = 2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        float dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        for (int i14 = 6; i14 > 0; i14--) {
            GrayWebImageView grayWebImageView = new GrayWebImageView(getContext(), null);
            grayWebImageView.i2(false);
            grayWebImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            grayWebImageView.g2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            grayWebImageView.f52564p = new xd1.c(grayWebImageView, 4);
            addView(grayWebImageView, marginLayoutParams);
            this.f129666b.add(grayWebImageView);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        t0 t0Var = this.f129665a == 1.0f ? x0.f129681b : x0.f129680a;
        int i17 = this.f129670f;
        int i18 = i13 - (i17 - ((int) (i17 * t0Var.f129611a)));
        int i19 = this.f129671g;
        int i23 = i14 - (i19 - ((int) (i19 * t0Var.f129612b)));
        ArrayList arrayList = this.f129666b;
        GrayWebImageView grayWebImageView = (GrayWebImageView) arrayList.get(0);
        bs1.c.p1(grayWebImageView, i18, i23);
        int G0 = bs1.c.G0(grayWebImageView);
        int i24 = this.f129668d;
        int i25 = G0 + i24 + i23;
        GrayWebImageView grayWebImageView2 = (GrayWebImageView) arrayList.get(1);
        bs1.c.p1(grayWebImageView2, i18, i25);
        int I0 = bs1.c.I0(grayWebImageView2) + i24 + i18;
        int i26 = this.f129671g;
        int i27 = i14 - (i26 - ((int) (i26 * t0Var.f129613c)));
        GrayWebImageView grayWebImageView3 = (GrayWebImageView) arrayList.get(2);
        bs1.c.p1(grayWebImageView3, I0, i27);
        int G02 = bs1.c.G0(grayWebImageView3) + i24 + i27;
        GrayWebImageView grayWebImageView4 = (GrayWebImageView) arrayList.get(3);
        bs1.c.p1(grayWebImageView4, I0, G02);
        int I02 = bs1.c.I0(grayWebImageView4) + i24 + I0;
        int i28 = this.f129671g;
        int i29 = i14 - (i28 - ((int) (i28 * 0.9367816f)));
        GrayWebImageView grayWebImageView5 = (GrayWebImageView) arrayList.get(4);
        bs1.c.p1(grayWebImageView5, I02, i29);
        int G03 = bs1.c.G0(grayWebImageView5) + i24 + i29;
        GrayWebImageView grayWebImageView6 = (GrayWebImageView) arrayList.get(5);
        bs1.c.p1(grayWebImageView6, I02, G03);
        bs1.c.I0(grayWebImageView6);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13) - (this.f129668d * this.f129669e);
        float f13 = this.f129665a;
        int i15 = (int) (size / (f13 == 1.0f ? 2.0d : 2.5d));
        this.f129670f = i15;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (this.f129670f * 1.3181818f), 1073741824);
        Iterator it = this.f129666b.iterator();
        while (it.hasNext()) {
            GrayWebImageView grayWebImageView = (GrayWebImageView) it.next();
            measureChildWithMargins(grayWebImageView, makeMeasureSpec, 0, makeMeasureSpec2, 0);
            this.f129671g = bs1.c.G0(grayWebImageView);
        }
        int size2 = View.MeasureSpec.getSize(i13);
        setMeasuredDimension(size2, (int) (size2 * f13));
    }
}
