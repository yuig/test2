package ni1;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final nx.d0 f90831a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90832b;

    public v2(nx.d0 pinalytics, int i13) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f90831a = pinalytics;
        this.f90832b = i13;
    }

    public final void a(u2 log, z1 z1Var) {
        String a13;
        Intrinsics.checkNotNullParameter(log, "log");
        h32.f1 eventType = log.getEventType();
        HashMap hashMap = new HashMap();
        hashMap.put("queue_size", String.valueOf(this.f90832b));
        if (z1Var != null && (a13 = z1Var.a()) != null) {
            hashMap.put("pgc_event_name", a13);
        }
        nx.d0.B(this.f90831a, eventType, null, null, hashMap, 22);
    }
}
