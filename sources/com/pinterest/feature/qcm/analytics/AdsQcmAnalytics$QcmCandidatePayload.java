package com.pinterest.feature.qcm.analytics;

import a.a;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J.\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0007¨\u0006\u001d"}, d2 = {"com/pinterest/feature/qcm/analytics/AdsQcmAnalytics$QcmCandidatePayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "component3", "eventName", "numberOfCandidates", "numberOfHiddenCandidates", "Lcom/pinterest/feature/qcm/analytics/AdsQcmAnalytics$QcmCandidatePayload;", "copy", "(Ljava/lang/String;II)Lcom/pinterest/feature/qcm/analytics/AdsQcmAnalytics$QcmCandidatePayload;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "I", "getNumberOfCandidates", "getNumberOfHiddenCandidates", "<init>", "(Ljava/lang/String;II)V", "adsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class AdsQcmAnalytics$QcmCandidatePayload extends BaseAdsPayload {

    @b("event_name")
    @NotNull
    private final String eventName;

    @b("number_of_candidates")
    private final int numberOfCandidates;

    @b("number_of_hidden_candidates")
    private final int numberOfHiddenCandidates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsQcmAnalytics$QcmCandidatePayload(@NotNull String eventName, int i13, int i14) {
        super(wr.b.STL_V3);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.numberOfCandidates = i13;
        this.numberOfHiddenCandidates = i14;
    }

    public static /* synthetic */ AdsQcmAnalytics$QcmCandidatePayload copy$default(AdsQcmAnalytics$QcmCandidatePayload adsQcmAnalytics$QcmCandidatePayload, String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = adsQcmAnalytics$QcmCandidatePayload.eventName;
        }
        if ((i15 & 2) != 0) {
            i13 = adsQcmAnalytics$QcmCandidatePayload.numberOfCandidates;
        }
        if ((i15 & 4) != 0) {
            i14 = adsQcmAnalytics$QcmCandidatePayload.numberOfHiddenCandidates;
        }
        return adsQcmAnalytics$QcmCandidatePayload.copy(str, i13, i14);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumberOfCandidates() {
        return this.numberOfCandidates;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNumberOfHiddenCandidates() {
        return this.numberOfHiddenCandidates;
    }

    @NotNull
    public final AdsQcmAnalytics$QcmCandidatePayload copy(@NotNull String eventName, int numberOfCandidates, int numberOfHiddenCandidates) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AdsQcmAnalytics$QcmCandidatePayload(eventName, numberOfCandidates, numberOfHiddenCandidates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsQcmAnalytics$QcmCandidatePayload)) {
            return false;
        }
        AdsQcmAnalytics$QcmCandidatePayload adsQcmAnalytics$QcmCandidatePayload = (AdsQcmAnalytics$QcmCandidatePayload) other;
        return Intrinsics.d(this.eventName, adsQcmAnalytics$QcmCandidatePayload.eventName) && this.numberOfCandidates == adsQcmAnalytics$QcmCandidatePayload.numberOfCandidates && this.numberOfHiddenCandidates == adsQcmAnalytics$QcmCandidatePayload.numberOfHiddenCandidates;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final int getNumberOfCandidates() {
        return this.numberOfCandidates;
    }

    public final int getNumberOfHiddenCandidates() {
        return this.numberOfHiddenCandidates;
    }

    public int hashCode() {
        return Integer.hashCode(this.numberOfHiddenCandidates) + ep.b.b(this.numberOfCandidates, this.eventName.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.eventName;
        int i13 = this.numberOfCandidates;
        return a.n(a.v("QcmCandidatePayload(eventName=", str, ", numberOfCandidates=", i13, ", numberOfHiddenCandidates="), this.numberOfHiddenCandidates, ")");
    }
}
