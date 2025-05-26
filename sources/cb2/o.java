package cb2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import i2.j2;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f27340m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27341a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f27342b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f27343c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f27344d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f27345e;

    /* renamed from: f, reason: collision with root package name */
    public int f27346f;

    /* renamed from: g, reason: collision with root package name */
    public float f27347g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f27348h;

    /* renamed from: i, reason: collision with root package name */
    public ValueAnimator f27349i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f27350j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f27351k;

    /* renamed from: l, reason: collision with root package name */
    public final sq0.a f27352l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, boolean z13) {
        super(context);
        int i13 = 7;
        int i14 = 6;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27341a = z13;
        this.f27342b = new RectF();
        this.f27343c = new Rect();
        this.f27344d = new RectF();
        this.f27345e = new Rect();
        float W = z13 ? bs1.c.W(this, eo1.c.lego_corner_radius_medium_border) : bs1.c.W(this, eo1.c.lego_image_corner_radius);
        this.f27348h = new float[]{W, W, W, W, W, W, W, W};
        this.f27350j = xk2.m.b(new j2(14, context, this));
        this.f27351k = xk2.m.b(new l5.a(context, i14));
        this.f27352l = new sq0.a(this, i13);
        addView(a());
        addView(b());
        setVisibility(4);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final LottieAnimationView a() {
        return (LottieAnimationView) this.f27351k.getValue();
    }

    public final LottieAnimationView b() {
        return (LottieAnimationView) this.f27350j.getValue();
    }

    public final void c() {
        if (a().f28364d.o()) {
            ValueAnimator valueAnimator = this.f27349i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(50L);
            ofFloat.addUpdateListener(new com.airbnb.lottie.p(this, 1));
            c3.i(ofFloat, new c72.o(this, 22));
            this.f27349i = ofFloat;
            ofFloat.start();
        }
    }

    public final void d(boolean z13, int i13, Rect rect) {
        if (rect != null) {
            RectF rectF = this.f27344d;
            boolean z14 = this.f27341a;
            if (z14) {
                int width = rect.width();
                int height = rect.height();
                int i14 = (((int) (width * 1.1f)) - width) / 2;
                int i15 = (((int) (height * 1.1f)) - height) / 2;
                rect.left -= i14;
                rect.right += i14;
                rect.top -= i15;
                rect.bottom += i15;
                int i16 = (int) (i13 * 1.1f);
                float width2 = (((int) (r4 * 1.1f)) - rectF.width()) / 2;
                rectF.left -= width2;
                rectF.right += width2;
                float f13 = (i16 - i13) / 2;
                rectF.top -= f13;
                rectF.bottom += f13;
                i13 = i16;
            }
            this.f27346f = i13;
            int i17 = rect.right - rect.left;
            int i18 = rect.bottom - rect.top;
            float f14 = rectF.bottom - i13;
            if (z13) {
                f14 = rectF.top;
            } else {
                float f15 = rectF.top;
                if (f14 >= f15 - 1) {
                    f14 = f15;
                }
            }
            LottieAnimationView b13 = b();
            b13.setX(rectF.left);
            b13.setY(f14);
            b13.setLayoutParams(new FrameLayout.LayoutParams(i17, i18));
            if (z14) {
                Handler handler = getHandler();
                if (handler != null) {
                    handler.postDelayed(this.f27352l, 200L);
                }
            } else {
                LottieAnimationView b14 = b();
                b14.k2();
                bs1.c.U1(b14);
            }
            RectF rectF2 = this.f27342b;
            rectF2.top = f14;
            rectF2.left = rectF.left;
            rectF2.right = rectF.right;
            rectF2.bottom = i18 + f14;
            double d2 = (z14 ? rectF.left * 1.1f : rectF.left) < ((float) (getWidth() / 2)) ? i17 * 0.3d : -(i17 * 0.3d);
            double d13 = rectF.top - ((float) bs1.c.W(this, eo1.c.space_1200)) > ((float) (i18 / 2)) ? -(i18 * 0.3d) : 0.3d * i18;
            LottieAnimationView a13 = a();
            a13.setX(rectF.left + ((float) d2));
            a13.setY(f14 + ((float) d13));
            a13.setLayoutParams(new FrameLayout.LayoutParams(i17, i18));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = new RectF();
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = this.f27347g - this.f27343c.top;
        rectF.right = getMeasuredWidth();
        canvas.clipOutRect(rectF);
        if (getMeasuredHeight() < 0 || getMeasuredWidth() < 0) {
            return;
        }
        RectF rectF2 = new RectF();
        rectF2.left = 0.0f;
        rectF2.top = getHeight() - r70.b.f106349i.k0().b();
        rectF2.right = getMeasuredWidth();
        rectF2.bottom = getMeasuredHeight();
        canvas.clipOutRect(rectF2);
        canvas.save();
        Path path = new Path();
        boolean z13 = this.f27341a;
        RectF rectF3 = this.f27342b;
        if (z13) {
            canvas.translate(rectF3.left, rectF3.top);
            RectF rectF4 = this.f27344d;
            canvas.rotate(-3.0f, (rectF4.right - rectF4.left) / 2.0f, this.f27346f / 2.0f);
            canvas.translate(-rectF3.left, -rectF3.top);
        }
        if (a().f28364d.o()) {
            path.addRoundRect(rectF3, this.f27348h, Path.Direction.CCW);
        }
        canvas.clipOutPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(Rect globalVisiblePinRect, Rect rect, int i13, int i14) {
        Intrinsics.checkNotNullParameter(globalVisiblePinRect, "globalVisiblePinRect");
        Rect rect2 = this.f27343c;
        getGlobalVisibleRect(rect2);
        RectF rectF = this.f27344d;
        rectF.set(globalVisiblePinRect);
        float f13 = rectF.top;
        float f14 = rect2.top;
        rectF.top = f13 - f14;
        float f15 = rectF.bottom - f14;
        rectF.bottom = f15;
        boolean z13 = f15 >= ((float) (getMeasuredHeight() - ((int) r70.b.f106349i.k0().b())));
        rectF.bottom = (float) Math.min(rectF.bottom, getMeasuredHeight() - ((int) r2.k0().b()));
        this.f27347g = i14;
        d(z13, i13, rect);
    }
}
