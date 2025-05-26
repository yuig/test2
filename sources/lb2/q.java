package lb2;

import a.cb;
import a.z0;
import android.content.Intent;
import br1.a0;
import com.pinterest.identity.core.error.UnauthException;
import h32.f1;
import jk2.a1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import qr1.y;
import so.ia;
import uj2.b0;
import zq1.c0;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final tb.l f82801a;

    /* renamed from: b, reason: collision with root package name */
    public final mr1.a f82802b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.x f82803c;

    /* renamed from: d, reason: collision with root package name */
    public final cr1.b f82804d;

    /* renamed from: e, reason: collision with root package name */
    public final or1.i f82805e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f82806f;

    /* renamed from: g, reason: collision with root package name */
    public final ia f82807g;

    /* renamed from: h, reason: collision with root package name */
    public final uk2.f f82808h;

    public q(tb.l keychain, mr1.a accountSwitcher, androidx.appcompat.widget.x deepLinkLogging, cr1.b authenticationService, or1.i authLoggingUtils, d0 pinalytics, ia authMethodFactory) {
        Intrinsics.checkNotNullParameter(keychain, "keychain");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(deepLinkLogging, "deepLinkLogging");
        Intrinsics.checkNotNullParameter(authenticationService, "authenticationService");
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(authMethodFactory, "authMethodFactory");
        this.f82801a = keychain;
        this.f82802b = accountSwitcher;
        this.f82803c = deepLinkLogging;
        this.f82804d = authenticationService;
        this.f82805e = authLoggingUtils;
        this.f82806f = pinalytics;
        this.f82807g = authMethodFactory;
        this.f82808h = cb.r("create(...)");
    }

    public static final kk2.g a(q qVar, qr1.t tVar, mr1.c cVar) {
        qVar.getClass();
        fk2.g gVar = new fk2.g(new qb1.a(12, qVar, tVar), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "fromAction(...)");
        int i13 = 14;
        kk2.m mVar = new kk2.m(cVar.I5(), new z0(new ha2.i(i13, tVar, qVar), 12), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        kk2.g gVar2 = new kk2.g(new kk2.m(gVar.c(mVar).k(new z0(new ha2.j(tVar, i13), 10)), new z0(new fn1.k(qVar, tVar, cVar, 19), 11), 0), new ua2.v(28, new o(qVar, cVar, 1)), 3);
        Intrinsics.checkNotNullExpressionValue(gVar2, "doOnSuccess(...)");
        return gVar2;
    }

    public final kk2.g b(lr1.h authMethodType, mr1.c activityProvider, y yVar) {
        Intrinsics.checkNotNullParameter(authMethodType, "authMethodType");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        lr1.g a13 = e(activityProvider).a(authMethodType, yVar);
        this.f82806f.g(f1.CLIENT_AUTH_INITIATED, null, bs1.c.o(new Pair("auth_handler", a13.a())), false);
        kk2.m mVar = new kk2.m(a13.b(), new r42.k(7, new a0(5, this, activityProvider)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return dl2.b.p(mVar, or1.d.CONTROLLER, a13, this.f82805e);
    }

    public final kk2.g c(mr1.d authenticationStrategy, mr1.c activityProvider) {
        Intrinsics.checkNotNullParameter(authenticationStrategy, "authenticationStrategy");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        this.f82806f.g(f1.CLIENT_AUTH_INITIATED, null, bs1.c.o(new Pair("method", authenticationStrategy.f88086a.f105013a), new Pair("auth_handler", authenticationStrategy.a())), false);
        kk2.m mVar = new kk2.m((b0) authenticationStrategy.b(), new z0(new o(this, activityProvider, 0), 7), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return dl2.b.p(mVar, or1.d.STRATEGY, authenticationStrategy, this.f82805e);
    }

    public final void d(int i13, int i14, Intent intent) {
        this.f82808h.c(new qr1.b(i13, i14, intent));
    }

    public final lr1.b e(mr1.c activityProvider) {
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        uk2.f fVar = this.f82808h;
        fVar.getClass();
        a1 a1Var = new a1(fVar);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        return this.f82807g.a(activityProvider, a1Var);
    }

    public final kk2.g f(lr1.h authMethodType, mr1.c activityProvider) {
        Intrinsics.checkNotNullParameter(authMethodType, "authMethodType");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        lr1.g a13 = e(activityProvider).a(authMethodType, null);
        b20.c cVar = a13.f84605e;
        if (cVar == null) {
            Intrinsics.r("unauthKillSwitch");
            throw null;
        }
        qr1.m mVar = a13.f84601a;
        kk2.t l13 = (cVar.o(mVar) ? a13.f().l(wj2.c.a()) : b0.g(new UnauthException.AuthServiceNotAvailableError(mVar))).l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        return dl2.b.q(l13, or1.d.CONTROLLER, a13, this.f82805e);
    }

    public final kk2.g g(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        kk2.m mVar = new kk2.m(this.f82804d.f(id3).r(tk2.e.f118017c).l(wj2.c.a()).k(new z0(i.f82773r, 8)), new z0(p.f82800i, 9), 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        or1.i authLoggingUtils = this.f82805e;
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        kk2.g gVar = new kk2.g(new kk2.g(new kk2.g(mVar, new c0(15, new or1.o(authLoggingUtils, 0)), 2), new c0(16, new or1.o(authLoggingUtils, 1)), 3), new c0(17, new or1.o(authLoggingUtils, 2)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }
}
