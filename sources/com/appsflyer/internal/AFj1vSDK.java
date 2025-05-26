package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1mSDK;
import com.appsflyer.internal.AFj1vSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class AFj1vSDK extends AFj1wSDK {

    @NonNull
    final ExecutorService AFAdRevenueData;
    public final Map<String, Object> getRevenue;

    /* renamed from: com.appsflyer.internal.AFj1vSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass3(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i13) {
            AFj1vSDK.this.getCurrencyIso4217Code(installReferrerClient, context, i13);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i13) {
            ExecutorService executorService = AFj1vSDK.this.AFAdRevenueData;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1vSDK.AnonymousClass3.this.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i13);
                }
            });
        }
    }

    public AFj1vSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService, @NonNull AFd1nSDK aFd1nSDK) {
        super("store", "google", aFd1nSDK, runnable);
        this.getRevenue = new HashMap();
        this.AFAdRevenueData = executorService;
    }

    private boolean getRevenue(@NonNull Context context) {
        if (!getMonetizationNetwork()) {
            return false;
        }
        try {
            if (AFb1qSDK.getMonetizationNetwork(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e13) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e13);
            AFLogger.INSTANCE.v(AFh1sSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th3);
            return false;
        }
    }

    public final void getCurrencyIso4217Code(InstallReferrerClient installReferrerClient, Context context, int i13) {
        this.getRevenue.put("code", String.valueOf(i13));
        this.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.android.vending")));
        this.getCurrencyIso4217Code.put("api_ver_name", AFb1qSDK.getRevenue(context, "com.android.vending"));
        if (i13 == -1) {
            AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.getCurrencyIso4217Code.put("response", "SERVICE_DISCONNECTED");
        } else if (i13 == 0) {
            this.getCurrencyIso4217Code.put("response", "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1sSDK aFh1sSDK = AFh1sSDK.REFERRER;
                aFLogger.d(aFh1sSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getRevenue.put("val", installReferrer2);
                        this.getCurrencyIso4217Code.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getRevenue.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.getCurrencyIso4217Code.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getRevenue.put("install", Long.toString(installBeginTimestampSeconds));
                    this.getCurrencyIso4217Code.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getRevenue.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e13) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e13);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e14) {
                        AFLogger.INSTANCE.e(AFh1sSDK.REFERRER, "some method not exist", e14, false, false);
                    }
                    if (!hashMap.isEmpty()) {
                        this.getCurrencyIso4217Code.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(aFh1sSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getRevenue.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th3) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFh1sSDK aFh1sSDK2 = AFh1sSDK.REFERRER;
                StringBuilder sb3 = new StringBuilder("Failed to get install referrer: ");
                sb3.append(th3.getMessage());
                aFLogger2.w(aFh1sSDK2, sb3.toString());
                this.getRevenue.put("err", th3.getMessage());
                aFLogger2.e(aFh1sSDK2, "Failed to get install referrer", th3, false, false);
            }
        } else if (i13 == 1) {
            this.getCurrencyIso4217Code.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "InstallReferrer not supported");
        } else if (i13 == 2) {
            AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i13 != 3) {
            AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFh1sSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.getCurrencyIso4217Code.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Install Referrer collected locally");
        getRevenue();
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    public final void getMonetizationNetwork(Context context) {
        if (getRevenue(context)) {
            this.component2 = System.currentTimeMillis();
            this.component1 = AFj1mSDK.AFa1zSDK.STARTED;
            addObserver(new AFj1mSDK.AnonymousClass3());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass3(build, context));
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFh1sSDK.REFERRER, "referrerClient -> startConnection", th3);
            }
        }
    }
}
