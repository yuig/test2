package y62;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.b0;
import kh2.k3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import net.quikkly.android.ui.CameraPreview;
import r72.g2;
import r72.i1;

/* loaded from: classes4.dex */
public final class e extends Drawable implements Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f137919a;

    /* renamed from: b, reason: collision with root package name */
    public final List f137920b;

    /* renamed from: c, reason: collision with root package name */
    public int f137921c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f137922d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f137923e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f137924f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f137925g;

    /* renamed from: h, reason: collision with root package name */
    public float f137926h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f137927i;

    /* renamed from: j, reason: collision with root package name */
    public float f137928j;

    /* renamed from: k, reason: collision with root package name */
    public d f137929k;

    /* renamed from: l, reason: collision with root package name */
    public float f137930l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f137931m;

    /* renamed from: n, reason: collision with root package name */
    public final ValueAnimator f137932n;

    /* renamed from: o, reason: collision with root package name */
    public final ValueAnimator f137933o;

    public e(i1 mask, List otherContours) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(otherContours, "otherContours");
        this.f137919a = mask;
        this.f137920b = otherContours;
        final int i13 = 1;
        Paint paint = new Paint(1);
        final int i14 = 0;
        paint.setColor(Color.argb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, 0, 0, 0));
        this.f137922d = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint.Join join = Paint.Join.ROUND;
        paint2.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setPathEffect(a(new float[0]));
        this.f137923e = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeJoin(join);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(a(new float[0]));
        paint3.setShadowLayer(4.0f, 0.0f, 0.0f, -1);
        this.f137924f = paint3;
        float[] fArr = new float[9];
        new Matrix().getValues(fArr);
        this.f137925g = fArr;
        this.f137926h = 1.0f;
        this.f137927i = new float[0];
        this.f137928j = 1.0f;
        this.f137930l = 1.0f;
        this.f137931m = new Path();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: y62.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f137914b;

            {
                this.f137914b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                int i15 = i14;
                e this$0 = this.f137914b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.invalidateSelf();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.invalidateSelf();
                        break;
                }
            }
        });
        this.f137932n = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: y62.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f137914b;

            {
                this.f137914b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                int i15 = i13;
                e this$0 = this.f137914b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.invalidateSelf();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.invalidateSelf();
                        break;
                }
            }
        });
        this.f137933o = ofFloat2;
    }

    public static PathEffect a(float[] fArr) {
        CornerPathEffect cornerPathEffect = new CornerPathEffect(4.0f);
        return fArr.length < 2 ? cornerPathEffect : new ComposePathEffect(cornerPathEffect, new DashPathEffect(fArr, 0.0f));
    }

    public final ArrayList b(List list, Rect rect) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((g2) it.next()).f106488a;
            int i13 = g2.f106487b;
            Path e13 = Intrinsics.d(str, "M0 0H1V1H0Z") ? null : e(rect, str);
            if (e13 != null) {
                arrayList.add(e13);
            }
        }
        return arrayList;
    }

    public final void c(int i13) {
        this.f137922d.setColor(i13);
        this.f137930l = Color.alpha(i13) / 255.0f;
        invalidateSelf();
    }

    public final void d(v62.b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f137926h = params.f124228a;
        float[] fArr = params.f124229b;
        this.f137927i = fArr;
        this.f137923e.setPathEffect(a(fArr));
        this.f137928j = params.f124230c;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        d dVar = this.f137929k;
        if (dVar != null) {
            canvas.drawBitmap(dVar.f137915a, 0.0f, 0.0f, this.f137922d);
            float[] fArr = this.f137925g;
            float f13 = fArr[0];
            canvas.getMatrix().getValues(fArr);
            float f14 = fArr[0];
            Paint paint = this.f137923e;
            paint.setStrokeWidth(this.f137926h / f14);
            Paint paint2 = this.f137924f;
            paint2.setStrokeWidth(this.f137928j / f14);
            if (f13 != f14) {
                float[] fArr2 = this.f137927i;
                ArrayList arrayList = new ArrayList(fArr2.length);
                for (float f15 : fArr2) {
                    arrayList.add(Float.valueOf(f15 / f14));
                }
                paint.setPathEffect(a(CollectionsKt.C0(arrayList)));
            }
            f(1.0f);
            canvas.drawPath(dVar.f137916b, paint);
            Path path = this.f137931m;
            path.reset();
            ValueAnimator valueAnimator = this.f137932n;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float animatedFraction2 = valueAnimator.getAnimatedFraction() + 0.1f;
            float f16 = animatedFraction2 - 1.0f;
            PathMeasure pathMeasure = dVar.f137918d;
            pathMeasure.getSegment(pathMeasure.getLength() * animatedFraction, pathMeasure.getLength() * animatedFraction2, path, true);
            if (f16 > 0.0f) {
                pathMeasure.getSegment(0.0f, pathMeasure.getLength() * f16, path, true);
            }
            canvas.drawPath(path, paint2);
            f(this.f137933o.getAnimatedFraction());
            Iterator it = dVar.f137917c.iterator();
            while (it.hasNext()) {
                canvas.drawPath((Path) it.next(), paint);
            }
        }
    }

    public final Path e(Rect rect, String str) {
        int i13 = g2.f106487b;
        if (!Intrinsics.d(str, "M0 0H1V1H0Z")) {
            return b0.T1(rect.width(), rect.height(), str);
        }
        try {
            int i14 = this.f137921c;
            int width = rect.width();
            int i15 = i14 * 2;
            int height = rect.height() - i15;
            int i16 = width - i15;
            return k3.J(t.b("\n                    M 0," + i14 + " \n                    v " + height + " \n                    a " + i14 + "," + i14 + " -90 0 0 " + i14 + "," + i14 + "\n                    h " + i16 + " \n                    a " + i14 + "," + i14 + " -90 0 0 " + i14 + ",-" + i14 + "\n                    v -" + height + "\n                    a " + i14 + "," + i14 + " -90 0 0 -" + i14 + ",-" + i14 + "\n                    h -" + i16 + "\n                    a " + i14 + "," + i14 + " -90 0 0 -" + i14 + "," + i14 + "\n                    Z\n                "));
        } catch (Exception unused) {
            return b0.T1(rect.width(), rect.height(), str);
        }
    }

    public final void f(float f13) {
        int i13;
        Paint paint = this.f137923e;
        paint.setAlpha((int) (255 * f13));
        if (f13 < 0.5f) {
            i13 = 0;
        } else {
            i13 = (int) ((f13 - 0.5d) * RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN * 2);
        }
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, Color.argb(i13, 0, 0, 0));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f137932n.isRunning() || this.f137933o.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        d dVar;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        i1 i1Var = this.f137919a;
        r72.a aVar = i1Var.f106499b;
        String str = i1Var.f106498a;
        List list = this.f137920b;
        if (aVar != null) {
            Bitmap Y = b0.Y(bounds.width(), bounds.height(), aVar);
            if (str == null) {
                r72.a aVar2 = i1Var.f106499b;
                str = aVar2 != null ? b0.U1(aVar2) : null;
                if (str == null) {
                    int i13 = g2.f106487b;
                    str = "M0 0H0Z";
                }
            }
            dVar = new d(Y, e(bounds, str), b(list, bounds));
        } else {
            if (str == null) {
                int i14 = g2.f106487b;
                str = "M0 0H0Z";
            }
            Path e13 = e(bounds, str);
            dVar = new d(b0.X(bounds.width(), bounds.height(), e13), e13, b(list, bounds));
        }
        this.f137929k = dVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f137922d.setAlpha((int) (this.f137930l * i13));
        this.f137923e.setAlpha(i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f137922d.setColorFilter(colorFilter);
        this.f137923e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f137932n.reverse();
        this.f137933o.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f137932n.end();
        this.f137933o.end();
    }
}
