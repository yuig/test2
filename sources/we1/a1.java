package we1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c50.ma;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;
import so.y6;

/* loaded from: classes5.dex */
public final class a1 extends LinearLayout implements re1.a0, ky.h, eb2.l, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f129252a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f129253b;

    /* renamed from: c, reason: collision with root package name */
    public ku1.l f129254c;

    /* renamed from: d, reason: collision with root package name */
    public x02.i2 f129255d;

    /* renamed from: e, reason: collision with root package name */
    public m60.w f129256e;

    /* renamed from: f, reason: collision with root package name */
    public b60.b f129257f;

    /* renamed from: g, reason: collision with root package name */
    public gi2.b f129258g;

    /* renamed from: h, reason: collision with root package name */
    public pb0.d f129259h;

    /* renamed from: i, reason: collision with root package name */
    public nx.d1 f129260i;

    /* renamed from: j, reason: collision with root package name */
    public f4 f129261j;

    /* renamed from: k, reason: collision with root package name */
    public xu1.g f129262k;

    /* renamed from: l, reason: collision with root package name */
    public com.pinterest.feature.pin.j f129263l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.c2 f129264m;

    /* renamed from: n, reason: collision with root package name */
    public com.pinterest.feature.pin.r f129265n;

    /* renamed from: o, reason: collision with root package name */
    public is1.s f129266o;

    /* renamed from: p, reason: collision with root package name */
    public k11.c f129267p;

    /* renamed from: q, reason: collision with root package name */
    public nx.b0 f129268q;

    /* renamed from: r, reason: collision with root package name */
    public a82.b f129269r;

    /* renamed from: s, reason: collision with root package name */
    public g70.h f129270s;

    /* renamed from: t, reason: collision with root package name */
    public int f129271t;

    /* renamed from: u, reason: collision with root package name */
    public re1.z f129272u;

    /* renamed from: v, reason: collision with root package name */
    public q1 f129273v;

    /* renamed from: w, reason: collision with root package name */
    public d1 f129274w;

    /* renamed from: x, reason: collision with root package name */
    public n2 f129275x;

    /* renamed from: y, reason: collision with root package name */
    public CarouselIndexView f129276y;

    /* renamed from: z, reason: collision with root package name */
    public t2 f129277z;

    @Override // re1.a0
    public final void A1(String backgroundColor, re1.e eVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Context context = getContext();
        int i13 = r82.c.carousel_background_layer_list;
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i13);
        Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(r82.d.carousel_background_bottom_layer);
        int i14 = m60.o.f85933a;
        d7.b.A0(findDrawableByLayerId, ma.b(0, backgroundColor));
        layerDrawable.findDrawableByLayerId(r82.d.carousel_background_middle_layer).setAlpha(RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO);
        layerDrawable.findDrawableByLayerId(r82.d.carousel_background_top_layer).setAlpha(8);
        setBackground(layerDrawable);
        if (eVar != null) {
            setOnClickListener(new z0(eVar, 0));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.space_200);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(eo1.c.space_200);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(dimensionPixelOffset);
        marginLayoutParams.setMarginEnd(dimensionPixelOffset2);
    }

    @Override // re1.c
    public final List C() {
        n2 n2Var = this.f129275x;
        Intrinsics.g(n2Var, "null cannot be cast to non-null type android.view.View");
        return kotlin.collections.e0.b(n2Var);
    }

    @Override // re1.a0
    public final void L3() {
        bs1.c.X0(this.f129273v);
        bs1.c.X0(this.f129274w);
        bs1.c.X0(this.f129275x);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        setBackground(null);
        setOnClickListener(null);
    }

    @Override // gd1.d
    public final void O5(String actionDeeplink, HashMap navigationParams) {
        Intrinsics.checkNotNullParameter(actionDeeplink, "actionDeeplink");
        Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
        ku1.l lVar = this.f129254c;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.f(context);
        ku1.l.b(lVar, context, actionDeeplink, true, false, null, navigationParams, 64);
    }

    @Override // re1.a0
    public final void P5(re1.z listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f129272u = listener;
    }

    @Override // re1.h
    public final void a(re1.f carouselModel) {
        ue1.l lVar;
        n2 n2Var;
        Intrinsics.checkNotNullParameter(carouselModel, "carouselModel");
        yk1.j a13 = yk1.j.a();
        n2 n2Var2 = this.f129275x;
        a13.e(n2Var2);
        ue1.l lVar2 = carouselModel.f107581b;
        if (lVar2.f122030e) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            n2Var2.setLayoutParams(layoutParams);
        } else {
            n2Var2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        t2 t2Var = this.f129277z;
        if (t2Var == null) {
            xu1.g gVar = this.f129262k;
            if (gVar == null) {
                Intrinsics.r("networkStateMonitor");
                throw null;
            }
            uj2.q a14 = gVar.a();
            b60.b bVar = this.f129257f;
            if (bVar == null) {
                Intrinsics.r("activeUserManager");
                throw null;
            }
            m60.w wVar = this.f129256e;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            gi2.b bVar2 = this.f129258g;
            if (bVar2 == null) {
                Intrinsics.r("boardRepItemViewBinderProvider");
                throw null;
            }
            pb0.d dVar = this.f129259h;
            if (dVar == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            x02.i2 i2Var = this.f129255d;
            if (i2Var == null) {
                Intrinsics.r("pinRepository");
                throw null;
            }
            nx.d1 d1Var = this.f129260i;
            if (d1Var == null) {
                Intrinsics.r("trackingParamAttacher");
                throw null;
            }
            com.pinterest.feature.pin.r rVar = this.f129265n;
            if (rVar == null) {
                Intrinsics.r("repinAnimationUtil");
                throw null;
            }
            com.pinterest.feature.pin.j jVar = this.f129263l;
            if (jVar == null) {
                Intrinsics.r("pinAction");
                throw null;
            }
            k11.c cVar = this.f129267p;
            if (cVar == null) {
                Intrinsics.r("easyGiftGuideUpsellUtilFactory");
                throw null;
            }
            nx.d0 d0Var = lVar2.f122028c.f122379a;
            n2Var = n2Var2;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            k11.b a15 = ((y6) cVar).a(d0Var);
            androidx.appcompat.widget.c2 c2Var = this.f129264m;
            if (c2Var == null) {
                Intrinsics.r("repinToastHelper");
                throw null;
            }
            oj0.h hVar = new oj0.h(lVar2.f122028c, d1Var, rVar, jVar, a15, c2Var);
            is1.s sVar = this.f129266o;
            if (sVar == null) {
                Intrinsics.r("pinSwipePreferences");
                throw null;
            }
            nx.b0 b0Var = this.f129268q;
            if (b0Var == null) {
                Intrinsics.r("pinAuxHelper");
                throw null;
            }
            f4 f4Var = this.f129261j;
            if (f4Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            g70.h hVar2 = this.f129270s;
            if (hVar2 == null) {
                Intrinsics.r("boardNavigator");
                throw null;
            }
            lVar = lVar2;
            t2Var = new t2(lVar2.f122028c, a14, bVar, wVar, bVar2, dVar, i2Var, carouselModel.f107592m, hVar, sVar, carouselModel.f107598s, b0Var, f4Var, hVar2);
            this.f129277z = t2Var;
        } else {
            lVar = lVar2;
            n2Var = n2Var2;
        }
        re1.g gVar2 = carouselModel.f107585f;
        u50.n nVar = gVar2.f107599a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int intValue = nVar.a(context).intValue();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int intValue2 = gVar2.f107600b.a(context2).intValue();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int intValue3 = gVar2.f107601c.a(context3).intValue();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ue1.l lVar3 = lVar;
        t2 t2Var2 = t2Var;
        i2 i2Var2 = new i2(new j21.b(intValue, intValue2, intValue3, gVar2.f107602d.a(context4).intValue()), lVar3.f122030e, lVar3.f122027b, carouselModel.f107584e, carouselModel.f107587h, carouselModel.f107588i, carouselModel.f107589j, carouselModel.f107582c, carouselModel.f107583d, carouselModel.f107591l, carouselModel.f107593n, carouselModel.f107594o);
        m60.w wVar2 = this.f129256e;
        if (wVar2 == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        nx.d1 d1Var2 = this.f129260i;
        if (d1Var2 == null) {
            Intrinsics.r("trackingParamAttacher");
            throw null;
        }
        p2 p2Var = new p2(lVar3.f122028c, i2Var2, wVar2, d1Var2, lVar3.f122029d, carouselModel.f107598s);
        n2 n2Var3 = n2Var;
        n2Var3.e(p2Var);
        yk1.j.a().d(n2Var3, t2Var2);
        t2Var2.G3(lVar3.f122026a);
        n2Var3.setVisibility(0);
        setVisibility(0);
        int i13 = carouselModel.f107596q;
        boolean z13 = carouselModel.f107595p;
        boolean z14 = carouselModel.f107586g;
        n2Var3.b(i13, z13, z14);
        this.f129271t = i13;
        if (!z13 || z14) {
            CarouselIndexView carouselIndexView = this.f129276y;
            if (carouselIndexView != null) {
                carouselIndexView.setVisibility(8);
            }
            eb2.m mVar = n2Var3.f129507n;
            if (mVar != null) {
                mVar.f58273i = null;
                return;
            }
            return;
        }
        if (this.f129276y == null) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            CarouselIndexView carouselIndexView2 = new CarouselIndexView(6, context5, (AttributeSet) null);
            Context context6 = carouselIndexView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            int F0 = dl2.b.F0(context6, eo1.a.item_horizontal_spacing);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            com.bumptech.glide.c.a1(marginLayoutParams, F0, carouselIndexView2.getResources().getDimensionPixelSize(eo1.c.space_400), F0, 0);
            carouselIndexView2.setLayoutParams(marginLayoutParams);
            pk.a0.k1(carouselIndexView2, carouselIndexView2.getResources().getDimensionPixelSize(eo1.c.space_200));
            carouselIndexView2.c(eo1.b.color_themed_dark_gray, eo1.b.color_themed_background_secondary_strong);
            setGravity(17);
            carouselIndexView2.setVisibility(8);
            this.f129276y = carouselIndexView2;
        }
        CarouselIndexView carouselIndexView3 = this.f129276y;
        if (carouselIndexView3 != null) {
            carouselIndexView3.setVisibility(0);
            carouselIndexView3.d(carouselModel.f107597r);
            carouselIndexView3.e(0);
        }
        CarouselIndexView carouselIndexView4 = this.f129276y;
        if (carouselIndexView4 != null) {
            if (!Intrinsics.d(carouselIndexView4.getParent(), this)) {
                addView(carouselIndexView4, 2);
            }
            eb2.m mVar2 = n2Var3.f129507n;
            if (mVar2 != null) {
                mVar2.f58273i = this;
            }
            carouselIndexView4.requestLayout();
        }
    }

    @Override // re1.y
    public final void b(re1.x singleImageUpsellModel) {
        Intrinsics.checkNotNullParameter(singleImageUpsellModel, "singleImageUpsellModel");
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129252a == null) {
            this.f129252a = new ye2.o(this);
        }
        return this.f129252a;
    }

    @Override // re1.k
    public final void e(re1.j footerModel) {
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        d1 d1Var = this.f129274w;
        d1Var.e(footerModel);
        d1Var.setVisibility(0);
    }

    @Override // re1.w
    public final void g(re1.p headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        q1 q1Var = this.f129273v;
        q1Var.g(headerModel);
        q1Var.setVisibility(0);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129252a == null) {
            this.f129252a = new ye2.o(this);
        }
        return this.f129252a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return C();
    }

    @Override // eb2.l
    public final void i(int i13) {
        int t13 = ve.h.t(i13, this.f129271t);
        CarouselIndexView carouselIndexView = this.f129276y;
        if (carouselIndexView == null) {
            return;
        }
        carouselIndexView.e(t13);
    }

    @Override // eb2.l
    public final void j(int i13) {
        int t13 = ve.h.t(i13, this.f129271t);
        CarouselIndexView carouselIndexView = this.f129276y;
        if (carouselIndexView == null) {
            return;
        }
        carouselIndexView.e(t13);
    }

    @Override // re1.o
    public final void m(re1.n gridSectionModel) {
        Intrinsics.checkNotNullParameter(gridSectionModel, "gridSectionModel");
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        re1.z zVar = this.f129272u;
        if (zVar != null) {
            return zVar.I();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        re1.z zVar = this.f129272u;
        if (zVar != null) {
            return zVar.E1();
        }
        return null;
    }

    @Override // re1.w
    public final void n(re1.r headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        q1 q1Var = this.f129273v;
        q1Var.n(headerModel);
        q1Var.setVisibility(0);
    }

    @Override // re1.m
    public final void q(re1.l freeformModel) {
        Intrinsics.checkNotNullParameter(freeformModel, "freeformModel");
    }

    @Override // re1.a0
    public final void r4(boolean z13) {
    }

    @Override // re1.a0
    public final void setVisible(boolean z13) {
        bs1.c.R1(this, z13);
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
