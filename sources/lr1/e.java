package lr1;

import com.pinterest.identity.core.error.UnauthException;
import java.util.ArrayList;
import kk2.k;
import kk2.m;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.x1;
import lh0.z3;
import so.ia;
import uj2.b0;
import uj2.q;
import xk2.v;

/* loaded from: classes2.dex */
public final class e extends mr1.d {

    /* renamed from: b, reason: collision with root package name */
    public final ia f84593b;

    /* renamed from: c, reason: collision with root package name */
    public final mr1.c f84594c;

    /* renamed from: d, reason: collision with root package name */
    public final q f84595d;

    /* renamed from: e, reason: collision with root package name */
    public final x1 f84596e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f84597f;

    /* renamed from: g, reason: collision with root package name */
    public final v f84598g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(so.ia r3, mr1.c r4, uj2.q r5, lh0.x1 r6) {
        /*
            r2 = this;
            java.lang.String r0 = "authControllerFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "activityProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "resultsFeed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "experiments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            qr1.j r0 = qr1.j.f105010b
            java.lang.String r1 = "authority"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r2.<init>(r0)
            r2.f84593b = r3
            r2.f84594c = r4
            r2.f84595d = r5
            r2.f84596e = r6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f84597f = r3
            nx.r0 r3 = new nx.r0
            r4 = 26
            r3.<init>(r2, r4)
            xk2.v r3 = xk2.m.b(r3)
            r2.f84598g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.e.<init>(so.ia, mr1.c, uj2.q, lh0.x1):void");
    }

    public static final b0 c(e eVar, Throwable th3, b0 b0Var) {
        eVar.getClass();
        Throwable th4 = !(th3 instanceof UnauthException.AuthenticationError) ? th3 : null;
        if (th4 != null) {
            eVar.f84597f.add(th4);
            return b0Var;
        }
        k g13 = b0.g(th3);
        Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
        return g13;
    }

    @Override // or1.p
    public final String a() {
        return "GoogleFullAuthStrategy";
    }

    public final t d(h hVar) {
        return ((b) this.f84598g.getValue()).a(hVar, null).b();
    }

    @Override // mr1.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final b0 b() {
        x1 x1Var = this.f84596e;
        x1Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) x1Var.f83504a;
        int i13 = 21;
        if (g1Var.o("android_unauth_account_recovery_flow_phase3", "enabled", z3Var) || g1Var.l("android_unauth_account_recovery_flow_phase3")) {
            m mVar = new m(d(h.GoogleUnifiedAutologin), new dl1.b0(21, new c(this)), 2);
            Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
            return mVar;
        }
        m mVar2 = new m(new m(d(h.FacebookAutoLoginMethod), new dl1.b0(22, new hk1.t(this, i13)), 2), new dl1.b0(23, new d(this)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar2, "onErrorResumeNext(...)");
        return mVar2;
    }
}
