package wa2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes4.dex */
public final class j0 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f128822a;

    /* renamed from: b, reason: collision with root package name */
    public final tn1.c f128823b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f128824c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f128825d;

    /* renamed from: e, reason: collision with root package name */
    public final int f128826e;

    /* renamed from: f, reason: collision with root package name */
    public final float f128827f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f128828g;

    /* renamed from: h, reason: collision with root package name */
    public String f128829h;

    /* renamed from: i, reason: collision with root package name */
    public float f128830i;

    /* renamed from: j, reason: collision with root package name */
    public float f128831j;

    /* renamed from: k, reason: collision with root package name */
    public float f128832k;

    /* renamed from: l, reason: collision with root package name */
    public float f128833l;

    /* renamed from: m, reason: collision with root package name */
    public float f128834m;

    /* renamed from: n, reason: collision with root package name */
    public float f128835n;

    public j0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        this.f128822a = resources;
        this.f128823b = new tn1.c(context, new tn1.b(vn1.c.LIGHT, (List) null, vn1.g.BODY_100, 6));
        Paint paint = new Paint();
        paint.setColor(dl2.b.x0(context, eo1.a.sema_color_background_wash_dark));
        this.f128824c = paint;
        this.f128825d = new Rect();
        this.f128826e = resources.getDimensionPixelSize(r0.margin_half);
        this.f128827f = resources.getDimensionPixelOffset(sc2.b.video_background_radius);
        int i13 = sm1.b.ic_camera_video_gestalt;
        Object obj = d5.a.f53679a;
        this.f128828g = context.getDrawable(i13);
        this.f128829h = "";
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = new RectF(this.f128830i, this.f128831j, this.f128832k, this.f128833l);
        Paint paint = this.f128824c;
        float f13 = this.f128827f;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        Drawable drawable = this.f128828g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.drawText(this.f128829h, this.f128834m, this.f128835n, this.f128823b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable drawable = this.f128828g;
        if (drawable == null) {
            return;
        }
        int i13 = bounds.bottom - bounds.top;
        Resources resources = this.f128822a;
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int K = pk.a0.K(4, resources);
        String str = this.f128829h;
        int length = str.length();
        this.f128823b.getTextBounds(str, 0, length, this.f128825d);
        int i14 = this.f128826e;
        this.f128830i = i14;
        this.f128831j = i13 - ((i14 * 3) + drawable.getIntrinsicHeight());
        this.f128832k = (K * 5) + r6.width() + drawable.getIntrinsicWidth() + i14;
        this.f128833l = i13 - i14;
        int i15 = (K * 2) + i14;
        int i16 = i14 * 2;
        drawable.setBounds(i15, i13 - (drawable.getIntrinsicHeight() + i16), drawable.getIntrinsicWidth() + i15, i13 - i16);
        this.f128834m = r5 + K;
        this.f128835n = (r6.height() / 2) + (r1 - (drawable.getIntrinsicHeight() / 2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
