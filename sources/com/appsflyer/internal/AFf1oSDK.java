package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AFf1oSDK extends AFf1hSDK<String> {

    @NotNull
    private final AFf1rSDK component2;

    @NotNull
    private final AFg1gSDK copy;

    @NotNull
    private final AFd1nSDK copydefault;

    @NotNull
    private final Map<String, Object> equals;

    @NotNull
    private final AFd1pSDK hashCode;

    @NotNull
    private final AFg1oSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1oSDK(@NotNull AFf1rSDK aFf1rSDK, @NotNull AFf1rSDK[] aFf1rSDKArr, @NotNull AFd1gSDK aFd1gSDK, String str, @NotNull Map<String, ? extends Object> map) {
        super(aFf1rSDK, aFf1rSDKArr, aFd1gSDK, null);
        Intrinsics.checkNotNullParameter(aFf1rSDK, "");
        Intrinsics.checkNotNullParameter(aFf1rSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = aFf1rSDK;
        this.equals = map;
        AFd1nSDK monetizationNetwork = aFd1gSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        this.copydefault = monetizationNetwork;
        AFd1pSDK component2 = aFd1gSDK.component2();
        Intrinsics.checkNotNullExpressionValue(component2, "");
        this.hashCode = component2;
        AFg1gSDK component1 = aFd1gSDK.component1();
        Intrinsics.checkNotNullExpressionValue(component1, "");
        this.copy = component1;
        AFg1oSDK force = aFd1gSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.toString = force;
    }

    public abstract AFe1rSDK<String> AFAdRevenueData(@NotNull Map<String, Object> map, @NotNull String str, String str2);

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public boolean component2() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean copy() {
        return true;
    }

    public void getCurrencyIso4217Code(@NotNull Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.copydefault.getRevenue.getMonetizationNetwork.getPackageName());
        String mediationNetwork = AFd1nSDK.getMediationNetwork();
        if (mediationNetwork != null) {
            map.put("cuid", mediationNetwork);
        }
        Context context = this.copydefault.getRevenue.getMonetizationNetwork;
        map.put("app_version_name", AFb1qSDK.getRevenue(context, context.getPackageName()));
        if (component2()) {
            map.put("event_timestamp", Long.valueOf(this.copy.getMonetizationNetwork()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    public String getMonetizationNetwork(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public String getRevenue(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AFe1rSDK<String> getCurrencyIso4217Code(@NotNull String str) {
        AFe1kSDK aFe1kSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> r13 = z0.r(this.equals);
        String monetizationNetwork = getMonetizationNetwork(r13);
        String revenue = getRevenue(r13);
        Map<String, Object> r14 = z0.r(r13);
        getCurrencyIso4217Code(r14, monetizationNetwork);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String currencyIso4217Code = this.copydefault.getCurrencyIso4217Code();
        if (currencyIso4217Code != null && !z.j(currencyIso4217Code)) {
            linkedHashMap.put("advertising_id", currencyIso4217Code);
        }
        AFb1uSDK currencyIso4217Code2 = AFb1vSDK.getCurrencyIso4217Code(this.copydefault.getRevenue.getMonetizationNetwork);
        String str2 = null;
        String str3 = currencyIso4217Code2 != null ? currencyIso4217Code2.getMonetizationNetwork : null;
        if (str3 != null && !z.j(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1uSDK b_ = AFb1vSDK.b_(this.copydefault.getRevenue.getMonetizationNetwork.getContentResolver());
        String str4 = b_ != null ? b_.getMonetizationNetwork : null;
        if (str4 != null && !z.j(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            r14.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String mediationNetwork = ((AFf1hSDK) this).component4.getMediationNetwork(this.hashCode);
            if (mediationNetwork != null && !z.j(mediationNetwork)) {
                linkedHashMap.put("imei", mediationNetwork);
            }
        }
        AFd1nSDK aFd1nSDK = this.copydefault;
        String mediationNetwork2 = AFb1iSDK.getMediationNetwork(aFd1nSDK.getRevenue, aFd1nSDK.getCurrencyIso4217Code);
        if (mediationNetwork2 == null) {
            mediationNetwork2 = "";
        }
        linkedHashMap.put("appsflyer_id", mediationNetwork2);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.16.0");
        if (revenue != null && !z.j(revenue)) {
            linkedHashMap.put("sdk_connector_version", revenue);
        }
        r14.put("device_data", linkedHashMap);
        this.toString.getMediationNetwork(r14, this.component2);
        AFe1rSDK<String> AFAdRevenueData = AFAdRevenueData(r14, str, monetizationNetwork);
        if (AFAdRevenueData != null && (aFe1kSDK = AFAdRevenueData.getCurrencyIso4217Code) != null) {
            str2 = aFe1kSDK.getMonetizationNetwork;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(r14);
            AFb1aSDK.getMediationNetwork(toString() + ": preparing data: ", jSONObject);
            AFb1gSDK aFb1gSDK = ((AFf1hSDK) this).component3;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            aFb1gSDK.getCurrencyIso4217Code(str2, jSONObject2);
        }
        return AFAdRevenueData;
    }
}
