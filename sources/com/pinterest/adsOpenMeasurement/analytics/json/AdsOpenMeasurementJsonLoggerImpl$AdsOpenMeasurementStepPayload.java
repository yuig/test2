package com.pinterest.adsOpenMeasurement.analytics.json;

import a.a;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b \u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010\f¨\u0006&"}, d2 = {"com/pinterest/adsOpenMeasurement/analytics/json/AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "component4", "()Ljava/lang/Boolean;", "", "component5", "()Ljava/lang/Long;", "step", "pinId", "adCreativeType", "isError", "duration", "Lcom/pinterest/adsOpenMeasurement/analytics/json/AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/pinterest/adsOpenMeasurement/analytics/json/AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStep", "getPinId", "getAdCreativeType", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "getDuration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "adsOpenMeasurement_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload extends BaseAdsPayload {

    @b("ad_creative_type")
    private final String adCreativeType;

    @b("duration")
    private final Long duration;

    @b("is_error")
    private final Boolean isError;

    @b("pin_id")
    private final String pinId;

    @b("om_step")
    @NotNull
    private final String step;

    public /* synthetic */ AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload(String str, String str2, String str3, Boolean bool, Long l13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? Boolean.FALSE : bool, (i13 & 16) != 0 ? null : l13);
    }

    public static /* synthetic */ AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload copy$default(AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload, String str, String str2, String str3, Boolean bool, Long l13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.step;
        }
        if ((i13 & 2) != 0) {
            str2 = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.pinId;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            str3 = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.adCreativeType;
        }
        String str5 = str3;
        if ((i13 & 8) != 0) {
            bool = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.isError;
        }
        Boolean bool2 = bool;
        if ((i13 & 16) != 0) {
            l13 = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.duration;
        }
        return adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.copy(str, str4, str5, bool2, l13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStep() {
        return this.step;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAdCreativeType() {
        return this.adCreativeType;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsError() {
        return this.isError;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @NotNull
    public final AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload copy(@NotNull String step, String pinId, String adCreativeType, Boolean isError, Long duration) {
        Intrinsics.checkNotNullParameter(step, "step");
        return new AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload(step, pinId, adCreativeType, isError, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload)) {
            return false;
        }
        AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload = (AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload) other;
        return Intrinsics.d(this.step, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.step) && Intrinsics.d(this.pinId, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.pinId) && Intrinsics.d(this.adCreativeType, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.adCreativeType) && Intrinsics.d(this.isError, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.isError) && Intrinsics.d(this.duration, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload.duration);
    }

    public final String getAdCreativeType() {
        return this.adCreativeType;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getPinId() {
        return this.pinId;
    }

    @NotNull
    public final String getStep() {
        return this.step;
    }

    public int hashCode() {
        int hashCode = this.step.hashCode() * 31;
        String str = this.pinId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adCreativeType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isError;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l13 = this.duration;
        return hashCode4 + (l13 != null ? l13.hashCode() : 0);
    }

    public final Boolean isError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        String str = this.step;
        String str2 = this.pinId;
        String str3 = this.adCreativeType;
        Boolean bool = this.isError;
        Long l13 = this.duration;
        StringBuilder w13 = a.w("AdsOpenMeasurementStepPayload(step=", str, ", pinId=", str2, ", adCreativeType=");
        w13.append(str3);
        w13.append(", isError=");
        w13.append(bool);
        w13.append(", duration=");
        w13.append(l13);
        w13.append(")");
        return w13.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload(@NotNull String step, String str, String str2, Boolean bool, Long l13) {
        super(wr.b.OMSDK);
        Intrinsics.checkNotNullParameter(step, "step");
        this.step = step;
        this.pinId = str;
        this.adCreativeType = str2;
        this.isError = bool;
        this.duration = l13;
    }
}
