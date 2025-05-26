package mj;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f87232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f87232b = carouselLayoutManager;
    }

    @Override // mj.f
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f13 = rectF2.top;
        float f14 = rectF3.top;
        if (f13 < f14 && rectF2.bottom > f14) {
            float f15 = f14 - f13;
            rectF.top += f15;
            rectF3.top += f15;
        }
        float f16 = rectF2.bottom;
        float f17 = rectF3.bottom;
        if (f16 <= f17 || rectF2.top >= f17) {
            return;
        }
        float f18 = f16 - f17;
        rectF.bottom = Math.max(rectF.bottom - f18, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f18, rectF2.top);
    }

    @Override // mj.f
    public final float b(RecyclerView.LayoutParams layoutParams) {
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // mj.f
    public final RectF c(float f13, float f14, float f15, float f16) {
        return new RectF(0.0f, f15, f14, f13 - f15);
    }

    @Override // mj.f
    public final int d() {
        return this.f87232b.f19507o;
    }

    @Override // mj.f
    public final int e() {
        return this.f87232b.f19507o;
    }

    @Override // mj.f
    public final int f() {
        return this.f87232b.V();
    }

    @Override // mj.f
    public final int g() {
        CarouselLayoutManager carouselLayoutManager = this.f87232b;
        return carouselLayoutManager.f19506n - carouselLayoutManager.W();
    }

    @Override // mj.f
    public final int h() {
        return 0;
    }

    @Override // mj.f
    public final int i() {
        return 0;
    }

    @Override // mj.f
    public final void j(View view, int i13, int i14) {
        CarouselLayoutManager carouselLayoutManager = this.f87232b;
        int V = carouselLayoutManager.V();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int M = l2.M(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + V;
        carouselLayoutManager.getClass();
        l2.f0(view, V, i13, M, i14);
    }

    @Override // mj.f
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float floor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = floor;
            rectF.top = Math.min(rectF.top, floor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float ceil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = ceil;
            rectF.bottom = Math.max(ceil, rectF.bottom);
        }
    }

    @Override // mj.f
    public final void l(float f13, float f14, Rect rect, View view) {
        view.offsetTopAndBottom((int) (f14 - (rect.top + f13)));
    }
}
