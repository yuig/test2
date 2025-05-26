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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0004JV\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b!\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\"\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b\u0011\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b&\u0010\u0004¨\u0006)"}, d2 = {"com/pinterest/adsOpenMeasurement/analytics/json/AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "component4", "()Ljava/lang/Boolean;", "", "component5", "()Ljava/lang/Long;", "component6", "step", "pinId", "adCreativeType", "isError", "duration", "errorMessage", "Lcom/pinterest/adsOpenMeasurement/analytics/json/AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)Lcom/pinterest/adsOpenMeasurement/analytics/json/AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStep", "getPinId", "getAdCreativeType", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "getDuration", "getErrorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)V", "adsOpenMeasurement_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload extends BaseAdsPayload {

    @b("ad_creative_type")
    private final String adCreativeType;

    @b("duration")
    private final Long duration;

    @b("error_message")
    private final String errorMessage;

    @b("is_error")
    private final Boolean isError;

    @b("pin_id")
    private final String pinId;

    @b("om_step")
    @NotNull
    private final String step;

    public /* synthetic */ AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload(String str, String str2, String str3, Boolean bool, Long l13, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? Boolean.TRUE : bool, (i13 & 16) != 0 ? null : l13, (i13 & 32) == 0 ? str4 : null);
    }

    public static /* synthetic */ AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload copy$default(AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload, String str, String str2, String str3, Boolean bool, Long l13, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.step;
        }
        if ((i13 & 2) != 0) {
            str2 = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.pinId;
        }
        String str5 = str2;
        if ((i13 & 4) != 0) {
            str3 = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.adCreativeType;
        }
        String str6 = str3;
        if ((i13 & 8) != 0) {
            bool = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.isError;
        }
        Boolean bool2 = bool;
        if ((i13 & 16) != 0) {
            l13 = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.duration;
        }
        Long l14 = l13;
        if ((i13 & 32) != 0) {
            str4 = adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.errorMessage;
        }
        return adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.copy(str, str5, str6, bool2, l14, str4);
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

    /* renamed from: component6, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload copy(@NotNull String step, String pinId, String adCreativeType, Boolean isError, Long duration, String errorMessage) {
        Intrinsics.checkNotNullParameter(step, "step");
        return new AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload(step, pinId, adCreativeType, isError, duration, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload)) {
            return false;
        }
        AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload = (AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload) other;
        return Intrinsics.d(this.step, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.step) && Intrinsics.d(this.pinId, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.pinId) && Intrinsics.d(this.adCreativeType, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.adCreativeType) && Intrinsics.d(this.isError, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.isError) && Intrinsics.d(this.duration, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.duration) && Intrinsics.d(this.errorMessage, adsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload.errorMessage);
    }

    public final String getAdCreativeType() {
        return this.adCreativeType;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
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
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.errorMessage;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
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
        String str4 = this.errorMessage;
        StringBuilder w13 = a.w("AdsOpenMeasurementErrorPayload(step=", str, ", pinId=", str2, ", adCreativeType=");
        w13.append(str3);
        w13.append(", isError=");
        w13.append(bool);
        w13.append(", duration=");
        w13.append(l13);
        w13.append(", errorMessage=");
        w13.append(str4);
        w13.append(")");
        return w13.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload(@NotNull String step, String str, String str2, Boolean bool, Long l13, String str3) {
        super(wr.b.OMSDK);
        Intrinsics.checkNotNullParameter(step, "step");
        this.step = step;
        this.pinId = str;
        this.adCreativeType = str2;
        this.isError = bool;
        this.duration = l13;
        this.errorMessage = str3;
    }
}
