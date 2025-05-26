package com.pinterest.analytics;

import a.a;
import a.cb;
import com.pinterest.analytics.kibana.e;
import h32.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b/\u00100J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJh\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\bJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0004J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b&\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b(\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010\fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b-\u0010\fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b.\u0010\u000f¨\u00061"}, d2 = {"com/pinterest/analytics/ContextLogRequestMetrics$Log$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()I", "component2", "", "component3", "()Ljava/lang/String;", "component4", "", "component5", "()Ljava/lang/Long;", "Lh32/f1;", "component6", "()Lh32/f1;", "component7", "component8", "statusCode", "errorCode", "isForceFlush", "eventsCount", "eventsFirstEventTime", "eventsFirstEventType", "eventsLastEventTime", "eventsLastEventType", "Lcom/pinterest/analytics/ContextLogRequestMetrics$Log$Payload;", "copy", "(IILjava/lang/String;ILjava/lang/Long;Lh32/f1;Ljava/lang/Long;Lh32/f1;)Lcom/pinterest/analytics/ContextLogRequestMetrics$Log$Payload;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatusCode", "getErrorCode", "Ljava/lang/String;", "getEventsCount", "Ljava/lang/Long;", "getEventsFirstEventTime", "Lh32/f1;", "getEventsFirstEventType", "getEventsLastEventTime", "getEventsLastEventType", "<init>", "(IILjava/lang/String;ILjava/lang/Long;Lh32/f1;Ljava/lang/Long;Lh32/f1;)V", "analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class ContextLogRequestMetrics$Log$Payload implements e {

    @b("error_code")
    private final int errorCode;

    @b("failed_events_count")
    private final int eventsCount;

    @b("events_first_event_time")
    private final Long eventsFirstEventTime;

    @b("events_first_event_type")
    private final f1 eventsFirstEventType;

    @b("events_last_event_time")
    private final Long eventsLastEventTime;

    @b("events_last_event_type")
    private final f1 eventsLastEventType;

    @b("is_force_flush")
    @NotNull
    private final String isForceFlush;

    @b("status_code")
    private final int statusCode;

    public ContextLogRequestMetrics$Log$Payload(int i13, int i14, @NotNull String isForceFlush, int i15, Long l13, f1 f1Var, Long l14, f1 f1Var2) {
        Intrinsics.checkNotNullParameter(isForceFlush, "isForceFlush");
        this.statusCode = i13;
        this.errorCode = i14;
        this.isForceFlush = isForceFlush;
        this.eventsCount = i15;
        this.eventsFirstEventTime = l13;
        this.eventsFirstEventType = f1Var;
        this.eventsLastEventTime = l14;
        this.eventsLastEventType = f1Var2;
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component2, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIsForceFlush() {
        return this.isForceFlush;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEventsCount() {
        return this.eventsCount;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getEventsFirstEventTime() {
        return this.eventsFirstEventTime;
    }

    /* renamed from: component6, reason: from getter */
    public final f1 getEventsFirstEventType() {
        return this.eventsFirstEventType;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getEventsLastEventTime() {
        return this.eventsLastEventTime;
    }

    /* renamed from: component8, reason: from getter */
    public final f1 getEventsLastEventType() {
        return this.eventsLastEventType;
    }

    @NotNull
    public final ContextLogRequestMetrics$Log$Payload copy(int statusCode, int errorCode, @NotNull String isForceFlush, int eventsCount, Long eventsFirstEventTime, f1 eventsFirstEventType, Long eventsLastEventTime, f1 eventsLastEventType) {
        Intrinsics.checkNotNullParameter(isForceFlush, "isForceFlush");
        return new ContextLogRequestMetrics$Log$Payload(statusCode, errorCode, isForceFlush, eventsCount, eventsFirstEventTime, eventsFirstEventType, eventsLastEventTime, eventsLastEventType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextLogRequestMetrics$Log$Payload)) {
            return false;
        }
        ContextLogRequestMetrics$Log$Payload contextLogRequestMetrics$Log$Payload = (ContextLogRequestMetrics$Log$Payload) other;
        return this.statusCode == contextLogRequestMetrics$Log$Payload.statusCode && this.errorCode == contextLogRequestMetrics$Log$Payload.errorCode && Intrinsics.d(this.isForceFlush, contextLogRequestMetrics$Log$Payload.isForceFlush) && this.eventsCount == contextLogRequestMetrics$Log$Payload.eventsCount && Intrinsics.d(this.eventsFirstEventTime, contextLogRequestMetrics$Log$Payload.eventsFirstEventTime) && this.eventsFirstEventType == contextLogRequestMetrics$Log$Payload.eventsFirstEventType && Intrinsics.d(this.eventsLastEventTime, contextLogRequestMetrics$Log$Payload.eventsLastEventTime) && this.eventsLastEventType == contextLogRequestMetrics$Log$Payload.eventsLastEventType;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getEventsCount() {
        return this.eventsCount;
    }

    public final Long getEventsFirstEventTime() {
        return this.eventsFirstEventTime;
    }

    public final f1 getEventsFirstEventType() {
        return this.eventsFirstEventType;
    }

    public final Long getEventsLastEventTime() {
        return this.eventsLastEventTime;
    }

    public final f1 getEventsLastEventType() {
        return this.eventsLastEventType;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int b13 = ep.b.b(this.eventsCount, cb.d(this.isForceFlush, ep.b.b(this.errorCode, Integer.hashCode(this.statusCode) * 31, 31), 31), 31);
        Long l13 = this.eventsFirstEventTime;
        int hashCode = (b13 + (l13 == null ? 0 : l13.hashCode())) * 31;
        f1 f1Var = this.eventsFirstEventType;
        int hashCode2 = (hashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        Long l14 = this.eventsLastEventTime;
        int hashCode3 = (hashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        f1 f1Var2 = this.eventsLastEventType;
        return hashCode3 + (f1Var2 != null ? f1Var2.hashCode() : 0);
    }

    @NotNull
    public final String isForceFlush() {
        return this.isForceFlush;
    }

    @NotNull
    public String toString() {
        int i13 = this.statusCode;
        int i14 = this.errorCode;
        String str = this.isForceFlush;
        int i15 = this.eventsCount;
        Long l13 = this.eventsFirstEventTime;
        f1 f1Var = this.eventsFirstEventType;
        Long l14 = this.eventsLastEventTime;
        f1 f1Var2 = this.eventsLastEventType;
        StringBuilder t13 = a.t("Payload(statusCode=", i13, ", errorCode=", i14, ", isForceFlush=");
        t13.append(str);
        t13.append(", eventsCount=");
        t13.append(i15);
        t13.append(", eventsFirstEventTime=");
        t13.append(l13);
        t13.append(", eventsFirstEventType=");
        t13.append(f1Var);
        t13.append(", eventsLastEventTime=");
        t13.append(l14);
        t13.append(", eventsLastEventType=");
        t13.append(f1Var2);
        t13.append(")");
        return t13.toString();
    }
}
