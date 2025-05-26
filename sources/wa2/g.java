package wa2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.r2;
import lh0.z3;
import m60.r0;

/* loaded from: classes4.dex */
public final class g extends l {
    public static final /* synthetic */ int I = 0;
    public int A;
    public int B;
    public StaticLayout C;
    public RectF D;
    public RectF E;
    public e F;
    public final xk2.v G;
    public final xk2.v H;

    /* renamed from: l, reason: collision with root package name */
    public final hs1.q f128704l;

    /* renamed from: m, reason: collision with root package name */
    public final r2 f128705m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f128706n;

    /* renamed from: o, reason: collision with root package name */
    public final Resources f128707o;

    /* renamed from: p, reason: collision with root package name */
    public final rm1.i f128708p;

    /* renamed from: q, reason: collision with root package name */
    public int f128709q;

    /* renamed from: r, reason: collision with root package name */
    public int f128710r;

    /* renamed from: s, reason: collision with root package name */
    public vn1.c f128711s;

    /* renamed from: t, reason: collision with root package name */
    public rm1.c f128712t;

    /* renamed from: u, reason: collision with root package name */
    public int f128713u;

    /* renamed from: v, reason: collision with root package name */
    public final int f128714v;

    /* renamed from: w, reason: collision with root package name */
    public final int f128715w;

    /* renamed from: x, reason: collision with root package name */
    public final int f128716x;

    /* renamed from: y, reason: collision with root package name */
    public String f128717y;

