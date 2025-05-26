package com.pinterest.notificationsUtilLibrary;

import a.a;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J>\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001f"}, d2 = {"com/pinterest/notificationsUtilLibrary/NotifHoldoutKibanaLogger$Log$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "event", "source", "expName", "expGroup", "Lcom/pinterest/notificationsUtilLibrary/NotifHoldoutKibanaLogger$Log$Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/notificationsUtilLibrary/NotifHoldoutKibanaLogger$Log$Payload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEvent", "getSource", "getExpName", "getExpGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "notificationsUtilLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class NotifHoldoutKibanaLogger$Log$Payload implements e {

    @b("event")
    @NotNull
    private final String event;

    @b("expGroup")
    private final String expGroup;

    @b("expName")
    private final String expName;

    @b("source")
    private final String source;

    public NotifHoldoutKibanaLogger$Log$Payload(@NotNull String event, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.event = event;
        this.source = str;
        this.expName = str2;
        this.expGroup = str3;
    }

    public static /* synthetic */ NotifHoldoutKibanaLogger$Log$Payload copy$default(NotifHoldoutKibanaLogger$Log$Payload notifHoldoutKibanaLogger$Log$Payload, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = notifHoldoutKibanaLogger$Log$Payload.event;
        }
        if ((i13 & 2) != 0) {
            str2 = notifHoldoutKibanaLogger$Log$Payload.source;
        }
        if ((i13 & 4) != 0) {
            str3 = notifHoldoutKibanaLogger$Log$Payload.expName;
        }
        if ((i13 & 8) != 0) {
            str4 = notifHoldoutKibanaLogger$Log$Payload.expGroup;
        }
        return notifHoldoutKibanaLogger$Log$Payload.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExpName() {
        return this.expName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExpGroup() {
        return this.expGroup;
    }

    @NotNull
    public final NotifHoldoutKibanaLogger$Log$Payload copy(@NotNull String event, String source, String expName, String expGroup) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new NotifHoldoutKibanaLogger$Log$Payload(event, source, expName, expGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifHoldoutKibanaLogger$Log$Payload)) {
            return false;
        }
        NotifHoldoutKibanaLogger$Log$Payload notifHoldoutKibanaLogger$Log$Payload = (NotifHoldoutKibanaLogger$Log$Payload) other;
        return Intrinsics.d(this.event, notifHoldoutKibanaLogger$Log$Payload.event) && Intrinsics.d(this.source, notifHoldoutKibanaLogger$Log$Payload.source) && Intrinsics.d(this.expName, notifHoldoutKibanaLogger$Log$Payload.expName) && Intrinsics.d(this.expGroup, notifHoldoutKibanaLogger$Log$Payload.expGroup);
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    public final String getExpGroup() {
        return this.expGroup;
    }

    public final String getExpName() {
        return this.expName;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        String str = this.source;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expGroup;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.event;
        String str2 = this.source;
        return a.q(a.w("Payload(event=", str, ", source=", str2, ", expName="), this.expName, ", expGroup=", this.expGroup, ")");
    }
}
