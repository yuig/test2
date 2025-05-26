package k81;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h2;
import com.pinterest.api.model.q11;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.feature.search.visual.cropper.FlashlightCropperView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.repository.pin.PinService;
import com.pinterest.ui.view.MaskedWebImageView;
import com.pinterest.ui.view.TopBottomGradientView;
import h32.d4;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jk2.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.a4;
import lh0.f4;
import lh0.g1;
import lh0.o4;
import lh0.z0;
import lh0.z3;
import m60.s0;
import nx.d0;
import nx.f0;
import ql2.s;
import s71.q;
import s71.u;
import so.n6;
import w01.t;
import wk1.n;
import wt1.c0;
import x02.a2;
import x02.i2;
import xk2.v;
import zd1.m;
import zd1.o;
import zd1.p;

/* loaded from: classes5.dex */
public final class l extends n implements i81.c, ca2.b, de1.c, m {
    public float A;
    public final v A0;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public Float G;
    public Float H;
    public Float I;

    /* renamed from: J, reason: collision with root package name */
    public Float f78606J;
    public f30 K;
    public final ArrayList L;
    public st1.b M;
    public float N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public b S;
    public final Handler T;
    public final tb0.h U;
    public boolean V;
    public q11 W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final wk1.c f78607a;

    /* renamed from: a0, reason: collision with root package name */
    public float f78608a0;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f78609b;

    /* renamed from: b0, reason: collision with root package name */
    public float f78610b0;

    /* renamed from: c, reason: collision with root package name */
    public String f78611c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f78612c0;

    /* renamed from: d, reason: collision with root package name */
    public Float f78613d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f78614d0;

    /* renamed from: e, reason: collision with root package name */
    public float f78615e;

    /* renamed from: e0, reason: collision with root package name */
    public g42.c f78616e0;

    /* renamed from: f, reason: collision with root package name */
    public i81.e f78617f;

    /* renamed from: f0, reason: collision with root package name */
    public ek2.j f78618f0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f78619g;

    /* renamed from: g0, reason: collision with root package name */
    public ek2.j f78620g0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f78621h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f78622h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f78623i;

    /* renamed from: i0, reason: collision with root package name */
    public p f78624i0;

    /* renamed from: j, reason: collision with root package name */
    public final float f78625j;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f78626j0;

    /* renamed from: k, reason: collision with root package name */
    public final float f78627k;

    /* renamed from: k0, reason: collision with root package name */
    public final v f78628k0;

    /* renamed from: l, reason: collision with root package name */
    public final w81.d f78629l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f78630l0;

    /* renamed from: m, reason: collision with root package name */
    public final String f78631m;

    /* renamed from: m0, reason: collision with root package name */
    public List f78632m0;

    /* renamed from: n, reason: collision with root package name */
    public final o f78633n;

    /* renamed from: n0, reason: collision with root package name */
    public List f78634n0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f78635o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f78636o0;

    /* renamed from: p, reason: collision with root package name */
    public final ax.a f78637p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f78638p0;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f78639q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f78640q0;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f78641r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f78642r0;

    /* renamed from: s, reason: collision with root package name */
    public final PinService f78643s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f78644s0;

    /* renamed from: t, reason: collision with root package name */
    public final o4 f78645t;

    /* renamed from: t0, reason: collision with root package name */
    public RectF f78646t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f78647u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f78648u0;

    /* renamed from: v, reason: collision with root package name */
    public RectF f78649v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f78650v0;

    /* renamed from: w, reason: collision with root package name */
    public float f78651w;

    /* renamed from: w0, reason: collision with root package name */
    public final k f78652w0;

    /* renamed from: x, reason: collision with root package name */
    public float f78653x;

    /* renamed from: x0, reason: collision with root package name */
    public final e f78654x0;

    /* renamed from: y, reason: collision with root package name */
    public float f78655y;

    /* renamed from: y0, reason: collision with root package name */
    public final j f78656y0;

    /* renamed from: z, reason: collision with root package name */
    public float f78657z;

