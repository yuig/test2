package cb2;

import android.view.View;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.x0;
import h32.a4;
import h32.d4;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes4.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f27370b;

    public /* synthetic */ t(x xVar, int i13) {
        this.f27369a = i13;
        this.f27370b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f27369a;
        x this$0 = this.f27370b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d0 d0Var = this$0.f27377J;
                if (d0Var == null) {
                    Intrinsics.r("fragmentPinalytics");
                    throw null;
                }
                this$0.l(d0Var, u0.PIN_HIDE_BUTTON);
                f30 f30Var = this$0.I;
                if (f30Var == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                if (b40.x(f30Var) == d40.NOT_HIDDEN) {
                    d0 d0Var2 = this$0.f27377J;
                    if (d0Var2 == null) {
                        Intrinsics.r("fragmentPinalytics");
                        throw null;
                    }
                    uk1.d f13 = ((uk1.a) this$0.f27382e).f(d0Var2, "");
                    nl1.d a13 = this$0.a();
                    if (a13 != null) {
                        d4 q03 = a13.getQ0();
                        a4 s03 = a13.getS0();
                        String uniqueScreenKey = a13.getUniqueScreenKey();
                        if (uniqueScreenKey == null) {
                            d0 d0Var3 = this$0.f27377J;
                            if (d0Var3 == null) {
                                Intrinsics.r("fragmentPinalytics");
                                throw null;
                            }
                            uniqueScreenKey = d0Var3.getUniqueScreenKey();
                        }
                        f13.c(s03, q03, uniqueScreenKey);
                    }
                    bs0.c cVar = this$0.K;
                    if (cVar == null) {
                        Intrinsics.r("_hideInteractor");
                        throw null;
                    }
                    f30 f30Var2 = this$0.I;
                    if (f30Var2 == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    String F = kh2.d.F(f13);
                    f30 f30Var3 = this$0.I;
                    if (f30Var3 == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    fk2.l h10 = cVar.a(new bs0.a(f30Var2, F, this$0.f27383f.b(f30Var3), null)).l(tk2.e.f118017c).h(wj2.c.a());
                    go0.l lVar = new go0.l(3, this$0, f13);
                    h10.j(lVar);
                    this$0.D = lVar;
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f30 f30Var4 = this$0.I;
                if (f30Var4 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                String uid = f30Var4.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                if (uid.length() == 0) {
                    vb0.j.f125466a.F("Pin has empty uid", tb0.p.CONTEXT_MENU, new Object[0]);
                    return;
                }
                d0 d0Var4 = this$0.f27377J;
                if (d0Var4 == null) {
                    Intrinsics.r("fragmentPinalytics");
                    throw null;
                }
                this$0.l(d0Var4, u0.SEND_BUTTON);
                f30 f30Var5 = this$0.I;
                if (f30Var5 != null) {
                    this$0.f27402y.q(y32.f.PIN_LONGPRESS.value(), f30Var5);
                    return;
                } else {
                    Intrinsics.r("pin");
                    throw null;
                }
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P = !this$0.i();
                return;
            case 3:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d0 d0Var5 = this$0.f27377J;
                if (d0Var5 == null) {
                    Intrinsics.r("fragmentPinalytics");
                    throw null;
                }
                this$0.l(d0Var5, u0.PIN_COMMENT_BUTTON);
                ScreenLocation screenLocation = (ScreenLocation) x0.f51543e.getValue();
                f30 f30Var6 = this$0.I;
                if (f30Var6 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                NavigationImpl L = Navigation.L(screenLocation, b40.g(f30Var6), ml1.b.NO_TRANSITION.getValue());
                f30 f30Var7 = this$0.I;
                if (f30Var7 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                L.m0("com.pinterest.EXTRA_PIN_ID", f30Var7.getUid());
                f30 f30Var8 = this$0.I;
                if (f30Var8 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                wy0 n13 = b40.n(f30Var8);
                L.m0("com.pinterest.EXTRA_USER_ID", n13 != null ? n13.getUid() : null);
                f30 f30Var9 = this$0.I;
                if (f30Var9 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                wy0 n14 = b40.n(f30Var9);
                L.m0("com.pinterest.EXTRA_USERNAME", n14 != null ? n14.z4() : null);
                f30 f30Var10 = this$0.I;
                if (f30Var10 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                Boolean j43 = f30Var10.j4();
                Intrinsics.checkNotNullExpressionValue(j43, "getDoneByMe(...)");
                L.Y1("com.pinterest.EXTRA_PIN_DONE_BY_ME", j43.booleanValue());
                this$0.f27379b.d(L);
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d0 d0Var6 = this$0.f27377J;
                if (d0Var6 == null) {
                    Intrinsics.r("fragmentPinalytics");
                    throw null;
                }
                this$0.l(d0Var6, u0.FLASHLIGHT_SEARCH_ICON);
                if (this$0.k()) {
                    f30 f30Var11 = this$0.I;
                    if (f30Var11 != null) {
                        this$0.f27379b.d(new oq.c(f30Var11));
                        return;
                    } else {
                        Intrinsics.r("pin");
                        throw null;
                    }
                }
                f30 f30Var12 = this$0.I;
                if (f30Var12 != null) {
                    s71.o.h(f30Var12, bs1.c.x0(f30Var12), null, 0, (r14 & 16) != 0 ? false : false, "", (r14 & 64) != 0 ? false : false);
                    return;
                } else {
                    Intrinsics.r("pin");
                    throw null;
                }
        }
    }
}
