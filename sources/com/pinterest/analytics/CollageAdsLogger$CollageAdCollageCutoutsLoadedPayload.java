package com.pinterest.analytics;

import a.c;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\u0007R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\"\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006("}, d2 = {"com/pinterest/analytics/CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Long;", "component3", "", "component4", "()Z", "", "component5", "()Ljava/lang/Integer;", "pinId", "loadingTime", "cutoutViewType", "isError", "numberOfCutouts", "Lcom/pinterest/analytics/CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;)Lcom/pinterest/analytics/CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPinId", "Ljava/lang/Long;", "getLoadingTime", "getCutoutViewType", "Z", "Ljava/lang/Integer;", "getNumberOfCutouts", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;)V", "collagesLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload extends BaseAdsPayload {

    @b("cutout_view_type")
    private final String cutoutViewType;

    @b("is_error")
    private final boolean isError;

    @b("loading_time")
    private final Long loadingTime;

    @b("number_of_cutouts")
    private final Integer numberOfCutouts;

    @b("pin_id")
    private final String pinId;

    public CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload(String str, Long l13, String str2, boolean z13, Integer num) {
        super(wr.b.COLLAGE_ADS);
        this.pinId = str;
        this.loadingTime = l13;
        this.cutoutViewType = str2;
        this.isError = z13;
        this.numberOfCutouts = num;
    }

    public static /* synthetic */ CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload copy$default(CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload collageAdsLogger$CollageAdCollageCutoutsLoadedPayload, String str, Long l13, String str2, boolean z13, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.pinId;
        }
        if ((i13 & 2) != 0) {
            l13 = collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.loadingTime;
        }
        Long l14 = l13;
        if ((i13 & 4) != 0) {
            str2 = collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.cutoutViewType;
        }
        String str3 = str2;
        if ((i13 & 8) != 0) {
            z13 = collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.isError;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            num = collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.numberOfCutouts;
        }
        return collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.copy(str, l14, str3, z14, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getLoadingTime() {
        return this.loadingTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCutoutViewType() {
        return this.cutoutViewType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getNumberOfCutouts() {
        return this.numberOfCutouts;
    }

    @NotNull
    public final CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload copy(String pinId, Long loadingTime, String cutoutViewType, boolean isError, Integer numberOfCutouts) {
        return new CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload(pinId, loadingTime, cutoutViewType, isError, numberOfCutouts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload)) {
            return false;
        }
        CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload collageAdsLogger$CollageAdCollageCutoutsLoadedPayload = (CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload) other;
        return Intrinsics.d(this.pinId, collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.pinId) && Intrinsics.d(this.loadingTime, collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.loadingTime) && Intrinsics.d(this.cutoutViewType, collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.cutoutViewType) && this.isError == collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.isError && Intrinsics.d(this.numberOfCutouts, collageAdsLogger$CollageAdCollageCutoutsLoadedPayload.numberOfCutouts);
    }

    public final String getCutoutViewType() {
        return this.cutoutViewType;
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
        Long l13 = this.loadingTime;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.cutoutViewType;
        int e13 = ep.b.e(this.isError, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.numberOfCutouts;
        return e13 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        String str = this.pinId;
        Long l13 = this.loadingTime;
        String str2 = this.cutoutViewType;
        boolean z13 = this.isError;
        Integer num = this.numberOfCutouts;
        StringBuilder sb3 = new StringBuilder("CollageAdCollageCutoutsLoadedPayload(pinId=");
        sb3.append(str);
        sb3.append(", loadingTime=");
        sb3.append(l13);
        sb3.append(", cutoutViewType=");
        sb3.append(str2);
        sb3.append(", isError=");
        sb3.append(z13);
        sb3.append(", numberOfCutouts=");
        return c.i(sb3, num, ")");
    }
}