    /* renamed from: z0, reason: collision with root package name */
    public final j81.e f78658z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(wk1.c parameters, i2 pinRepository, String pinUid, Float f13, float f14, i81.e imageSearchEntry, i81.f imageSearchType, boolean z13, boolean z14, boolean z15, float f15, float f16, w81.d dVar, String entryPoint, o oVar, boolean z16, ax.a adsStlCache, boolean z17, boolean z18, PinService pinService, o4 visualSearchExperiments, String requestParams, f4 structuredFeedExperiments, nr0.m dynamicGridViewBinderDelegateFactory, f0 pinalyticsFactory, sq0.f imagePreFetcher, boolean z19, String searchQuery, String navigationSource, r prefsManagerUser, ni0.e adsCarouselPresenterFactory) {
        super(parameters);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(imageSearchEntry, "imageSearchEntry");
        Intrinsics.checkNotNullParameter(imageSearchType, "imageSearchType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(adsStlCache, "adsStlCache");
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(visualSearchExperiments, "visualSearchExperiments");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        Intrinsics.checkNotNullParameter(structuredFeedExperiments, "structuredFeedExperiments");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(imagePreFetcher, "imagePreFetcher");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(adsCarouselPresenterFactory, "adsCarouselPresenterFactory");
        this.f78607a = parameters;
        this.f78609b = pinRepository;
        this.f78611c = pinUid;
        this.f78613d = f13;
        this.f78615e = f14;
        this.f78617f = imageSearchEntry;
        this.f78619g = z13;
        this.f78621h = z14;
        this.f78623i = z15;
        this.f78625j = f15;
        this.f78627k = f16;
        this.f78629l = dVar;
        this.f78631m = entryPoint;
        this.f78633n = oVar;
        this.f78635o = z16;
        this.f78637p = adsStlCache;
        this.f78639q = z17;
        this.f78641r = z18;
        this.f78643s = pinService;
        this.f78645t = visualSearchExperiments;
        this.L = new ArrayList();
        this.O = 4;
        this.P = 4;
        this.Q = true;
        this.R = true;
        this.S = b.NONE;
        this.T = new Handler(Looper.getMainLooper());
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        this.U = hVar;
        this.X = -1;
        int i13 = 0;
        this.Z = this.f78617f == i81.e.FLASHLIGHT;
        this.f78608a0 = 1.0f;
        this.f78610b0 = 1.0f;
        this.f78616e0 = g42.c.DEFAULT_CROP;
        this.f78624i0 = z19 ? p.PRODUCT_FILTER_SOURCE_RELATED_PRODUCTS : p.PRODUCT_FILTER_SOURCE_INVALID;
        boolean z23 = imageSearchType == i81.f.FLASHLIGHT_UNIFIED_FEED || imageSearchType == i81.f.P2Z_UNIFIED_FEED;
        this.f78626j0 = z23;
        this.f78628k0 = xk2.m.b(new f(this, i13));
        this.f78636o0 = true;
        this.f78638p0 = true;
        k kVar = new k(this, i13);
        this.f78652w0 = kVar;
        this.f78654x0 = new e(this);
        this.f78656y0 = new j(this);
        String str = this.f78611c;
        uk1.d presenterPinalytics = getPresenterPinalytics();
        wa2.i iVar = parameters.f130131b.f103320a;
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        qa2.n nVar = parameters.f130131b;
        n6 n6Var = (n6) dynamicGridViewBinderDelegateFactory;
        this.f78658z0 = new j81.e(str, presenterPinalytics, pinalyticsFactory, iVar, parameters.f130136g, parameters.f130137h, n6Var.a(presenterPinalytics2, nVar.f103320a, nVar, parameters.f130137h), imagePreFetcher, kVar, structuredFeedExperiments, this.f78617f, !z23, searchQuery, navigationSource, z23 ? a.a.k("visual_search/flashlight/pin/", this.f78611c, "/unified/") : a.a.k("visual_search/flashlight/pin/", this.f78611c, "/"), requestParams, z13, prefsManagerUser, false, 262144);
        this.A0 = xk2.m.b(new t(this, n6Var, imagePreFetcher, adsCarouselPresenterFactory, structuredFeedExperiments, searchQuery, navigationSource));
    }

    public final void B3(float f13, float f14, float f15, float f16, RectF rectF, RectF rectF2, Boolean bool, String str, boolean z13, boolean z14) {
        i81.d dVar;
        i81.d dVar2 = (i81.d) getViewIfBound();
        boolean z15 = this.f78621h;
        if (dVar2 != null) {
            l81.l lVar = (l81.l) dVar2;
            com.pinterest.feature.search.visual.cropper.m mVar = lVar.K1;
            if (mVar != null) {
                mVar.i(true);
            }
            RectF rectF3 = z15 ? rectF : rectF2;
            Intrinsics.checkNotNullParameter(rectF3, "rectF");
            if (lVar.x9()) {
                MaskedWebImageView t93 = lVar.t9();
                if (t93 != null) {
                    t93.j3(rectF3);
                }
            } else {
                com.pinterest.feature.search.visual.cropper.m mVar2 = lVar.K1;
                if (mVar2 != null) {
                    mVar2.j(rectF3);
                }
            }
        }
        wk1.c cVar = this.f78607a;
        o oVar = this.f78633n;
        j81.e eVar = this.f78658z0;
        boolean z16 = this.f78635o;
        if (z13) {
            this.f78616e0 = g42.c.CUSTOM_CROP;
            this.f78649v = rectF2;
            this.C = f13;
            this.D = f14;
            this.E = f13 + f15;
            this.F = f14 + f16;
            j4();
            if (z16) {
                eVar.M = true;
                eVar.q0(new HashMap());
                cVar.f130131b.f103320a.f128764c0 = null;
            }
            this.Y = true;
            if (oVar != null) {
                oVar.f141743g = null;
                m mVar3 = oVar.f141744h;
                if (mVar3 != null) {
                    mVar3.r1(false);
                }
            }
            F3();
            this.f78630l0 = false;
            if (z15) {
                i81.d dVar3 = (i81.d) getViewIfBound();
                if (dVar3 != null) {
                    ((l81.l) dVar3).N9(true);
                }
                I3();
                return;
            }
            return;
        }
        if (!((Boolean) this.f78628k0.getValue()).booleanValue()) {
            N3(f13, f14, f15, f16, bool != null ? bool.booleanValue() : false, false, rectF2);
            return;
        }
        if (isBound()) {
            this.f78616e0 = g42.c.CUTOUT;
            this.C = f13;
            this.D = f14;
            this.E = f13 + f15;
            this.F = f14 + f16;
            j4();
            if (z16) {
                eVar.M = true;
                eVar.q0(new HashMap());
                cVar.f130131b.f103320a.f128764c0 = null;
            }
            this.Y = true;
            this.f78649v = rectF2;
            if (oVar != null) {
                oVar.f141743g = null;
                m mVar4 = oVar.f141744h;
                if (mVar4 != null) {
                    mVar4.r1(false);
                }
            }
            F3();
            if (z15 && z14 && (dVar = (i81.d) getViewIfBound()) != null) {
                ((l81.l) dVar).N9(true);
            }
            this.f78630l0 = true;
        }
    }

    public final boolean D3() {
        return this.Q;
    }

    public final void F3() {
        u uVar;
        ov1.k kVar;
        da2.g gVar;
        vb0.j.f125466a.R(Intrinsics.d(Looper.myLooper(), Looper.getMainLooper()), "loadFlashlightResults() should only be called from the main thread", tb0.p.FLASHLIGHT, new Object[0]);
        if (isBound()) {
            o oVar = this.f78633n;
            if (oVar != null) {
                oVar.f141743g = null;
                m mVar = oVar.f141744h;
                if (mVar != null) {
                    mVar.r1(false);
                }
            }
            i81.d dVar = (i81.d) getViewIfBound();
            if (dVar != null && (gVar = ((l81.l) dVar).f82179q1) != null) {
                gVar.b(0);
            }
            if (this.C == 0.0f && this.D == 0.0f && this.E == 0.0f && this.F == 0.0f) {
                h4();
            }
            this.f78636o0 = true;
            RectF rectF = this.f78649v;
            boolean z13 = ((rectF == null || com.bumptech.glide.d.o0(Boolean.valueOf(rectF.isEmpty()))) && this.f78610b0 == 1.0f) ? false : true;
            if (z13) {
                this.f78647u = true;
            }
            if (this.f78647u) {
                if (z13) {
                    i81.d dVar2 = (i81.d) getViewIfBound();
                    if (dVar2 != null && (kVar = ((l81.l) dVar2).P2) != null) {
                        kVar.e();
                    }
                } else {
                    i81.d dVar3 = (i81.d) getViewIfBound();
                    if (dVar3 != null) {
                        l81.l lVar = (l81.l) dVar3;
                        FrameLayout frameLayout = lVar.W1;
                        if (frameLayout != null) {
                            frameLayout.setAlpha(1.0f);
                        }
                        ov1.k kVar2 = lVar.P2;
                        if (kVar2 != null) {
                            kVar2.n();
                        }
                    }
                }
            }
            e4();
            j81.e eVar = this.f78658z0;
            eVar.S = true;
            eVar.u0(Float.valueOf(this.C));
            eVar.v0(Float.valueOf(this.D));
            eVar.s0(Float.valueOf(this.E - this.C));
            eVar.h0(Float.valueOf(this.F - this.D));
            int i13 = d.f78594a[this.f78617f.ordinal()];
            if (i13 == 1) {
                uVar = u.VISUAL_SOURCE_FLASHLIGHT;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                uVar = u.VISUAL_SOURCE_PINCH_TO_ZOOM;
            }
            eVar.r0(uVar);
            eVar.g0(this.f78617f == i81.e.P2Z ? Integer.valueOf(g42.c.CUSTOM_CROP.getValue()) : Integer.valueOf(this.f78616e0.getValue()));
            eVar.f0();
            w3();
        }
    }

    public final void G3() {
        String str;
        Boolean bool;
        String str2 = this.f78611c;
        o4 o4Var = this.f78645t;
        o4Var.getClass();
        z3 activate = a4.f83298b;
        z0 z0Var = o4Var.f83453a;
        g1 g1Var = (g1) z0Var;
        if (g1Var.o("dtn_exp6_uve4a", "enabled", activate) || g1Var.l("dtn_exp6_uve4a")) {
            str = "dtn_exp6_yolov8";
            bool = Boolean.FALSE;
        } else {
            str = null;
            bool = null;
        }
        Boolean bool2 = bool;
        Intrinsics.checkNotNullParameter("enabled_dtn_exp5_skip_gss", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        addDisposable(nl.b.q(pk2.f.k(this.f78643s.getPinSegmentationSam(str2, "visual_cutout", true, ((g1) z0Var).k("dtn_exp6_uve4a", "enabled_dtn_exp5_skip_gss", activate) ? null : str, bool, bool2).r(tk2.e.f118017c), "observeOn(...)"), new g(this, 2), h.f78600i));
    }

    public final void H3() {
        if (isBound() && this.Q) {
            F3();
        }
    }

    public final void I3() {
        RectF rectF;
        if (this.Q) {
            return;
        }
        if ((this.f78617f == i81.e.FLASHLIGHT || this.Z) && (rectF = this.f78649v) != null) {
            if (this.f78621h) {
                K3(this.f78644s0);
            } else if ((rectF.height() * 0.5d) + rectF.top <= this.f78615e) {
                K3(this.f78644s0);
            }
        }
    }

    public final void J3() {
        i81.d dVar;
        List list = this.f78634n0;
        if (list == null || list.isEmpty() || this.f78610b0 != 1.0f) {
            return;
        }
        RectF rectF = this.f78649v;
        if ((rectF == null || com.bumptech.glide.d.o0(Boolean.valueOf(rectF.isEmpty()))) && (dVar = (i81.d) getViewIfBound()) != null) {
            l81.l lVar = (l81.l) dVar;
            FrameLayout frameLayout = lVar.W1;
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            ov1.k kVar = lVar.P2;
            if (kVar != null) {
                kVar.n();
            }
        }
    }

    public final void K3(boolean z13) {
        if (this.Q) {
            return;
        }
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar != null) {
            i81.d.y4(dVar, z13);
        }
        this.Q = true;
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: L3, reason: merged with bridge method [inline-methods] */
    public final void r3(i81.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        l81.l lVar = (l81.l) view;
        lVar.f82177p1 = this;
        ca2.e eVar = lVar.f82176o2;
        if (eVar != null) {
            eVar.q(this);
        }
        g0 s13 = this.f78609b.L(this.f78611c).s();
        int i13 = 0;
        a81.a aVar = new a81.a(13, new g(this, i13));
        int i14 = 1;
        xj2.c o13 = s13.o(aVar, new a81.a(14, new g(this, i14)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
        i81.e eVar2 = this.f78617f;
        i81.e eVar3 = i81.e.FLASHLIGHT;
        boolean z13 = this.f78639q;
        if (eVar2 == eVar3 && !z13 && ((Boolean) this.f78628k0.getValue()).booleanValue() && !this.f78641r) {
            G3();
        }
        if (this.f78617f == eVar3 && !Intrinsics.d(this.f78631m, "closeup_dot") && !z13) {
            F3();
        }
        uk2.f fVar = this.f78658z0.f49129s;
        a81.a aVar2 = new a81.a(9, new g(this, 3));
        a81.a aVar3 = new a81.a(10, new g(this, 4));
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        this.f78618f0 = (ek2.j) fVar.F(aVar2, aVar3, cVar, a2Var);
        if (z13) {
            this.f78620g0 = (ek2.j) ((j81.c) this.A0.getValue()).f49129s.F(new a81.a(11, new i(view, i13)), new a81.a(12, new i(view, i14)), cVar, a2Var);
        }
    }

    @Override // ca2.b
    public final void M0(String str) {
        i81.e eVar = this.f78617f;
        i81.e eVar2 = i81.e.FLASHLIGHT;
        boolean z13 = this.f78619g;
        if ((eVar != eVar2 || z13) && !Intrinsics.d(str, "close_button_tapped")) {
            i81.d dVar = (i81.d) getViewIfBound();
            if (dVar != null) {
                l81.l lVar = (l81.l) dVar;
                float f13 = lVar.f82153c2 - (lVar.f82176o2 != null ? r1.f27259r : 0);
                f91.b bVar = lVar.E1;
                if (bVar != null) {
                    bVar.f61450a0 = (int) f13;
                }
                com.pinterest.feature.search.visual.cropper.m mVar = lVar.K1;
                if (mVar != null) {
                    mVar.f47990a = f13;
                }
                GestaltIconButton button = lVar.L1;
                if (button != null) {
                    Resources resources = lVar.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    Intrinsics.checkNotNullParameter(button, "button");
                    Intrinsics.checkNotNullParameter(resources, "resources");
                    if (button.getVisibility() == 0) {
                        button.post(new po.c(button, f13, resources));
                    }
                }
                lVar.L9(f13);
                RecyclerView g83 = lVar.g8();
                if (g83 != null) {
                    g83.G2(0);
                }
                if (z13) {
                    k4();
                    i81.d dVar2 = (i81.d) getViewIfBound();
                    if (dVar2 != null) {
                        ((l81.l) dVar2).o9();
                    }
                }
            }
        } else {
            i81.d dVar3 = (i81.d) getViewIfBound();
            if (dVar3 != null) {
                ((l81.l) dVar3).P7();
            }
        }
        this.Q = false;
    }

    public final void M3() {
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar != null) {
            l81.l lVar = (l81.l) dVar;
            f91.b bVar = lVar.E1;
            if (bVar != null) {
                ViewParent parent = bVar.getParent();
                FrameLayout frameLayout = lVar.D1;
                if (frameLayout == null) {
                    Intrinsics.r("zoomableImageRootContainer");
                    throw null;
                }
                if (Intrinsics.d(parent, frameLayout)) {
                    FrameLayout frameLayout2 = lVar.D1;
                    if (frameLayout2 == null) {
                        Intrinsics.r("zoomableImageRootContainer");
                        throw null;
                    }
                    frameLayout2.removeView(bVar);
                }
            }
            lVar.k9();
            com.pinterest.feature.search.visual.cropper.m mVar = lVar.K1;
            if (mVar != null) {
                mVar.a();
            }
        }
        this.Z = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N3(float f13, float f14, float f15, float f16, boolean z13, boolean z14, RectF dotCropRect) {
        Unit unit;
        Intrinsics.checkNotNullParameter(dotCropRect, "dotCropRect");
        if (isBound()) {
            this.f78616e0 = z13 ? g42.c.STELA_DOT : g42.c.SPOTLIGHT_DOT;
            this.C = f13;
            this.D = f14;
            this.E = f13 + f15;
            this.F = f14 + f16;
            j4();
            int i13 = 0;
            h2 h2Var = null;
            if (!this.f78639q) {
                boolean z15 = this.f78635o;
                j81.e eVar = this.f78658z0;
                if (z15) {
                    eVar.M = true;
                    eVar.q0(new HashMap());
                    this.f78607a.f130131b.f103320a.f128764c0 = null;
                }
                if (z14) {
                    ((sq0.e) ((i81.d) getView())).d3();
                    getPresenterPinalytics().c(h32.a4.SHOPPING_STELA_PRODUCTS_FEED, d4.FLASHLIGHT, null);
                    this.f78624i0 = p.PRODUCT_FILTER_SOURCE_STELA;
                    HashMap paramMap = kotlin.collections.z0.f(new Pair("is_shopping", "true"));
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(paramMap, "paramMap");
                    qz.f0 f0Var = eVar.f49121k;
                    if (f0Var != null) {
                        f0Var.f(paramMap);
                        unit = Unit.f80348a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        eVar.q0(paramMap);
                    }
                    eVar.f0();
                    da2.g gVar = ((l81.l) ((i81.d) getView())).f82179q1;
                    if (gVar != null) {
                        gVar.b(0);
                    }
                    this.Y = true;
                }
                this.f78649v = dotCropRect;
                o oVar = this.f78633n;
                if (oVar != null) {
                    oVar.f141743g = null;
                    m mVar = oVar.f141744h;
                    if (mVar != null) {
                        mVar.r1(false);
                    }
                }
                F3();
                if (this.f78626j0) {
                    q qVar = ((l81.l) ((i81.d) getView())).f82181r1;
                    if (qVar == null) {
                        Intrinsics.r("flashlightPinalytics");
                        throw null;
                    }
                    qVar.l(h32.a4.SHOPPING_DOT_FEED);
                }
                this.f78630l0 = true;
                return;
            }
            List a13 = ((ax.b) this.f78637p).a(this.f78611c);
            double d2 = f13;
            double d13 = f14;
            double d14 = f15;
            double d15 = f16;
            if (a13 != null) {
                Iterator it = a13.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    double d16 = d14;
                    double d17 = d2;
                    if (lp2.b.l(d2, d13, d16, d15, (h2) next)) {
                        h2Var = next;
                        break;
                    } else {
                        d14 = d16;
                        d2 = d17;
                    }
                }
                h2Var = h2Var;
            }
            if (h2Var != null) {
                if (!z14) {
                    i81.d dVar = (i81.d) getView();
                    Integer p13 = h2Var.p();
                    Intrinsics.checkNotNullExpressionValue(p13, "getSlotId(...)");
                    int intValue = p13.intValue();
                    ex.e eVar2 = ((l81.l) dVar).U1;
                    if (eVar2 != null) {
                        eVar2.c(intValue);
                    }
                    getPresenterPinalytics().d(d4.FLASHLIGHT, h32.a4.SHOPPING_DOT_FEED, null, h32.g0.ADS_STL_SHEET, null);
                }
                String o13 = h2Var.o();
                if (o13 == null) {
                    o13 = "";
                }
                vb0.j.f125466a.R(Intrinsics.d(Looper.myLooper(), Looper.getMainLooper()), "loadFlashlightResults() should only be called from the main thread", tb0.p.FLASHLIGHT, new Object[0]);
                if (isBound()) {
                    v vVar = this.A0;
                    j81.c cVar = (j81.c) vVar.getValue();
                    cVar.M = true;
                    qz.f0 f0Var2 = cVar.f49121k;
                    if (f0Var2 != null) {
                        f0Var2.e("category", o13);
                    }
                    if (isBound()) {
                        ((yq0.t) ((i81.d) getView())).resetRecyclerScrollListener();
                        ((j81.c) vVar.getValue()).Z();
                        this.T.post(new a(this, i13));
                    }
                }
            }
        }
    }

    public final void Q3(int i13, List visualObjects) {
        Intrinsics.checkNotNullParameter(visualObjects, "visualObjects");
        if (i13 == -1 || visualObjects.isEmpty()) {
            return;
        }
        this.X = i13;
        if (i13 < visualObjects.size()) {
            this.W = (q11) visualObjects.get(this.X);
        }
    }

    public final void R3() {
        i81.d dVar;
        o80.j jVar;
        if (this.f78648u0 || !this.f78621h || (dVar = (i81.d) getViewIfBound()) == null) {
            return;
        }
        b01.c cVar = new b01.c(26, this, dVar);
        f91.b bVar = ((l81.l) dVar).E1;
        if (bVar == null || (jVar = bVar.f61465p0) == null) {
            return;
        }
        jVar.q(cVar);
    }

    public final void S3() {
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar != null) {
            i81.d.y4(dVar, this.f78644s0);
        }
        i81.d dVar2 = (i81.d) getViewIfBound();
        if (com.bumptech.glide.d.o0(dVar2 != null ? Boolean.valueOf(((l81.l) dVar2).B9()) : null)) {
            J3();
        }
    }

    public final void T3() {
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar != null) {
            l81.l lVar = (l81.l) dVar;
            ca2.e eVar = lVar.f82176o2;
            if (eVar != null) {
                eVar.v("header_tapped");
            }
            RecyclerView g83 = lVar.g8();
            if (g83 != null) {
                g83.G2(0);
            }
        }
    }

    @Override // ca2.b
    public final void U2() {
        com.pinterest.feature.search.visual.cropper.m mVar;
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar != null) {
            l81.l lVar = (l81.l) dVar;
            f91.b bVar = lVar.E1;
            if (bVar != null) {
                bVar.f61450a0 = (int) lVar.f82164i2;
            }
            if (!lVar.x9() && (mVar = lVar.K1) != null) {
                mVar.f47990a = lVar.f82168k2;
            }
            GestaltIconButton button = lVar.L1;
            if (button != null) {
                float f13 = lVar.f82168k2;
                Resources resources = lVar.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(resources, "resources");
                if (button.getVisibility() == 0) {
                    button.post(new po.c(button, f13, resources));
                }
            }
            lVar.L9(lVar.f82168k2);
        }
        if (this.f78619g) {
            l4();
        }
        if (this.Q) {
            return;
        }
        this.Q = true;
        if (this.Y || !i4() || this.f78630l0) {
            return;
        }
        H3();
    }

