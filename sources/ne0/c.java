package ne0;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.design.brio.widget.LegacyLinearLayout;

/* loaded from: classes5.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public View f90447a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f90448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90449c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90450d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90451e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f90452f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f90453g;

    /* renamed from: h, reason: collision with root package name */
    public final int f90454h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f90455i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f90456j;

    /* renamed from: k, reason: collision with root package name */
    public final a f90457k;

    /* renamed from: l, reason: collision with root package name */
    public final b f90458l;

    public c(Resources resources, boolean z13, a aVar) {
        int color = resources.getColor(eo1.b.color_themed_transparent);
        int color2 = resources.getColor(le0.a.color_light_gray);
        int dimensionPixelSize = resources.getDimensionPixelSize(eo1.c.touch_radius);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(eo1.c.space_200);
        this.f90458l = new b(this, 0);
        this.f90449c = color;
        Paint paint = new Paint();
        this.f90448b = paint;
        paint.setColor(color);
        this.f90452f = new RectF();
        this.f90453g = z13;
        this.f90454h = dimensionPixelSize2;
        this.f90457k = aVar;
        this.f90451e = dimensionPixelSize;
        View view = this.f90447a;
        if (view != null) {
            view.invalidate();
        }
        this.f90450d = color2;
        View view2 = this.f90447a;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (this.f90453g) {
            while (view.getParent() instanceof View) {
                view = (View) view.getParent();
                if (view instanceof pe0.a) {
                    ((LegacyLinearLayout) ((pe0.a) view)).f44833b = true;
                    return;
                }
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        Paint paint = this.f90448b;
        b bVar = this.f90458l;
        if (actionMasked == 0) {
            this.f90455i = true;
            a(view);
            View view2 = this.f90447a;
            if (view2 != null) {
                view2.removeCallbacks(bVar);
                paint.setColor(this.f90450d);
                this.f90447a.postDelayed(bVar, 67L);
            }
            return true;
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return false;
        }
        a(view);
        View view3 = this.f90447a;
        if (view3 != null) {
            view3.removeCallbacks(bVar);
            paint.setColor(this.f90449c);
            View view4 = this.f90447a;
            if (view4 != null) {
                view4.invalidate();
            }
        }
        this.f90455i = false;
        return true;
    }
}
