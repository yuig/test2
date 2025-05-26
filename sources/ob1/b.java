package ob1;

import ab1.o;
import android.os.Bundle;
import com.pinterest.feature.settings.passcode.PasscodeLocation;
import com.pinterest.feature.settings.passcode.e;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import fk2.l;
import h32.f1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.d0;
import p91.k;
import tb1.g;
import tb1.h;
import uj2.q;
import uk1.d;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class b extends t {

    /* renamed from: a, reason: collision with root package name */
    public final x10.a f93980a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d presenterPinalytics, q networkStateStream, x10.a passcodeApiService) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(passcodeApiService, "passcodeApiService");
        this.f93980a = passcodeApiService;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        e view = (e) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "actionListener");
        ((h) view).f117155y0 = this;
    }

    public final void p3(com.pinterest.feature.settings.passcode.c cVar, boolean z13, String str) {
        int i13 = a.f93979a[cVar.ordinal()];
        Unit unit = null;
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            h hVar = (h) ((e) getView());
            if (!z13) {
                d0.B(hVar.s7(), f1.DISABLE_PASSCODE_FAILURE, null, null, null, 30);
                if (str != null) {
                    hVar.b8().m(str);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    hVar.b8().k(x0.generic_error);
                    return;
                }
                return;
            }
            d0.B(hVar.s7(), f1.DISABLE_PASSCODE_SUCCESS, null, null, null, 30);
            hVar.b8().k(c52.e.settings_account_management_parental_passcode_disabled);
            hVar.f7().d(new k(bd1.b.IS_PARENTAL_CONTROL_PASSCODE_ENABLED, "false"));
            hVar.z(g.f117135j);
            hVar.getActiveUserManager().a(g.f117136k);
            NavigationImpl w13 = Navigation.w1(PasscodeLocation.PASSCODE_SETTINGS);
            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
            hVar.M1(w13);
            return;
        }
        h hVar2 = (h) ((e) getView());
        if (!z13) {
            d0.B(hVar2.s7(), f1.SAVE_SETTING_WITH_PASSCODE_ERROR, null, null, null, 30);
            if (str != null) {
                hVar2.b8().m(str);
                unit = Unit.f80348a;
            }
            if (unit == null) {
                hVar2.b8().k(x0.generic_error);
                return;
            }
            return;
        }
        d0.B(hVar2.s7(), f1.SAVE_SETTING_WITH_PASSCODE_SUCCESS, null, null, null, 30);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_passcode_verified", true);
        dv0.q qVar = hVar2.f117142l0;
        if (qVar == null) {
            Intrinsics.r("passcodeDelegate");
            throw null;
        }
        bundle.putString("passcode_verified", (String) qVar.f56381b);
        Unit unit2 = Unit.f80348a;
        hVar2.P6("passcode_screen_code", bundle);
        hVar2.P7();
    }

    public final void q3(String passcode, com.pinterest.feature.settings.passcode.c mode) {
        uj2.b a13;
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i13 = a.f93979a[mode.ordinal()];
        x10.a aVar = this.f93980a;
        if (i13 == 1) {
            a13 = aVar.a(passcode);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a13 = aVar.c(passcode);
        }
        addDisposable(new l(a13.l(tk2.e.f118017c).h(wj2.c.a()), new g51.h(this, 9), 0).i(new fp.a(29, this, mode), new o(9, new y71.b(27, this, mode))));
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        e view = (e) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "actionListener");
        ((h) view).f117155y0 = this;
    }
}
