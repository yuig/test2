package com.pinterest.ui.grid.lego;

import af2.b;
import af2.c;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import ua2.a;
import va2.f;
import ye2.o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ui/grid/lego/CarouselPinStatsView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinGridCellLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CarouselPinStatsView extends View implements c {

    /* renamed from: a, reason: collision with root package name */
    public o f52547a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52548b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52549c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52550d;

    /* renamed from: e, reason: collision with root package name */
    public final f f52551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselPinStatsView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        if (!this.f52548b) {
            this.f52548b = true;
            ((a) generatedComponent()).getClass();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_analytics_height);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_analytics_padding);
        this.f52549c = dimensionPixelSize2;
        this.f52550d = (dimensionPixelSize2 * 2) + dimensionPixelSize;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f52551e = new f(context2);
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f52547a == null) {
            this.f52547a = new o(this);
        }
        return this.f52547a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f52547a == null) {
            this.f52547a = new o(this);
        }
        return this.f52547a.generatedComponent();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f52551e.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        f fVar = this.f52551e;
        fVar.f(size);
        int i15 = this.f52550d;
        fVar.e(i15);
        fVar.f125341m = this.f52549c;
        fVar.h();
        setMeasuredDimension(size, i15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselPinStatsView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        if (!this.f52548b) {
            this.f52548b = true;
            ((a) generatedComponent()).getClass();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_analytics_height);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_analytics_padding);
        this.f52549c = dimensionPixelSize2;
        this.f52550d = (dimensionPixelSize2 * 2) + dimensionPixelSize;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f52551e = new f(context2);
    }
}
