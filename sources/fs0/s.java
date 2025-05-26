package fs0;

import com.pinterest.api.model.e70;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fu0;
import com.pinterest.api.model.oc0;
import com.pinterest.api.model.v7;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.d0;
import zp.e0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62893i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f62894j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(w wVar, int i13) {
        super(1);
        this.f62893i = i13;
        this.f62894j = wVar;
    }

    public final void b(f30 pin) {
        com.pinterest.api.model.g t33;
        fu0 o03;
        e70 f13;
        com.pinterest.api.model.g t34;
        fu0 o04;
        e70 f14;
        v7 g13;
        String str;
        d4 d4Var;
        a4 a4Var;
        String name;
        int i13 = this.f62893i;
        w wVar = this.f62894j;
        Unit unit = null;
        r4 = null;
        String str2 = null;
        Unit unit2 = null;
        Unit unit3 = null;
        Unit unit4 = null;
        switch (i13) {
            case 4:
                ((es.c) wVar.E).getClass();
                String b13 = (pin == null || (t33 = pin.t3()) == null || (o03 = t33.o0()) == null || (f13 = o03.f()) == null) ? null : f13.b();
                if (b13 != null) {
                    d0 pinalytics = wVar.getPinalytics();
                    u0 u0Var = u0.PIN_REPORT_BUTTON;
                    g0 g0Var = g0.OVERFLOW_MENU;
                    String str3 = wVar.K;
                    if (str3 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    pinalytics.b0(u0Var, g0Var, str3, false);
                    w.s3(wVar, b13);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    wVar.f62914m.h(x0.generic_error);
                    return;
                }
                return;
            case 6:
                ((es.c) wVar.E).getClass();
                String b14 = (pin == null || (t34 = pin.t3()) == null || (o04 = t34.o0()) == null || (f14 = o04.f()) == null) ? null : f14.b();
                if (b14 != null) {
                    d0 pinalytics2 = wVar.getPinalytics();
                    u0 u0Var2 = u0.AD_INFO_LINK;
                    g0 g0Var2 = g0.OVERFLOW_MENU;
                    String str4 = wVar.K;
                    if (str4 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    pinalytics2.b0(u0Var2, g0Var2, str4, false);
                    w.s3(wVar, b14);
                    unit4 = Unit.f80348a;
                }
                if (unit4 == null) {
                    wVar.f62914m.h(x0.generic_error);
                    return;
                }
                return;
            case 10:
                wVar.u3();
                wVar.f62906e.d(new jc0.v(new e0(pin), false, 0L, 30));
                return;
            case 12:
                wVar.u3();
                gb2.f fVar = gb2.f.f64747a;
                String str5 = wVar.K;
                if (str5 == null) {
                    Intrinsics.r("pinUid");
                    throw null;
                }
                gb2.f.c(new gb2.i(str5, wa2.p.STATE_FILTER_PIN, wa2.o.BOTH));
                String str6 = wVar.K;
                if (str6 != null) {
                    wVar.f62906e.d(new jc0.v(wVar.f62919r.a(str6, wVar.getPresenterPinalytics(), wVar.O, null, null), true, 0L, 28));
                    return;
                } else {
                    Intrinsics.r("pinUid");
                    throw null;
                }
            case 14:
                wVar.u3();
                oc0 d63 = pin.d6();
                if (d63 == null || (g13 = d63.g()) == null) {
                    return;
                }
                wVar.f62906e.d(new pg0.c(1, g13, pin.getUid()));
                return;
            case 17:
                String f15 = ((es.c) wVar.E).f(pin);
                if (f15 != null) {
                    d0 pinalytics3 = wVar.getPinalytics();
                    u0 u0Var3 = u0.PIN_REPORT_BUTTON;
                    g0 g0Var3 = g0.OVERFLOW_MENU;
                    String str7 = wVar.K;
                    if (str7 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    Intrinsics.f(pin);
                    pinalytics3.f0(u0Var3, g0Var3, str7, w.q3(wVar, pin), false);
                    w.s3(wVar, f15);
                    unit3 = Unit.f80348a;
                }
                if (unit3 == null) {
                    wVar.f62914m.h(x0.generic_error);
                    return;
                }
                return;
            case 19:
                String f16 = ((es.c) wVar.E).f(pin);
                if (f16 != null) {
                    d0 pinalytics4 = wVar.getPinalytics();
                    u0 u0Var4 = u0.AD_INFO_LINK;
                    g0 g0Var4 = g0.OVERFLOW_MENU;
                    String str8 = wVar.K;
                    if (str8 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    Intrinsics.f(pin);
                    pinalytics4.f0(u0Var4, g0Var4, str8, w.q3(wVar, pin), false);
                    w.s3(wVar, f16);
                    unit2 = Unit.f80348a;
                }
                if (unit2 == null) {
                    wVar.f62914m.h(x0.generic_error);
                    return;
                }
                return;
            case 23:
                wVar.u3();
                i0 p13 = wVar.getPinalytics().p();
                if (p13 == null || (a4Var = p13.f67082b) == null || (name = a4Var.name()) == null) {
                    if (p13 != null && (d4Var = p13.f67081a) != null) {
                        str2 = d4Var.name();
                    }
                    str = str2;
                } else {
                    str = name;
                }
                Intrinsics.f(pin);
                d4 j13 = wVar.getPresenterPinalytics().j();
                Intrinsics.checkNotNullExpressionValue(j13, "getViewTypeForLogging(...)");
                g02.a.c(wVar.f62906e, pin, str, j13, wVar.getPresenterPinalytics().i(), wVar.f62912k.b(pin), kh2.d.F(wVar.getPresenterPinalytics()));
                return;
            case 25:
                wVar.u3();
                int i14 = e0.t.f56747e;
                if (i14 == -1) {
                    i14 = y32.f.OVERFLOW.getValue();
                }
                Intrinsics.f(pin);
                wVar.f62927z.q(i14, pin);
                return;
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                v7 D3 = pin.D3();
                if (D3 != null) {
                    wVar.f62905d.m0(D3).i(new xo.c(wVar, D3, pin, 12), new q(13, new s(wVar, 27)));
                    return;
                }
                return;
        }
    }

    public final void e(Throwable th3) {
        int i13 = this.f62893i;
        w wVar = this.f62894j;
        switch (i13) {
            case 0:
                w.r3(wVar);
                return;
            case 1:
                w.r3(wVar);
                return;
            case 2:
                w.r3(wVar);
                return;
            case 3:
                w.r3(wVar);
                return;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 23:
            case 25:
            default:
                i92.a.a(wVar.f62914m, "Error: " + th3, false, 6);
                return;
            case 5:
                w.r3(wVar);
                return;
            case 7:
                w.r3(wVar);
                return;
            case 9:
                w.r3(wVar);
                return;
            case 11:
                w.r3(wVar);
                return;
            case 13:
                w.r3(wVar);
                return;
            case 15:
                w.r3(wVar);
                return;
            case 16:
                wVar.u3();
                gb2.f fVar = gb2.f.f64747a;
                String str = wVar.K;
                if (str != null) {
                    gb2.f.c(new gb2.i(str, wa2.p.STATE_GEN_AI_TOPIC_OPT_OUT, wa2.o.BOTH));
                    return;
                } else {
                    Intrinsics.r("pinUid");
                    throw null;
                }
            case 18:
                w.r3(wVar);
                return;
            case 20:
                w.r3(wVar);
                return;
            case 21:
                w.r3(wVar);
                return;
            case 22:
                w.r3(wVar);
                return;
            case 24:
                w.r3(wVar);
                return;
            case 26:
                i92.a.a(wVar.f62914m, "Error: " + th3, false, 6);
                return;
            case 27:
                i92.a.a(wVar.f62914m, "Error unfollowing board: " + th3, false, 6);
                wVar.u3();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62893i) {
            case 0:
                e((Throwable) obj);
                break;
            case 1:
                e((Throwable) obj);
                break;
            case 2:
                e((Throwable) obj);
                break;
            case 3:
                e((Throwable) obj);
                break;
            case 4:
                b((f30) obj);
                break;
            case 5:
                e((Throwable) obj);
                break;
            case 6:
                b((f30) obj);
                break;
            case 7:
                e((Throwable) obj);
                break;
            case 8:
                xj2.c disposable = (xj2.c) obj;
                Intrinsics.checkNotNullParameter(disposable, "disposable");
                w wVar = this.f62894j;
                if (wVar.isBound()) {
                    wVar.addDisposable(disposable);
                }
                break;
            case 9:
                e((Throwable) obj);
                break;
            case 10:
                b((f30) obj);
                break;
            case 11:
                e((Throwable) obj);
                break;
            case 12:
                b((f30) obj);
                break;
            case 13:
                e((Throwable) obj);
                break;
            case 14:
                b((f30) obj);
                break;
            case 15:
                e((Throwable) obj);
                break;
            case 16:
                e((Throwable) obj);
                break;
            case 17:
                b((f30) obj);
                break;
            case 18:
                e((Throwable) obj);
                break;
            case 19:
                b((f30) obj);
                break;
            case 20:
                e((Throwable) obj);
                break;
            case 21:
                e((Throwable) obj);
                break;
            case 22:
                e((Throwable) obj);
                break;
            case 23:
                b((f30) obj);
                break;
            case 24:
                e((Throwable) obj);
                break;
            case 25:
                b((f30) obj);
                break;
            case 26:
                e((Throwable) obj);
                break;
            case 27:
                e((Throwable) obj);
                break;
            case 28:
                b((f30) obj);
                break;
            default:
                e((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
