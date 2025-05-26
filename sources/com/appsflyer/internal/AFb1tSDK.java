package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ja.y;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static AppsFlyerInAppPurchaseValidatorListener AFAdRevenueData = null;
    private static long AFInAppEventType = 0;
    private static int AFKeystoreWrapper = 0;
    private static AFb1tSDK component4 = null;
    public static final String getMediationNetwork;
    static final String getMonetizationNetwork;
    public static final String getRevenue;
    private static int valueOf = 1;
    Application areAllFieldsValid;
    private boolean copydefault;

    @NonNull
    private final AFd1iSDK equals;
    private SharedPreferences hashCode;
    private Map<Long, String> toString;
    private AFg1tSDK values;
    public volatile AppsFlyerConversionListener getCurrencyIso4217Code = null;
    private long component2 = -1;
    long component1 = -1;
    private long copy = TimeUnit.SECONDS.toMillis(5);
    boolean component3 = false;

    /* renamed from: com.appsflyer.internal.AFb1tSDK$2 */
    public class AnonymousClass2 implements AFd1wSDK.AFa1ySDK {
        private /* synthetic */ AppsFlyerRequestListener AFAdRevenueData;
        private /* synthetic */ AFh1jSDK getMediationNetwork;

        public AnonymousClass2(AFh1jSDK aFh1jSDK, AppsFlyerRequestListener appsFlyerRequestListener) {
            r2 = aFh1jSDK;
            r3 = appsFlyerRequestListener;
        }

        @Override // com.appsflyer.internal.AFd1wSDK.AFa1ySDK
        public final void getCurrencyIso4217Code(@NonNull AFh1iSDK aFh1iSDK) {
            r2.getMonetizationNetwork();
            AFd1gSDK AFAdRevenueData = AFb1tSDK.this.AFAdRevenueData();
            AFAdRevenueData.component3().AFAdRevenueData(AFb1tSDK.this.getMediationNetwork());
            AFb1tSDK.this.component2();
            int AFAdRevenueData2 = AFAdRevenueData.getMonetizationNetwork().getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0);
            AFLogger.afInfoLog("onBecameForeground");
            if (AFAdRevenueData2 < 2) {
                AFb1tSDK.this.AFAdRevenueData().equals().getCurrencyIso4217Code();
            }
            AFh1cSDK aFh1cSDK = new AFh1cSDK();
            if (aFh1iSDK != null) {
                AFb1tSDK.this.AFAdRevenueData().registerClient().n_(AFc1qSDK.getRevenue(aFh1cSDK), aFh1iSDK.AFAdRevenueData, AFAdRevenueData.AFInAppEventType().getMonetizationNetwork);
            }
            AFb1tSDK aFb1tSDK = AFb1tSDK.this;
            aFh1cSDK.getMonetizationNetwork = r3;
            aFb1tSDK.getMonetizationNetwork(aFh1cSDK, aFh1iSDK);
            AFb1tSDK.this.AFAdRevenueData().getCurrencyIso4217Code().getMonetizationNetwork();
            AFb1tSDK.this.AFAdRevenueData().getCurrencyIso4217Code().AFAdRevenueData.getRevenue("didSendRevenueTriggerOnLastBackground", false);
        }

        @Override // com.appsflyer.internal.AFd1wSDK.AFa1ySDK
        public final void getMediationNetwork() {
            Context context = AFb1tSDK.this.AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
            AFLogger.afInfoLog("onBecameBackground");
            AFh1jSDK aFh1jSDK = r2;
            long currentTimeMillis = System.currentTimeMillis();
            long j13 = aFh1jSDK.component3;
            if (j13 != 0) {
                long j14 = currentTimeMillis - j13;
                if (j14 > 0 && j14 < 1000) {
                    j14 = 1000;
                }
                long seconds = TimeUnit.MILLISECONDS.toSeconds(j14);
                aFh1jSDK.hashCode = seconds;
                aFh1jSDK.getCurrencyIso4217Code.getMonetizationNetwork("prev_session_dur", seconds);
            } else {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
            }
            AFLogger.afInfoLog("callStatsBackground background call");
            AFb1tSDK.this.AFAdRevenueData().afErrorLog().getMediationNetwork();
            AFb1gSDK copydefault = AFb1tSDK.this.AFAdRevenueData().copydefault();
            if (copydefault.component2()) {
                copydefault.getRevenue();
                if (context != null && !AppsFlyerLib.getInstance().isStopped()) {
                    copydefault.k_(context.getPackageName(), context.getPackageManager());
                }
                copydefault.getMediationNetwork();
            } else {
                AFLogger.afDebugLog("RD status is OFF");
            }
            AFb1tSDK.this.AFAdRevenueData().equals().getMediationNetwork();
            AFb1tSDK.this.AFAdRevenueData().afDebugLog().getMonetizationNetwork();
            AFb1tSDK.this.AFAdRevenueData().getCurrencyIso4217Code().getMonetizationNetwork();
        }
    }

    /* renamed from: com.appsflyer.internal.AFb1tSDK$3 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFAdRevenueData = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFAdRevenueData[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class AFa1tSDK implements Runnable {
        private final AFa1rSDK getMediationNetwork;

        public AFa1tSDK(AFa1rSDK aFa1rSDK) {
            this.getMediationNetwork = aFa1rSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1tSDK aFb1tSDK = AFb1tSDK.this;
            AFb1tSDK.getMonetizationNetwork(new Object[]{aFb1tSDK, this.getMediationNetwork}, 843550116, -843550105, System.identityHashCode(aFb1tSDK));
        }
    }

    public class AFa1ySDK implements AFf1ySDK {
        public AFa1ySDK() {
        }

        private boolean getMediationNetwork() {
            return AFb1tSDK.this.getCurrencyIso4217Code != null;
        }

        @Override // com.appsflyer.internal.AFf1ySDK
        public final void AFAdRevenueData(AFe1aSDK<?> aFe1aSDK) {
        }

        @Override // com.appsflyer.internal.AFf1ySDK
        public final void getMonetizationNetwork(AFe1aSDK<?> aFe1aSDK) {
            if (aFe1aSDK instanceof AFg1ySDK) {
                AFb1tSDK.this.AFAdRevenueData().component4().getMediationNetwork(((AFg1xSDK) aFe1aSDK).component2.component2);
            }
        }

        @Override // com.appsflyer.internal.AFf1ySDK
        public final void AFAdRevenueData(AFe1aSDK<?> aFe1aSDK, AFf1wSDK aFf1wSDK) {
            JSONObject currencyIso4217Code;
            AFg1hSDK monetizationNetwork;
            if (!(aFe1aSDK instanceof AFg1xSDK)) {
                if (!(aFe1aSDK instanceof AFh1uSDK) || aFf1wSDK == AFf1wSDK.SUCCESS) {
                    return;
                }
                AFh1xSDK aFh1xSDK = new AFh1xSDK(AFb1tSDK.this.AFAdRevenueData());
                AFf1uSDK copy = AFb1tSDK.this.AFAdRevenueData().copy();
                copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(aFh1xSDK));
                return;
            }
            AFg1xSDK aFg1xSDK = (AFg1xSDK) aFe1aSDK;
            boolean z13 = aFe1aSDK instanceof AFg1ySDK;
            if (z13 && getMediationNetwork()) {
                AFg1ySDK aFg1ySDK = (AFg1ySDK) aFe1aSDK;
                if (aFg1ySDK.AFAdRevenueData == AFf1wSDK.SUCCESS || aFg1ySDK.getCurrencyIso4217Code == 1) {
                    AFh1uSDK aFh1uSDK = new AFh1uSDK(aFg1ySDK, AFb1tSDK.this.AFAdRevenueData().component2());
                    AFf1uSDK copy2 = AFb1tSDK.this.AFAdRevenueData().copy();
                    copy2.getCurrencyIso4217Code.execute(copy2.new AnonymousClass3(aFh1uSDK));
                }
            }
            if (aFf1wSDK == AFf1wSDK.SUCCESS) {
                AFb1tSDK aFb1tSDK = AFb1tSDK.this;
                aFb1tSDK.AFAdRevenueData(aFb1tSDK.areAllFieldsValid).getMonetizationNetwork("sentSuccessfully", "true");
                if (!(aFe1aSDK instanceof AFf1aSDK) && (monetizationNetwork = new AFg1eSDK(AFb1tSDK.this.areAllFieldsValid).getMonetizationNetwork()) != null && monetizationNetwork.AFAdRevenueData()) {
                    String str = monetizationNetwork.getCurrencyIso4217Code;
                    AFLogger.INSTANCE.d(AFh1sSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFg1eSDK.getRevenue(str);
                }
                ResponseNetwork responseNetwork = ((AFf1hSDK) aFg1xSDK).component1;
                if (responseNetwork != null && (currencyIso4217Code = AFc1uSDK.getCurrencyIso4217Code((String) responseNetwork.getBody())) != null) {
                    AFb1tSDK.this.component3 = currencyIso4217Code.optBoolean("send_background", false);
                }
                if (z13) {
                    AFb1tSDK.this.component1 = System.currentTimeMillis();
                }
            }
        }
    }

    static {
        areAllFieldsValid();
        getMonetizationNetwork = "334";
        getMediationNetwork = "6.16";
        StringBuilder sb3 = new StringBuilder();
        sb3.append("6.16");
        sb3.append("/androidevent?buildnumber=6.16.0&app_id=");
        getRevenue = sb3.toString();
        AFAdRevenueData = null;
        component4 = new AFb1tSDK();
        int i13 = AFKeystoreWrapper + 19;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public AFb1tSDK() {
        AFVersionDeclaration.init();
        this.equals = new AFd1iSDK();
        AFAdRevenueData().afInfoLog().getCurrencyIso4217Code();
        AFAdRevenueData().afInfoLog().getMediationNetwork();
        AFf1uSDK copy = AFAdRevenueData().copy();
        copy.getMonetizationNetwork.add(new AFa1ySDK());
    }

    private static /* synthetic */ Object AFInAppEventParameterName(Object[] objArr) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objArr[0];
        long longValue = ((Number) objArr[1]).longValue();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(longValue));
        int i13 = valueOf + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return format;
        }
        throw null;
    }

    private static /* synthetic */ Object AFInAppEventType(Object[] objArr) {
        AFa1rSDK aFa1rSDK = (AFa1rSDK) objArr[0];
        AFh1iSDK aFh1iSDK = (AFh1iSDK) objArr[1];
        int i13 = AFKeystoreWrapper + 65;
        int i14 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        valueOf = i14;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (aFh1iSDK != null) {
            aFa1rSDK.getRevenue = aFh1iSDK.getMonetizationNetwork;
            aFa1rSDK.areAllFieldsValid = aFh1iSDK.getCurrencyIso4217Code;
        }
        int i15 = i14 + 47;
        AFKeystoreWrapper = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 != 0) {
            int i16 = 1 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        int intValue = ((Number) objArr[1]).intValue();
        AFKeystoreWrapper = (valueOf + 15) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        aFb1tSDK.copy = TimeUnit.SECONDS.toMillis(intValue);
        int i13 = valueOf + 31;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        valueOf = (AFKeystoreWrapper + 23) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFLogger.INSTANCE.w(AFh1sSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i13 = AFKeystoreWrapper + 61;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 98 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        r8 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005c, code lost:
    
        com.appsflyer.internal.AFb1tSDK.AFAdRevenueData = r8;
        com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = (com.appsflyer.internal.AFb1tSDK.valueOf + 13) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0066, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r8 = com.appsflyer.internal.AFb1tSDK.valueOf + com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
        com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r8 % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if ((r8 % 2) == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object areAllFieldsValid(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            com.appsflyer.internal.AFb1tSDK r1 = (com.appsflyer.internal.AFb1tSDK) r1
            r2 = 1
            r3 = r8[r2]
            android.content.Context r3 = (android.content.Context) r3
            r3 = 2
            r8 = r8[r3]
            com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r8 = (com.appsflyer.AppsFlyerInAppPurchaseValidatorListener) r8
            int r4 = com.appsflyer.internal.AFb1tSDK.valueOf
            int r4 = r4 + 27
            int r5 = r4 % 128
            com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r5
            int r4 = r4 % r3
            java.lang.String r5 = "registerValidatorListener called"
            java.lang.String r6 = "registerValidatorListener"
            r7 = 0
            if (r4 == 0) goto L32
            com.appsflyer.internal.AFd1gSDK r1 = r1.AFAdRevenueData()
            com.appsflyer.internal.AFb1gSDK r1 = r1.copydefault()
            java.lang.String[] r2 = new java.lang.String[r2]
            r1.getRevenue(r6, r2)
            com.appsflyer.AFLogger.afDebugLog(r5)
            if (r8 != 0) goto L5c
            goto L44
        L32:
            com.appsflyer.internal.AFd1gSDK r1 = r1.AFAdRevenueData()
            com.appsflyer.internal.AFb1gSDK r1 = r1.copydefault()
            java.lang.String[] r2 = new java.lang.String[r0]
            r1.getRevenue(r6, r2)
            com.appsflyer.AFLogger.afDebugLog(r5)
            if (r8 != 0) goto L5c
        L44:
            int r8 = com.appsflyer.internal.AFb1tSDK.valueOf
            int r8 = r8 + 115
            int r1 = r8 % 128
            com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r1
            int r8 = r8 % r3
            java.lang.String r1 = "registerValidatorListener null listener"
            if (r8 == 0) goto L58
            com.appsflyer.AFLogger.afDebugLog(r1)
            r8 = 86
            int r8 = r8 / r0
            return r7
        L58:
            com.appsflyer.AFLogger.afDebugLog(r1)
            return r7
        L5c:
            com.appsflyer.internal.AFb1tSDK.AFAdRevenueData = r8
            int r8 = com.appsflyer.internal.AFb1tSDK.valueOf
            int r8 = r8 + 13
            int r8 = r8 % 128
            com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.areAllFieldsValid(java.lang.Object[]):java.lang.Object");
    }

    private void component1() {
        valueOf = (AFKeystoreWrapper + 85) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().getMediationNetwork().execute(new c(this, 0));
        valueOf = (AFKeystoreWrapper + 17) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i13 = AFKeystoreWrapper + 27;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            aFb1tSDK.start(context, null);
            return null;
        }
        aFb1tSDK.start(context, null);
        throw null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i13 = AFKeystoreWrapper + 81;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            aFb1tSDK.AFAdRevenueData().registerClient().getRevenue.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = aFb1tSDK.AFAdRevenueData().registerClient().getRevenue;
        if (!list.contains(asList)) {
            list.add(asList);
        }
        int i14 = valueOf + 23;
        AFKeystoreWrapper = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private boolean component4() {
        String sb3;
        String sb4;
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (this.component2 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.component2;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String str = (String) getMonetizationNetwork(new Object[]{simpleDateFormat, Long.valueOf(this.component2)}, -1853371894, 1853371912, (int) System.currentTimeMillis());
            String str2 = (String) getMonetizationNetwork(new Object[]{simpleDateFormat, Long.valueOf(this.component1)}, -1853371894, 1853371912, (int) System.currentTimeMillis());
            if (currentTimeMillis < this.copy && !isStopped()) {
                int i13 = AFKeystoreWrapper + 41;
                valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 == 0) {
                    Object[] objArr = {str2, str};
                    objArr[5] = Long.valueOf(currentTimeMillis);
                    objArr[3] = Long.valueOf(this.copy);
                    sb4 = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr);
                } else {
                    long j13 = this.copy;
                    StringBuilder w13 = a.a.w("Last Launch attempt: ", str, ";\nLast successful Launch event: ", str2, ";\nThis launch is blocked: ");
                    w13.append(currentTimeMillis);
                    w13.append(" ms < ");
                    w13.append(j13);
                    w13.append(" ms");
                    sb4 = w13.toString();
                }
                AFLogger.afInfoLog(sb4);
                return true;
            }
            if (!isStopped()) {
                int i14 = valueOf + 91;
                AFKeystoreWrapper = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i14 % 2 != 0) {
                    Object[] objArr2 = {str, str2};
                    objArr2[3] = Long.valueOf(currentTimeMillis);
                    sb3 = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", objArr2);
                } else {
                    StringBuilder w14 = a.a.w("Last Launch attempt: ", str, ";\nLast successful Launch event: ", str2, ";\nSending launch (+");
                    w14.append(currentTimeMillis);
                    w14.append(" ms)");
                    sb3 = w14.toString();
                }
                AFLogger.afInfoLog(sb3);
            }
        } else if (!isStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return false;
    }

    public /* synthetic */ void copy() {
        AFKeystoreWrapper = (valueOf + 99) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            final AFi1eSDK v13 = AFAdRevenueData().v();
            if (v13 == null || !v13.getMediationNetwork()) {
                return;
            }
            valueOf = (AFKeystoreWrapper + 83) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            v13.getMonetizationNetwork(new AFj1ySDK() { // from class: com.appsflyer.internal.e
                @Override // com.appsflyer.internal.AFj1ySDK
                public final void onRequestFinished() {
                    AFb1tSDK.this.AFAdRevenueData(v13);
                }
            });
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("could not init PIA token", th3);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th3)));
        }
    }

    public /* synthetic */ void copydefault() {
        getMonetizationNetwork(new Object[]{this, new AFh1fSDK()}, 843550116, -843550105, System.identityHashCode(this));
        int i13 = valueOf + 95;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        boolean z13 = false;
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        AFa1rSDK aFa1rSDK = (AFa1rSDK) objArr[1];
        Context context = aFb1tSDK.AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
        AFd1pSDK AFAdRevenueData2 = aFb1tSDK.AFAdRevenueData(context);
        AFg1gSDK component1 = aFb1tSDK.AFAdRevenueData().component1();
        boolean revenue = aFb1tSDK.AFAdRevenueData().AFKeystoreWrapper().getRevenue();
        boolean mediationNetwork = aFa1rSDK.getMediationNetwork();
        Map<String, Object> map = aFa1rSDK.getCurrencyIso4217Code;
        long time = new Date().getTime();
        Object[] objArr2 = new Object[1];
        a("\ue5f7ﴛ퐟꼣虓饬灱䮈⊺ִ᳕\uf7ff", Color.red(0) + 6379, objArr2);
        map.put(((String) objArr2[0]).intern(), Long.toString(time));
        try {
            if (revenue) {
                AFLogger.INSTANCE.i(AFh1sSDK.GENERAL, "SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1sSDK aFh1sSDK = AFh1sSDK.GENERAL;
                StringBuilder sb3 = new StringBuilder("******* sendTrackingWithEvent: ");
                sb3.append(mediationNetwork ? "Launch" : aFa1rSDK.component4);
                aFLogger.i(aFh1sSDK, sb3.toString(), true);
            }
            component4(context);
            int revenue2 = getRevenue(AFAdRevenueData2, mediationNetwork);
            if (aFa1rSDK.component4 != null) {
                AFKeystoreWrapper = (valueOf + 99) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                z13 = true;
            }
            int mediationNetwork2 = getMediationNetwork(AFAdRevenueData2, z13);
            if (mediationNetwork && revenue2 == 1) {
                AFKeystoreWrapper = (valueOf + 97) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
            }
            component1.getMediationNetwork(map, revenue2, mediationNetwork2);
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.GENERAL, "Error while preparing to send event", th3, true, true, true);
        }
        valueOf = (AFKeystoreWrapper + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return map;
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i13, int i14, int i15) {
        PurchaseHandler areAllFieldsValid;
        int i16 = (i14 * (-667)) + (i13 * (-1335));
        int i17 = ~i14;
        int i18 = i13 | i15;
        switch (((i17 | i18) * 668) + ((i13 | (~(i15 | i17))) * 1336) + (((~i18) | i17) * (-668)) + i16) {
            case 1:
                return getRevenue(objArr);
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                return AFAdRevenueData(objArr);
            case 4:
                return getMediationNetwork(objArr);
            case 5:
                return component1(objArr);
            case 6:
                return areAllFieldsValid(objArr);
            case 7:
                return component4(objArr);
            case 8:
                return component3(objArr);
            case 9:
                return component2(objArr);
            case 10:
                return copy(objArr);
            case 11:
                return hashCode(objArr);
            case 12:
                return equals(objArr);
            case 13:
                return copydefault(objArr);
            case 14:
                return toString(objArr);
            case 15:
                return valueOf(objArr);
            case 16:
                return AFInAppEventType(objArr);
            case 17:
                return values(objArr);
            case 18:
                return AFInAppEventParameterName(objArr);
            case 19:
                return AFKeystoreWrapper(objArr);
            case 20:
                AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
                Context context = (Context) objArr[1];
                Map<String, Object> map = (Map) objArr[2];
                PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
                int i19 = AFKeystoreWrapper + 85;
                valueOf = i19 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i19 % 2 == 0) {
                    aFb1tSDK.getCurrencyIso4217Code(context);
                    areAllFieldsValid = aFb1tSDK.AFAdRevenueData().areAllFieldsValid();
                    if (!areAllFieldsValid.AFAdRevenueData(map, purchaseValidationCallback, "purchases")) {
                        return null;
                    }
                } else {
                    aFb1tSDK.getCurrencyIso4217Code(context);
                    areAllFieldsValid = aFb1tSDK.AFAdRevenueData().areAllFieldsValid();
                    if (!areAllFieldsValid.AFAdRevenueData(map, purchaseValidationCallback, "purchases")) {
                        return null;
                    }
                }
                AFf1iSDK aFf1iSDK = new AFf1iSDK(map, purchaseValidationCallback, areAllFieldsValid.getMonetizationNetwork);
                AFf1uSDK aFf1uSDK = areAllFieldsValid.AFAdRevenueData;
                aFf1uSDK.getCurrencyIso4217Code.execute(aFf1uSDK.new AnonymousClass3(aFf1iSDK));
                valueOf = (AFKeystoreWrapper + 43) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return null;
            case 21:
                AFb1tSDK aFb1tSDK2 = (AFb1tSDK) objArr[0];
                String str = (String) objArr[1];
                valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                aFb1tSDK2.AFAdRevenueData().copydefault().getRevenue("setCurrencyCode", str);
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
                valueOf = (AFKeystoreWrapper + 1) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return null;
            case 22:
                AFb1tSDK aFb1tSDK3 = (AFb1tSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                String str2 = (String) objArr[2];
                AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                aFb1tSDK3.start(context2, str2, null);
                valueOf = (AFKeystoreWrapper + 27) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return null;
            case 23:
                return AFLogger(objArr);
            default:
                return getCurrencyIso4217Code(objArr);
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        int i13 = AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            AFc1kSDK registerClient = aFb1tSDK.AFAdRevenueData().registerClient();
            registerClient.getMediationNetwork = str;
            registerClient.getCurrencyIso4217Code = map;
            return null;
        }
        AFc1kSDK registerClient2 = aFb1tSDK.AFAdRevenueData().registerClient();
        registerClient2.getMediationNetwork = str;
        registerClient2.getCurrencyIso4217Code = map;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    public static synchronized SharedPreferences h_(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFb1tSDK.class) {
            try {
                valueOf = (AFKeystoreWrapper + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (getCurrencyIso4217Code().hashCode == null) {
                    int i13 = valueOf + 15;
                    AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    StrictMode.ThreadPolicy threadPolicy = i13 % 2;
                    try {
                        if (threadPolicy != 0) {
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            getCurrencyIso4217Code().hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 1);
                            threadPolicy = allowThreadDiskReads;
                        } else {
                            StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                            getCurrencyIso4217Code().hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                            threadPolicy = allowThreadDiskReads2;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                }
                sharedPreferences = getCurrencyIso4217Code().hashCode;
                AFKeystoreWrapper = (valueOf + 11) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cb, code lost:
    
        if (r10 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
    
        if (r9 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
    
        r8 = r7.getCurrencyIso4217Code.getMonetizationNetwork(com.appsflyer.internal.AFj1bSDK.AFAdRevenueData);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dc, code lost:
    
        if (r8 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
    
        if (r7.getRevenue.getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0) >= 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        r8 = r7.getCurrencyIso4217Code.getMonetizationNetwork(com.appsflyer.internal.AFj1bSDK.getMediationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        r8 = r7.getCurrencyIso4217Code.getMonetizationNetwork(com.appsflyer.internal.AFj1bSDK.areAllFieldsValid);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        r8 = r7.getCurrencyIso4217Code.getMonetizationNetwork(com.appsflyer.internal.AFj1bSDK.component3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cf, code lost:
    
        if ((!r10) != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object hashCode(java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.hashCode(java.lang.Object[]):java.lang.Object");
    }

    public /* synthetic */ void i_(Context context, Intent intent) {
        Uri uri;
        boolean z13;
        getCurrencyIso4217Code(context);
        AFc1kSDK registerClient = AFAdRevenueData().registerClient();
        AFd1pSDK component2 = AFAdRevenueData().component2();
        if (intent != null) {
            valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                uri = intent.getData();
                AFKeystoreWrapper = (valueOf + 3) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (uri != null || uri.toString().isEmpty()) {
                    z13 = false;
                } else {
                    AFKeystoreWrapper = (valueOf + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    z13 = true;
                }
                if (component2.getMediationNetwork("ddl_sent", false) || !(!z13)) {
                    registerClient.n_(AFc1qSDK.getMediationNetwork(registerClient.areAllFieldsValid.afDebugLog()), intent, context);
                } else {
                    registerClient.getRevenue("No direct deep link", null);
                    return;
                }
            }
        }
        uri = null;
        if (uri != null) {
        }
        z13 = false;
        if (component2.getMediationNetwork("ddl_sent", false)) {
        }
        registerClient.n_(AFc1qSDK.getMediationNetwork(registerClient.areAllFieldsValid.afDebugLog()), intent, context);
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        aFb1tSDK.AFAdRevenueData().copydefault().getRevenue("registerConversionListener", new String[0]);
        aFb1tSDK.getMonetizationNetwork(appsFlyerConversionListener);
        int i13 = AFKeystoreWrapper + 95;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object valueOf(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        valueOf = (AFKeystoreWrapper + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        aFb1tSDK.AFAdRevenueData().copydefault().getRevenue("setCollectIMEI", String.valueOf(booleanValue));
        getRevenue(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(booleanValue));
        getRevenue(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(booleanValue));
        int i13 = AFKeystoreWrapper + 41;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        Map<String, Object> map = (Map) objArr[3];
        AFh1dSDK aFh1dSDK = new AFh1dSDK();
        aFh1dSDK.component4 = str;
        aFh1dSDK.AFAdRevenueData = map;
        aFb1tSDK.getMonetizationNetwork(aFh1dSDK, aFb1tSDK.component1(context));
        int i13 = valueOf + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final AFd1gSDK AFAdRevenueData() {
        int i13 = valueOf + 33;
        int i14 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFKeystoreWrapper = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        AFd1iSDK aFd1iSDK = this.equals;
        int i15 = i14 + 39;
        valueOf = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 == 0) {
            int i16 = 9 / 0;
        }
        return aFd1iSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        getMonetizationNetwork(new Object[]{this, strArr}, 188197694, -188197686, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z13) {
        valueOf = (AFKeystoreWrapper + 63) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().copydefault().getRevenue("anonymizeUser", String.valueOf(z13));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z13);
        valueOf = (AFKeystoreWrapper + 35) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        getMonetizationNetwork(new Object[]{this, str, map}, -1528789097, 1528789098, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z13) {
        valueOf = (AFKeystoreWrapper + 21) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().unregisterClient().getMediationNetwork(z13);
        int i13 = AFKeystoreWrapper + 85;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 36 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z13) {
        valueOf = (AFKeystoreWrapper + 11) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        getRevenue(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z13));
        AFKeystoreWrapper = (valueOf + 67) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    public final void g_(Context context, Intent intent) {
        AFj1cSDK aFj1cSDK = new AFj1cSDK(intent);
        if (aFj1cSDK.getMonetizationNetwork("appsflyer_preinstall") != null) {
            int i13 = valueOf + 65;
            AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                getRevenue(aFj1cSDK.getMonetizationNetwork("appsflyer_preinstall"));
                throw null;
            }
            getRevenue(aFj1cSDK.getMonetizationNetwork("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String monetizationNetwork = aFj1cSDK.getMonetizationNetwork("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(monetizationNetwork)));
        if (monetizationNetwork != null) {
            AFKeystoreWrapper = (valueOf + 27) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            AFAdRevenueData(context).getMonetizationNetwork("referrer", monetizationNetwork);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", monetizationNetwork);
            appsFlyerProperties.getMonetizationNetwork = monetizationNetwork;
            if (!AppsFlyerProperties.getInstance().getRevenue()) {
                return;
            }
            AFLogger.afInfoLog("onReceive: isLaunchCalled");
            getMonetizationNetwork(context, AFh1mSDK.onReceive);
            AFAdRevenueData(monetizationNetwork);
            valueOf = (AFKeystoreWrapper + 89) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        getCurrencyIso4217Code(r4);
        r4 = AFAdRevenueData().getMonetizationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        return com.appsflyer.internal.AFb1iSDK.getMediationNetwork(r4.getRevenue, r4.getCurrencyIso4217Code);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = (com.appsflyer.internal.AFb1tSDK.valueOf + 69) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        return null;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getAppsFlyerUID(@androidx.annotation.NonNull android.content.Context r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper
            int r0 = r0 + 117
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1tSDK.valueOf = r1
            int r0 = r0 % 2
            java.lang.String r1 = "getAppsFlyerUID"
            if (r0 != 0) goto L1f
            com.appsflyer.internal.AFd1gSDK r0 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFb1gSDK r0 = r0.copydefault()
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.getRevenue(r1, r2)
            if (r4 != 0) goto L39
            goto L2f
        L1f:
            com.appsflyer.internal.AFd1gSDK r0 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFb1gSDK r0 = r0.copydefault()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.getRevenue(r1, r2)
            if (r4 != 0) goto L39
        L2f:
            int r4 = com.appsflyer.internal.AFb1tSDK.valueOf
            int r4 = r4 + 69
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r4
            r4 = 0
            return r4
        L39:
            r3.getCurrencyIso4217Code(r4)
            com.appsflyer.internal.AFd1gSDK r4 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFd1nSDK r4 = r4.getMonetizationNetwork()
            com.appsflyer.internal.AFd1oSDK r0 = r4.getRevenue
            com.appsflyer.internal.AFd1pSDK r4 = r4.getCurrencyIso4217Code
            java.lang.String r4 = com.appsflyer.internal.AFb1iSDK.getMediationNetwork(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        valueOf = (AFKeystoreWrapper + 1) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        getCurrencyIso4217Code(context);
        String currencyIso4217Code = AFAdRevenueData().getMonetizationNetwork().getCurrencyIso4217Code(context);
        AFKeystoreWrapper = (valueOf + 71) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return currencyIso4217Code;
    }

    public final void getCurrencyIso4217Code(@NonNull Context context) {
        AFd1iSDK aFd1iSDK = this.equals;
        if (context != null) {
            AFd1oSDK aFd1oSDK = aFd1iSDK.getRevenue;
            if (context != null) {
                AFKeystoreWrapper = (valueOf + 97) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                aFd1oSDK.getMonetizationNetwork = context.getApplicationContext();
                valueOf = (AFKeystoreWrapper + 49) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        AFKeystoreWrapper = (valueOf + 63) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String monetizationNetwork = AFAdRevenueData().values().getMonetizationNetwork();
        AFKeystoreWrapper = (valueOf + 15) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i13 = AFKeystoreWrapper + 27;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return AFAdRevenueData().values().getMediationNetwork();
        }
        int i14 = 64 / 0;
        return AFAdRevenueData().values().getMediationNetwork();
    }

    public final synchronized AFg1tSDK getMediationNetwork() {
        try {
            if (this.values == null) {
                int i13 = (valueOf + 49) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                AFKeystoreWrapper = i13;
                this.values = new d(this);
                valueOf = (i13 + 41) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.values;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        String currencyIso4217Code = getCurrencyIso4217Code(context, "AF_STORE");
        if (currencyIso4217Code == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i13 = valueOf;
        int i14 = i13 + 35;
        AFKeystoreWrapper = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            throw null;
        }
        int i15 = i13 + 73;
        AFKeystoreWrapper = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 == 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i13 = AFKeystoreWrapper + 91;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            AFAdRevenueData().copydefault().getRevenue("getSdkVersion", new String[1]);
        } else {
            AFAdRevenueData().copydefault().getRevenue("getSdkVersion", new String[0]);
        }
        return AFd1nSDK.component2();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        if (this.copydefault) {
            return this;
        }
        this.copydefault = true;
        AFAdRevenueData().AFKeystoreWrapper().getRevenue(str);
        if (context != null) {
            AFKeystoreWrapper = (valueOf + 35) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            getCurrencyIso4217Code(context);
            Application f_ = AFb1qSDK.f_(context);
            if (f_ == null) {
                return this;
            }
            this.areAllFieldsValid = f_;
            AFAdRevenueData().valueOf().getCurrencyIso4217Code();
            AFAdRevenueData().component4().getMediationNetwork = System.currentTimeMillis();
            AFf1uSDK copy = AFAdRevenueData().copy();
            copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(new AFf1kSDK(AFAdRevenueData())));
            AFi1lSDK e13 = AFAdRevenueData().e();
            e13.AFAdRevenueData = Build.VERSION.SDK_INT >= 31 ? new AFi1iSDK(e13.getMonetizationNetwork) : new AFi1nSDK(e13.getMonetizationNetwork);
            AFAdRevenueData().afErrorLog().getMonetizationNetwork(new d(this));
            AFAdRevenueData().component3().AFAdRevenueData(getMediationNetwork());
            AFj1lSDK AFInAppEventParameterName = AFAdRevenueData().AFInAppEventParameterName();
            c cVar = new c(this, 1);
            AFj1vSDK revenue = AFInAppEventParameterName.getRevenue(cVar);
            Runnable revenue2 = AFInAppEventParameterName.getRevenue(revenue, cVar);
            AFInAppEventParameterName.getCurrencyIso4217Code(revenue);
            AFInAppEventParameterName.getCurrencyIso4217Code(new AFj1kSDK(AFInAppEventParameterName.AFAdRevenueData.getMonetizationNetwork(), revenue2));
            AFInAppEventParameterName.getCurrencyIso4217Code(new AFj1qSDK(revenue2, AFInAppEventParameterName.AFAdRevenueData, new AFj1tSDK()));
            AFInAppEventParameterName.getCurrencyIso4217Code(new AFj1gSDK(revenue2, AFInAppEventParameterName.AFAdRevenueData));
            AFInAppEventParameterName.getCurrencyIso4217Code(new AFj1oSDK(AFInAppEventParameterName.AFAdRevenueData.getMediationNetwork(), AFInAppEventParameterName.AFAdRevenueData.getMonetizationNetwork(), revenue2));
            AFInAppEventParameterName.getMediationNetwork(revenue2);
            if (!AFInAppEventParameterName.getMonetizationNetwork()) {
                Context context2 = AFInAppEventParameterName.AFAdRevenueData.AFInAppEventType().getMonetizationNetwork;
                AFd1gSDK aFd1gSDK = AFInAppEventParameterName.AFAdRevenueData;
                List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        int i13 = AFKeystoreWrapper + 19;
                        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                        if (i13 % 2 == 0) {
                            ProviderInfo providerInfo = it.next().providerInfo;
                            throw null;
                        }
                        ProviderInfo providerInfo2 = it.next().providerInfo;
                        if (providerInfo2 != null) {
                            arrayList.add(new AFj1nSDK(providerInfo2, revenue2, aFd1gSDK));
                        } else {
                            AFLogger.INSTANCE.w(AFh1sSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                            AFKeystoreWrapper = (valueOf + 69) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AFInAppEventParameterName.getMonetizationNetwork.addAll(arrayList);
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1sSDK aFh1sSDK = AFh1sSDK.PREINSTALL;
                        StringBuilder sb3 = new StringBuilder("Detected ");
                        sb3.append(arrayList.size());
                        sb3.append(" valid preinstall provider(s)");
                        aFLogger.d(aFh1sSDK, sb3.toString());
                    }
                }
            }
            AFj1mSDK[] AFAdRevenueData2 = AFInAppEventParameterName.AFAdRevenueData();
            int length = AFAdRevenueData2.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = AFKeystoreWrapper + 7;
                valueOf = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i15 % 2 == 0) {
                    AFAdRevenueData2[i14].getMonetizationNetwork(AFInAppEventParameterName.AFAdRevenueData.AFInAppEventType().getMonetizationNetwork);
                    i14 += 5;
                } else {
                    AFAdRevenueData2[i14].getMonetizationNetwork(AFInAppEventParameterName.AFAdRevenueData.AFInAppEventType().getMonetizationNetwork);
                    i14++;
                }
                AFKeystoreWrapper = (valueOf + 53) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
            component1();
            AFAdRevenueData().AFKeystoreWrapper().getMonetizationNetwork(AFAdRevenueData().getMonetizationNetwork());
            if (!(!AFAdRevenueData().afVerboseLog().getCurrencyIso4217Code())) {
                AFAdRevenueData().afVerboseLog().getRevenue();
            }
        } else {
            AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFb1gSDK copydefault = AFAdRevenueData().copydefault();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = appsFlyerConversionListener == null ? "null" : "conversionDataListener";
        copydefault.getRevenue("init", strArr);
        AFLogger.INSTANCE.force(AFh1sSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.16.0." + getMonetizationNetwork + ")");
        this.getCurrencyIso4217Code = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        boolean monetizationNetwork;
        int i13 = AFKeystoreWrapper + 43;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            getCurrencyIso4217Code(context);
            AFAdRevenueData().getMonetizationNetwork();
            monetizationNetwork = AFd1nSDK.getMonetizationNetwork(context);
            int i14 = 23 / 0;
        } else {
            getCurrencyIso4217Code(context);
            AFAdRevenueData().getMonetizationNetwork();
            monetizationNetwork = AFd1nSDK.getMonetizationNetwork(context);
        }
        int i15 = valueOf + 79;
        AFKeystoreWrapper = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 != 0) {
            int i16 = 26 / 0;
        }
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i13 = AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            AFAdRevenueData().AFKeystoreWrapper().getRevenue();
            throw null;
        }
        boolean revenue = AFAdRevenueData().AFKeystoreWrapper().getRevenue();
        valueOf = (AFKeystoreWrapper + 15) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return revenue;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        if (!this.copydefault) {
            int i13 = AFKeystoreWrapper + 47;
            valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                getMonetizationNetwork("logAdRevenue");
                return;
            } else {
                getMonetizationNetwork("logAdRevenue");
                throw null;
            }
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            int i14 = valueOf + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE;
            AFKeystoreWrapper = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 == 0) {
                AFLogger.INSTANCE.w(AFh1sSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                return;
            } else {
                AFLogger.INSTANCE.w(AFh1sSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                int i15 = 38 / 0;
                return;
            }
        }
        if (!AFAdRevenueData().AFKeystoreWrapper().getRevenue()) {
            AFg1qSDK AFKeystoreWrapper2 = AFAdRevenueData().AFKeystoreWrapper();
            if (!AFc1sSDK.getMonetizationNetwork((String) AFg1qSDK.AFAdRevenueData(new Object[]{AFKeystoreWrapper2}, 1235496603, -1235496602, System.identityHashCode(AFKeystoreWrapper2)))) {
                AFAdRevenueData(new AFh1gSDK(aFAdRevenueData, map));
                return;
            } else {
                getMonetizationNetwork(new Object[0], 1146581046, -1146581023, (int) System.currentTimeMillis());
                valueOf = (AFKeystoreWrapper + 65) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return;
            }
        }
        int i16 = valueOf + 73;
        AFKeystoreWrapper = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i16 % 2 == 0) {
            AFLogger.INSTANCE.w(AFh1sSDK.AD_REVENUE, "SDK is stopped");
        } else {
            AFLogger.INSTANCE.w(AFh1sSDK.AD_REVENUE, "SDK is stopped");
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i13 = AFKeystoreWrapper + 19;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            logEvent(context, str, map, null);
        } else {
            logEvent(context, str, map, null);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d2, double d13) {
        AFAdRevenueData().copydefault().getRevenue("logLocation", String.valueOf(d2), String.valueOf(d13));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d13));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        getMonetizationNetwork(new Object[]{this, context, AFInAppEventType.LOCATION_COORDINATES, hashMap}, -1336967761, 1336967778, System.identityHashCode(this));
        int i13 = AFKeystoreWrapper + 61;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().copydefault().getRevenue("logSession", new String[0]);
        AFAdRevenueData().copydefault().AFAdRevenueData();
        getMonetizationNetwork(context, AFh1mSDK.logSession);
        getMonetizationNetwork(new Object[]{this, context, null, null}, -1336967761, 1336967778, System.identityHashCode(this));
        int i13 = AFKeystoreWrapper + 31;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 99 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i13 = AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            AFAdRevenueData().w().getCurrencyIso4217Code();
            throw null;
        }
        AFAdRevenueData().w().getCurrencyIso4217Code();
        int i14 = AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
        valueOf = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 == 0) {
            int i15 = 5 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        getMonetizationNetwork(new Object[]{this, context, uri}, -1057038766, 1057038768, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        valueOf = (AFKeystoreWrapper + 29) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (intent == null) {
            AFAdRevenueData().registerClient().getRevenue("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        } else {
            if (context == null) {
                AFAdRevenueData().registerClient().getRevenue("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            }
            Context applicationContext = context.getApplicationContext();
            getCurrencyIso4217Code(applicationContext);
            AFAdRevenueData().getMediationNetwork().execute(new y(this, applicationContext, intent, 3));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        getMonetizationNetwork(new Object[]{this, context, appsFlyerConversionListener}, 772614809, -772614795, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        getMonetizationNetwork(new Object[]{this, context, appsFlyerInAppPurchaseValidatorListener}, 44309630, -44309624, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        getMonetizationNetwork(new Object[]{this, context, map, purchaseValidationCallback}, 2073491148, -2073491128, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFKeystoreWrapper = (valueOf + 7) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        getCurrencyIso4217Code(context);
        PurchaseHandler areAllFieldsValid = AFAdRevenueData().areAllFieldsValid();
        if (areAllFieldsValid.AFAdRevenueData(map, purchaseValidationCallback, "subscriptions")) {
            AFf1pSDK aFf1pSDK = new AFf1pSDK(map, purchaseValidationCallback, areAllFieldsValid.getMonetizationNetwork);
            AFf1uSDK aFf1uSDK = areAllFieldsValid.AFAdRevenueData;
            aFf1uSDK.getCurrencyIso4217Code.execute(aFf1uSDK.new AnonymousClass3(aFf1pSDK));
            AFKeystoreWrapper = (valueOf + 19) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0081  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendPushNotificationData(android.app.Activity r18) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (map != null) {
            AFAdRevenueData().copydefault().getRevenue("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            valueOf = (AFKeystoreWrapper + 25) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        AFKeystoreWrapper = (valueOf + 7) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i13 = valueOf + 85;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            AFAdRevenueData().copydefault().getRevenue("setAndroidIdData", str);
        } else {
            AFAdRevenueData().copydefault().getRevenue("setAndroidIdData", str);
        }
        AFAdRevenueData().i().getMediationNetwork = str;
        AFKeystoreWrapper = (valueOf + 67) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        AFKeystoreWrapper = (valueOf + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().copydefault().getRevenue("setAppId", str);
        getRevenue(AppsFlyerProperties.APP_ID, str);
        valueOf = (AFKeystoreWrapper + 49) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        if (r7.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005a, code lost:
    
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_VERSION);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
        com.appsflyer.internal.AFb1tSDK.valueOf = (com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper + 73) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAppInviteOneLink(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFb1tSDK.valueOf
            int r0 = r0 + 83
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            java.lang.String r1 = "oneLinkSlug"
            java.lang.String r2 = "setAppInviteOneLink = "
            java.lang.String r3 = "setAppInviteOneLink"
            if (r0 == 0) goto L30
            com.appsflyer.internal.AFd1gSDK r0 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFb1gSDK r0 = r0.copydefault()
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]
            r5[r4] = r7
            r0.getRevenue(r3, r5)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r7 == 0) goto L5a
            goto L4c
        L30:
            com.appsflyer.internal.AFd1gSDK r0 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFb1gSDK r0 = r0.copydefault()
            java.lang.String[] r4 = new java.lang.String[]{r7}
            r0.getRevenue(r3, r4)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r7 == 0) goto L5a
        L4c:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L7d
        L5a:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkDomain"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkVersion"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkScheme"
            r0.remove(r2)
            int r0 = com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper
            int r0 = r0 + 73
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1tSDK.valueOf = r0
        L7d:
            getRevenue(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z13) {
        valueOf = (AFKeystoreWrapper + 77) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().copydefault().getRevenue("setCollectAndroidID", String.valueOf(z13));
        getRevenue(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z13));
        getRevenue(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z13));
        int i13 = AFKeystoreWrapper + 5;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z13) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z13)}, -1025818898, 1025818913, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z13) {
        int i13 = AFKeystoreWrapper + 71;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            AFb1gSDK copydefault = AFAdRevenueData().copydefault();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z13);
            copydefault.getRevenue("setCollectOaid", strArr);
        } else {
            AFAdRevenueData().copydefault().getRevenue("setCollectOaid", String.valueOf(z13));
        }
        getRevenue(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z13));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        AFKeystoreWrapper = (valueOf + 7) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Objects.requireNonNull(appsFlyerConsent);
        AFAdRevenueData().i().component4 = appsFlyerConsent;
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        getMonetizationNetwork(new Object[]{this, str}, 820981433, -820981412, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            valueOf = (AFKeystoreWrapper + 61) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (!getMonetizationNetwork()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb3 = new StringBuilder("CustomerUserId set: ");
            sb3.append(str);
            sb3.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb3.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
            getMonetizationNetwork(context, AFh1mSDK.setCustomerIdAndLogSession);
            AFg1qSDK AFKeystoreWrapper2 = AFAdRevenueData().AFKeystoreWrapper();
            if (referrer == null) {
                int i13 = AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
                valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 == 0) {
                    throw null;
                }
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            AFAdRevenueData(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        valueOf = (AFKeystoreWrapper + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().copydefault().getRevenue("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getRevenue(AppsFlyerProperties.APP_USER_ID, str);
        getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        AFKeystoreWrapper = (valueOf + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z13) {
        AFLogger.LogLevel logLevel;
        if (!(!z13)) {
            valueOf = (AFKeystoreWrapper + 15) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            logLevel = AFLogger.LogLevel.DEBUG;
            valueOf = (AFKeystoreWrapper + 71) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z13) {
        boolean z14;
        valueOf = (AFKeystoreWrapper + 97) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z13)));
        if (!z13) {
            AFKeystoreWrapper = (valueOf + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            z14 = true;
        } else {
            z14 = false;
        }
        AFb1vSDK.getRevenue = Boolean.valueOf(z14);
        AFd1gSDK AFAdRevenueData2 = AFAdRevenueData();
        AFAdRevenueData2.i().areAllFieldsValid = z13;
        if (z13) {
            AFAdRevenueData2.i().component1 = null;
            return;
        }
        AFf1uSDK copy = AFAdRevenueData2.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(new AFf1kSDK(AFAdRevenueData())));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z13) {
        int i13 = AFKeystoreWrapper + 89;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z13)));
            getRevenue(AppsFlyerProperties.DISABLE_NETWORK_DATA, z13);
        } else {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z13)));
            getRevenue(AppsFlyerProperties.DISABLE_NETWORK_DATA, z13);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i13 = valueOf + 21;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            AFb1gSDK copydefault = AFAdRevenueData().copydefault();
            String[] strArr = new String[0];
            strArr[0] = str;
            copydefault.getRevenue("setExtension", strArr);
        } else {
            AFAdRevenueData().copydefault().getRevenue("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        com.appsflyer.internal.AFe1eSDK.getMediationNetwork(new com.appsflyer.internal.AFe1fSDK(r3, r4.trim()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r3 = r3.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
        r3 = com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper + 97;
        com.appsflyer.internal.AFb1tSDK.valueOf = r3 % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if ((r3 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getRevenue(r4) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if ((!com.appsflyer.internal.AFc1sSDK.getRevenue(r4)) != true) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        r0 = com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper + 71;
        com.appsflyer.internal.AFb1tSDK.valueOf = r0 % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if ((r0 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        r0 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        r3 = "";
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setHost(java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1tSDK.valueOf = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L19
            boolean r0 = com.appsflyer.internal.AFc1sSDK.getRevenue(r4)
            r1 = 25
            int r1 = r1 / 0
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == r1) goto L1f
            goto L48
        L19:
            boolean r0 = com.appsflyer.internal.AFc1sSDK.getRevenue(r4)
            if (r0 != 0) goto L48
        L1f:
            int r0 = com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1tSDK.valueOf = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L32
            r0 = 20
            int r0 = r0 / 0
            if (r3 == 0) goto L39
            goto L34
        L32:
            if (r3 == 0) goto L39
        L34:
            java.lang.String r3 = r3.trim()
            goto L3b
        L39:
            java.lang.String r3 = ""
        L3b:
            com.appsflyer.internal.AFe1fSDK r0 = new com.appsflyer.internal.AFe1fSDK
            java.lang.String r4 = r4.trim()
            r0.<init>(r3, r4)
            com.appsflyer.internal.AFe1eSDK.getMediationNetwork(r0)
            return
        L48:
            java.lang.String r3 = "hostname was empty or null - call for setHost is skipped"
            com.appsflyer.AFLogger.afWarnLog(r3)
            int r3 = com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper
            int r3 = r3 + 97
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1tSDK.valueOf = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L5a
            return
        L5a:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.setHost(java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i13 = AFKeystoreWrapper + 27;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            AFAdRevenueData().copydefault().getRevenue("setImeiData", str);
        } else {
            AFAdRevenueData().copydefault().getRevenue("setImeiData", str);
        }
        AFAdRevenueData().AFKeystoreWrapper().getCurrencyIso4217Code(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z13) {
        valueOf = (AFKeystoreWrapper + 59) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().copydefault().getRevenue("setIsUpdate", String.valueOf(z13));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z13);
        AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z13;
        int i13 = valueOf + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            logLevel.getLevel();
            AFLogger.LogLevel.NONE.getLevel();
            throw null;
        }
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            z13 = true;
        } else {
            z13 = false;
        }
        AFAdRevenueData().copydefault().getRevenue("log", String.valueOf(z13));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z13) {
            AFAdRevenueData().afInfoLog().component3();
        } else {
            AFAdRevenueData().afInfoLog().getMediationNetwork();
            AFKeystoreWrapper = (valueOf + 21) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i13) {
        getMonetizationNetwork(new Object[]{this, Integer.valueOf(i13)}, 1121740394, -1121740375, i13);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i13 = AFKeystoreWrapper + 29;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            AFAdRevenueData().copydefault().getRevenue("setOaidData", str);
        } else {
            AFAdRevenueData().copydefault().getRevenue("setOaidData", str);
        }
        AFb1vSDK.AFAdRevenueData = str;
        AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        valueOf = (AFKeystoreWrapper + 95) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFLogger.afDebugLog("setOneLinkCustomDomain " + Arrays.toString(strArr));
        AFAdRevenueData().registerClient().component3 = strArr;
        AFKeystoreWrapper = (valueOf + 59) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        valueOf = (AFKeystoreWrapper + 67) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            AFKeystoreWrapper = (valueOf + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i13 = valueOf + 43;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        String concat;
        AFd1lSDK i13 = AFAdRevenueData().i();
        if (i13.getRevenue == null) {
            i13.getRevenue = new AFc1bSDK();
        }
        AFc1bSDK aFc1bSDK = i13.getRevenue;
        if (str != null) {
            AFKeystoreWrapper = (valueOf + 59) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (!str.isEmpty()) {
                if (map != null) {
                    int i14 = AFKeystoreWrapper + 19;
                    valueOf = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (i14 % 2 == 0) {
                        map.isEmpty();
                        throw null;
                    }
                    if (!map.isEmpty()) {
                        StringBuilder sb3 = new StringBuilder("Setting partner data for ");
                        sb3.append(str);
                        sb3.append(": ");
                        sb3.append(map);
                        AFLogger.afDebugLog(sb3.toString());
                        int length = new JSONObject(map).toString().length();
                        if (length <= 1000) {
                            aFc1bSDK.getRevenue.put(str, map);
                            aFc1bSDK.getMonetizationNetwork.remove(str);
                            return;
                        } else {
                            AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                            HashMap hashMap = new HashMap();
                            hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                            aFc1bSDK.getMonetizationNetwork.put(str, hashMap);
                            return;
                        }
                    }
                }
                if (aFc1bSDK.getRevenue.remove(str) == null) {
                    AFKeystoreWrapper = (valueOf + 3) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    concat = "Partner data is missing or `null`";
                } else {
                    concat = "Cleared partner data for ".concat(str);
                }
                AFLogger.afWarnLog(concat);
                return;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        AFKeystoreWrapper = (valueOf + 33) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().i().AFAdRevenueData = AFb1mSDK.AFAdRevenueData(str);
        int i13 = AFKeystoreWrapper + 79;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        getMonetizationNetwork(new Object[]{this, pluginInfo}, -1606949527, 1606949532, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
                valueOf = (AFKeystoreWrapper + 81) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            } catch (JSONException e13) {
                AFLogger.afErrorLog(e13.getMessage(), e13);
            }
        }
        if (str2 != null) {
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            int i13 = AFKeystoreWrapper + 77;
            valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                jSONObject.put("af_siteid", str3);
                throw null;
            }
            jSONObject.put("af_siteid", str3);
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            AFKeystoreWrapper = (valueOf + 3) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return;
        }
        int i14 = valueOf + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN;
        AFKeystoreWrapper = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 == 0) {
            getRevenue("preInstallName", jSONObject.toString());
        } else {
            getRevenue("preInstallName", jSONObject.toString());
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFc1kSDK registerClient = AFAdRevenueData().registerClient();
        registerClient.component4.clear();
        registerClient.component4.addAll(Arrays.asList(strArr));
        int i13 = valueOf + 5;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        getMonetizationNetwork(new Object[]{this, strArr}, 145645751, -145645751, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        AFKeystoreWrapper = (valueOf + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        setSharingFilterForPartners("all");
        int i13 = AFKeystoreWrapper + 31;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        AFAdRevenueData().i().getCurrencyIso4217Code = new AFc1cSDK(strArr);
        int i13 = AFKeystoreWrapper + 37;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        AFKeystoreWrapper = (valueOf + 35) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().copydefault().getRevenue("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i13 = AFKeystoreWrapper + 29;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 83 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        getMonetizationNetwork(new Object[]{this, context, str, appsFlyerRequestListener}, 317612961, -317612948, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z13, Context context) {
        getCurrencyIso4217Code(context);
        AFd1gSDK AFAdRevenueData2 = AFAdRevenueData();
        AFAdRevenueData2.AFKeystoreWrapper().getRevenue(z13);
        AFAdRevenueData2.getMediationNetwork().submit(new com.airbnb.lottie.k(AFAdRevenueData2, 3));
        if (!z13) {
            return;
        }
        AFKeystoreWrapper = (valueOf + 67) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData2.component2().getRevenue("is_stop_tracking_used", true);
        AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i13 = AFKeystoreWrapper + 75;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        valueOf = (AFKeystoreWrapper + 79) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().copydefault().getRevenue("unregisterConversionListener", new String[0]);
        this.getCurrencyIso4217Code = null;
        int i13 = AFKeystoreWrapper + 31;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 66 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getCurrencyIso4217Code(context);
        AFg1eSDK aFg1eSDK = new AFg1eSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFh1sSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFh1sSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1hSDK monetizationNetwork = aFg1eSDK.getMonetizationNetwork();
        if (monetizationNetwork == null || !str.equals(monetizationNetwork.getCurrencyIso4217Code)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z13 = monetizationNetwork == null || currentTimeMillis - monetizationNetwork.AFAdRevenueData > TimeUnit.SECONDS.toMillis(2L);
            AFg1hSDK aFg1hSDK = new AFg1hSDK(str, currentTimeMillis, !z13);
            aFg1eSDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken", aFg1hSDK.getCurrencyIso4217Code);
            aFg1eSDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken_received_time", aFg1hSDK.AFAdRevenueData);
            aFg1eSDK.AFAdRevenueData.getRevenue("afUninstallToken_queued", aFg1hSDK.AFAdRevenueData());
            if (z13) {
                AFg1eSDK.getRevenue(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r16 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r1 = r13.getApplicationContext();
        r0 = AFAdRevenueData().AFKeystoreWrapper();
        new java.lang.Thread(new com.appsflyer.internal.AFa1bSDK(r1, (java.lang.String) com.appsflyer.internal.AFg1qSDK.AFAdRevenueData(new java.lang.Object[]{r0}, 1235496603, -1235496602, java.lang.System.identityHashCode(r0)), AFAdRevenueData().getMonetizationNetwork(), r14, r15, r16, r17, r18, r19)).start();
        com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = (com.appsflyer.internal.AFb1tSDK.valueOf + 81) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r16 == null) goto L50;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void validateAndLogInAppPurchase(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
            r12 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            com.appsflyer.internal.AFd1gSDK r0 = r12.AFAdRevenueData()
            com.appsflyer.internal.AFb1gSDK r0 = r0.copydefault()
            r1 = 6
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r14
            r3 = 1
            r1[r3] = r15
            r3 = 2
            r1[r3] = r6
            r4 = 3
            r1[r4] = r7
            r5 = 4
            r1[r5] = r8
            if (r19 != 0) goto L25
            java.lang.String r5 = ""
            goto L29
        L25:
            java.lang.String r5 = r19.toString()
        L29:
            r9 = 5
            r1[r9] = r5
            java.lang.String r5 = "validateAndTrackInAppPurchase"
            r0.getRevenue(r5, r1)
            boolean r0 = r12.isStopped()
            if (r0 != 0) goto L4d
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r1 = com.appsflyer.internal.AFh1sSDK.PURCHASE_VALIDATION
            java.lang.String r5 = "Validate in app called with parameters: "
            java.lang.String r9 = " "
            java.lang.StringBuilder r5 = a.a.w(r5, r6, r9, r7, r9)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r0.i(r1, r5)
        L4d:
            if (r14 == 0) goto Lb8
            if (r7 == 0) goto Lb8
            int r0 = com.appsflyer.internal.AFb1tSDK.valueOf
            int r0 = r0 + 75
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r0
            if (r15 == 0) goto Lb8
            if (r8 == 0) goto Lb8
            int r0 = r0 + r4
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1tSDK.valueOf = r1
            int r0 = r0 % r3
            if (r0 != 0) goto L6b
            r0 = 76
            int r0 = r0 / r2
            if (r6 != 0) goto L6e
            goto Lb8
        L6b:
            if (r6 != 0) goto L6e
            goto Lb8
        L6e:
            java.lang.Thread r10 = new java.lang.Thread
            com.appsflyer.internal.AFa1bSDK r11 = new com.appsflyer.internal.AFa1bSDK
            android.content.Context r1 = r13.getApplicationContext()
            com.appsflyer.internal.AFd1gSDK r0 = r12.AFAdRevenueData()
            com.appsflyer.internal.AFg1qSDK r0 = r0.AFKeystoreWrapper()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            int r0 = java.lang.System.identityHashCode(r0)
            r3 = 1235496603(0x49a42e9b, float:1344979.4)
            r4 = -1235496602(0xffffffffb65bd166, float:-3.275543E-6)
            java.lang.Object r0 = com.appsflyer.internal.AFg1qSDK.AFAdRevenueData(r2, r3, r4, r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            com.appsflyer.internal.AFd1gSDK r0 = r12.AFAdRevenueData()
            com.appsflyer.internal.AFd1nSDK r3 = r0.getMonetizationNetwork()
            r0 = r11
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.<init>(r11)
            r10.start()
            int r0 = com.appsflyer.internal.AFb1tSDK.valueOf
            int r0 = r0 + 81
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r0
            goto Lc1
        Lb8:
            com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r0 = com.appsflyer.internal.AFb1tSDK.AFAdRevenueData
            if (r0 == 0) goto Lc1
            java.lang.String r1 = "Please provide purchase parameters"
            r0.onValidateInAppFailure(r1)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.validateAndLogInAppPurchase(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z13) {
        int i13 = AFKeystoreWrapper + 35;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z13)), true);
        getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z13);
        valueOf = (AFKeystoreWrapper + 29) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        String str;
        JSONObject jSONObject = (JSONObject) objArr[0];
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        AFKeystoreWrapper = (valueOf + 79) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        while (keys.hasNext()) {
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                int i13 = 0;
                while (i13 < jSONArray.length()) {
                    int i14 = valueOf + 51;
                    AFKeystoreWrapper = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (i14 % 2 != 0) {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i13)));
                        i13 += 48;
                    } else {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i13)));
                        i13++;
                    }
                }
            } catch (JSONException e13) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e13);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (!(!keys2.hasNext()) && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i15 = 0;
                    while (i15 < jSONArray2.length()) {
                        AFKeystoreWrapper = (valueOf + 77) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                        if (jSONArray2.getLong(i15) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i15) != ((Long) arrayList.get(1)).longValue()) {
                            valueOf = (AFKeystoreWrapper + 29) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                            if (jSONArray2.getLong(i15) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i15++;
                            str = next;
                        }
                    }
                } catch (JSONException e14) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e14);
                }
            }
        }
        if (str != null) {
            int i16 = AFKeystoreWrapper + 75;
            valueOf = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i16 % 2 == 0) {
                jSONObject.remove(str);
                int i17 = 37 / 0;
            } else {
                jSONObject.remove(str);
            }
        }
        return null;
    }

    private static void a(String str, int i13, Object[] objArr) {
        int i14;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        aFk1oSDK.getMonetizationNetwork = i13;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1oSDK.AFAdRevenueData = 0;
        $11 = ($10 + 1) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        while (true) {
            int i15 = aFk1oSDK.AFAdRevenueData;
            if (i15 >= cArr2.length) {
                break;
            }
            int i16 = $10 + 31;
            $11 = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i16 % 2 == 0) {
                jArr[i15] = (cArr2[i15] % (i15 & aFk1oSDK.getMonetizationNetwork)) % (AFInAppEventType ^ (-4329747452237546172L));
                i14 = i15 << 1;
            } else {
                jArr[i15] = (AFInAppEventType ^ (-4329747452237546172L)) ^ (cArr2[i15] ^ (i15 * aFk1oSDK.getMonetizationNetwork));
                i14 = i15 + 1;
            }
            aFk1oSDK.AFAdRevenueData = i14;
        }
        char[] cArr3 = new char[length];
        aFk1oSDK.AFAdRevenueData = 0;
        while (true) {
            int i17 = aFk1oSDK.AFAdRevenueData;
            if (i17 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            } else {
                cArr3[i17] = (char) jArr[i17];
                aFk1oSDK.AFAdRevenueData = i17 + 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r5 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r15 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r15.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r5 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object copydefault(java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.copydefault(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        getMonetizationNetwork(new Object[]{this, context, str}, -1510668691, 1510668713, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        getMonetizationNetwork(new Object[]{this, context}, -167507899, 167507908, System.identityHashCode(this));
    }

    private AFh1iSDK component1(Context context) {
        int i13 = AFKeystoreWrapper + 91;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            boolean z13 = context instanceof Activity;
            throw null;
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        AFh1iSDK aFh1iSDK = new AFh1iSDK((Activity) context, AFAdRevenueData().d());
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return aFh1iSDK;
    }

    public final void component2() {
        AFKeystoreWrapper = (valueOf + 21) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (AFf1jSDK.component2()) {
            int i13 = valueOf + 31;
            AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                throw null;
            }
            return;
        }
        AFd1gSDK AFAdRevenueData2 = AFAdRevenueData();
        AFf1uSDK copy = AFAdRevenueData2.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(new AFf1jSDK(AFAdRevenueData2)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        getCurrencyIso4217Code(context);
        AFh1dSDK aFh1dSDK = new AFh1dSDK();
        aFh1dSDK.component4 = str;
        aFh1dSDK.getMonetizationNetwork = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFh1sSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1dSDK.getMonetizationNetwork(singletonMap);
        }
        aFh1dSDK.AFAdRevenueData = hashMap;
        AFb1gSDK copydefault = AFAdRevenueData().copydefault();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = aFh1dSDK.AFAdRevenueData;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        copydefault.getRevenue("logEvent", strArr);
        if (str == null) {
            getMonetizationNetwork(context, AFh1mSDK.logEvent);
        }
        getMonetizationNetwork(aFh1dSDK, component1(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j13) {
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFAdRevenueData().registerClient().getMonetizationNetwork = deepLinkListener;
        AFAdRevenueData().registerClient().component1 = j13;
        AFKeystoreWrapper = (valueOf + 15) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    public /* synthetic */ void getMediationNetwork(AFg1sSDK aFg1sSDK) {
        AFKeystoreWrapper = (valueOf + 65) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFd1gSDK AFAdRevenueData2 = AFAdRevenueData();
        if (aFg1sSDK == AFg1sSDK.SUCCESS) {
            AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            AFAdRevenueData2.afErrorLog().getCurrencyIso4217Code();
            valueOf = (AFKeystoreWrapper + 7) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if (!AFAdRevenueData2.copydefault().getMonetizationNetwork()) {
            AFAdRevenueData2.afInfoLog().AFAdRevenueData();
        } else {
            AFAdRevenueData2.afInfoLog().getCurrencyIso4217Code();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFAdRevenueData().copydefault().getRevenue("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        valueOf = (AFKeystoreWrapper + 33) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String str = null;
        for (String str2 : strArr) {
            AFKeystoreWrapper = (valueOf + 81) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (AnonymousClass3.AFAdRevenueData[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1mSDK.AFAdRevenueData(str2));
                AFKeystoreWrapper = (valueOf + 35) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    public static AFb1tSDK getCurrencyIso4217Code() {
        int i13 = (valueOf + 67) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFKeystoreWrapper = i13;
        AFb1tSDK aFb1tSDK = component4;
        int i14 = i13 + 45;
        valueOf = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            return aFb1tSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i13 = AFKeystoreWrapper + 97;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            aFb1tSDK.setSharingFilterForPartners(strArr);
            int i14 = 11 / 0;
        } else {
            aFb1tSDK.setSharingFilterForPartners(strArr);
        }
        valueOf = (AFKeystoreWrapper + 55) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return null;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) objArr[1];
        Map map = (Map) objArr[2];
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = (AppsFlyerInAppPurchaseValidationCallback) objArr[3];
        AFf1uSDK copy = aFb1tSDK.equals.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(new AFf1lSDK(aFb1tSDK.equals, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i13 = valueOf + 35;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            int i14 = 17 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        PluginInfo pluginInfo = (PluginInfo) objArr[1];
        int i13 = valueOf + 1;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            Objects.requireNonNull(pluginInfo);
            aFb1tSDK.AFAdRevenueData().AFLogger().getRevenue(pluginInfo);
            return null;
        }
        Objects.requireNonNull(pluginInfo);
        aFb1tSDK.AFAdRevenueData().AFLogger().getRevenue(pluginInfo);
        throw null;
    }

    public static /* synthetic */ void getRevenue(AFd1gSDK aFd1gSDK) {
        int i13 = valueOf + 17;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        aFd1gSDK.valueOf().AFAdRevenueData();
        if (i14 != 0) {
            throw null;
        }
        int i15 = valueOf + 15;
        AFKeystoreWrapper = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 != 0) {
            int i16 = 68 / 0;
        }
    }

    @NonNull
    private AFj1mSDK[] component3() {
        return (AFj1mSDK[]) getMonetizationNetwork(new Object[]{this}, 255284286, -255284279, System.identityHashCode(this));
    }

    private static void getRevenue(String str, String str2) {
        AFKeystoreWrapper = (valueOf + 55) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AppsFlyerProperties.getInstance().set(str, str2);
        AFKeystoreWrapper = (valueOf + 1) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    public static void areAllFieldsValid() {
        AFInAppEventType = 7953878577804122322L;
    }

    private static String getCurrencyIso4217Code(String str) {
        int i13 = valueOf + 51;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            AppsFlyerProperties.getInstance().getString(str);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i14 = AFKeystoreWrapper + 21;
        valueOf = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static Map<String, Object> getCurrencyIso4217Code(Map<String, Object> map) {
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (map.containsKey("meta")) {
            Map<String, Object> map2 = (Map) map.get("meta");
            valueOf = (AFKeystoreWrapper + 85) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return map2;
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        AFKeystoreWrapper = (valueOf + 83) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return hashMap;
    }

    private static void getRevenue(String str, boolean z13) {
        int i13 = AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, z13);
            int i14 = 73 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, z13);
        }
    }

    public final void getMediationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String currencyIso4217Code = AFAdRevenueData(context).getCurrencyIso4217Code("extraReferrers", null);
            if (currencyIso4217Code == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(currencyIso4217Code);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                    AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                int i13 = valueOf + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
                AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 != 0) {
                    jSONArray2.put(currentTimeMillis);
                    int i14 = 55 / 0;
                } else {
                    jSONArray2.put(currentTimeMillis);
                }
            }
            if (jSONObject.length() >= 4) {
                AFKeystoreWrapper = (valueOf + 71) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                getMonetizationNetwork(new Object[]{jSONObject}, 178678429, -178678426, (int) System.currentTimeMillis());
            }
            jSONObject.put(str, jSONArray2.toString());
            AFAdRevenueData(context).getMonetizationNetwork("extraReferrers", jSONObject.toString());
        } catch (JSONException e13) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e13);
        } catch (Throwable th3) {
            StringBuilder sb3 = new StringBuilder("Couldn't save referrer - ");
            sb3.append(str);
            sb3.append(": ");
            AFLogger.afErrorLog(sb3.toString(), th3);
        }
    }

    public /* synthetic */ void getRevenue(boolean z13) {
        int i13 = (valueOf + 79) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFKeystoreWrapper = i13;
        if (!z13) {
            AFAdRevenueData().afInfoLog().getMonetizationNetwork();
            int i14 = AFKeystoreWrapper + 5;
            valueOf = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i15 = i13 + 11;
        valueOf = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 != 0) {
            AFAdRevenueData().afInfoLog().getRevenue();
        } else {
            AFAdRevenueData().afInfoLog().getRevenue();
            int i16 = 69 / 0;
        }
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        Intent intent;
        String str = null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        valueOf = (AFKeystoreWrapper + 47) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            String string = extras.getString("af");
            if (string != null) {
                int i13 = AFKeystoreWrapper + 15;
                valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                try {
                    if (i13 % 2 != 0) {
                        AFLogger.INSTANCE.w(AFh1sSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                    } else {
                        AFLogger.INSTANCE.w(AFh1sSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                        throw null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = string;
                    AFLogger.INSTANCE.e(AFh1sSDK.ENGAGEMENT, th.getMessage(), th);
                    return str;
                }
            }
            return string;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String getRevenue() {
        AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String currencyIso4217Code = getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID);
        valueOf = (AFKeystoreWrapper + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return currencyIso4217Code;
    }

    private void getRevenue(Map<String, Object> map) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i13 = valueOf + 61;
            AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                if (map.get("advertiserId") != null) {
                    AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    try {
                        if (AFc1sSDK.getMonetizationNetwork(AFAdRevenueData().i().getMediationNetwork) && map.remove("android_id") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                            valueOf = (AFKeystoreWrapper + 91) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                        }
                        if (AFc1sSDK.getMonetizationNetwork(AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork())) {
                            valueOf = (AFKeystoreWrapper + 7) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                            if (map.remove("imei") != null) {
                                int i14 = AFKeystoreWrapper + 59;
                                valueOf = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                                if (i14 % 2 == 0) {
                                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                                    int i15 = 54 / 0;
                                    return;
                                } else {
                                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Exception e13) {
                        AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e13);
                        return;
                    }
                }
                return;
            }
        }
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        URI uri = (URI) objArr[2];
        int i13 = valueOf + 5;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (uri == null || uri.toString().isEmpty()) {
            AFc1kSDK registerClient = aFb1tSDK.AFAdRevenueData().registerClient();
            StringBuilder sb3 = new StringBuilder("Link is \"");
            sb3.append(uri);
            sb3.append("\"");
            registerClient.getRevenue(sb3.toString(), DeepLinkResult.Error.NETWORK);
            return null;
        }
        if (context == null) {
            AFc1kSDK registerClient2 = aFb1tSDK.AFAdRevenueData().registerClient();
            StringBuilder sb4 = new StringBuilder("Context is \"");
            sb4.append(context);
            sb4.append("\"");
            registerClient2.getRevenue(sb4.toString(), DeepLinkResult.Error.NETWORK);
            int i14 = valueOf + 75;
            AFKeystoreWrapper = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 == 0) {
                return null;
            }
            throw null;
        }
        aFb1tSDK.getCurrencyIso4217Code(context);
        aFb1tSDK.AFAdRevenueData().registerClient().o_(AFc1qSDK.getMediationNetwork(aFb1tSDK.AFAdRevenueData().afDebugLog()), Uri.parse(uri.toString()));
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        getMonetizationNetwork(new Object[]{this, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback}, -556535889, 556535899, System.identityHashCode(this));
    }

    private static void equals() {
        getMonetizationNetwork(new Object[0], 1146581046, -1146581023, (int) System.currentTimeMillis());
    }

    public /* synthetic */ void AFAdRevenueData(AFi1eSDK aFi1eSDK) {
        AFf1fSDK aFf1fSDK = new AFf1fSDK(aFi1eSDK, AFAdRevenueData().getMonetizationNetwork(), AFAdRevenueData());
        AFf1uSDK copy = AFAdRevenueData().copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(aFf1fSDK));
        int i13 = valueOf + 15;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private String getCurrencyIso4217Code(Context context, String str) {
        int i13 = AFKeystoreWrapper + 17;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (context == null) {
            return null;
        }
        getCurrencyIso4217Code(context);
        String revenue = AFAdRevenueData().getMonetizationNetwork().getRevenue(str);
        valueOf = (AFKeystoreWrapper + 19) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return revenue;
    }

    private void AFAdRevenueData(Context context, String str) {
        AFh1cSDK aFh1cSDK = new AFh1cSDK();
        getCurrencyIso4217Code(context);
        aFh1cSDK.component4 = null;
        aFh1cSDK.AFAdRevenueData = null;
        aFh1cSDK.component3 = str;
        aFh1cSDK.getRevenue = null;
        AFAdRevenueData(aFh1cSDK);
        AFKeystoreWrapper = (valueOf + 63) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r0.getRevenue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r0.getRevenue() != true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        com.appsflyer.internal.AFb1tSDK.valueOf = (com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper + 89) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        r0.getMonetizationNetwork.put("api_name", r5.toString());
        r0.getCurrencyIso4217Code(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getMonetizationNetwork(android.content.Context r4, com.appsflyer.internal.AFh1mSDK r5) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1tSDK.valueOf
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L27
            r3.getCurrencyIso4217Code(r4)
            com.appsflyer.internal.AFd1gSDK r0 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFh1jSDK r0 = r0.component4()
            com.appsflyer.internal.AFh1nSDK r4 = com.appsflyer.internal.AFa1qSDK.getCurrencyIso4217Code(r4)
            boolean r1 = r0.getRevenue()
            r2 = 75
            int r2 = r2 / 0
            r2 = 1
            if (r1 == r2) goto L3c
            goto L52
        L27:
            r3.getCurrencyIso4217Code(r4)
            com.appsflyer.internal.AFd1gSDK r0 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFh1jSDK r0 = r0.component4()
            com.appsflyer.internal.AFh1nSDK r4 = com.appsflyer.internal.AFa1qSDK.getCurrencyIso4217Code(r4)
            boolean r1 = r0.getRevenue()
            if (r1 == 0) goto L52
        L3c:
            int r1 = com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper
            int r1 = r1 + 89
            int r1 = r1 % 128
            com.appsflyer.internal.AFb1tSDK.valueOf = r1
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.getMonetizationNetwork
            java.lang.String r2 = "api_name"
            java.lang.String r5 = r5.toString()
            r1.put(r2, r5)
            r0.getCurrencyIso4217Code(r4)
        L52:
            r0.getMonetizationNetwork()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.getMonetizationNetwork(android.content.Context, com.appsflyer.internal.AFh1mSDK):void");
    }

    public static String getCurrencyIso4217Code(AFd1pSDK aFd1pSDK, String str) {
        valueOf = (AFKeystoreWrapper + 85) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String currencyIso4217Code = aFd1pSDK.getCurrencyIso4217Code("CACHED_CHANNEL", null);
        if (currencyIso4217Code != null) {
            int i13 = valueOf + 47;
            AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                int i14 = 37 / 0;
            }
            return currencyIso4217Code;
        }
        aFd1pSDK.getMonetizationNetwork("CACHED_CHANNEL", str);
        return str;
    }

    private static boolean getMediationNetwork(String str) {
        int i13 = valueOf + 93;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        boolean z13 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        valueOf = (AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return z13;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        if (!(!getMediationNetwork(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID))) {
            AFKeystoreWrapper = (valueOf + 31) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (getRevenue() == null) {
                int i13 = AFKeystoreWrapper + 81;
                valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
        }
        return Boolean.FALSE;
    }

    @SuppressLint({"DiscouragedApi"})
    private static void getMediationNetwork(Context context) {
        int i13 = AFKeystoreWrapper + 99;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            if (i13 % 2 == 0) {
                if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) == 0) {
                    return;
                }
            } else if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) == 0) {
                return;
            }
            if (Build.VERSION.SDK_INT < 31) {
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFh1sSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    return;
                } else {
                    AFLogger.INSTANCE.w(AFh1sSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    return;
                }
            }
            valueOf = (AFKeystoreWrapper + 39) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) != 0) {
                AFLogger.INSTANCE.i(AFh1sSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
            } else {
                AFLogger.INSTANCE.w(AFh1sSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.GENERAL, "Exception while checking BackupRules: ", th3);
        }
    }

    private static void component4(Context context) {
        AFKeystoreWrapper = (valueOf + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            if (!Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions).contains("android.permission.INTERNET")) {
                int i13 = valueOf + 49;
                AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 == 0) {
                    AFLogger.INSTANCE.w(AFh1sSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                } else {
                    AFLogger.INSTANCE.w(AFh1sSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                    throw null;
                }
            }
            if (!r4.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFKeystoreWrapper = (valueOf + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                AFLogger.INSTANCE.w(AFh1sSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32 && (!r4.contains("com.google.android.gms.permission.AD_ID"))) {
                int i14 = valueOf + 29;
                AFKeystoreWrapper = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i14 % 2 != 0) {
                    AFLogger.INSTANCE.w(AFh1sSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                    int i15 = 99 / 0;
                } else {
                    AFLogger.INSTANCE.w(AFh1sSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                }
                AFKeystoreWrapper = (valueOf + 41) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
            int i16 = AFKeystoreWrapper + 67;
            valueOf = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i16 % 2 == 0) {
                int i17 = 59 / 0;
            }
        } catch (Exception e13) {
            AFLogger.INSTANCE.e(AFh1sSDK.GENERAL, "Exception while validation permissions. ", e13);
        }
    }

    private static int getCurrencyIso4217Code(AFd1pSDK aFd1pSDK, String str, boolean z13) {
        AFKeystoreWrapper = (valueOf + 63) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int AFAdRevenueData2 = aFd1pSDK.AFAdRevenueData(str, 0);
        if (!z13) {
            return AFAdRevenueData2;
        }
        int i13 = AFAdRevenueData2 + 1;
        aFd1pSDK.getMonetizationNetwork(str, i13);
        AFKeystoreWrapper = (valueOf + 49) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return i13;
    }

    private void AFAdRevenueData(String str) {
        AFa1rSDK currencyIso4217Code = new AFh1hSDK().getCurrencyIso4217Code(AFAdRevenueData().getMonetizationNetwork().getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0));
        currencyIso4217Code.component3 = str;
        if (str != null) {
            AFKeystoreWrapper = (valueOf + 45) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (str.length() > 5) {
                valueOf = (AFKeystoreWrapper + 61) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (AFAdRevenueData().AFInAppEventParameterName().getRevenue(currencyIso4217Code)) {
                    AFj1aSDK.getRevenue(AFAdRevenueData().getRevenue(), new AFa1tSDK(currencyIso4217Code), 5L, TimeUnit.MILLISECONDS);
                    AFKeystoreWrapper = (valueOf + 19) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                }
            }
        }
    }

    public final void getMonetizationNetwork(@NonNull AFa1rSDK aFa1rSDK, AFh1iSDK aFh1iSDK) {
        AppsFlyerRequestListener appsFlyerRequestListener;
        getMonetizationNetwork(new Object[]{aFa1rSDK, aFh1iSDK}, -441437243, 441437259, (int) System.currentTimeMillis());
        AFg1qSDK AFKeystoreWrapper2 = AFAdRevenueData().AFKeystoreWrapper();
        if (((String) AFg1qSDK.AFAdRevenueData(new Object[]{AFKeystoreWrapper2}, 1235496603, -1235496602, System.identityHashCode(AFKeystoreWrapper2))) == null) {
            int i13 = valueOf + 17;
            AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                appsFlyerRequestListener = aFa1rSDK.getMonetizationNetwork;
                int i14 = 28 / 0;
                if (appsFlyerRequestListener == null) {
                    return;
                }
            } else {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                appsFlyerRequestListener = aFa1rSDK.getMonetizationNetwork;
                if (appsFlyerRequestListener == null) {
                    return;
                }
            }
            appsFlyerRequestListener.onError(41, "No dev key");
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
        if (referrer == null) {
            int i15 = AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE;
            valueOf = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i15 % 2 == 0) {
                throw null;
            }
            referrer = "";
        }
        aFa1rSDK.component3 = referrer;
        AFAdRevenueData(aFa1rSDK);
    }

    public static boolean getRevenue(Context context) {
        try {
        } catch (Throwable th3) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th3);
        }
        if (ih.c.f72257d.c(context, ih.d.f72258a) == 0) {
            int i13 = AFKeystoreWrapper + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
            valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return i13 % 2 != 0;
        }
        AFKeystoreWrapper = (valueOf + 43) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e13) {
            AFLogger.INSTANCE.e(AFh1sSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e13);
            return false;
        }
    }

    private static int getMediationNetwork(AFd1pSDK aFd1pSDK, boolean z13) {
        valueOf = (AFKeystoreWrapper + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int currencyIso4217Code = getCurrencyIso4217Code(aFd1pSDK, "appsFlyerInAppEventCount", z13);
        int i13 = valueOf + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    private static void getRevenue(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                getRevenue("preInstallName", str);
                valueOf = (AFKeystoreWrapper + 23) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            } else {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                AFKeystoreWrapper = (valueOf + 35) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
        } catch (JSONException e13) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e13);
        }
    }

    public final AFd1pSDK AFAdRevenueData(Context context) {
        valueOf = (AFKeystoreWrapper + 53) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        getCurrencyIso4217Code(context);
        AFd1pSDK component2 = AFAdRevenueData().component2();
        AFKeystoreWrapper = (valueOf + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return component2;
    }

    private void AFAdRevenueData(AFa1rSDK aFa1rSDK) {
        boolean z13 = false;
        if (aFa1rSDK.component4 == null) {
            int i13 = valueOf + 13;
            AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                z13 = true;
            }
        }
        if (getMonetizationNetwork()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z13) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                if (component4()) {
                    int i14 = valueOf + 5;
                    AFKeystoreWrapper = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (i14 % 2 == 0) {
                        AppsFlyerRequestListener appsFlyerRequestListener = aFa1rSDK.getMonetizationNetwork;
                        if (appsFlyerRequestListener != null) {
                            appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.component2 = System.currentTimeMillis();
        }
        AFj1aSDK.getRevenue(AFAdRevenueData().getRevenue(), new AFa1tSDK(aFa1rSDK), 0L, TimeUnit.MILLISECONDS);
    }

    private void getMonetizationNetwork(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i13 = AFKeystoreWrapper + 5;
        valueOf = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.getCurrencyIso4217Code = appsFlyerConversionListener;
        valueOf = (AFKeystoreWrapper + 21) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        int i13 = valueOf + RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        AFj1lSDK AFInAppEventParameterName = aFb1tSDK.AFAdRevenueData().AFInAppEventParameterName();
        if (i14 == 0) {
            return AFInAppEventParameterName.AFAdRevenueData();
        }
        AFInAppEventParameterName.AFAdRevenueData();
        throw null;
    }

    public static int getRevenue(AFd1pSDK aFd1pSDK, boolean z13) {
        int i13 = valueOf + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            getCurrencyIso4217Code(aFd1pSDK, "appsFlyerCount", z13);
            throw null;
        }
        int currencyIso4217Code = getCurrencyIso4217Code(aFd1pSDK, "appsFlyerCount", z13);
        int i14 = AFKeystoreWrapper + 11;
        valueOf = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    @NonNull
    public final Map<String, Object> getRevenue(AFa1rSDK aFa1rSDK) {
        return (Map) getMonetizationNetwork(new Object[]{this, aFa1rSDK}, 1508221324, -1508221312, System.identityHashCode(this));
    }

    private static void getMonetizationNetwork(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1sSDK aFh1sSDK = AFh1sSDK.SDK_LIFECYCLE;
        StringBuilder sb3 = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb3.append(str);
        sb3.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFh1sSDK, sb3.toString());
        int i13 = valueOf + 87;
        AFKeystoreWrapper = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private static void getRevenue(@NonNull AFa1rSDK aFa1rSDK, AFh1iSDK aFh1iSDK) {
        getMonetizationNetwork(new Object[]{aFa1rSDK, aFh1iSDK}, -441437243, 441437259, (int) System.currentTimeMillis());
    }

    private static void getRevenue(JSONObject jSONObject) {
        getMonetizationNetwork(new Object[]{jSONObject}, 178678429, -178678426, (int) System.currentTimeMillis());
    }

    public final void getMonetizationNetwork(AFa1rSDK aFa1rSDK) {
        getMonetizationNetwork(new Object[]{this, aFa1rSDK}, 843550116, -843550105, System.identityHashCode(this));
    }

    public static String getMonetizationNetwork(SimpleDateFormat simpleDateFormat, long j13) {
        return (String) getMonetizationNetwork(new Object[]{simpleDateFormat, Long.valueOf(j13)}, -1853371894, 1853371912, (int) System.currentTimeMillis());
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) getMonetizationNetwork(new Object[]{this}, -1223656349, 1223656353, System.identityHashCode(this))).booleanValue();
    }

    private void AFAdRevenueData(Context context, String str, Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, context, str, map}, -1336967761, 1336967778, System.identityHashCode(this));
    }
}
