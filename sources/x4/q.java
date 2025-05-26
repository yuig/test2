package x4;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public float[] f131807a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f131808b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f131809c;

    /* renamed from: d, reason: collision with root package name */
    public Path f131810d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f131811e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f131812f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f131813g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f131814h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f131815i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f131816j;

    /* renamed from: k, reason: collision with root package name */
    public int f131817k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f131818l = new Rect();

    /* renamed from: m, reason: collision with root package name */
    public final int f131819m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f131820n;

    public q(MotionLayout motionLayout) {
        this.f131820n = motionLayout;
        Paint paint = new Paint();
        this.f131811e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f131812f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f131813g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f131814h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f131816j = new float[8];
        Paint paint5 = new Paint();
        this.f131815i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f131809c = new float[100];
        this.f131808b = new int[50];
    }

    public final void a(Canvas canvas, int i13, int i14, m mVar) {
        int i15;
        int i16;
        Paint paint;
        float f13;
        float f14;
        int i17;
        int[] iArr = this.f131808b;
        int i18 = 4;
        if (i13 == 4) {
            boolean z13 = false;
            boolean z14 = false;
            for (int i19 = 0; i19 < this.f131817k; i19++) {
                int i23 = iArr[i19];
                if (i23 == 1) {
                    z13 = true;
                }
                if (i23 == 0) {
                    z14 = true;
                }
            }
            if (z13) {
                float[] fArr = this.f131807a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f131813g);
            }
            if (z14) {
                b(canvas);
            }
        }
        if (i13 == 2) {
            float[] fArr2 = this.f131807a;
            canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f131813g);
        }
        if (i13 == 3) {
            b(canvas);
        }
        canvas.drawLines(this.f131807a, this.f131811e);
        View view = mVar.f131777b;
        if (view != null) {
            i15 = view.getWidth();
            i16 = mVar.f131777b.getHeight();
        } else {
            i15 = 0;
            i16 = 0;
        }
        int i24 = 1;
        while (i24 < i14 - 1) {
            if (i13 == i18 && iArr[i24 - 1] == 0) {
                i17 = i24;
            } else {
                int i25 = i24 * 2;
                float[] fArr3 = this.f131809c;
                float f15 = fArr3[i25];
                float f16 = fArr3[i25 + 1];
                this.f131810d.reset();
                this.f131810d.moveTo(f15, f16 + 10.0f);
                this.f131810d.lineTo(f15 + 10.0f, f16);
                this.f131810d.lineTo(f15, f16 - 10.0f);
                this.f131810d.lineTo(f15 - 10.0f, f16);
                this.f131810d.close();
                int i26 = i24 - 1;
                Paint paint2 = this.f131815i;
                if (i13 == i18) {
                    int i27 = iArr[i26];
                    if (i27 == 1) {
                        d(canvas, f15 - 0.0f, f16 - 0.0f);
                    } else if (i27 == 0) {
                        c(canvas, f15 - 0.0f, f16 - 0.0f);
                    } else if (i27 == 2) {
                        paint = paint2;
                        f13 = f16;
                        f14 = f15;
                        i17 = i24;
                        e(canvas, f15 - 0.0f, f16 - 0.0f, i15, i16);
                        canvas.drawPath(this.f131810d, paint);
                    }
                    paint = paint2;
                    f13 = f16;
                    f14 = f15;
                    i17 = i24;
                    canvas.drawPath(this.f131810d, paint);
                } else {
                    paint = paint2;
                    f13 = f16;
                    f14 = f15;
                    i17 = i24;
                }
                if (i13 == 2) {
                    d(canvas, f14 - 0.0f, f13 - 0.0f);
                }
                if (i13 == 3) {
                    c(canvas, f14 - 0.0f, f13 - 0.0f);
                }
                if (i13 == 6) {
                    e(canvas, f14 - 0.0f, f13 - 0.0f, i15, i16);
                }
                canvas.drawPath(this.f131810d, paint);
            }
            i24 = i17 + 1;
            i18 = 4;
        }
        float[] fArr4 = this.f131807a;
        if (fArr4.length > 1) {
            float f17 = fArr4[0];
            float f18 = fArr4[1];
            Paint paint3 = this.f131812f;
            canvas.drawCircle(f17, f18, 8.0f, paint3);
            float[] fArr5 = this.f131807a;
            canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    public final void b(Canvas canvas) {
        float[] fArr = this.f131807a;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[fArr.length - 2];
        float f16 = fArr[fArr.length - 1];
        float min = Math.min(f13, f15);
        float max = Math.max(f14, f16);
        float max2 = Math.max(f13, f15);
        float max3 = Math.max(f14, f16);
        Paint paint = this.f131813g;
        canvas.drawLine(min, max, max2, max3, paint);
        canvas.drawLine(Math.min(f13, f15), Math.min(f14, f16), Math.min(f13, f15), Math.max(f14, f16), paint);
    }

    public final void c(Canvas canvas, float f13, float f14) {
        float[] fArr = this.f131807a;
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[fArr.length - 2];
        float f18 = fArr[fArr.length - 1];
        float min = Math.min(f15, f17);
        float max = Math.max(f16, f18);
        float min2 = f13 - Math.min(f15, f17);
        float max2 = Math.max(f16, f18) - f14;
        String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f17 - f15)) + 0.5d)) / 100.0f);
        Paint paint = this.f131814h;
        paint.getTextBounds(str, 0, str.length(), this.f131818l);
        Rect rect = this.f131818l;
        canvas.drawText(str, ((min2 / 2.0f) - (rect.width() / 2)) + min, f14 - 20.0f, paint);
        float min3 = Math.min(f15, f17);
        Paint paint2 = this.f131813g;
        canvas.drawLine(f13, f14, min3, f14, paint2);
        String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f18 - f16)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), this.f131818l);
        canvas.drawText(str2, f13 + 5.0f, max - ((max2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f13, f14, f13, Math.max(f16, f18), paint2);
    }

    public final void d(Canvas canvas, float f13, float f14) {
        float[] fArr = this.f131807a;
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[fArr.length - 2];
        float f18 = fArr[fArr.length - 1];
        float hypot = (float) Math.hypot(f15 - f17, f16 - f18);
        float f19 = f17 - f15;
        float f23 = f18 - f16;
        float f24 = (((f14 - f16) * f23) + ((f13 - f15) * f19)) / (hypot * hypot);
        float f25 = f15 + (f19 * f24);
        float f26 = f16 + (f24 * f23);
        Path path = new Path();
        path.moveTo(f13, f14);
        path.lineTo(f25, f26);
        float hypot2 = (float) Math.hypot(f25 - f13, f26 - f14);
        String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
        Paint paint = this.f131814h;
        paint.getTextBounds(str, 0, str.length(), this.f131818l);
        canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f131818l.width() / 2), -20.0f, paint);
        canvas.drawLine(f13, f14, f25, f26, this.f131813g);
    }

    public final void e(Canvas canvas, float f13, float f14, int i13, int i14) {
        StringBuilder sb3 = new StringBuilder("");
        MotionLayout motionLayout = this.f131820n;
        sb3.append(((int) ((((f13 - (i13 / 2)) * 100.0f) / (motionLayout.getWidth() - i13)) + 0.5d)) / 100.0f);
        String sb4 = sb3.toString();
        Paint paint = this.f131814h;
        paint.getTextBounds(sb4, 0, sb4.length(), this.f131818l);
        Rect rect = this.f131818l;
        canvas.drawText(sb4, ((f13 / 2.0f) - (rect.width() / 2)) + 0.0f, f14 - 20.0f, paint);
        float min = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f131813g;
        canvas.drawLine(f13, f14, min, f14, paint2);
        String str = "" + (((int) ((((f14 - (i14 / 2)) * 100.0f) / (motionLayout.getHeight() - i14)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), this.f131818l);
        canvas.drawText(str, f13 + 5.0f, 0.0f - ((f14 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f13, f14, f13, Math.max(0.0f, 1.0f), paint2);
    }
}
