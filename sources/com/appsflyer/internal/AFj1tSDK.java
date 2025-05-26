package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1tSDK implements AFj1rSDK {
    private static ProviderInfo C_(Context context) {
        ProviderInfo resolveContentProvider;
        PackageManager.ComponentInfoFlags of;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.ComponentInfoFlags.of(0L);
                resolveContentProvider = packageManager.resolveContentProvider("com.huawei.appmarket.commondata", of);
            } else {
                resolveContentProvider = context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
            }
            return resolveContentProvider;
        } catch (Throwable th3) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1sSDK aFh1sSDK = AFh1sSDK.REFERRER;
            String message = th3.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1rSDK.e$default(aFLogger, aFh1sSDK, message, th3, false, false, false, false, 96, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1rSDK
    public final boolean AFAdRevenueData(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C_(context) != null;
    }

    @Override // com.appsflyer.internal.AFj1rSDK
    public final boolean getMonetizationNetwork(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ProviderInfo C_ = C_(context);
        if (C_ == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) C_).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th3) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1sSDK aFh1sSDK = AFh1sSDK.REFERRER;
            String message = th3.getMessage();
            AFh1rSDK.e$default(aFLogger, aFh1sSDK, message == null ? "" : message, th3, false, false, false, false, 96, null);
            return false;
        }
    }
}
