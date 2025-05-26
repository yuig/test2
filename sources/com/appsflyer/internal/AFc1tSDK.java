package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFc1tSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFd1oSDK;", "p0", "Lcom/appsflyer/internal/AFd1pSDK;", "p1", "", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFd1oSDK;Lcom/appsflyer/internal/AFd1pSDK;)V", "", "()Ljava/lang/String;", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFc1tSDK {

    @NotNull
    public static final AFc1tSDK INSTANCE = new AFc1tSDK();

    private AFc1tSDK() {
    }

    public static final void AFAdRevenueData(@NotNull AFd1oSDK p03, @NotNull AFd1pSDK p13) {
        int i13;
        Intrinsics.checkNotNullParameter(p03, "");
        Intrinsics.checkNotNullParameter(p13, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1qSDK.getRevenue()) {
            AFLogger.afRDLog("OPPO device found");
            i13 = 23;
        } else {
            i13 = 18;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < i13 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + i14 + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i14 + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p03.getMonetizationNetwork);
        if (aFKeystoreWrapper.getRevenue()) {
            String AFAdRevenueData = aFKeystoreWrapper.AFAdRevenueData();
            synchronized (aFKeystoreWrapper.getMediationNetwork) {
                aFKeystoreWrapper.getMonetizationNetwork++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFAdRevenueData)));
                try {
                    synchronized (aFKeystoreWrapper.getMediationNetwork) {
                        aFKeystoreWrapper.getCurrencyIso4217Code.deleteEntry(AFAdRevenueData);
                    }
                } catch (KeyStoreException e13) {
                    StringBuilder sb3 = new StringBuilder("Exception ");
                    sb3.append(e13.getMessage());
                    sb3.append(" occurred");
                    AFLogger.afErrorLog(sb3.toString(), e13);
                }
            }
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.AFAdRevenueData());
        } else {
            aFKeystoreWrapper.AFAdRevenueData = AFb1iSDK.getMediationNetwork(p03, p13);
            aFKeystoreWrapper.getMonetizationNetwork = 0;
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.AFAdRevenueData());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getMonetizationNetwork());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getMediationNetwork()));
    }

    public static String getMonetizationNetwork() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    public static String AFAdRevenueData() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }
}
