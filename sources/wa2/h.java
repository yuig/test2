package wa2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import m60.r0;

/* loaded from: classes4.dex */
public final class h extends Drawable {

    /* renamed from: k, reason: collision with root package name */
    public static final int f128744k = (int) bs1.c.T(r0.corner_radius_large);

    /* renamed from: l, reason: collision with root package name */
    public static float f128745l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public static final int f128746m;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f128747a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f128748b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f128749c;

    /* renamed from: d, reason: collision with root package name */
    public StaticLayout f128750d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f128751e;

    /* renamed from: f, reason: collision with root package name */
    public String f128752f;

    /* renamed from: g, reason: collision with root package name */
    public final String f128753g;

    /* renamed from: h, reason: collision with root package name */
    public final String f128754h;

    /* renamed from: i, reason: collision with root package name */
    public int f128755i = f128744k;

    /* renamed from: j, reason: collision with root package name */
    public int f128756j = -1;

    static {
        int i13 = f02.d.imageless_pin_description_max_lines;
        Context context = kb0.a.f79058b;
        f128746m = m60.f0.X().getResources().getInteger(i13);
    }

    public h(int i13, Context context, String str, String str2) {
        int x03 = dl2.b.x0(context, eo1.a.base_color_grayscale_0);
        this.f128752f = str2;
        this.f128753g = str2;
        this.f128754h = str;
        Paint paint = new Paint();
        this.f128749c = paint;
        paint.setColor(i13);
        int round = Math.round(f128745l * 21.0f);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(x03);
        Paint.Style style = Paint.Style.FILL;
        textPaint.setStyle(style);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(round);
        this.f128747a = textPaint;
        int round2 = Math.round(f128745l * 64.0f);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(x03);
        textPaint2.setStyle(style);
        textPaint2.setTypeface(typeface);
        textPaint2.setTextSize(round2);
        this.f128748b = textPaint2;
        a(true);
        this.f128751e = new RectF(0.0f, 0.0f, 640.0f, 640.0f);
    }

    public final void a(boolean z13) {
        int i13;
        StaticLayout staticLayout = new StaticLayout(this.f128752f, this.f128748b, Math.round(f128745l * 560.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f128750d = staticLayout;
        int lineCount = staticLayout.getLineCount();
        if (!z13 || lineCount <= (i13 = f128746m)) {
            return;
        }
        this.f128752f = bs1.c.q2(Math.min(this.f128752f.length(), this.f128750d.getLineStart(i13) - 3), this.f128752f);
        a(false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.f128751e;
        float f13 = this.f128755i;
        canvas.drawRoundRect(rectF, f13, f13, this.f128749c);
        canvas.save();
        int i13 = this.f128756j;
        if (i13 == -1) {
            float f14 = f128745l;
            canvas.translate(40.0f * f14, f14 * 60.0f);
        } else {
            canvas.translate(i13, i13);
        }
        canvas.drawText(this.f128754h, 0.0f, 0.0f, this.f128747a);
        canvas.translate(0.0f, 8.0f);
        StaticLayout staticLayout = this.f128750d;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float width = rect.width();
        f128745l = width / 640.0f;
        this.f128747a.setTextSize(Math.round(r1 * 21.0f));
        this.f128748b.setTextSize(Math.round(f128745l * 64.0f));
        this.f128752f = this.f128753g;
        a(true);
        RectF rectF = this.f128751e;
        rectF.right = width;
        rectF.bottom = rect.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
