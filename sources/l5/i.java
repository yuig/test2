package l5;

import android.content.Context;
import android.util.Log;
import androidx.activity.a0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.Task;
import dl1.b0;
import k1.s2;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a6.h f81578a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81579b;

    /* renamed from: c, reason: collision with root package name */
    public final k5.a f81580c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.g f81581d;

    /* renamed from: e, reason: collision with root package name */
    public final v f81582e;

    public i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        qh.h client = new qh.h(context, null, qh.d.f103882a, com.google.android.gms.common.api.b.En, com.google.android.gms.common.api.e.f30758c);
        int i13 = 0;
        d6.d performanceStore = d6.f.a(null, null, new a(context, i13), 7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(performanceStore, "performanceStore");
        this.f81578a = performanceStore;
        this.f81579b = "PlayServicesDevicePerformance";
        this.f81580c = new k5.a(0);
        this.f81581d = d7.b.c0("mpc_value");
        this.f81582e = m.b(new a0(this, 19));
        Log.v("PlayServicesDevicePerformance", "Getting mediaPerformanceClass from com.google.android.gms.deviceperformance.DevicePerformanceClient");
        q a13 = r.a();
        a13.f30860d = new Feature[]{ei.b.f58955a};
        a13.f30859c = qh.g.f103884a;
        a13.f30857a = 28601;
        Task d2 = client.d(0, a13.a());
        Intrinsics.checkNotNullExpressionValue(d2, "doRead(\n      TaskApiCal…Y)\n        .build()\n    )");
        d2.addOnSuccessListener(new b0(i13, new s2(this, 20))).addOnFailureListener(new com.google.firebase.messaging.a0(this, i13));
    }
}
