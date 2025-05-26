package rl1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.pinterest.ui.imageview.WebImageView;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class k {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public String H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public float f108597J;
    public int K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public WebImageView f108598a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f108599b = xk2.m.b(new h(this, 2));

    /* renamed from: c, reason: collision with root package name */
    public final m f108600c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f108601d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f108602e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.k f108603f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.k f108604g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.k f108605h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.k f108606i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.k f108607j;

    /* renamed from: k, reason: collision with root package name */
    public final i f108608k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f108609l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f108610m;

    /* renamed from: n, reason: collision with root package name */
    public int f108611n;

    /* renamed from: o, reason: collision with root package name */
    public String f108612o;

    /* renamed from: p, reason: collision with root package name */
    public Bitmap.Config f108613p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f108614q;

    /* renamed from: r, reason: collision with root package name */
    public int f108615r;

    /* renamed from: s, reason: collision with root package name */
    public int f108616s;

    /* renamed from: t, reason: collision with root package name */
    public int f108617t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f108618u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f108619v;

    /* renamed from: w, reason: collision with root package name */
    public int f108620w;

    /* renamed from: x, reason: collision with root package name */
    public int f108621x;

    /* renamed from: y, reason: collision with root package name */
    public int f108622y;

    /* renamed from: z, reason: collision with root package name */
    public int f108623z;

    public k() {
        xk2.m.b(new h(this, 6));
        this.f108600c = m.LG;
        xk2.n nVar = xk2.n.NONE;
        this.f108603f = xk2.m.a(nVar, new h(this, 1));
        this.f108604g = xk2.m.a(nVar, new h(this, 0));
        this.f108605h = xk2.m.a(nVar, new h(this, 8));
        this.f108606i = xk2.m.a(nVar, new h(this, 7));
        this.f108607j = xk2.m.a(nVar, new h(this, 5));
        this.f108608k = new i(this, 0);
        this.f108609l = xk2.m.b(new h(this, 3));
        this.f108610m = xk2.m.b(new h(this, 4));
        this.f108612o = "";
        this.f108613p = Bitmap.Config.RGB_565;
        this.f108614q = true;
        this.f108615r = -1;
        this.f108617t = -1;
        this.f108620w = -1;
        this.f108621x = -1;
        this.f108622y = -1;
        this.A = true;
        this.B = -1;
        this.C = -1;
        this.D = true;
        this.E = l.f108627d;
        this.F = -1;
        this.H = "";
        this.I = -1;
        this.f108597J = -1.0f;
        this.K = -1;
        this.L = true;
    }

    public final void a(Canvas canvas) {
        if (canvas != null) {
            if (this.f108614q) {
                canvas.drawCircle(this.N, this.O, this.P, (Paint) this.f108603f.getValue());
            }
            canvas.drawCircle(this.N, this.O, this.P - (this.f108614q ? this.f108615r : 0), (Paint) this.f108604g.getValue());
            this.f108602e = true;
            if (this.H.length() > 0) {
                String substring = this.H.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String upperCase = substring.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                canvas.drawText(upperCase, this.Y, this.Z, h());
            }
        }
        this.f108601d = true;
    }

    public final void b(Canvas canvas) {
        Drawable drawable = this.f108619v;
        if (drawable == null || canvas == null) {
            return;
        }
        if (this.A) {
            canvas.drawCircle(this.U, this.V, this.X, (Paint) this.f108605h.getValue());
        }
        if (this.D) {
            canvas.drawCircle(this.U, this.V, this.W, j());
        }
        int i13 = this.Q;
        int i14 = this.f108623z;
        drawable.setBounds(i13 + i14, this.R + i14, this.S - i14, this.T - i14);
        int i15 = this.G;
        if (i15 != 0) {
            d7.b.A0(drawable, i15);
        }
        drawable.draw(canvas);
    }

    public final int c(int i13) {
        Context d2 = d();
        Intrinsics.checkNotNullExpressionValue(d2, "<get-context>(...)");
        return bs1.c.A(d2, i13);
    }

    public final Context d() {
        return (Context) this.f108599b.getValue();
    }

    public final int e() {
        return ((Number) this.f108609l.getValue()).intValue();
    }

    public final int f() {
        return ((Number) this.f108610m.getValue()).intValue();
    }

    public final int g() {
        WebImageView webImageView = this.f108598a;
        if (webImageView != null) {
            int i13 = this.f108611n;
            return i13 > 0 ? i13 : (webImageView.getMeasuredWidth() <= 0 || webImageView.getMeasuredHeight() <= 0) ? webImageView.getMeasuredWidth() > 0 ? webImageView.getMeasuredWidth() : webImageView.getMeasuredHeight() : Math.min(webImageView.getMeasuredWidth(), webImageView.getMeasuredHeight());
        }
        Intrinsics.r("avatarView");
        throw null;
    }

    public final TextPaint h() {
        return (TextPaint) this.f108607j.getValue();
    }

    public final boolean i() {
        return this.f108612o.length() == 0 || StringsKt.E(this.f108612o, "default_", false) || this.M;
    }

    public final Paint j() {
        return (Paint) this.f108606i.getValue();
    }

    public final void k(WebImageView avatarView, g viewModel) {
        Intrinsics.checkNotNullParameter(avatarView, "avatarView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f108598a = avatarView;
        avatarView.setWillNotDraw(false);
        avatarView.k2(true);
        avatarView.Y(this.f108608k);
        avatarView.i2(true);
        r(viewModel);
    }

    public final void l() {
        WebImageView webImageView = this.f108598a;
        if (webImageView != null) {
            webImageView.invalidate();
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }

    public final void m(String str) {
        if (StringsKt.E(str, "default_", false)) {
            this.M = true;
        } else {
            Bitmap.Config config = this.f108613p;
            WebImageView webImageView = this.f108598a;
            if (webImageView == null) {
                Intrinsics.r("avatarView");
                throw null;
            }
            webImageView.V1(str, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : config, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        }
        WebImageView webImageView2 = this.f108598a;
        if (webImageView2 != null) {
            webImageView2.postInvalidate();
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }

    public final void n() {
        WebImageView webImageView = this.f108598a;
        if (webImageView != null) {
            webImageView.requestLayout();
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }

    public final void o(int i13) {
        WebImageView webImageView = this.f108598a;
        if (webImageView != null) {
            webImageView.setId(i13);
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }

    public final void p(int i13, boolean z13) {
        float f13 = i13;
        float f14 = f13 / 2.0f;
        this.P = f14;
        this.N = f14;
        this.O = f14;
        WebImageView webImageView = this.f108598a;
        if (webImageView == null) {
            Intrinsics.r("avatarView");
            throw null;
        }
        webImageView.M1(this.f108614q ? this.f108615r : 0);
        float f15 = this.N;
        float f16 = this.O;
        TextPaint h10 = h();
        float f17 = this.f108597J;
        if (1.0f > f17 || f17 > f13) {
            f17 = 0.6f * f13;
        }
        h10.setTextSize(f17);
        this.Y = f15;
        this.Z = f16 - ((h().ascent() + h().descent()) / 2.0f);
        int i14 = this.f108621x;
        if (1 > i14 || i14 > i13) {
            i14 = ml2.c.c(0.2f * f13);
        }
        float f18 = i14;
        float f19 = f13 - f18;
        int c13 = ml2.c.c(f19 - (this.A ? this.B : 0));
        int i15 = this.f108622y;
        if (i15 < 0 || i15 > c13) {
            i15 = ml2.c.c(f13 * 0.04f);
        }
        int c14 = ml2.c.c((f19 - i15) - (this.A ? this.B : 0));
        this.Q = c14;
        this.R = c14;
        float f23 = c14;
        int i16 = (int) (f23 + f18);
        this.S = i16;
        this.T = i16;
        float f24 = f18 / 2.0f;
        this.W = f24;
        float f25 = f23 + f24;
        this.U = f25;
        this.V = f25;
        this.X = f24 + (this.A ? this.B : 0);
        if (z13) {
            WebImageView webImageView2 = this.f108598a;
            if (webImageView2 == null) {
                Intrinsics.r("avatarView");
                throw null;
            }
            Drawable drawable = webImageView2.f34152e;
            if (drawable != null) {
                drawable.setBounds(0, 0, 0, 0);
                webImageView2.invalidate();
            }
        }
        WebImageView webImageView3 = this.f108598a;
        if (webImageView3 == null) {
            Intrinsics.r("avatarView");
            throw null;
        }
        Drawable drawable2 = webImageView3.f34152e;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, i13, i13);
            webImageView3.invalidate();
        }
        Bitmap.Config config = i13 >= 72 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        if (this.f108613p != config) {
            this.f108613p = config;
            m(this.f108612o);
        }
    }

    public final void q(int i13, int i14) {
        if (this.f108620w != i13) {
            this.f108620w = i13;
            if (i13 != -1) {
                Context d2 = d();
                Intrinsics.checkNotNullExpressionValue(d2, "<get-context>(...)");
                this.f108619v = bs1.c.c0(d2, i13);
            }
            if (this.F != i14) {
                this.F = i14;
                this.G = i14 != -1 ? c(i14) : 0;
                l();
            }
            n();
        }
    }

    public final void r(g viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        g a13 = g.a(viewModel, viewModel.f108574a, null, viewModel.f108578e, null, viewModel.f108580g, null, 4014);
        int i13 = this.f108611n;
        int i14 = a13.f108574a;
        if (i13 != i14) {
            this.f108611n = i14;
            n();
        }
        String imageUrl = a13.f108575b;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (!Intrinsics.d(this.f108612o, imageUrl)) {
            this.f108612o = imageUrl;
            if (imageUrl.length() > 0) {
                m(this.f108612o);
            } else {
                WebImageView webImageView = this.f108598a;
                if (webImageView == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                webImageView.clear();
            }
        }
        this.f108602e = false;
        int i15 = this.K;
        int i16 = a13.f108576c;
        if (i15 != i16) {
            this.K = i16;
            ((Paint) this.f108604g.getValue()).setColor(c(this.K));
            l();
        }
        this.L = a13.f108577d;
        m(this.f108612o);
        o oVar = a13.f108578e;
        int i17 = oVar.f108643b;
        if (i17 == -1) {
            i17 = e();
        }
        m0 m0Var = a13.f108579f;
        int i18 = m0Var.f108636g;
        int i19 = i18 != -1 ? i18 : i17;
        int i23 = m0Var.f108637h;
        if (i23 == -1) {
            i23 = oVar.f108644c;
        }
        int i24 = i23;
        h0 h0Var = a13.f108580g;
        float f13 = h0Var.f108592c;
        if (f13 == -1.0f) {
            f13 = f();
        }
        int i25 = a13.f108583j;
        if (i25 != Integer.MIN_VALUE) {
            o(i25);
        }
        o a14 = o.a(oVar, i17, 0, 5);
        boolean z13 = this.f108614q;
        boolean z14 = a14.f108642a;
        if (z13 != z14) {
            this.f108614q = z14;
            p(g(), true);
            n();
        }
        int i26 = this.f108615r;
        int i27 = a14.f108643b;
        if (i26 != i27) {
            this.f108615r = i27;
            p(g(), true);
            n();
        }
        int i28 = this.f108617t;
        int i29 = a14.f108644c;
        if (i28 != i29) {
            this.f108617t = i29;
            int c13 = c(i29);
            if (this.f108616s != c13) {
                this.f108616s = c13;
                ((Paint) this.f108603f.getValue()).setColor(this.f108616s);
                WebImageView webImageView2 = this.f108598a;
                if (webImageView2 == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                webImageView2.o0(this.f108616s);
                l();
            }
        }
        h0 a15 = h0.a(h0Var, null, 0, f13, 3);
        String name = a15.f108590a;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f108601d = false;
        if (!kotlin.text.z.i(this.H, name, true)) {
            this.H = name;
            if (i()) {
                l();
            }
        }
        int i33 = this.I;
        int i34 = a15.f108591b;
        if (i33 != i34) {
            this.I = i34;
            h().setColor(c(this.I));
            if (i()) {
                l();
            }
        }
        float f14 = this.f108597J;
        float f15 = a15.f108592c;
        if (f14 != f15) {
            this.f108597J = f15;
            TextPaint h10 = h();
            int g13 = g();
            float f16 = this.f108597J;
            if (1.0f > f16 || f16 > g13) {
                f16 = 0.6f * g13;
            }
            h10.setTextSize(f16);
            if (i()) {
                n();
            }
        }
        m0 a16 = m0.a(a13.f108579f, false, 0, i19, i24, 0, 1855);
        boolean z15 = this.f108618u;
        boolean z16 = a16.f108630a;
        if (z15 != z16) {
            this.f108618u = z16;
            n();
        }
        q(a16.f108631b, eo1.b.color_gray_500);
        int i35 = this.f108621x;
        int i36 = a16.f108632c;
        if (i35 != i36) {
            this.f108621x = i36;
            p(g(), true);
            n();
        }
        int i37 = this.f108622y;
        int i38 = a16.f108633d;
        if (i37 != i38) {
            this.f108622y = i38;
            p(g(), true);
            n();
        }
        int i39 = this.f108623z;
        int i43 = a16.f108634e;
        if (i39 != i43) {
            this.f108623z = i43;
            l();
        }
        boolean z17 = this.A;
        boolean z18 = a16.f108635f;
        if (z17 != z18) {
            this.A = z18;
            p(g(), true);
            n();
        }
        int i44 = this.B;
        int i45 = a16.f108636g;
        if (i44 != i45) {
            this.B = i45;
            p(g(), true);
            n();
        }
        int i46 = this.C;
        int i47 = a16.f108637h;
        if (i46 != i47) {
            this.C = i47;
            ((Paint) this.f108605h.getValue()).setColor(c(this.C));
            l();
        }
        boolean z19 = this.D;
        boolean z23 = a16.f108638i;
        if (z19 != z23) {
            this.D = z23;
            l();
        }
        int i48 = this.E;
        int i49 = a16.f108639j;
        if (i48 != i49) {
            this.E = i49;
            j().setColor(c(this.E));
            l();
        }
        int i53 = this.F;
        int i54 = a16.f108640k;
        if (i53 != i54) {
            this.F = i54;
            this.G = i54 != -1 ? c(i54) : 0;
            l();
        }
        WebImageView webImageView3 = this.f108598a;
        if (webImageView3 == null) {
            Intrinsics.r("avatarView");
            throw null;
        }
        webImageView3.setVisibility(a13.f108582i.getVisibility());
        String str = a13.f108581h;
        if (!kotlin.text.z.j(str)) {
            WebImageView webImageView4 = this.f108598a;
            if (webImageView4 == null) {
                Intrinsics.r("avatarView");
                throw null;
            }
            webImageView4.setContentDescription(str);
        }
        WebImageView webImageView5 = this.f108598a;
        if (webImageView5 != null) {
            webImageView5.setImportantForAccessibility(a13.f108585l.getImportantForAccessibility());
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }
}
