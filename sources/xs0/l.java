package xs0;

import ao2.j0;
import com.pinterest.feature.home.tuner.sba.SbaHfBoardToggleSettingCellView;
import com.pinterest.feature.home.tuner.sba.SbaHfTunerActivityPinCellView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.y3;
import nx.d1;
import o82.y0;
import so.da;
import so.oa;
import so.r8;
import so.s7;
import so.s8;
import so.t7;
import x02.i2;
import x02.x0;
import zy.q0;

/* loaded from: classes5.dex */
public final class l extends wt1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135829a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f135830b;

    public l(s7 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.f135830b = viewModelFactory;
    }

    @Override // wt1.f
    public final wt1.d b(j0 scope) {
        int i13 = this.f135829a;
        Object obj = this.f135830b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(scope, "scope");
                r8 r8Var = ((s7) obj).f114208a;
                return new m(scope, (q0) r8Var.f114090a.Nb.get(), new mb0.a((x0) r8Var.f114091b.f114255d.f113765k3.get()), com.pinterest.widget.configuration.k.h(r8Var.f114090a.f113603b));
            case 1:
                Intrinsics.checkNotNullParameter(scope, "scope");
                r8 r8Var2 = ((t7) obj).f114634a;
                q0 q0Var = (q0) r8Var2.f114090a.Nb.get();
                s8 s8Var = r8Var2.f114091b;
                oa oaVar = s8Var.f114255d;
                nu.b bVar = new nu.b((i2) oaVar.F3.get(), s8Var.I5(), (x10.b) oaVar.f113705gd.get(), (d1) oaVar.f113730i2.get());
                oa oaVar2 = r8Var2.f114090a;
                return new h0(scope, q0Var, bVar, (k92.j) oaVar2.f113774kc.get(), (ni1.d0) oaVar2.Gb.get(), (es.h) oaVar2.f113735i7.get(), (es.a) oaVar2.P6.get(), oa.h0(oaVar2), (jv.a) oaVar2.f113932tc.get(), (nx.b0) oaVar2.R8.get(), (ur.a) oaVar2.Kb.get(), (da) oaVar2.f113914sc.get());
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                l82.a0 a0Var = new l82.a0(scope);
                a0Var.f82204b = d7.g.n(12, "stateTransformer");
                l82.y b13 = l82.a0.b(a0Var, new yw0.m(null, null, null, null, false, false, 255), new au0.f(this, 27), 2);
                Intrinsics.checkNotNullParameter(b13, "<this>");
                return new bx0.j(b13);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f135829a) {
            case 0:
                h model = (h) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
            case 1:
                g0 model2 = (g0) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                return null;
            default:
                yw0.m model3 = (yw0.m) obj;
                Intrinsics.checkNotNullParameter(model3, "model");
                return "";
        }
    }

    @Override // wt1.f
    public final void h(u50.o oVar, yk1.n nVar, u50.r eventIntake) {
        switch (this.f135829a) {
            case 0:
                a displayState = (a) oVar;
                SbaHfBoardToggleSettingCellView view = (SbaHfBoardToggleSettingCellView) nVar;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view.a(displayState);
                return;
            case 1:
                q displayState2 = (q) oVar;
                SbaHfTunerActivityPinCellView view2 = (SbaHfTunerActivityPinCellView) nVar;
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view2.b(displayState2);
                return;
            default:
                yw0.g displayState3 = (yw0.g) oVar;
                yw0.e view3 = (yw0.e) nVar;
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                int i13 = 1;
                if (!displayState3.f140294d.isEmpty()) {
                    view3.getClass();
                    Intrinsics.checkNotNullParameter(displayState3, "displayState");
                    Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                    view3.f140286n = eventIntake;
                    view3.f140280h.i(new yw0.b(displayState3, view3, 0));
                    int i14 = f62.d.see_it_styled_search_carousel_layout;
                    int i15 = view3.f140277e;
                    if (i15 == i14) {
                        y3 y3Var = view3.f140279g;
                        if (y3Var == null) {
                            Intrinsics.r("experiment");
                            throw null;
                        }
                        ((g1) y3Var.f83516a).c("android_ways_to_style_ui_v2_search");
                    } else if (i15 == f62.d.see_it_styled_closeup_carousel_layout) {
                        y3 y3Var2 = view3.f140279g;
                        if (y3Var2 == null) {
                            Intrinsics.r("experiment");
                            throw null;
                        }
                        ((g1) y3Var2.f83516a).c("android_ways_to_style_ui_v2_closeup");
                    }
                    boolean z13 = displayState3.f140300j;
                    GestaltText gestaltText = view3.f140281i;
                    if (z13) {
                        gestaltText.i(new au0.f(view3, 26));
                    } else {
                        gestaltText.i(new yw0.b(displayState3, view3, i13));
                    }
                    view3.f140282j.loadUrl(displayState3.f140293c);
                    view3.f140288p.A(new y0(displayState3.f140294d, null, false, 6)).b(view3.f140289q);
                    if (displayState3.f140298h) {
                        h32.g0 g0Var = h32.g0.SEE_IT_STYLED;
                        HashMap hashMap = new HashMap();
                        bs1.c.G1("story_type", displayState3.f140296f, hashMap);
                        yw0.a aVar = new yw0.a(view3.f140276d, g0Var, hashMap, 0);
                        view3.f140290r = aVar;
                        view3.f140283k.o(aVar);
                        yw0.a aVar2 = view3.f140290r;
                        if (aVar2 != null) {
                            switch (aVar2.f140265j) {
                                case 0:
                                    aVar2.f140266k = true;
                                    break;
                                default:
                                    aVar2.f140266k = true;
                                    break;
                            }
                        }
                    }
                    view3.f140286n = eventIntake;
                    return;
                }
                return;
        }
    }

    @Override // wt1.f
    public final void i(u50.r eventIntake, yk1.n nVar) {
        switch (this.f135829a) {
            case 0:
                SbaHfBoardToggleSettingCellView view = (SbaHfBoardToggleSettingCellView) nVar;
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view.f45817d = eventIntake;
                break;
            case 1:
                SbaHfTunerActivityPinCellView view2 = (SbaHfTunerActivityPinCellView) nVar;
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                SbaPinRep sbaPinRep = view2.f45829f;
                Intrinsics.g(sbaPinRep, "null cannot be cast to non-null type com.pinterest.featurelibrary.pingridcell.sba.view.PinRep");
                sbaPinRep.setEventIntake(new ca0.y(eventIntake, 25));
                view2.f45830g = eventIntake;
                break;
            default:
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                Intrinsics.checkNotNullParameter((yw0.e) nVar, "view");
                break;
        }
    }

    public l(t7 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.f135830b = viewModelFactory;
    }

    public l(q0 unscopedPinalyticsSEPFactory) {
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        this.f135830b = unscopedPinalyticsSEPFactory;
    }
}
