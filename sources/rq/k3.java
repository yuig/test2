package rq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ou;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k3 extends j {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f109339w = 0;

    /* renamed from: c, reason: collision with root package name */
    public final oq.j0 f109340c;

    /* renamed from: d, reason: collision with root package name */
    public final e11.a f109341d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f109342e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f109343f;

    /* renamed from: g, reason: collision with root package name */
    public ek2.j f109344g;

    /* renamed from: h, reason: collision with root package name */
    public up0.l f109345h;

    /* renamed from: i, reason: collision with root package name */
    public zf0.f f109346i;

    /* renamed from: j, reason: collision with root package name */
    public m60.w f109347j;

    /* renamed from: k, reason: collision with root package name */
    public lh0.a0 f109348k;

    /* renamed from: l, reason: collision with root package name */
    public hs.d f109349l;

    /* renamed from: m, reason: collision with root package name */
    public is1.i0 f109350m;

    /* renamed from: n, reason: collision with root package name */
    public es.a f109351n;

    /* renamed from: o, reason: collision with root package name */
    public GestaltPreviewTextView f109352o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f109353p;

    /* renamed from: q, reason: collision with root package name */
    public List f109354q;

    /* renamed from: r, reason: collision with root package name */
    public final gg0.n f109355r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f109356s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f109357t;

    /* renamed from: u, reason: collision with root package name */
    public final g2 f109358u;

    /* renamed from: v, reason: collision with root package name */
    public oq.m0 f109359v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(Context context, oq.j0 pinCloseupMetadataViewListener, e11.a pinCloseupMetadataModuleListener, boolean z13, boolean z14) {
        super(context, 9);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataViewListener, "pinCloseupMetadataViewListener");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataModuleListener, "pinCloseupMetadataModuleListener");
        this.f109340c = pinCloseupMetadataViewListener;
        this.f109341d = pinCloseupMetadataModuleListener;
        this.f109342e = z13;
        this.f109343f = z14;
        int b03 = bs1.c.b0(this, eo1.c.space_700);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_spacing_vertical_small);
        getPaddingRect().left = getResources().getDimensionPixelSize(n80.a.lego_closeup_module_left_padding);
        getPaddingRect().right = getResources().getDimensionPixelSize(eo1.c.lego_closeup_module_right_padding);
        getPaddingRect().top = dimensionPixelSize;
        getPaddingRect().bottom = dimensionPixelSize;
        this.f109355r = new gg0.n();
        if (z14) {
            this.f109358u = new g2(context);
            if (z13) {
                pinCloseupMetadataModuleListener.w6(b03);
            }
        }
    }

    public final boolean b() {
        f30 pin;
        wy0 z53;
        wy0 z54;
        f30 pin2 = getPin();
        if (pin2 != null) {
            Boolean X4 = pin2.X4();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.d(X4, bool)) {
                f30 pin3 = getPin();
                if (((pin3 == null || (z54 = pin3.z5()) == null) ? null : z54.E4()) != null && (pin = getPin()) != null && (z53 = pin.z5()) != null && Intrinsics.d(z53.I3(), bool)) {
                    lh0.a0 a0Var = this.f109348k;
                    if (a0Var == null) {
                        Intrinsics.r("experiments");
                        throw null;
                    }
                    lh0.z3 z3Var = lh0.a4.f83298b;
                    lh0.g1 g1Var = (lh0.g1) a0Var.f83294a;
                    if (g1Var.o("android_closeup_links", "enabled", z3Var) || g1Var.l("android_closeup_links")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        CharSequence text;
        setOrientation(1);
        updateHorizontalPadding();
        final int i13 = 0;
        getPaddingRect().bottom = isTabletLandscapeMode() ? getResources().getDimensionPixelSize(eo1.c.lego_spacing_horizontal_medium) : 0;
        nx.d0 viewPinalytics = getViewPinalytics();
        tb0.p pVar = tb0.p.CLOSEUP;
        nx.d0 E = kh2.n3.E(viewPinalytics, pVar);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltPreviewTextView gestaltPreviewTextView = new GestaltPreviewTextView(6, context, (AttributeSet) null);
        gestaltPreviewTextView.j(new m1(E, this, gestaltPreviewTextView, 2));
        kh2.m0.g(gestaltPreviewTextView, new h3(gestaltPreviewTextView, i13));
        this.f109352o = gestaltPreviewTextView;
        addView(gestaltPreviewTextView);
        updateView();
        if (this.f109343f) {
            removeAllViews();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            nx.d0 E2 = kh2.n3.E(getViewPinalytics(), pVar);
            hs.d dVar = this.f109349l;
            if (dVar == null) {
                Intrinsics.r("moduleViewabilityHelper");
                throw null;
            }
            final oq.m0 m0Var = new oq.m0(context2, E2, this.f109340c, dVar);
            if (!this.f109342e) {
                if (!m0Var.isLaidOut() || m0Var.isLayoutRequested()) {
                    m0Var.addOnLayoutChangeListener(new n5.h(1, this, m0Var));
                } else {
                    this.f109341d.w6(m0Var.getHeight());
                }
            }
            g2 pinCloseupRecipeMetadataModule = this.f109358u;
            if (pinCloseupRecipeMetadataModule != null) {
                Intrinsics.checkNotNullParameter(pinCloseupRecipeMetadataModule, "pinCloseupRecipeMetadataModule");
                boolean hasContent = pinCloseupRecipeMetadataModule.hasContent();
                LinearLayout linearLayout = m0Var.f97085f;
                oq.j0 j0Var = m0Var.f97081b;
                b11.d dVar2 = m0Var.f97084e;
                View view = m0Var.f97089j;
                if (hasContent) {
                    if (m0Var.f97083d == null) {
                        m0Var.f97083d = pinCloseupRecipeMetadataModule;
                    }
                    ViewGroup.LayoutParams layoutParams = pinCloseupRecipeMetadataModule.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    pinCloseupRecipeMetadataModule.setLayoutParams(layoutParams);
                    m0Var.b(pinCloseupRecipeMetadataModule);
                    Context context3 = m0Var.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
                    pp2.a.k(gestaltText, oq.n.f97102u);
                    final int i14 = r0 ? 1 : 0;
                    gestaltText.j(new gm1.a() { // from class: oq.h0
                        @Override // gm1.a
                        public final void h3(gm1.c event) {
                            int i15 = i14;
                            m0 this$0 = m0Var;
                            switch (i15) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if (event instanceof rn1.f) {
                                        ((x0) this$0.f97081b).S0();
                                        break;
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if (event instanceof rn1.f) {
                                        ((x0) this$0.f97081b).S0();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(gestaltText);
                    linearLayout.addView(view);
                    dVar2.addView(linearLayout);
                    m0Var.addView(dVar2);
                    if (!m0Var.isLaidOut() || m0Var.isLayoutRequested()) {
                        m0Var.addOnLayoutChangeListener(new oq.k0(m0Var, i13));
                    } else {
                        GestaltText gestaltText2 = m0Var.f97087h;
                        ((oq.x0) j0Var).P0((gestaltText2 == null || (text = gestaltText2.getText()) == null || text.length() <= 0) ? false : true);
                    }
                    m0Var.f97087h = gestaltText;
                } else {
                    Context context4 = m0Var.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    GestaltText gestaltText3 = new GestaltText(6, context4, (AttributeSet) null);
                    gestaltText3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    gestaltText3.setBreakStrategy(0);
                    pp2.a.k(gestaltText3, new oq.l0(m0Var, 0));
                    gestaltText3.j(new gm1.a() { // from class: oq.h0
                        @Override // gm1.a
                        public final void h3(gm1.c event) {
                            int i15 = i13;
                            m0 this$0 = m0Var;
                            switch (i15) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if (event instanceof rn1.f) {
                                        ((x0) this$0.f97081b).S0();
                                        break;
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if (event instanceof rn1.f) {
                                        ((x0) this$0.f97081b).S0();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    m0Var.b(gestaltText3);
                    if (!m0Var.isLaidOut() || m0Var.isLayoutRequested()) {
                        m0Var.addOnLayoutChangeListener(new oq.k0(m0Var, r0 ? 1 : 0));
                    } else {
                        GestaltText gestaltText4 = m0Var.f97086g;
                        ((oq.x0) j0Var).P0((gestaltText4 != null ? gestaltText4.getLineCount() : 0) > oq.m0.a(m0Var));
                    }
                    m0Var.f97086g = gestaltText3;
                    linearLayout.addView(view);
                    dVar2.addView(linearLayout);
                    m0Var.addView(dVar2);
                }
            }
            this.f109359v = m0Var;
            addView(m0Var);
            int W = bs1.c.W(this, eo1.c.space_400);
            getPaddingRect().left = W;
            getPaddingRect().right = W;
            getPaddingRect().top = bs1.c.W(this, eo1.c.space_100);
            getPaddingRect().bottom = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap getCardViewAuxData() {
        /*
            r4 = this;
            oq.m0 r0 = r4.f109359v
            r1 = 0
            if (r0 == 0) goto L3a
            com.pinterest.gestalt.text.GestaltText r0 = r0.f97086g
            if (r0 == 0) goto L28
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            android.text.Layout r2 = r0.getLayout()
            java.lang.CharSequence r0 = r0.getText()
            if (r2 == 0) goto L28
            if (r0 == 0) goto L28
            r3 = 0
            int r2 = r2.getLineVisibleEnd(r3)
            java.lang.CharSequence r0 = r0.subSequence(r3, r2)
            java.lang.String r0 = r0.toString()
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L3a
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = "pin_closeup_description_preview"
            r1.<init>(r2, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r1}
            java.util.HashMap r1 = bs1.c.o(r0)
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.k3.getCardViewAuxData():java.util.HashMap");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_SOURCE_DESCRIPTION;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        f30 pin = getPin();
        if (pin == null) {
            return false;
        }
        boolean[] zArr = pin.f37485h3;
        return zArr.length > 26 && zArr[26];
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ek2.j jVar = this.f109344g;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f109344g = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        gg0.n nVar = this.f109355r;
        if (nVar == null || !z13) {
            return;
        }
        if (this.f109346i == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        xk2.v vVar = zf0.f.f141903e;
        if (df.j1.D0(i32.y0.ANDROID_PIN_CLOSEUP_TAKEOVER, i32.l.ANDROID_CLICKTHROUGH_BTN_TOOLTIP)) {
            m60.w wVar = this.f109347j;
            if (wVar != null) {
                wVar.d(nVar);
            } else {
                Intrinsics.r("eventManager");
                throw null;
            }
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0028, code lost:
    
        if (((es.c) r0).M(getPin()) == false) goto L15;
     */
    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldShowForPin() {
        /*
            r3 = this;
            com.pinterest.api.model.f30 r0 = r3.getPin()
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = com.pinterest.api.model.b40.r0(r0)
            if (r0 != 0) goto Le
            goto L2a
        Le:
            com.pinterest.api.model.f30 r0 = r3.getPin()
            if (r0 == 0) goto L46
            boolean r0 = com.pinterest.api.model.b40.r0(r0)
            if (r0 != r1) goto L46
            es.a r0 = r3.f109351n
            if (r0 == 0) goto L3f
            com.pinterest.api.model.f30 r2 = r3.getPin()
            es.c r0 = (es.c) r0
            boolean r0 = r0.M(r2)
            if (r0 != 0) goto L46
        L2a:
            boolean r0 = r3.f109356s
            if (r0 != 0) goto L38
            boolean r0 = r3.f109357t
            if (r0 != 0) goto L38
            boolean r0 = r3.b()
            if (r0 == 0) goto L46
        L38:
            boolean r0 = r3.getIsFullPinLoaded()
            if (r0 == 0) goto L46
            goto L47
        L3f:
            java.lang.String r0 = "adFormats"
            kotlin.jvm.internal.Intrinsics.r(r0)
            r0 = 0
            throw r0
        L46:
            r1 = 0
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.k3.shouldShowForPin():boolean");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        f30 pin = getPin();
        return (Intrinsics.d(this.f109353p, pin != null ? pin.N3() : null) ^ true) || !kh2.k3.v1(this);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        String h10;
        String e13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean z13 = true;
        int i13 = 0;
        this.f109356s = pin.N3() != null ? !kotlin.text.z.j(r0) : false;
        ou w53 = pin.w5();
        boolean z14 = (w53 == null || (e13 = w53.e()) == null) ? false : !kotlin.text.z.j(e13);
        ou w54 = pin.w5();
        boolean z15 = (w54 == null || (h10 = w54.h()) == null) ? false : !kotlin.text.z.j(h10);
        if (!z14 && !z15) {
            z13 = false;
        }
        this.f109357t = z13;
        g2 g2Var = this.f109358u;
        if (g2Var != null) {
            g2Var.updatePin(pin);
        }
        f30 pin2 = getPin();
        if (pin2 != null && Intrinsics.d(pin2.j5(), Boolean.TRUE) && this.f109344g == null) {
            is1.i0 i0Var = this.f109350m;
            if (i0Var == null) {
                Intrinsics.r("translationsTracker");
                throw null;
            }
            f30 pin3 = getPin();
            String uid = pin3 != null ? pin3.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            this.f109344g = (ek2.j) i0Var.c(uid).F(new d1(12, new i3(this, i13)), new d1(13, f2.f109195w), ck2.i.f27923c, ck2.i.f27924d);
        }
        super.updatePin(pin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0312  */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.text.SpannableStringBuilder, java.lang.CharSequence, java.lang.Object] */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateView() {
        /*
            Method dump skipped, instructions count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.k3.updateView():void");
    }
}
