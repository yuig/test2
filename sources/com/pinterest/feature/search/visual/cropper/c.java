package com.pinterest.feature.search.visual.cropper;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import jc0.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import s71.o;

/* loaded from: classes5.dex */
public abstract class c extends RelativeLayout implements e, ib2.d {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f47989x = 0;

    /* renamed from: a, reason: collision with root package name */
    public float f47990a;

    /* renamed from: b, reason: collision with root package name */
    public final ib2.d f47991b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47992c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f47993d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47994e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47995f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout.LayoutParams f47996g;

    /* renamed from: h, reason: collision with root package name */
    public final FlashlightCropperView f47997h;

    /* renamed from: i, reason: collision with root package name */
    public final float f47998i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f47999j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f48000k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f48001l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f48002m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f48003n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f48004o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f48005p;

    /* renamed from: q, reason: collision with root package name */
    public final Drawable f48006q;

    /* renamed from: r, reason: collision with root package name */
    public final int f48007r;

    /* renamed from: s, reason: collision with root package name */
    public final int f48008s;

    /* renamed from: t, reason: collision with root package name */
    public final s71.m f48009t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f48010u;

    /* renamed from: v, reason: collision with root package name */
    public final float f48011v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f48012w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, float f13, int i13, ib2.d dVar, boolean z13, Integer num, boolean z14, boolean z15) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47990a = f13;
        this.f47991b = dVar;
        this.f47992c = z13;
        this.f47993d = num;
        this.f47994e = z14;
        this.f47995f = z15;
        this.f47998i = z15 ? getResources().getDimensionPixelSize(uc2.b.visual_search_borderless_cropper_radius) : getResources().getDimensionPixelSize(uc2.b.visual_search_cropper_radius);
        Paint paint = new Paint(1);
        this.f47999j = paint;
        Paint paint2 = new Paint();
        this.f48000k = paint2;
        this.f48001l = new RectF();
        Path path = new Path();
        this.f48002m = path;
        this.f48011v = hf0.b.f69002b;
        if (getContext() != null) {
            Context context2 = getContext();
            int i14 = z15 ? vc2.b.ic_visual_search_cropper_top_left_handle : uc2.c.ic_flashlight_top_left_nonpds;
            Object obj = d5.a.f53679a;
            this.f48003n = context2.getDrawable(i14);
            this.f48004o = getContext().getDrawable(z15 ? vc2.b.ic_visual_search_cropper_top_right_handle : uc2.c.ic_flashlight_top_right_nonpds);
            this.f48005p = getContext().getDrawable(z15 ? vc2.b.ic_visual_search_cropper_bottom_left_handle : uc2.c.ic_flashlight_bottom_left_nonpds);
            this.f48006q = getContext().getDrawable(z15 ? vc2.b.ic_visual_search_cropper_bottom_right_handle : uc2.c.ic_flashlight_bottom_right_nonpds);
            this.f47998i = (z13 || !z14 || z15) ? getResources().getDimension(eo1.c.lego_image_corner_radius) : 0.0f;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            paint2.setStrokeWidth(getContext().getResources().getDimensionPixelSize(uc2.b.flashlight_cropper_border_size));
            this.f48007r = getContext().getResources().getDimensionPixelSize(z15 ? uc2.b.visual_search_borderless_cropper_corner_size : uc2.b.flashlight_corner_size);
            this.f48008s = getContext().getResources().getDimensionPixelSize(z15 ? uc2.b.visual_search_borderless_cropper_corner_padding : uc2.b.flashlight_corner_padding);
            this.f48009t = new s71.m(new Rect(), new Rect(), new Rect(), new Rect());
        }
        path.setFillType(Path.FillType.EVEN_ODD);
        paint.setColor(dl2.b.y0(this, eo1.a.color_background_dark_opacity_300));
        setLayoutParams(new FrameLayout.LayoutParams(-1, (int) this.f47990a));
        FlashlightCropperView c13 = c(context);
        c13.f47971s = z13;
        this.f47997h = c13;
        this.f47996g = new FrameLayout.LayoutParams(i13, (int) this.f47990a);
    }

    @Override // ib2.d
    public final void B0(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
        invalidate((int) cropBounds.left, (int) cropBounds.top, (int) cropBounds.right, (int) cropBounds.bottom);
        ib2.d dVar = this.f47991b;
        if (dVar != null) {
            dVar.B0(cropBounds);
        }
    }

    @Override // ib2.d
    public final void F0() {
        ib2.d dVar = this.f47991b;
        if (dVar != null) {
            dVar.F0();
        }
    }

    @Override // ib2.d
    public final void G2(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
    }

    @Override // ib2.d
    public final void O2(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
        ib2.d dVar = this.f47991b;
        if (dVar != null) {
            dVar.O2(cropBounds);
        }
    }

    @Override // ib2.d
    public final void V5() {
        ib2.d dVar = this.f47991b;
        if (dVar != null) {
            dVar.V5();
        }
    }

    public final void a() {
        if (this.f48010u) {
            return;
        }
        b();
        k(e(), g(), f(), d(), false);
    }

    public final void b() {
        if (this.f48010u) {
            return;
        }
        FlashlightCropperView flashlightCropperView = this.f47997h;
        if (flashlightCropperView.getParent() == null) {
            addView(flashlightCropperView);
            this.f48010u = true;
        }
    }

    public abstract FlashlightCropperView c(Context context);

    public abstract float d();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s71.m mVar;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        FlashlightCropperView flashlightCropperView = this.f47997h;
        if (bs1.c.j1(flashlightCropperView)) {
            return;
        }
        boolean z13 = this.f47992c;
        if ((!z13 || this.f48012w) && this.f48010u) {
            Path path = this.f48002m;
            path.reset();
            RectF rectF = this.f48001l;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(rectF, direction);
            RectF rectF2 = flashlightCropperView.f47966n;
            Intrinsics.checkNotNullExpressionValue(rectF2, "getCropperBounds(...)");
            float f13 = this.f47998i;
            path.addRoundRect(rectF2, f13, f13, direction);
            path.close();
            canvas.drawPath(path, this.f47999j);
            if (!z13 && !this.f47995f) {
                float f14 = this.f47998i;
                canvas.drawRoundRect(rectF2, f14, f14, this.f48000k);
            }
            if (!this.f47994e || (mVar = this.f48009t) == null) {
                return;
            }
            o.l(this.f48007r, this.f48008s, rectF2, mVar);
            Drawable drawable = this.f48003n;
            if (drawable != null) {
                drawable.setBounds(mVar.f111395a);
                drawable.draw(canvas);
            }
            Drawable drawable2 = this.f48004o;
            if (drawable2 != null) {
                drawable2.setBounds(mVar.f111396b);
                drawable2.draw(canvas);
            }
            Drawable drawable3 = this.f48005p;
            if (drawable3 != null) {
                drawable3.setBounds(mVar.f111397c);
                drawable3.draw(canvas);
            }
            Drawable drawable4 = this.f48006q;
            if (drawable4 != null) {
                drawable4.setBounds(mVar.f111398d);
                drawable4.draw(canvas);
            }
        }
    }

    public abstract float e();

    public abstract float f();

    public abstract float g();

    public final void h() {
        if (this.f48010u) {
            FlashlightCropperView flashlightCropperView = this.f47997h;
            if (flashlightCropperView.getParent() != null) {
                removeView(flashlightCropperView);
                ViewGroup.LayoutParams layoutParams = flashlightCropperView.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.topMargin = 0;
                this.f48010u = false;
            }
        }
        this.f48012w = false;
    }

    public final void i(boolean z13) {
        FlashlightCropperView flashlightCropperView = this.f47997h;
        bs1.c.R1(flashlightCropperView, z13);
        flashlightCropperView.invalidate();
    }

    public final void j(RectF dotBounds) {
        Intrinsics.checkNotNullParameter(dotBounds, "dotBounds");
        if (this.f48010u) {
            this.f48012w = true;
            k(dotBounds.left, dotBounds.top, dotBounds.right, dotBounds.bottom, true);
        }
    }

    public final void k(float f13, float f14, float f15, float f16, boolean z13) {
        FlashlightCropperView flashlightCropperView = this.f47997h;
        int i13 = 0;
        flashlightCropperView.getLayoutParams().width = 0;
        flashlightCropperView.getLayoutParams().height = 0;
        Integer num = this.f47993d;
        if (num != null && !z13) {
            i13 = num.intValue();
        }
        RectF rectF = new RectF();
        float f17 = i13;
        rectF.left = f13 + f17;
        rectF.top = f14 + f17;
        rectF.right = f15 - f17;
        rectF.bottom = f16 - f17;
        if (z13) {
            flashlightCropperView.f47970r = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
            final float centerX = rectF.centerX();
            final float centerY = rectF.centerY();
            float f18 = 2;
            final float width = rectF.width() / f18;
            final float height = rectF.height() / f18;
            final g0 g0Var = new g0();
            final g0 g0Var2 = new g0();
            final g0 g0Var3 = new g0();
            final g0 g0Var4 = new g0();
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.pinterest.feature.search.visual.cropper.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animation) {
                    g0 left = g0Var;
                    Intrinsics.checkNotNullParameter(left, "$left");
                    g0 top = g0Var2;
                    Intrinsics.checkNotNullParameter(top, "$top");
                    g0 right = g0Var3;
                    Intrinsics.checkNotNullParameter(right, "$right");
                    g0 bottom = g0Var4;
                    Intrinsics.checkNotNullParameter(bottom, "$bottom");
                    c this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    Object animatedValue = animation.getAnimatedValue();
                    Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue = ((Float) animatedValue).floatValue();
                    float f19 = width * floatValue;
                    float f23 = height * floatValue;
                    float f24 = centerX;
                    left.f80425a = f24 - f19;
                    float f25 = centerY;
                    top.f80425a = f25 - f23;
                    right.f80425a = f24 + f19;
                    float f26 = f25 + f23;
                    bottom.f80425a = f26;
                    this$0.f47997h.s(left.f80425a, top.f80425a, right.f80425a, f26);
                    this$0.invalidate();
                }
            });
            ofFloat.addListener(new x(this, rectF, g0Var, g0Var2, 1));
            ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
            ofFloat.start();
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            float width2 = rectF.width();
            float height2 = rectF.height();
            ofFloat2.addUpdateListener(new ib2.a(width2, height2, width2 + rectF.left, height2 + rectF.top, 2, this));
            ofFloat2.addListener(new b(this, width2, height2, rectF));
            ofFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
            ofFloat2.start();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f48001l.set(0.0f, 0.0f, i13, i14);
    }

    @Override // ib2.d
    public final void r2(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
        ib2.d dVar = this.f47991b;
        if (dVar != null) {
            dVar.r2(cropBounds);
        }
    }
}
