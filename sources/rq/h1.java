package rq;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.um;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class h1 extends r1 implements View.OnClickListener, View.OnTouchListener, sq.f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f109220b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f109221c;

    /* renamed from: d, reason: collision with root package name */
    public final sq.g f109222d;

    /* renamed from: e, reason: collision with root package name */
    public final String f109223e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f109224f;

    /* renamed from: g, reason: collision with root package name */
    public final oq.d1 f109225g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f109226h;

    /* renamed from: i, reason: collision with root package name */
    public ps.k f109227i;

    /* renamed from: j, reason: collision with root package name */
    public gs0.k f109228j;

    /* renamed from: k, reason: collision with root package name */
    public lh0.a0 f109229k;

    /* renamed from: l, reason: collision with root package name */
    public xr.a f109230l;

    /* renamed from: m, reason: collision with root package name */
    public lh0.d f109231m;

    /* renamed from: n, reason: collision with root package name */
    public hs.d f109232n;

    /* renamed from: o, reason: collision with root package name */
    public ur.a f109233o;

    /* renamed from: p, reason: collision with root package name */
    public es.a f109234p;

    /* renamed from: q, reason: collision with root package name */
    public es.h f109235q;

    /* renamed from: r, reason: collision with root package name */
    public ao2.k2 f109236r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f109237s;

    /* renamed from: t, reason: collision with root package name */
    public oq.c0 f109238t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f109239u;

    /* renamed from: v, reason: collision with root package name */
    public jq.j f109240v;

    /* renamed from: w, reason: collision with root package name */
    public i01.u f109241w;

    /* renamed from: x, reason: collision with root package name */
    public float f109242x;

    /* renamed from: y, reason: collision with root package name */
    public float f109243y;

    /* renamed from: z, reason: collision with root package name */
    public final int f109244z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, boolean z13, sq.g impressionLoggingParams, String navigationSource, boolean z14, oq.d1 d1Var, boolean z15) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(impressionLoggingParams, "impressionLoggingParams");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        inject();
        this.f109221c = z13;
        this.f109222d = impressionLoggingParams;
        this.f109223e = navigationSource;
        this.f109224f = z14;
        this.f109225g = d1Var;
        this.f109226h = z15;
        this.f109237s = xk2.m.b(new g1(this, 0));
        this.f109239u = new ArrayList();
        this.f109244z = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final lh0.a0 b() {
        lh0.a0 a0Var = this.f109229k;
        if (a0Var != null) {
            return a0Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void createView() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.h1.createView():void");
    }

    public final void e() {
        WebImageView j13;
        ps.k kVar = this.f109227i;
        if (kVar == null) {
            Intrinsics.r("pinChipLooper");
            throw null;
        }
        kVar.f101242e = 0L;
        oq.c0 c0Var = this.f109238t;
        if (c0Var != null && (j13 = c0Var.j()) != null) {
            j13.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        ps.k.d(kVar, this.f109239u.size(), false, null, new zp.j0(4, this, kVar), 14);
    }

    public final es.a getAdFormats() {
        es.a aVar = this.f109234p;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adFormats");
        throw null;
    }

    @Override // sq.f
    public final xk2.k getCloseupImpressionHelper() {
        return this.f109237s;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_IMAGE;
    }

    @Override // sq.f
    /* renamed from: getImpressionParams */
    public final sq.g getImpressionLoggingParams() {
        return this.f109222d;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109220b) {
            return;
        }
        this.f109220b = true;
        jb jbVar = (jb) ((i1) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f109227i = oaVar.c2();
        this.f109228j = oaVar.w2();
        this.f109229k = s8Var.j5();
        this.f109230l = (xr.a) oaVar.f113756jc.get();
        this.f109231m = (lh0.d) oaVar.Q6.get();
        this.f109232n = s8Var.a6();
        this.f109233o = (ur.a) oaVar.Kb.get();
        this.f109234p = (es.a) oaVar.P6.get();
        this.f109235q = (es.h) oaVar.f113735i7.get();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b().S()) {
            oq.c0 c0Var = this.f109238t;
            if (c0Var != null) {
                c0Var.O = this;
                View view = c0Var.G;
                if (view != null) {
                    view.setOnTouchListener(this);
                    return;
                }
                return;
            }
            return;
        }
        oq.c0 c0Var2 = this.f109238t;
        if (c0Var2 != null) {
            c0Var2.N = this;
            View view2 = c0Var2.G;
            if (view2 != null) {
                view2.setOnClickListener(this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        i01.u uVar = this.f109241w;
        if (uVar != null) {
            uVar.onCloseupImageClicked();
        }
        if (this.f109238t != null && getIsActive()) {
            f30 pin = getPin();
            nx.d0 viewPinalytics = getViewPinalytics();
            if (pin == null || viewPinalytics == null) {
                return;
            }
            viewPinalytics.f0(h32.u0.PIN_SOURCE_IMAGE, h32.g0.MODAL_PIN, pin.getUid(), getPinAuxHelper().m(pin), false);
            if (pin.U4().booleanValue()) {
                return;
            }
            ((lh0.g1) b().f83294a).c("android_image_ctr_removal");
            ((lh0.g1) b().f83294a).c("android_visual_closeup_entry_point");
            PinCloseupBaseModule.handleWebsiteClicked$default(this, com.bumptech.glide.c.D(pin), null, null, 6, null);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (b().S()) {
            oq.c0 c0Var = this.f109238t;
            if (c0Var != null) {
                c0Var.O = null;
                View view = c0Var.G;
                if (view != null) {
                    view.setOnTouchListener(null);
                }
            }
        } else {
            oq.c0 c0Var2 = this.f109238t;
            if (c0Var2 != null) {
                c0Var2.N = null;
                View view2 = c0Var2.G;
                if (view2 != null) {
                    view2.setOnClickListener(null);
                }
            }
        }
        if (((es.c) getAdFormats()).w(getPin(), new g1(this, 2))) {
            ps.k kVar = this.f109227i;
            if (kVar == null) {
                Intrinsics.r("pinChipLooper");
                throw null;
            }
            kVar.e();
        }
        ao2.k2 k2Var = this.f109236r;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.h1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // jq.a
    public final void openPinOverflowMenuModal(boolean z13) {
        sf1.e1 e1Var;
        sf1.j1 j1Var;
        f30 pin = getPin();
        if (pin == null || !b40.P0(pin)) {
            gs0.k kVar = this.f109228j;
            if (kVar != null) {
                r1.openPinOverflowMenuModal$closeup_release$default(this, kVar, this.f109223e, this.f109224f, null, z13, 8, null);
                return;
            } else {
                Intrinsics.r("pinOverflowMenuModalProvider");
                throw null;
            }
        }
        oq.c0 c0Var = this.f109238t;
        if (c0Var == null || (e1Var = c0Var.f96996u) == null || (j1Var = e1Var.G) == null) {
            return;
        }
        sf1.j1.Z1(j1Var, e1Var);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void setFullPinLoaded(boolean z13) {
        ArrayList flashlightStelaDots;
        List Q6;
        super.setFullPinLoaded(z13);
        f30 pin = getPin();
        if (pin != null && z13 && (flashlightStelaDots = b40.s(pin)) != null && (!flashlightStelaDots.isEmpty())) {
            List list = s71.p.f111402a;
            wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
            if (CollectionsKt.L(list, f13 != null ? f13.G2() : null)) {
                oq.c0 c0Var = this.f109238t;
                if (c0Var != null) {
                    c0Var.q(pin, flashlightStelaDots);
                    return;
                }
                return;
            }
            oq.c0 c0Var2 = this.f109238t;
            if (c0Var2 != null) {
                Intrinsics.checkNotNullParameter(pin, "pin");
                Intrinsics.checkNotNullParameter(flashlightStelaDots, "flashlightStelaDots");
                if (c0Var2.A && c0Var2.R == null) {
                    if (b40.N0(c0Var2.getPin())) {
                        c0Var2.c();
                        if (!hf0.b.m()) {
                            return;
                        }
                        c0Var2.c();
                        if (!hf0.b.q()) {
                            return;
                        }
                    }
                    f30 pin2 = c0Var2.getPin();
                    Intrinsics.checkNotNullParameter(pin2, "<this>");
                    if (!kh2.b0.A1(pin2) || pin2.k5().booleanValue() || pin2.W4().booleanValue() || (Q6 = pin2.Q6()) == null || Q6.isEmpty()) {
                        return;
                    }
                    lh0.b0 e13 = c0Var2.e();
                    lh0.z3 z3Var = lh0.a4.f83298b;
                    lh0.g1 g1Var = (lh0.g1) e13.f83300a;
                    if (g1Var.o("android_visual_closeup_entry_point", "enabled", z3Var) || g1Var.l("android_visual_closeup_entry_point")) {
                        return;
                    }
                    c0Var2.q(pin, flashlightStelaDots);
                }
            }
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return getPin() != null && (this.f109239u.isEmpty() ^ true);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // jq.a
    public final void showLoadingSpinner(boolean z13) {
        oq.c0 c0Var = this.f109238t;
        if (c0Var != null) {
            FrameLayout frameLayout = c0Var.f96990o;
            xk2.k kVar = c0Var.f96991p;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(c0Var.getContext());
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout2.setForegroundGravity(17);
                c0Var.f96990o = frameLayout2;
                GestaltSpinner gestaltSpinner = (GestaltSpinner) kVar.getValue();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                gestaltSpinner.setLayoutParams(layoutParams);
                FrameLayout frameLayout3 = c0Var.f96990o;
                if (frameLayout3 != null) {
                    frameLayout3.addView((GestaltSpinner) kVar.getValue());
                }
            }
            if (!z13) {
                dl2.b.X2((GestaltSpinner) kVar.getValue(), ln1.e.LOADED);
                c0Var.removeView(c0Var.f96990o);
                return;
            }
            dl2.b.X2((GestaltSpinner) kVar.getValue(), ln1.e.LOADING);
            FrameLayout frameLayout4 = c0Var.f96990o;
            if (frameLayout4 != null) {
                kh2.k3.M1(frameLayout4, c0Var);
            }
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateActive(boolean z13) {
        super.updateActive(z13);
        f30 pin = getPin();
        if (pin != null) {
            oq.c0 c0Var = this.f109238t;
            if (c0Var != null) {
                c0Var.t(pin, z13);
            }
            oq.c0 c0Var2 = this.f109238t;
            if (c0Var2 != null) {
                maybeBringExistingGradientToFront$closeup_release(c0Var2);
            }
        }
    }

    @Override // rq.r1
    public final void updateMediaViewSize(int i13) {
        sf1.e1 e1Var;
        oq.j jVar;
        WebImageView webImageView;
        ViewGroup.LayoutParams layoutParams;
        ArrayList arrayList = this.f109239u;
        int b03 = c0.d.b0((((um) arrayList.get(0)).f42587d * 1.0f) / ((um) arrayList.get(0)).f42588e, i13);
        oq.c0 c0Var = this.f109238t;
        if (c0Var != null && (jVar = c0Var.f96995t) != null && (webImageView = jVar.f97065k) != null && (layoutParams = webImageView.getLayoutParams()) != null) {
            layoutParams.height = i13;
            layoutParams.width = b03;
        }
        oq.c0 c0Var2 = this.f109238t;
        if (c0Var2 != null && (e1Var = c0Var2.f96996u) != null) {
            e1Var.K0(i13);
        }
        addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 5));
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        oq.c0 c0Var;
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean w13 = ((es.c) getAdFormats()).w(pin, new g1(this, 3));
        ArrayList arrayList = this.f109239u;
        if (w13) {
            arrayList.clear();
            es.h hVar = this.f109235q;
            if (hVar == null) {
                Intrinsics.r("adsCommonDisplay");
                throw null;
            }
            lh0.d dVar = this.f109231m;
            if (dVar == null) {
                Intrinsics.r("adFormatsLibraryExperiments");
                throw null;
            }
            ArrayList t13 = ((es.v) hVar).t(pin, dVar);
            if (t13 != null) {
                Iterator it = t13.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(rl2.g0.q((f30) it.next()));
                }
            }
        } else {
            arrayList.clear();
            arrayList.addAll(rl2.g0.q(pin));
        }
        this.f109236r = com.bumptech.glide.c.Y(new yk1.a(getResources(), getContext().getTheme()), pin, true, false, b().F(), new z3.m(this, 24), 8);
        String string = pin.g4();
        if (string != null && !pin.d5().booleanValue() && (c0Var = this.f109238t) != null) {
            Intrinsics.checkNotNullParameter(string, "labelText");
            oq.o oVar = c0Var.I;
            if (oVar != null) {
                Intrinsics.checkNotNullParameter(string, "labelText");
                Intrinsics.checkNotNullParameter(string, "string");
                pk.a0.q(oVar.f97111a, new u50.f0(string));
                bs1.c.U1(oVar);
            }
        }
        super.updatePin(pin);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        oq.c0 c0Var;
        f30 pin;
        jq.j jVar;
        oq.c0 c0Var2;
        super.updateView();
        ArrayList arrayList = this.f109239u;
        if (arrayList.isEmpty() || (c0Var = this.f109238t) == null) {
            return;
        }
        f30 pin2 = getPin();
        if ((pin2 != null && df.j1.a1(pin2)) || ((pin = getPin()) != null && kh2.b0.B1(pin))) {
            c0Var.A = true;
            um umVar = (um) arrayList.get(0);
            getIsFullPinLoaded();
            oq.c0.x(c0Var, umVar, true, null, false, 20);
        } else if (((es.c) getAdFormats()).w(getPin(), new g1(this, 4))) {
            e();
        } else {
            um umVar2 = (um) arrayList.get(0);
            getIsFullPinLoaded();
            oq.c0.x(c0Var, umVar2, false, null, false, 22);
        }
        um umVar3 = (um) CollectionsKt.U(0, arrayList);
        if (umVar3 != null && (jVar = this.f109240v) != null && (c0Var2 = this.f109238t) != null) {
            c0Var2.u(jVar, umVar3.f42588e);
        }
        lh0.n1 n1Var = a11.o.f334a;
        boolean z13 = a11.o.a(getPin()) || a11.o.b(getPin());
        hs.d dVar = this.f109232n;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        GestaltIconButton upGradientAndMaybeCreateOverflowButton$closeup_release$default = r1.setUpGradientAndMaybeCreateOverflowButton$closeup_release$default(this, c0Var, this.f109221c, z13, dVar.a(), false, 16, null);
        if (upGradientAndMaybeCreateOverflowButton$closeup_release$default != null) {
            gs0.k kVar = this.f109228j;
            if (kVar != null) {
                r1.updatePinOverflowMenuModal$closeup_release$default(this, upGradientAndMaybeCreateOverflowButton$closeup_release$default, kVar, this.f109223e, this.f109224f, null, 16, null);
            } else {
                Intrinsics.r("pinOverflowMenuModalProvider");
                throw null;
            }
        }
    }
}
