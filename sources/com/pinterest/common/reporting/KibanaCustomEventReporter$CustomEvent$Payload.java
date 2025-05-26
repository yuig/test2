package com.pinterest.common.reporting;

import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"com/pinterest/common/reporting/KibanaCustomEventReporter$CustomEvent$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "Lnm/u;", "component2", "()Lnm/u;", "eventName", "eventData", "Lcom/pinterest/common/reporting/KibanaCustomEventReporter$CustomEvent$Payload;", "copy", "(Ljava/lang/String;Lnm/u;)Lcom/pinterest/common/reporting/KibanaCustomEventReporter$CustomEvent$Payload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "Lnm/u;", "getEventData", "<init>", "(Ljava/lang/String;Lnm/u;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class KibanaCustomEventReporter$CustomEvent$Payload implements e {

    @b("event_data")
    @NotNull
    private final u eventData;

    @b("event_name")
    @NotNull
    private final String eventName;

    public KibanaCustomEventReporter$CustomEvent$Payload(@NotNull String eventName, @NotNull u eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.eventName = eventName;
        this.eventData = eventData;
    }

    public static /* synthetic */ KibanaCustomEventReporter$CustomEvent$Payload copy$default(KibanaCustomEventReporter$CustomEvent$Payload kibanaCustomEventReporter$CustomEvent$Payload, String str, u uVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = kibanaCustomEventReporter$CustomEvent$Payload.eventName;
        }
        if ((i13 & 2) != 0) {
            uVar = kibanaCustomEventReporter$CustomEvent$Payload.eventData;
        }
        return kibanaCustomEventReporter$CustomEvent$Payload.copy(str, uVar);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final u getEventData() {
        return this.eventData;
    }

    @NotNull
    public final KibanaCustomEventReporter$CustomEvent$Payload copy(@NotNull String eventName, @NotNull u eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        return new KibanaCustomEventReporter$CustomEvent$Payload(eventName, eventData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KibanaCustomEventReporter$CustomEvent$Payload)) {
            return false;
        }
        KibanaCustomEventReporter$CustomEvent$Payload kibanaCustomEventReporter$CustomEvent$Payload = (KibanaCustomEventReporter$CustomEvent$Payload) other;
        return Intrinsics.d(this.eventName, kibanaCustomEventReporter$CustomEvent$Payload.eventName) && Intrinsics.d(this.eventData, kibanaCustomEventReporter$CustomEvent$Payload.eventData);
    }

    @NotNull
    public final u getEventData() {
        return this.eventData;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return this.eventData.f91366a.hashCode() + (this.eventName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Payload(eventName=" + this.eventName + ", eventData=" + this.eventData + ")";
    }
}
