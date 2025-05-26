package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import ao2.m0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.WeakHashMap;
import oi.u6;
import q5.v0;

/* loaded from: classes.dex */
public final class c {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public yj.b D;
    public yj.b E;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f32707a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f32708a0;

    /* renamed from: b, reason: collision with root package name */
    public float f32709b;

    /* renamed from: b0, reason: collision with root package name */
    public float f32710b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32711c;

    /* renamed from: c0, reason: collision with root package name */
    public float f32712c0;

    /* renamed from: d, reason: collision with root package name */
    public float f32713d;

    /* renamed from: d0, reason: collision with root package name */
    public float f32714d0;

    /* renamed from: e, reason: collision with root package name */
    public float f32715e;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f32716e0;

    /* renamed from: f, reason: collision with root package name */
    public int f32717f;

    /* renamed from: f0, reason: collision with root package name */
    public float f32718f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f32719g;

    /* renamed from: g0, reason: collision with root package name */
    public float f32720g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f32721h;

    /* renamed from: h0, reason: collision with root package name */
    public float f32722h0;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f32723i;

    /* renamed from: i0, reason: collision with root package name */
    public StaticLayout f32724i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f32726j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f32728k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f32730l0;

    /* renamed from: m0, reason: collision with root package name */
    public CharSequence f32732m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f32733n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f32735o;

    /* renamed from: p, reason: collision with root package name */
    public int f32737p;

    /* renamed from: q, reason: collision with root package name */
    public float f32739q;

    /* renamed from: r, reason: collision with root package name */
    public float f32740r;

    /* renamed from: s, reason: collision with root package name */
    public float f32741s;

    /* renamed from: t, reason: collision with root package name */
    public float f32742t;

    /* renamed from: u, reason: collision with root package name */
    public float f32743u;

    /* renamed from: v, reason: collision with root package name */
    public float f32744v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f32745w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f32746x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f32747y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f32748z;

    /* renamed from: j, reason: collision with root package name */
    public int f32725j = 16;

    /* renamed from: k, reason: collision with root package name */
    public int f32727k = 16;

    /* renamed from: l, reason: collision with root package name */
    public float f32729l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f32731m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    public boolean f32706J = true;

    /* renamed from: n0, reason: collision with root package name */
    public int f32734n0 = 1;

    /* renamed from: o0, reason: collision with root package name */
    public final float f32736o0 = 1.0f;

    /* renamed from: p0, reason: collision with root package name */
    public final int f32738p0 = 1;

