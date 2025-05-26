package com.pinterest.feature.pincarouselads.view;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.c0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/pincarouselads/view/CarouselIndexViewAnimated;", "Lcom/pinterest/feature/pincarouselads/view/CarouselIndexView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinCarouselAdsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CarouselIndexViewAnimated extends CarouselIndexView {

    /* renamed from: o, reason: collision with root package name */
    public float f47336o;

    /* renamed from: p, reason: collision with root package name */
    public float f47337p;

    /* renamed from: q, reason: collision with root package name */
    public float f47338q;

    /* renamed from: r, reason: collision with root package name */
    public float f47339r;

    /* renamed from: s, reason: collision with root package name */
    public float f47340s;

    /* renamed from: t, reason: collision with root package name */
    public float f47341t;

    /* renamed from: u, reason: collision with root package name */
    public SparseArray f47342u;

    /* renamed from: v, reason: collision with root package name */
    public int f47343v;

    /* renamed from: w, reason: collision with root package name */
    public final ArgbEvaluator f47344w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f47345x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f47346y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselIndexViewAnimated(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.pincarouselads.view.CarouselIndexView
    public final void a(PinterestRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f47346y = true;
        new c0(3).a(this, recyclerView);
    }

    @Override // com.pinterest.feature.pincarouselads.view.CarouselIndexView
    public final void f(int i13) {
        n(i13);
    }

    @Override // com.pinterest.feature.pincarouselads.view.CarouselIndexView
    public final void g(int i13) {
        if (!this.f47346y) {
            super.g(i13);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float f13 = 2;
        float D0 = dl2.b.D0(context, eo1.a.grid_cell_carousel_indicator_horizontal_spacing) * f13;
        this.f47332k = D0;
        float f14 = i13;
        this.f47336o = f14;
        this.f47337p = 0.6666667f * f14;
        this.f47338q = 0.33333334f * f14;
        this.f47340s = (4 * D0) + f14;
        this.f47341t = f14 / f13;
    }

    public final int i(float f13) {
        Object evaluate = this.f47344w.evaluate(f13, Integer.valueOf(this.f47330i.getColor()), Integer.valueOf(this.f47331j.getColor()));
        Intrinsics.g(evaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) evaluate).intValue();
    }

    /* renamed from: j, reason: from getter */
    public final int getF47343v() {
        return this.f47343v;
    }

    public final float k(int i13) {
        return (i13 * this.f47332k) + this.f47341t;
    }

    public final float l(int i13) {
        SparseArray sparseArray = this.f47342u;
        Float f13 = sparseArray != null ? (Float) sparseArray.get(i13) : null;
        if (f13 == null) {
            return 0.0f;
        }
        return f13.floatValue();
    }

    public final void m(int i13, float f13) {
        if (this.f47342u == null || this.f47343v == 0) {
            return;
        }
        float abs = 1 - Math.abs(f13);
        if (abs == 0.0f) {
            SparseArray sparseArray = this.f47342u;
            if (sparseArray != null) {
                sparseArray.remove(i13);
                return;
            }
            return;
        }
        SparseArray sparseArray2 = this.f47342u;
        if (sparseArray2 != null) {
            sparseArray2.put(i13, Float.valueOf(abs));
        }
    }

    public final void n(int i13) {
        if (this.f47343v == i13) {
            return;
        }
        this.f47343v = i13;
        this.f47342u = new SparseArray();
        if (i13 < 3) {
            requestLayout();
            invalidate();
        } else {
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        if (r11 >= r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r11 >= r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r10 >= r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        if (r9 >= r8) goto L59;
     */
    @Override // com.pinterest.feature.pincarouselads.view.CarouselIndexView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.pincarouselads.view.CarouselIndexViewAnimated.onDraw(android.graphics.Canvas):void");
    }

    @Override // com.pinterest.feature.pincarouselads.view.CarouselIndexView, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (!this.f47346y) {
            super.onMeasure(i13, i14);
            return;
        }
        if (this.f47336o <= 0.0f) {
            g(View.MeasureSpec.getSize(i14));
        }
        setMeasuredDimension((int) (this.f47343v >= 5 ? this.f47340s : ((r2 - 1) * this.f47332k) + this.f47336o), View.getDefaultSize(getSuggestedMinimumHeight(), i14));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselIndexViewAnimated(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47344w = new ArgbEvaluator();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f47345x = paint;
    }
}
