package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes3.dex */
public final class q0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public Rect f19075J;

    /* renamed from: a, reason: collision with root package name */
    public final float f19076a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19077b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19078c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19079d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19080e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f19081f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f19082g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19083h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f19084i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f19085j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f19086k;

    /* renamed from: l, reason: collision with root package name */
    public float f19087l;

    /* renamed from: m, reason: collision with root package name */
    public int f19088m;

    /* renamed from: n, reason: collision with root package name */
    public int f19089n;

    /* renamed from: o, reason: collision with root package name */
    public float f19090o;

    /* renamed from: p, reason: collision with root package name */
    public int f19091p;

    /* renamed from: q, reason: collision with root package name */
    public float f19092q;

    /* renamed from: r, reason: collision with root package name */
    public float f19093r;

    /* renamed from: s, reason: collision with root package name */
    public int f19094s;

    /* renamed from: t, reason: collision with root package name */
    public int f19095t;

    /* renamed from: u, reason: collision with root package name */
    public int f19096u;

    /* renamed from: v, reason: collision with root package name */
    public int f19097v;

    /* renamed from: w, reason: collision with root package name */
    public int f19098w;

    /* renamed from: x, reason: collision with root package name */
    public float f19099x;

    /* renamed from: y, reason: collision with root package name */
    public float f19100y;

    /* renamed from: z, reason: collision with root package name */
    public float f19101z;

    public q0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f19080e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f19079d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f19076a = round;
        this.f19077b = round;
        this.f19078c = round;
        TextPaint textPaint = new TextPaint();
        this.f19081f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f19082g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f19083h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z13) {
        if (!z13) {
            this.f19075J.getClass();
            this.f19086k.getClass();
            canvas.drawBitmap(this.f19086k, (Rect) null, this.f19075J, this.f19083h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f19096u) > 0) {
            Paint paint = this.f19082g;
            paint.setColor(this.f19096u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        }
        int i13 = this.f19098w;
        TextPaint textPaint = this.f19081f;
        if (i13 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f19076a);
            textPaint.setColor(this.f19097v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f13 = this.f19077b;
            if (i13 == 2) {
                float f14 = this.f19078c;
                textPaint.setShadowLayer(f13, f14, f14, this.f19097v);
            } else if (i13 == 3 || i13 == 4) {
                boolean z14 = i13 == 3;
                int i14 = z14 ? -1 : this.f19097v;
                int i15 = z14 ? this.f19097v : -1;
                float f15 = f13 / 2.0f;
                textPaint.setColor(this.f19094s);
                textPaint.setStyle(Paint.Style.FILL);
                float f16 = -f15;
                textPaint.setShadowLayer(f13, f16, f16, i14);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f13, f15, f15, i15);
            }
        }
        textPaint.setColor(this.f19094s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }
}
