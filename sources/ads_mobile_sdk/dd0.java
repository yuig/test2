package ads_mobile_sdk;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class dd0 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd0 f4232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(fd0 fd0Var) {
        super(0);
        this.f4232a = fd0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        fd0 fd0Var = this.f4232a;
        sb2 sb2Var = fd0Var.f5107c;
        il0 il0Var = il0.CUI_NAME_INIT_FIREBASE_ANALYTICS;
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        ss2 ss2Var = new ss2(new o52(), new v01(), new k72(), new g5());
        if (qs2.b().f9801a == null) {
            p12 a13 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
            try {
                try {
                } catch (Exception e13) {
                    Intrinsics.checkNotNullParameter("Exception while getting Firebase Analytics SDK instance", "message");
                    cs2 a14 = qs2.a();
                    a14.f().f6994p.add("Exception while getting Firebase Analytics SDK instance");
                    a14.f().f6988j = false;
                    a14.a(e13);
                    ((ks2) fd0Var.f5106b).a("FirebaseAnalyticsAdapter.getFirebaseAnalyticsInstance", e13);
                    obj = null;
                }
                if (!((Boolean) fd0Var.f5108d.a("gads:firebase_analytics_integration:enabled", Boolean.TRUE, oh0.f9281e)).booleanValue()) {
                    dl2.b.J(a13, null);
                    return null;
                }
                obj = Class.forName(fd0Var.f5108d.F()).getMethod("getInstance", Context.class).invoke(null, fd0Var.f5105a);
                if (obj instanceof jk0) {
                    ft2.a((jk0) obj);
                }
                dl2.b.J(a13, null);
            } catch (Throwable th3) {
                try {
                    a13.b(th3);
                    if (th3 instanceof a.jf) {
                        throw th3;
                    }
                    a13.a(th3);
                    if (th3 instanceof TimeoutCancellationException) {
                        throw new xl0(th3);
                    }
                    if (th3 instanceof CancellationException) {
                        throw new yj0(th3);
                    }
                    if (th3 instanceof uk0) {
                        throw th3;
                    }
                    throw new dk0(th3);
                } finally {
                }
            }
        } else {
            cs2 a15 = qs2.a(il0Var, q0Var, true);
            try {
                try {
                } catch (Exception e14) {
                    Intrinsics.checkNotNullParameter("Exception while getting Firebase Analytics SDK instance", "message");
                    cs2 a16 = qs2.a();
                    a16.f().f6994p.add("Exception while getting Firebase Analytics SDK instance");
                    a16.f().f6988j = false;
                    a16.a(e14);
                    ((ks2) fd0Var.f5106b).a("FirebaseAnalyticsAdapter.getFirebaseAnalyticsInstance", e14);
                    obj = null;
                }
                if (!((Boolean) fd0Var.f5108d.a("gads:firebase_analytics_integration:enabled", Boolean.TRUE, oh0.f9281e)).booleanValue()) {
                    dl2.b.J(a15, null);
                    return null;
                }
                obj = Class.forName(fd0Var.f5108d.F()).getMethod("getInstance", Context.class).invoke(null, fd0Var.f5105a);
                if (obj instanceof jk0) {
                    ft2.a((jk0) obj);
                }
                dl2.b.J(a15, null);
            } catch (Throwable th4) {
                try {
                    a15.b(th4);
                    if (th4 instanceof a.jf) {
                        throw th4;
                    }
                    a15.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new xl0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new yj0(th4);
                    }
                    if (th4 instanceof uk0) {
                        throw th4;
                    }
                    throw new dk0(th4);
                } finally {
                }
            }
        }
        return obj;
    }
}
