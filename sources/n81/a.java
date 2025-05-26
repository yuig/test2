package n81;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import hb2.u;
import hf0.b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m60.p0;
import net.quikkly.android.ui.CameraPreview;
import ol2.e;
import ol2.f;
import ql2.s;

/* loaded from: classes5.dex */
public final class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Animation.AnimationListener f89926a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f89927b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f89928c;

    /* renamed from: d, reason: collision with root package name */
    public final float f89929d;

    /* renamed from: e, reason: collision with root package name */
    public final float f89930e;

    /* renamed from: f, reason: collision with root package name */
    public final float f89931f;

    /* renamed from: g, reason: collision with root package name */
    public final float f89932g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89933h;

    /* renamed from: i, reason: collision with root package name */
    public final int f89934i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f89935j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f89927b = new ArrayList();
        this.f89928c = new ArrayList();
        float f13 = b.f69002b;
        this.f89929d = f13;
        float f14 = b.f69003c;
        this.f89930e = f14;
        this.f89931f = f13 / 2.0f;
        this.f89932g = f14 / 2.0f;
        this.f89933h = getResources().getDimensionPixelSize(uc2.b.lens_animation_particle_min_size);
        this.f89934i = getResources().getDimensionPixelSize(uc2.b.lens_animation_particle_max_size);
        Resources resources = getResources();
        context.getTheme();
        int[] intArray = resources.getIntArray(p0.lens_animation_colors);
        Intrinsics.checkNotNullExpressionValue(intArray, "getArray(...)");
        this.f89935j = intArray;
    }

    public final void a(Animation.AnimationListener animationListener) {
        this.f89926a = animationListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float f13;
        super.onAttachedToWindow();
        int[] iArr = this.f89935j;
        int n13 = s.n(f.f96454a, s.q(0, iArr.length));
        ArrayList arrayList = this.f89928c;
        arrayList.clear();
        ArrayList arrayList2 = this.f89927b;
        arrayList2.clear();
        int i13 = 0;
        while (true) {
            f13 = this.f89929d;
            if (i13 >= 20) {
                break;
            }
            double d2 = i13 * 0.3141592653589793d;
            double d13 = f13 * 0.35d;
            PointF pointF = new PointF();
            pointF.x = (float) ((Math.cos(d2) * d13) + this.f89931f);
            pointF.y = (float) ((Math.sin(d2) * d13) + this.f89932g);
            arrayList.add(pointF);
            i13++;
        }
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            IntRange intRange = new IntRange(this.f89933h, this.f89934i, 1);
            e eVar = f.f96454a;
            float n14 = s.n(eVar, intRange);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            u uVar = new u(context, n14, n14, (int) n14, iArr[(n13 + i14) % iArr.length], null);
            arrayList2.add(uVar);
            addView(uVar);
            PointF pointF2 = (PointF) arrayList.get(i14);
            int[] iArr2 = iArr;
            int i15 = n13;
            Point point = new Point(s.n(eVar, new IntRange(0, (int) f13, 1)), s.n(eVar, new IntRange(0, (int) this.f89930e, 1)));
            Path path = new Path();
            path.moveTo(point.x, point.y);
            path.lineTo(pointF2.x, pointF2.y);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uVar, (Property<u, Float>) View.X, (Property<u, Float>) View.Y, path);
            ofFloat.setDuration(1000L);
            uVar.setScaleX(0.0f);
            uVar.setScaleY(0.0f);
            float f14 = n14 / 2;
            uVar.setPivotX(f14);
            uVar.setPivotY(f14);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(kg.a.F(1.0f, 500L, uVar)).before(kg.a.F(0.6f, 500L, uVar));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(kg.a.A(0.0f, 1.0f, 50L, uVar)).before(kg.a.A(1.0f, 0.0f, s.n(eVar, new IntRange(700, 2000, 1)), uVar));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(ofFloat).with(animatorSet).with(animatorSet2);
            animatorSet3.setStartDelay(s.n(eVar, new IntRange(0, 700, 1)));
            animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet3.start();
            i14++;
            iArr = iArr2;
            n13 = i15;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        startAnimation(rotateAnimation);
        Animation.AnimationListener animationListener = this.f89926a;
        if (animationListener != null) {
            rotateAnimation.setAnimationListener(animationListener);
        }
        startAnimation(rotateAnimation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeAllViews();
        super.onDetachedFromWindow();
    }
}
