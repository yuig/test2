package tb0;

import android.util.Pair;
import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.common.reporting.KibanaCustomEventReporter$CustomEvent$Payload;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import nm.u;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ox.b f117103a;

    public n(ox.b analyticsApi) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f117103a = analyticsApi;
    }

    public final void a(String userId, String eventName, List data) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(data, "data");
        u uVar = new u();
        List<Pair> list = data;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (Pair pair : list) {
            uVar.u((String) pair.first, (String) pair.second);
            arrayList.add(Unit.f80348a);
        }
        KibanaCustomEventReporter$CustomEvent$Payload payload = new KibanaCustomEventReporter$CustomEvent$Payload(eventName, uVar);
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(userId, "userId");
        m mVar = new m("android_custom_event", new KibanaMetrics.Log.Metadata(userId, null, 2, null), payload, null, null, 0L, 56, null);
        ms0.b bVar = new ms0.b();
        bVar.b(mVar);
        ((vy.m) this.f117103a).i(bVar, ox.a.f97979i);
    }
}
