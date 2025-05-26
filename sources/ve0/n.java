package ve0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f125724a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f125725b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f125726c;

    /* renamed from: d, reason: collision with root package name */
    public final PointF f125727d;

    /* renamed from: e, reason: collision with root package name */
    public final float f125728e;

    /* renamed from: f, reason: collision with root package name */
    public final PointF f125729f;

    /* renamed from: g, reason: collision with root package name */
    public final PointF f125730g;

    /* renamed from: h, reason: collision with root package name */
    public final PointF f125731h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f125732i;

    public n(Rect rect, Rect rect2) {
        RectF rectF = new RectF();
        this.f125725b = rectF;
        RectF rectF2 = new RectF();
        this.f125726c = new PointF();
        this.f125727d = new PointF();
        PointF pointF = new PointF();
        this.f125729f = pointF;
        this.f125730g = new PointF();
        this.f125731h = new PointF();
        boolean z13 = rect != null;
        this.f125732i = z13;
        if (z13) {
            rectF.set(rect);
            float height = rect.height() * 0.5f;
            this.f125728e = height;
            pointF.set((rect.width() * 0.5f) + rect.left, rect.top + height);
        }
        rectF2.set(rect2);
    }
}
