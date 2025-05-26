package pu;

import com.pinterest.api.model.f30;
import com.pinterest.feature.browser.view.InAppBrowserView;
import com.pinterest.navigation.Navigation;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f101347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f101348s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f101348s = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        g0 g0Var = new g0(this.f101348s, cVar);
        g0Var.f101347r = obj;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f101347r;
        tu.g gVar = aVar2.f101329b;
        int i13 = j0.f101356u0;
        j0 j0Var = this.f101348s;
        j0Var.a8().o0(gVar.f119287a);
        for (tu.f fVar : gVar.f119288b) {
            if (fVar instanceof tu.c) {
                tu.c cVar = (tu.c) fVar;
                f30 f30Var = cVar.f119268a;
                InAppBrowserView inAppBrowserView = j0Var.a8().f35366r;
                if (inAppBrowserView != null) {
                    inAppBrowserView.j(cVar.f119269b, f30Var, j0Var);
                }
            } else if (fVar instanceof tu.a) {
                j0Var.a8().g0(new e0(((tu.a) fVar).f119265a, j0Var), j0Var);
            } else if (fVar instanceof tu.e) {
                String str = ((tu.e) fVar).f119286a;
                if (!Intrinsics.d(str, j0Var.a8().f35367s)) {
                    j0Var.a8().r0(str);
                }
                j0Var.a8().D(3);
                j0Var.f8().a(g.f101346a);
            } else if (fVar instanceof tu.d) {
                tu.d dVar = (tu.d) fVar;
                String str2 = dVar.f119277a;
                Navigation navigation = j0Var.I;
                if (navigation != null) {
                    String v03 = navigation.v0("com.pinterest.EXTRA_REFERRER");
                    Object i03 = navigation.i0("com.pinterest.PIN_LOGGING_AUX_DATA");
                    to0.y yVar = i03 instanceof to0.y ? (to0.y) i03 : null;
                    HashMap hashMap = yVar != null ? yVar.f118702a : null;
                    String v04 = navigation.v0("com.pinterest.CLIENT_TRACKING_PARAMETER");
                    z70.m mVar = j0Var.f101357r0;
                    if (mVar == null) {
                        Intrinsics.r("chromeTabHelper");
                        throw null;
                    }
                    z70.m.f(mVar, str2, v03, dVar.f119278b, null, true, hashMap, v04, true, null, false, false, null, false, new f0(j0Var, 2), new zp.j0(16, j0Var, str2), 7944);
                } else {
                    continue;
                }
            } else if (fVar instanceof tu.b) {
                j0Var.a8().D(4);
            }
        }
        if (!r2.isEmpty()) {
            j0Var.f8().a(new q(tu.h.f119289a));
        }
        for (n0 n0Var : aVar2.f101330c) {
            if (n0Var instanceof l0) {
                j0Var.b8().H1(((l0) n0Var).f101362a);
            } else if (n0Var instanceof m0) {
                j0Var.b8().n1().setPinalytics(j0Var.s7());
            }
        }
        if (!r1.isEmpty()) {
            j0Var.f8().a(k.f101360a);
        }
        return Unit.f80348a;
    }
}
