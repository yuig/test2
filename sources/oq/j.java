package oq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.activity.pin.view.PinCloseUpWebImageView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gn;
import com.pinterest.api.model.um;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.view.MaskedWebImageView;
import df.n1;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.z3;
import so.jb;
import so.oa;

/* loaded from: classes3.dex */
public final class j extends FrameLayout implements af2.c {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f97054t = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f97055a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f97056b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97057c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f97058d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f97059e;

    /* renamed from: f, reason: collision with root package name */
    public final tb0.h f97060f;

    /* renamed from: g, reason: collision with root package name */
    public final lh0.b0 f97061g;

    /* renamed from: h, reason: collision with root package name */
    public final hs.d f97062h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f97063i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f97064j;

    /* renamed from: k, reason: collision with root package name */
    public final WebImageView f97065k;

    /* renamed from: l, reason: collision with root package name */
    public PinCloseUpWebImageView f97066l;

    /* renamed from: m, reason: collision with root package name */
    public um f97067m;

    /* renamed from: n, reason: collision with root package name */
    public d4 f97068n;

    /* renamed from: o, reason: collision with root package name */
    public a4 f97069o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f97070p;

    /* renamed from: q, reason: collision with root package name */
    public final n1 f97071q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f97072r;

    /* renamed from: s, reason: collision with root package name */
    public View.OnLongClickListener f97073s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, boolean z13, boolean z14) {
        super(context, null, 0, 0);
        lf.a contour;
        WebImageView webImageView;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f97056b) {
            this.f97056b = true;
            jb jbVar = (jb) ((k) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f97059e = (m60.w) oaVar.f113885r0.get();
            this.f97060f = (tb0.h) oaVar.f113797m0.get();
            this.f97061g = jbVar.b();
            this.f97062h = jbVar.f113485c.a6();
        }
        this.f97057c = z13;
        this.f97058d = z14;
        hs.d dVar = this.f97062h;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        boolean a13 = dVar.a();
        this.f97063i = a13;
        boolean z15 = a13 || z14;
        this.f97064j = z15;
        i iVar = new i(this, 0);
        this.f97071q = new n1(this, 2);
        lh0.b0 b0Var = this.f97061g;
        if (b0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = lh0.a4.f83297a;
        g1 g1Var = (g1) b0Var.f83300a;
        if (g1Var.o("android_visual_cutout", "enabled", z3Var) || g1Var.l("android_visual_cutout")) {
            lh0.b0 b0Var2 = this.f97061g;
            if (b0Var2 == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
            Intrinsics.checkNotNullParameter("enabled_outline_static", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            boolean k13 = ((g1) b0Var2.f83300a).k("android_visual_cutout", "enabled_outline_static", activate);
            lh0.b0 b0Var3 = this.f97061g;
            if (b0Var3 == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            Intrinsics.checkNotNullParameter("enabled_glow_animations", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            if (!((g1) b0Var3.f83300a).o("android_visual_search_image_interactions", "enabled_glow_animations", activate)) {
                lh0.b0 b0Var4 = this.f97061g;
                if (b0Var4 == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                Intrinsics.checkNotNullParameter("employees", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                if (!((g1) b0Var4.f83300a).o("android_visual_search_image_interactions", "employees", activate)) {
                    contour = k13 ? hb2.z.f68627b : hb2.a0.f68535b;
                    MaskedWebImageView maskedWebImageView = new MaskedWebImageView(context, null);
                    Intrinsics.checkNotNullParameter(contour, "contour");
                    maskedWebImageView.L = contour;
                    webImageView = maskedWebImageView;
                }
            }
            contour = hb2.y.f68626b;
            MaskedWebImageView maskedWebImageView2 = new MaskedWebImageView(context, null);
            Intrinsics.checkNotNullParameter(contour, "contour");
            maskedWebImageView2.L = contour;
            webImageView = maskedWebImageView2;
        } else {
            webImageView = new WebImageView(context);
        }
        this.f97065k = webImageView;
        webImageView.setScaleType(z15 ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
        webImageView.Y(iVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (z13) {
            layoutParams.gravity = 1;
        }
        addView(webImageView, layoutParams);
        if (z13) {
            setBackgroundColor(bs1.c.B(this, eo1.b.color_background_default));
        }
    }

    public static final void a(j jVar) {
        if (jVar.b()) {
            return;
        }
        WebImageView webImageView = jVar.f97065k;
        if (webImageView != null) {
            webImageView.setBackgroundResource(0);
        }
        if (webImageView != null) {
            Drawable f03 = bs1.c.f0(jVar, m60.s0.dimming_layer_light, null, null, 6);
            Bitmap bitmap = webImageView.C;
            if (bitmap == null || !webImageView.B || f03 == null || !qb0.b.d(bitmap)) {
                return;
            }
            webImageView.setForeground(f03);
        }
    }

    public final boolean b() {
        WebImageView webImageView = this.f97065k;
        return webImageView != null && webImageView.getVisibility() == 8;
    }

    public final void c(um umVar) {
        if (b()) {
            return;
        }
        WebImageView webImageView = this.f97065k;
        if (webImageView != null) {
            webImageView.Y(new h(0, umVar, this));
        }
        f30 f30Var = umVar.f42584a;
        if (webImageView != null && !webImageView.f52565q) {
            String uid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            String str = umVar.f42586c;
            new jy.b(uid, str).i();
            webImageView.V1(str, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : umVar.f42589f, null);
            return;
        }
        String uid2 = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        gn m43 = f30Var.m4();
        String f13 = m43 != null ? m43.f() : null;
        new jy.b(uid2, f13).i();
        if (webImageView != null) {
            webImageView.V1(f13, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f97055a == null) {
            this.f97055a = new ye2.o(this);
        }
        return this.f97055a;
    }

    public final void d(um umVar) {
        ViewGroup.LayoutParams layoutParams;
        if (b()) {
            return;
        }
        if (this.f97066l == null) {
            PinCloseUpWebImageView pinCloseUpWebImageView = null;
            byte b13 = 0;
            try {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                PinCloseUpWebImageView pinCloseUpWebImageView2 = new PinCloseUpWebImageView(6, context, (AttributeSet) (b13 == true ? 1 : 0));
                pinCloseUpWebImageView2.setWebViewClient(this.f97071q);
                pinCloseUpWebImageView2.setOnLongClickListener(this.f97073s);
                addView(pinCloseUpWebImageView2);
                pinCloseUpWebImageView = pinCloseUpWebImageView2;
            } catch (Exception e13) {
                tb0.h hVar = this.f97060f;
                if (hVar == null) {
                    Intrinsics.r("crashReporting");
                    throw null;
                }
                hVar.q(e13, "PinCloseupImageView WebView provider fails to load", tb0.p.CLOSEUP);
            }
            this.f97066l = pinCloseUpWebImageView;
            e0 e0Var = this.f97072r;
            if (e0Var != null) {
                c0 c0Var = (c0) e0Var;
                WebImageView j13 = c0Var.j();
                if (j13 != null) {
                    j13.bringToFront();
                }
                View view = c0Var.G;
                if (view != null) {
                    view.bringToFront();
                }
                c0Var.i().bringToFront();
            }
        }
        PinCloseUpWebImageView pinCloseUpWebImageView3 = this.f97066l;
        if (pinCloseUpWebImageView3 != null) {
            pinCloseUpWebImageView3.a(umVar);
            WebImageView webImageView = this.f97065k;
            if (webImageView == null || (layoutParams = webImageView.getLayoutParams()) == null) {
                return;
            }
            pinCloseUpWebImageView3.setLayoutParams(new FrameLayout.LayoutParams(layoutParams));
        }
    }

    public final void e(boolean z13) {
        f30 f30Var;
        String pinUid;
        um umVar = this.f97067m;
        if (umVar == null || (f30Var = umVar.f42584a) == null || (pinUid = f30Var.getUid()) == null) {
            return;
        }
        if (z13) {
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            new jy.c(pinUid).i();
            m60.w wVar = this.f97059e;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            wVar.d(new ls1.i(pinUid, System.currentTimeMillis() * 1000000));
        }
        new jy.f(this.f97069o, this.f97068n, pinUid).i();
        e0 e0Var = this.f97072r;
        if (e0Var != null) {
            e0Var.a();
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f97055a == null) {
            this.f97055a = new ye2.o(this);
        }
        return this.f97055a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f97070p) {
            this.f97070p = false;
            WebImageView webImageView = this.f97065k;
            if (webImageView != null) {
                webImageView.setVisibility(0);
            }
            um umVar = this.f97067m;
            if (umVar != null) {
                d(umVar);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        PinCloseUpWebImageView pinCloseUpWebImageView = this.f97066l;
        if (pinCloseUpWebImageView != null) {
            this.f97070p = true;
            removeView(pinCloseUpWebImageView);
            pinCloseUpWebImageView.removeAllViews();
            pinCloseUpWebImageView.destroy();
            this.f97066l = null;
        }
        super.onDetachedFromWindow();
    }
}
