package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFi1rSDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getMonetizationNetwork", "()Z", "getCurrencyIso4217Code", "Ljava/lang/String;", "AFAdRevenueData", "I", "F", "getRevenue", "areAllFieldsValid", "getMediationNetwork", "Ljava/util/List;", "component1", "J", "component3"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFi1rSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public final float getRevenue;

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    public final String getMediationNetwork;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public final int getMonetizationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    public List<String> component1;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    public final String AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public long component3;

    public AFi1rSDK(long j13, float f13, @NotNull List<String> list, int i13, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component3 = j13;
        this.getRevenue = f13;
        this.component1 = list;
        this.getMonetizationNetwork = i13;
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(Object p03) {
        if (this == p03) {
            return true;
        }
        if (!Intrinsics.d(AFi1rSDK.class, p03 != null ? p03.getClass() : null)) {
            return false;
        }
        Intrinsics.g(p03, "");
        AFi1rSDK aFi1rSDK = (AFi1rSDK) p03;
        return this.component3 == aFi1rSDK.component3 && this.getRevenue == aFi1rSDK.getRevenue && Intrinsics.d(this.component1, aFi1rSDK.component1) && this.getMonetizationNetwork == aFi1rSDK.getMonetizationNetwork && Intrinsics.d(this.AFAdRevenueData, aFi1rSDK.AFAdRevenueData) && Intrinsics.d(this.getMediationNetwork, aFi1rSDK.getMediationNetwork);
    }

    public final boolean getMonetizationNetwork() {
        return TimeUnit.SECONDS.toMillis(this.component3) > AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData().component1().getMonetizationNetwork();
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode() + ((this.AFAdRevenueData.hashCode() + ((ep.b.c(this.component1, a.a.a(this.getRevenue, Long.hashCode(this.component3) * 31, 31), 31) + this.getMonetizationNetwork) * 31)) * 31);
    }
}
