package sr1;

import android.content.Context;
import com.google.android.recaptcha.RecaptchaAction;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import java.util.HashMap;
import java.util.Map;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import nm.s;
import nm.u;
import nx.d0;
import qr1.m;
import uj2.b0;
import uj2.f0;
import v.f1;
import zq1.c0;

/* loaded from: classes4.dex */
public abstract class l extends mr1.d {

    /* renamed from: b, reason: collision with root package name */
    public final String f115117b;

    /* renamed from: c, reason: collision with root package name */
    public final String f115118c;

    /* renamed from: d, reason: collision with root package name */
    public final String f115119d;

    /* renamed from: e, reason: collision with root package name */
    public cr1.b f115120e;

    /* renamed from: f, reason: collision with root package name */
    public or1.i f115121f;

    /* renamed from: g, reason: collision with root package name */
    public b60.b f115122g;

    /* renamed from: h, reason: collision with root package name */
    public tr1.a f115123h;

    /* renamed from: i, reason: collision with root package name */
    public fr1.c f115124i;

    /* renamed from: j, reason: collision with root package name */
    public final String f115125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String path, String password, m authority, int i13) {
        super(authority);
        password = (i13 & 2) != 0 ? "" : password;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter("unspecified", "gender");
        Intrinsics.checkNotNullParameter(authority, "authority");
        this.f115117b = path;
        this.f115118c = password;
        this.f115119d = "unspecified";
        this.f115125j = a.a.j("register/", path);
    }

    public Map c() {
        String str;
        HashMap o13 = ep.b.o("username", "");
        o13.put("password", this.f115118c);
        o13.put("gender", this.f115119d);
        o13.put("locale", dl2.b.c1());
        tr1.a aVar = this.f115123h;
        if (aVar == null) {
            Intrinsics.r("inviteCodeHelper");
            throw null;
        }
        String[] strArr = {"invite_code", "board_invite_code"};
        u a13 = aVar.f119037a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstallMetaData(...)");
        if (a13.f91366a.f100619d > 0) {
            for (int i13 = 0; i13 < 2; i13++) {
                s v13 = a13.v(strArr[i13]);
                if (v13 != null) {
                    str = v13.p();
                    break;
                }
            }
        }
        str = null;
        if (str != null) {
            o13.put("invite_code", str);
        }
        fr1.c cVar = this.f115124i;
        if (cVar == null) {
            Intrinsics.r("complianceManager");
            throw null;
        }
        if (cVar.d(t92.c.US_FL_SIGNUP_CONSENT)) {
            o13.put("privacy_disclaimer_acknowledge", CollectionsKt.Z(e0.b("fdbr"), ",", null, null, 0, null, null, 62));
        }
        return o13;
    }

    public final g d() {
        return new g(this.f115117b, this.f88086a, new HashMap(c()));
    }

    public final void e(or1.e event, Throwable th3) {
        f1 f1Var;
        qz.d M;
        Integer valueOf;
        Integer num;
        qz.d M2;
        Intrinsics.checkNotNullParameter(event, "logEvent");
        or1.i iVar = this.f115121f;
        if (iVar == null) {
            Intrinsics.r("authLoggingUtils");
            throw null;
        }
        String handler = a();
        if (th3 instanceof NetworkResponseError) {
            f1 f1Var2 = ((NetworkResponseError) th3).f45043a;
            if (f1Var2 != null && (M2 = k3.M(f1Var2)) != null) {
                valueOf = Integer.valueOf(M2.f105387g);
                num = valueOf;
            }
            num = null;
        } else {
            Throwable cause = th3 != null ? th3.getCause() : null;
            NetworkResponseError networkResponseError = cause instanceof NetworkResponseError ? (NetworkResponseError) cause : null;
            if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null && (M = k3.M(f1Var)) != null) {
                valueOf = Integer.valueOf(M.f105387g);
                num = valueOf;
            }
            num = null;
        }
        Intrinsics.checkNotNullParameter(handler, "handler");
        m authority = this.f88086a;
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(event, "event");
        String requestPath = this.f115125j;
        Intrinsics.checkNotNullParameter(requestPath, "requestPath");
        int i13 = or1.h.f97254a[event.ordinal()];
        d0 d0Var = iVar.f97258d;
        if (i13 == 1) {
            d0Var.g(h32.f1.CLIENT_REGISTER_ATTEMPT, null, or1.i.d(handler, authority, false, null, null, 28), false);
        } else if (i13 == 2) {
            d0Var.g(h32.f1.CLIENT_REGISTER_SUCCESS, null, or1.i.d(handler, authority, false, null, null, 28), false);
        } else if (i13 == 3) {
            d0Var.g(h32.f1.CLIENT_REGISTER_FAILED, null, or1.i.d(handler, authority, false, th3, num, 4), false);
        }
        String j13 = a.a.j("client.events.signup.", event.getLogValue());
        u b13 = iVar.b(th3);
        b13.u("source", "v3/" + requestPath);
        if (num != null) {
            b13.s(Integer.valueOf(num.intValue()), "api_error_code");
        }
        Unit unit = Unit.f80348a;
        iVar.f(j13, b13, null);
    }

    @Override // mr1.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final b0 b() {
        f0 j13;
        int i13 = 4;
        if (Intrinsics.d(this.f88086a, qr1.j.f105010b)) {
            RecaptchaAction recaptchaAction = com.pinterest.security.h.f51752a;
            Context context = kb0.a.f79058b;
            Context X = m60.f0.X();
            RecaptchaAction recaptchaAction2 = com.pinterest.security.h.f51753b;
            b60.b bVar = this.f115122g;
            if (bVar == null) {
                Intrinsics.r("activeUserManager");
                throw null;
            }
            wy0 f13 = ((b60.d) bVar).f();
            String id3 = f13 != null ? f13.getId() : null;
            if (id3 == null) {
                id3 = "";
            }
            j13 = com.pinterest.security.h.c(X, recaptchaAction2, null, id3, new mm1.g(this, i13));
        } else {
            j13 = b0.j("NOT_NEEDED");
        }
        kk2.m mVar = new kk2.m(j13, new jr1.a(10, new j(this, i13)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        kk2.g gVar = new kk2.g(new kk2.g(new kk2.g(new kk2.m(mVar, new jr1.a(11, new j(this, 0)), 2).r(tk2.e.f118017c).l(wj2.c.a()), new c0(18, new j(this, 1)), 2), new c0(19, new j(this, 2)), 3), new c0(20, new j(this, 3)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }
}
