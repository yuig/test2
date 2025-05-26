package com.pinterest.widget.analytics;

import a.a;
import a.cb;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J<\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001f"}, d2 = {"com/pinterest/widget/analytics/WidgetKibanaLogger$Log$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "event", "widgetType", "contentSource", "error", "Lcom/pinterest/widget/analytics/WidgetKibanaLogger$Log$Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/widget/analytics/WidgetKibanaLogger$Log$Payload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEvent", "getWidgetType", "getContentSource", "getError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class WidgetKibanaLogger$Log$Payload implements e {

    @b("contentSource")
    private final String contentSource;

    @b("error")
    private final String error;

    @b("event")
    @NotNull
    private final String event;

    @b("widgetType")
    @NotNull
    private final String widgetType;

    public WidgetKibanaLogger$Log$Payload(@NotNull String event, @NotNull String widgetType, String str, String str2) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.event = event;
        this.widgetType = widgetType;
        this.contentSource = str;
        this.error = str2;
    }

    public static /* synthetic */ WidgetKibanaLogger$Log$Payload copy$default(WidgetKibanaLogger$Log$Payload widgetKibanaLogger$Log$Payload, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = widgetKibanaLogger$Log$Payload.event;
        }
        if ((i13 & 2) != 0) {
            str2 = widgetKibanaLogger$Log$Payload.widgetType;
        }
        if ((i13 & 4) != 0) {
            str3 = widgetKibanaLogger$Log$Payload.contentSource;
        }
        if ((i13 & 8) != 0) {
            str4 = widgetKibanaLogger$Log$Payload.error;
        }
        return widgetKibanaLogger$Log$Payload.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getWidgetType() {
        return this.widgetType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContentSource() {
        return this.contentSource;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final WidgetKibanaLogger$Log$Payload copy(@NotNull String event, @NotNull String widgetType, String contentSource, String error) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new WidgetKibanaLogger$Log$Payload(event, widgetType, contentSource, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetKibanaLogger$Log$Payload)) {
            return false;
        }
        WidgetKibanaLogger$Log$Payload widgetKibanaLogger$Log$Payload = (WidgetKibanaLogger$Log$Payload) other;
        return Intrinsics.d(this.event, widgetKibanaLogger$Log$Payload.event) && Intrinsics.d(this.widgetType, widgetKibanaLogger$Log$Payload.widgetType) && Intrinsics.d(this.contentSource, widgetKibanaLogger$Log$Payload.contentSource) && Intrinsics.d(this.error, widgetKibanaLogger$Log$Payload.error);
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final String getWidgetType() {
        return this.widgetType;
    }

    public int hashCode() {
        int d2 = cb.d(this.widgetType, this.event.hashCode() * 31, 31);
        String str = this.contentSource;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.event;
        String str2 = this.widgetType;
        return a.q(a.w("Payload(event=", str, ", widgetType=", str2, ", contentSource="), this.contentSource, ", error=", this.error, ")");
    }
}
