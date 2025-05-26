package va2;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import rm1.q;

/* loaded from: classes4.dex */
public final class j extends wa2.l {
    public final Rect A;
    public final Rect B;
    public final Path C;
    public Drawable D;
    public final Rect E;
    public boolean F;
    public int G;
    public Integer H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f125380J;
    public q K;
    public BitmapDrawable L;
    public float M;
    public int N;
    public String O;
    public int P;
    public boolean Q;
    public String R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final float W;

    /* renamed from: l, reason: collision with root package name */
    public final Context f125381l;

    /* renamed from: m, reason: collision with root package name */
    public final vn1.c f125382m;

    /* renamed from: n, reason: collision with root package name */
    public final int f125383n;

    /* renamed from: o, reason: collision with root package name */
    public final rm1.c f125384o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f125385p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f125386q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f125387r;

    /* renamed from: s, reason: collision with root package name */
    public final tn1.c f125388s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f125389t;

    /* renamed from: u, reason: collision with root package name */
    public final int f125390u;

    /* renamed from: v, reason: collision with root package name */
    public final int f125391v;

    /* renamed from: w, reason: collision with root package name */
    public final int f125392w;

    /* renamed from: x, reason: collision with root package name */
    public float f125393x;

    /* renamed from: y, reason: collision with root package name */
    public rm1.c f125394y;

