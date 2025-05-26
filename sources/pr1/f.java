package pr1;

import com.pinterest.error.NetworkResponseError;
import java.util.HashMap;
import java.util.Map;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import nx.d0;
import qr1.m;
import t3.s1;
import uj2.b0;
import v.f1;

/* loaded from: classes2.dex */
public abstract class f extends mr1.d {

    /* renamed from: b, reason: collision with root package name */
    public final String f101188b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f101189c;

    /* renamed from: d, reason: collision with root package name */
    public cr1.b f101190d;

    /* renamed from: e, reason: collision with root package name */
    public ox.b f101191e;

    /* renamed from: f, reason: collision with root package name */
    public or1.i f101192f;

    /* renamed from: g, reason: collision with root package name */
    public final String f101193g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String path, boolean z13, m authority) {
        super(authority);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(authority, "authority");
        this.f101188b = path;
        this.f101189c = z13;
        this.f101193g = "login/".concat(path);
    }

    public Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("fields", n00.b.a(n00.c.USER_ME));
        boolean z13 = this.f101189c;
        if (z13) {
            hashMap.put("autologin", String.valueOf(z13));
        }
        return hashMap;
    }

    public Map d() {
        return null;
    }

    public b0 e() {
        kk2.b j13 = b0.j("recaptcha_not_needed");
        Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
        return j13;
    }

    public final void f(or1.e logEvent, Throwable th3) {
        f1 f1Var;
        qz.d M;
        Integer valueOf;
        Integer num;
        boolean z13;
        qz.d M2;
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        or1.i iVar = this.f101192f;
        if (iVar == null) {
            Intrinsics.r("authLoggingUtils");
            throw null;
        }
        String handler = a();
        Map d2 = d();
        if (th3 instanceof NetworkResponseError) {
            f1 f1Var2 = ((NetworkResponseError) th3).f45043a;
            if (f1Var2 != null && (M2 = k3.M(f1Var2)) != null) {
                valueOf = Integer.valueOf(M2.a());
                num = valueOf;
            }
            num = null;
        } else {
            Throwable cause = th3 != null ? th3.getCause() : null;
            NetworkResponseError networkResponseError = cause instanceof NetworkResponseError ? (NetworkResponseError) cause : null;
            if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null && (M = k3.M(f1Var)) != null) {
                valueOf = Integer.valueOf(M.a());
                num = valueOf;
            }
            num = null;
        }
        Intrinsics.checkNotNullParameter(handler, "handler");
        m authority = this.f88086a;
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        String requestPath = this.f101193g;
        Intrinsics.checkNotNullParameter(requestPath, "requestPath");
        int i13 = or1.h.f97254a[logEvent.ordinal()];
        d0 d0Var = iVar.f97258d;
        boolean z14 = this.f101189c;
        if (i13 == 1) {
            z13 = z14;
            d0Var.g(h32.f1.CLIENT_SIGN_IN_ATTEMPT, null, or1.i.d(handler, authority, z13, null, null, 24), false);
        } else if (i13 != 2) {
            if (i13 == 3) {
                d0Var.g(h32.f1.CLIENT_SIGN_IN_FAILED, null, or1.i.c(handler, authority, z14, th3, num), false);
            }
            z13 = z14;
        } else {
            z13 = z14;
            d0Var.g(h32.f1.CLIENT_SIGN_IN_SUCCESS, null, or1.i.d(handler, authority, z14, null, null, 24), false);
        }
        String c13 = s1.c("client.events.login.", z13 ? "auto" : "manual", ".", logEvent.getLogValue());
        u b13 = iVar.b(th3);
        b13.u("source", "v3/" + requestPath);
        if (num != null) {
            b13.s(Integer.valueOf(num.intValue()), "api_error_code");
        }
        if (d2 != null) {
            for (Map.Entry entry : d2.entrySet()) {
                b13.u((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Unit unit = Unit.f80348a;
        iVar.f(c13, b13, null);
    }

    @Override // mr1.f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final b0 b() {
        kk2.m mVar = new kk2.m(e(), new dl1.b0(25, new d(this, 4)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        kk2.g gVar = new kk2.g(new kk2.g(new kk2.g(new kk2.m(mVar, new dl1.b0(24, new d(this, 0)), 2).r(tk2.e.f118017c).l(wj2.c.a()), new or1.j(5, new d(this, 1)), 2), new or1.j(6, new d(this, 2)), 3), new or1.j(7, new d(this, 3)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }
}
