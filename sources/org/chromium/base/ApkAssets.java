package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import org.chromium.base.annotations.CalledByNative;
import so.a;

/* loaded from: classes4.dex */
public class ApkAssets {

    /* renamed from: a, reason: collision with root package name */
    public static String f97278a;

    @CalledByNative
    public static long[] open(String str, String str2) {
        AssetFileDescriptor assetFileDescriptor = null;
        f97278a = null;
        try {
            try {
                Context context = a.f113317a;
                if (!TextUtils.isEmpty(str2) && BundleUtils.d(str2)) {
                    context = BundleUtils.a(context, str2);
                }
                assetFileDescriptor = context.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                try {
                    assetFileDescriptor.close();
                } catch (IOException e13) {
                    Log.e("cr_ApkAssets", "Unable to close AssetFileDescriptor", e13);
                }
                return jArr;
            } catch (Throwable th3) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e14) {
                        Log.e("cr_ApkAssets", "Unable to close AssetFileDescriptor", e14);
                    }
                }
                throw th3;
            }
        } catch (IOException e15) {
            f97278a = "Error while loading asset " + str + " from " + str2 + ": " + e15;
            if (!e15.getMessage().equals("") && !e15.getMessage().equals(str)) {
                Log.e("cr_ApkAssets", f97278a);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e16) {
                    Log.e("cr_ApkAssets", "Unable to close AssetFileDescriptor", e16);
                }
            }
            return jArr2;
        }
    }

    @CalledByNative
    public static String takeLastErrorString() {
        String str = f97278a;
        f97278a = null;
        return str;
    }
}
