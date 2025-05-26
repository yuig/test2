package j91;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import i91.u;
import kh2.c3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;
import s3.p0;
import sw0.r0;

/* loaded from: classes5.dex */
public final class d extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f75110h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final u f75111a;

    /* renamed from: b, reason: collision with root package name */
    public final View f75112b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f75113c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f75114d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f75115e;

    /* renamed from: f, reason: collision with root package name */
    public ValueAnimator f75116f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f75117g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, u style, View view, String str) {
        super(context);
        Drawable drawable;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f75111a = style;
        this.f75112b = view;
        this.f75117g = CollectionsKt.L(f0.j("com.facebook.lite", "com.facebook.katana"), str);
        if (str != null) {
            r0 M = ig1.b.M(str);
            Integer num = (Integer) M.f115567f;
            if (num != null) {
                Context context2 = getContext();
                int intValue = num.intValue();
                Object obj = d5.a.f53679a;
                Drawable drawable2 = context2.getDrawable(intValue);
                Intrinsics.f(drawable2);
                drawable2.setBounds(0, 0, c(), c());
                drawable = drawable2;
            } else {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                Paint paint = shapeDrawable.getPaint();
                Context context3 = getContext();
                int i13 = M.f115564c;
                Object obj2 = d5.a.f53679a;
                paint.setColor(context3.getColor(i13));
                shapeDrawable.setBounds(0, 0, c(), c());
                drawable = shapeDrawable;
            }
            this.f75113c = drawable;
            drawable.setAlpha(0);
            Drawable drawable3 = drawable;
            this.f75115e = e(drawable3, c(), CameraPreview.AUTOFOCUS_INTERVAL_MILLIS, 2.0f, new p0(this, drawable, 4300L, 1));
            Integer num2 = (Integer) M.f115568g;
            boolean z13 = num2 != null;
            Drawable drawable4 = getContext().getDrawable((!z13 || num2 == null) ? M.f115562a : num2.intValue());
            Intrinsics.f(drawable4);
            Drawable mutate = drawable4.mutate();
            Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
            if (!z13) {
                mutate.setTint(getContext().getColor(Intrinsics.d((String) M.f115566e, "com.kakao.talk") ? eo1.b.color_black_900 : eo1.b.color_white_0));
            }
            d(mutate, b());
            this.f75114d = mutate;
            mutate.setAlpha(0);
            this.f75116f = e(mutate, b(), 2150L, 2.3f, new b(this, mutate));
        }
    }

    public static void d(Drawable drawable, int i13) {
        if (drawable.getIntrinsicHeight() == drawable.getIntrinsicWidth()) {
            drawable.setBounds(0, 0, i13, i13);
        } else {
            float intrinsicHeight = drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
            drawable.setBounds(0, 0, (intrinsicHeight > 1.0f ? Float.valueOf(i13 * intrinsicHeight) : Integer.valueOf(i13)).intValue(), (intrinsicHeight < 1.0f ? Float.valueOf(i13 * intrinsicHeight) : Integer.valueOf(i13)).intValue());
        }
    }

    public final void a(Canvas canvas, Drawable drawable) {
        canvas.save();
        canvas.translate((c() - drawable.getBounds().width()) / 2.0f, (c() - drawable.getBounds().height()) / 2.0f);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int b() {
        float preferredIconRatioForAnimation;
        if (this.f75117g) {
            preferredIconRatioForAnimation = 1.0f;
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            preferredIconRatioForAnimation = this.f75111a.getPreferredIconRatioForAnimation(context);
        }
        return (int) (preferredIconRatioForAnimation * c());
    }

    public final int c() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return this.f75111a.getPreferredSize(context);
    }

    public final ValueAnimator e(Drawable drawable, int i13, long j13, float f13, Function0 function0) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setStartDelay(j13);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new OvershootInterpolator(f13));
        ofFloat.addUpdateListener(new a(i13, this, drawable, 1));
        c3.h(ofFloat, function0);
        ofFloat.start();
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public final ValueAnimator f(Drawable drawable, int i13, long j13, float f13) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setStartDelay(j13);
        ofFloat.setInterpolator(new AnticipateInterpolator(f13));
        ofFloat.addUpdateListener(new a(i13, this, drawable, 0));
        ofFloat.start();
        View view = this.f75112b;
        if (view != null) {
            c3.i(ofFloat, new c(f13, view, this));
        }
        return ofFloat;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f75115e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f75116f;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = this.f75113c;
        if (drawable != null) {
            Rect clipBounds = canvas.getClipBounds();
            Intrinsics.checkNotNullExpressionValue(clipBounds, "getClipBounds(...)");
            int i13 = -(Math.abs(c() - drawable.getBounds().width()) / 2);
            clipBounds.inset(i13, i13);
            canvas.clipRect(clipBounds);
            a(canvas, drawable);
        }
        Drawable drawable2 = this.f75114d;
        if (drawable2 != null) {
            a(canvas, drawable2);
        }
    }
}
