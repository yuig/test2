package oq;

import com.pinterest.activity.pin.view.modules.PinCloseupVideoModule;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.md;
import com.pinterest.api.model.st;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.j1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import rq.h1;
import rq.r1;

/* loaded from: classes3.dex */
public final class t0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f97141a;

    public t0(x0 x0Var) {
        this.f97141a = x0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l01.a event) {
        md O3;
        List m13;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f81297a;
        x0 x0Var = this.f97141a;
        f30 f30Var = x0Var.F;
        if (Intrinsics.d(str, f30Var != null ? f30Var.getUid() : null) && x0Var.isShown()) {
            f30 f30Var2 = x0Var.F;
            if (f30Var2 != null && Intrinsics.d(f30Var2.c5(), Boolean.TRUE) && ((x0Var.t0() instanceof h1) || (x0Var.t0() instanceof PinCloseupVideoModule))) {
                lh0.a0 k03 = x0Var.k0();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) k03.f83294a;
                if (g1Var.o("android_standard_pin_merchant_removal", "enabled", z3Var) || g1Var.l("android_standard_pin_merchant_removal")) {
                    r1 t03 = x0Var.t0();
                    if (t03 != null) {
                        t03.showLoadingSpinner(true);
                    }
                    b60.b bVar = x0Var.f97185r;
                    if (bVar == null) {
                        Intrinsics.r("activeUserManager");
                        throw null;
                    }
                    wy0 f13 = ((b60.d) bVar).f();
                    String uid = f13 != null ? f13.getUid() : null;
                    if (uid == null) {
                        uid = "";
                    }
                    ArrayList arrayList = new ArrayList();
                    f30 f30Var3 = x0Var.F;
                    if (f30Var3 != null && (O3 = f30Var3.O3()) != null && (m13 = O3.m()) != null) {
                        Iterator it = m13.iterator();
                        while (it.hasNext()) {
                            String s13 = ((st) it.next()).s();
                            if (s13 != null) {
                                arrayList.add(x0Var.G0().P(s13));
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        x0Var.D0.a(uj2.q.g(arrayList, new ep.a(6, new j1(uid, 25))).s().r(tk2.e.f118017c).l(wj2.c.a()).o(new zp.n0(26, new s0(x0Var, 0)), new zp.n0(27, new s0(x0Var, 1))));
                        return;
                    }
                    r1 t04 = x0Var.t0();
                    if (t04 != null) {
                        t04.showLoadingSpinner(false);
                    }
                    r1 t05 = x0Var.t0();
                    if (t05 != null) {
                        t05.openPinOverflowMenuModal(false);
                        return;
                    }
                    return;
                }
            }
            r1 t06 = x0Var.t0();
            if (t06 != null) {
                t06.openPinOverflowMenuModal(false);
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        x0 x0Var = this.f97141a;
        b60.b bVar = x0Var.f97185r;
        if (bVar != null) {
            bVar.a(new z3.m(e13, 21));
            f30 f30Var = x0Var.F;
            if (f30Var != null) {
                e30 R6 = f30Var.R6();
                R6.z(Boolean.valueOf(!e13.f100059a));
                x0Var.p1(R6.a());
                return;
            }
            return;
        }
        Intrinsics.r("activeUserManager");
        throw null;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ss.a e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        String str = e13.f115127b;
        x0 x0Var = this.f97141a;
        f30 f30Var = x0Var.F;
        if (Intrinsics.d(str, f30Var != null ? f30Var.getUid() : null)) {
            x0Var.R1();
            String url = e13.f115128c;
            if (url != null) {
                rq.h hVar = x0Var.f97156c0;
                rq.q qVar = hVar instanceof rq.q ? (rq.q) hVar : null;
                if (qVar != null) {
                    Intrinsics.checkNotNullParameter(url, "url");
                    qVar.f109492l = url;
                }
                rq.d0 d0Var = x0Var.f97158d0;
                if (d0Var != null) {
                    Intrinsics.checkNotNullParameter(url, "url");
                    d0Var.f109134e = url;
                }
            }
        }
    }
}
