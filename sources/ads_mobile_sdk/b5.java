package ads_mobile_sdk;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b5 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final y4 f2742a;

    public b5(y4 adSpamClient) {
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        this.f2742a = adSpamClient;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AD_SPAM;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        String num;
        com.google.common.util.concurrent.c0 c0Var;
        y4 y4Var = this.f2742a;
        b4 b4Var = y4Var.f14022k;
        if (b4Var == null) {
            Intrinsics.r("adShieldClient");
            throw null;
        }
        Context c13 = y4Var.c();
        boolean z13 = b4Var.f2708i && System.currentTimeMillis() - b4Var.f2707h <= b4Var.f2709j;
        bt2 bt2Var = b4Var.f2703d;
        bs2 bs2Var = new bs2(xb0.EVENT_ID_SIGNAL_QUERY, bt2Var.f3596b, bt2Var.f3595a);
        try {
            try {
                try {
                    try {
                        try {
                            bs2Var.b();
                            as0 as0Var = b4Var.f2700a;
                            synchronized (as0Var) {
                                c0Var = as0Var.f2529d;
                                c0Var.getClass();
                            }
                            num = (String) com.google.common.util.concurrent.g.B(c0Var, new y3(b4Var, c13), com.google.common.util.concurrent.r.INSTANCE).get(z13 ? b4Var.f2706g : b4Var.f2704e, TimeUnit.MILLISECONDS);
                        } catch (Throwable th3) {
                            bs2Var.a(th3);
                            throw th3;
                        }
                    } catch (ExecutionException e13) {
                        e = e13;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        bs2Var.a(e);
                        num = Integer.toString(3);
                    }
                } catch (InterruptedException e14) {
                    Thread.currentThread().interrupt();
                    bs2Var.a(e14);
                    num = "";
                }
            } catch (TimeoutException e15) {
                bs2Var.a(e15);
                num = b4Var.a(z13);
            }
            bs2Var.a();
            Intrinsics.checkNotNullExpressionValue(num, "getQuerySignals(...)");
            return new pk0(new a5(num));
        } catch (Throwable th4) {
            bs2Var.a();
            throw th4;
        }
    }
}
