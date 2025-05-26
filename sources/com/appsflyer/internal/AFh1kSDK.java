package com.appsflyer.internal;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010\u001a"}, d2 = {"Lcom/appsflyer/internal/AFh1kSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Ljava/lang/String;", "getRevenue", "component2", "Ljava/lang/Boolean;", "AFAdRevenueData", "getMediationNetwork", "getMonetizationNetwork", "component3", "component4", "Ljava/util/Map;", "areAllFieldsValid"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFh1kSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public Boolean component3;

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    public Boolean component2;

    /* renamed from: component2, reason: from kotlin metadata */
    public String getCurrencyIso4217Code;

    /* renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public Map<String, Object> areAllFieldsValid;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public String getRevenue;
    public Boolean getMediationNetwork;
    public Boolean getMonetizationNetwork;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public Boolean AFAdRevenueData;

    private AFh1kSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getRevenue = str;
        this.component3 = bool;
        this.AFAdRevenueData = bool2;
        this.getMediationNetwork = bool3;
        this.getMonetizationNetwork = bool4;
        this.getCurrencyIso4217Code = str2;
        this.component2 = bool5;
        this.areAllFieldsValid = map;
    }

    public final boolean equals(Object p03) {
        if (this == p03) {
            return true;
        }
        if (!(p03 instanceof AFh1kSDK)) {
            return false;
        }
        AFh1kSDK aFh1kSDK = (AFh1kSDK) p03;
        return Intrinsics.d(this.getRevenue, aFh1kSDK.getRevenue) && Intrinsics.d(this.component3, aFh1kSDK.component3) && Intrinsics.d(this.AFAdRevenueData, aFh1kSDK.AFAdRevenueData) && Intrinsics.d(this.getMediationNetwork, aFh1kSDK.getMediationNetwork) && Intrinsics.d(this.getMonetizationNetwork, aFh1kSDK.getMonetizationNetwork) && Intrinsics.d(this.getCurrencyIso4217Code, aFh1kSDK.getCurrencyIso4217Code) && Intrinsics.d(this.component2, aFh1kSDK.component2) && Intrinsics.d(this.areAllFieldsValid, aFh1kSDK.areAllFieldsValid);
    }

    public final int hashCode() {
        String str = this.getRevenue;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.component3;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.AFAdRevenueData;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getMediationNetwork;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getMonetizationNetwork;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.getCurrencyIso4217Code;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component2;
        return this.areAllFieldsValid.hashCode() + ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getRevenue + ", isLimited=" + this.component3 + ", isEnabled=" + this.AFAdRevenueData + ", isGaidWithGps=" + this.getMediationNetwork + ", isGaidWithSamsungCloudDev=" + this.getMonetizationNetwork + ", gaidError=" + this.getCurrencyIso4217Code + ", retry=" + this.component2 + ", metadata=" + this.areAllFieldsValid + ")";
    }

    public /* synthetic */ AFh1kSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : bool2, (i13 & 8) != 0 ? null : bool3, (i13 & 16) != 0 ? null : bool4, (i13 & 32) != 0 ? null : str2, (i13 & 64) == 0 ? bool5 : null, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? new HashMap() : map);
    }

    public AFh1kSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
