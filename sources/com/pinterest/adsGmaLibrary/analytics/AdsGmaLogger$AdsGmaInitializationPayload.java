package com.pinterest.adsGmaLibrary.analytics;

import a.a;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\n¨\u0006\""}, d2 = {"com/pinterest/adsGmaLibrary/analytics/AdsGmaLogger$AdsGmaInitializationPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "", "component2", "()J", "", "component3", "()D", "eventName", "sdkLoadDuration", "powerScore", "Lcom/pinterest/adsGmaLibrary/analytics/AdsGmaLogger$AdsGmaInitializationPayload;", "copy", "(Ljava/lang/String;JD)Lcom/pinterest/adsGmaLibrary/analytics/AdsGmaLogger$AdsGmaInitializationPayload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "J", "getSdkLoadDuration", "D", "getPowerScore", "<init>", "(Ljava/lang/String;JD)V", "adsGmaLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class AdsGmaLogger$AdsGmaInitializationPayload extends BaseAdsPayload {

    @b("event_name")
    @NotNull
    private final String eventName;

    @b("power_score")
    private final double powerScore;

    @b("gma_init_duration")
    private final long sdkLoadDuration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsGmaLogger$AdsGmaInitializationPayload(@NotNull String eventName, long j13, double d2) {
        super(wr.b.GMA);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.sdkLoadDuration = j13;
        this.powerScore = d2;
    }

    public static /* synthetic */ AdsGmaLogger$AdsGmaInitializationPayload copy$default(AdsGmaLogger$AdsGmaInitializationPayload adsGmaLogger$AdsGmaInitializationPayload, String str, long j13, double d2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = adsGmaLogger$AdsGmaInitializationPayload.eventName;
        }
        if ((i13 & 2) != 0) {
            j13 = adsGmaLogger$AdsGmaInitializationPayload.sdkLoadDuration;
        }
        long j14 = j13;
        if ((i13 & 4) != 0) {
            d2 = adsGmaLogger$AdsGmaInitializationPayload.powerScore;
        }
        return adsGmaLogger$AdsGmaInitializationPayload.copy(str, j14, d2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSdkLoadDuration() {
        return this.sdkLoadDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPowerScore() {
        return this.powerScore;
    }

    @NotNull
    public final AdsGmaLogger$AdsGmaInitializationPayload copy(@NotNull String eventName, long sdkLoadDuration, double powerScore) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AdsGmaLogger$AdsGmaInitializationPayload(eventName, sdkLoadDuration, powerScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsGmaLogger$AdsGmaInitializationPayload)) {
            return false;
        }
        AdsGmaLogger$AdsGmaInitializationPayload adsGmaLogger$AdsGmaInitializationPayload = (AdsGmaLogger$AdsGmaInitializationPayload) other;
        return Intrinsics.d(this.eventName, adsGmaLogger$AdsGmaInitializationPayload.eventName) && this.sdkLoadDuration == adsGmaLogger$AdsGmaInitializationPayload.sdkLoadDuration && Double.compare(this.powerScore, adsGmaLogger$AdsGmaInitializationPayload.powerScore) == 0;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final double getPowerScore() {
        return this.powerScore;
    }

    public final long getSdkLoadDuration() {
        return this.sdkLoadDuration;
    }

    public int hashCode() {
        return Double.hashCode(this.powerScore) + a.c(this.sdkLoadDuration, this.eventName.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "AdsGmaInitializationPayload(eventName=" + this.eventName + ", sdkLoadDuration=" + this.sdkLoadDuration + ", powerScore=" + this.powerScore + ")";
    }
}
