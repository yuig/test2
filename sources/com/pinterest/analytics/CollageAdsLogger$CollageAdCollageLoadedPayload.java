package com.pinterest.analytics;

import a.a;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004Jb\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010\nR\u001a\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b\u0015\u0010\rR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b*\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b,\u0010\u0004¨\u0006/"}, d2 = {"com/pinterest/analytics/CollageAdsLogger$CollageAdCollageLoadedPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Integer;", "", "component3", "()Ljava/lang/Long;", "", "component4", "()Z", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "pinId", "numberOfCutouts", "loadingTime", "isError", "errorMessage", "isAdCloseupUi", "animationType", "Lcom/pinterest/analytics/CollageAdsLogger$CollageAdCollageLoadedPayload;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/pinterest/analytics/CollageAdsLogger$CollageAdCollageLoadedPayload;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPinId", "Ljava/lang/Integer;", "getNumberOfCutouts", "Ljava/lang/Long;", "getLoadingTime", "Z", "getErrorMessage", "Ljava/lang/Boolean;", "getAnimationType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "collagesLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class CollageAdsLogger$CollageAdCollageLoadedPayload extends BaseAdsPayload {

    @b("animation_type")
    private final String animationType;

    @b("error_message")
    private final String errorMessage;

    @b("is_ad_closeup_ui")
    private final Boolean isAdCloseupUi;

    @b("is_error")
    private final boolean isError;

    @b("loading_time")
    private final Long loadingTime;

    @b("number_of_cutouts")
    private final Integer numberOfCutouts;

    @b("pin_id")
    private final String pinId;

    public CollageAdsLogger$CollageAdCollageLoadedPayload(String str, Integer num, Long l13, boolean z13, String str2, Boolean bool, String str3) {
        super(wr.b.COLLAGE_ADS);
        this.pinId = str;
        this.numberOfCutouts = num;
        this.loadingTime = l13;
        this.isError = z13;
        this.errorMessage = str2;
        this.isAdCloseupUi = bool;
        this.animationType = str3;
    }

    public static /* synthetic */ CollageAdsLogger$CollageAdCollageLoadedPayload copy$default(CollageAdsLogger$CollageAdCollageLoadedPayload collageAdsLogger$CollageAdCollageLoadedPayload, String str, Integer num, Long l13, boolean z13, String str2, Boolean bool, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = collageAdsLogger$CollageAdCollageLoadedPayload.pinId;
        }
        if ((i13 & 2) != 0) {
            num = collageAdsLogger$CollageAdCollageLoadedPayload.numberOfCutouts;
        }
        Integer num2 = num;
        if ((i13 & 4) != 0) {
            l13 = collageAdsLogger$CollageAdCollageLoadedPayload.loadingTime;
        }
        Long l14 = l13;
        if ((i13 & 8) != 0) {
            z13 = collageAdsLogger$CollageAdCollageLoadedPayload.isError;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            str2 = collageAdsLogger$CollageAdCollageLoadedPayload.errorMessage;
        }
        String str4 = str2;
        if ((i13 & 32) != 0) {
            bool = collageAdsLogger$CollageAdCollageLoadedPayload.isAdCloseupUi;
        }
        Boolean bool2 = bool;
        if ((i13 & 64) != 0) {
            str3 = collageAdsLogger$CollageAdCollageLoadedPayload.animationType;
        }
        return collageAdsLogger$CollageAdCollageLoadedPayload.copy(str, num2, l14, z14, str4, bool2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getNumberOfCutouts() {
        return this.numberOfCutouts;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getLoadingTime() {
        return this.loadingTime;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: component5, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsAdCloseupUi() {
        return this.isAdCloseupUi;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAnimationType() {
        return this.animationType;
    }

    @NotNull
    public final CollageAdsLogger$CollageAdCollageLoadedPayload copy(String pinId, Integer numberOfCutouts, Long loadingTime, boolean isError, String errorMessage, Boolean isAdCloseupUi, String animationType) {
        return new CollageAdsLogger$CollageAdCollageLoadedPayload(pinId, numberOfCutouts, loadingTime, isError, errorMessage, isAdCloseupUi, animationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollageAdsLogger$CollageAdCollageLoadedPayload)) {
            return false;
        }
        CollageAdsLogger$CollageAdCollageLoadedPayload collageAdsLogger$CollageAdCollageLoadedPayload = (CollageAdsLogger$CollageAdCollageLoadedPayload) other;
        return Intrinsics.d(this.pinId, collageAdsLogger$CollageAdCollageLoadedPayload.pinId) && Intrinsics.d(this.numberOfCutouts, collageAdsLogger$CollageAdCollageLoadedPayload.numberOfCutouts) && Intrinsics.d(this.loadingTime, collageAdsLogger$CollageAdCollageLoadedPayload.loadingTime) && this.isError == collageAdsLogger$CollageAdCollageLoadedPayload.isError && Intrinsics.d(this.errorMessage, collageAdsLogger$CollageAdCollageLoadedPayload.errorMessage) && Intrinsics.d(this.isAdCloseupUi, collageAdsLogger$CollageAdCollageLoadedPayload.isAdCloseupUi) && Intrinsics.d(this.animationType, collageAdsLogger$CollageAdCollageLoadedPayload.animationType);
    }

    public final String getAnimationType() {
        return this.animationType;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Long getLoadingTime() {
        return this.loadingTime;
    }

    public final Integer getNumberOfCutouts() {
        return this.numberOfCutouts;
    }

    public final String getPinId() {
        return this.pinId;
    }

    public int hashCode() {
        String str = this.pinId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.numberOfCutouts;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l13 = this.loadingTime;
        int e13 = ep.b.e(this.isError, (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31, 31);
        String str2 = this.errorMessage;
        int hashCode3 = (e13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAdCloseupUi;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.animationType;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isAdCloseupUi() {
        return this.isAdCloseupUi;
    }

    public final boolean isError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        String str = this.pinId;
        Integer num = this.numberOfCutouts;
        Long l13 = this.loadingTime;
        boolean z13 = this.isError;
        String str2 = this.errorMessage;
        Boolean bool = this.isAdCloseupUi;
        String str3 = this.animationType;
        StringBuilder sb3 = new StringBuilder("CollageAdCollageLoadedPayload(pinId=");
        sb3.append(str);
        sb3.append(", numberOfCutouts=");
        sb3.append(num);
        sb3.append(", loadingTime=");
        sb3.append(l13);
        sb3.append(", isError=");
        sb3.append(z13);
        sb3.append(", errorMessage=");
        sb3.append(str2);
        sb3.append(", isAdCloseupUi=");
        sb3.append(bool);
        sb3.append(", animationType=");
        return a.p(sb3, str3, ")");
    }
}