    /* renamed from: z, reason: collision with root package name */
    public rm1.q f128718z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LegoPinGridCellImpl parent, hs1.q imageCache, r2 experiments) {
        super(parent.getContext());
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f128704l = imageCache;
        this.f128705m = experiments;
        Context context = parent.getContext();
        this.f128706n = context;
        Resources resources = context.getResources();
        this.f128707o = resources;
        this.f128708p = rm1.i.XS;
        this.f128709q = bs1.c.b0(parent, eo1.c.space_900);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f128710r = bs1.c.A(context, wy1.a.color_light_gray_chin_cta);
        this.f128711s = vn1.c.DEFAULT;
        this.f128712t = GestaltIcon.f49405g;
        this.f128713u = resources.getDimensionPixelSize(eo1.c.corner_radius);
        this.f128714v = context.getResources().getDimensionPixelSize(r0.margin_half);
        this.f128715w = context.getResources().getDimensionPixelSize(eo1.c.sema_space_100);
        this.f128716x = context.getResources().getDimensionPixelSize(eo1.c.sema_space_200);
        this.f128717y = "";
        this.f128718z = rm1.q.ARROW_UP_RIGHT;
        this.B = eo1.b.color_background_default;
        this.F = d.f128686b;
        this.G = xk2.m.b(new f(this, 1));
        this.H = xk2.m.b(new f(this, 0));
    }

    public static final void i(g gVar, kotlin.jvm.internal.h0 h0Var) {
        boolean z13 = gVar.f128838a;
        int i13 = gVar.f128714v;
        if (!z13) {
            h0Var.f80426a = gVar.k() + i13 + h0Var.f80426a;
            return;
        }
        int i14 = h0Var.f80426a;
        StaticLayout staticLayout = gVar.C;
        h0Var.f80426a = i14 - ((staticLayout != null ? Integer.valueOf(staticLayout.getWidth()) : Float.valueOf(0.0f)).intValue() + i13);
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        int i13 = r0.lego_grid_cell_chin_cta_height;
        Resources resources = this.f128707o;
        this.f128709q = resources.getDimensionPixelSize(i13);
        this.f128713u = resources.getDimensionPixelSize(eo1.c.corner_radius);
        Context context = this.f128706n;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f128710r = bs1.c.A(context, wy1.a.color_light_gray_chin_cta);
        ps0.m mVar = vn1.h.f126275a;
        this.f128711s = vn1.h.f126277c;
        ps0.y yVar = GestaltIcon.f49400b;
        this.f128712t = GestaltIcon.f49405g;
        this.F = d.f128686b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF;
        int intValue;
        Paint paint = this.f128843f;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (l()) {
            canvas.save();
            int i13 = this.f128840c;
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            int i14 = this.f128839b;
            h0Var.f80426a = i14;
            float f13 = i13;
            canvas.translate(i14, f13);
            paint.setColor(this.f128710r);
            paint.setStrokeWidth(3.0f);
            r2 r2Var = this.f128705m;
            r2Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) r2Var.f83469a;
            boolean z13 = g1Var.o("ads_android_draw_chin", "enabled", z3Var) || g1Var.l("ads_android_draw_chin");
            Context context = this.f128706n;
            if (z13) {
                RectF rectF2 = this.D;
                if (rectF2 != null) {
                    if (paint.getStyle() == Paint.Style.STROKE) {
                        rectF2.set(1.5f, 1.5f, this.f128841d - 1.5f, this.f128842e - 1.5f);
                    }
                    Path path = new Path();
                    float f14 = this.f128713u;
                    path.addRoundRect(rectF2, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f14, f14, f14, f14}, Path.Direction.CW);
                    canvas.drawPath(path, paint);
                }
            } else {
                RectF rectF3 = this.D;
                if (rectF3 != null) {
                    if (paint.getStyle() == Paint.Style.STROKE) {
                        rectF3.set(1.5f, 1.5f, this.f128841d - 1.5f, this.f128842e - 1.5f);
                    }
                    float f15 = this.f128713u;
                    canvas.drawRoundRect(rectF3, f15, f15, paint);
                }
                RectF rectF4 = this.E;
                if (rectF4 != null) {
                    RectF rectF5 = this.D;
                    rectF4.bottom = (rectF5 != null ? rectF5.bottom : 0.0f) - this.f128713u;
                    rectF4.left = rectF5 != null ? rectF5.left : 0.0f;
                    rectF4.right = rectF5 != null ? rectF5.right : 0.0f;
                    rectF4.top = rectF5 != null ? rectF5.top : 0.0f;
                    canvas.drawRect(rectF4, paint);
                }
                if (paint.getStyle() == Paint.Style.STROKE && (rectF = this.E) != null) {
                    rectF.left += 3.0f;
                    rectF.right -= 3.0f;
                    rectF.top += 3.0f;
                    rectF.bottom += 1.5f;
                    Paint paint2 = new Paint(paint);
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    paint2.setColor(bs1.c.A(context, this.B));
                    paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                    Unit unit = Unit.f80348a;
                    canvas.drawRect(rectF, paint2);
                }
            }
            d();
            canvas.restore();
            canvas.save();
            int i15 = h0Var.f80426a;
            boolean z14 = this.f128838a;
            int i16 = this.f128714v;
            if (z14) {
                intValue = this.F.f128691a ? this.f128841d - k() : j() + i16 + this.f128715w;
            } else {
                Integer valueOf = Integer.valueOf(i16);
                if (this.F.f128691a) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : 0;
            }
            int i17 = i15 + intValue;
            h0Var.f80426a = i17;
            e eVar = this.F;
            if (eVar instanceof b) {
                Bitmap bitmap = ((b) eVar).f128666b;
                float f16 = i17;
                if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                    throw new IllegalStateException("Bitmap width and height must be greater than 0".toString());
                }
                float max = Math.max(k() / bitmap.getWidth(), k() / bitmap.getHeight());
                float width = bitmap.getWidth() * max;
                float height = bitmap.getHeight() * max;
                float f17 = 2;
                float k13 = (k() - width) / f17;
                float k14 = (k() - height) / f17;
                Path path2 = (Path) h(f16, f13).f80347b;
                canvas.save();
                canvas.clipPath(path2);
                float f18 = f16 + k13;
                float f19 = k14 + f13;
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(f18, f19, width + f18, height + f19), (Paint) null);
                canvas.restore();
                canvas.save();
                i(this, h0Var);
            } else if (Intrinsics.d(eVar, c.f128682b)) {
                Pair h10 = h(h0Var.f80426a, f13);
                RectF rectF6 = (RectF) h10.f80346a;
                Path path3 = (Path) h10.f80347b;
                canvas.save();
                canvas.clipPath(path3);
                Paint paint3 = new Paint();
                paint3.setColor(this.f128710r);
                canvas.drawRect(rectF6, paint3);
                canvas.restore();
                canvas.save();
                i(this, h0Var);
            } else {
                Intrinsics.d(eVar, d.f128686b);
            }
            RectF rectF7 = this.D;
            float height2 = (((rectF7 != null ? rectF7.height() : 0.0f) - j()) / 2) + f13;
            RectF rectF8 = this.D;
            float height3 = rectF8 != null ? rectF8.height() : 0.0f;
            canvas.translate(h0Var.f80426a, (((int) (height3 - (this.C != null ? r4.getHeight() : 0.0f))) / 2) + i13);
            StaticLayout staticLayout = this.C;
            TextPaint paint4 = staticLayout != null ? staticLayout.getPaint() : null;
            if (paint4 != null) {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                paint4.setColor(dl2.b.x0(context, this.f128711s.getColorRes()));
            }
            StaticLayout staticLayout2 = this.C;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            rm1.d dVar = new rm1.d(new rm1.f(this.f128718z, this.f128708p), this.f128712t, null, 0, null, 28);
            Intrinsics.checkNotNullExpressionValue(context, "context");
            BitmapDrawable C = com.bumptech.glide.d.C(dVar, context);
            C.setBounds(0, 0, j(), j());
            canvas.translate(this.f128838a ? i16 + C.getBounds().left : (this.f128841d - i16) - C.getBounds().right, height2);
            C.draw(canvas);
            canvas.restore();
        }
    }

    public final Pair h(float f13, float f14) {
        RectF rectF = new RectF(f13, f14, k() + f13, k() + f14);
        float f15 = this.f128713u;
        Path path = new Path();
        path.addRoundRect(rectF, this.f128838a ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, f15, f15, 0.0f, 0.0f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f15, f15}, Path.Direction.CW);
        return new Pair(rectF, path);
    }

    public final int j() {
        return ((Number) this.H.getValue()).intValue();
    }

    public final int k() {
        return ((Number) this.G.getValue()).intValue();
    }

    public final boolean l() {
        RectF rectF = this.D;
        if (rectF != null) {
            if ((rectF != null ? rectF.height() : 0.0f) > (this.C != null ? r2.getHeight() : 0.0f) && this.f128717y.length() > 0) {
                return true;
            }
        }
        return false;
    }
}
