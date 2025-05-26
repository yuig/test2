package com.pinterest.feature.qcm.analytics;

import a.a;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"com/pinterest/feature/qcm/analytics/AdsQcmAnalytics$QcmItemImpressionPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "eventName", "Lcom/pinterest/feature/qcm/analytics/AdsQcmAnalytics$QcmItemImpressionPayload;", "copy", "(Ljava/lang/String;)Lcom/pinterest/feature/qcm/analytics/AdsQcmAnalytics$QcmItemImpressionPayload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "<init>", "(Ljava/lang/String;)V", "adsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class AdsQcmAnalytics$QcmItemImpressionPayload extends BaseAdsPayload {

    @b("event_name")
    @NotNull
    private final String eventName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsQcmAnalytics$QcmItemImpressionPayload(@NotNull String eventName) {
        super(wr.b.STL_V3);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
    }

    public static /* synthetic */ AdsQcmAnalytics$QcmItemImpressionPayload copy$default(AdsQcmAnalytics$QcmItemImpressionPayload adsQcmAnalytics$QcmItemImpressionPayload, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = adsQcmAnalytics$QcmItemImpressionPayload.eventName;
        }
        return adsQcmAnalytics$QcmItemImpressionPayload.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final AdsQcmAnalytics$QcmItemImpressionPayload copy(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AdsQcmAnalytics$QcmItemImpressionPayload(eventName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdsQcmAnalytics$QcmItemImpressionPayload) && Intrinsics.d(this.eventName, ((AdsQcmAnalytics$QcmItemImpressionPayload) other).eventName);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return this.eventName.hashCode();
    }

    @NotNull
    public String toString() {
        return a.k("QcmItemImpressionPayload(eventName=", this.eventName, ")");
    }
}
