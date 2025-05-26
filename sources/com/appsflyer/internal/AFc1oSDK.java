package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK;", "", "", "p0", "Lcom/appsflyer/deeplink/DeepLink;", "p1", "<init>", "(ZLcom/appsflyer/deeplink/DeepLink;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getRevenue", "Lcom/appsflyer/deeplink/DeepLink;", "getMediationNetwork", "Z", "()Z", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AFc1oSDK {

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final boolean getCurrencyIso4217Code;
    public final DeepLink getRevenue;

    public AFc1oSDK(boolean z13, DeepLink deepLink) {
        this.getCurrencyIso4217Code = z13;
        this.getRevenue = deepLink;
    }

    public final boolean equals(Object p03) {
        if (this == p03) {
            return true;
        }
        if (!(p03 instanceof AFc1oSDK)) {
            return false;
        }
        AFc1oSDK aFc1oSDK = (AFc1oSDK) p03;
        return this.getCurrencyIso4217Code == aFc1oSDK.getCurrencyIso4217Code && Intrinsics.d(this.getRevenue, aFc1oSDK.getRevenue);
    }

    /* renamed from: getRevenue, reason: from getter */
    public final boolean getGetCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z13 = this.getCurrencyIso4217Code;
        ?? r03 = z13;
        if (z13) {
            r03 = 1;
        }
        int i13 = r03 * 31;
        DeepLink deepLink = this.getRevenue;
        return i13 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DdlResponse(secondPing=" + this.getCurrencyIso4217Code + ", deepLink=" + this.getRevenue + ")";
    }

    public /* synthetic */ AFc1oSDK(boolean z13, DeepLink deepLink, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z13, (i13 & 2) != 0 ? null : deepLink);
    }

    public AFc1oSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
