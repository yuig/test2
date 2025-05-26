package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import kh2.n3;
import x4.a;
import y4.e;

/* loaded from: classes3.dex */
public class MotionLabel extends View implements a {
    public float A;
    public float B;
    public Drawable C;
    public Matrix D;
    public Bitmap E;
    public BitmapShader F;
    public Matrix G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f17609J;
    public float K;
    public final Paint L;
    public int M;
    public Rect N;
    public Paint O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f17610a;

    /* renamed from: b, reason: collision with root package name */
    public Path f17611b;

    /* renamed from: c, reason: collision with root package name */
    public int f17612c;

    /* renamed from: d, reason: collision with root package name */
    public int f17613d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17614e;

    /* renamed from: f, reason: collision with root package name */
    public float f17615f;

    /* renamed from: g, reason: collision with root package name */
    public float f17616g;

    /* renamed from: h, reason: collision with root package name */
    public e f17617h;

    /* renamed from: i, reason: collision with root package name */
    public RectF f17618i;

    /* renamed from: j, reason: collision with root package name */
    public float f17619j;

    /* renamed from: k, reason: collision with root package name */
    public float f17620k;

    /* renamed from: l, reason: collision with root package name */
    public int f17621l;

    /* renamed from: m, reason: collision with root package name */
    public int f17622m;

    /* renamed from: n, reason: collision with root package name */
    public float f17623n;

    /* renamed from: o, reason: collision with root package name */
    public String f17624o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17625p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f17626q;

    /* renamed from: r, reason: collision with root package name */
    public int f17627r;

    /* renamed from: s, reason: collision with root package name */
    public int f17628s;

    /* renamed from: t, reason: collision with root package name */
    public int f17629t;

    /* renamed from: u, reason: collision with root package name */
    public int f17630u;

    /* renamed from: v, reason: collision with root package name */
    public String f17631v;

    /* renamed from: w, reason: collision with root package name */
    public int f17632w;

    /* renamed from: x, reason: collision with root package name */
    public int f17633x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17634y;

