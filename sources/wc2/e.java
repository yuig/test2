package wc2;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.cardview.widget.CardView;
import ao2.j0;
import ao2.k2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.p4;
import lh0.z3;
import ni1.a1;
import ni1.y2;
import nx.b0;
import nx.d0;
import nx.v;
import qa2.c0;
import qa2.f0;
import qa2.h0;
import rh1.d1;
import so.ab;
import so.jb;
import so.oa;
import so.w8;
import so.za;
import v72.a0;

/* loaded from: classes4.dex */
public final class e extends d1 implements y92.g, c0, v, f0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f129118r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f129119d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f129120e;

    /* renamed from: f, reason: collision with root package name */
    public final wa2.m f129121f;

    /* renamed from: g, reason: collision with root package name */
    public p4 f129122g;

    /* renamed from: h, reason: collision with root package name */
    public za f129123h;

    /* renamed from: i, reason: collision with root package name */
    public qa2.j0 f129124i;

    /* renamed from: j, reason: collision with root package name */
    public ni1.d0 f129125j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f129126k;

    /* renamed from: l, reason: collision with root package name */
    public final a0 f129127l;

    /* renamed from: m, reason: collision with root package name */
    public final l82.c f129128m;

    /* renamed from: n, reason: collision with root package name */
    public k2 f129129n;

    /* renamed from: o, reason: collision with root package name */
    public final SbaPinRep f129130o;

    /* renamed from: p, reason: collision with root package name */
    public final WebView f129131p;

    /* renamed from: q, reason: collision with root package name */
    public final CardView f129132q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, d0 pinalytics, wa2.m pfc, j0 scope) {
        super(context, 5);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pfc, "pfc");
        this.f129119d = pinalytics;
        this.f129120e = scope;
        this.f129121f = pfc;
        this.f129126k = xk2.m.b(new b(this, 1));
        za zaVar = this.f129123h;
        if (zaVar == null) {
            Intrinsics.r("viewModelFactory");
            throw null;
        }
        zw.a aVar = new zw.a();
        w8 w8Var = zaVar.f114748a;
        Application h10 = com.pinterest.widget.configuration.k.h(w8Var.f114689b.f113603b);
        ab abVar = (ab) ((jb) w8Var.f114692e).D.get();
        oa oaVar = w8Var.f114689b;
        a0 a0Var = new a0(h10, abVar, (es.h) oaVar.f113735i7.get(), (es.a) oaVar.P6.get(), oa.h0(oaVar), (jv.a) oaVar.f113932tc.get(), (b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get(), scope, aVar);
        this.f129127l = a0Var;
        u50.r c13 = a0Var.c();
        this.f129128m = (l82.c) c13;
        qa2.j0 j0Var = this.f129124i;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) j0Var).a(context, true);
        this.f129130o = sbaPinRep;
        sbaPinRep.addToView(this);
        sbaPinRep.setEventIntake(new kd1.j(c13, 20));
        sbaPinRep.setPinalytics(pinalytics);
        sbaPinRep.applyUnMigratedPFCFields(pfc.f128875n0, pfc.f128861g0, pfc.f128855d0, pfc.f128879p0, pfc.M);
        CardView cardView = new CardView(context, null);
        cardView.t(cardView.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium));
        cardView.l(0.0f);
        this.f129132q = cardView;
        WebView webView = new WebView(context);
        this.f129131p = webView;
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSafeBrowsingEnabled(true);
        webView.addJavascriptInterface(new a(), "AndroidInterface");
        sbaPinRep.setOnPinRepPiecesMeasured(new b(this, 0));
        cardView.addView(webView, -2, -2);
        p4 p4Var = this.f129122g;
        if (p4Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) p4Var.f83459a;
        if (g1Var.o("android_ix_display_ads", "enabled", z3Var) || g1Var.l("android_ix_display_ads")) {
            addView(cardView, -2, -2);
        }
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f129130o;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f129130o.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f129130o.markImpressionStart();
    }

    @Override // qa2.c0
    public final void onAttached() {
        this.f129130o.onAttached();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AssetManager assets = getContext().getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        this.f129128m.a(new g(assets));
        this.f129129n = kotlin.jvm.internal.j.z(this.f129120e, null, null, new d(this, null), 3);
    }

    @Override // qa2.c0
    public final void onDeactivated() {
        this.f129130o.onDeactivated();
    }

    @Override // qa2.c0
    public final void onDetached() {
        this.f129130o.onDetached();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k2 k2Var = this.f129129n;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
    }

    @Override // qa2.c0
    public final void onInitialized() {
        this.f129130o.onInitialized();
    }

    @Override // qa2.c0
    public final void onScrollStarted() {
        this.f129130o.onScrollStarted();
    }

    @Override // y92.g
    public final boolean resizable() {
        return false;
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Collection values;
        sr srVar;
        com.pinterest.api.model.r n03;
        Intrinsics.checkNotNullParameter(pin, "pin");
        y2 a13 = ((ni1.c0) this.f129126k.getValue()).a(i13, pin);
        com.pinterest.api.model.g t33 = pin.t3();
        String i14 = (t33 == null || (n03 = t33.n0()) == null) ? null : n03.i();
        Map A4 = pin.A4();
        q startState = new q(i14, (A4 == null || (values = A4.values()) == null || (srVar = (sr) CollectionsKt.T(values)) == null) ? 0 : (int) srVar.k().doubleValue(), a13);
        a0 a0Var = this.f129127l;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(startState, "startState");
        this.f129128m.a(new i(a1.f90594a));
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        return this.f129130o.getUniqueId();
    }
}
