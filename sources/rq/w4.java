package rq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.um;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oi.o6;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class w4 extends r1 implements sq.f, View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public boolean f109626b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f109627c;

    /* renamed from: d, reason: collision with root package name */
    public final sq.g f109628d;

    /* renamed from: e, reason: collision with root package name */
    public final String f109629e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f109630f;

    /* renamed from: g, reason: collision with root package name */
    public final oq.d1 f109631g;

    /* renamed from: h, reason: collision with root package name */
    public gs0.k f109632h;

    /* renamed from: i, reason: collision with root package name */
    public xr.a f109633i;

    /* renamed from: j, reason: collision with root package name */
    public lh0.a0 f109634j;

    /* renamed from: k, reason: collision with root package name */
    public ur.a f109635k;

    /* renamed from: l, reason: collision with root package name */
    public es.a f109636l;

    /* renamed from: m, reason: collision with root package name */
    public oq.c0 f109637m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f109638n;

    /* renamed from: o, reason: collision with root package name */
    public oq.a1 f109639o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f109640p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(Context context, boolean z13, sq.g impressionLoggingParams, String navigationSource, boolean z14, oq.d1 d1Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(impressionLoggingParams, "impressionLoggingParams");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        inject();
        this.f109627c = z13;
        this.f109628d = impressionLoggingParams;
        this.f109629e = navigationSource;
        this.f109630f = z14;
        this.f109631g = d1Var;
        this.f109640p = xk2.m.b(new db.m(this, 20));
    }

    public final void b() {
        lo.e eVar;
        oq.a1 a1Var = this.f109639o;
        if (a1Var != null) {
            a1Var.f96950f = true;
            if (!a1Var.f96951g || (eVar = a1Var.f96949e) == null) {
                return;
            }
            WebViewYouTubePlayer webViewYouTubePlayer = (WebViewYouTubePlayer) eVar;
            webViewYouTubePlayer.f34787c.post(new po.d(webViewYouTubePlayer, 1));
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        i();
    }

    public final void e() {
        YouTubePlayerView youTubePlayerView;
        oq.a1 a1Var = this.f109639o;
        if (a1Var == null || (youTubePlayerView = a1Var.f96953i) == null) {
            return;
        }
        youTubePlayerView.release();
    }

    public final void g() {
        oq.a1 a1Var = this.f109639o;
        if (a1Var != null) {
            a1Var.f96950f = false;
            lo.e eVar = a1Var.f96949e;
            if (eVar != null) {
                WebViewYouTubePlayer webViewYouTubePlayer = (WebViewYouTubePlayer) eVar;
                webViewYouTubePlayer.f34787c.post(new po.d(webViewYouTubePlayer, 0));
            }
        }
    }

    @Override // sq.f
    public final xk2.k getCloseupImpressionHelper() {
        return this.f109640p;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_YOUTUBE;
    }

    @Override // sq.f
    /* renamed from: getImpressionParams */
    public final sq.g getImpressionLoggingParams() {
        return this.f109628d;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    public final void i() {
        f30 pin;
        um umVar;
        int i13;
        YouTubePlayerView youTubePlayerView;
        if (this.f109637m != null || (pin = getPin()) == null || (umVar = (um) CollectionsKt.firstOrNull(rl2.g0.q(pin))) == null) {
            return;
        }
        removeView(this.f109639o);
        oq.a1 a1Var = this.f109639o;
        if (a1Var != null && (youTubePlayerView = a1Var.f96953i) != null) {
            youTubePlayerView.release();
        }
        this.f109639o = null;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        oq.c0 c0Var = new oq.c0(context, pin, false, null, this.f109631g, getViewPinalytics(), 448);
        c0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        h32.d4 containerViewType = getContainerViewType();
        c0Var.f96993r = containerViewType;
        oq.j jVar = c0Var.f96995t;
        if (jVar != null) {
            jVar.f97068n = containerViewType;
        }
        h32.a4 containerViewParameterType = getContainerViewParameterType();
        c0Var.f96994s = containerViewParameterType;
        oq.j jVar2 = c0Var.f96995t;
        if (jVar2 != null) {
            jVar2.f97069o = containerViewParameterType;
        }
        c0Var.N = this;
        View view = c0Var.G;
        if (view != null) {
            view.setOnClickListener(this);
        }
        hs.d dVar = c0Var.f96982g;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        if (dVar.a()) {
            i13 = 0;
        } else {
            Context context2 = c0Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i13 = bs1.c.W(c0Var, kh2.g0.v(context2));
        }
        WebImageView j13 = c0Var.j();
        if (j13 != null) {
            float f13 = i13;
            j13.g2(f13, f13, f13, f13);
        }
        c0Var.t(pin, getIsActive());
        oq.c0.x(c0Var, umVar, false, null, false, 30);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f109638n = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = this.f109638n;
        if (linearLayout2 != null) {
            linearLayout2.setOrientation(1);
        }
        LinearLayout linearLayout3 = this.f109638n;
        Intrinsics.f(linearLayout3);
        k(linearLayout3);
        LinearLayout linearLayout4 = this.f109638n;
        Intrinsics.f(linearLayout4);
        linearLayout4.addView(c0Var);
        addView(this.f109638n);
        this.f109637m = c0Var;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109626b) {
            return;
        }
        this.f109626b = true;
        jb jbVar = (jb) ((x4) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f109632h = oaVar.w2();
        this.f109633i = (xr.a) oaVar.f113756jc.get();
        this.f109634j = s8Var.j5();
        s8Var.a6();
        this.f109635k = (ur.a) oaVar.Kb.get();
        this.f109636l = (es.a) oaVar.P6.get();
    }

    public final void j() {
        View view = this.f109638n;
        if (view != null) {
            removeView(view);
            f30 pin = getPin();
            if (pin != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                getContainerViewType();
                getContainerViewParameterType();
                String j13 = ps0.m.j(pin);
                String id3 = pin.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                oq.a1 a1Var = new oq.a1(context, j13, id3);
                a1Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                k(a1Var);
                addView(a1Var);
                v4 listener = new v4(this);
                Intrinsics.checkNotNullParameter(listener, "listener");
                a1Var.f96952h = listener;
                q5.x.a(a1Var, new o6(a1Var, this, 8));
                this.f109639o = a1Var;
            }
        }
        this.f109637m = null;
        this.f109638n = null;
    }

    public final void k(ViewGroup viewGroup) {
        if (this.f109627c && getPin() != null) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) bs1.c.T(m60.r0.lego_floating_nav_bottom_bar_height), 49.0f));
            relativeLayout.setId(n80.c.pin_top_gradient);
            relativeLayout.setBackgroundResource(m60.s0.rounded_top_rect_radius_40);
            viewGroup.addView(relativeLayout);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, gestaltIconButton.getResources().getDimensionPixelSize(eo1.c.space_400), 0, 0);
            layoutParams.setMarginEnd(gestaltIconButton.getResources().getDimensionPixelSize(eo1.c.space_400));
            layoutParams.addRule(21);
            gestaltIconButton.setLayoutParams(layoutParams);
            gestaltIconButton.t(h4.B);
            gs0.k kVar = this.f109632h;
            if (kVar == null) {
                Intrinsics.r("pinOverflowMenuModalProvider");
                throw null;
            }
            r1.updatePinOverflowMenuModal$closeup_release$default(this, gestaltIconButton, kVar, this.f109629e, this.f109630f, null, 16, null);
            relativeLayout.addView(gestaltIconButton);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        if (getIsActive()) {
            f30 pin = getPin();
            nx.d0 viewPinalytics = getViewPinalytics();
            if (pin == null || viewPinalytics == null) {
                return;
            }
            viewPinalytics.f0(h32.u0.PIN_SOURCE_IMAGE, h32.g0.MODAL_PIN, pin.getId(), getPinAuxHelper().m(pin), false);
            PinCloseupBaseModule.handleWebsiteClicked$default(this, com.bumptech.glide.c.D(pin), null, null, 6, null);
        }
    }

    @Override // jq.a
    public final void openPinOverflowMenuModal(boolean z13) {
        gs0.k kVar = this.f109632h;
        if (kVar != null) {
            r1.openPinOverflowMenuModal$closeup_release$default(this, kVar, this.f109629e, this.f109630f, null, false, 24, null);
        } else {
            Intrinsics.r("pinOverflowMenuModalProvider");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return false;
    }

    @Override // jq.a
    public final void showLoadingSpinner(boolean z13) {
    }

    @Override // rq.r1
    public final void updateMediaViewSize(int i13) {
        int b03 = c0.d.b0(1.7777778f, i13);
        oq.a1 a1Var = this.f109639o;
        if (a1Var != null) {
            a1Var.getHeight();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i13;
        layoutParams.width = b03;
        setLayoutParams(layoutParams);
    }
}
