package com.pinterest.feature.pincarouselads.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pincarouselads/view/CarouselIndexView;", "Landroid/view/View;", "Lcom/pinterest/feature/pincarouselads/view/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ps0/m", "pinCarouselAdsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CarouselIndexView extends View implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f47322a;

    /* renamed from: b, reason: collision with root package name */
    public int f47323b;

    /* renamed from: c, reason: collision with root package name */
    public int f47324c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47325d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f47326e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47327f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47328g;

    /* renamed from: h, reason: collision with root package name */
    public int f47329h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f47330i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f47331j;

    /* renamed from: k, reason: collision with root package name */
    public float f47332k;

    /* renamed from: l, reason: collision with root package name */
    public float f47333l;

    /* renamed from: m, reason: collision with root package name */
    public float f47334m;

    /* renamed from: n, reason: collision with root package name */
    public float f47335n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselIndexView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void a(PinterestRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    public final float b(float f13, float f14, float f15, Canvas canvas, Paint paint) {
        canvas.drawCircle(f13 + f15, f14, f15, paint);
        return (f15 * 2) + this.f47332k;
    }

    public final void c(int i13, int i14) {
        Paint paint = this.f47330i;
        Context context = getContext();
        Object obj = d5.a.f53679a;
        paint.setColor(context.getColor(i14));
        this.f47331j.setColor(getContext().getColor(i13));
    }

    public final void d(int i13) {
        this.f47323b = i13;
        this.f47325d = false;
        this.f47326e = false;
        this.f47327f = false;
        this.f47328g = false;
        h();
        f(i13);
    }

    public final void e(int i13) {
        this.f47324c = i13;
        if (bs1.c.l1(this)) {
            i13 = (this.f47323b - i13) - 1;
        }
        this.f47322a = i13;
        h();
    }

    public void f(int i13) {
    }

    public void g(int i13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f47332k = dl2.b.D0(context, eo1.a.grid_cell_carousel_indicator_horizontal_spacing);
        float f13 = i13;
        this.f47333l = f13 / 2.0f;
        float f14 = 2;
        this.f47334m = (0.6666667f * f13) / f14;
        this.f47335n = (f13 * 0.33333334f) / f14;
    }

    public final void h() {
        int i13 = this.f47323b;
        if (i13 > 5) {
            int i14 = this.f47324c;
            int i15 = this.f47329h;
            if (i14 >= i15 + 3) {
                this.f47329h = i15 + 1;
            } else if (i14 < i15) {
                this.f47329h = i15 - 1;
            }
            int i16 = this.f47329h;
            this.f47325d = i16 > 1;
            this.f47326e = i16 > 0;
            this.f47327f = i13 > i16 + 3;
            this.f47328g = i13 > i16 + 4;
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float paddingStart = getPaddingStart();
        float f13 = this.f47333l;
        boolean z13 = this.f47325d;
        Paint paint = this.f47330i;
        if (z13) {
            paddingStart += b(paddingStart, f13, this.f47335n, canvas, paint);
        }
        if (this.f47326e) {
            paddingStart += b(paddingStart, f13, this.f47334m, canvas, paint);
        }
        int i13 = this.f47323b;
        if (i13 > 5) {
            i13 = this.f47329h + 3;
        }
        int i14 = i13;
        int i15 = this.f47329h;
        while (i15 < i14) {
            paddingStart += b(paddingStart, f13, this.f47333l, canvas, i15 == this.f47322a ? this.f47331j : paint);
            i15++;
        }
        if (this.f47327f) {
            paddingStart += b(paddingStart, f13, this.f47334m, canvas, paint);
        }
        float f14 = paddingStart;
        if (this.f47328g) {
            b(f14, f13, this.f47335n, canvas, paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        if (this.f47333l <= 0.0f) {
            g(View.MeasureSpec.getSize(i14));
        }
        float f13 = this.f47325d ? (this.f47335n * 2) + this.f47332k + 0.0f : 0.0f;
        if (this.f47326e) {
            f13 += (this.f47334m * 2) + this.f47332k;
        }
        int i15 = this.f47323b;
        if (i15 > 5) {
            i15 = this.f47329h + 3;
        }
        for (int i16 = this.f47329h; i16 < i15; i16++) {
            f13 += (this.f47333l * 2) + this.f47332k;
        }
        if (this.f47327f) {
            f13 += (this.f47334m * 2) + this.f47332k;
        }
        if (this.f47328g) {
            f13 += (this.f47335n * 2) + this.f47332k;
        }
        if (f13 > 0.0f) {
            f13 -= this.f47332k;
        }
        setMeasuredDimension((int) f13, View.getDefaultSize(getSuggestedMinimumHeight(), i14));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        g(i14);
    }

    public /* synthetic */ CarouselIndexView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselIndexView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47322a = -1;
        Paint paint = new Paint(1);
        int i14 = eo1.b.color_background_secondary_base;
        Object obj = d5.a.f53679a;
        paint.setColor(context.getColor(i14));
        this.f47330i = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(context.getColor(eo1.b.color_background_inverse_base));
        this.f47331j = paint2;
    }
}
