package b82;

import android.animation.AnimatorSet;
import android.graphics.Point;
import com.pinterest.analytics.CollageAdsLogger$CollageAdCollageCutoutClickedPayload;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.g;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.t0;
import es.v;
import h32.f1;
import java.util.List;
import kh2.b0;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;
import lh0.k0;
import lh0.z3;
import m60.w;
import nx.d0;
import r72.u1;
import r72.z1;
import rq.v0;
import zp.n0;

/* loaded from: classes4.dex */
public final class h implements a82.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f22190a;

    public h(k kVar) {
        this.f22190a = kVar;
    }

    @Override // a82.d
    public final void m(boolean z13) {
        k kVar = this.f22190a;
        if (z13) {
            AnimatorSet animatorSet = kVar.f22216x.f52153d;
            if (animatorSet != null) {
                animatorSet.pause();
                return;
            }
            return;
        }
        AnimatorSet animatorSet2 = kVar.f22216x.f52153d;
        if (animatorSet2 != null) {
            animatorSet2.resume();
        }
    }

    @Override // a82.d
    public final boolean p(ke2.d from) {
        Intrinsics.checkNotNullParameter(from, "item");
        k kVar = this.f22190a;
        kVar.f22215w.getClass();
        Intrinsics.checkNotNullParameter(from, "from");
        z1 r03 = b0.r0(from);
        if (r03 != null) {
            return k.g(kVar, r03);
        }
        return true;
    }

    @Override // a82.d
    public final void s(ke2.d from, a82.g handler, Point clickPosition) {
        es.e eVar;
        fi0 r63;
        com.pinterest.api.model.g t33;
        fi0 r64;
        com.pinterest.api.model.g t34;
        nx.i iVar;
        List M;
        Intrinsics.checkNotNullParameter(from, "item");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(clickPosition, "clickPosition");
        k kVar = this.f22190a;
        kVar.f22215w.getClass();
        Intrinsics.checkNotNullParameter(from, "from");
        z1 r03 = b0.r0(from);
        if (r03 != null && (r03 instanceof u1) && k.g(kVar, r03)) {
            String b13 = r03.b();
            u1 u1Var = (u1) r03;
            f30 pin = kVar.f22197e;
            if (pin != null) {
                es.a aVar = kVar.f22210r;
                if (aVar == null) {
                    Intrinsics.r("adFormats");
                    throw null;
                }
                boolean x13 = ((es.c) aVar).x(pin);
                String str = u1Var.f106682n;
                if (!x13) {
                    kVar.j(pin, b13, str, false);
                    return;
                }
                es.h hVar = kVar.f22211s;
                if (hVar == null) {
                    Intrinsics.r("adsCommonDisplay");
                    throw null;
                }
                k0 i13 = kVar.i();
                z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
                boolean a13 = i13.a("enabled_hero_product_view", z3Var);
                boolean a14 = kVar.i().a("enabled_animation", z3Var);
                boolean a15 = kVar.i().a("enabled_combined_hero_animation", z3Var);
                boolean z13 = kVar.B;
                i activateAdsBetaExperiment = new i(kVar, 0);
                Intrinsics.checkNotNullParameter(pin, "pin");
                Intrinsics.checkNotNullParameter(activateAdsBetaExperiment, "activateAdsBetaExperiment");
                es.c cVar = (es.c) ((v) hVar).f60009b;
                if (cVar.x(pin)) {
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    if (cVar.x(pin) && (r64 = pin.r6()) != null) {
                        Boolean J2 = r64.J();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.d(J2, bool) && (t34 = pin.t3()) != null && Intrinsics.d(t34.f0(), bool)) {
                            eVar = es.e.DirectToCollageSite;
                        }
                    }
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    if ((cVar.x(pin) && (r63 = pin.r6()) != null && Intrinsics.d(r63.J(), Boolean.TRUE) && (t33 = pin.t3()) != null && Intrinsics.d(t33.f0(), Boolean.FALSE)) || z13) {
                        eVar = es.e.DirectToSite;
                    } else {
                        com.pinterest.api.model.g t35 = pin.t3();
                        if ((t35 != null ? t35.P() : null) == g.a.AWARENESS) {
                            eVar = (a13 || a15) ? es.e.HeroView : a14 ? es.e.DrawerView : es.e.DrawerView;
                            activateAdsBetaExperiment.invoke();
                        } else {
                            eVar = es.e.DrawerView;
                        }
                    }
                } else {
                    eVar = es.e.DrawerView;
                }
                String str2 = u1Var.f106676h;
                String str3 = str2 == null ? null : str2;
                if (eVar.getOpenWebBrowser()) {
                    kVar.f22199g.o(f1.COLLAGE_CUTOUT_ITEM_CLICKTHROUGH, (r19 & 2) != 0 ? null : null, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : pin.getUid(), (r19 & 32) != 0 ? null : null, null, g3.B(pin.getUid(), pin.i6(), str3), null, false);
                } else {
                    d0.B(kVar.f22199g, f1.COLLAGE_CUTOUT_DRAWER_OPEN, null, pin.getUid(), null, 26);
                }
                kVar.f22199g.o(f1.COLLAGE_CUTOUT_ITEM_CLICK, (r19 & 2) != 0 ? null : null, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : pin.getUid(), (r19 & 32) != 0 ? null : null, null, g3.B(pin.getUid(), pin.i6(), str3), null, false);
                nx.k kVar2 = kVar.f22212t;
                if (kVar2 == null) {
                    Intrinsics.r("collageAdsLogger");
                    throw null;
                }
                String uid = pin.getUid();
                String str4 = uid == null ? "" : uid;
                fi0 r65 = pin.r6();
                Integer valueOf = (r65 == null || (M = r65.M()) == null) ? null : Integer.valueOf(M.size());
                String str5 = str3 == null ? "" : str3;
                int width = kVar.getWidth();
                int height = kVar.getHeight();
                nx.j screenSize = new nx.j(width, height);
                int i14 = clickPosition.x;
                int i15 = clickPosition.y;
                nx.g clickPosition2 = new nx.g(i14, i15);
                nx.f animationType = nx.f.DEFAULT;
                Intrinsics.checkNotNullParameter(screenSize, "screenSize");
                Intrinsics.checkNotNullParameter(clickPosition2, "clickPosition");
                Intrinsics.checkNotNullParameter(animationType, "animationType");
                if (kVar2.a()) {
                    int i16 = width / 3;
                    int i17 = height / 3;
                    if (i14 < i16 && i15 < i17) {
                        iVar = nx.i.TOP_LEFT;
                    } else if (i16 > i14 || i14 >= i16 * 2 || i15 >= i17) {
                        int i18 = i16 * 2;
                        iVar = (i14 < i18 || i15 >= i17) ? (i14 >= i16 || i17 > i15 || i15 >= i17 * 2) ? (i16 > i14 || i14 >= i18 || i17 > i15 || i15 >= i17 * 2) ? (i14 < i18 || i17 > i15 || i15 >= i17 * 2) ? (i14 >= i16 || i15 < i17 * 2) ? (i16 > i14 || i14 >= i18 || i15 < i17 * 2) ? (i14 < i18 || i15 < i17 * 2) ? null : nx.i.BOTTOM_RIGHT : nx.i.BOTTOM : nx.i.BOTTOM_LEFT : nx.i.CENTER_RIGHT : nx.i.CENTER : nx.i.CENTER_LEFT : nx.i.TOP_RIGHT;
                    } else {
                        iVar = nx.i.TOP;
                    }
                    if (iVar == null) {
                        iVar = nx.i.UNKNOWN;
                    }
                    wr.c.a(kVar2.f92417a, new CollageAdsLogger$CollageAdCollageCutoutClickedPayload(str4, valueOf, str5, iVar.name(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(width), Integer.valueOf(height), Boolean.FALSE, animationType.name()), null, null, 14);
                }
                int i19 = g.f22189a[eVar.ordinal()];
                if (i19 == 1) {
                    w wVar = kVar.f22204l;
                    if (wVar == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    NavigationImpl L = Navigation.L((ScreenLocation) t0.f51372c.getValue(), pin.getUid(), ml1.b.NO_TRANSITION.getValue());
                    L.m0("EXTRA_PIN_IMAGE_MEDIUM_URL", bs1.c.p0(pin));
                    L.m0("EXTRA_COLLAGES_ROOT_PIN_ID", pin.i6());
                    L.m0("EXTRA_COLLAGES_SHUFFLE_ITEM_ID", b13);
                    L.m0("EXTRA_COLLAGES_CUTOUT_UID", str2 == null ? null : str2);
                    wVar.d(L);
                    return;
                }
                l lVar = kVar.f22200h;
                if (i19 == 2) {
                    String str6 = str2 == null ? null : str2;
                    v0 v0Var = (v0) lVar;
                    v0Var.getClass();
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    if (str6 == null) {
                        return;
                    }
                    v0Var.f109587g.P(str6).F(new n0(28, new e.f(v0Var, str6, pin, 19)), new n0(29, rq.o.f109416w), ck2.i.f27923c, ck2.i.f27924d);
                    return;
                }
                if (i19 == 3) {
                    kVar.j(pin, b13, str, true);
                    return;
                }
                if (i19 != 4) {
                    return;
                }
                String str7 = str2 == null ? null : str2;
                v0 v0Var2 = (v0) lVar;
                v0Var2.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                String uid2 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                v0Var2.b(pin, str7, uid2, pin.i6());
            }
        }
    }
}
