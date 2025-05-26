package rl1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import java.util.Locale;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class e0 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public String G;
    public final String H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public float f108544J;
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
    public WebImageView f108545a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f108546b = xk2.m.b(new d0(this, 2));

    /* renamed from: c, reason: collision with root package name */
    public m f108547c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f108548d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.k f108549e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.k f108550f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.k f108551g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.k f108552h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.k f108553i;

    /* renamed from: j, reason: collision with root package name */
    public final oq.i f108554j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f108555k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f108556l;

    /* renamed from: m, reason: collision with root package name */
    public int f108557m;

    /* renamed from: n, reason: collision with root package name */
    public String f108558n;

    /* renamed from: o, reason: collision with root package name */
    public Bitmap.Config f108559o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f108560p;

    /* renamed from: q, reason: collision with root package name */
    public int f108561q;

    /* renamed from: r, reason: collision with root package name */
    public int f108562r;

    /* renamed from: s, reason: collision with root package name */
    public int f108563s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f108564t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f108565u;

    /* renamed from: v, reason: collision with root package name */
    public int f108566v;

    /* renamed from: w, reason: collision with root package name */
    public int f108567w;

    /* renamed from: x, reason: collision with root package name */
    public int f108568x;

    /* renamed from: y, reason: collision with root package name */
    public int f108569y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f108570z;

    public e0() {
        xk2.m.b(new d0(this, 7));
        this.f108547c = m.LG;
        this.f108548d = xk2.m.b(new d0(this, 5));
        xk2.n nVar = xk2.n.NONE;
        this.f108549e = xk2.m.a(nVar, new d0(this, 1));
        this.f108550f = xk2.m.a(nVar, new d0(this, 0));
        this.f108551g = xk2.m.a(nVar, new d0(this, 9));
        this.f108552h = xk2.m.a(nVar, new d0(this, 8));
        this.f108553i = xk2.m.a(nVar, new d0(this, 6));
        this.f108554j = new oq.i(this, 16);
        this.f108555k = xk2.m.b(new d0(this, 3));
        this.f108556l = xk2.m.b(new d0(this, 4));
        this.f108558n = "";
        this.f108559o = Bitmap.Config.RGB_565;
        this.f108560p = true;
        this.f108561q = -1;
        this.f108563s = -1;
        this.f108566v = -1;
        this.f108567w = -1;
        this.f108568x = -1;
        this.f108570z = true;
        this.A = -1;
        this.B = -1;
        this.C = true;
        this.D = l.f108627d;
        this.E = -1;
        this.G = "";
        this.H = "";
        this.I = -1;
        this.f108544J = -1.0f;
        this.K = -1;
        this.L = true;
    }

    public static m i(Context context, int i13) {
        return i13 <= dl2.b.F0(context, eo1.a.comp_avatar_xs_size) ? m.XS : i13 <= dl2.b.F0(context, eo1.a.comp_avatar_sm_size) ? m.SM : i13 <= dl2.b.F0(context, eo1.a.comp_avatar_md_size) ? m.MD : i13 <= dl2.b.F0(context, eo1.a.comp_avatar_lg_size) ? m.LG : i13 <= dl2.b.F0(context, eo1.a.comp_avatar_xl_size) ? m.XL : m.XXL;
    }

    public final void a(Canvas canvas) {
        Object obj;
        boolean l13 = l();
        xk2.k kVar = this.f108550f;
        if (l13) {
            Context d2 = d();
            Intrinsics.checkNotNullExpressionValue(d2, "<get-context>(...)");
            boolean q03 = pk.a0.q0(d2);
            String id3 = this.H;
            if (q03) {
                List list = n.f108641a;
                Intrinsics.checkNotNullParameter(id3, "id");
                obj = ((List) n.f108641a.get(g3.x(id3))).get(1);
            } else {
                List list2 = n.f108641a;
                Intrinsics.checkNotNullParameter(id3, "id");
                obj = ((List) n.f108641a.get(g3.x(id3))).get(0);
            }
            this.K = ((Number) obj).intValue();
            ((Paint) kVar.getValue()).setColor(c(this.K));
        }
        if (canvas != null) {
            if (this.f108560p) {
                canvas.drawCircle(this.N, this.O, this.P, (Paint) this.f108549e.getValue());
            }
            canvas.drawCircle(this.N, this.O, this.P - (this.f108560p ? this.f108561q : 0), (Paint) kVar.getValue());
            if (this.G.length() > 0) {
                String substring = this.G.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String upperCase = substring.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                canvas.drawText(upperCase, this.Y, this.Z, f());
            }
        }
    }

    public final void b(Canvas canvas) {
        Drawable drawable = this.f108565u;
        if (drawable == null || canvas == null) {
            return;
        }
        if (this.f108570z) {
            canvas.drawCircle(this.U, this.V, this.X, (Paint) this.f108551g.getValue());
        }
        if (this.C) {
            canvas.drawCircle(this.U, this.V, this.W, (Paint) this.f108552h.getValue());
        }
        int i13 = this.Q;
        int i14 = this.f108569y;
        drawable.setBounds(i13 + i14, this.R + i14, this.S - i14, this.T - i14);
        int i15 = this.F;
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
        return (Context) this.f108546b.getValue();
    }

    public final int e() {
        WebImageView webImageView = this.f108545a;
        if (webImageView != null) {
            int i13 = this.f108557m;
            return i13 > 0 ? i13 : (webImageView.getMeasuredWidth() <= 0 || webImageView.getMeasuredHeight() <= 0) ? webImageView.getMeasuredWidth() > 0 ? webImageView.getMeasuredWidth() : webImageView.getMeasuredHeight() : Math.min(webImageView.getMeasuredWidth(), webImageView.getMeasuredHeight());
        }
        Intrinsics.r("avatarView");
        throw null;
    }

    public final TextPaint f() {
        return (TextPaint) this.f108553i.getValue();
    }

    public final float g(int i13) {
        if (!l()) {
            float f13 = this.f108544J;
            if (1.0f > f13 || f13 > i13) {
                return i13 * 0.6f;
            }
        }
        return this.f108544J;
    }

    public final boolean h() {
        return this.f108558n.length() == 0 || StringsKt.E(this.f108558n, "default_", false) || this.M;
    }

    public final void j(Context context, AttributeSet attributeSet) {
        WebImageView webImageView = this.f108545a;
        if (webImageView == null) {
            Intrinsics.r("avatarView");
            throw null;
        }
        webImageView.setWillNotDraw(false);
        webImageView.k2(true);
        webImageView.Y(this.f108554j);
        webImageView.i2(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l0.Avatar);
            Intrinsics.f(obtainStyledAttributes);
            u(n.a(obtainStyledAttributes));
            obtainStyledAttributes.recycle();
        }
    }

    public final void k() {
        WebImageView webImageView = this.f108545a;
        if (webImageView != null) {
            webImageView.invalidate();
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }

    public final boolean l() {
        return ((Boolean) this.f108548d.getValue()).booleanValue();
    }

    public final void m(String str) {
        if (StringsKt.E(str, "default_", false)) {
            this.M = true;
        } else {
            Bitmap.Config config = this.f108559o;
            WebImageView webImageView = this.f108545a;
            if (webImageView == null) {
                Intrinsics.r("avatarView");
                throw null;
            }
            webImageView.V1(str, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : config, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        }
        WebImageView webImageView2 = this.f108545a;
        if (webImageView2 != null) {
            webImageView2.postInvalidate();
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }

    public final void n() {
        WebImageView webImageView = this.f108545a;
        if (webImageView != null) {
            webImageView.requestLayout();
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }

    public final void o(int i13) {
        if (this.f108562r != i13) {
            if (l()) {
                Context d2 = d();
                Intrinsics.checkNotNullExpressionValue(d2, "<get-context>(...)");
                i13 = dl2.b.x0(d2, eo1.a.comp_avatar_border_color);
            }
            this.f108562r = i13;
            ((Paint) this.f108549e.getValue()).setColor(this.f108562r);
            WebImageView webImageView = this.f108545a;
            if (webImageView == null) {
                Intrinsics.r("avatarView");
                throw null;
            }
            webImageView.o0(this.f108562r);
            k();
        }
    }

    public final void p(int i13) {
        if (this.f108561q != i13) {
            if (l()) {
                Context d2 = d();
                Intrinsics.checkNotNullExpressionValue(d2, "<get-context>(...)");
                i13 = dl2.b.F0(d2, eo1.a.comp_avatar_border_weight);
            }
            this.f108561q = i13;
            s(e(), true);
            n();
        }
    }

    public final void q(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (Intrinsics.d(this.f108558n, imageUrl)) {
            return;
        }
        this.f108558n = imageUrl;
        if (imageUrl.length() > 0) {
            m(this.f108558n);
            return;
        }
        WebImageView webImageView = this.f108545a;
        if (webImageView != null) {
            webImageView.clear();
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }

    public final void r(int i13) {
        if (this.f108557m != i13) {
            if (l()) {
                Context d2 = d();
                Intrinsics.checkNotNullExpressionValue(d2, "<get-context>(...)");
                m i14 = i(d2, i13);
                this.f108547c = i14;
                Context d13 = d();
                Intrinsics.checkNotNullExpressionValue(d13, "<get-context>(...)");
                i13 = dl2.b.F0(d13, i14.getAvatarSize());
            }
            this.f108557m = i13;
            n();
        }
    }

    public final void s(int i13, boolean z13) {
        float f13 = i13;
        float f14 = f13 / 2.0f;
        this.P = f14;
        this.N = f14;
        this.O = f14;
        WebImageView webImageView = this.f108545a;
        if (webImageView == null) {
            Intrinsics.r("avatarView");
            throw null;
        }
        webImageView.M1(this.f108560p ? this.f108561q : 0);
        float f15 = this.N;
        float f16 = this.O;
        f().setTextSize(g(i13));
        this.Y = f15;
        this.Z = f16 - ((f().ascent() + f().descent()) / 2.0f);
        int i14 = this.f108567w;
        if (1 > i14 || i14 > i13) {
            i14 = ml2.c.c(0.2f * f13);
        }
        float f17 = i14;
        float f18 = f13 - f17;
        int c13 = ml2.c.c(f18 - (this.f108570z ? this.A : 0));
        int i15 = this.f108568x;
        if (i15 < 0 || i15 > c13) {
            i15 = ml2.c.c(f13 * 0.04f);
        }
        int c14 = ml2.c.c((f18 - i15) - (this.f108570z ? this.A : 0));
        this.Q = c14;
        this.R = c14;
        float f19 = c14;
        int i16 = (int) (f19 + f17);
        this.S = i16;
        this.T = i16;
        float f23 = f17 / 2.0f;
        this.W = f23;
        float f24 = f19 + f23;
        this.U = f24;
        this.V = f24;
        this.X = f23 + (this.f108570z ? this.A : 0);
        if (z13) {
            WebImageView webImageView2 = this.f108545a;
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
        WebImageView webImageView3 = this.f108545a;
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
        if (this.f108559o != config) {
            this.f108559o = config;
            m(this.f108558n);
        }
    }

    public final void t(int i13, int i14) {
        if (this.f108566v != i13) {
            this.f108566v = i13;
            if (i13 != -1) {
                Context d2 = d();
                Intrinsics.checkNotNullExpressionValue(d2, "<get-context>(...)");
                this.f108565u = bs1.c.c0(d2, i13);
            }
            if (this.E != i14) {
                this.E = i14;
                this.F = i14 != -1 ? c(i14) : 0;
                k();
            }
            n();
        }
    }

    public final void u(g viewModel) {
        int i13;
        h0 h0Var;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        boolean l13 = l();
        int i14 = viewModel.f108574a;
        if (l13) {
            Context d2 = d();
            Intrinsics.checkNotNullExpressionValue(d2, "<get-context>(...)");
            this.f108547c = i(d2, i14);
            Context d13 = d();
            Intrinsics.checkNotNullExpressionValue(d13, "<get-context>(...)");
            i13 = dl2.b.F0(d13, this.f108547c.getAvatarSize());
        } else {
            i13 = i14;
        }
        Context d14 = d();
        Intrinsics.checkNotNullExpressionValue(d14, "<get-context>(...)");
        if (i13 == dl2.b.F0(d14, r.CI.getValue())) {
            Context d15 = d();
            Intrinsics.checkNotNullExpressionValue(d15, "<get-context>(...)");
            dl2.b.T1(d15);
        }
        boolean l14 = l();
        o oVar = viewModel.f108578e;
        if (l14) {
            Context d16 = d();
            Intrinsics.checkNotNullExpressionValue(d16, "<get-context>(...)");
            oVar = o.a(oVar, dl2.b.F0(d16, eo1.a.comp_avatar_border_weight), l.f108625b, 1);
        }
        boolean l15 = l();
        h0 h0Var2 = viewModel.f108580g;
        if (l15) {
            Context d17 = d();
            Intrinsics.checkNotNullExpressionValue(d17, "<get-context>(...)");
            h0Var = h0.a(h0Var2, null, l.f108628e, dl2.b.D0(d17, this.f108547c.getTextSize()), 1);
        } else {
            h0Var = h0Var2;
        }
        g a13 = g.a(viewModel, i13, null, oVar, null, h0Var, null, 4014);
        r(a13.f108574a);
        q(a13.f108575b);
        int i15 = this.K;
        int i16 = a13.f108576c;
        if (i15 != i16) {
            this.K = i16;
            ((Paint) this.f108550f.getValue()).setColor(c(this.K));
            k();
        }
        this.L = a13.f108577d;
        m(this.f108558n);
        o oVar2 = a13.f108578e;
        int i17 = oVar2.f108643b;
        if (i17 == -1) {
            i17 = ((Number) this.f108555k.getValue()).intValue();
        }
        m0 m0Var = a13.f108579f;
        int i18 = m0Var.f108636g;
        int i19 = i18 != -1 ? i18 : i17;
        int i23 = m0Var.f108637h;
        if (i23 == -1) {
            i23 = oVar2.f108644c;
        }
        int i24 = i23;
        h0 h0Var3 = a13.f108580g;
        float f13 = h0Var3.f108592c;
        if (f13 == -1.0f) {
            f13 = ((Number) this.f108556l.getValue()).intValue();
        }
        int i25 = a13.f108583j;
        if (i25 != Integer.MIN_VALUE) {
            WebImageView webImageView = this.f108545a;
            if (webImageView == null) {
                Intrinsics.r("avatarView");
                throw null;
            }
            webImageView.setId(i25);
        }
        o a14 = o.a(oVar2, i17, 0, 5);
        boolean z13 = this.f108560p;
        boolean z14 = a14.f108642a;
        if (z13 != z14) {
            this.f108560p = z14;
            s(e(), true);
            n();
        }
        p(a14.f108643b);
        int i26 = this.f108563s;
        int i27 = a14.f108644c;
        if (i26 != i27) {
            if (l()) {
                i27 = l.f108625b;
            }
            this.f108563s = i27;
            o(c(i27));
        }
        h0 a15 = h0.a(h0Var3, null, 0, f13, 3);
        String name = a15.f108590a;
        Intrinsics.checkNotNullParameter(name, "name");
        if (!kotlin.text.z.i(this.G, name, true)) {
            this.G = name;
            if (h()) {
                k();
            }
        }
        int i28 = this.I;
        int i29 = a15.f108591b;
        if (i28 != i29) {
            if (l()) {
                i29 = i0.color_themed_non_image_font;
            }
            this.I = i29;
            f().setColor(c(this.I));
            if (h()) {
                k();
            }
        }
        float f14 = this.f108544J;
        float f15 = a15.f108592c;
        if (f14 != f15) {
            if (l()) {
                Context d18 = d();
                Intrinsics.checkNotNullExpressionValue(d18, "<get-context>(...)");
                f15 = dl2.b.D0(d18, this.f108547c.getTextSize());
            }
            this.f108544J = f15;
            f().setTextSize(g(e()));
            if (h()) {
                n();
            }
        }
        m0 a16 = m0.a(a13.f108579f, false, 0, i19, i24, 0, 1855);
        boolean z15 = this.f108564t;
        boolean z16 = a16.f108630a;
        if (z15 != z16) {
            this.f108564t = z16;
            n();
        }
        t(a16.f108631b, eo1.b.color_gray_500);
        int i33 = this.f108567w;
        int i34 = a16.f108632c;
        if (i33 != i34) {
            this.f108567w = i34;
            s(e(), true);
            n();
        }
        int i35 = this.f108568x;
        int i36 = a16.f108633d;
        if (i35 != i36) {
            this.f108568x = i36;
            s(e(), true);
            n();
        }
        int i37 = this.f108569y;
        int i38 = a16.f108634e;
        if (i37 != i38) {
            this.f108569y = i38;
            k();
        }
        boolean z17 = this.f108570z;
        boolean z18 = a16.f108635f;
        if (z17 != z18) {
            this.f108570z = z18;
            s(e(), true);
            n();
        }
        int i39 = this.A;
        int i43 = a16.f108636g;
        if (i39 != i43) {
            this.A = i43;
            s(e(), true);
            n();
        }
        int i44 = this.B;
        int i45 = a16.f108637h;
        if (i44 != i45) {
            this.B = i45;
            ((Paint) this.f108551g.getValue()).setColor(c(this.B));
            k();
        }
        boolean z19 = this.C;
        boolean z23 = a16.f108638i;
        if (z19 != z23) {
            this.C = z23;
            k();
        }
        int i46 = this.D;
        int i47 = a16.f108639j;
        if (i46 != i47) {
            this.D = i47;
            ((Paint) this.f108552h.getValue()).setColor(c(this.D));
            k();
        }
        int i48 = this.E;
        int i49 = a16.f108640k;
        if (i48 != i49) {
            this.E = i49;
            this.F = i49 != -1 ? c(i49) : 0;
            k();
        }
        WebImageView webImageView2 = this.f108545a;
        if (webImageView2 == null) {
            Intrinsics.r("avatarView");
            throw null;
        }
        webImageView2.setVisibility(a13.f108582i.getVisibility());
        String str = a13.f108581h;
        if (!kotlin.text.z.j(str)) {
            WebImageView webImageView3 = this.f108545a;
            if (webImageView3 == null) {
                Intrinsics.r("avatarView");
                throw null;
            }
            webImageView3.setContentDescription(str);
        }
        WebImageView webImageView4 = this.f108545a;
        if (webImageView4 != null) {
            webImageView4.setImportantForAccessibility(a13.f108585l.getImportantForAccessibility());
        } else {
            Intrinsics.r("avatarView");
            throw null;
        }
    }
}
