package gr1;

import com.pinterest.error.NetworkResponseError;
import fk2.f0;
import java.util.Map;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import qr1.m;
import qr1.p;
import uj2.a0;
import uj2.b0;
import v.f1;
import zq1.c0;

/* loaded from: classes4.dex */
public abstract class d extends mr1.e {

    /* renamed from: b, reason: collision with root package name */
    public final String f65997b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65998c;

    /* renamed from: d, reason: collision with root package name */
    public cr1.a f65999d;

    /* renamed from: e, reason: collision with root package name */
    public or1.i f66000e;

    /* renamed from: f, reason: collision with root package name */
    public final String f66001f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m authority, String path, String str) {
        super(authority);
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(authority, "authority");
        this.f65997b = path;
        this.f65998c = str;
        this.f66001f = a.a.j("connect/", path);
    }

    public abstract Map c();

    public final void d(or1.e logEvent, Throwable th3) {
        f1 f1Var;
        qz.d M;
        Integer valueOf;
        qz.d M2;
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        or1.i iVar = this.f66000e;
        if (iVar == null) {
            Intrinsics.r("authLoggingUtils");
            throw null;
        }
        if (th3 instanceof NetworkResponseError) {
            f1 f1Var2 = ((NetworkResponseError) th3).f45043a;
            if (f1Var2 != null && (M2 = k3.M(f1Var2)) != null) {
                valueOf = Integer.valueOf(M2.f105387g);
            }
            valueOf = null;
        } else {
            Throwable cause = th3 != null ? th3.getCause() : null;
            NetworkResponseError networkResponseError = cause instanceof NetworkResponseError ? (NetworkResponseError) cause : null;
            if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null && (M = k3.M(f1Var)) != null) {
                valueOf = Integer.valueOf(M.f105387g);
            }
            valueOf = null;
        }
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        String requestPath = this.f66001f;
        Intrinsics.checkNotNullParameter(requestPath, "requestPath");
        String j13 = a.a.j("client.events.connect.", logEvent.getLogValue());
        u b13 = iVar.b(th3);
        b13.u("source", "v3/" + requestPath);
        if (valueOf != null) {
            b13.s(Integer.valueOf(valueOf.intValue()), "api_error_code");
        }
        Unit unit = Unit.f80348a;
        iVar.f(j13, b13, null);
    }

    public final b0 e() {
        cr1.a aVar = this.f65999d;
        if (aVar == null) {
            Intrinsics.r("accountService");
            throw null;
        }
        uj2.b x13 = aVar.x(this.f65997b, c());
        a0 a0Var = tk2.e.f118017c;
        f0 q13 = x13.l(a0Var).q(new p(this.f88086a, this.f65998c));
        Intrinsics.checkNotNullExpressionValue(q13, "toSingleDefault(...)");
        kk2.g gVar = new kk2.g(new kk2.g(new kk2.g(new kk2.m(q13, new oo1.d(10, new c(this, 0)), 2).r(a0Var).l(wj2.c.a()), new c0(4, new c(this, 1)), 2), new c0(5, new c(this, 2)), 3), new c0(6, new c(this, 3)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }
}
