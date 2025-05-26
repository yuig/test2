package fs0;

import android.content.Context;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import fd1.b1;
import fd1.f1;
import fd1.y0;
import fd1.z0;
import i91.a0;
import jk2.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.z3;
import m60.x0;
import nx.d0;
import so.h5;
import uj2.b0;
import uj2.f0;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62897i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f62898j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, int i13) {
        super(1);
        this.f62897i = i13;
        this.f62898j = wVar;
    }

    public final f0 b(f30 pin) {
        String C;
        int i13 = this.f62897i;
        int i14 = 0;
        w wVar = this.f62898j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pin, "pin");
                zs t63 = pin.t6();
                return t63 == null ? b0.g(new IllegalStateException("Pin has no interest")) : kg.t.a1(wVar.f62904c, t63, false).c(b0.j(pin));
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                wy0 L3 = pin.L3();
                if ((L3 == null || (C = L3.getUid()) == null) && (C = b40.C(pin)) == null) {
                    C = "";
                }
                return new i2(new i2(wVar.f62903b.P(C), new v(i14, pin), 0), new v(1, pin), 0).s();
        }
    }

    public final void e(f30 f30Var) {
        int i13 = this.f62897i;
        w wVar = this.f62898j;
        switch (i13) {
            case 1:
                wVar.u3();
                gb2.f fVar = gb2.f.f64747a;
                String uid = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                gb2.f.c(new gb2.i(uid, wa2.p.STATE_UNFOLLOWED_INTEREST, wa2.o.BOTH));
                if (f30Var.t6() != null) {
                    zs t63 = f30Var.t6();
                    Intrinsics.f(t63);
                    wVar.f62906e.d(new pg0.c(t63, f30Var.getUid(), 2));
                }
                String uid2 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                wVar.f62917p.j(uid2);
                return;
            default:
                int i14 = e0.t.f56747e;
                if (i14 == -1) {
                    i14 = y32.f.OVERFLOW.getValue();
                }
                SendableObject sendableObject = new SendableObject(f30Var);
                p32.c inviteCategory = p32.c.MESSAGE;
                if (wVar.isBound()) {
                    cs0.g gVar = (cs0.g) wVar.getView();
                    d0 pinalytics = wVar.getPinalytics();
                    gs0.o oVar = (gs0.o) gVar;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                    Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
                    Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
                    z0 z0Var = z0.APP_LIST_ONLY_FOR_CONTEXTUAL_MENU;
                    Context context = oVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    jc0.n nVar = new jc0.n(context);
                    Context context2 = oVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    b1 b1Var = b1.PIN_OVERFLOW_FEED_MODAL;
                    f1 f1Var = f1.NONE;
                    i91.b bVar = i91.b.f71797d;
                    y0 y0Var = new y0(context2, sendableObject, inviteCategory, i14, nVar, z0Var, b1Var, false, false, false, f1Var, bVar);
                    h5 h5Var = oVar.f66069q;
                    if (h5Var == null) {
                        Intrinsics.r("sharesheetModalPresenterFactory");
                        throw null;
                    }
                    Context context3 = oVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    ed1.f0 a13 = h5Var.a(context3, pinalytics, inviteCategory, sendableObject, b1Var, z0Var, false, false, i14, new a0(), bVar);
                    a13.bind(y0Var);
                    oVar.f66071s = a13;
                    z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
                    int i15 = 0;
                    if (oVar.L(z3Var) && oVar.f66074v == null) {
                        y0Var.getLayoutParams();
                        oVar.setPaddingRelative(0, bs1.c.W(oVar, eo1.c.space_200), 0, bs1.c.W(oVar, eo1.c.space_200));
                    }
                    if (oVar.L(z3Var) && oVar.f66074v != null) {
                        i15 = 1;
                    }
                    oVar.addView(y0Var, i15);
                    return;
                }
                return;
        }
    }

    public final void f(Throwable th3) {
        int i13 = this.f62897i;
        w wVar = this.f62898j;
        switch (i13) {
            case 2:
                w.r3(wVar);
                break;
            case 6:
                i92.a.a(wVar.f62914m, "Error unfollowing user: " + th3, false, 6);
                break;
            case 8:
                i92.a.a(wVar.f62914m, "Error hiding pin: " + th3, false, 6);
                break;
            case 10:
                i92.a.a(wVar.f62914m, "Error: " + th3, false, 6);
                break;
            case 11:
                wVar.f62914m.i(((yk1.a) wVar.f62908g).f139224a.getString(x0.generic_error));
                wVar.u3();
                break;
            default:
                w.r3(wVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62897i;
        w wVar = this.f62898j;
        switch (i13) {
            case 0:
                return b((f30) obj);
            case 1:
                e((f30) obj);
                return Unit.f80348a;
            case 2:
                f((Throwable) obj);
                return Unit.f80348a;
            case 3:
                return b((f30) obj);
            case 4:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                return wVar.f62903b.i0(user, null);
            case 5:
                wy0 wy0Var = (wy0) obj;
                wVar.u3();
                gb2.f fVar = gb2.f.f64747a;
                String str = wVar.K;
                if (str == null) {
                    Intrinsics.r("pinUid");
                    throw null;
                }
                gb2.f.c(new gb2.i(str, wa2.p.STATE_UNFOLLOWED_USER, wa2.o.BOTH));
                Intrinsics.f(wy0Var);
                String str2 = wVar.K;
                if (str2 == null) {
                    Intrinsics.r("pinUid");
                    throw null;
                }
                wVar.f62906e.d(new pg0.c(wy0Var, str2, 6));
                String str3 = wVar.K;
                if (str3 != null) {
                    wVar.f62917p.j(str3);
                    return Unit.f80348a;
                }
                Intrinsics.r("pinUid");
                throw null;
            case 6:
                f((Throwable) obj);
                return Unit.f80348a;
            case 7:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                bs0.c cVar = wVar.f62907f;
                String str4 = wVar.I;
                if (str4 == null) {
                    str4 = kh2.d.F(wVar.getPresenterPinalytics());
                }
                return cVar.a(new bs0.a(pin, str4, wVar.f62912k.b(pin), wVar.f62901J)).l(tk2.e.f118017c);
            case 8:
                f((Throwable) obj);
                return Unit.f80348a;
            case 9:
                e((f30) obj);
                return Unit.f80348a;
            case 10:
                f((Throwable) obj);
                return Unit.f80348a;
            case 11:
                f((Throwable) obj);
                return Unit.f80348a;
            case 12:
                wVar.f62906e.d(new jc0.t());
                wVar.u3();
                gb2.f fVar2 = gb2.f.f64747a;
                String str5 = wVar.K;
                if (str5 != null) {
                    gb2.f.c(new gb2.i(str5, wa2.p.STATE_HIDDEN, wa2.o.BOTH));
                    return Unit.f80348a;
                }
                Intrinsics.r("pinUid");
                throw null;
            default:
                f((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