    /* renamed from: z, reason: collision with root package name */
    public ColorFilter f125395z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, vn1.c defaultTextColor, int i13, rm1.c defaultIconColor, int i14, int i15, boolean z13, boolean z14, Integer num) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultTextColor, "defaultTextColor");
        Intrinsics.checkNotNullParameter(defaultIconColor, "defaultIconColor");
        this.f125381l = context;
        this.f125382m = defaultTextColor;
        this.f125383n = i13;
        this.f125384o = defaultIconColor;
        this.f125385p = z13;
        this.f125386q = z14;
        this.f125387r = num;
        tn1.c cVar = new tn1.c(context);
        bs1.c.t2(cVar, defaultTextColor, vn1.b.CENTER);
        this.f125388s = cVar;
        Paint paint = new Paint(1);
        paint.setColor(bs1.c.A(context, i13));
        this.f125389t = paint;
        this.f125390u = context.getResources().getDimensionPixelSize(i15);
        this.f125391v = context.getResources().getDimensionPixelSize(i14);
        this.f125392w = z14 ? context.getResources().getDimensionPixelSize(wy1.b.d2s_indicator_icon_right_padding) : context.getResources().getDimensionPixelSize(eo1.c.margin_quarter);
        this.f125393x = dl2.b.F0(context, eo1.a.comp_iconbutton_sm_rounding);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(eo1.c.lego_border_width_small);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Path();
        this.E = new Rect();
        this.G = 255;
        this.f125380J = true;
        this.O = "";
        this.W = this.f125393x + dimensionPixelSize;
    }

    public static /* synthetic */ void i(j jVar, Canvas canvas, float f13, float f14, int i13) {
        if ((i13 & 2) != 0) {
            f13 = 0.0f;
        }
        if ((i13 & 4) != 0) {
            f14 = 0.0f;
        }
        jVar.h(canvas, f13, f14, false);
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        this.f125388s.b(this.f125382m);
        this.O = "";
        this.f125389t.setColor(bs1.c.A(this.f125381l, this.f125383n));
        this.S = false;
        this.U = false;
        this.T = false;
        this.V = false;
        if (true != this.f125380J) {
            this.f125380J = true;
            q qVar = this.K;
            if (qVar != null) {
                j(qVar);
            }
        }
        this.H = null;
        this.F = false;
        this.G = 255;
        Drawable drawable = this.D;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha(255);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float centerX;
        float f13;
        float f14;
        Rect bounds;
        float centerX2;
        Rect bounds2;
        float[] fArr;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f128846i) {
            return;
        }
        Rect rect = this.A;
        RectF rectF = new RectF(rect);
        if (this.Q) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(dl2.b.x0(this.f125381l, eo1.a.color_background_dark_opacity_200));
            paint.setMaskFilter(new BlurMaskFilter(8.0f, BlurMaskFilter.Blur.NORMAL));
            float f15 = this.f125393x;
            canvas.drawRoundRect(rectF, f15, f15, paint);
        }
        Paint paint2 = this.f125389t;
        if (paint2.getAlpha() != 0) {
            if (!this.f125385p) {
                float f16 = this.f125393x;
                fArr = new float[]{f16, f16, f16, f16, f16, f16, f16, f16};
            } else if (this.f128838a) {
                float f17 = this.f125393x;
                fArr = new float[]{0.0f, 0.0f, f17, f17, 0.0f, 0.0f, f17, f17};
            } else {
                float f18 = this.f125393x;
                fArr = new float[]{f18, f18, 0.0f, 0.0f, f18, f18, 0.0f, 0.0f};
            }
            Path path = this.C;
            path.reset();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint2);
        }
        if (this.T) {
            canvas.save();
            h(canvas, 0.0f, -0.0f, true);
            float f19 = this.W;
            i(this, canvas, -f19, f19, 8);
            canvas.restore();
        } else {
            i(this, canvas, 0.0f, 0.0f, 14);
        }
        if (!z.j(this.O)) {
            tn1.c cVar = this.f125388s;
            float f23 = 2;
            float descent = ((cVar.descent() - cVar.ascent()) / f23) - cVar.descent();
            boolean z13 = this.U;
            int i13 = this.f125392w;
            if (z13) {
                if (this.S) {
                    canvas.save();
                    canvas.clipRect(rect);
                    if (this.f128838a) {
                        BitmapDrawable bitmapDrawable = this.L;
                        int i14 = (bitmapDrawable == null || (bounds2 = bitmapDrawable.getBounds()) == null) ? 0 : bounds2.left;
                        Rect rect2 = new Rect();
                        String str = this.O;
                        cVar.getTextBounds(str, 0, str.length(), rect2);
                        Unit unit = Unit.f80348a;
                        centerX2 = (i14 - (rect2.width() / f23)) - i13;
                    } else {
                        centerX2 = this.M + this.B.centerX();
                    }
                    canvas.drawText(this.O, centerX2, rect.centerY() + descent, cVar);
                    canvas.restore();
                    return;
                }
                return;
            }
            if (this.f128838a) {
                BitmapDrawable bitmapDrawable2 = this.L;
                if (bitmapDrawable2 != null && (bounds = bitmapDrawable2.getBounds()) != null) {
                    float f24 = bounds.left;
                    Rect rect3 = new Rect();
                    String str2 = this.O;
                    cVar.getTextBounds(str2, 0, str2.length(), rect3);
                    Unit unit2 = Unit.f80348a;
                    f14 = (f24 - (rect3.width() / f23)) - i13;
                    canvas.drawText(this.O, f14, rect.centerY() + descent, cVar);
                }
                centerX = rect.centerX();
                f13 = this.M;
            } else {
                centerX = rect.centerX();
                f13 = this.M;
            }
            f14 = f13 + centerX;
            canvas.drawText(this.O, f14, rect.centerY() + descent, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.graphics.Canvas r7, float r8, float r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: va2.j.h(android.graphics.Canvas, float, float, boolean):void");
    }

    public final void j(q qVar) {
        BitmapDrawable bitmapDrawable;
        rm1.c cVar;
        this.K = qVar;
        if (qVar != null) {
            bitmapDrawable = com.bumptech.glide.d.C(new rm1.d(new rm1.f(qVar), (!this.f125380J || (cVar = this.f125394y) == null) ? this.f125384o : cVar, null, 0, null, 28), this.f125381l);
        } else {
            bitmapDrawable = null;
        }
        this.L = bitmapDrawable;
        if (bitmapDrawable == null) {
            return;
        }
        bitmapDrawable.setColorFilter(this.f125395z);
    }
}