    public final void U3() {
        i81.d dVar;
        ov1.k kVar;
        int i13 = 0;
        boolean z13 = !(this.f78610b0 == this.f78608a0);
        boolean z14 = !this.f78614d0;
        if (z13) {
            d0 d0Var = getPresenterPinalytics().f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0.v(d0Var, f1.VISUAL_SEARCH_IMAGE_ZOOM, this.f78611c, false, 12);
        } else if (z14) {
            d0 d0Var2 = getPresenterPinalytics().f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
            d0.v(d0Var2, f1.VISUAL_SEARCH_IMAGE_PAN, this.f78611c, false, 12);
        }
        this.f78614d0 = false;
        int i14 = 2;
        boolean z15 = this.f78621h;
        if (z15 && this.f78612c0 && this.P == 4) {
            float f13 = this.f78610b0;
            float f14 = this.f78608a0;
            if (f13 > f14 && Math.abs(f13 - f14) > 0.1f) {
                if (this.f78619g && this.Q && this.f78649v == null) {
                    this.Q = false;
                    this.f78644s0 = false;
                    i81.d dVar2 = (i81.d) getViewIfBound();
                    if (dVar2 != null) {
                        f fVar = new f(this, i14);
                        ca2.e eVar = ((l81.l) dVar2).f82176o2;
                        if (eVar != null) {
                            ca2.e.i(eVar, "image_zoomed", 0.0f, new androidx.appcompat.widget.q(fVar, i13), 2);
                        }
                    }
                    if (this.f78634n0 != null && (dVar = (i81.d) getViewIfBound()) != null && (kVar = ((l81.l) dVar).P2) != null) {
                        kVar.e();
                    }
                } else {
                    i81.d dVar3 = (i81.d) getViewIfBound();
                    if (dVar3 != null) {
                        ((l81.l) dVar3).N9(true);
                    }
                }
            }
        }
        if (z15) {
            float f15 = this.f78610b0;
            if (1.0f <= f15 && f15 <= 1.05f && this.f78608a0 > f15 && this.f78649v == null) {
                R3();
            }
        }
        this.f78608a0 = this.f78610b0;
        Handler handler = this.T;
        handler.removeCallbacksAndMessages(null);
        clearDisposables();
        if (!z15) {
            if (i4()) {
                this.f78616e0 = g42.c.CUSTOM_CROP;
                handler.postDelayed(new a(this, 3), 500L);
                return;
            }
            return;
        }
        if (!this.f78630l0 && this.Q && i4()) {
            this.f78616e0 = g42.c.CUSTOM_CROP;
            handler.postDelayed(new a(this, i14), 500L);
        }
    }

