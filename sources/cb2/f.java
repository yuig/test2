package cb2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import java.util.HashSet;
import lh0.n1;
import m60.q0;

/* loaded from: classes2.dex */
public final class f extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f27309a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f27310b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f27311c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f27312d;

    /* renamed from: e, reason: collision with root package name */
    public float f27313e;

    /* renamed from: f, reason: collision with root package name */
    public float f27314f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27315g;

    /* renamed from: h, reason: collision with root package name */
    public int f27316h;

    /* renamed from: i, reason: collision with root package name */
    public final int f27317i;

    public f(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f27309a = paint;
        Path path = new Path();
        this.f27310b = path;
        this.f27311c = new Rect();
        this.f27312d = new Rect();
        this.f27313e = 0.0f;
        this.f27314f = 0.0f;
        this.f27315g = false;
        this.f27316h = 0;
        this.f27317i = eo1.c.lego_corner_radius_medium_border;
        paint.setAntiAlias(true);
        paint.setColor(bs1.c.B(this, q0.contextual_bg));
        path.setFillType(Path.FillType.EVEN_ODD);
    }

    public static void a(Rect rect, int i13) {
        int width = rect.width();
        int i14 = (((int) (width * 1.1f)) - width) / 2;
        int i15 = (((int) (i13 * 1.1f)) - i13) / 2;
        rect.left -= i14;
        rect.right += i14;
        rect.top -= i15;
        rect.bottom += i15;
    }

    public final void b(Rect rect, int i13, Rect rect2, boolean z13, int i14) {
        this.f27316h = i14;
        boolean f13 = n1.f83436b.c().f();
        Path path = this.f27310b;
        Rect rect3 = this.f27312d;
        Rect rect4 = this.f27311c;
        if (f13) {
            this.f27315g = z13;
            path.reset();
            getGlobalVisibleRect(rect4);
            rect3.set(rect);
            rect3.top -= rect4.top;
            int i15 = rect3.bottom - rect4.top;
            rect3.bottom = i15;
            rect3.bottom = Math.min(i15, getMeasuredHeight() - ((int) r70.b.c().b()));
            this.f27313e = i13 * 1.1f;
            this.f27314f = rect2.height() * 1.1f;
            a(rect3, i13);
            float dimension = getContext().getResources().getDimension(this.f27317i);
            if (rect3.width() <= 0 || rect3.height() <= 0) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(new IllegalArgumentException(), "cutout Rect should have a height and width", tb0.p.CONTEXT_MENU);
            } else {
                if (!this.f27315g) {
                    int measuredHeight = getMeasuredHeight() - ((int) r70.b.c().b());
                    int i16 = rect3.bottom;
                    if (measuredHeight <= i16) {
                        rect3.bottom = (int) Math.min(i16, rect3.top + this.f27314f);
                    } else {
                        rect3.bottom = ((int) (i16 - this.f27313e)) + ((int) this.f27314f);
                    }
                }
                path.addRoundRect(rect3.left, rect3.top, rect3.right, rect3.bottom, dimension, dimension, Path.Direction.CCW);
            }
        } else {
            path.reset();
            path.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Path.Direction.CW);
            getGlobalVisibleRect(rect4);
            rect3.set(rect);
            rect3.top -= rect4.top;
            int i17 = rect3.bottom - rect4.top;
            rect3.bottom = i17;
            int min = Math.min(i17, getMeasuredHeight() - ((int) r70.b.c().b()));
            rect3.bottom = min;
            path.addRect(rect3.left, rect3.top, rect3.right, min, Path.Direction.CCW);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f13;
        super.onDraw(canvas);
        boolean f14 = n1.f83436b.c().f();
        Path path = this.f27310b;
        Paint paint = this.f27309a;
        if (!f14) {
            canvas.drawPath(path, paint);
            return;
        }
        if (this.f27316h > 0) {
            Rect rect = new Rect(0, 0, getMeasuredWidth(), this.f27316h - this.f27311c.top);
            canvas.drawRect(rect, paint);
            canvas.clipOutRect(rect);
        }
        Rect rect2 = new Rect(0, getMeasuredHeight() - ((int) r70.b.c().b()), getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRect(rect2, paint);
        canvas.clipOutRect(rect2);
        canvas.save();
        int measuredHeight = getMeasuredHeight() - ((int) r70.b.c().b());
        Rect rect3 = this.f27312d;
        int i13 = rect3.bottom;
        if (measuredHeight >= i13) {
            f13 = i13 - (this.f27315g ? this.f27313e : this.f27314f);
        } else {
            f13 = rect3.top;
        }
        canvas.translate(rect3.left, f13);
        canvas.rotate(-3.0f, (rect3.right - rect3.left) / 2.0f, this.f27313e / 2.0f);
        canvas.translate(-rect3.left, -f13);
        canvas.clipOutPath(path);
        canvas.drawColor(bs1.c.B(this, q0.contextual_bg));
        canvas.restore();
    }
}
