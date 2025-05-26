package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFf1eSDK extends AFf1hSDK<Map<String, String>> {
    private final UUID AFInAppEventType;
    public AFa1ySDK component2;
    private final boolean copy;
    private final AFe1sSDK copydefault;
    private String equals;
    private String hashCode;
    private String toString;

    /* loaded from: classes3.dex */
    public interface AFa1ySDK {
        void getCurrencyIso4217Code(String str);

        void getMonetizationNetwork(Map<String, String> map);
    }

    public AFf1eSDK(@NonNull AFd1gSDK aFd1gSDK, @NonNull UUID uuid, @NonNull Uri uri) {
        super(AFf1rSDK.ONELINK, new AFf1rSDK[]{AFf1rSDK.RC_CDN}, aFd1gSDK, uuid.toString());
        this.copydefault = aFd1gSDK.AFAdRevenueData();
        this.AFInAppEventType = uuid;
        boolean z13 = false;
        try {
            if (!AFc1sSDK.getMonetizationNetwork(uri.getHost()) && !AFc1sSDK.getMonetizationNetwork(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1gSDK.registerClient()};
                    Map map = AFa1zSDK.unregisterClient;
                    Object obj = map.get(565895358);
                    if (obj == null) {
                        obj = ((Class) AFa1zSDK.getMediationNetwork(36 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19105))).getDeclaredConstructor(Uri.class, AFc1kSDK.class);
                        map.put(565895358, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = map.get(1873384021);
                        if (obj2 == null) {
                            obj2 = ((Class) AFa1zSDK.getMediationNetwork(37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 235 - View.combineMeasuredStates(0, 0), (char) (19105 - TextUtils.getOffsetBefore("", 0)))).getMethod("AFAdRevenueData", null);
                            map.put(1873384021, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = map.get(-2011021640);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1zSDK.getMediationNetwork(TextUtils.indexOf("", "") + 52, 272 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1))).getMethod("getCurrencyIso4217Code", null);
                                map.put(-2011021640, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = map.get(527069415);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFa1zSDK.getMediationNetwork(51 - TextUtils.indexOf((CharSequence) "", '0', 0), View.MeasureSpec.getSize(0) + RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE, (char) (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("getMediationNetwork", null);
                                    map.put(527069415, obj4);
                                }
                                z13 = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.toString = split[1];
                                    this.hashCode = split[2];
                                    this.equals = uri.toString();
                                }
                            } catch (Throwable th3) {
                                Throwable cause = th3.getCause();
                                if (cause == null) {
                                    throw th3;
                                }
                                throw cause;
                            }
                        } catch (Throwable th4) {
                            Throwable cause2 = th4.getCause();
                            if (cause2 == null) {
                                throw th4;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th5) {
                        Throwable cause3 = th5.getCause();
                        if (cause3 == null) {
                            throw th5;
                        }
                        throw cause3;
                    }
                } catch (Throwable th6) {
                    Throwable cause4 = th6.getCause();
                    if (cause4 == null) {
                        throw th6;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e13) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e13);
        }
        this.copy = z13;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean copy() {
        return false;
    }

    public final boolean copydefault() {
        return this.copy;
    }

    public final boolean equals() {
        return (TextUtils.isEmpty(this.toString) || TextUtils.isEmpty(this.hashCode) || this.toString.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AFe1rSDK<Map<String, String>> getCurrencyIso4217Code(@NonNull String str) {
        return this.copydefault.getRevenue(this.toString, this.hashCode, this.AFInAppEventType, str);
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final void getMediationNetwork() {
        ResponseNetwork responseNetwork;
        super.getMediationNetwork();
        AFa1ySDK aFa1ySDK = this.component2;
        if (aFa1ySDK != null) {
            if (this.AFAdRevenueData == AFf1wSDK.SUCCESS && (responseNetwork = ((AFf1hSDK) this).component1) != null) {
                aFa1ySDK.getMonetizationNetwork((Map) responseNetwork.getBody());
                return;
            }
            Throwable component4 = component4();
            if (!(component4 instanceof ParsingException)) {
                String str = this.equals;
                aFa1ySDK.getCurrencyIso4217Code(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) component4).getRawResponse().isSuccessful()) {
                aFa1ySDK.getCurrencyIso4217Code("Can't parse one link data");
            } else {
                String str2 = this.equals;
                aFa1ySDK.getCurrencyIso4217Code(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }
}
