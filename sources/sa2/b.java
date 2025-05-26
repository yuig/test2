package sa2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.StaticLayout;
import hs1.q;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import vn1.g;
import wa2.l;

/* loaded from: classes4.dex */
public final class b extends l {
    public boolean A;
    public final Paint B;
    public final Paint C;

    /* renamed from: l, reason: collision with root package name */
    public final q f112207l;

    /* renamed from: m, reason: collision with root package name */
    public final int f112208m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f112209n;

    /* renamed from: o, reason: collision with root package name */
    public final tn1.c f112210o;

    /* renamed from: p, reason: collision with root package name */
    public StaticLayout f112211p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f112212q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f112213r;

    /* renamed from: s, reason: collision with root package name */
    public final float f112214s;

    /* renamed from: t, reason: collision with root package name */
    public final float f112215t;

    /* renamed from: u, reason: collision with root package name */
    public final float f112216u;

    /* renamed from: v, reason: collision with root package name */
    public final float f112217v;

    /* renamed from: w, reason: collision with root package name */
    public float f112218w;

    /* renamed from: x, reason: collision with root package name */
    public float f112219x;

    /* renamed from: y, reason: collision with root package name */
    public float f112220y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f112221z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, q imageCache) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.f112207l = imageCache;
        this.f112208m = context.getResources().getDimensionPixelSize(r0.margin_half);
        this.f112209n = "";
        this.f112210o = new tn1.c(context, new tn1.b(vn1.c.LIGHT, tn1.c.f118618j, g.BODY_100, 2));
        Paint paint = new Paint(1);
        paint.setColor(dl2.b.x0(context, eo1.a.sema_color_background_wash_dark));
        this.f112212q = paint;
        this.f112213r = new RectF();
        float dimension = context.getResources().getDimension(r0.margin_half);
        this.f112214s = dimension;
        float dimension2 = context.getResources().getDimension(r0.margin);
        this.f112215t = dimension2;
        this.f112216u = context.getResources().getDimension(r0.margin_quarter) + dimension + dimension2;
        this.f112217v = context.getResources().getDimension(eo1.c.lego_corner_radius_large);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.B = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(dl2.b.x0(context, eo1.a.base_color_grayscale_0));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(context.getResources().getDimensionPixelSize(r0.stroke));
        this.C = paint3;
    }

    @Override // wa2.l
    public final void c() {
        this.f112221z = null;
        this.A = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f112209n.length() == 0) {
            return;
        }
        float measureText = this.f112210o.measureText(this.f112209n.toString());
        RectF rectF = this.f112213r;
        int i13 = this.f128839b;
        rectF.set(i13, this.f128840c, (this.f112214s * 2) + i13 + measureText + this.f112218w, r4 + this.f128842e);
        Paint paint = this.f112212q;
        float f13 = this.f112217v;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        canvas.save();
        canvas.translate(this.f112218w, this.f112220y);
        StaticLayout staticLayout = this.f112211p;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.translate(this.f112219x, this.f112220y);
        Bitmap bitmap = this.f112221z;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.B);
            Paint paint2 = this.C;
            float f14 = this.f112215t;
            canvas.drawOval(-1.0f, -1.0f, f14, f14, paint2);
        }
        canvas.restore();
    }
}
