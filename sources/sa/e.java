package sa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes3.dex */
public final class e extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final LinearInterpolator f112141g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    public static final q6.b f112142h = new q6.b();

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f112143i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    public final d f112144a;

    /* renamed from: b, reason: collision with root package name */
    public float f112145b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f112146c;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f112147d;

    /* renamed from: e, reason: collision with root package name */
    public float f112148e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112149f;

    public e(Context context) {
        context.getClass();
        this.f112146c = context.getResources();
        d dVar = new d();
        this.f112144a = dVar;
        int[] iArr = f112143i;
        dVar.f112128i = iArr;
        dVar.f112129j = 0;
        dVar.f112140u = iArr[0];
        dVar.f112127h = 2.5f;
        dVar.f112121b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(0, this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f112141g);
        ofFloat.addListener(new c(this, dVar));
        this.f112147d = ofFloat;
    }

    public static void b(float f13, d dVar) {
        if (f13 <= 0.75f) {
            dVar.f112140u = dVar.f112128i[dVar.f112129j];
            return;
        }
        float f14 = (f13 - 0.75f) / 0.25f;
        int[] iArr = dVar.f112128i;
        int i13 = dVar.f112129j;
        int i14 = iArr[i13];
        int i15 = iArr[(i13 + 1) % iArr.length];
        dVar.f112140u = ((((i14 >> 24) & 255) + ((int) ((((i15 >> 24) & 255) - r1) * f14))) << 24) | ((((i14 >> 16) & 255) + ((int) ((((i15 >> 16) & 255) - r3) * f14))) << 16) | ((((i14 >> 8) & 255) + ((int) ((((i15 >> 8) & 255) - r4) * f14))) << 8) | ((i14 & 255) + ((int) (f14 * ((i15 & 255) - r2))));
    }

    public final void a(float f13, d dVar, boolean z13) {
        float interpolation;
        float f14;
        if (this.f112149f) {
            b(f13, dVar);
            float floor = (float) (Math.floor(dVar.f112132m / 0.8f) + 1.0d);
            float f15 = dVar.f112130k;
            float f16 = dVar.f112131l;
            dVar.f112124e = (((f16 - 0.01f) - f15) * f13) + f15;
            dVar.f112125f = f16;
            float f17 = dVar.f112132m;
            dVar.f112126g = ep.b.a(floor, f17, f13, f17);
            return;
        }
        if (f13 != 1.0f || z13) {
            float f18 = dVar.f112132m;
            q6.b bVar = f112142h;
            if (f13 < 0.5f) {
                interpolation = dVar.f112130k;
                f14 = (bVar.getInterpolation(f13 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f19 = dVar.f112130k + 0.79f;
                interpolation = f19 - (((1.0f - bVar.getInterpolation((f13 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f14 = f19;
            }
            float f23 = (0.20999998f * f13) + f18;
            float f24 = (f13 + this.f112148e) * 216.0f;
            dVar.f112124e = interpolation;
            dVar.f112125f = f14;
            dVar.f112126g = f23;
            this.f112145b = f24;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f112145b, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f112144a;
        RectF rectF = dVar.f112120a;
        float f13 = dVar.f112136q;
        float f14 = (dVar.f112127h / 2.0f) + f13;
        if (f13 <= 0.0f) {
            f14 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f112137r * dVar.f112135p) / 2.0f, dVar.f112127h / 2.0f);
        }
        rectF.set(bounds.centerX() - f14, bounds.centerY() - f14, bounds.centerX() + f14, bounds.centerY() + f14);
        float f15 = dVar.f112124e;
        float f16 = dVar.f112126g;
        float f17 = (f15 + f16) * 360.0f;
        float f18 = ((dVar.f112125f + f16) * 360.0f) - f17;
        Paint paint = dVar.f112121b;
        paint.setColor(dVar.f112140u);
        paint.setAlpha(dVar.f112139t);
        float f19 = dVar.f112127h / 2.0f;
        rectF.inset(f19, f19);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f112123d);
        float f23 = -f19;
        rectF.inset(f23, f23);
        canvas.drawArc(rectF, f17, f18, false, paint);
        if (dVar.f112133n) {
            Path path = dVar.f112134o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f112134o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f24 = (dVar.f112137r * dVar.f112135p) / 2.0f;
            dVar.f112134o.moveTo(0.0f, 0.0f);
            dVar.f112134o.lineTo(dVar.f112137r * dVar.f112135p, 0.0f);
            Path path3 = dVar.f112134o;
            float f25 = dVar.f112137r;
            float f26 = dVar.f112135p;
            path3.lineTo((f25 * f26) / 2.0f, dVar.f112138s * f26);
            dVar.f112134o.offset((rectF.centerX() + min) - f24, (dVar.f112127h / 2.0f) + rectF.centerY());
            dVar.f112134o.close();
            Paint paint2 = dVar.f112122c;
            paint2.setColor(dVar.f112140u);
            paint2.setAlpha(dVar.f112139t);
            canvas.save();
            canvas.rotate(f17 + f18, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f112134o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f112144a.f112139t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f112147d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f112144a.f112139t = i13;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f112144a.f112121b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f112147d.cancel();
        d dVar = this.f112144a;
        float f13 = dVar.f112124e;
        dVar.f112130k = f13;
        float f14 = dVar.f112125f;
        dVar.f112131l = f14;
        dVar.f112132m = dVar.f112126g;
        if (f14 != f13) {
            this.f112149f = true;
            this.f112147d.setDuration(666L);
            this.f112147d.start();
            return;
        }
        dVar.f112129j = 0;
        dVar.f112140u = dVar.f112128i[0];
        dVar.f112130k = 0.0f;
        dVar.f112131l = 0.0f;
        dVar.f112132m = 0.0f;
        dVar.f112124e = 0.0f;
        dVar.f112125f = 0.0f;
        dVar.f112126g = 0.0f;
        this.f112147d.setDuration(1332L);
        this.f112147d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f112147d.cancel();
        this.f112145b = 0.0f;
        d dVar = this.f112144a;
        if (dVar.f112133n) {
            dVar.f112133n = false;
        }
        dVar.f112129j = 0;
        dVar.f112140u = dVar.f112128i[0];
        dVar.f112130k = 0.0f;
        dVar.f112131l = 0.0f;
        dVar.f112132m = 0.0f;
        dVar.f112124e = 0.0f;
        dVar.f112125f = 0.0f;
        dVar.f112126g = 0.0f;
        invalidateSelf();
    }
}
