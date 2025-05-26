package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import xk2.s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0017\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0017\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFf1lSDK;", "Lcom/appsflyer/internal/AFf1oSDK;", "Lcom/appsflyer/internal/AFd1gSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", "p2", "", "", "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "p4", "Lcom/appsflyer/internal/AFj1eSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1gSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1eSDK;)V", "", "", "", "getCurrencyIso4217Code", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFe1rSDK;", "AFAdRevenueData", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFe1rSDK;", "getMonetizationNetwork", "(Ljava/util/Map;)Ljava/lang/String;", "", "(Ljava/lang/String;I)V", "getMediationNetwork", "()V", "hashCode", "Ljava/util/Map;", "toString", "Lcom/appsflyer/internal/AFj1eSDK;", "copy", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "component2", "Lcom/appsflyer/AppsFlyerProperties;", "getRevenue", "copydefault", "Lcom/appsflyer/AFPurchaseDetails;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFf1lSDK extends AFf1oSDK {

    /* renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final AppsFlyerProperties getRevenue;

    /* renamed from: copy, reason: from kotlin metadata */
    private final AppsFlyerInAppPurchaseValidationCallback getMediationNetwork;

    /* renamed from: copydefault, reason: from kotlin metadata */
    @NotNull
    private final AFPurchaseDetails getMonetizationNetwork;

    /* renamed from: hashCode, reason: from kotlin metadata */
    private final Map<String, String> getCurrencyIso4217Code;

    /* renamed from: toString, reason: from kotlin metadata */
    @NotNull
    private final AFj1eSDK AFAdRevenueData;

    public static final class AFa1vSDK extends RuntimeException {
    }

    public /* synthetic */ AFf1lSDK(AFd1gSDK aFd1gSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1eSDK aFj1eSDK, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1gSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i13 & 32) != 0 ? new AFj1fSDK() : aFj1eSDK);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1rSDK<String> AFAdRevenueData(@NotNull Map<String, Object> p03, @NotNull String p13, String p23) {
        Intrinsics.checkNotNullParameter(p03, "");
        Intrinsics.checkNotNullParameter(p13, "");
        return this.areAllFieldsValid.getMediationNetwork(p03, p13);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> p03, String p13) {
        Intrinsics.checkNotNullParameter(p03, "");
        super.getCurrencyIso4217Code(p03, p13);
        List j13 = f0.j(this.getMonetizationNetwork.getPurchaseToken(), this.getMonetizationNetwork.getProductId(), this.getMonetizationNetwork.getPrice(), this.getMonetizationNetwork.getCurrency());
        if (!(j13 instanceof Collection) || !j13.isEmpty()) {
            Iterator it = j13.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1vSDK();
                }
            }
        }
        p03.put("purchase_token", this.getMonetizationNetwork.getPurchaseToken());
        p03.put("product_id", this.getMonetizationNetwork.getProductId());
        p03.put("revenue", this.getMonetizationNetwork.getPrice());
        p03.put("currency", this.getMonetizationNetwork.getCurrency());
        p03.put("purchase_type", this.getMonetizationNetwork.getPurchaseType().getValue());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null && !map.isEmpty()) {
            p03.put("extra_event_values", this.getCurrencyIso4217Code);
        }
        String string = this.getRevenue.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        p03.put("custom_data", (string == null || string.length() == 0) ? z0.d() : AFk1xSDK.getMonetizationNetwork(new JSONObject(string)));
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final void getMediationNetwork() {
        Object m13;
        super.getMediationNetwork();
        Throwable component4 = component4();
        if (component4 != null && !(component4 instanceof AFf1tSDK)) {
            if (component4 instanceof AFf1vSDK) {
                AFAdRevenueData("No dev key", -1);
            } else if (component4 instanceof AFa1vSDK) {
                AFAdRevenueData("One or more of provided arguments is empty", -1);
            } else {
                AFAdRevenueData("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFf1hSDK) this).component1;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMediationNetwork;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(z0.g(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                xk2.q qVar = s.f135225b;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.getMediationNetwork;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFk1xSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                    m13 = Unit.f80348a;
                } else {
                    m13 = null;
                }
            } catch (Throwable th3) {
                xk2.q qVar2 = s.f135225b;
                m13 = ue.c.m(th3);
            }
            if (s.a(m13) != null) {
                AFAdRevenueData("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @NotNull
    public final String getMonetizationNetwork(@NotNull Map<String, Object> p03) {
        Intrinsics.checkNotNullParameter(p03, "");
        return this.AFAdRevenueData.AFAdRevenueData();
    }

    private final void AFAdRevenueData(String p03, int p13) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMediationNetwork;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(z0.g(new Pair("error_code", Integer.valueOf(p13)), new Pair("error_message", p03)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1lSDK(@NotNull AFd1gSDK aFd1gSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1eSDK aFj1eSDK) {
        super(AFf1rSDK.MANUAL_PURCHASE_VALIDATION, new AFf1rSDK[]{AFf1rSDK.RC_CDN, AFf1rSDK.FETCH_ADVERTISING_ID}, aFd1gSDK, null, z0.d());
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1eSDK, "");
        this.getRevenue = appsFlyerProperties;
        this.getMonetizationNetwork = aFPurchaseDetails;
        this.getCurrencyIso4217Code = map;
        this.getMediationNetwork = appsFlyerInAppPurchaseValidationCallback;
        this.AFAdRevenueData = aFj1eSDK;
        this.getMediationNetwork.add(AFf1rSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1lSDK(@NotNull AFd1gSDK aFd1gSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1gSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }
}
