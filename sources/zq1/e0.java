package zq1;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.identity.core.error.UnauthException;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.j2;
import h32.a4;
import h32.d4;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yq1.y1;

/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142664i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f142665j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i13) {
        super(1);
        this.f142664i = i13;
        this.f142665j = f0Var;
    }

    public final void b(Throwable th3) {
        int i13 = this.f142664i;
        f0 f0Var = this.f142665j;
        switch (i13) {
            case 2:
                Intrinsics.f(th3);
                f0Var.getClass();
                if (!(th3 instanceof UnauthException.AuthenticationError.AgeRequiredForCountryError)) {
                    if (!(th3 instanceof UnauthException.AuthenticationError.OverageSignupError)) {
                        f0Var.f142672e.a(false, th3);
                        break;
                    } else {
                        ((y1) ((a0) f0Var.getView())).f7().d(new ar1.c(vq1.d.error_invalid_age));
                        break;
                    }
                } else {
                    ((y1) ((a0) f0Var.getView())).f7().d(new ar1.c(vq1.d.add_your_age));
                    break;
                }
            default:
                Intrinsics.f(th3);
                f0Var.getClass();
                if (!(th3 instanceof UnauthException.UserLookUpError)) {
                    if (!(th3 instanceof UnauthException.UserLookUpRateLimitHit)) {
                        f0Var.f142672e.a(false, th3);
                        break;
                    } else {
                        ((y1) ((a0) f0Var.getView())).f7().d(new ar1.c(vq1.d.email_check_rate_limit_hit));
                        break;
                    }
                } else {
                    ((y1) ((a0) f0Var.getView())).f7().d(new ar1.c(vq1.d.email_check_failed_invalid));
                    break;
                }
        }
    }

    public final void e(xj2.c cVar) {
        int i13 = this.f142664i;
        f0 f0Var = this.f142665j;
        switch (i13) {
            case 0:
                f0Var.f142671d.d(new of0.a(new mf0.l()));
                break;
            default:
                f0Var.f142671d.d(new of0.a(new mf0.l()));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f142664i) {
            case 0:
                e((xj2.c) obj);
                break;
            case 1:
                qr1.c cVar = (qr1.c) obj;
                Intrinsics.f(cVar);
                f0 f0Var = this.f142665j;
                int i13 = d0.f142662a[f0Var.f142668a.ordinal()];
                if (i13 == 1) {
                    f0Var.f142673f.a("register_email");
                    nx.d0.v(f0Var.getPinalytics(), f1.USER_CREATE, null, false, 12);
                    dy.d dVar = f0Var.f142674g;
                    FirebaseAnalytics firebaseAnalytics = dVar.f56534g;
                    if (firebaseAnalytics != null) {
                        String d2 = ((m60.d) m60.d.a()).d();
                        wy0 f13 = ((b60.d) dVar.f56533f).f();
                        k1.q qVar = new k1.q(f13 != null ? f13.G2() : null, firebaseAnalytics, d2, 15);
                        kk2.t r13 = (dVar.f56530c.l() ? dVar.f56528a : dVar.f56529b).m().r(tk2.e.f118017c);
                        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
                        nl.b.t(r13, new m1.e0(6, qVar), null, 2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("com.pinterest.EXTRA_SIGNUP_STEP_NUMBER", 4);
                    Unit unit = Unit.f80348a;
                    f0Var.f142672e.b(cVar, bundle);
                } else if (i13 == 2) {
                    h32.i0 i0Var = new h32.i0(d4.SETTINGS, a4.ADD_BUSINESS_ACCOUNT, null, null, null, null);
                    nx.d0 pinalytics = f0Var.getPinalytics();
                    f1 f1Var = f1.BUSINESS_ACCOUNT_CREATE_COMPLETE;
                    pinalytics.K(f1Var, null, i0Var, null, false);
                    nx.d0.v(f0Var.getPinalytics(), f1Var, null, false, 12);
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) j2.f51008a.getValue());
                    w13.m0("com.pinterest.identity.EXTRA_BUSINESS_CREATE_ACCOUNT_TYPE", "CREATE");
                    m60.w wVar = f0Var.f142671d;
                    wVar.d(w13);
                    wVar.f(new r70.h(false, false));
                }
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                e((xj2.c) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
