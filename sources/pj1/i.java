package pj1;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import rm1.m;
import rm1.q;
import xk2.n;

/* loaded from: classes2.dex */
public final class i extends wa2.l {
    public final Path A;
    public int B;
    public boolean C;
    public m D;
    public BitmapDrawable E;
    public float F;
    public int G;
    public String H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f100299J;
    public String K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public Drawable P;
    public final Rect Q;
    public boolean R;
    public int S;
    public Integer T;
    public Integer U;
    public final xk2.k V;
    public final xk2.k W;
    public final xk2.k X;
    public boolean Y;

    /* renamed from: l, reason: collision with root package name */
    public final Context f100300l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f100301m;

    /* renamed from: n, reason: collision with root package name */
    public g92.d f100302n;

    /* renamed from: o, reason: collision with root package name */
    public final tn1.c f100303o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f100304p;

    /* renamed from: q, reason: collision with root package name */
    public int f100305q;

    /* renamed from: r, reason: collision with root package name */
    public int f100306r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f100307s;

    /* renamed from: t, reason: collision with root package name */
    public int f100308t;

    /* renamed from: u, reason: collision with root package name */
    public float f100309u;

    /* renamed from: v, reason: collision with root package name */
    public final int f100310v;

    /* renamed from: w, reason: collision with root package name */
    public rm1.c f100311w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuffColorFilter f100312x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f100313y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f100314z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f100300l = context;
        tn1.c cVar = new tn1.c(context);
        bs1.c.u2(cVar, null, vn1.b.CENTER, 1);
        this.f100303o = cVar;
        Paint paint = new Paint(1);
        paint.setColor(bs1.c.A(context, wy1.a.grid_pin_indicator));
        this.f100304p = paint;
        this.f100305q = context.getResources().getDimensionPixelSize(eo1.c.lego_grid_cell_indicator_padding);
        this.f100306r = context.getResources().getDimensionPixelSize(eo1.c.lego_grid_cell_indicator_padding);
        this.f100308t = context.getResources().getDimensionPixelSize(eo1.c.margin_quarter);
        this.f100309u = dl2.b.F0(context, eo1.a.comp_iconbutton_sm_rounding);
        this.f100310v = context.getResources().getDimensionPixelSize(eo1.c.lego_border_width_small);
        this.f100311w = rm1.c.DEFAULT;
        this.f100313y = new Rect();
        this.f100314z = new Rect();
        this.A = new Path();
        this.C = true;
        this.H = "";
        this.Q = new Rect();
        this.S = 255;
        n nVar = n.NONE;
        this.V = xk2.m.a(nVar, new h(this, 1));
        this.W = xk2.m.a(nVar, new h(this, 2));
        this.X = xk2.m.a(nVar, new h(this, 0));
    }

    public static /* synthetic */ void l(i iVar, Canvas canvas, float f13, float f14, int i13) {
        if ((i13 & 2) != 0) {
            f13 = 0.0f;
        }
        if ((i13 & 4) != 0) {
            f14 = 0.0f;
        }
        iVar.k(canvas, f13, f14, false);
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        this.H = "";
        this.f100303o.b(tn1.c.f118612d.b());
        this.f100304p.setColor(bs1.c.A(this.f100300l, wy1.a.grid_pin_indicator));
        this.L = false;
        this.N = false;
        this.M = false;
        this.O = false;
        p(true);
        this.T = null;
        this.R = false;
        this.S = 255;
        Drawable drawable = this.P;
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
        float[] fArr;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f128846i) {
            return;
        }
        Rect rect = this.f100313y;
        RectF rectF = new RectF(rect);
        if (this.f100299J) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(dl2.b.x0(this.f100300l, eo1.a.color_background_dark_opacity_200));
            paint.setMaskFilter(new BlurMaskFilter(8.0f, BlurMaskFilter.Blur.NORMAL));
            float f15 = this.f100309u;
            canvas.drawRoundRect(rectF, f15, f15, paint);
        }
        Paint paint2 = this.f100304p;
        if (paint2.getAlpha() != 0) {
            if (!this.Y) {
                float f16 = this.f100309u;
                fArr = new float[]{f16, f16, f16, f16, f16, f16, f16, f16};
            } else if (this.f128838a) {
                float f17 = this.f100309u;
                fArr = new float[]{0.0f, 0.0f, f17, f17, 0.0f, 0.0f, f17, f17};
            } else {
                float f18 = this.f100309u;
                fArr = new float[]{f18, f18, 0.0f, 0.0f, f18, f18, 0.0f, 0.0f};
            }
            Path path = this.A;
            path.reset();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint2);
        }
        if (this.M) {
            i(canvas);
        } else {
            l(this, canvas, 0.0f, 0.0f, 14);
        }
        if (!z.j(this.H)) {
            tn1.c cVar = this.f100303o;
            float f19 = 2;
            float descent = ((cVar.descent() - cVar.ascent()) / f19) - cVar.descent();
            if (this.N) {
                j(canvas, descent);
                return;
            }
            if (this.f128838a) {
                BitmapDrawable bitmapDrawable = this.E;
                if (bitmapDrawable != null && (bounds = bitmapDrawable.getBounds()) != null) {
                    float f23 = bounds.left;
                    Rect rect2 = new Rect();
                    String str = this.H;
                    cVar.getTextBounds(str, 0, str.length(), rect2);
                    Unit unit = Unit.f80348a;
                    f14 = (f23 - (rect2.width() / f19)) - this.f100308t;
                    canvas.drawText(this.H, f14, rect.centerY() + descent, cVar);
                }
                centerX = rect.centerX();
                f13 = this.F;
            } else {
                centerX = rect.centerX();
                f13 = this.F;
            }
            f14 = f13 + centerX;
            canvas.drawText(this.H, f14, rect.centerY() + descent, cVar);
        }
    }

    public final void h(Canvas canvas) {
        Path path = this.A;
        path.reset();
        RectF rectF = new RectF(this.f100313y);
        float f13 = this.f100309u;
        path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        canvas.clipPath(path);
    }

    public final void i(Canvas canvas) {
        canvas.save();
        k(canvas, 0.0f, -0.0f, true);
        float f13 = this.f100309u;
        int i13 = this.f100310v;
        l(this, canvas, -(i13 + f13), f13 + i13, 8);
        canvas.restore();
    }

    public final void j(Canvas canvas, float f13) {
        float centerX;
        Rect bounds;
        if (this.L) {
            canvas.save();
            canvas.clipRect(this.f100313y);
            boolean z13 = this.f128838a;
            tn1.c cVar = this.f100303o;
            if (z13) {
                BitmapDrawable bitmapDrawable = this.E;
                int i13 = (bitmapDrawable == null || (bounds = bitmapDrawable.getBounds()) == null) ? 0 : bounds.left;
                Rect rect = new Rect();
                String str = this.H;
                cVar.getTextBounds(str, 0, str.length(), rect);
                Unit unit = Unit.f80348a;
                centerX = (i13 - (rect.width() / 2)) - this.f100308t;
            } else {
                centerX = this.f100314z.centerX() + this.F;
            }
            canvas.drawText(this.H, centerX, r0.centerY() + f13, cVar);
            canvas.restore();
        }
    }

    public final void k(Canvas canvas, float f13, float f14, boolean z13) {
        Drawable drawable;
        Drawable drawable2;
        Rect bounds;
        Rect bounds2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        BitmapDrawable bitmapDrawable = this.E;
        if (bitmapDrawable != null) {
            boolean z14 = this.f100307s;
            Rect rect = this.f100313y;
            if (z14) {
                if (this.f128838a) {
                    i15 = rect.right - this.f100306r;
                    i16 = this.G;
                    i17 = i15 - i16;
                } else {
                    i13 = rect.left;
                    i14 = this.f100306r;
                    i17 = i13 + i14;
                }
            } else if (this.N && this.f128838a) {
                i15 = rect.right - this.f100305q;
                i16 = this.G;
                i17 = i15 - i16;
            } else {
                i13 = rect.left;
                i14 = this.f100305q;
                i17 = i13 + i14;
            }
            Integer num = this.T;
            if (num != null) {
                bitmapDrawable.setAlpha(num.intValue());
            }
            int i18 = rect.top + this.f100305q;
            int i19 = this.G;
            bitmapDrawable.setBounds(i17, i18, i17 + i19, i19 + i18);
        }
        if (z13) {
            h(canvas);
        }
        float f15 = 0.0f;
        if (f13 != 0.0f || f14 != 0.0f) {
            if (this.O) {
                f13 = -f13;
            }
            canvas.translate(f13, f14);
        }
        Drawable drawable3 = this.P;
        if (drawable3 != null) {
            drawable3.setBounds(this.Q);
        }
        Drawable drawable4 = this.P;
        if (drawable4 != null) {
            drawable4.setAlpha(this.S);
        }
        if (!this.O) {
            if (this.R && (drawable = this.P) != null) {
                drawable.draw(canvas);
            }
            BitmapDrawable bitmapDrawable2 = this.E;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.draw(canvas);
                return;
            }
            return;
        }
        canvas.save();
        BitmapDrawable bitmapDrawable3 = this.E;
        float centerX = (bitmapDrawable3 == null || (bounds2 = bitmapDrawable3.getBounds()) == null) ? 0.0f : bounds2.centerX();
        BitmapDrawable bitmapDrawable4 = this.E;
        if (bitmapDrawable4 != null && (bounds = bitmapDrawable4.getBounds()) != null) {
            f15 = bounds.centerY();
        }
        canvas.rotate(-90.0f, centerX, f15);
        if (this.R && (drawable2 = this.P) != null) {
            drawable2.draw(canvas);
        }
        BitmapDrawable bitmapDrawable5 = this.E;
        if (bitmapDrawable5 != null) {
            bitmapDrawable5.draw(canvas);
        }
        canvas.restore();
    }

    public final Drawable m() {
        return (Drawable) this.X.getValue();
    }

    public final Drawable n() {
        return (Drawable) this.V.getValue();
    }

    public final Drawable o() {
        return (Drawable) this.W.getValue();
    }

    public final void p(boolean z13) {
        if (z13 != this.C) {
            this.C = z13;
            m mVar = this.D;
            if (mVar != null) {
                q(mVar);
            }
        }
    }

    public final void q(m mVar) {
        BitmapDrawable bitmapDrawable;
        this.D = mVar;
        if (mVar != null) {
            rm1.g fVar = mVar instanceof q ? new rm1.f((q) mVar) : new rm1.e((rm1.n) mVar);
            g92.d dVar = this.f100302n;
            Context context = this.f100300l;
            if (dVar != null) {
                bitmapDrawable = com.bumptech.glide.d.D(new rm1.d(fVar, this.C ? this.f100311w : rm1.c.DEFAULT, null, 0, null, 28), context, dVar);
            } else {
                bitmapDrawable = com.bumptech.glide.d.C(new rm1.d(fVar, this.C ? this.f100311w : rm1.c.DEFAULT, null, 0, null, 28), context);
            }
        } else {
            bitmapDrawable = null;
        }
        this.E = bitmapDrawable;
        if (bitmapDrawable == null) {
            return;
        }
        bitmapDrawable.setColorFilter(this.f100312x);
    }
}