    public c(View view) {
        this.f32707a = view;
        TextPaint textPaint = new TextPaint(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.f32721h = new Rect();
        this.f32719g = new Rect();
        this.f32723i = new RectF();
        float f13 = this.f32713d;
        this.f32715e = ep.b.a(1.0f, f13, 0.5f, f13);
        m(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i13, float f13, int i14) {
        float f14 = 1.0f - f13;
        return Color.argb(Math.round((Color.alpha(i14) * f13) + (Color.alpha(i13) * f14)), Math.round((Color.red(i14) * f13) + (Color.red(i13) * f14)), Math.round((Color.green(i14) * f13) + (Color.green(i13) * f14)), Math.round((Color.blue(i14) * f13) + (Color.blue(i13) * f14)));
    }

    public static boolean k(float f13, float f14) {
        return Math.abs(f13 - f14) < 1.0E-5f;
    }

    public static float l(float f13, float f14, float f15, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f15 = timeInterpolator.getInterpolation(f15);
        }
        return gj.a.a(f13, f14, f15);
    }

    public final float b(float f13) {
        float f14 = this.f32715e;
        return f13 <= f14 ? gj.a.b(1.0f, 0.0f, this.f32713d, f14, f13) : gj.a.b(0.0f, 1.0f, f14, 1.0f, f13);
    }

    public final boolean c(CharSequence charSequence) {
        WeakHashMap weakHashMap = v0.f102521a;
        boolean z13 = this.f32707a.getLayoutDirection() == 1;
        if (this.f32706J) {
            return (z13 ? o5.i.f92907d : o5.i.f92906c).f(charSequence.length(), charSequence);
        }
        return z13;
    }

    public final void d(float f13) {
        float f14;
        boolean z13 = this.f32711c;
        RectF rectF = this.f32723i;
        Rect rect = this.f32721h;
        Rect rect2 = this.f32719g;
        if (z13) {
            if (f13 < this.f32715e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = l(rect2.left, rect.left, f13, this.V);
            rectF.top = l(this.f32739q, this.f32740r, f13, this.V);
            rectF.right = l(rect2.right, rect.right, f13, this.V);
            rectF.bottom = l(rect2.bottom, rect.bottom, f13, this.V);
        }
        if (!this.f32711c) {
            this.f32743u = l(this.f32741s, this.f32742t, f13, this.V);
            this.f32744v = l(this.f32739q, this.f32740r, f13, this.V);
            x(f13);
            f14 = f13;
        } else if (f13 < this.f32715e) {
            this.f32743u = this.f32741s;
            this.f32744v = this.f32739q;
            x(0.0f);
            f14 = 0.0f;
        } else {
            this.f32743u = this.f32742t;
            this.f32744v = this.f32740r - Math.max(0, this.f32717f);
            x(1.0f);
            f14 = 1.0f;
        }
        q6.b bVar = gj.a.f65168b;
        this.f32728k0 = 1.0f - l(0.0f, 1.0f, 1.0f - f13, bVar);
        WeakHashMap weakHashMap = v0.f102521a;
        View view = this.f32707a;
        view.postInvalidateOnAnimation();
        this.f32730l0 = l(1.0f, 0.0f, f13, bVar);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f32735o;
        ColorStateList colorStateList2 = this.f32733n;
        TextPaint textPaint = this.T;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(i(), f14, h(this.f32735o)));
        } else {
            textPaint.setColor(h(colorStateList));
        }
        int i13 = Build.VERSION.SDK_INT;
        float f15 = this.f32718f0;
        float f16 = this.f32720g0;
        if (f15 != f16) {
            textPaint.setLetterSpacing(l(f16, f15, f13, bVar));
        } else {
            textPaint.setLetterSpacing(f15);
        }
        this.N = l(this.f32710b0, this.X, f13, null);
        this.O = l(this.f32712c0, this.Y, f13, null);
        this.P = l(this.f32714d0, this.Z, f13, null);
        int a13 = a(h(this.f32716e0), f13, h(this.f32708a0));
        this.Q = a13;
        textPaint.setShadowLayer(this.N, this.O, this.P, a13);
        if (this.f32711c) {
            textPaint.setAlpha((int) (b(f13) * textPaint.getAlpha()));
            if (i13 >= 31) {
                textPaint.setShadowLayer(this.N, this.O, this.P, b7.c.m(this.Q, textPaint.getAlpha()));
            }
        }
        view.postInvalidateOnAnimation();
    }

