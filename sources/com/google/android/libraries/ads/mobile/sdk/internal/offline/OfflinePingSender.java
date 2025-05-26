package com.google.android.libraries.ads.mobile.sdk.internal.offline;

import a.c1;
import ads_mobile_sdk.bk0;
import ads_mobile_sdk.kp;
import ads_mobile_sdk.kp1;
import ads_mobile_sdk.lp1;
import ads_mobile_sdk.n20;
import ads_mobile_sdk.np1;
import ads_mobile_sdk.o50;
import ads_mobile_sdk.qp1;
import ads_mobile_sdk.vp1;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ao2.i1;
import dl2.b;
import ho2.c;
import kb.w;
import kb.y;
import kb.z;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;
import zn2.a;
import zn2.d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/offline/OfflinePingSender;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OfflinePingSender extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflinePingSender(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    @Override // androidx.work.Worker
    public final z i() {
        try {
            c1.f28a.getClass();
            np1 np1Var = (np1) ((n20) ((c1) bk0.f3513c.getValue())).f8548k1.get();
            np1Var.getClass();
            j.z(np1Var.f8912a, null, null, new kp1(np1Var, new lp1(np1Var, null), null), 3);
        } catch (Exception unused) {
            WorkerParameters workerParameters = this.f78963b;
            int d2 = workerParameters.f19998b.d("OFFLINE_DATABASE_VERSION", 1);
            long g13 = workerParameters.f19998b.g("HTTP_CLIENT_TIMEOUT", 20L);
            String h10 = workerParameters.f19998b.h("USER_AGENT");
            if (h10 == null) {
                w wVar = new w();
                Intrinsics.checkNotNullExpressionValue(wVar, "failure(...)");
                return wVar;
            }
            kp kpVar = new kp();
            c b13 = b.b(new i1(kpVar.f7427c));
            a aVar = zn2.b.f142311b;
            qp1 qp1Var = new qp1(b.Q2(g13, d.MILLISECONDS), h10, kpVar.f7427c);
            Context context = this.f78962a;
            Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
            context.getClass();
            Integer valueOf = Integer.valueOf(d2);
            vp1 vp1Var = new vp1(h10);
            Long valueOf2 = Long.valueOf(g13);
            a1.k(kp.class, null);
            np1 np1Var2 = (np1) new o50(context, valueOf, valueOf2, vp1Var, qp1Var, b13).f9142g.get();
            np1Var2.getClass();
            j.z(np1Var2.f8912a, null, null, new kp1(np1Var2, new lp1(np1Var2, null), null), 3);
        }
        y a13 = z.a();
        Intrinsics.checkNotNullExpressionValue(a13, "success(...)");
        return a13;
    }
}
