package xi1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import hs1.q;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.r2;
import lh0.z3;
import m60.r0;
import ps0.y;
import u50.i0;
import wa2.l;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class i extends l {
    public static final /* synthetic */ int I = 0;
    public int A;
    public int B;
    public StaticLayout C;
    public RectF D;
    public RectF E;
    public g F;
    public final v G;
    public final v H;

    /* renamed from: l, reason: collision with root package name */
    public final q f135053l;

    /* renamed from: m, reason: collision with root package name */
    public final r2 f135054m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f135055n;

    /* renamed from: o, reason: collision with root package name */
    public final Resources f135056o;

    /* renamed from: p, reason: collision with root package name */
    public final rm1.i f135057p;

    /* renamed from: q, reason: collision with root package name */
    public final int f135058q;

    /* renamed from: r, reason: collision with root package name */
    public int f135059r;

    /* renamed from: s, reason: collision with root package name */
    public vn1.c f135060s;

    /* renamed from: t, reason: collision with root package name */
    public rm1.c f135061t;

    /* renamed from: u, reason: collision with root package name */
    public final int f135062u;

    /* renamed from: v, reason: collision with root package name */
    public final int f135063v;

    /* renamed from: w, reason: collision with root package name */
    public final int f135064w;

    /* renamed from: x, reason: collision with root package name */
    public final int f135065x;

    /* renamed from: y, reason: collision with root package name */
    public String f135066y;

    /* renamed from: z, reason: collision with root package name */
    public rm1.q f135067z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View parent, q imageCache, r2 experiments) {
        super(parent.getContext());
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f135053l = imageCache;
        this.f135054m = experiments;
        Context context = parent.getContext();
        this.f135055n = context;
        Resources resources = context.getResources();
        this.f135056o = resources;
        this.f135057p = rm1.i.XS;
        this.f135058q = parent.getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_chin_cta_height);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f135059r = bs1.c.A(context, wy1.a.color_light_gray_chin_cta);
        this.f135060s = vn1.h.f126277c;
        this.f135061t = GestaltIcon.f49405g;
        this.f135062u = resources.getDimensionPixelSize(r0.lego_grid_cell_cta_radius_dto);
        this.f135063v = parent.getContext().getResources().getDimensionPixelSize(r0.margin_half);
        this.f135064w = context.getResources().getDimensionPixelSize(eo1.c.sema_space_100);
        this.f135065x = context.getResources().getDimensionPixelSize(eo1.c.sema_space_200);
        this.f135066y = "";
        this.f135067z = rm1.q.ARROW_UP_RIGHT;
        this.B = eo1.b.color_background_default;
        this.F = f.f135049b;
        this.G = m.b(new h(this, 1));
        this.H = m.b(new h(this, 0));
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        Context context = this.f135055n;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f135059r = bs1.c.A(context, wy1.a.color_light_gray_chin_cta);
        ps0.m mVar = vn1.h.f126275a;
        this.f135060s = vn1.h.f126277c;
        y yVar = GestaltIcon.f49400b;
        this.f135061t = GestaltIcon.f49405g;
        this.F = f.f135049b;
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
            int i14 = this.f128839b;
            float f13 = i13;
            canvas.translate(i14, f13);
            paint.setColor(this.f135059r);
            paint.setStrokeWidth(3.0f);
            r2 r2Var = this.f135054m;
            r2Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) r2Var.f83469a;
            boolean z13 = g1Var.o("ads_android_draw_chin", "enabled", z3Var) || g1Var.l("ads_android_draw_chin");
            Context context = this.f135055n;
            int i15 = this.f135062u;
            if (z13) {
                RectF rectF2 = this.D;
                if (rectF2 != null) {
                    if (paint.getStyle() == Paint.Style.STROKE) {
                        rectF2.set(1.5f, 1.5f, this.f128841d - 1.5f, this.f128842e - 1.5f);
                    }
                    Path path = new Path();
                    float f14 = i15;
                    path.addRoundRect(rectF2, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f14, f14, f14, f14}, Path.Direction.CW);
                    canvas.drawPath(path, paint);
                }
            } else {
                RectF rectF3 = this.D;
                if (rectF3 != null) {
                    if (paint.getStyle() == Paint.Style.STROKE) {
                        rectF3.set(1.5f, 1.5f, this.f128841d - 1.5f, this.f128842e - 1.5f);
                    }
                    float f15 = i15;
                    canvas.drawRoundRect(rectF3, f15, f15, paint);
                }
                RectF rectF4 = this.E;
                if (rectF4 != null) {
                    RectF rectF5 = this.D;
                    rectF4.bottom = (rectF5 != null ? rectF5.bottom : 0.0f) - i15;
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
            boolean z14 = this.f128838a;
            int i16 = this.f135063v;
            if (z14) {
                intValue = this.F.f135050a ? this.f128841d - k() : j() + i16 + this.f135064w;
            } else {
                Integer valueOf = Integer.valueOf(i16);
                if (this.F.f135050a) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : 0;
            }
            int i17 = i14 + intValue;
            g gVar = this.F;
            if (gVar instanceof d) {
                Bitmap bitmap = ((d) gVar).f135047b;
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
                Path path2 = (Path) i(f16, f13).f80347b;
                canvas.save();
                canvas.clipPath(path2);
                float f18 = f16 + k13;
                float f19 = k14 + f13;
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(f18, f19, width + f18, height + f19), (Paint) null);
                canvas.restore();
                canvas.save();
                i17 = n(i17);
            } else if (Intrinsics.d(gVar, e.f135048b)) {
                Pair i18 = i(i17, f13);
                RectF rectF6 = (RectF) i18.f80346a;
                Path path3 = (Path) i18.f80347b;
                canvas.save();
                canvas.clipPath(path3);
                Paint paint3 = new Paint();
                paint3.setColor(this.f135059r);
                canvas.drawRect(rectF6, paint3);
                canvas.restore();
                canvas.save();
                i17 = n(i17);
            } else {
                Intrinsics.d(gVar, f.f135049b);
            }
            RectF rectF7 = this.D;
            float height2 = (((rectF7 != null ? rectF7.height() : 0.0f) - j()) / 2) + f13;
            RectF rectF8 = this.D;
            float height3 = rectF8 != null ? rectF8.height() : 0.0f;
            canvas.translate(i17, (((int) (height3 - (this.C != null ? r5.getHeight() : 0.0f))) / 2) + i13);
            StaticLayout staticLayout = this.C;
            TextPaint paint4 = staticLayout != null ? staticLayout.getPaint() : null;
            if (paint4 != null) {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                paint4.setColor(dl2.b.x0(context, this.f135060s.getColorRes()));
            }
            StaticLayout staticLayout2 = this.C;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            rm1.d dVar = new rm1.d(new rm1.f(this.f135067z, this.f135057p), this.f135061t, null, 0, null, 28);
            Intrinsics.checkNotNullExpressionValue(context, "context");
            BitmapDrawable C = com.bumptech.glide.d.C(dVar, context);
            C.setBounds(0, 0, j(), j());
            canvas.translate(this.f128838a ? i16 + C.getBounds().left : (this.f128841d - i16) - C.getBounds().right, height2);
            C.draw(canvas);
            canvas.restore();
        }
    }

    public final void h(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        i0 i0Var = displayState.f135031b;
        Context context = this.f135055n;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f135066y = i0Var.a(context).toString();
        this.f135067z = displayState.f135030a;
        Integer num = displayState.f135032c;
        if (num != null) {
            this.B = num.intValue();
        }
        Paint.Style style = displayState.f135033d;
        if (style != null) {
            this.f128843f.setStyle(style);
        }
        this.A = displayState.f135034e;
        String str = displayState.f135035f;
        if (str != null) {
            this.F = e.f135048b;
            ((hs1.m) this.f135053l).k(str, new androidx.appcompat.widget.q(this, 1), null, null);
        }
    }

    public final Pair i(float f13, float f14) {
        RectF rectF = new RectF(f13, f14, k() + f13, k() + f14);
        float f15 = this.f135062u;
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
            if ((rectF != null ? rectF.height() : 0.0f) > (this.C != null ? r2.getHeight() : 0.0f) && this.f135066y.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void m() {
        RectF rectF;
        int max = Math.max(l.f128836j, this.f128841d);
        this.E = new RectF();
        int j13 = ((max - j()) - (this.f135063v * 2)) - this.f135064w;
        Integer valueOf = Integer.valueOf(k());
        if (!this.F.f135050a) {
            valueOf = null;
        }
        int i13 = 0;
        int intValue = j13 - (valueOf != null ? valueOf.intValue() : 0);
        String str = this.f135066y;
        int length = str.length();
        Context context = this.f135055n;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        tn1.c cVar = new tn1.c(context);
        bs1.c.u2(cVar, this.f135060s, null, 2);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        int i14 = this.A;
        TextDirectionHeuristic textDirectionHeuristic = this.f128838a ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.f(textDirectionHeuristic);
        StaticLayout y13 = com.bumptech.glide.d.y(str, length, cVar, intValue, alignment, truncateAt, intValue, i14, textDirectionHeuristic);
        this.C = y13;
        float height = y13 != null ? y13.getHeight() + (this.f135065x * 2) : 0.0f;
        boolean z13 = this.F.f135050a;
        int i15 = this.f135058q;
        this.D = new RectF(0.0f, 0.0f, max, z13 ? Math.max(height, Math.max(i15, k())) : Math.max(height, i15));
        if (l() && (rectF = this.D) != null) {
            i13 = (int) rectF.height();
        }
        e(i13);
    }

    public final int n(int i13) {
        boolean z13 = this.f128838a;
        int i14 = this.f135063v;
        if (!z13) {
            return k() + i13 + i14;
        }
        StaticLayout staticLayout = this.C;
        return (i13 - (staticLayout != null ? Integer.valueOf(staticLayout.getWidth()) : Float.valueOf(0.0f)).intValue()) + i14;
    }

    public final void o(int i13) {
        this.f135059r = i13;
    }

    public final void p(rm1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f135061t = color;
    }

    public final void q(vn1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f135060s = color;
    }
}