    public final void e(float f13, boolean z13) {
        float f14;
        float f15;
        Typeface typeface;
        boolean z14;
        Layout.Alignment alignment;
        if (this.G == null) {
            return;
        }
        float width = this.f32721h.width();
        float width2 = this.f32719g.width();
        if (k(f13, 1.0f)) {
            f14 = this.f32731m;
            f15 = this.f32718f0;
            this.L = 1.0f;
            typeface = this.f32745w;
        } else {
            float f16 = this.f32729l;
            float f17 = this.f32720g0;
            Typeface typeface2 = this.f32748z;
            if (k(f13, 0.0f)) {
                this.L = 1.0f;
            } else {
                this.L = l(this.f32729l, this.f32731m, f13, this.W) / this.f32729l;
            }
            float f18 = this.f32731m / this.f32729l;
            width = (z13 || this.f32711c || width2 * f18 <= width) ? width2 : Math.min(width / f18, width2);
            f14 = f16;
            f15 = f17;
            typeface = typeface2;
        }
        TextPaint textPaint = this.T;
        if (width > 0.0f) {
            boolean z15 = this.M != f14;
            boolean z16 = this.f32722h0 != f15;
            boolean z17 = this.C != typeface;
            StaticLayout staticLayout = this.f32724i0;
            boolean z18 = z15 || z16 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z17 || this.S;
            this.M = f14;
            this.f32722h0 = f15;
            this.C = typeface;
            this.S = false;
            textPaint.setLinearText(this.L != 1.0f);
            z14 = z18;
        } else {
            z14 = false;
        }
        if (this.H == null || z14) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.C);
            textPaint.setLetterSpacing(this.f32722h0);
            this.I = c(this.G);
            int i13 = y() ? this.f32734n0 : 1;
            boolean z19 = this.I;
            if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f32725j, z19 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            y yVar = new y(this.G, textPaint, (int) width);
            yVar.f32815l = this.F;
            yVar.f32814k = z19;
            yVar.f32808e = alignment;
            yVar.f32813j = false;
            yVar.f32809f = i13;
            float f19 = this.f32736o0;
            yVar.f32810g = 0.0f;
            yVar.f32811h = f19;
            yVar.f32812i = this.f32738p0;
            StaticLayout a13 = yVar.a();
            a13.getClass();
            this.f32724i0 = a13;
            this.H = a13.getText();
        }
    }

    public final void f(Canvas canvas) {
        int save = canvas.save();
        if (this.H != null) {
            RectF rectF = this.f32723i;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.T;
            textPaint.setTextSize(this.M);
            float f13 = this.f32743u;
            float f14 = this.f32744v;
            float f15 = this.L;
            if (f15 != 1.0f && !this.f32711c) {
                canvas.scale(f15, f15, f13, f14);
            }
            if (!y() || (this.f32711c && this.f32709b <= this.f32715e)) {
                canvas.translate(f13, f14);
                this.f32724i0.draw(canvas);
            } else {
                float lineStart = this.f32743u - this.f32724i0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f14);
                if (!this.f32711c) {
                    textPaint.setAlpha((int) (this.f32730l0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, b7.c.m(this.Q, textPaint.getAlpha()));
                    }
                    this.f32724i0.draw(canvas);
                }
                if (!this.f32711c) {
                    textPaint.setAlpha((int) (this.f32728k0 * alpha));
                }
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, b7.c.m(this.Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.f32724i0.getLineBaseline(0);
                CharSequence charSequence = this.f32732m0;
                float f16 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f16, textPaint);
                if (i13 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.f32711c) {
                    String trim = this.f32732m0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f32724i0.getLineEnd(0), str.length()), 0.0f, f16, (Paint) textPaint);
                }
            }
            canvas.restoreToCount(save);
        }
    }

    public final float g() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.f32731m);
        textPaint.setTypeface(this.f32745w);
        textPaint.setLetterSpacing(this.f32718f0);
        return -textPaint.ascent();
    }

    public final int h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int i() {
        return h(this.f32733n);
    }

    public final float j() {
        return this.f32709b;
    }

    public final void m(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f32747y;
            if (typeface != null) {
                this.f32746x = m0.Y(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = m0.Y(configuration, typeface2);
            }
            Typeface typeface3 = this.f32746x;
            if (typeface3 == null) {
                typeface3 = this.f32747y;
            }
            this.f32745w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f32748z = typeface4;
            n(true);
        }
    }

    public final void n(boolean z13) {
        StaticLayout staticLayout;
        View view = this.f32707a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z13) {
            return;
        }
        e(1.0f, z13);
        CharSequence charSequence = this.H;
        TextPaint textPaint = this.T;
        if (charSequence != null && (staticLayout = this.f32724i0) != null) {
            this.f32732m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.f32732m0;
        float f13 = 0.0f;
        if (charSequence2 != null) {
            this.f32726j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f32726j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f32727k, this.I ? 1 : 0);
        int i13 = absoluteGravity & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        Rect rect = this.f32721h;
        if (i13 == 48) {
            this.f32740r = rect.top;
        } else if (i13 != 80) {
            this.f32740r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f32740r = textPaint.ascent() + rect.bottom;
        }
        int i14 = absoluteGravity & 8388615;
        if (i14 == 1) {
            this.f32742t = rect.centerX() - (this.f32726j0 / 2.0f);
        } else if (i14 != 5) {
            this.f32742t = rect.left;
        } else {
            this.f32742t = rect.right - this.f32726j0;
        }
        e(0.0f, z13);
        float height = this.f32724i0 != null ? r12.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f32724i0;
        if (staticLayout2 == null || this.f32734n0 <= 1) {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                f13 = textPaint.measureText(charSequence3, 0, charSequence3.length());
            }
        } else {
            f13 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f32724i0;
        this.f32737p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f32725j, this.I ? 1 : 0);
        int i15 = absoluteGravity2 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        Rect rect2 = this.f32719g;
        if (i15 == 48) {
            this.f32739q = rect2.top;
        } else if (i15 != 80) {
            this.f32739q = rect2.centerY() - (height / 2.0f);
        } else {
            this.f32739q = textPaint.descent() + (rect2.bottom - height);
        }
        int i16 = absoluteGravity2 & 8388615;
        if (i16 == 1) {
            this.f32741s = rect2.centerX() - (f13 / 2.0f);
        } else if (i16 != 5) {
            this.f32741s = rect2.left;
        } else {
            this.f32741s = rect2.right - f13;
        }
        Bitmap bitmap = this.K;
        if (bitmap != null) {
            bitmap.recycle();
            this.K = null;
        }
        x(this.f32709b);
        d(this.f32709b);
    }

    public final void o(ColorStateList colorStateList) {
        if (this.f32735o == colorStateList && this.f32733n == colorStateList) {
            return;
        }
        this.f32735o = colorStateList;
        this.f32733n = colorStateList;
        n(false);
    }

    public final void p(Rect rect) {
        int i13 = rect.left;
        int i14 = rect.top;
        int i15 = rect.right;
        int i16 = rect.bottom;
        Rect rect2 = this.f32721h;
        if (rect2.left == i13 && rect2.top == i14 && rect2.right == i15 && rect2.bottom == i16) {
            return;
        }
        rect2.set(i13, i14, i15, i16);
        this.S = true;
    }

    public final void q(int i13) {
        View view = this.f32707a;
        yj.e eVar = new yj.e(view.getContext(), i13);
        ColorStateList colorStateList = eVar.f139200j;
        if (colorStateList != null) {
            this.f32735o = colorStateList;
        }
        float f13 = eVar.f139201k;
        if (f13 != 0.0f) {
            this.f32731m = f13;
        }
        ColorStateList colorStateList2 = eVar.f139191a;
        if (colorStateList2 != null) {
            this.f32708a0 = colorStateList2;
        }
        this.Y = eVar.f139195e;
        this.Z = eVar.f139196f;
        this.X = eVar.f139197g;
        this.f32718f0 = eVar.f139199i;
        yj.b bVar = this.E;
        if (bVar != null) {
            bVar.f139184r = true;
        }
        rd.j jVar = new rd.j(this, 14);
        eVar.a();
        this.E = new yj.b(jVar, eVar.f139204n);
        eVar.c(view.getContext(), this.E);
        n(false);
    }

    public final void r(ColorStateList colorStateList) {
        if (this.f32735o != colorStateList) {
            this.f32735o = colorStateList;
            n(false);
        }
    }

    public final boolean s(Typeface typeface) {
        yj.b bVar = this.E;
        if (bVar != null) {
            bVar.f139184r = true;
        }
        if (this.f32747y == typeface) {
            return false;
        }
        this.f32747y = typeface;
        Typeface Y = m0.Y(this.f32707a.getContext().getResources().getConfiguration(), typeface);
        this.f32746x = Y;
        if (Y == null) {
            Y = this.f32747y;
        }
        this.f32745w = Y;
        return true;
    }

    public final void t(Rect rect) {
        int i13 = rect.left;
        int i14 = rect.top;
        int i15 = rect.right;
        int i16 = rect.bottom;
        Rect rect2 = this.f32719g;
        if (rect2.left == i13 && rect2.top == i14 && rect2.right == i15 && rect2.bottom == i16) {
            return;
        }
        rect2.set(i13, i14, i15, i16);
        this.S = true;
    }

    public final void u(int i13) {
        View view = this.f32707a;
        yj.e eVar = new yj.e(view.getContext(), i13);
        ColorStateList colorStateList = eVar.f139200j;
        if (colorStateList != null) {
            this.f32733n = colorStateList;
        }
        float f13 = eVar.f139201k;
        if (f13 != 0.0f) {
            this.f32729l = f13;
        }
        ColorStateList colorStateList2 = eVar.f139191a;
        if (colorStateList2 != null) {
            this.f32716e0 = colorStateList2;
        }
        this.f32712c0 = eVar.f139195e;
        this.f32714d0 = eVar.f139196f;
        this.f32710b0 = eVar.f139197g;
        this.f32720g0 = eVar.f139199i;
        yj.b bVar = this.D;
        if (bVar != null) {
            bVar.f139184r = true;
        }
        u6 u6Var = new u6(this, 12);
        eVar.a();
        this.D = new yj.b(u6Var, eVar.f139204n);
        eVar.c(view.getContext(), this.D);
        n(false);
    }

    public final boolean v(Typeface typeface) {
        yj.b bVar = this.D;
        if (bVar != null) {
            bVar.f139184r = true;
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface Y = m0.Y(this.f32707a.getContext().getResources().getConfiguration(), typeface);
        this.A = Y;
        if (Y == null) {
            Y = this.B;
        }
        this.f32748z = Y;
        return true;
    }

    public final void w(float f13) {
        float p13 = com.bumptech.glide.c.p(f13, 0.0f, 1.0f);
        if (p13 != this.f32709b) {
            this.f32709b = p13;
            d(p13);
        }
    }

    public final void x(float f13) {
        e(f13, false);
        WeakHashMap weakHashMap = v0.f102521a;
        this.f32707a.postInvalidateOnAnimation();
    }

    public final boolean y() {
        return this.f32734n0 > 1 && (!this.I || this.f32711c);
    }
}
