package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\t\u0010\rJ\u001b\u0010\u000f\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016"}, d2 = {"Lcom/appsflyer/internal/AFj1bSDK;", "", "Lcom/appsflyer/internal/AFd1nSDK;", "p0", "Lcom/appsflyer/internal/AFk1ySDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1nSDK;Lcom/appsflyer/internal/AFk1ySDK;)V", "", "AFAdRevenueData", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFh1aSDK;", "(Lcom/appsflyer/internal/AFh1aSDK;)Ljava/lang/String;", "", "getRevenue", "(Ljava/lang/String;Z)Ljava/lang/String;", "getCurrencyIso4217Code", "(Ljava/lang/String;)Ljava/lang/String;", "getMediationNetwork", "Lcom/appsflyer/internal/AFd1nSDK;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFk1ySDK;", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFj1bSDK {

    @NotNull
    public static final String AFAdRevenueData;

    @NotNull
    public static final String areAllFieldsValid;

    @NotNull
    private static final String component1;

    @NotNull
    public static final String component2;

    @NotNull
    public static final String component3;

    @NotNull
    public static String component4;

    @NotNull
    public static final String getMediationNetwork;

    @NotNull
    public static final String getMonetizationNetwork;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public final AFk1ySDK AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public final AFd1nSDK getMonetizationNetwork;

    static {
        String str = AFb1tSDK.getMediationNetwork;
        String C = a.a.C(str, "/androidevent?app_id=");
        component1 = C;
        getMonetizationNetwork = a.a.j("https://%sattr.%s/api/v", C);
        AFAdRevenueData = "https://%sadrevenue.%s/api/v2/generic/v6.16.0/android?app_id=";
        getMediationNetwork = a.a.j("https://%sconversions.%s/api/v", C);
        areAllFieldsValid = a.a.j("https://%slaunches.%s/api/v", C);
        component3 = a.a.j("https://%sinapps.%s/api/v", C);
        component2 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        component4 = a.a.k("https://%svalidate.%s/api/v", str, "/androidevent?buildnumber=6.16.0&app_id=");
    }

    private AFj1bSDK(@NotNull AFd1nSDK aFd1nSDK, @NotNull AFk1ySDK aFk1ySDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFk1ySDK, "");
        this.getMonetizationNetwork = aFd1nSDK;
        this.AFAdRevenueData = aFk1ySDK;
    }

    public static String getRevenue(String str, boolean z13) {
        return a.a.C(str, !z13 ? "&buildnumber=6.16.0" : "");
    }

    @NotNull
    public final String AFAdRevenueData(String p03, String p13) {
        String packageName = this.getMonetizationNetwork.getRevenue.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String component12 = this.getMonetizationNetwork.component1();
        if (component12 != null && !z.j(component12)) {
            component12 = a.a.j("-", StringsKt.i0(component12).toString());
        }
        if (component12 == null) {
            component12 = "";
        }
        String obj = StringsKt.i0(component12).toString();
        Uri.Builder appendPath = Uri.parse(this.AFAdRevenueData.getMonetizationNetwork("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + obj);
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        if (p03 == null || p13 == null) {
            String str = p03 == null ? "devKey" : "timestamp";
            AFLogger.afErrorLog(str.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str.concat(" is null")));
        } else {
            appendPath.appendQueryParameter("af_sig", AFb1mSDK.getRevenue(p13.concat(p03), p03));
        }
        String obj2 = appendPath.appendQueryParameter("sdk_version", AFb1tSDK.getMediationNetwork).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public final String getCurrencyIso4217Code(String str) {
        String component12 = this.getMonetizationNetwork.component1();
        String concat = component12 != null ? "&channel=".concat(component12) : null;
        if (concat == null) {
            concat = "";
        }
        return a.a.C(str, concat);
    }

    public final String getMediationNetwork(String str) {
        return a.a.C(str, this.getMonetizationNetwork.getRevenue.getMonetizationNetwork.getPackageName());
    }

    public /* synthetic */ AFj1bSDK(AFd1nSDK aFd1nSDK, AFk1ySDK aFk1ySDK, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1nSDK, (i13 & 2) != 0 ? new AFk1zSDK() : aFk1ySDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFj1bSDK(@NotNull AFd1nSDK aFd1nSDK) {
        this(aFd1nSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
    }

    @NotNull
    public final String AFAdRevenueData(@NotNull AFh1aSDK p03) {
        Intrinsics.checkNotNullParameter(p03, "");
        if (p03 instanceof AFi1uSDK) {
            return this.AFAdRevenueData.getMonetizationNetwork("https://%ssdk-services.%s/validate-android-signature");
        }
        if (p03 instanceof AFi1vSDK) {
            return a.a.C(this.AFAdRevenueData.getMonetizationNetwork(component4), this.getMonetizationNetwork.getRevenue.getMonetizationNetwork.getPackageName());
        }
        throw new UnsupportedOperationException();
    }

    @NotNull
    public static String AFAdRevenueData() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }
}
