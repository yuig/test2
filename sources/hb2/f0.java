package hb2;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import r72.g2;
import r72.i1;
import r72.j1;

/* loaded from: classes4.dex */
public final class f0 extends Drawable implements Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final List f68554a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f68555b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f68556c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f68557d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f68558e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f68559f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f68560g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f68561h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f68562i;

    /* renamed from: j, reason: collision with root package name */
    public float f68563j;

    /* renamed from: k, reason: collision with root package name */
    public float f68564k;

    /* renamed from: l, reason: collision with root package name */
    public b0 f68565l;

    /* renamed from: m, reason: collision with root package name */
    public float f68566m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f68567n;

    /* renamed from: o, reason: collision with root package name */
    public lf.a f68568o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f68569p;

    /* renamed from: q, reason: collision with root package name */
    public float f68570q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f68571r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f68572s;

    /* renamed from: t, reason: collision with root package name */
    public final float f68573t;

    /* renamed from: u, reason: collision with root package name */
    public final float f68574u;

    /* renamed from: v, reason: collision with root package name */
    public final ValueAnimator f68575v;

    /* renamed from: w, reason: collision with root package name */
    public final ValueAnimator f68576w;

    public f0(List masks, Drawable drawable) {
        Intrinsics.checkNotNullParameter(masks, "masks");
        this.f68554a = masks;
        this.f68555b = drawable;
        final int i13 = 1;
        Paint paint = new Paint(1);
        final int i14 = 0;
        paint.setColor(0);
        this.f68556c = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f68557d = paint2;
        Paint paint3 = new Paint(1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f68558e = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        this.f68559f = paint4;
        Paint paint5 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint5.setStyle(style2);
        paint5.setColor(-1);
        Paint.Join join = Paint.Join.ROUND;
        paint5.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint5.setStrokeCap(cap);
        paint5.setPathEffect(b(this));
        this.f68560g = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style2);
        paint6.setColor(-1);
        paint6.setStrokeJoin(join);
        paint6.setStrokeCap(cap);
        paint6.setPathEffect(b(this));
        paint6.setShadowLayer(4.0f, 0.0f, 0.0f, -1);
        this.f68561h = paint6;
        float[] fArr = new float[9];
        new Matrix().getValues(fArr);
        this.f68562i = fArr;
        this.f68563j = 5000.0f;
        this.f68564k = 1.0f;
        this.f68566m = 1.0f;
        this.f68567n = new Path();
        this.f68568o = x.f68625b;
        this.f68569p = xk2.m.b(d0.f68550i);
        int size = masks.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(null);
        }
        this.f68572s = arrayList;
        float f13 = Resources.getSystem().getDisplayMetrics().density;
        this.f68573t = hf0.b.f69002b;
        this.f68574u = hf0.b.f69003c;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(2500L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hb2.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f68624b;

            {
                this.f68624b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                int i16 = i14;
                f0 this$0 = this.f68624b;
                switch (i16) {
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
        this.f68575v = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(2500L);
        ofFloat2.setStartDelay(800L);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hb2.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f68624b;

            {
                this.f68624b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                int i16 = i13;
                f0 this$0 = this.f68624b;
                switch (i16) {
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
        ofFloat2.addListener(new e0());
        this.f68576w = ofFloat2;
    }

    public static PathEffect b(f0 f0Var) {
        float[] fArr = new float[0];
        f0Var.getClass();
        CornerPathEffect cornerPathEffect = new CornerPathEffect(4.0f);
        return fArr.length < 2 ? cornerPathEffect : new ComposePathEffect(cornerPathEffect, new DashPathEffect(fArr, 0.0f));
    }

    public final Bitmap a(int i13, int i14) {
        Bitmap bitmap = null;
        if (i13 > 0 && i14 > 0) {
            try {
            } catch (Throwable th3) {
                c();
                th3.getMessage();
            }
            if (i13 < this.f68573t && i14 <= this.f68574u) {
                bitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
                return bitmap;
            }
        }
        c();
        return bitmap;
    }

    public final void c() {
    }

    public final void d() {
        try {
            Bitmap bitmap = this.f68571r;
            if (bitmap != null && !bitmap.isRecycled()) {
                Bitmap bitmap2 = this.f68571r;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f68571r = null;
            }
            for (Bitmap bitmap3 : this.f68572s) {
                if (bitmap3 != null && !bitmap3.isRecycled()) {
                    bitmap3.recycle();
                }
            }
            int size = this.f68554a.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add(null);
            }
            this.f68572s = arrayList;
        } catch (Throwable th3) {
            c();
            th3.getMessage();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z13;
        Paint paint;
        Paint paint2;
        Iterator it;
        int i13;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        b0 b0Var = this.f68565l;
        if (b0Var != null) {
            Matrix matrix = canvas.getMatrix();
            float[] fArr = this.f68562i;
            matrix.getValues(fArr);
            boolean z14 = false;
            float f13 = fArr[0];
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (f13 == 0.0f) {
                f13 = 1.0f;
            }
            Paint paint3 = this.f68560g;
            paint3.setStrokeWidth(this.f68563j / f13);
            Paint paint4 = this.f68561h;
            paint4.setStrokeWidth(this.f68564k / f13);
            e(0.0f);
            List list = b0Var.f68542a;
            boolean z15 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((c0) it2.next()).f68548d) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((c0) obj).f68548d) {
                    arrayList.add(obj);
                }
            }
            float f16 = Intrinsics.d(this.f68568o, y.f68626b) ? ql2.s.f(this.f68576w.getAnimatedFraction(), 0.0f, 1.0f) : 0.0f;
            Iterator it3 = arrayList.iterator();
            int i14 = 0;
            while (it3.hasNext()) {
                int i15 = i14 + 1;
                c0 c0Var = (c0) it3.next();
                lf.a aVar = this.f68568o;
                if (aVar instanceof z) {
                    e(f15);
                    canvas2.drawPath(c0Var.f68545a, paint3);
                } else if (aVar instanceof a0) {
                    Path path = this.f68567n;
                    path.reset();
                    ValueAnimator valueAnimator = this.f68575v;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    float animatedFraction2 = valueAnimator.getAnimatedFraction() + 0.1f;
                    float f17 = animatedFraction2 - f15;
                    PathMeasure pathMeasure = new PathMeasure(c0Var.f68545a, z14);
                    if (pathMeasure.getLength() <= f14) {
                        return;
                    }
                    pathMeasure.getSegment(pathMeasure.getLength() * animatedFraction, pathMeasure.getLength() * animatedFraction2, path, z15);
                    if (f17 > f14) {
                        pathMeasure.getSegment(f14, pathMeasure.getLength() * f17, path, z15);
                    }
                    canvas2.drawPath(path, paint4);
                } else {
                    if (aVar instanceof y) {
                        j1 j1Var = c0Var.f68546b;
                        float width = j1Var.f106508c * getBounds().width();
                        float height = j1Var.f106509d * getBounds().height();
                        float width2 = j1Var.f106506a * getBounds().width();
                        float height2 = j1Var.f106507b * getBounds().height();
                        float f18 = height2 + height;
                        paint = paint3;
                        int i16 = (int) width;
                        if (i16 > 0 && height > f14) {
                            if (width > this.f68573t || height > this.f68574u || Float.isNaN(width) || Float.isNaN(height)) {
                                paint2 = paint4;
                            } else {
                                paint2 = paint4;
                                if (this.f68570q != f16 || CollectionsKt.U(i14, this.f68572s) == null) {
                                    int i17 = (int) height;
                                    Bitmap a13 = a(i16, i17);
                                    if (a13 != null) {
                                        this.f68571r = a13;
                                        it = it3;
                                        Bitmap bitmap = this.f68571r;
                                        Intrinsics.f(bitmap);
                                        Canvas canvas3 = new Canvas(bitmap);
                                        i13 = i15;
                                        float f19 = height * 0.5f;
                                        float f23 = 0.5f * f19;
                                        Paint paint5 = this.f68557d;
                                        try {
                                            paint5.setMaskFilter(new BlurMaskFilter(f23, BlurMaskFilter.Blur.NORMAL));
                                            paint5.setAlpha(RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD);
                                            float f24 = ((2 * f23) + f19 + height) * f16;
                                            float f25 = (-f19) + f24;
                                            if (!Float.isNaN(f24) && !Float.isNaN(f25) && !Float.isNaN(width) && width > 0.0f && f24 > f25) {
                                                float f26 = width / 4;
                                                try {
                                                    canvas3.drawOval(-f26, f25, width + f26, f24, paint5);
                                                    try {
                                                        this.f68572s.set(i14, a(i16, i17));
                                                        Bitmap bitmap2 = (Bitmap) CollectionsKt.U(i14, this.f68572s);
                                                        if (bitmap2 != null) {
                                                            Canvas canvas4 = new Canvas(bitmap2);
                                                            Paint paint6 = this.f68559f;
                                                            try {
                                                                paint6.setMaskFilter(new BlurMaskFilter(ql2.s.a(height * 0.4f, 30.0f), BlurMaskFilter.Blur.INNER));
                                                                if (z13) {
                                                                    paint6.setColor(-1);
                                                                    paint6.setShader(null);
                                                                } else {
                                                                    Drawable drawable = this.f68555b;
                                                                    if (drawable != null) {
                                                                        try {
                                                                            Bitmap j03 = tb.f.j0(drawable, i16, i17, 4);
                                                                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                                                            paint6.setShader(new BitmapShader(j03, tileMode, tileMode));
                                                                        } catch (Throwable th3) {
                                                                            c();
                                                                            th3.getMessage();
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            Float valueOf = Float.valueOf(f18);
                                                                            if (Float.isInfinite(f18) || Float.isNaN(f18) || f18 <= 0.0f) {
                                                                                valueOf = null;
                                                                            }
                                                                            paint6.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, ql2.s.c(valueOf != null ? valueOf.floatValue() : 1.0f, 3.4028235E37f), new int[]{-11443, -29594, -754760, -14231138, -7359233}, (float[]) null, Shader.TileMode.CLAMP));
                                                                        } catch (Exception e13) {
                                                                            canvas2 = canvas;
                                                                            f14 = 0.0f;
                                                                            c();
                                                                            e13.getMessage();
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    Bitmap bitmap3 = this.f68571r;
                                                                    Object U = CollectionsKt.U(i14, this.f68572s);
                                                                    if (bitmap3 != null && U != null) {
                                                                        Bitmap bitmap4 = (Bitmap) U;
                                                                        Path path2 = new Path(c0Var.f68545a);
                                                                        path2.offset(-width2, -height2);
                                                                        canvas4.drawPath(path2, paint6);
                                                                        f14 = 0.0f;
                                                                        try {
                                                                            canvas4.drawBitmap(bitmap3, 0.0f, 0.0f, this.f68558e);
                                                                            canvas2 = canvas;
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            canvas2 = canvas;
                                                                        }
                                                                        try {
                                                                            canvas2.drawBitmap(bitmap4, width2, height2, (Paint) null);
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            c();
                                                                            th.getMessage();
                                                                            paint3 = paint;
                                                                            paint4 = paint2;
                                                                            it3 = it;
                                                                            i14 = i13;
                                                                            z14 = false;
                                                                            f15 = 1.0f;
                                                                            z15 = true;
                                                                        }
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    canvas2 = canvas;
                                                                    f14 = 0.0f;
                                                                }
                                                            } catch (Exception e14) {
                                                                canvas2 = canvas;
                                                                f14 = 0.0f;
                                                                c();
                                                                e14.getMessage();
                                                            }
                                                        }
                                                    } catch (Throwable th7) {
                                                        canvas2 = canvas;
                                                        f14 = 0.0f;
                                                        c();
                                                        th7.getMessage();
                                                    }
                                                } catch (Exception e15) {
                                                    canvas2 = canvas;
                                                    f14 = 0.0f;
                                                    c();
                                                    e15.getMessage();
                                                }
                                            }
                                            canvas2 = canvas;
                                            f14 = 0.0f;
                                        } catch (Exception e16) {
                                            canvas2 = canvas;
                                            f14 = 0.0f;
                                            c();
                                            e16.getMessage();
                                        }
                                    }
                                } else {
                                    Bitmap bitmap5 = (Bitmap) CollectionsKt.U(i14, this.f68572s);
                                    if (bitmap5 != null && !bitmap5.isRecycled()) {
                                        try {
                                            canvas2.drawBitmap(bitmap5, width2, height2, (Paint) null);
                                        } catch (Throwable th8) {
                                            c();
                                            th8.getMessage();
                                        }
                                    }
                                }
                            }
                            it = it3;
                            i13 = i15;
                            f14 = 0.0f;
                        }
                        paint2 = paint4;
                        it = it3;
                        i13 = i15;
                    } else {
                        paint = paint3;
                        paint2 = paint4;
                        it = it3;
                        i13 = i15;
                        boolean z16 = aVar instanceof x;
                    }
                    paint3 = paint;
                    paint4 = paint2;
                    it3 = it;
                    i14 = i13;
                    z14 = false;
                    f15 = 1.0f;
                    z15 = true;
                }
                paint = paint3;
                paint2 = paint4;
                it = it3;
                i13 = i15;
                paint3 = paint;
                paint4 = paint2;
                it3 = it;
                i14 = i13;
                z14 = false;
                f15 = 1.0f;
                z15 = true;
            }
            this.f68570q = f16;
        }
    }

    public final void e(float f13) {
        int i13;
        Paint paint = this.f68560g;
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
        return this.f68575v.isRunning() || this.f68576w.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        b0 b0Var;
        c0 c0Var;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (bounds.width() <= 0 || bounds.height() <= 0) {
            b0Var = this.f68565l;
        } else {
            List list = this.f68554a;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i1 i1Var = ((st1.a) it.next()).f115172b;
                String str = i1Var.f106498a;
                if (str == null) {
                    int i13 = g2.f106487b;
                    str = "M0 0H0Z";
                }
                int i14 = g2.f106487b;
                if (Intrinsics.d(str, "M0 0H1V1H0Z")) {
                    try {
                        int width = bounds.width();
                        int height = bounds.height();
                        Path J2 = k3.J(kotlin.text.t.b("\n                    M 0,0 \n                    v " + height + " \n                    a 0,0 -90 0 0 0,0\n                    h " + width + " \n                    a 0,0 -90 0 0 0,-0\n                    v -" + height + "\n                    a 0,0 -90 0 0 -0,-0\n                    h -" + width + "\n                    a 0,0 -90 0 0 -0,0\n                    Z\n                        "));
                        Intrinsics.checkNotNullExpressionValue(J2, "createPathFromPathData(...)");
                        c0Var = new c0(J2, kg.p.v(str), i1Var, false);
                    } catch (Exception unused) {
                        c();
                        c0Var = new c0(kh2.b0.T1(bounds.width(), bounds.height(), str), kg.p.v(str), i1Var, false);
                    }
                } else {
                    c0Var = new c0(kh2.b0.T1(bounds.width(), bounds.height(), str), kg.p.v(str), i1Var, false);
                }
                arrayList.add(c0Var);
            }
            b0Var = new b0(arrayList);
        }
        this.f68565l = b0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f68556c.setAlpha((int) (this.f68566m * i13));
        this.f68560g.setAlpha(i13);
        this.f68559f.setAlpha(i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f68556c.setColorFilter(colorFilter);
        this.f68560g.setColorFilter(colorFilter);
        this.f68559f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        lf.a aVar = this.f68568o;
        if (aVar instanceof y) {
            this.f68576w.start();
        } else if (aVar instanceof a0) {
            this.f68575v.reverse();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        lf.a aVar = this.f68568o;
        if (aVar instanceof y) {
            this.f68576w.end();
            d();
        } else if (aVar instanceof a0) {
            this.f68575v.end();
        }
    }
}
