package ve0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f125680a;

    /* renamed from: b, reason: collision with root package name */
    public float f125681b;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f125683d;

    /* renamed from: f, reason: collision with root package name */
    public final d f125685f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125684e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f125686g = false;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f125682c = new RectF();

    public e(Paint paint, Paint paint2, d dVar) {
        this.f125680a = paint;
        this.f125681b = dVar.f125677a;
        this.f125683d = paint2;
        this.f125685f = dVar;
    }

    public final RectF a() {
        return this.f125682c;
    }

    public final void b(Rect rect) {
        this.f125682c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f125681b = this.f125685f.f125677a;
    }

    public final void c(Canvas canvas) {
        Paint paint;
        boolean z13 = this.f125684e;
        RectF rectF = this.f125682c;
        if (z13 && (paint = this.f125683d) != null) {
            float f13 = this.f125681b;
            canvas.drawRoundRect(rectF, f13, f13, paint);
        }
        float f14 = this.f125681b;
        canvas.drawRoundRect(rectF, f14, f14, this.f125680a);
    }

    public final void d(float f13) {
        this.f125681b = f13;
    }

    public final void e(boolean z13) {
        this.f125684e = z13;
        d dVar = this.f125685f;
        RectF rectF = this.f125682c;
        if (z13 && !this.f125686g) {
            rectF.set(rectF.left + dVar.f125678b, rectF.top, rectF.right, rectF.bottom);
            this.f125686g = true;
        } else {
            if (z13 || !this.f125686g) {
                return;
            }
            rectF.set(rectF.left - dVar.f125678b, rectF.top, rectF.right, rectF.bottom);
            this.f125686g = false;
        }
    }
}
