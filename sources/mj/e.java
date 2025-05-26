package mj;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f87233b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f87233b = carouselLayoutManager;
    }

    @Override // mj.f
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f13 = rectF2.left;
        float f14 = rectF3.left;
        if (f13 < f14 && rectF2.right > f14) {
            float f15 = f14 - f13;
            rectF.left += f15;
            rectF2.left += f15;
        }
        float f16 = rectF2.right;
        float f17 = rectF3.right;
        if (f16 <= f17 || rectF2.left >= f17) {
            return;
        }
        float f18 = f16 - f17;
        rectF.right = Math.max(rectF.right - f18, rectF.left);
        rectF2.right = Math.max(rectF2.right - f18, rectF2.left);
    }

    @Override // mj.f
    public final float b(RecyclerView.LayoutParams layoutParams) {
        return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // mj.f
    public final RectF c(float f13, float f14, float f15, float f16) {
        return new RectF(f16, 0.0f, f14 - f16, f13);
    }

    @Override // mj.f
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f87233b;
        return carouselLayoutManager.f19507o - carouselLayoutManager.T();
    }

    @Override // mj.f
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.f87233b;
        if (carouselLayoutManager.n1()) {
            return 0;
        }
        return carouselLayoutManager.f19506n;
    }

    @Override // mj.f
    public final int f() {
        return 0;
    }

    @Override // mj.f
    public final int g() {
        return this.f87233b.f19506n;
    }

    @Override // mj.f
    public final int h() {
        CarouselLayoutManager carouselLayoutManager = this.f87233b;
        if (carouselLayoutManager.n1()) {
            return carouselLayoutManager.f19506n;
        }
        return 0;
    }

    @Override // mj.f
    public final int i() {
        return this.f87233b.Y();
    }

    @Override // mj.f
    public final void j(View view, int i13, int i14) {
        CarouselLayoutManager carouselLayoutManager = this.f87233b;
        int Y = carouselLayoutManager.Y();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int L = l2.L(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + Y;
        carouselLayoutManager.getClass();
        l2.f0(view, i13, Y, i14, L);
    }

    @Override // mj.f
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float floor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = floor;
            rectF.left = Math.min(rectF.left, floor);
        }
        if (rectF2.left >= rectF3.right) {
            float ceil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = ceil;
            rectF.right = Math.max(ceil, rectF.right);
        }
    }

    @Override // mj.f
    public final void l(float f13, float f14, Rect rect, View view) {
        view.offsetLeftAndRight((int) (f14 - (rect.left + f13)));
    }
}
