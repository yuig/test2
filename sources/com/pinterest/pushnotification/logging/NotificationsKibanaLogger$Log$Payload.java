package com.pinterest.pushnotification.logging;

import a.a;
import a.cb;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J8\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001f"}, d2 = {"com/pinterest/pushnotification/logging/NotificationsKibanaLogger$Log$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "eventType", "source", "utmSource", "utmCampaign", "Lcom/pinterest/pushnotification/logging/NotificationsKibanaLogger$Log$Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/pushnotification/logging/NotificationsKibanaLogger$Log$Payload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventType", "getSource", "getUtmSource", "getUtmCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pushNotificationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class NotificationsKibanaLogger$Log$Payload implements e {

    @b("eventType")
    @NotNull
    private final String eventType;

    @b("source")
    @NotNull
    private final String source;

    @b("utmCampaign")
    @NotNull
    private final String utmCampaign;

    @b("utmSource")
    @NotNull
    private final String utmSource;

    public NotificationsKibanaLogger$Log$Payload(@NotNull String eventType, @NotNull String source, @NotNull String utmSource, @NotNull String utmCampaign) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(utmCampaign, "utmCampaign");
        this.eventType = eventType;
        this.source = source;
        this.utmSource = utmSource;
        this.utmCampaign = utmCampaign;
    }

    public static /* synthetic */ NotificationsKibanaLogger$Log$Payload copy$default(NotificationsKibanaLogger$Log$Payload notificationsKibanaLogger$Log$Payload, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = notificationsKibanaLogger$Log$Payload.eventType;
        }
        if ((i13 & 2) != 0) {
            str2 = notificationsKibanaLogger$Log$Payload.source;
        }
        if ((i13 & 4) != 0) {
            str3 = notificationsKibanaLogger$Log$Payload.utmSource;
        }
        if ((i13 & 8) != 0) {
            str4 = notificationsKibanaLogger$Log$Payload.utmCampaign;
        }
        return notificationsKibanaLogger$Log$Payload.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUtmSource() {
        return this.utmSource;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    @NotNull
    public final NotificationsKibanaLogger$Log$Payload copy(@NotNull String eventType, @NotNull String source, @NotNull String utmSource, @NotNull String utmCampaign) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(utmCampaign, "utmCampaign");
        return new NotificationsKibanaLogger$Log$Payload(eventType, source, utmSource, utmCampaign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsKibanaLogger$Log$Payload)) {
            return false;
        }
        NotificationsKibanaLogger$Log$Payload notificationsKibanaLogger$Log$Payload = (NotificationsKibanaLogger$Log$Payload) other;
        return Intrinsics.d(this.eventType, notificationsKibanaLogger$Log$Payload.eventType) && Intrinsics.d(this.source, notificationsKibanaLogger$Log$Payload.source) && Intrinsics.d(this.utmSource, notificationsKibanaLogger$Log$Payload.utmSource) && Intrinsics.d(this.utmCampaign, notificationsKibanaLogger$Log$Payload.utmCampaign);
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    @NotNull
    public final String getUtmSource() {
        return this.utmSource;
    }

    public int hashCode() {
        return this.utmCampaign.hashCode() + cb.d(this.utmSource, cb.d(this.source, this.eventType.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.eventType;
        String str2 = this.source;
        return a.q(a.w("Payload(eventType=", str, ", source=", str2, ", utmSource="), this.utmSource, ", utmCampaign=", this.utmCampaign, ")");
    }
}
