package qv1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.g;
import androidx.recyclerview.widget.e0;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import m60.q0;
import m60.r0;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class f extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f105250n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f105251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f105252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105253c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f105254d;

    /* renamed from: e, reason: collision with root package name */
    public final View f105255e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f105256f;

    /* renamed from: g, reason: collision with root package name */
    public final float f105257g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f105258h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f105259i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f105260j;

    /* renamed from: k, reason: collision with root package name */
    public Animator f105261k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f105262l;

    /* renamed from: m, reason: collision with root package name */
    public final v f105263m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, boolean z13) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f105251a = z13;
        int W = bs1.c.W(this, eo1.c.space_100);
        this.f105252b = W;
        int W2 = bs1.c.W(this, eo1.c.space_200);
        this.f105253c = W2;
        this.f105256f = new Path();
        float W3 = bs1.c.W(this, r0.grid_placeholder_loading_shimmer_width);
        this.f105257g = W3;
        float f13 = W2;
        LinearGradient linearGradient = new LinearGradient(0.0f, f13, W3, f13, new int[]{bs1.c.B(this, q0.grid_loading_shimmer_gradient_start), bs1.c.B(this, q0.grid_loading_shimmer_gradient_middle), bs1.c.B(this, q0.grid_loading_shimmer_gradient_end)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(linearGradient);
        this.f105258h = paint;
        this.f105259i = new Rect();
        this.f105260j = new Matrix();
        this.f105263m = m.b(b.f105245l);
        View.inflate(context, nv1.e.onebar_placeholder_loading_layout, this);
        View findViewById = findViewById(nv1.d.onebar_overlay_gradient_view);
        findViewById.setAlpha(0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f105255e = findViewById;
        View findViewById2 = findViewById(nv1.d.onebar_placeholder_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f105254d = (LinearLayout) findViewById2;
        setPaddingRelative(W, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        setWillNotDraw(false);
    }

    public final void a(int i13, int i14, int i15, int i16) {
        Path path = new Path();
        boolean c13 = c();
        int i17 = this.f105252b;
        float f13 = c13 ? i13 - i17 : i13 + i17;
        float E0 = dl2.b.E0(this, eo1.a.comp_searchguide_rounding);
        int i18 = this.f105253c;
        path.addRoundRect(f13, i18 + i14, c() ? f13 - i16 : i16 + f13, i14 + i15 + i18, E0, E0, Path.Direction.CCW);
        this.f105256f.addPath(path);
    }

    public final float b() {
        boolean c13 = c();
        float f13 = this.f105257g;
        return c13 ? getWidth() + f13 : -f13;
    }

    public final boolean c() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return j1.Y0(context);
    }

    public final void d() {
        View view = this.f105255e;
        bs1.c.U1(view);
        view.setAlpha(1.0f);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 26));
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(b(), c() ? -this.f105257g : getWidth());
        ofFloat.setStartDelay(300L);
        ofFloat.setDuration(BaseRecyclerCellView.AUTOSCROLL_DELAY);
        ofFloat.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 0.1f));
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new ir.b(this, 7));
        ofFloat.addUpdateListener(new e0(this, 7));
        ofFloat.start();
        this.f105261k = ofFloat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f105262l) {
            canvas.save();
            canvas.clipPath(this.f105256f);
            canvas.drawRect(this.f105259i, this.f105258h);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Animator animator;
        Animator animator2 = this.f105261k;
        if (animator2 != null && animator2.isRunning() && (animator = this.f105261k) != null) {
            animator.cancel();
        }
        this.f105262l = false;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        LinearLayout linearLayout = this.f105254d;
        if (linearLayout.getChildCount() == 0) {
            this.f105256f.rewind();
            int W = bs1.c.W(this, nv1.b.onebar_placeholder_item_width);
            int G0 = dl2.b.G0(this, eo1.a.comp_searchguide_height);
            int i17 = (int) (hf0.b.f69002b / W);
            int width = c() ? getWidth() - getPaddingEnd() : getPaddingStart();
            int i18 = this.f105253c;
            int i19 = this.f105252b;
            if (this.f105251a || !((Boolean) this.f105263m.getValue()).booleanValue()) {
                int W2 = bs1.c.W(this, nv1.b.onebar_placeholder_filter_item_width);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                g gVar = new g(context, 2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(W2, G0);
                layoutParams.topMargin = i18;
                layoutParams.bottomMargin = i18;
                if (c()) {
                    layoutParams.rightMargin = i19;
                } else {
                    layoutParams.leftMargin = i19;
                }
                linearLayout.addView(gVar, layoutParams);
                a(width, getPaddingTop(), G0, W2);
                width = c() ? width - (W2 + i19) : width + W2 + i19;
            } else {
                i17++;
            }
            for (int i23 = 0; i23 < i17; i23++) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                g gVar2 = new g(context2, 2);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(W, G0);
                layoutParams2.topMargin = i18;
                layoutParams2.bottomMargin = i18;
                if (c()) {
                    layoutParams2.rightMargin = i19;
                } else {
                    layoutParams2.leftMargin = i19;
                }
                linearLayout.addView(gVar2, layoutParams2);
                a(width, getPaddingTop(), G0, W);
                width = c() ? width - (W + i19) : W + i19 + width;
            }
        }
        this.f105259i.set((int) b(), 0, (int) this.f105257g, getHeight());
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        Animator animator;
        super.setVisibility(i13);
        if (i13 != 0) {
            Animator animator2 = this.f105261k;
            if (animator2 != null && animator2.isRunning() && (animator = this.f105261k) != null) {
                animator.cancel();
            }
            this.f105262l = false;
        }
    }
}
