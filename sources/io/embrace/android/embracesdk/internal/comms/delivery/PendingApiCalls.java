package io.embrace.android.embracesdk.internal.comms.delivery;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/delivery/PendingApiCalls;", "", "", "Lpg2/s;", "", "Lio/embrace/android/embracesdk/internal/comms/delivery/PendingApiCall;", "pendingApiCallsMap", "<init>", "(Ljava/util/Map;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PendingApiCalls {

    /* renamed from: a, reason: collision with root package name */
    public final Map f72961a;

    public PendingApiCalls(@p(name = "pendingApiCallsMap") @NotNull Map<pg2.s, ? extends List<PendingApiCall>> pendingApiCallsMap) {
        Intrinsics.checkNotNullParameter(pendingApiCallsMap, "pendingApiCallsMap");
        this.f72961a = pendingApiCallsMap;
    }

    public /* synthetic */ PendingApiCalls(Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? z0.d() : map);
    }
}
