package hk1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.List;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import tk0.h0;
import zy.f0;
import zy.l0;

/* loaded from: classes2.dex */
public final class u extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final es.a f69372b;

    public u(es.a adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f69372b = adFormats;
    }

    public static void g(l82.e eVar, String str) {
        boolean z13 = !((v) eVar.f82219b).f69378f;
        i(eVar, z13);
        String uid = ((v) eVar.f82219b).f69373a.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        q cVar = z13 ? new c(uid) : new d(uid);
        u0 u0Var = z13 ? u0.PIN_FAVORITE_BUTTON : u0.PIN_UNFAVORITE_BUTTON;
        g0 g0Var = Intrinsics.d(str, "board") ? g0.BOARD_PINS_GRID : Intrinsics.d(str, "user") ? g0.PINS_TAB : g0.FLOWED_PIN;
        i0 source = ((v) eVar.f82219b).f69376d.f143086a;
        Intrinsics.checkNotNullParameter(source, "source");
        eVar.d(cVar, new p(new f0(new zy.a(new i0(source.f67081a, source.f67082b, source.f67083c, g0Var, source.f67085e, u0Var), f1.TAP, uid, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER))));
    }

    public static void h(l82.e eVar, n nVar) {
        v vVar = (v) eVar.f82219b;
        String str = vVar.f69376d.f143087b;
        f30 f30Var = vVar.f69373a;
        Integer valueOf = n60.o.y(f30Var, "getIsThirdPartyAd(...)") ? Integer.valueOf(wy1.f.third_party_overflow_title) : null;
        l0 l0Var = vVar.f69376d;
        i0 source = l0Var.f143086a;
        Intrinsics.checkNotNullParameter(source, "source");
        eVar.a(new p(new f0(new zy.a(new i0(source.f67081a, source.f67082b, source.f67083c, g0.FLOWED_PIN, source.f67085e, u0.OVERFLOW_BUTTON), f1.TAP, f30Var.getUid(), null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER))));
        eVar.d(new e(f30Var, nVar, str, vVar.f69380h, valueOf, l0Var.f143086a));
    }

    public static void i(l82.e eVar, boolean z13) {
        eVar.h(new fd1.h(z13, 27));
        eVar.f(new fd1.h(z13, 28));
    }

    @Override // l82.d
    public final c0 c(l82.i0 i0Var) {
        v vmState = (v) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return l82.d.d(new g(), vmState).e();
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        boolean z13;
        v7 D3;
        o event = (o) sVar;
        g priorDisplayState = (g) oVar;
        v priorVMState = (v) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z14 = true;
        if (event instanceof k) {
            resultBuilder.h(new t(event, 0));
            k kVar = (k) event;
            wa2.m mVar = kVar.f69355a;
            resultBuilder.f(r.f69364j);
            if (!((v) resultBuilder.f82219b).f69381i) {
                if (mVar.f128885s0) {
                    resultBuilder.f(r.f69365k);
                    if (kVar.f69356b && !((v) resultBuilder.f82219b).f()) {
                        resultBuilder.f(s.f69367j);
                    }
                }
                v vVar = (v) resultBuilder.f82219b;
                if (!vVar.f69381i) {
                    g0 g0Var = vVar.f69376d.f143086a.f67084d;
                    boolean z15 = mVar.C;
                    f30 f30Var = vVar.f69373a;
                    if (z15) {
                        z13 = false;
                    } else {
                        if (!mVar.E) {
                            ((es.c) this.f69372b).O(f30Var);
                        }
                        z13 = mVar.f128893x;
                    }
                    if (!mVar.f128894y && (!Intrinsics.d(mVar.f128875n0, "board") || g0Var != g0.FLOWED_PIN || (D3 = f30Var.D3()) == null || !w.i0(D3) || !vVar.f69377e)) {
                        z14 = false;
                    }
                    if (z13) {
                        resultBuilder.f(new u00.e(mVar.Z ? rm1.c.LIGHT : rm1.c.DEFAULT, 29));
                    } else if (z14) {
                        resultBuilder.h(new zp.u0(15, f30Var));
                        resultBuilder.f(new ed1.m(f30Var, this, mVar, 23));
                    }
                }
            }
        } else if (event instanceof i) {
            g(resultBuilder, ((i) event).j());
        } else if (event instanceof h) {
            i(resultBuilder, ((h) event).j());
        } else if (event instanceof l) {
            h(resultBuilder, ((l) event).j());
        } else if (event instanceof j) {
            resultBuilder.h(new h0(7, resultBuilder));
            resultBuilder.f(s.f69368k);
        } else if (event instanceof m) {
            List d2 = ((v) resultBuilder.f82219b).d();
            if (!d2.isEmpty()) {
                resultBuilder.f(new fk1.u(d2, 2));
            }
        }
        return resultBuilder.e();
    }
}
