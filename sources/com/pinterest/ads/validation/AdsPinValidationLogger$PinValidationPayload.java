package com.pinterest.ads.validation;

import a.a;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ<\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\t¨\u0006\""}, d2 = {"com/pinterest/ads/validation/AdsPinValidationLogger$PinValidationPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "Lnm/u;", "component4", "()Lnm/u;", "pinId", "insertionId", "pinPromotionId", "failureData", "Lcom/pinterest/ads/validation/AdsPinValidationLogger$PinValidationPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnm/u;)Lcom/pinterest/ads/validation/AdsPinValidationLogger$PinValidationPayload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPinId", "getInsertionId", "getPinPromotionId", "Lnm/u;", "getFailureData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnm/u;)V", "adsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class AdsPinValidationLogger$PinValidationPayload extends BaseAdsPayload {

    @b("failure_data")
    @NotNull
    private final u failureData;

    @b("insertion_id")
    private final String insertionId;

    @b("pin_id")
    @NotNull
    private final String pinId;

    @b("pin_promotion_id")
    private final String pinPromotionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsPinValidationLogger$PinValidationPayload(@NotNull String pinId, String str, String str2, @NotNull u failureData) {
        super(wr.b.PIN_VALIDATION);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(failureData, "failureData");
        this.pinId = pinId;
        this.insertionId = str;
        this.pinPromotionId = str2;
        this.failureData = failureData;
    }

    public static /* synthetic */ AdsPinValidationLogger$PinValidationPayload copy$default(AdsPinValidationLogger$PinValidationPayload adsPinValidationLogger$PinValidationPayload, String str, String str2, String str3, u uVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = adsPinValidationLogger$PinValidationPayload.pinId;
        }
        if ((i13 & 2) != 0) {
            str2 = adsPinValidationLogger$PinValidationPayload.insertionId;
        }
        if ((i13 & 4) != 0) {
            str3 = adsPinValidationLogger$PinValidationPayload.pinPromotionId;
        }
        if ((i13 & 8) != 0) {
            uVar = adsPinValidationLogger$PinValidationPayload.failureData;
        }
        return adsPinValidationLogger$PinValidationPayload.copy(str, str2, str3, uVar);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInsertionId() {
        return this.insertionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPinPromotionId() {
        return this.pinPromotionId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final u getFailureData() {
        return this.failureData;
    }

    @NotNull
    public final AdsPinValidationLogger$PinValidationPayload copy(@NotNull String pinId, String insertionId, String pinPromotionId, @NotNull u failureData) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(failureData, "failureData");
        return new AdsPinValidationLogger$PinValidationPayload(pinId, insertionId, pinPromotionId, failureData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsPinValidationLogger$PinValidationPayload)) {
            return false;
        }
        AdsPinValidationLogger$PinValidationPayload adsPinValidationLogger$PinValidationPayload = (AdsPinValidationLogger$PinValidationPayload) other;
        return Intrinsics.d(this.pinId, adsPinValidationLogger$PinValidationPayload.pinId) && Intrinsics.d(this.insertionId, adsPinValidationLogger$PinValidationPayload.insertionId) && Intrinsics.d(this.pinPromotionId, adsPinValidationLogger$PinValidationPayload.pinPromotionId) && Intrinsics.d(this.failureData, adsPinValidationLogger$PinValidationPayload.failureData);
    }

    @NotNull
    public final u getFailureData() {
        return this.failureData;
    }

    public final String getInsertionId() {
        return this.insertionId;
    }

    @NotNull
    public final String getPinId() {
        return this.pinId;
    }

    public final String getPinPromotionId() {
        return this.pinPromotionId;
    }

    public int hashCode() {
        int hashCode = this.pinId.hashCode() * 31;
        String str = this.insertionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pinPromotionId;
        return this.failureData.f91366a.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.pinId;
        String str2 = this.insertionId;
        String str3 = this.pinPromotionId;
        u uVar = this.failureData;
        StringBuilder w13 = a.w("PinValidationPayload(pinId=", str, ", insertionId=", str2, ", pinPromotionId=");
        w13.append(str3);
        w13.append(", failureData=");
        w13.append(uVar);
        w13.append(")");
        return w13.toString();
    }
}
