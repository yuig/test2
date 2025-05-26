package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFe1dSDK;", "", "", "p0", "p1", "Lcom/appsflyer/internal/AFe1bSDK;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1bSDK;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFe1bSDK;", "getMediationNetwork", "getCurrencyIso4217Code", "Ljava/lang/String;", "getRevenue", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFe1dSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public final AFe1bSDK getMediationNetwork;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public final String getRevenue;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public final String getCurrencyIso4217Code;

    public AFe1dSDK(@NotNull String str, String str2, @NotNull AFe1bSDK aFe1bSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1bSDK, "");
        this.getRevenue = str;
        this.getCurrencyIso4217Code = str2;
        this.getMediationNetwork = aFe1bSDK;
    }

    public final boolean equals(Object p03) {
        if (this == p03) {
            return true;
        }
        if (!(p03 instanceof AFe1dSDK)) {
            return false;
        }
        AFe1dSDK aFe1dSDK = (AFe1dSDK) p03;
        return Intrinsics.d(this.getRevenue, aFe1dSDK.getRevenue) && Intrinsics.d(this.getCurrencyIso4217Code, aFe1dSDK.getCurrencyIso4217Code) && this.getMediationNetwork == aFe1dSDK.getMediationNetwork;
    }

    public final int hashCode() {
        int hashCode = this.getRevenue.hashCode() * 31;
        String str = this.getCurrencyIso4217Code;
        return this.getMediationNetwork.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getRevenue;
        String str2 = this.getCurrencyIso4217Code;
        AFe1bSDK aFe1bSDK = this.getMediationNetwork;
        StringBuilder w13 = a.a.w("HostMeta(name=", str, ", prefix=", str2, ", method=");
        w13.append(aFe1bSDK);
        w13.append(")");
        return w13.toString();
    }
}
