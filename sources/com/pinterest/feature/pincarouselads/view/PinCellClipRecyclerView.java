package com.pinterest.feature.pincarouselads.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/pincarouselads/view/PinCellClipRecyclerView;", "Lcom/pinterest/ui/grid/PinterestRecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ps0/y", "pinCarouselAdsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PinCellClipRecyclerView extends f {

    /* renamed from: m, reason: collision with root package name */
    public boolean f47347m;

    /* renamed from: n, reason: collision with root package name */
    public float f47348n;

    /* renamed from: o, reason: collision with root package name */
    public float f47349o;

    /* renamed from: p, reason: collision with root package name */
    public final Path f47350p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f47351q;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f47352r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCellClipRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.f47350p);
        super.dispatchDraw(canvas);
    }

    public final void n(int i13, int i14) {
        Path path = this.f47350p;
        path.reset();
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, i13, i14);
        float[] fArr = this.f47351q;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] elements = this.f47352r;
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        path.addRoundRect(rectF, copyOf, Path.Direction.CW);
        path.close();
    }

    public final void o() {
        float[] fArr = this.f47351q;
        int length = fArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            float f13 = fArr[i14];
            fArr[i15] = this.f47349o;
            i14++;
            i15++;
        }
        float[] fArr2 = this.f47352r;
        int length2 = fArr2.length;
        int i16 = 0;
        while (i13 < length2) {
            float f14 = fArr2[i13];
            int i17 = i16 + 1;
            fArr2[i16] = this.f47347m ? 0.0f : this.f47349o;
            i13++;
            i16 = i17;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = this.f52531a.N == 2;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(event);
        if (event.getActionMasked() == 0 && z13) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (!this.f52531a.canScrollVertically(-1) || !this.f52531a.canScrollVertically(1)) {
                this.f52531a.h3();
                return false;
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int ceil = ((int) Math.ceil(this.f47348n * size)) + 1;
        int i15 = wa2.s.f128899l0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(wa2.s.f128899l0, ceil), 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        n(i13, i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCellClipRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47348n = 1.0f;
        this.f47349o = getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_small);
        this.f47350p = new Path();
        float[] fArr = new float[4];
        for (int i14 = 0; i14 < 4; i14++) {
            fArr[i14] = this.f47349o;
        }
        this.f47351q = fArr;
        float[] fArr2 = new float[4];
        for (int i15 = 0; i15 < 4; i15++) {
            fArr2[i15] = this.f47349o;
        }
        this.f47352r = fArr2;
    }
}
