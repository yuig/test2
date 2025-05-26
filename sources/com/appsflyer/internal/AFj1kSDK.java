package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1mSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class AFj1kSDK extends AFj1wSDK {
    public AFj1kSDK(AFd1nSDK aFd1nSDK, Runnable runnable) {
        super("store", "xiaomi", aFd1nSDK, runnable);
    }

    private boolean getCurrencyIso4217Code() {
        if (!getMonetizationNetwork()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFh1sSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th3);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    public final void getMonetizationNetwork(final Context context) {
        if (getCurrencyIso4217Code()) {
            this.component2 = System.currentTimeMillis();
            this.component1 = AFj1mSDK.AFa1zSDK.STARTED;
            addObserver(new AFj1mSDK.AnonymousClass3());
            final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
            build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1kSDK.1
                public final void onGetAppsReferrerSetupFinished(int i13) {
                    AFj1kSDK.this.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
                    AFj1kSDK.this.getCurrencyIso4217Code.put("api_ver_name", AFb1qSDK.getRevenue(context, "com.xiaomi.mipicks"));
                    if (i13 == -1) {
                        AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1kSDK.this.getCurrencyIso4217Code.put("response", "SERVICE_DISCONNECTED");
                    } else if (i13 == 0) {
                        AFj1kSDK aFj1kSDK = AFj1kSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFj1kSDK.getCurrencyIso4217Code.put("response", "OK");
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFh1sSDK aFh1sSDK = AFh1sSDK.REFERRER;
                            aFLogger.d(aFh1sSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1kSDK.getCurrencyIso4217Code.put("referrer", installReferrer2);
                                }
                                aFj1kSDK.getCurrencyIso4217Code.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1kSDK.getCurrencyIso4217Code.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFj1kSDK.getCurrencyIso4217Code.put("xiaomi_custom", hashMap);
                            } else {
                                aFLogger.w(aFh1sSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th3) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFh1sSDK aFh1sSDK2 = AFh1sSDK.REFERRER;
                            StringBuilder sb3 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb3.append(th3.getMessage());
                            aFLogger2.w(aFh1sSDK2, sb3.toString());
                        }
                    } else if (i13 == 1) {
                        AFj1kSDK.this.getCurrencyIso4217Code.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i13 == 2) {
                        AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1kSDK.this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i13 == 3) {
                        AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1kSDK.this.getCurrencyIso4217Code.put("response", "DEVELOPER_ERROR");
                    } else if (i13 != 4) {
                        AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "responseCode not found.");
                    } else {
                        AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1kSDK.this.getCurrencyIso4217Code.put("response", "PERMISSION_ERROR");
                    }
                    AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1kSDK.this.getRevenue();
                    build.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
