package wa2;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import m60.q0;
import m60.r0;

/* loaded from: classes2.dex */
public abstract class l extends Drawable {

    /* renamed from: j, reason: collision with root package name */
    public static final int f128836j = (int) bs1.c.T(r0.pin_grid_min_title_width);

    /* renamed from: k, reason: collision with root package name */
    public static final int f128837k = (int) bs1.c.T(eo1.c.spacer);

    /* renamed from: a, reason: collision with root package name */
    public boolean f128838a;

    /* renamed from: b, reason: collision with root package name */
    public int f128839b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f128840c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f128841d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f128842e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f128843f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f128844g;

    /* renamed from: h, reason: collision with root package name */
    public final int f128845h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f128846i;

    public l(Context context) {
        this.f128838a = false;
        new Rect();
        this.f128844g = new Rect();
        this.f128846i = false;
        this.f128838a = context.getResources().getConfiguration().getLayoutDirection() == 1;
        this.f128843f = new Paint(1);
        int i13 = q0.color_light_gray;
        Object obj = d5.a.f53679a;
        int color = context.getColor(i13);
        this.f128845h = color;
        this.f128843f.setColor(color);
        this.f128843f.setStyle(Paint.Style.FILL);
    }

    public static String a(String str, tn1.c cVar, float f13) {
        return (str == null || str.length() == 0) ? "" : (String) TextUtils.ellipsize(str, cVar, f13, TextUtils.TruncateAt.END);
    }

    public int b() {
        return this.f128842e;
    }

    public void c() {
        setBounds(0, 0, 0, 0);
        this.f128844g.setEmpty();
        this.f128846i = false;
    }

    public final void d() {
        this.f128843f.setColor(this.f128845h);
    }

    public final void e(int i13) {
        this.f128842e = i13;
        Rect bounds = getBounds();
        bounds.bottom = bounds.top + i13;
        setBounds(bounds);
    }

    public final void f(int i13) {
        this.f128841d = i13;
        Rect bounds = getBounds();
        bounds.right = bounds.left + i13;
        setBounds(bounds);
    }

    public final void g(int i13) {
        this.f128840c = i13;
        Rect bounds = getBounds();
        int height = bounds.height();
        bounds.top = i13;
        bounds.bottom = i13 + height;
        setBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f128842e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f128841d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i13, int i14, int i15, int i16) {
        super.setBounds(i13, i14, i15, i16);
        Rect bounds = getBounds();
        this.f128839b = bounds.left;
        this.f128840c = bounds.top;
        this.f128841d = bounds.width();
        this.f128842e = bounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
