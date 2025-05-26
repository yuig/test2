package ve0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes5.dex */
public final class i extends h {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f125706l;

    /* renamed from: m, reason: collision with root package name */
    public final float f125707m;

    /* renamed from: n, reason: collision with root package name */
    public final float f125708n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13, int i14, int i15, float f13, float f14, float f15, int i16, int i17) {
        super(i13, i14, i15, f13, i16, i16);
        this.f125706l = i17;
        this.f125707m = f14;
        this.f125708n = f15;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f13 = this.f125708n;
        Paint paint = this.f125702f;
        float f14 = this.f125707m;
        int i13 = this.f125706l;
        int i14 = this.f125701e;
        int i15 = this.f125699c;
        int i16 = this.f125700d;
        switch (i13) {
            case 0:
                Rect bounds = getBounds();
                float centerX = bounds.centerX();
                float centerY = bounds.centerY();
                float min = Math.min(bounds.width(), bounds.height()) * 0.5f;
                paint.setColor(i16);
                canvas.drawCircle(centerX, centerY, min, paint);
                float f15 = f14 * 0.5f;
                float f16 = f13 * 0.5f;
                paint.setColor(i15);
                float f17 = centerX + f15;
                canvas.drawLine(centerX - f15, centerY, f17, centerY, paint);
                canvas.drawLine(centerX, centerY - f16, f17, centerY, paint);
                canvas.drawLine(centerX, centerY + f16, f17, centerY, paint);
                if (this.f125705i) {
                    paint.setColor(i14);
                    canvas.drawCircle(centerX, centerY, min, paint);
                    break;
                }
                break;
            default:
                Rect bounds2 = getBounds();
                float centerX2 = bounds2.centerX();
                float centerY2 = bounds2.centerY();
                float min2 = (Math.min(bounds2.width(), bounds2.height()) * 0.5f) - f14;
                paint.setColor(i16);
                canvas.drawCircle(centerX2, centerY2, min2, paint);
                paint.setColor(i15);
                float f18 = centerX2 - f13;
                float f19 = centerY2 - f13;
                float f23 = centerX2 + f13;
                float f24 = centerY2 + f13;
                canvas.drawLine(f18, f19, f23, f24, paint);
                canvas.drawLine(f18, f24, f23, f19, paint);
                if (this.f125705i) {
                    paint.setColor(i14);
                    canvas.drawCircle(centerX2, centerY2, min2, paint);
                    break;
                }
                break;
        }
    }
}