    public final void V3() {
        if (isBound()) {
            getPresenterPinalytics().f122379a.X(u0.FLASHLIGHT_IMAGE_OVERLAY);
            this.T.removeCallbacksAndMessages(null);
            clearDisposables();
            this.f78616e0 = g42.c.DEFAULT_CROP;
            h4();
            l81.l lVar = (l81.l) ((i81.d) getView());
            lVar.F9();
            lVar.d3();
            getPresenterPinalytics().c(h32.a4.SHOPPING_RELATED_PRODUCTS_FEED, d4.FLASHLIGHT, null);
            F3();
            com.pinterest.feature.search.visual.cropper.m mVar = ((l81.l) ((i81.d) getView())).K1;
            if (mVar != null) {
                mVar.b();
            }
        }
    }

    public final void W3(float f13) {
        RectF rectF;
        RectF rectF2;
        if (this.f78630l0 || (rectF = this.f78649v) == null || rectF.isEmpty() || (rectF2 = this.f78649v) == null) {
            return;
        }
        rectF2.top += f13;
        rectF2.bottom += f13;
    }

    public final void X3() {
        this.Y = true;
    }

    public final void Y3(RectF rectF, boolean z13) {
        boolean z14;
        List list;
        h81.c cVar;
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        if (!z13 && i4()) {
            H3();
            return;
        }
        if (((Boolean) this.f78628k0.getValue()).booleanValue() && !this.f78639q) {
            H3();
            return;
        }
        if (this.f78617f != i81.e.FLASHLIGHT || this.V) {
            return;
        }
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar != null) {
            l81.l lVar = (l81.l) dVar;
            Context context = lVar.getContext();
            if (context != null && lVar.f82174n2 != null && (list = lVar.F2) != null && (!list.isEmpty()) && ((cVar = lVar.B2) == null || !cVar.isAttachedToWindow())) {
                float f13 = lVar.f82156e2;
                com.pinterest.feature.search.visual.cropper.m mVar = lVar.K1;
                h81.c cVar2 = new h81.c(context, lVar.d2, f13, null, mVar != null ? mVar.f47997h.f47953a : 0);
                lVar.B2 = cVar2;
                FrameLayout frameLayout = lVar.D1;
                if (frameLayout == null) {
                    Intrinsics.r("zoomableImageRootContainer");
                    throw null;
                }
                frameLayout.addView(cVar2, -1, lVar.y9());
                q qVar = lVar.f82181r1;
                if (qVar == null) {
                    Intrinsics.r("flashlightPinalytics");
                    throw null;
                }
                g81.b bVar = new g81.b(list, lVar, qVar, lVar.p7(), lVar.f82158f2, lVar.f82156e2, lVar.f82164i2, lVar.f82185t1, lVar.f82187u1, lVar.r9(), false, lVar.G2, lVar.E2, 2048);
                h81.c cVar3 = lVar.B2;
                if (cVar3 != null) {
                    yk1.j.a().d(cVar3, bVar);
                }
                i81.c cVar4 = lVar.f82177p1;
                if (cVar4 != null) {
                    ((l) cVar4).Q3(lVar.H2, list);
                }
            }
            z14 = true;
        } else {
            z14 = true;
        }
        this.V = z14;
    }

    public final void Z3(boolean z13) {
        this.f78650v0 = z13;
    }

    public final void a4(float f13, boolean z13) {
        this.f78610b0 = f13;
        this.f78612c0 = z13;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        if (this.f78639q) {
            ((wk1.i) dataSources).b((j81.c) this.A0.getValue());
        } else {
            ((wk1.i) dataSources).b(this.f78658z0);
        }
    }

    public final void d4(RectF rectF, boolean z13) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        if (!isBound() || rectF.isEmpty()) {
            return;
        }
        l81.l lVar = (l81.l) ((i81.d) getView());
        lVar.getClass();
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        com.pinterest.feature.search.visual.cropper.m mVar = lVar.K1;
        if (mVar != null) {
            mVar.m(rectF);
        }
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        h81.c cVar = lVar.B2;
        if (cVar != null) {
            cVar.e(rectF.left - lVar.C2, rectF.top - lVar.D2);
        }
        lVar.O9(rectF.bottom);
        if (z13) {
            this.f78651w = s71.o.j(rectF.left);
            this.f78653x = s71.o.j(rectF.top);
            this.f78655y = s71.o.j(rectF.right);
            this.f78657z = s71.o.j(rectF.bottom);
            this.A = s71.o.j(rectF.width());
            this.B = s71.o.j(rectF.height());
        }
        if (this.Y) {
            this.Y = false;
        }
    }

    public final void e4() {
        j81.e eVar = this.f78658z0;
        qz.f0 f0Var = eVar.f49121k;
        if (f0Var != null) {
            f0Var.h("selected_descriptors");
        }
        eVar.k0(null);
        eVar.m0(null);
        eVar.j0(null);
        eVar.o0(null);
        eVar.p0(null);
        eVar.i0(null);
        this.f78640q0 = false;
        this.f78638p0 = true;
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar != null) {
            ((l81.l) dVar).M9("");
        }
    }

    public final void f4() {
        i81.d dVar;
        if (this.f78635o) {
            this.f78607a.f130131b.f103320a.f128764c0 = null;
        }
        if (this.f78630l0) {
            if (this.f78626j0 && isBound() && (dVar = (i81.d) getViewIfBound()) != null) {
                l81.l lVar = (l81.l) dVar;
                q qVar = lVar.f82181r1;
                if (qVar == null) {
                    Intrinsics.r("flashlightPinalytics");
                    throw null;
                }
                qVar.l(lVar.getF117886f1());
            }
            this.f78630l0 = false;
        }
    }

    @Override // de1.g
    public final void g2(Object obj, ArrayList selectedProductFilters, int i13, de1.a filterAction) {
        Unit unit;
        da2.g gVar;
        HashMap paramMap = (HashMap) obj;
        Intrinsics.checkNotNullParameter(paramMap, "filterApiSpec");
        Intrinsics.checkNotNullParameter(selectedProductFilters, "selectedProductFilters");
        Intrinsics.checkNotNullParameter(filterAction, "filterAction");
        vb0.j.f125466a.R(Intrinsics.d(Looper.myLooper(), Looper.getMainLooper()), "onProductFiltersUpdated() should only be called from the main thread", tb0.p.FLASHLIGHT, new Object[0]);
        if (isBound()) {
            List keys = o.f141736j;
            j81.e eVar = this.f78658z0;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(paramMap, "paramMap");
            Intrinsics.checkNotNullParameter(keys, "keys");
            qz.f0 f0Var = eVar.f49121k;
            if (f0Var != null) {
                f0Var.g(keys, paramMap);
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eVar.q0(paramMap);
            }
            i81.d dVar = (i81.d) getViewIfBound();
            if (dVar != null && (gVar = ((l81.l) dVar).f82179q1) != null) {
                gVar.b(i13);
            }
            o oVar = this.f78633n;
            if (oVar != null) {
                oVar.f(selectedProductFilters);
            }
            w3();
        }
    }

    public final void g4() {
        if (this.f78630l0 && this.f78635o) {
            j81.e eVar = this.f78658z0;
            eVar.M = false;
            eVar.q0(new HashMap());
        }
    }

    public final void h4() {
        if (this.f78617f != i81.e.FLASHLIGHT) {
            v3();
            return;
        }
        this.C = 0.1f;
        this.D = 0.1f;
        this.E = 0.9f;
        this.F = 0.9f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r3 >= 0.1f) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i4() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k81.l.i4():boolean");
    }

    public final void j4() {
        this.G = Float.valueOf(this.C);
        this.I = Float.valueOf(this.E);
        this.H = Float.valueOf(this.D);
        this.f78606J = Float.valueOf(this.F);
    }

    public final void k4() {
        o80.j A;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar != null) {
            l81.l lVar = (l81.l) dVar;
            da2.g gVar = lVar.S1;
            if (gVar != null) {
                gVar.k(bs1.c.C(lVar, eo1.b.color_white_mochimalist_0_opacity_90));
            }
            GestaltText gestaltText = lVar.T1;
            if (gestaltText != null && (animate = gestaltText.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(500L)) != null) {
                duration.start();
            }
            TopBottomGradientView topBottomGradientView = lVar.J1;
            if (topBottomGradientView != null) {
                topBottomGradientView.a();
            }
            lVar.o9();
            PinterestLoadingLayout pinterestLoadingLayout = lVar.f139735i0;
            if (pinterestLoadingLayout != null) {
                pinterestLoadingLayout.setAlpha(0.0f);
            }
            if (this.f78621h) {
                MaskedWebImageView t93 = lVar.t9();
                if (t93 != null) {
                    t93.b3(false);
                }
                f91.b bVar = lVar.E1;
                if (bVar != null && (A = bVar.A()) != null) {
                    A.n(false);
                }
                lVar.F9();
                st1.b bVar2 = this.M;
                if (bVar2 != null) {
                    lVar.G9(bVar2);
                }
            }
        }
    }

    public final void l4() {
        o80.j A;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar != null) {
            l81.l lVar = (l81.l) dVar;
            da2.g gVar = lVar.S1;
            if (gVar != null) {
                Integer num = lVar.f82194x2;
                gVar.k(num != null ? num.intValue() : bs1.c.C(lVar, eo1.b.color_themed_icon_subtle));
            }
            lVar.p9();
            View view = lVar.X1;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            PinterestLoadingLayout pinterestLoadingLayout = lVar.f139735i0;
            if (pinterestLoadingLayout != null && (animate = pinterestLoadingLayout.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(100L)) != null) {
                duration.start();
            }
            if (this.f78621h) {
                MaskedWebImageView t93 = lVar.t9();
                if (t93 != null) {
                    t93.b3(true);
                }
                f91.b bVar = lVar.E1;
                if (bVar != null && (A = bVar.A()) != null) {
                    A.n(true);
                }
                if (this.f78610b0 == 1.0f && this.f78649v == null && this.f78650v0) {
                    lVar.N9(false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x045f  */
    @Override // ca2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o2(int r17) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k81.l.o2(int):void");
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        l81.l lVar;
        ca2.e eVar;
        BottomSheetBehavior bottomSheetBehavior;
        p3();
        i81.d dVar = (i81.d) getViewIfBound();
        if (dVar == null || (eVar = (lVar = (l81.l) dVar).f82176o2) == null || (bottomSheetBehavior = eVar.f27255n) == null || bottomSheetBehavior.f32301f || bottomSheetBehavior.f32299e != 0) {
            return;
        }
        ca2.e.w(eVar, 0, new np.f(lVar, 3), null, null, 13);
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        this.T.removeCallbacksAndMessages(null);
        w81.d dVar = this.f78629l;
        if (dVar != null) {
            dVar.p();
        }
        super.onDeactivate();
    }

    @Override // wk1.q, yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.f78613d = Float.valueOf(bundle.getFloat("initial_scale"));
            String string = bundle.getString("pin_uid");
            if (string != null) {
                this.f78611c = string;
            }
            this.f78615e = bundle.getFloat("viewport_height");
            this.Z = bundle.getBoolean("use_cropper");
            el2.b bVar = c.f78593a;
            i81.e[] array = new i81.e[0];
            bVar.getClass();
            Intrinsics.checkNotNullParameter(array, "array");
            this.f78617f = ((i81.e[]) kotlin.jvm.internal.j.K(bVar, array))[bundle.getInt("image_search_entry")];
        }
    }

    @Override // wk1.q, yk1.b
    public final void onSaveInstance(Bundle bundle) {
        if (bundle != null) {
            Float f13 = this.f78613d;
            if (f13 != null) {
                bundle.putFloat("initial_scale", f13.floatValue());
            }
            bundle.putString("pin_uid", this.f78611c);
            bundle.putFloat("viewport_height", this.f78615e);
            bundle.putBoolean("use_cropper", this.Z);
            bundle.putInt("image_search_entry", this.f78617f.ordinal());
        }
        super.onSaveInstance(bundle);
    }

    @Override // wk1.q
    public final void onStateUpdated(c0 state, wt1.d0 remoteList) {
        ov1.k kVar;
        i81.d dVar;
        ov1.k kVar2;
        ov1.k kVar3;
        RectF rectF;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        j81.e eVar = this.f78658z0;
        if (Intrinsics.d(remoteList, eVar) && (state instanceof wt1.p) && eVar.f49127q.size() == 0 && isBound()) {
            if (this.f78623i) {
                List list = this.f78634n0;
                if (list == null || list.isEmpty() || !((rectF = this.f78649v) == null || rectF.isEmpty())) {
                    i81.d dVar2 = (i81.d) getViewIfBound();
                    if (dVar2 != null && (kVar3 = ((l81.l) dVar2).P2) != null) {
                        kVar3.d();
                    }
                } else if (this.f78638p0) {
                    List items = this.f78634n0;
                    if (items != null) {
                        i81.d dVar3 = (i81.d) getViewIfBound();
                        if (dVar3 != null) {
                            l81.l lVar = (l81.l) dVar3;
                            FrameLayout frameLayout = lVar.W1;
                            if (frameLayout != null) {
                                frameLayout.setAlpha(1.0f);
                            }
                            ov1.k kVar4 = lVar.P2;
                            if (kVar4 != null) {
                                kVar4.m();
                            }
                        }
                        i81.d dVar4 = (i81.d) getViewIfBound();
                        if (dVar4 != null) {
                            Intrinsics.checkNotNullParameter(items, "items");
                            ov1.k kVar5 = ((l81.l) dVar4).P2;
                            if (kVar5 != null) {
                                kVar5.g(items);
                            }
                        }
                    }
                    this.f78638p0 = false;
                }
            }
            List list2 = this.f78632m0;
            if (list2 == null || list2.isEmpty()) {
                i81.d dVar5 = (i81.d) getViewIfBound();
                if (dVar5 == null || (kVar = ((l81.l) dVar5).O2) == null) {
                    return;
                }
                kVar.d();
                return;
            }
            List items2 = this.f78632m0;
            if (items2 == null || !this.f78636o0) {
                return;
            }
            if ((!this.f78619g || this.f78642r0) && (dVar = (i81.d) getViewIfBound()) != null && (kVar2 = ((l81.l) dVar).O2) != null) {
                kVar2.m();
            }
            i81.d dVar6 = (i81.d) getViewIfBound();
            if (dVar6 != null) {
                Intrinsics.checkNotNullParameter(items2, "items");
                ov1.k kVar6 = ((l81.l) dVar6).O2;
                if (kVar6 != null) {
                    kVar6.g(items2);
                }
            }
            this.f78636o0 = false;
        }
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ek2.j jVar = this.f78618f0;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f78618f0 = null;
        ek2.j jVar2 = this.f78620g0;
        if (jVar2 != null) {
            bk2.c.dispose(jVar2);
        }
        this.f78620g0 = null;
        ((l81.l) ((i81.d) getView())).f82177p1 = null;
        ca2.e eVar = ((l81.l) ((i81.d) getView())).f82176o2;
        if (eVar != null) {
            eVar.q(null);
        }
        super.onUnbind();
    }

    @Override // zd1.m
    public final void r1(boolean z13) {
        this.f78622h0 = z13;
        this.T.post(new a(this, 1));
    }

    public final void r2(RectF cropBounds) {
        i81.d dVar;
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
        this.f78616e0 = g42.c.CUSTOM_CROP;
        if (this.Y) {
            this.Y = false;
        }
        st1.b bVar = this.M;
        if (bVar != null && (dVar = (i81.d) getViewIfBound()) != null) {
            ((l81.l) dVar).G9(bVar);
        }
        this.f78614d0 = true;
        this.f78649v = cropBounds;
        this.f78630l0 = false;
        if (!this.f78621h) {
            if (i4()) {
                g4();
                I3();
                H3();
                f4();
                return;
            }
            return;
        }
        if (!this.Q) {
            i81.d dVar2 = (i81.d) getViewIfBound();
            if (dVar2 != null) {
                i81.d.y4(dVar2, this.f78644s0);
                return;
            }
            return;
        }
        if (i4()) {
            g4();
            H3();
            f4();
        }
    }

    @Override // ca2.b
    public final void s1(float f13, boolean z13) {
        com.pinterest.feature.search.visual.cropper.m mVar;
        FlashlightCropperView flashlightCropperView;
        l81.l lVar;
        FrameLayout frameLayout;
        i81.d dVar;
        ov1.k kVar;
        i81.d dVar2;
        FrameLayout frameLayout2;
        l81.l lVar2;
        f91.b bVar;
        View view;
        o80.j jVar;
        o80.j jVar2;
        FrameLayout frameLayout3;
        if (isBound()) {
            if (this.f78619g) {
                if (f13 == 1.0f) {
                    if (this.R) {
                        i81.d dVar3 = (i81.d) getViewIfBound();
                        if (dVar3 != null && (frameLayout3 = ((l81.l) dVar3).F1) != null) {
                            frameLayout3.setBackgroundResource(s0.bottom_sheet_top_rect_fully_expanded);
                        }
                        this.R = false;
                    }
                } else if (!this.R) {
                    i81.d dVar4 = (i81.d) getViewIfBound();
                    if (dVar4 != null && (frameLayout = (lVar = (l81.l) dVar4).F1) != null) {
                        frameLayout.setBackgroundResource(lVar.f82188u2 ? uc2.c.sheet_rounded_rect_dark : uc2.c.sheet_rounded_rect_light);
                    }
                    this.R = true;
                }
                i81.d dVar5 = (i81.d) getViewIfBound();
                if (dVar5 != null && ((l81.l) dVar5).B9() && this.Q) {
                    k4();
                    this.Q = false;
                }
                i81.d dVar6 = (i81.d) getViewIfBound();
                if (dVar6 != null && ((l81.l) dVar6).C9() && !this.Q) {
                    l4();
                    this.Q = true;
                    if (i4()) {
                        H3();
                    }
                }
                if (this.f78621h) {
                    if (z13) {
                        i81.d dVar7 = (i81.d) getViewIfBound();
                        if (dVar7 != null) {
                            f91.b bVar2 = ((l81.l) dVar7).E1;
                            float f14 = ((0.1f * f13) + 1.0f) * (bVar2 != null ? bVar2.f61463n0 : 1.0f);
                            if (bVar2 != null && (jVar2 = bVar2.f61465p0) != null) {
                                jVar2.m(f14);
                            }
                        }
                    } else {
                        float f15 = this.N;
                        if (f13 < f15 || f15 < 0.0f) {
                            b bVar3 = this.S;
                            b bVar4 = b.DOWN;
                            if (bVar3 != bVar4) {
                                i81.d dVar8 = (i81.d) getViewIfBound();
                                if (dVar8 != null) {
                                    ((l81.l) dVar8).J9();
                                }
                                this.S = bVar4;
                            }
                            i81.d dVar9 = (i81.d) getViewIfBound();
                            if (dVar9 != null && (bVar = (lVar2 = (l81.l) dVar9).E1) != null) {
                                float y13 = bVar.y();
                                f91.b bVar5 = lVar2.E1;
                                if (bVar5 != null) {
                                    float z14 = bVar5.z();
                                    ca2.e eVar = lVar2.f82176o2;
                                    if (eVar != null && (view = eVar.f27254m) != null) {
                                        float y14 = view.getY();
                                        Float f16 = lVar2.A2;
                                        if (f16 != null) {
                                            float floatValue = f16.floatValue();
                                            Float f17 = lVar2.f82196y2;
                                            if (f17 != null) {
                                                float floatValue2 = f17.floatValue();
                                                float f18 = lVar2.f82153c2;
                                                float f19 = (f18 - lVar2.f82184s2) - floatValue;
                                                float f23 = f19 == 0.0f ? 0.0f : (y14 - floatValue) / f19;
                                                float f24 = ((((f18 - ((f18 - z14) / 2)) - floatValue2) * f23) + floatValue2) - y13;
                                                if (f23 <= 1.0f) {
                                                    f91.b bVar6 = lVar2.E1;
                                                    if (bVar6 != null && (jVar = bVar6.f61465p0) != null) {
                                                        jVar.d(f24);
                                                    }
                                                    i81.c cVar = lVar2.f82177p1;
                                                    if (cVar != null) {
                                                        ((l) cVar).W3(f24);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            b bVar7 = this.S;
                            b bVar8 = b.UP;
                            if (bVar7 != bVar8) {
                                i81.d dVar10 = (i81.d) getViewIfBound();
                                if (dVar10 != null) {
                                    ((l81.l) dVar10).K9();
                                }
                                this.S = bVar8;
                            }
                            i81.d dVar11 = (i81.d) getViewIfBound();
                            if (dVar11 != null) {
                                ((l81.l) dVar11).n9(true);
                            }
                        }
                    }
                }
                if (f13 > 0.0f && (dVar2 = (i81.d) getViewIfBound()) != null && (frameLayout2 = ((l81.l) dVar2).W1) != null) {
                    frameLayout2.setAlpha(s.f(3 * f13, 0.0f, 1.0f) * 1);
                }
                if (f13 == 0.0f && (dVar = (i81.d) getViewIfBound()) != null && (kVar = ((l81.l) dVar).P2) != null) {
                    kVar.d();
                }
            } else {
                i81.d dVar12 = (i81.d) getViewIfBound();
                if (dVar12 != null) {
                    float f25 = (1 - f13) + 0.5f;
                    FrameLayout frameLayout4 = ((l81.l) dVar12).D1;
                    if (frameLayout4 == null) {
                        Intrinsics.r("zoomableImageRootContainer");
                        throw null;
                    }
                    frameLayout4.setAlpha(f25);
                }
                i81.d dVar13 = (i81.d) getViewIfBound();
                if (dVar13 != null) {
                    l81.l lVar3 = (l81.l) dVar13;
                    if (lVar3.L1 == null) {
                        Float f26 = lVar3.N1;
                        if (f26 == null) {
                            GestaltIconButton gestaltIconButton = lVar3.M1;
                            lVar3.N1 = gestaltIconButton != null ? Float.valueOf(gestaltIconButton.getY()) : null;
                        } else {
                            GestaltIconButton button = lVar3.M1;
                            if (button != null) {
                                float floatValue3 = f26.floatValue();
                                button.setAlpha(1 - (2 * f13));
                                ca2.e eVar2 = lVar3.f82176o2;
                                float g13 = eVar2 != null ? eVar2.g() : 0;
                                if (g13 > floatValue3) {
                                    Resources resources = lVar3.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                    Intrinsics.checkNotNullParameter(button, "button");
                                    Intrinsics.checkNotNullParameter(resources, "resources");
                                    if (button.getVisibility() == 0) {
                                        button.post(new po.c(button, g13, resources));
                                    }
                                }
                            }
                        }
                    }
                }
                i81.d dVar14 = (i81.d) getViewIfBound();
                if (dVar14 != null) {
                    l81.l lVar4 = (l81.l) dVar14;
                    if (!lVar4.G2 && (mVar = lVar4.K1) != null && (flashlightCropperView = mVar.f47997h) != null) {
                        flashlightCropperView.f47971s = f13 >= 1.0f;
                    }
                }
            }
            this.N = f13;
        }
    }

    public final Pair u3(float f13, float f14, float f15, float f16, Rect rect, int i13, int i14) {
        float f17 = f15 + f13;
        float f18 = f16 + f14;
        float f19 = i14;
        return new Pair(new RectF(f13, f14, f17, f18), new RectF(Math.max((rect.width() * f13) + rect.left, f19), Math.max((rect.height() * f14) + rect.top, f19), Math.min((rect.width() * f17) + rect.left, i13 - f19), Math.min((rect.height() * f18) + rect.top, this.f78615e - f19)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v3() {
        /*
            r10 = this;
            float r0 = r10.f78615e
            android.graphics.RectF r1 = r10.f78649v
            boolean r2 = r10.Z
            r3 = 0
            float r4 = r10.f78625j
            if (r2 == 0) goto L26
            if (r1 == 0) goto L26
            float r0 = r1.left
            float r0 = java.lang.Math.max(r0, r3)
            float r2 = r1.top
            float r2 = java.lang.Math.max(r2, r3)
            float r5 = r1.right
            float r4 = java.lang.Math.min(r5, r4)
            float r1 = r1.bottom
            float r5 = r4 - r0
            float r6 = r1 - r2
            goto L2b
        L26:
            r1 = r0
            r6 = r1
            r0 = r3
            r2 = r0
            r5 = r4
        L2b:
            float r7 = r10.f78651w
            float r8 = r10.A
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 < 0) goto L35
        L33:
            r0 = r3
            goto L4b
        L35:
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L40
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 > 0) goto L40
            float r0 = r0 - r7
            float r0 = r0 / r8
            goto L4b
        L40:
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 >= 0) goto L33
            float r7 = java.lang.Math.abs(r7)
            float r7 = r7 + r0
            float r0 = r7 / r8
        L4b:
            r10.C = r0
            float r0 = r10.f78653x
            float r7 = r10.B
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto L56
            goto L6d
        L56:
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 > 0) goto L62
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 > 0) goto L62
            float r2 = r2 - r0
            float r3 = r2 / r7
            goto L6d
        L62:
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 >= 0) goto L6d
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 + r2
            float r3 = r0 / r7
        L6d:
            r10.D = r3
            float r0 = r10.f78655y
            float r2 = r10.A
            float r7 = r10.C
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L7d
            r5 = r4
            goto L7f
        L7d:
            float r5 = r5 / r2
            float r5 = r5 + r7
        L7f:
            r10.E = r5
            float r0 = r10.f78657z
            float r2 = r10.B
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L8a
            goto L8d
        L8a:
            float r6 = r6 / r2
            float r4 = r6 + r3
        L8d:
            r10.F = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k81.l.v3():void");
    }

    public final void w3() {
        if (isBound()) {
            ((yq0.t) ((i81.d) getView())).resetRecyclerScrollListener();
            j81.e eVar = this.f78658z0;
            eVar.Z();
            if (isBound()) {
                eVar.n();
            }
        }
    }

    public final e x3() {
        return this.f78654x0;
    }

    public final j z3() {
        return this.f78656y0;
    }
}
