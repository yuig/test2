package ve0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class o extends f implements Drawable.Callback {

    /* renamed from: i, reason: collision with root package name */
    public final Path f125733i;

    /* renamed from: j, reason: collision with root package name */
    public final i f125734j;

    /* renamed from: k, reason: collision with root package name */
    public final i f125735k;

    /* renamed from: l, reason: collision with root package name */
    public final n f125736l;

    /* renamed from: m, reason: collision with root package name */
    public final int f125737m;

    public o(int i13, int i14, int i15, m mVar) {
        super(i13, mVar.f125722h, -1);
        this.f125733i = new Path();
        float f13 = mVar.f125715a;
        if (mVar.f125723i) {
            i iVar = new i(i14, i13, i15, mVar.f125716b, mVar.f125717c, mVar.f125718d, (int) f13, 1);
            this.f125734j = iVar;
            iVar.setCallback(this);
        } else {
            this.f125734j = null;
        }
        i iVar2 = new i(i13, i14, i15, mVar.f125716b, mVar.f125719e, mVar.f125720f, (int) f13, 0);
        this.f125735k = iVar2;
        iVar2.setCallback(this);
        i iVar3 = this.f125734j;
        this.f125736l = new n(iVar3 != null ? iVar3.getBounds() : null, iVar2.getBounds());
        this.f125737m = mVar.f125721g;
    }

    @Override // ve0.f
    public final boolean a(Drawable drawable) {
        return drawable == this.f125734j || drawable == this.f125735k;
    }

    @Override // ve0.f
    public final void b(Rect rect) {
        Rect rect2 = rect;
        Path path = this.f125733i;
        n nVar = this.f125736l;
        boolean z13 = nVar.f125732i;
        RectF rectF = nVar.f125724a;
        PointF pointF = nVar.f125727d;
        PointF pointF2 = nVar.f125726c;
        if (z13) {
            float height = rect.height() * 0.5f;
            pointF2.set(rect2.right - height, rect2.top);
            pointF.set(rect2.left + height, rect2.bottom);
            rectF.set(rect2.left, rect2.top, rect.height() + r13, rect2.bottom);
            PointF pointF3 = new PointF();
            PointF pointF4 = new PointF();
            PointF pointF5 = nVar.f125731h;
            PointF pointF6 = nVar.f125729f;
            pointF5.set(pointF6.x - (rect2.left + height), (rect2.top + height) - pointF6.y);
            PointF pointF7 = nVar.f125730g;
            double d2 = pointF5.x - pointF7.x;
            double d13 = pointF5.y - pointF7.y;
            double d14 = (d13 * d13) + (d2 * d2);
            double sqrt = Math.sqrt(d14);
            double d15 = height + nVar.f125728e;
            if (sqrt <= d15 && sqrt != 0.0d && sqrt >= Math.abs(height - r8)) {
                char c13 = sqrt == d15 ? (char) 1 : (char) 2;
                double d16 = ((r6 - (r8 * r8)) + d14) / (2.0d * sqrt);
                float f13 = (float) (((d2 * d16) / sqrt) + pointF7.x);
                float f14 = (float) (((d13 * d16) / sqrt) + pointF7.y);
                double sqrt2 = Math.sqrt((height * height) - (d16 * d16));
                float f15 = (float) ((d13 * sqrt2) / sqrt);
                float f16 = (float) ((d2 * sqrt2) / sqrt);
                pointF3.set(f13 - f15, f14 + f16);
                pointF4.set(f13 + f15, f14 - f16);
                if (c13 >= 2) {
                    if (pointF3.y > pointF4.y) {
                        pointF4 = pointF3;
                        pointF3 = pointF4;
                    }
                    float degrees = ((float) Math.toDegrees(Math.acos((-pointF3.x) / height))) + 90.0f;
                    float degrees2 = ((float) Math.toDegrees(Math.acos((-pointF4.x) / height))) + 180.0f;
                    float degrees3 = (float) Math.toDegrees(Math.acos(pointF4.y / height));
                    float degrees4 = ((float) Math.toDegrees(Math.acos((pointF5.y - pointF3.y) / r8))) + 90.0f;
                    float degrees5 = ((float) Math.toDegrees(Math.acos((pointF4.x - pointF5.x) / r8))) + degrees4;
                    path.reset();
                    path.moveTo(pointF.x, pointF.y);
                    path.arcTo(rectF, 90.0f, degrees);
                    path.arcTo(nVar.f125725b, degrees4, -degrees5);
                    path.arcTo(rectF, degrees2, degrees3);
                    path.lineTo(pointF2.x, pointF2.y);
                    rect2 = rect;
                    rectF.offsetTo(rect2.right - rect.height(), 0.0f);
                    path.arcTo(rectF, -90.0f, 180.0f);
                    path.lineTo(pointF.x, pointF.y);
                    path.close();
                }
            }
            rect2 = rect;
        } else {
            float height2 = rect.height() * 0.5f;
            pointF2.set(rect2.right - height2, rect2.top);
            pointF.set(rect2.left + height2, rect2.bottom);
            rectF.set(rect2.left, rect2.top, rect.height() + r2, rect2.bottom);
            path.reset();
            path.moveTo(pointF.x, pointF.y);
            path.arcTo(rectF, 90.0f, 180.0f);
            path.lineTo(pointF2.x, pointF2.y);
            rectF.offsetTo(rect2.right - rect.height(), 0.0f);
            path.arcTo(rectF, -90.0f, 180.0f);
            path.lineTo(pointF.x, pointF.y);
            path.close();
        }
        Rect bounds = this.f125735k.getBounds();
        bounds.offsetTo((rect2.right - bounds.width()) - this.f125737m, rect.centerY() - (bounds.height() / 2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f125733i, this.f125687a);
        i iVar = this.f125734j;
        if (iVar != null) {
            iVar.draw(canvas);
        }
        this.f125735k.draw(canvas);
    }

    public final boolean f(int i13, PointF pointF) {
        i iVar = this.f125734j;
        boolean z13 = iVar != null && iVar.a(i13, pointF);
        return !z13 ? this.f125735k.a(i13, pointF) : z13;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j13) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j13);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
