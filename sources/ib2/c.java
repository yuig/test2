package ib2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import s71.m;
import s71.o;

/* loaded from: classes4.dex */
public final class c extends Drawable implements Animatable {

    /* renamed from: a, reason: collision with root package name */
    public float f72033a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72034b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72035c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f72036d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f72037e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f72038f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f72039g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f72040h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f72041i;

    /* renamed from: j, reason: collision with root package name */
    public final m f72042j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f72043k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f72044l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f72045m;

    /* renamed from: n, reason: collision with root package name */
    public final b f72046n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f72047o;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f72033a = context.getResources().getDimensionPixelSize(vc2.a.visual_search_borderless_cropper_radius);
        this.f72034b = context.getResources().getDimensionPixelSize(vc2.a.visual_search_cropper_corner_size);
        this.f72035c = context.getResources().getDimensionPixelSize(vc2.a.visual_search_cropper_corner_padding);
        Paint paint = new Paint(1);
        this.f72036d = paint;
        this.f72037e = new RectF();
        Path path = new Path();
        this.f72038f = path;
        this.f72043k = new Handler(Looper.getMainLooper());
        this.f72044l = new Handler(Looper.getMainLooper());
        this.f72046n = new b(this, 0);
        int i13 = vc2.b.ic_visual_search_cropper_top_right_handle;
        Object obj = d5.a.f53679a;
        this.f72040h = context.getDrawable(i13);
        this.f72041i = context.getDrawable(vc2.b.ic_visual_search_cropper_bottom_left_handle);
        this.f72035c = context.getResources().getDimensionPixelSize(vc2.a.visual_search_cropper_corner_padding);
        this.f72042j = new m(new Rect(), new Rect(), new Rect(), new Rect());
        path.setFillType(Path.FillType.EVEN_ODD);
        paint.setColor(dl2.b.x0(context, eo1.a.color_background_dark_opacity_300));
    }

    public final void a(Canvas canvas, RectF rect) {
        m mVar;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (this.f72047o && (mVar = this.f72042j) != null) {
            o.l(this.f72034b, this.f72035c, rect, mVar);
            Drawable drawable = this.f72040h;
            if (drawable != null) {
                drawable.setBounds(mVar.f111396b);
                if (!drawable.getBounds().isEmpty()) {
                    drawable.draw(canvas);
                }
            }
            Drawable drawable2 = this.f72041i;
            if (drawable2 != null) {
                drawable2.setBounds(mVar.f111397c);
                if (drawable2.getBounds().isEmpty()) {
                    return;
                }
                drawable2.draw(canvas);
            }
        }
    }

    public final void b(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f72047o) {
            Path path = this.f72038f;
            path.reset();
            RectF rectF = this.f72037e;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(rectF, direction);
            RectF rectF2 = this.f72039g;
            if (rectF2 != null) {
                float f13 = this.f72033a;
                path.addRoundRect(rectF2, f13, f13, direction);
                path.close();
                canvas.drawPath(path, this.f72036d);
            }
        }
    }

    public final void c(boolean z13) {
        this.f72047o = z13;
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            invalidateSelf();
        } else {
            this.f72043k.post(new b(this, 1));
        }
    }

    public final void d(RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f72039g = bounds;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f72047o) {
            b(canvas);
            RectF rectF = this.f72039g;
            if (rectF != null) {
                a(canvas, rectF);
            }
        }
        this.f72045m = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f72037e.set(0.0f, 0.0f, bounds.width(), bounds.height());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f72036d.setAlpha(i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f72036d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
    }
}
