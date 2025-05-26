package com.pinterest.featurelibrary.pingridcell.sba.analytics.loggers;

import a.a;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J0\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"com/pinterest/featurelibrary/pingridcell/sba/analytics/loggers/PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "eventPinId", "businessLogicPinId", "group", "Lcom/pinterest/featurelibrary/pingridcell/sba/analytics/loggers/PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/featurelibrary/pingridcell/sba/analytics/loggers/PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventPinId", "getBusinessLogicPinId", "getGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pinGridCellLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload implements e {

    @b("business_logic_pin_id")
    private final String businessLogicPinId;

    @b("event_pin_id")
    @NotNull
    private final String eventPinId;

    @b("group")
    @NotNull
    private final String group;

    public PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload(@NotNull String eventPinId, String str, @NotNull String group) {
        Intrinsics.checkNotNullParameter(eventPinId, "eventPinId");
        Intrinsics.checkNotNullParameter(group, "group");
        this.eventPinId = eventPinId;
        this.businessLogicPinId = str;
        this.group = group;
    }

    public static /* synthetic */ PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload copy$default(PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload pinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload.eventPinId;
        }
        if ((i13 & 2) != 0) {
            str2 = pinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload.businessLogicPinId;
        }
        if ((i13 & 4) != 0) {
            str3 = pinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload.group;
        }
        return pinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventPinId() {
        return this.eventPinId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBusinessLogicPinId() {
        return this.businessLogicPinId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    public final PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload copy(@NotNull String eventPinId, String businessLogicPinId, @NotNull String group) {
        Intrinsics.checkNotNullParameter(eventPinId, "eventPinId");
        Intrinsics.checkNotNullParameter(group, "group");
        return new PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload(eventPinId, businessLogicPinId, group);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload)) {
            return false;
        }
        PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload pinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload = (PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload) other;
        return Intrinsics.d(this.eventPinId, pinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload.eventPinId) && Intrinsics.d(this.businessLogicPinId, pinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload.businessLogicPinId) && Intrinsics.d(this.group, pinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload.group);
    }

    public final String getBusinessLogicPinId() {
        return this.businessLogicPinId;
    }

    @NotNull
    public final String getEventPinId() {
        return this.eventPinId;
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    public int hashCode() {
        int hashCode = this.eventPinId.hashCode() * 31;
        String str = this.businessLogicPinId;
        return this.group.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.eventPinId;
        String str2 = this.businessLogicPinId;
        return a.p(a.w("PinRepIabDurationValidationPayload(eventPinId=", str, ", businessLogicPinId=", str2, ", group="), this.group, ")");
    }
}
