package gx;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import ao2.j0;
import bx0.q;
import bx0.y;
import bx0.z;
import com.pinterest.api.model.vh;
import com.pinterest.feature.modules.shopTheLookFocus.shopTheLookCarousel.ShopTheLookCarouselContainer;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import dx0.u;
import java.util.HashMap;
import java.util.List;
import kh2.g0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.b0;
import nx.d0;
import o82.b3;
import o82.i0;
import o82.i2;
import o82.u0;
import o82.y0;
import om0.m1;
import so.h6;
import u50.r;
import zy.l0;
import zy.q0;

/* loaded from: classes3.dex */
public final class n extends wt1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66272a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f66273b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f66274c;

    public n(d0 pinalytics, o adsStlShoppingModuleViewModelFactory) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(adsStlShoppingModuleViewModelFactory, "adsStlShoppingModuleViewModelFactory");
        this.f66273b = pinalytics;
        this.f66274c = adsStlShoppingModuleViewModelFactory;
    }

    @Override // wt1.f
    public final wt1.d b(j0 scope) {
        switch (this.f66272a) {
            case 0:
                Intrinsics.checkNotNullParameter(scope, "scope");
                return ((h6) ((o) this.f66274c)).a((d0) this.f66273b, scope);
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                return new bx0.j((ho2.c) scope, this);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f66272a) {
            case 0:
                k model = (k) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                y model2 = (y) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
        }
        return "";
    }

    @Override // wt1.f
    public final void h(u50.o oVar, yk1.n nVar, r eventIntake) {
        bx0.i iVar;
        RecyclerView recyclerView;
        z zVar;
        bx0.i iVar2;
        yw0.a aVar;
        switch (this.f66272a) {
            case 0:
                a displayState = (a) oVar;
                m view = (m) nVar;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view.a(displayState);
                return;
            default:
                bx0.l displayState2 = (bx0.l) oVar;
                bx0.i view2 = (bx0.i) nVar;
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                int i13 = 1;
                if (!displayState2.f24068d.isEmpty()) {
                    view2.getClass();
                    Intrinsics.checkNotNullParameter(displayState2, "displayState");
                    Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                    view2.f24056m = eventIntake;
                    view2.f24049f.i(new bx0.f(displayState2, view2, 0));
                    boolean z13 = displayState2.f24074j;
                    GestaltText gestaltText = view2.f24050g;
                    if (z13) {
                        gestaltText.i(new bx0.b(view2, 1));
                    } else {
                        gestaltText.i(new bx0.f(displayState2, view2, i13));
                    }
                    view2.f24051h.loadUrl(displayState2.f24067c);
                    List list = displayState2.f24068d;
                    w A = view2.f24058o.A(new y0(list, null, false, 6));
                    b3 b3Var = view2.f24059p;
                    A.b(b3Var);
                    boolean z14 = view2.f24060q;
                    RecyclerView recyclerView2 = view2.f24052i;
                    z zVar2 = displayState2.f24069e;
                    if (z14 && zVar2 == z.FOCUS && list.size() > 0) {
                        recyclerView2.d3(0);
                        view2.f24060q = false;
                    }
                    boolean z15 = displayState2.f24073i;
                    d0 pinalytics = view2.f24047d;
                    if (z15) {
                        cx0.f fVar = (cx0.f) ((u0) list.get(displayState2.f24071g)).f93721a;
                        vh story = fVar.f53349b;
                        if (story != null) {
                            m1 actionLoggingCallback = new m1(25, eventIntake, view2);
                            r rVar = view2.f24056m;
                            if (rVar != null) {
                                rVar.a(new q(g0.s(pinalytics)));
                            }
                            z moduleVariant = z.FOCUS;
                            ShopTheLookCarouselContainer shopTheLookCarouselContainer = view2.f24053j;
                            shopTheLookCarouselContainer.getClass();
                            Intrinsics.checkNotNullParameter(story, "story");
                            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                            j0 scope = view2.f24046c;
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
                            String clientTrackingParams = fVar.f53354g;
                            Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
                            mj0.g oneTapSaveListener = displayState2.f24077m;
                            Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
                            Intrinsics.checkNotNullParameter(actionLoggingCallback, "actionLoggingCallback");
                            dx0.y yVar = shopTheLookCarouselContainer.f46777e;
                            if (yVar == null || yVar.getParent() == null) {
                                if (shopTheLookCarouselContainer.f46775c == null) {
                                    Intrinsics.r("completeTheLookCarouselViewFactory");
                                    throw null;
                                }
                                Context context = shopTheLookCarouselContainer.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                dx0.y yVar2 = new dx0.y(context, pinalytics, scope);
                                shopTheLookCarouselContainer.f46777e = yVar2;
                                shopTheLookCarouselContainer.addView(yVar2);
                            }
                            a0 a0Var = new a0(scope);
                            mu.w stateTransformer = new mu.w((i0) shopTheLookCarouselContainer.f46778f.f63224a, actionLoggingCallback);
                            Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
                            a0Var.f82204b = stateTransformer;
                            o82.j0 j0Var = new o82.j0(e0.b(new i2((Object) null, 3)));
                            l0 l0Var = new l0((h32.i0) null, 3);
                            zVar = zVar2;
                            String uid = story.getUid();
                            recyclerView = recyclerView2;
                            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                            iVar = view2;
                            l82.y b13 = a0.b(a0Var, new u(story, false, j0Var, moduleVariant, l0Var, clientTrackingParams, new o82.j0(e0.b(new i2(new g22.a(uid), 2))), oneTapSaveListener), new dx0.d(shopTheLookCarouselContainer, 0), 2);
                            Intrinsics.checkNotNullParameter(b13, "<this>");
                            b0 b0Var = new b0(b13);
                            dx0.y yVar3 = shopTheLookCarouselContainer.f46777e;
                            if (yVar3 != null) {
                                yVar3.f56471c.G2(0);
                            }
                            kotlin.jvm.internal.j.z(scope, null, null, new dx0.c(shopTheLookCarouselContainer, b0Var, null), 3);
                        } else {
                            iVar = view2;
                            recyclerView = recyclerView2;
                            zVar = zVar2;
                        }
                        b3Var.h();
                    } else {
                        iVar = view2;
                        recyclerView = recyclerView2;
                        zVar = zVar2;
                    }
                    if (displayState2.f24072h) {
                        h32.g0 g0Var = h32.g0.SHOP_YOUR_SAVES_MODULE;
                        HashMap hashMap = new HashMap();
                        bs1.c.G1("story_type", displayState2.f24070f, hashMap);
                        yw0.a aVar2 = new yw0.a(pinalytics, g0Var, hashMap, 1);
                        iVar2 = iVar;
                        iVar2.f24062s = aVar2;
                        recyclerView.o(aVar2);
                        if (zVar == z.DROPDOWN && (aVar = iVar2.f24062s) != null) {
                            switch (aVar.f140265j) {
                                case 0:
                                    aVar.f140266k = true;
                                    break;
                                default:
                                    aVar.f140266k = true;
                                    break;
                            }
                        }
                    } else {
                        iVar2 = iVar;
                    }
                    GestaltButton gestaltButton = iVar2.f24055l;
                    if (gestaltButton != null) {
                        gestaltButton.d(new au0.f(displayState2, 29));
                    }
                    iVar2.f24056m = eventIntake;
                    return;
                }
                return;
        }
    }

    @Override // wt1.f
    public final void i(r eventIntake, yk1.n nVar) {
        switch (this.f66272a) {
            case 0:
                m view = (m) nVar;
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                Intrinsics.checkNotNullParameter(view, "view");
                view.f66267g = eventIntake;
                break;
            default:
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                Intrinsics.checkNotNullParameter((bx0.i) nVar, "view");
                break;
        }
    }

    public n(q0 unscopedPinalyticsSEPFactory, ku1.l uriNavigator) {
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        this.f66273b = unscopedPinalyticsSEPFactory;
        this.f66274c = uriNavigator;
    }
}
