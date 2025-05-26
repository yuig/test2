package va2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;

/* loaded from: classes4.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f125311a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125312b;

    /* renamed from: c, reason: collision with root package name */
    public final BitmapDrawable f125313c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125314d;

    /* renamed from: e, reason: collision with root package name */
    public final float f125315e;

    /* renamed from: f, reason: collision with root package name */
    public final float f125316f;

    /* renamed from: g, reason: collision with root package name */
    public final qb0.a f125317g;

    /* renamed from: h, reason: collision with root package name */
    public final tn1.c f125318h;

    /* renamed from: i, reason: collision with root package name */
    public final String f125319i;

    /* renamed from: j, reason: collision with root package name */
    public String f125320j;

    /* renamed from: k, reason: collision with root package name */
    public float f125321k;

    /* renamed from: l, reason: collision with root package name */
    public float f125322l;

    /* renamed from: m, reason: collision with root package name */
    public float f125323m;

    public b(Context context, c style, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f125311a = z13;
        this.f125312b = z14;
        this.f125313c = com.bumptech.glide.d.C(new rm1.d(new rm1.f(style.f125324a), style.f125325b, null, 0, null, 28), context);
        this.f125314d = context.getResources().getDimensionPixelSize(r0.lego_grid_cell_analytics_icon_size);
        this.f125315e = context.getResources().getDimension(r0.lego_grid_cell_analytics_icon_padding);
        this.f125316f = context.getResources().getDimension(r0.lego_grid_cell_analytics_text_padding);
        this.f125317g = new qb0.a();
        vn1.g gVar = vn1.g.BODY_100;
        this.f125318h = new tn1.c(context, new tn1.b(style.f125326c, e0.b(vn1.e.BOLD), gVar, 2));
        String string = context.getResources().getString(x0.creator_stats_empty_value);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f125319i = string;
        this.f125320j = string;
    }

    public final void a(String str) {
        if (str == null) {
            str = this.f125319i;
        }
        this.f125320j = str;
        this.f125323m = this.f125318h.measureText(str);
    }

    public final void b(int i13) {
        this.f125317g.getClass();
        String b13 = qb0.j.b(i13);
        this.f125320j = b13;
        this.f125323m = this.f125318h.measureText(b13);
    }

    public final void c(boolean z13) {
        this.f125311a = z13;
    }

    public final void d() {
        this.f125323m = this.f125318h.measureText(this.f125319i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        BitmapDrawable bitmapDrawable = this.f125313c;
        if (bitmapDrawable != null) {
            bitmapDrawable.draw(canvas);
        }
        canvas.drawText(this.f125320j, this.f125321k, this.f125322l, this.f125318h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        int i13;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        boolean z13 = this.f125312b;
        float f13 = this.f125315e;
        int i14 = this.f125314d;
        if (z13) {
            i13 = (int) (((bounds.right - bounds.left) / 2) - ((i14 + f13) + this.f125323m));
        } else {
            i13 = 0;
        }
        boolean z14 = this.f125311a;
        BitmapDrawable bitmapDrawable = this.f125313c;
        float f14 = this.f125316f;
        if (z14) {
            if (bitmapDrawable != null) {
                int i15 = bounds.right;
                int i16 = bounds.top;
                bitmapDrawable.setBounds((i15 - i14) - i13, i16, i15 - i13, i16 + i14);
            }
            this.f125321k = (bounds.right - ((i14 + f13) + this.f125323m)) - i13;
            this.f125322l = (bounds.top + i14) - f14;
            return;
        }
        if (bitmapDrawable != null) {
            int i17 = bounds.left;
            int i18 = bounds.top;
            bitmapDrawable.setBounds(i17 + i13, i18, i17 + i14 + i13, i18 + i14);
        }
        this.f125321k = bounds.left + i14 + f13 + i13;
        this.f125322l = (bounds.top + i14) - f14;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f125318h.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
