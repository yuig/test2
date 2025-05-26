package we1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 extends ViewGroup implements yk1.n, nx.v {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f129540i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f129541a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f129542b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorDrawable f129543c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129544d;

    /* renamed from: e, reason: collision with root package name */
    public int f129545e;

    /* renamed from: f, reason: collision with root package name */
    public uo0.c f129546f;

    /* renamed from: g, reason: collision with root package name */
    public final int f129547g;

    /* renamed from: h, reason: collision with root package name */
    public final int f129548h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(float f13, int i13, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129541a = f13;
        this.f129542b = new ArrayList();
        if (i13 == 0) {
            setVisibility(8);
        }
        int min = Math.min(i13, 4);
        this.f129548h = min;
        this.f129547g = Integer.max(min - 1, 0);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f129544d = getResources().getDimensionPixelOffset(eo1.c.margin_extra_small);
        int i14 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        this.f129543c = new ColorDrawable(context.getColor(i14));
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        int max = Math.max(min, 1);
        for (int i15 = 0; i15 < max; i15++) {
            WebImageView webImageView = new WebImageView(getContext());
            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            webImageView.f52564p = new eu.l(webImageView, 5);
            addView(webImageView, marginLayoutParams);
            this.f129542b.add(webImageView);
        }
        setOnClickListener(new lc1.b(this, 28));
        setImportantForAccessibility(2);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129546f;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129546f;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int max = this.f129545e / Integer.max(this.f129547g, 1);
        int i17 = this.f129544d + (max != 0 ? max : 1);
        Iterator it = this.f129542b.iterator();
        int i18 = 0;
        int i19 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i23 = i18 + 1;
            if (i18 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            Object obj = (bb2.j) next;
            Intrinsics.g(obj, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj;
            bs1.c.p1(view, i19, 0);
            i19 += bs1.c.I0(view) + i17;
            i18 = i23;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13) - (this.f129544d * this.f129547g);
        int i15 = this.f129548h;
        int max = size / Integer.max(i15, 1);
        this.f129545e = size % i15;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (size * this.f129541a), 1073741824);
        Iterator it = this.f129542b.iterator();
        int i16 = 0;
        while (it.hasNext()) {
            Object obj = (bb2.j) it.next();
            Intrinsics.g(obj, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj;
            measureChildWithMargins(view, makeMeasureSpec, 0, makeMeasureSpec2, 0);
            i16 = bs1.c.G0(view);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i13), i16);
    }
}
