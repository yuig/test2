package com.pinterest.feature.qcm.analytics;

import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\t\u0010\u0007¨\u0006\u001a"}, d2 = {"com/pinterest/feature/qcm/analytics/AdsQcmAnalytics$QcmItemClickPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Z", "eventName", "isFirstClick", "Lcom/pinterest/feature/qcm/analytics/AdsQcmAnalytics$QcmItemClickPayload;", "copy", "(Ljava/lang/String;Z)Lcom/pinterest/feature/qcm/analytics/AdsQcmAnalytics$QcmItemClickPayload;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "Z", "<init>", "(Ljava/lang/String;Z)V", "adsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class AdsQcmAnalytics$QcmItemClickPayload extends BaseAdsPayload {

    @b("event_name")
    @NotNull
    private final String eventName;

    @b("is_first_click")
    private final boolean isFirstClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsQcmAnalytics$QcmItemClickPayload(@NotNull String eventName, boolean z13) {
        super(wr.b.STL_V3);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.isFirstClick = z13;
    }

    public static /* synthetic */ AdsQcmAnalytics$QcmItemClickPayload copy$default(AdsQcmAnalytics$QcmItemClickPayload adsQcmAnalytics$QcmItemClickPayload, String str, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = adsQcmAnalytics$QcmItemClickPayload.eventName;
        }
        if ((i13 & 2) != 0) {
            z13 = adsQcmAnalytics$QcmItemClickPayload.isFirstClick;
        }
        return adsQcmAnalytics$QcmItemClickPayload.copy(str, z13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFirstClick() {
        return this.isFirstClick;
    }

    @NotNull
    public final AdsQcmAnalytics$QcmItemClickPayload copy(@NotNull String eventName, boolean isFirstClick) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AdsQcmAnalytics$QcmItemClickPayload(eventName, isFirstClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsQcmAnalytics$QcmItemClickPayload)) {
            return false;
        }
        AdsQcmAnalytics$QcmItemClickPayload adsQcmAnalytics$QcmItemClickPayload = (AdsQcmAnalytics$QcmItemClickPayload) other;
        return Intrinsics.d(this.eventName, adsQcmAnalytics$QcmItemClickPayload.eventName) && this.isFirstClick == adsQcmAnalytics$QcmItemClickPayload.isFirstClick;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFirstClick) + (this.eventName.hashCode() * 31);
    }

    public final boolean isFirstClick() {
        return this.isFirstClick;
    }

    @NotNull
    public String toString() {
        return "QcmItemClickPayload(eventName=" + this.eventName + ", isFirstClick=" + this.isFirstClick + ")";
    }
}
