package va2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import hs1.q;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes4.dex */
public final class d extends wa2.l {

    /* renamed from: l, reason: collision with root package name */
    public final q f125327l;

    /* renamed from: m, reason: collision with root package name */
    public final int f125328m;

    /* renamed from: n, reason: collision with root package name */
    public final int f125329n;

    /* renamed from: o, reason: collision with root package name */
    public final int f125330o;

    /* renamed from: p, reason: collision with root package name */
    public final int f125331p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f125332q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f125333r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f125334s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f125335t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f125336u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, q imageCache) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.f125327l = imageCache;
        this.f125328m = context.getResources().getDimensionPixelSize(r0.attribution_badge_image_height);
        this.f125329n = context.getResources().getDimensionPixelSize(r0.attribution_badge_horizontal_padding);
        this.f125330o = context.getResources().getDimensionPixelSize(r0.attribution_badge_vertical_padding);
        this.f125331p = dl2.b.T1(context) ? dl2.b.F0(context, eo1.a.comp_iconbutton_sm_rounding) : context.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        Paint paint = new Paint(1);
        paint.setColor(dl2.b.x0(context, eo1.a.sema_color_background_wash_light));
        this.f125332q = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.f125335t = paint2;
        new Rect();
        this.f125336u = new Rect();
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        this.f125334s = false;
        this.f125333r = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.f125333r;
        if (bitmap != null) {
            Rect rect = this.f125336u;
            RectF rectF = new RectF(rect.left, rect.top, rect.right, rect.bottom);
            canvas.save();
            float f13 = this.f125331p;
            canvas.drawRoundRect(rectF, f13, f13, this.f125332q);
            canvas.restore();
            int i13 = this.f125328m;
            int i14 = rect.left + this.f125329n;
            int i15 = rect.top + this.f125330o;
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(i14, i15, ((int) (i13 * (bitmap.getWidth() / bitmap.getHeight()))) + i14, i13 + i15), this.f125335t);
        }
    }

    public final void h(String url, hs1.o bitmapListener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmapListener, "bitmapListener");
        this.f125334s = true;
        ((hs1.m) this.f125327l).k(url, new mp0.b(5, this, bitmapListener), null, null);
    }

    public final void i() {
        Bitmap bitmap;
        if (!this.f125334s || (bitmap = this.f125333r) == null) {
            e(0);
            f(0);
            return;
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        int i13 = this.f125328m;
        int i14 = (this.f125330o * 2) + i13;
        int i15 = (this.f125329n * 2) + ((int) (i13 * width));
        e(i14);
        f(i15);
    }

    public final void j(int i13, int i14, int i15, int i16) {
        setBounds(i13, i14, i15, i16);
        Rect rect = this.f125336u;
        rect.left = i13;
        rect.top = i14;
        rect.right = i15;
        rect.bottom = i16;
    }

    public final void k(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f125334s = true;
        this.f125333r = tb.f.j0(drawable, 0, 0, 7);
    }

    public final void l(int i13, int i14, int i15, int i16) {
        setBounds(i13, i14, i15, i16);
        Rect rect = this.f125336u;
        rect.left = i13;
        rect.top = i14;
        rect.right = i15;
        rect.bottom = i16;
    }
}
