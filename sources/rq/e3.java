package rq;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.PinCloseupChevronIconView;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.q11;
import com.pinterest.api.model.vh;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import so.i6;
import so.jb;
import so.o6;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class e3 extends PinCloseupBaseModule implements i01.b0, nx.v {
    public float A;
    public z32.c B;
    public w01.f0 C;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public boolean f109152a;

    /* renamed from: b, reason: collision with root package name */
    public final nx.d0 f109153b;

    /* renamed from: c, reason: collision with root package name */
    public final ao2.j0 f109154c;

    /* renamed from: d, reason: collision with root package name */
    public final i01.m f109155d;

    /* renamed from: e, reason: collision with root package name */
    public lh0.a0 f109156e;

    /* renamed from: f, reason: collision with root package name */
    public m60.w f109157f;

    /* renamed from: g, reason: collision with root package name */
    public uj2.q f109158g;

    /* renamed from: h, reason: collision with root package name */
    public yk1.j f109159h;

    /* renamed from: i, reason: collision with root package name */
    public ni0.e f109160i;

    /* renamed from: j, reason: collision with root package name */
    public o6 f109161j;

    /* renamed from: k, reason: collision with root package name */
    public gx.o f109162k;

    /* renamed from: l, reason: collision with root package name */
    public ku1.l f109163l;

    /* renamed from: m, reason: collision with root package name */
    public hs.d f109164m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f109165n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout f109166o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f109167p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f109168q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.v f109169r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f109170s;

    /* renamed from: t, reason: collision with root package name */
    public final xk2.v f109171t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f109172u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f109173v;

    /* renamed from: w, reason: collision with root package name */
    public we1.y0 f109174w;

    /* renamed from: x, reason: collision with root package name */
    public bf1.a f109175x;

    /* renamed from: y, reason: collision with root package name */
    public pi0.f f109176y;

    /* renamed from: z, reason: collision with root package name */
    public gx.m f109177z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Context context, nx.d0 pinalytics, androidx.lifecycle.u scope, i01.m mVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        inject();
        this.f109153b = pinalytics;
        this.f109154c = scope;
        this.f109155d = mVar;
        boolean shouldRenderLandscapeConfiguration = shouldRenderLandscapeConfiguration();
        this.f109165n = shouldRenderLandscapeConfiguration;
        xk2.v b13 = xk2.m.b(new b3(this, 0));
        this.f109167p = b13;
        this.f109168q = xk2.m.b(new b3(this, 1));
        this.f109169r = xk2.m.b(new b3(this, 4));
        this.f109170s = xk2.m.b(new b3(this, 3));
        this.f109171t = xk2.m.b(new b3(this, 2));
        hs.d dVar = this.f109164m;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        boolean b14 = dVar.b();
        this.f109172u = b14;
        lh0.a0 a0Var = this.f109156e;
        if (a0Var == null) {
            Intrinsics.r("closeupExperiments");
            throw null;
        }
        this.f109173v = a0Var.U(lh0.a4.f83297a);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ((PinCloseupChevronIconView) b13.getValue()).Z(shouldRenderLandscapeConfiguration);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setBackground(b14 ? null : bs1.c.f0(linearLayout, r80.b.pin_closeup_redesign_module_background, null, null, 6));
        maybeUpdateLayoutForTabletPortrait(linearLayout);
        this.f109166o = linearLayout;
    }

    @Override // gd1.d
    public final void O5(String actionDeeplink, HashMap navigationParams) {
        Intrinsics.checkNotNullParameter(actionDeeplink, "actionDeeplink");
        Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
        lh0.a0 a0Var = this.f109156e;
        if (a0Var == null) {
            Intrinsics.r("closeupExperiments");
            throw null;
        }
        lh0.z3 z3Var = lh0.a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) a0Var.f83294a;
        if (g1Var.o("android_stl_landing_page", "enabled", z3Var) || g1Var.l("android_stl_landing_page")) {
            ku1.l lVar = this.f109163l;
            if (lVar == null) {
                Intrinsics.r("uriNavigator");
                throw null;
            }
            Context context = getContext();
            Intrinsics.f(context);
            ku1.l.b(lVar, context, actionDeeplink, true, false, null, navigationParams, 64);
            return;
        }
        f30 pin = getPin();
        if (pin != null) {
            k(pin, navigationParams);
            return;
        }
        w01.f0 f0Var = this.C;
        if (f0Var != null) {
            Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
            f0Var.addDisposable(nl.b.s(f0Var.f127009b.P(f0Var.f127008a), new ky0.b(14, f0Var, navigationParams), null, null, 6));
        }
    }

    public final void b() {
        if ((this.f109176y != null && this.f109177z == null) || i().getParent() != null) {
            i().removeAllViews();
            return;
        }
        LinearLayout linearLayout = this.f109166o;
        addView(linearLayout);
        linearLayout.addView(i());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, 1.0f);
        ofFloat.setInterpolator(new q6.b());
        ofFloat.setDuration(ofFloat.getDuration());
        ofFloat.addUpdateListener(new a3(this, 0));
        ofFloat.start();
    }

    public final void e() {
        bf1.a aVar = this.f109175x;
        LinearLayout linearLayout = this.f109166o;
        xk2.v vVar = this.f109170s;
        if (aVar != null || this.f109174w != null) {
            linearLayout.removeAllViews();
            linearLayout.addView((ViewGroup) vVar.getValue());
            return;
        }
        addView(linearLayout);
        linearLayout.addView((ViewGroup) vVar.getValue());
        if (hf0.b.q()) {
            linearLayout.addView(i());
        }
        if (this.f109173v) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, 1.0f);
        ofFloat.setInterpolator(new q6.b());
        ofFloat.setDuration(ofFloat.getDuration());
        ofFloat.addUpdateListener(new a3(this, 1));
        ofFloat.start();
    }

    public final void g(ViewGroup viewGroup) {
        int W = bs1.c.W(this, eo1.c.space_600);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(W);
        viewGroup.setLayoutParams(marginLayoutParams);
        viewGroup.setPaddingRelative(0, viewGroup.getPaddingTop(), 0, viewGroup.getPaddingBottom());
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        List b13;
        bf1.a aVar = this.f109175x;
        if (aVar != null && (b13 = kotlin.collections.e0.b(aVar)) != null) {
            return b13;
        }
        pi0.f fVar = this.f109176y;
        if (fVar != null) {
            return kotlin.collections.e0.b(fVar);
        }
        gx.m mVar = this.f109177z;
        if (mVar != null) {
            return kotlin.collections.e0.b(mVar);
        }
        return null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.STELA_PRODUCTS;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return false;
    }

    public final b11.d i() {
        return (b11.d) this.f109171t.getValue();
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109152a) {
            return;
        }
        this.f109152a = true;
        jb jbVar = (jb) ((f3) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f109156e = s8Var.j5();
        this.f109157f = (m60.w) oaVar.f113885r0.get();
        this.f109158g = (uj2.q) oaVar.f113947u9.get();
        this.f109159h = (yk1.j) oaVar.Qc.get();
        this.f109160i = (ni0.e) s8Var.Y1.get();
        this.f109161j = (o6) s8Var.f114272e2.get();
        this.f109162k = (gx.o) s8Var.U1.get();
        this.f109163l = (ku1.l) s8Var.f114476s.get();
        this.f109164m = s8Var.a6();
    }

    public final boolean j() {
        z32.c cVar = this.B;
        return cVar == z32.c.PREVIEW_COLLAPSED || cVar == z32.c.PREVIEW_EXPANDED;
    }

    public final void k(f30 validPin, HashMap navigationParams) {
        q11 q11Var;
        Object obj;
        Intrinsics.checkNotNullParameter(validPin, "validPin");
        Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
        List Q6 = validPin.Q6();
        if (Q6 != null) {
            Iterator it = Q6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Boolean p13 = ((q11) obj).p();
                Intrinsics.checkNotNullExpressionValue(p13, "getIsStela(...)");
                if (p13.booleanValue()) {
                    break;
                }
            }
            q11Var = (q11) obj;
        } else {
            q11Var = null;
        }
        String valueOf = navigationParams.containsKey("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS") ? String.valueOf(navigationParams.get("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS")) : "";
        if (q11Var != null) {
            m60.w wVar = this.f109157f;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            Double t13 = q11Var.t();
            Intrinsics.checkNotNullExpressionValue(t13, "getX(...)");
            double doubleValue = t13.doubleValue();
            Double u13 = q11Var.u();
            Intrinsics.checkNotNullExpressionValue(u13, "getY(...)");
            double doubleValue2 = u13.doubleValue();
            Double s13 = q11Var.s();
            Intrinsics.checkNotNullExpressionValue(s13, "getW(...)");
            double doubleValue3 = s13.doubleValue();
            Double o13 = q11Var.o();
            Intrinsics.checkNotNullExpressionValue(o13, "getH(...)");
            double doubleValue4 = o13.doubleValue();
            String q13 = q11Var.q();
            wVar.d(new w(doubleValue, doubleValue2, doubleValue3, doubleValue4, q13 == null ? "" : q13, validPin.getUid(), valueOf));
        }
    }

    public final void l(vh story) {
        uk1.d f13;
        Intrinsics.checkNotNullParameter(story, "story");
        if (this.f109176y == null && this.f109174w == null) {
            b();
            this.D = true;
            this.f109166o.setBackground(null);
            Context context = getContext();
            f30 pin = getPin();
            String uid = pin != null ? pin.getUid() : null;
            Intrinsics.f(context);
            this.f109176y = new pi0.f(context, this.f109153b, this.f109154c, uid, true);
            ni0.e eVar = this.f109160i;
            if (eVar == null) {
                Intrinsics.r("adsCarouselPresenterFactory");
                throw null;
            }
            uj2.q qVar = this.f109158g;
            if (qVar == null) {
                Intrinsics.r("networkStateStream");
                throw null;
            }
            f13 = ((uk1.a) getPresenterPinalyticsFactory()).f(this.f109153b, "");
            ni0.d a13 = ((i6) eVar).a(f13, qVar);
            pi0.f fVar = this.f109176y;
            if (fVar != null) {
                a13.bind(fVar);
                a13.I3(0, story, fVar);
                i().addView(fVar);
                fVar.f100196o.setVisibility(8);
                df.j1.A0(fVar.f100195n);
            }
        }
    }

    public final void m(ArrayList arrayList) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(n80.a.collapse_preview_image_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(n80.a.collapse_preview_image_margin_start);
        int size = arrayList.size() - 1;
        ViewGroup viewGroup = (ViewGroup) this.f109168q.getValue();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            WebImageView webImageView = new WebImageView(viewGroup.getContext());
            float dimensionPixelSize3 = webImageView.getResources().getDimensionPixelSize(n80.a.collapse_preview_image_radius);
            webImageView.g2(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Context context = webImageView.getContext();
            int i13 = eo1.b.color_themed_background_elevation_floating;
            Object obj = d5.a.f53679a;
            webImageView.o0(context.getColor(i13));
            webImageView.M1(webImageView.getResources().getDimensionPixelSize(n80.a.collapse_preview_image_border_width));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 8388613;
            com.bumptech.glide.c.a1(layoutParams, 0, 0, dimensionPixelSize2 * size, 0);
            webImageView.setLayoutParams(layoutParams);
            webImageView.loadUrl(str);
            viewGroup.addView(webImageView);
            size--;
        }
        z32.c cVar = this.B;
        viewGroup.setVisibility((cVar == z32.c.EXPANDED || cVar == z32.c.PREVIEW_EXPANDED) ? 4 : 0);
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionStart() {
        return null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (!this.f109173v || this.D) {
            int measuredHeight = getMeasuredHeight();
            setAlpha((this.A == 0.0f && measuredHeight == 0) ? 0.0f : 1.0f);
            setMeasuredDimension(getMeasuredWidth(), measuredHeight - (measuredHeight - ml2.c.c(measuredHeight * this.A)));
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }
}
