package lb2;

import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.identity.core.error.AccountException;
import fk2.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.d0;
import uj2.b0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final cr1.a f82746a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f82747b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f82748c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f82749d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f82750e;

    /* renamed from: f, reason: collision with root package name */
    public final lu1.b f82751f;

    /* renamed from: g, reason: collision with root package name */
    public final yk1.v f82752g;

    /* renamed from: h, reason: collision with root package name */
    public final i92.k f82753h;

    public d(cr1.a accountService, cr1.a unauthenticatedAccountService, b60.b activeUserManager, d0 pinalytics, m60.w eventManager, lu1.b activityHelper, yk1.v viewResources, i92.k toastUtils) {
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(unauthenticatedAccountService, "unauthenticatedAccountService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(activityHelper, "activityHelper");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f82746a = accountService;
        this.f82747b = unauthenticatedAccountService;
        this.f82748c = activeUserManager;
        this.f82749d = pinalytics;
        this.f82750e = eventManager;
        this.f82751f = activityHelper;
        this.f82752g = viewResources;
        this.f82753h = toastUtils;
    }

    public static void b(d dVar, Context context, String str, boolean z13, int i13) {
        b0 a13;
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        if ((str == null || z.j(str)) && z13) {
            wy0 f13 = ((b60.d) dVar.f82748c).f();
            a13 = dVar.a(f13 != null ? f13.N2() : null);
        } else {
            a13 = dVar.a(str);
        }
        a13.o(new ua2.v(13, new a(dVar, 3)), new ua2.v(14, new ha2.i(10, dVar, context)));
    }

    public final b0 a(String str) {
        f0 f0Var = null;
        if (str != null) {
            if (!tr1.b.c(str)) {
                str = null;
            }
            if (str != null) {
                f0Var = new fk2.x(this.f82747b.j(str).l(tk2.e.f118017c).h(wj2.c.a()), new ua2.v(17, new a(this, 2)), ck2.i.f27924d, ck2.i.f27923c).q(str);
            }
        }
        if (f0Var != null) {
            return f0Var;
        }
        kk2.k g13 = b0.g(new AccountException.InvalidUserNameOrEmailException(0));
        Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
        return g13;
    }
}