    /* renamed from: z, reason: collision with root package name */
    public float f17635z;

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17610a = new TextPaint();
        this.f17611b = new Path();
        this.f17612c = 65535;
        this.f17613d = 65535;
        this.f17614e = false;
        this.f17615f = 0.0f;
        this.f17616g = Float.NaN;
        this.f17619j = 48.0f;
        this.f17620k = Float.NaN;
        this.f17623n = 0.0f;
        this.f17624o = "Hello World";
        this.f17625p = true;
        this.f17626q = new Rect();
        this.f17627r = 1;
        this.f17628s = 1;
        this.f17629t = 1;
        this.f17630u = 1;
        this.f17632w = 8388659;
        this.f17633x = 0;
        this.f17634y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.f17609J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        e(context, attributeSet);
    }

    public final void a(float f13, float f14, float f15, float f16) {
        if (this.G == null) {
            return;
        }
        this.A = f15 - f13;
        this.B = f16 - f14;
        float f17 = Float.isNaN(this.Q) ? 0.0f : this.Q;
        float f18 = Float.isNaN(this.R) ? 0.0f : this.R;
        float f19 = Float.isNaN(this.S) ? 1.0f : this.S;
        float f23 = Float.isNaN(this.T) ? 0.0f : this.T;
        this.G.reset();
        float width = this.E.getWidth();
        float height = this.E.getHeight();
        float f24 = Float.isNaN(this.I) ? this.A : this.I;
        float f25 = Float.isNaN(this.H) ? this.B : this.H;
        float f26 = f19 * (width * f25 < height * f24 ? f24 / width : f25 / height);
        this.G.postScale(f26, f26);
        float f27 = width * f26;
        float f28 = f24 - f27;
        float f29 = f26 * height;
        float f33 = f25 - f29;
        if (!Float.isNaN(this.H)) {
            f33 = this.H / 2.0f;
        }
        if (!Float.isNaN(this.I)) {
            f28 = this.I / 2.0f;
        }
        this.G.postTranslate((((f17 * f28) + f24) - f27) * 0.5f, (((f18 * f33) + f25) - f29) * 0.5f);
        this.G.postRotate(f23, f24 / 2.0f, f25 / 2.0f);
        this.F.setLocalMatrix(this.G);
    }

    public final void b(float f13) {
        if (this.f17614e || f13 != 1.0f) {
            this.f17611b.reset();
            String str = this.f17624o;
            int length = str.length();
            TextPaint textPaint = this.f17610a;
            Rect rect = this.f17626q;
            textPaint.getTextBounds(str, 0, length, rect);
            this.f17610a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f17611b);
            if (f13 != 1.0f) {
                Log.v("MotionLabel", n3.u() + " scale " + f13);
                Matrix matrix = new Matrix();
                matrix.postScale(f13, f13);
                this.f17611b.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f17625p = false;
        }
    }

    public final float c() {
        float f13 = Float.isNaN(this.f17620k) ? 1.0f : this.f17619j / this.f17620k;
        String str = this.f17624o;
        return ((this.f17609J + 1.0f) * ((((Float.isNaN(this.A) ? getMeasuredWidth() : this.A) - getPaddingLeft()) - getPaddingRight()) - (this.f17610a.measureText(str, 0, str.length()) * f13))) / 2.0f;
    }

    public final float d() {
        float f13 = Float.isNaN(this.f17620k) ? 1.0f : this.f17619j / this.f17620k;
        Paint.FontMetrics fontMetrics = this.f17610a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.B) ? getMeasuredHeight() : this.B) - getPaddingTop()) - getPaddingBottom();
        float f14 = fontMetrics.descent;
        float f15 = fontMetrics.ascent;
        return (((1.0f - this.K) * (measuredHeight - ((f14 - f15) * f13))) / 2.0f) - (f13 * f15);
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.utils.widget.MotionLabel.e(android.content.Context, android.util.AttributeSet):void");
    }

    public final void f(float f13, float f14, float f15, float f16) {
        int i13 = (int) (f13 + 0.5f);
        this.f17635z = f13 - i13;
        int i14 = (int) (f15 + 0.5f);
        int i15 = i14 - i13;
        int i16 = (int) (f16 + 0.5f);
        int i17 = (int) (0.5f + f14);
        int i18 = i16 - i17;
        float f17 = f15 - f13;
        this.A = f17;
        float f18 = f16 - f14;
        this.B = f18;
        a(f13, f14, f15, f16);
        if (getMeasuredHeight() == i18 && getMeasuredWidth() == i15) {
            super.layout(i13, i17, i14, i16);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
            super.layout(i13, i17, i14, i16);
        }
        if (this.f17634y) {
            Rect rect = this.N;
            TextPaint textPaint = this.f17610a;
            if (rect == null) {
                this.O = new Paint();
                this.N = new Rect();
                this.O.set(textPaint);
                this.P = this.O.getTextSize();
            }
            this.A = f17;
            this.B = f18;
            Paint paint = this.O;
            String str = this.f17624o;
            paint.getTextBounds(str, 0, str.length(), this.N);
            float height = this.N.height() * 1.3f;
            float f19 = (f17 - this.f17628s) - this.f17627r;
            float f23 = (f18 - this.f17630u) - this.f17629t;
            float width = this.N.width();
            if (width * f23 > height * f19) {
                textPaint.setTextSize((this.P * f19) / width);
            } else {
                textPaint.setTextSize((this.P * f23) / height);
            }
            if (this.f17614e || !Float.isNaN(this.f17620k)) {
                b(Float.isNaN(this.f17620k) ? 1.0f : this.f17619j / this.f17620k);
            }
        }
    }

    public final void g(float f13) {
        boolean z13 = this.f17615f != f13;
        this.f17615f = f13;
        if (f13 != 0.0f) {
            if (this.f17611b == null) {
                this.f17611b = new Path();
            }
            if (this.f17618i == null) {
                this.f17618i = new RectF();
            }
            if (this.f17617h == null) {
                e eVar = new e(this, 0);
                this.f17617h = eVar;
                setOutlineProvider(eVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f17615f) / 2.0f;
            this.f17618i.set(0.0f, 0.0f, width, height);
            this.f17611b.reset();
            this.f17611b.addRoundRect(this.f17618i, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z13) {
            invalidateOutline();
        }
    }

    public final void h(Typeface typeface) {
        TextPaint textPaint = this.f17610a;
        if (textPaint.getTypeface() != typeface) {
            textPaint.setTypeface(typeface);
        }
    }

    @Override // android.view.View
    public final void layout(int i13, int i14, int i15, int i16) {
        super.layout(i13, i14, i15, i16);
        boolean isNaN = Float.isNaN(this.f17620k);
        float f13 = isNaN ? 1.0f : this.f17619j / this.f17620k;
        this.A = i15 - i13;
        this.B = i16 - i14;
        if (this.f17634y) {
            Rect rect = this.N;
            TextPaint textPaint = this.f17610a;
            if (rect == null) {
                this.O = new Paint();
                this.N = new Rect();
                this.O.set(textPaint);
                this.P = this.O.getTextSize();
            }
            Paint paint = this.O;
            String str = this.f17624o;
            paint.getTextBounds(str, 0, str.length(), this.N);
            int width = this.N.width();
            int height = (int) (this.N.height() * 1.3f);
            float f14 = (this.A - this.f17628s) - this.f17627r;
            float f15 = (this.B - this.f17630u) - this.f17629t;
            if (isNaN) {
                float f16 = width;
                float f17 = height;
                if (f16 * f15 > f17 * f14) {
                    textPaint.setTextSize((this.P * f14) / f16);
                } else {
                    textPaint.setTextSize((this.P * f15) / f17);
                }
            } else {
                float f18 = width;
                float f19 = height;
                f13 = f18 * f15 > f19 * f14 ? f14 / f18 : f15 / f19;
            }
        }
        if (this.f17614e || !isNaN) {
            a(i13, i14, i15, i16);
            b(f13);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f13 = Float.isNaN(this.f17620k) ? 1.0f : this.f17619j / this.f17620k;
        super.onDraw(canvas);
        boolean z13 = this.f17614e;
        TextPaint textPaint = this.f17610a;
        if (!z13 && f13 == 1.0f) {
            canvas.drawText(this.f17624o, this.f17635z + c() + this.f17627r, d() + this.f17629t, textPaint);
            return;
        }
        if (this.f17625p) {
            b(f13);
        }
        if (this.D == null) {
            this.D = new Matrix();
        }
        if (!this.f17614e) {
            float c13 = c() + this.f17627r;
            float d2 = d() + this.f17629t;
            this.D.reset();
            this.D.preTranslate(c13, d2);
            this.f17611b.transform(this.D);
            textPaint.setColor(this.f17612c);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.f17623n);
            canvas.drawPath(this.f17611b, textPaint);
            this.D.reset();
            this.D.preTranslate(-c13, -d2);
            this.f17611b.transform(this.D);
            return;
        }
        Paint paint = this.L;
        paint.set(textPaint);
        this.D.reset();
        float c14 = c() + this.f17627r;
        float d13 = d() + this.f17629t;
        this.D.postTranslate(c14, d13);
        this.D.preScale(f13, f13);
        this.f17611b.transform(this.D);
        if (this.F != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.F);
        } else {
            textPaint.setColor(this.f17612c);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.f17623n);
        canvas.drawPath(this.f17611b, textPaint);
        if (this.F != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.f17613d);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.f17623n);
        canvas.drawPath(this.f17611b, textPaint);
        this.D.reset();
        this.D.postTranslate(-c14, -d13);
        this.f17611b.transform(this.D);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        this.f17634y = false;
        this.f17627r = getPaddingLeft();
        this.f17628s = getPaddingRight();
        this.f17629t = getPaddingTop();
        this.f17630u = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            String str = this.f17624o;
            int length = str.length();
            this.f17610a.getTextBounds(str, 0, length, this.f17626q);
            if (mode != 1073741824) {
                size = (int) (r7.width() + 0.99999f);
            }
            size += this.f17627r + this.f17628s;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (r6.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f17629t + this.f17630u + fontMetricsInt;
            }
        } else if (this.f17633x != 0) {
            this.f17634y = true;
        }
        setMeasuredDimension(size, size2);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17610a = new TextPaint();
        this.f17611b = new Path();
        this.f17612c = 65535;
        this.f17613d = 65535;
        this.f17614e = false;
        this.f17615f = 0.0f;
        this.f17616g = Float.NaN;
        this.f17619j = 48.0f;
        this.f17620k = Float.NaN;
        this.f17623n = 0.0f;
        this.f17624o = "Hello World";
        this.f17625p = true;
        this.f17626q = new Rect();
        this.f17627r = 1;
        this.f17628s = 1;
        this.f17629t = 1;
        this.f17630u = 1;
        this.f17632w = 8388659;
        this.f17633x = 0;
        this.f17634y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.f17609J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        e(context, attributeSet);
    }
}
