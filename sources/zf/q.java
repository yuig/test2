package zf;

import a.cb;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class q extends h {

    /* renamed from: f, reason: collision with root package name */
    public PieChart f141861f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f141862g;

    /* renamed from: h, reason: collision with root package name */
    public Paint f141863h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f141864i;

    /* renamed from: j, reason: collision with root package name */
    public TextPaint f141865j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f141866k;

    /* renamed from: l, reason: collision with root package name */
    public StaticLayout f141867l;

    /* renamed from: m, reason: collision with root package name */
    public String f141868m;

    /* renamed from: n, reason: collision with root package name */
    public RectF f141869n;

    /* renamed from: o, reason: collision with root package name */
    public RectF[] f141870o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f141871p;

    /* renamed from: q, reason: collision with root package name */
    public Canvas f141872q;

    /* renamed from: r, reason: collision with root package name */
    public Path f141873r;

    /* renamed from: s, reason: collision with root package name */
    public RectF f141874s;

    /* renamed from: t, reason: collision with root package name */
    public Path f141875t;

    /* renamed from: u, reason: collision with root package name */
    public Path f141876u;

    /* renamed from: v, reason: collision with root package name */
    public RectF f141877v;

    public static float w(ag.d dVar, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d2 = (f17 + f18) * 0.017453292f;
        float cos = (((float) Math.cos(d2)) * f13) + dVar.f15087b;
        float sin = (((float) Math.sin(d2)) * f13) + dVar.f15088c;
        double d13 = ((f18 / 2.0f) + f17) * 0.017453292f;
        float cos2 = (((float) Math.cos(d13)) * f13) + dVar.f15087b;
        float sin2 = (((float) Math.sin(d13)) * f13) + dVar.f15088c;
        return (float) ((f13 - ((float) (Math.tan(((180.0d - f14) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(sin - f16, 2.0d) + Math.pow(cos - f15, 2.0d)) / 2.0d)))) - Math.sqrt(Math.pow(sin2 - ((sin + f16) / 2.0f), 2.0d) + Math.pow(cos2 - ((cos + f15) / 2.0f), 2.0d)));
    }

    @Override // zf.h
    public final void q(Canvas canvas) {
        PieChart pieChart;
        Iterator it;
        PieChart pieChart2;
        Iterator it2;
        tf.m mVar;
        int i13;
        RectF rectF;
        float[] fArr;
        int i14;
        float f13;
        boolean z13;
        float f14;
        ag.d dVar;
        boolean z14;
        float f15;
        int i15;
        boolean z15;
        float f16;
        float f17;
        ag.d dVar2;
        q qVar = this;
        ag.j jVar = (ag.j) qVar.f24333a;
        int i16 = (int) jVar.f15116c;
        int i17 = (int) jVar.f15117d;
        WeakReference weakReference = qVar.f141871p;
        Bitmap bitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (bitmap == null || bitmap.getWidth() != i16 || bitmap.getHeight() != i17) {
            if (i16 <= 0 || i17 <= 0) {
                return;
            }
            bitmap = Bitmap.createBitmap(i16, i17, Bitmap.Config.ARGB_4444);
            qVar.f141871p = new WeakReference(bitmap);
            qVar.f141872q = new Canvas(bitmap);
        }
        int i18 = 0;
        bitmap.eraseColor(0);
        PieChart pieChart3 = qVar.f141861f;
        Iterator it3 = ((tf.k) pieChart3.f30149a).f117511i.iterator();
        while (it3.hasNext()) {
            tf.m mVar2 = (tf.m) it3.next();
            if (mVar2.f117525n) {
                List list = mVar2.f117526o;
                if (list.size() > 0) {
                    float f18 = pieChart3.f30174y;
                    qVar.f141832b.getClass();
                    RectF rectF2 = pieChart3.B;
                    int size = list.size();
                    float[] fArr2 = pieChart3.D;
                    ag.d J2 = pieChart3.J();
                    float G = pieChart3.G();
                    boolean z16 = pieChart3.F;
                    float f19 = z16 ? (pieChart3.I / 100.0f) * G : 0.0f;
                    new RectF();
                    int i19 = i18;
                    int i23 = i19;
                    while (i19 < size) {
                        if (Math.abs(((PieEntry) mVar2.e(i19)).f117501a) > ag.i.f15107d) {
                            i23++;
                        }
                        i19++;
                    }
                    boolean z17 = true;
                    float f23 = i23 <= 1 ? 0.0f : mVar2.f117539t;
                    int i24 = i18;
                    float f24 = 0.0f;
                    while (i24 < size) {
                        float f25 = fArr2[i24];
                        if (Math.abs(mVar2.e(i24).a()) <= ag.i.f15107d) {
                            f17 = (f25 * 1.0f) + f24;
                            pieChart2 = pieChart3;
                            it2 = it3;
                            mVar = mVar2;
                            i13 = size;
                            rectF = rectF2;
                            fArr = fArr2;
                            i14 = i24;
                            z14 = z17;
                            f13 = f19;
                            z13 = z16;
                            f14 = G;
                            dVar = J2;
                        } else {
                            if (pieChart3.B()) {
                                while (true) {
                                    vf.c[] cVarArr = pieChart3.f30169u;
                                    pieChart2 = pieChart3;
                                    if (i18 >= cVarArr.length) {
                                        break;
                                    }
                                    if (((int) cVarArr[i18].f125765a) == i24) {
                                        it2 = it3;
                                        mVar = mVar2;
                                        i13 = size;
                                        rectF = rectF2;
                                        fArr = fArr2;
                                        i14 = i24;
                                        f13 = f19;
                                        z13 = z16;
                                        f14 = G;
                                        dVar = J2;
                                        f24 = (f25 * 1.0f) + f24;
                                        z14 = true;
                                        break;
                                    }
                                    i18++;
                                    pieChart3 = pieChart2;
                                }
                            } else {
                                pieChart2 = pieChart3;
                            }
                            boolean z18 = f23 > 0.0f && f25 <= 180.0f;
                            Paint paint = qVar.f141833c;
                            List list2 = mVar2.f117512a;
                            it2 = it3;
                            paint.setColor(((Integer) list2.get(i24 % list2.size())).intValue());
                            float f26 = i23 == 1 ? 0.0f : f23 / (G * 0.017453292f);
                            float f27 = (((f26 / 2.0f) + f24) * 1.0f) + f18;
                            float f28 = (f25 - f26) * 1.0f;
                            if (f28 < 0.0f) {
                                mVar = mVar2;
                                i13 = size;
                                f15 = 0.0f;
                            } else {
                                mVar = mVar2;
                                f15 = f28;
                                i13 = size;
                            }
                            Path path = qVar.f141873r;
                            path.reset();
                            fArr = fArr2;
                            i14 = i24;
                            double d2 = f27 * 0.017453292f;
                            boolean z19 = z18;
                            float cos = (((float) Math.cos(d2)) * G) + J2.f15087b;
                            float sin = J2.f15088c + (((float) Math.sin(d2)) * G);
                            if (f15 < 360.0f || f15 % 360.0f > ag.i.f15107d) {
                                path.arcTo(rectF2, f27, f15);
                            } else {
                                path.addCircle(J2.f15087b, J2.f15088c, G, Path.Direction.CW);
                            }
                            RectF rectF3 = qVar.f141874s;
                            float f29 = J2.f15087b;
                            rectF = rectF2;
                            float f33 = J2.f15088c;
                            int i25 = i23;
                            rectF3.set(f29 - f19, f33 - f19, f29 + f19, f33 + f19);
                            if (!z16) {
                                f13 = f19;
                                f14 = G;
                                dVar = J2;
                                i15 = i25;
                                z15 = true;
                                z13 = z16;
                                f16 = 360.0f;
                            } else if (f19 > 0.0f || z19) {
                                if (z19) {
                                    i15 = i25;
                                    f13 = f19;
                                    z13 = z16;
                                    f14 = G;
                                    dVar2 = J2;
                                    float w13 = w(J2, G, f25 * 1.0f, cos, sin, f27, f15);
                                    if (w13 < 0.0f) {
                                        w13 = -w13;
                                    }
                                    f19 = Math.max(f13, w13);
                                } else {
                                    f13 = f19;
                                    f14 = G;
                                    dVar2 = J2;
                                    i15 = i25;
                                    z13 = z16;
                                }
                                z15 = true;
                                float f34 = (i15 == 1 || f19 == 0.0f) ? 0.0f : f23 / (f19 * 0.017453292f);
                                float f35 = (((f34 / 2.0f) + f24) * 1.0f) + f18;
                                float f36 = (f25 - f34) * 1.0f;
                                if (f36 < 0.0f) {
                                    f36 = 0.0f;
                                }
                                float f37 = f35 + f36;
                                if (f15 < 360.0f || f15 % 360.0f > ag.i.f15107d) {
                                    double d13 = 0.017453292f * f37;
                                    path.lineTo((((float) Math.cos(d13)) * f19) + dVar2.f15087b, (f19 * ((float) Math.sin(d13))) + dVar2.f15088c);
                                    path.arcTo(rectF3, f37, -f36);
                                } else {
                                    path.addCircle(dVar2.f15087b, dVar2.f15088c, f19, Path.Direction.CCW);
                                }
                                dVar = dVar2;
                                z14 = z15;
                                path.close();
                                i23 = i15;
                                qVar = this;
                                qVar.f141872q.drawPath(path, paint);
                                f17 = (f25 * 1.0f) + f24;
                            } else {
                                f13 = f19;
                                f14 = G;
                                dVar = J2;
                                i15 = i25;
                                f16 = 360.0f;
                                z15 = true;
                                z13 = z16;
                            }
                            if (f15 % f16 > ag.i.f15107d) {
                                if (z19) {
                                    z14 = z15;
                                    float w14 = w(dVar, f14, f25 * 1.0f, cos, sin, f27, f15);
                                    double d14 = 0.017453292f * ((f15 / 2.0f) + f27);
                                    path.lineTo((((float) Math.cos(d14)) * w14) + dVar.f15087b, (w14 * ((float) Math.sin(d14))) + dVar.f15088c);
                                } else {
                                    z14 = z15;
                                    path.lineTo(dVar.f15087b, dVar.f15088c);
                                }
                                path.close();
                                i23 = i15;
                                qVar = this;
                                qVar.f141872q.drawPath(path, paint);
                                f17 = (f25 * 1.0f) + f24;
                            }
                            z14 = z15;
                            path.close();
                            i23 = i15;
                            qVar = this;
                            qVar.f141872q.drawPath(path, paint);
                            f17 = (f25 * 1.0f) + f24;
                        }
                        f24 = f17;
                        i24 = i14 + 1;
                        z17 = z14;
                        f19 = f13;
                        J2 = dVar;
                        size = i13;
                        pieChart3 = pieChart2;
                        it3 = it2;
                        mVar2 = mVar;
                        fArr2 = fArr;
                        rectF2 = rectF;
                        z16 = z13;
                        G = f14;
                        i18 = 0;
                    }
                    pieChart = pieChart3;
                    it = it3;
                    ag.d.c(J2);
                    pieChart3 = pieChart;
                    it3 = it;
                    i18 = 0;
                }
            }
            pieChart = pieChart3;
            it = it3;
            pieChart3 = pieChart;
            it3 = it;
            i18 = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zf.h
    public final void r(Canvas canvas) {
        float G;
        RectF rectF;
        PieChart pieChart = this.f141861f;
        if (pieChart.F && this.f141872q != null) {
            float G2 = pieChart.G();
            float f13 = pieChart.I;
            float f14 = (f13 / 100.0f) * G2;
            ag.d J2 = pieChart.J();
            Paint paint = this.f141862g;
            if (Color.alpha(paint.getColor()) > 0) {
                this.f141872q.drawCircle(J2.f15087b, J2.f15088c, f14, paint);
            }
            Paint paint2 = this.f141863h;
            if (Color.alpha(paint2.getColor()) > 0) {
                float f15 = pieChart.f30173J;
                if (f15 > f13) {
                    int alpha = paint2.getAlpha();
                    float f16 = (f15 / 100.0f) * G2;
                    this.f141832b.getClass();
                    paint2.setAlpha((int) (alpha * 1.0f * 1.0f));
                    Path path = this.f141875t;
                    path.reset();
                    path.addCircle(J2.f15087b, J2.f15088c, f16, Path.Direction.CW);
                    path.addCircle(J2.f15087b, J2.f15088c, f14, Path.Direction.CCW);
                    this.f141872q.drawPath(path, paint2);
                    paint2.setAlpha(alpha);
                }
            }
            ag.d.c(J2);
        }
        canvas.drawBitmap((Bitmap) this.f141871p.get(), 0.0f, 0.0f, (Paint) null);
        String str = pieChart.G;
        if (!pieChart.K || str == null) {
            return;
        }
        ag.d J3 = pieChart.J();
        ag.d dVar = pieChart.H;
        ag.d b13 = ag.d.b(dVar.f15087b, dVar.f15088c);
        float f17 = J3.f15087b + b13.f15087b;
        float f18 = J3.f15088c + b13.f15088c;
        if (pieChart.F) {
            G = (pieChart.I / 100.0f) * pieChart.G();
        } else {
            G = pieChart.G();
        }
        RectF[] rectFArr = this.f141870o;
        RectF rectF2 = rectFArr[0];
        rectF2.left = f17 - G;
        rectF2.top = f18 - G;
        rectF2.right = f17 + G;
        rectF2.bottom = f18 + G;
        RectF rectF3 = rectFArr[1];
        rectF3.set(rectF2);
        float f19 = pieChart.L / 100.0f;
        if (f19 > 0.0d) {
            rectF3.inset((rectF3.width() - (rectF3.width() * f19)) / 2.0f, (rectF3.height() - (rectF3.height() * f19)) / 2.0f);
        }
        boolean equals = str.equals(this.f141868m);
        RectF rectF4 = this.f141869n;
        if (equals && rectF3.equals(rectF4)) {
            rectF = rectF2;
        } else {
            rectF4.set(rectF3);
            this.f141868m = str;
            float width = rectF4.width();
            int length = str.length();
            TextPaint textPaint = this.f141865j;
            double ceil = Math.ceil(width);
            rectF = rectF2;
            this.f141867l = new StaticLayout(str, 0, length, textPaint, (int) Math.max(ceil, 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.f141867l.getHeight();
        canvas.save();
        Path path2 = this.f141876u;
        path2.reset();
        path2.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path2);
        canvas.translate(rectF3.left, ((rectF3.height() - height) / 2.0f) + rectF3.top);
        this.f141867l.draw(canvas);
        canvas.restore();
        ag.d.c(J3);
        ag.d.c(b13);
    }

    @Override // zf.h
    public final void s(Canvas canvas, vf.c[] cVarArr) {
        tf.m mVar;
        float[] fArr;
        float f13;
        PieChart pieChart;
        float[] fArr2;
        Paint paint;
        int i13;
        boolean z13;
        float f14;
        int i14;
        RectF rectF;
        float f15;
        Paint paint2;
        int i15;
        float f16;
        boolean z14;
        float f17;
        vf.c[] cVarArr2 = cVarArr;
        PieChart pieChart2 = this.f141861f;
        boolean z15 = pieChart2.F;
        this.f141832b.getClass();
        float f18 = pieChart2.f30174y;
        float[] fArr3 = pieChart2.D;
        float[] fArr4 = pieChart2.E;
        ag.d J2 = pieChart2.J();
        float G = pieChart2.G();
        boolean z16 = false;
        float f19 = z15 ? (pieChart2.I / 100.0f) * G : 0.0f;
        RectF rectF2 = this.f141877v;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i16 = 0;
        while (i16 < cVarArr2.length) {
            vf.c cVar = cVarArr2[i16];
            int i17 = (int) cVar.f125765a;
            if (i17 < fArr3.length) {
                tf.k kVar = (tf.k) pieChart2.f30149a;
                if (cVar.f125770f == 0) {
                    mVar = kVar.f();
                } else {
                    kVar.getClass();
                    mVar = null;
                }
                if (mVar != null && mVar.f117516e) {
                    int size = mVar.f117526o.size();
                    int i18 = 0;
                    int i19 = 0;
                    while (i19 < size) {
                        int i23 = size;
                        if (Math.abs(((PieEntry) mVar.e(i19)).f117501a) > ag.i.f15107d) {
                            i18++;
                        }
                        i19++;
                        size = i23;
                    }
                    float f23 = i17 == 0 ? 0.0f : fArr4[i17 - 1] * 1.0f;
                    float f24 = i18 <= 1 ? 0.0f : mVar.f117539t;
                    float f25 = fArr3[i17];
                    float f26 = mVar.f117540u;
                    float f27 = G + f26;
                    fArr = fArr3;
                    rectF2.set(pieChart2.B);
                    float f28 = -f26;
                    rectF2.inset(f28, f28);
                    boolean z17 = f24 > 0.0f && f25 <= 180.0f;
                    Paint paint3 = this.f141833c;
                    List list = mVar.f117512a;
                    paint3.setColor(((Integer) list.get(i17 % list.size())).intValue());
                    float f29 = i18 == 1 ? 0.0f : f24 / (G * 0.017453292f);
                    float f33 = i18 == 1 ? 0.0f : f24 / (f27 * 0.017453292f);
                    float f34 = (((f29 / 2.0f) + f23) * 1.0f) + f18;
                    float f35 = (f25 - f29) * 1.0f;
                    float f36 = f35 < 0.0f ? 0.0f : f35;
                    float f37 = (((f33 / 2.0f) + f23) * 1.0f) + f18;
                    float f38 = (f25 - f33) * 1.0f;
                    if (f38 < 0.0f) {
                        pieChart = pieChart2;
                        f13 = 0.0f;
                    } else {
                        f13 = f38;
                        pieChart = pieChart2;
                    }
                    Path path = this.f141873r;
                    path.reset();
                    if (f36 < 360.0f || f36 % 360.0f > ag.i.f15107d) {
                        fArr2 = fArr4;
                        paint = paint3;
                        i13 = i16;
                        double d2 = f37 * 0.017453292f;
                        z13 = z15;
                        f14 = f18;
                        path.moveTo((((float) Math.cos(d2)) * f27) + J2.f15087b, (f27 * ((float) Math.sin(d2))) + J2.f15088c);
                        path.arcTo(rectF2, f37, f13);
                    } else {
                        fArr2 = fArr4;
                        path.addCircle(J2.f15087b, J2.f15088c, f27, Path.Direction.CW);
                        z13 = z15;
                        f14 = f18;
                        paint = paint3;
                        i13 = i16;
                    }
                    if (z17) {
                        double d13 = f34 * 0.017453292f;
                        RectF rectF3 = rectF2;
                        float cos = (((float) Math.cos(d13)) * G) + J2.f15087b;
                        float sin = (((float) Math.sin(d13)) * G) + J2.f15088c;
                        paint2 = paint;
                        i14 = i13;
                        rectF = rectF3;
                        i15 = 1;
                        f15 = f19;
                        f16 = w(J2, G, f25 * 1.0f, cos, sin, f34, f36);
                    } else {
                        i14 = i13;
                        rectF = rectF2;
                        f15 = f19;
                        paint2 = paint;
                        i15 = 1;
                        f16 = 0.0f;
                    }
                    RectF rectF4 = this.f141874s;
                    float f39 = J2.f15087b;
                    float f41 = J2.f15088c;
                    rectF4.set(f39 - f15, f41 - f15, f39 + f15, f41 + f15);
                    if (!z13) {
                        z14 = false;
                    } else if (f15 > 0.0f || z17) {
                        if (z17) {
                            if (f16 < 0.0f) {
                                f16 = -f16;
                            }
                            f17 = Math.max(f15, f16);
                        } else {
                            f17 = f15;
                        }
                        float f43 = (i18 == i15 || f17 == 0.0f) ? 0.0f : f24 / (f17 * 0.017453292f);
                        float f44 = (((f43 / 2.0f) + f23) * 1.0f) + f14;
                        float f45 = (f25 - f43) * 1.0f;
                        z14 = false;
                        if (f45 < 0.0f) {
                            f45 = 0.0f;
                        }
                        float f46 = f44 + f45;
                        if (f36 < 360.0f || f36 % 360.0f > ag.i.f15107d) {
                            double d14 = f46 * 0.017453292f;
                            path.lineTo((((float) Math.cos(d14)) * f17) + J2.f15087b, (f17 * ((float) Math.sin(d14))) + J2.f15088c);
                            path.arcTo(rectF4, f46, -f45);
                        } else {
                            path.addCircle(J2.f15087b, J2.f15088c, f17, Path.Direction.CCW);
                        }
                        path.close();
                        this.f141872q.drawPath(path, paint2);
                        i16 = i14 + 1;
                        cVarArr2 = cVarArr;
                        f19 = f15;
                        z16 = z14;
                        pieChart2 = pieChart;
                        fArr3 = fArr;
                        rectF2 = rectF;
                        fArr4 = fArr2;
                        z15 = z13;
                        f18 = f14;
                    } else {
                        z14 = false;
                    }
                    if (f36 % 360.0f > ag.i.f15107d) {
                        if (z17) {
                            double d15 = ((f36 / 2.0f) + f34) * 0.017453292f;
                            path.lineTo((((float) Math.cos(d15)) * f16) + J2.f15087b, (f16 * ((float) Math.sin(d15))) + J2.f15088c);
                        } else {
                            path.lineTo(J2.f15087b, J2.f15088c);
                        }
                    }
                    path.close();
                    this.f141872q.drawPath(path, paint2);
                    i16 = i14 + 1;
                    cVarArr2 = cVarArr;
                    f19 = f15;
                    z16 = z14;
                    pieChart2 = pieChart;
                    fArr3 = fArr;
                    rectF2 = rectF;
                    fArr4 = fArr2;
                    z15 = z13;
                    f18 = f14;
                }
            }
            pieChart = pieChart2;
            z13 = z15;
            f14 = f18;
            fArr = fArr3;
            fArr2 = fArr4;
            i14 = i16;
            rectF = rectF2;
            f15 = f19;
            z14 = z16;
            i16 = i14 + 1;
            cVarArr2 = cVarArr;
            f19 = f15;
            z16 = z14;
            pieChart2 = pieChart;
            fArr3 = fArr;
            rectF2 = rectF;
            fArr4 = fArr2;
            z15 = z13;
            f18 = f14;
        }
        ag.d.c(J2);
    }

    @Override // zf.h
    public final void t(Canvas canvas) {
        int i13;
        ArrayList arrayList;
        tf.k kVar;
        boolean z13;
        PieChart pieChart;
        float f13;
        float f14;
        float[] fArr;
        float[] fArr2;
        float f15;
        char c13;
        q qVar;
        Canvas canvas2;
        String str;
        boolean z14;
        float f16;
        boolean z15;
        PieChart pieChart2;
        q qVar2;
        Paint paint;
        float f17;
        float f18;
        float f19;
        f0.h hVar;
        float f23;
        boolean z16;
        int i14;
        float f24;
        float f25;
        Paint paint2;
        Canvas canvas3;
        Paint paint3;
        String str2;
        int i15;
        q qVar3 = this;
        Canvas canvas4 = canvas;
        PieChart pieChart3 = qVar3.f141861f;
        ag.d J2 = pieChart3.J();
        float G = pieChart3.G();
        float f26 = pieChart3.f30174y;
        float[] fArr3 = pieChart3.D;
        float[] fArr4 = pieChart3.E;
        qVar3.f141832b.getClass();
        float f27 = pieChart3.I / 100.0f;
        float f28 = (G / 10.0f) * 3.6f;
        if (pieChart3.F) {
            f28 = cb.a(G, f27, G, 2.0f);
        }
        float f29 = G - f28;
        tf.k kVar2 = (tf.k) pieChart3.f30149a;
        ArrayList arrayList2 = kVar2.f117511i;
        kVar2.g();
        boolean z17 = pieChart3.C;
        canvas.save();
        float c14 = ag.i.c(5.0f);
        int i16 = 0;
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            tf.m mVar = (tf.m) arrayList2.get(i17);
            boolean z18 = mVar.f117521j;
            if (z18 || z17) {
                int i18 = i16;
                Paint paint4 = qVar3.f141835e;
                i13 = i17;
                paint4.setTypeface(null);
                paint4.setTextSize(mVar.f117524m);
                Paint paint5 = qVar3.f141835e;
                float c15 = ag.i.c(4.0f) + ag.i.a(paint5, "Q");
                f0.h hVar2 = mVar.f117517f;
                if (hVar2 == null) {
                    hVar2 = ag.i.f15111h;
                }
                arrayList = arrayList2;
                int size = mVar.f117526o.size();
                Paint paint6 = qVar3.f141864i;
                kVar = kVar2;
                int i19 = mVar.f117543x;
                paint6.setColor(i19);
                int i23 = i19;
                paint6.setStrokeWidth(ag.i.c(mVar.f117544y));
                float f33 = mVar.f117539t;
                Paint paint7 = paint6;
                ag.d dVar = mVar.f117523l;
                Paint paint8 = paint5;
                ag.d dVar2 = (ag.d) ag.d.f15086d.b();
                float f34 = dVar.f15087b;
                dVar2.f15087b = f34;
                dVar2.f15088c = dVar.f15088c;
                dVar2.f15087b = ag.i.c(f34);
                dVar2.f15088c = ag.i.c(dVar2.f15088c);
                int i24 = 0;
                while (i24 < size) {
                    PieEntry pieEntry = (PieEntry) mVar.e(i24);
                    ag.d dVar3 = dVar2;
                    float f35 = ((((fArr3[i18] - ((f33 / (f29 * 0.017453292f)) / 2.0f)) / 2.0f) + (i18 == 0 ? 0.0f : fArr4[i18 - 1] * 1.0f)) * 1.0f) + f26;
                    String G2 = hVar2.G(pieEntry.f117501a);
                    f0.h hVar3 = hVar2;
                    int i25 = size;
                    float f36 = f33;
                    double d2 = f35 * 0.017453292f;
                    float f37 = f26;
                    float[] fArr5 = fArr3;
                    float cos = (float) Math.cos(d2);
                    float[] fArr6 = fArr4;
                    float sin = (float) Math.sin(d2);
                    tf.l lVar = mVar.f117541v;
                    if (z17 && lVar == tf.l.OUTSIDE_SLICE) {
                        str = G2;
                        z14 = true;
                    } else {
                        str = G2;
                        z14 = false;
                    }
                    tf.l lVar2 = mVar.f117542w;
                    int i26 = i24;
                    boolean z19 = z18 && lVar2 == tf.l.OUTSIDE_SLICE;
                    boolean z23 = z17;
                    boolean z24 = z17 && lVar == tf.l.INSIDE_SLICE;
                    boolean z25 = z18 && lVar2 == tf.l.INSIDE_SLICE;
                    if (z14 || z19) {
                        float f38 = mVar.f117545z / 100.0f;
                        if (pieChart3.F) {
                            float f39 = G * f27;
                            f16 = ep.b.a(G, f39, f38, f39);
                        } else {
                            f16 = f38 * G;
                        }
                        float f41 = mVar.B;
                        float abs = mVar.C ? f41 * f29 * ((float) Math.abs(Math.sin(d2))) : f41 * f29;
                        float f43 = J2.f15087b;
                        float f44 = (f16 * cos) + f43;
                        float f45 = J2.f15088c;
                        float f46 = (f16 * sin) + f45;
                        float f47 = (mVar.A + 1.0f) * f29;
                        float f48 = (f47 * cos) + f43;
                        float f49 = f45 + (f47 * sin);
                        double d13 = f35 % 360.0d;
                        z15 = z18;
                        pieChart2 = pieChart3;
                        qVar2 = this;
                        Paint paint9 = qVar2.f141866k;
                        if (d13 < 90.0d || d13 > 270.0d) {
                            paint = paint8;
                            float f53 = f48 + abs;
                            Paint.Align align = Paint.Align.LEFT;
                            paint.setTextAlign(align);
                            if (z14) {
                                paint9.setTextAlign(align);
                            }
                            f17 = f53 + c14;
                            f18 = f53;
                        } else {
                            float f54 = f48 - abs;
                            Paint.Align align2 = Paint.Align.RIGHT;
                            paint = paint8;
                            paint.setTextAlign(align2);
                            if (z14) {
                                paint9.setTextAlign(align2);
                            }
                            f18 = f54;
                            f17 = f54 - c14;
                        }
                        int i27 = i23;
                        if (i27 != 1122867) {
                            hVar = hVar3;
                            z16 = z23;
                            i14 = i27;
                            f23 = f36;
                            f25 = G;
                            paint2 = paint;
                            f19 = f27;
                            f24 = f17;
                            Paint paint10 = paint7;
                            canvas.drawLine(f44, f46, f48, f49, paint10);
                            canvas.drawLine(f48, f49, f18, f49, paint10);
                        } else {
                            f19 = f27;
                            hVar = hVar3;
                            f23 = f36;
                            z16 = z23;
                            i14 = i27;
                            f24 = f17;
                            f25 = G;
                            paint2 = paint;
                        }
                        if (z14 && z19) {
                            i15 = i26;
                            int h10 = mVar.h(i15);
                            Paint paint11 = qVar2.f141835e;
                            paint11.setColor(h10);
                            canvas3 = canvas;
                            paint3 = paint7;
                            str2 = str;
                            canvas3.drawText(str2, f24, f49, paint11);
                            kVar.d();
                        } else {
                            canvas3 = canvas;
                            paint3 = paint7;
                            str2 = str;
                            i15 = i26;
                            if (z14) {
                                kVar.d();
                            } else if (z19) {
                                int h13 = mVar.h(i15);
                                Paint paint12 = qVar2.f141835e;
                                paint12.setColor(h13);
                                canvas3.drawText(str2, f24, (c15 / 2.0f) + f49, paint12);
                            }
                        }
                    } else {
                        canvas3 = canvas;
                        z15 = z18;
                        pieChart2 = pieChart3;
                        f19 = f27;
                        paint3 = paint7;
                        f23 = f36;
                        str2 = str;
                        i15 = i26;
                        qVar2 = this;
                        f25 = G;
                        paint2 = paint8;
                        i14 = i23;
                        hVar = hVar3;
                        z16 = z23;
                    }
                    if (z24 || z25) {
                        float f55 = (cos * f29) + J2.f15087b;
                        float f56 = (sin * f29) + J2.f15088c;
                        paint2.setTextAlign(Paint.Align.CENTER);
                        if (z24 && z25) {
                            int h14 = mVar.h(i15);
                            Paint paint13 = qVar2.f141835e;
                            paint13.setColor(h14);
                            canvas3.drawText(str2, f55, f56, paint13);
                            kVar.d();
                        } else if (z24) {
                            kVar.d();
                        } else if (z25) {
                            int h15 = mVar.h(i15);
                            Paint paint14 = qVar2.f141835e;
                            paint14.setColor(h15);
                            canvas3.drawText(str2, f55, (c15 / 2.0f) + f56, paint14);
                        }
                    }
                    i18++;
                    i24 = i15 + 1;
                    paint7 = paint3;
                    paint8 = paint2;
                    hVar2 = hVar;
                    dVar2 = dVar3;
                    z17 = z16;
                    size = i25;
                    G = f25;
                    f26 = f37;
                    fArr3 = fArr5;
                    fArr4 = fArr6;
                    i23 = i14;
                    f33 = f23;
                    pieChart3 = pieChart2;
                    z18 = z15;
                    f27 = f19;
                }
                z13 = z17;
                pieChart = pieChart3;
                f13 = G;
                f14 = f26;
                fArr = fArr3;
                fArr2 = fArr4;
                f15 = f27;
                c13 = 0;
                qVar = this;
                canvas2 = canvas;
                ag.d.c(dVar2);
                i16 = i18;
            } else {
                i13 = i17;
                z13 = z17;
                arrayList = arrayList2;
                kVar = kVar2;
                canvas2 = canvas4;
                pieChart = pieChart3;
                f13 = G;
                f14 = f26;
                fArr = fArr3;
                fArr2 = fArr4;
                f15 = f27;
                c13 = 0;
                qVar = qVar3;
            }
            i17 = i13 + 1;
            canvas4 = canvas2;
            qVar3 = qVar;
            arrayList2 = arrayList;
            kVar2 = kVar;
            z17 = z13;
            G = f13;
            f26 = f14;
            fArr3 = fArr;
            fArr4 = fArr2;
            pieChart3 = pieChart;
            f27 = f15;
        }
        ag.d.c(J2);
        canvas.restore();
    }

    @Override // zf.h
    public final void u() {
    }
}
