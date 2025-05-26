package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class AFb1kSDK extends AFc1aSDK<String> {
    public AFb1kSDK(Context context, Executor executor) {
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1aSDK
    /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
    public String getCurrencyIso4217Code() {
        Cursor cursor;
        Throwable th3;
        try {
            ContentResolver contentResolver = this.getMonetizationNetwork.getContentResolver();
            StringBuilder sb3 = new StringBuilder("content://");
            sb3.append(this.AFAdRevenueData);
            cursor = contentResolver.query(Uri.parse(sb3.toString()), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("aid"));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th4) {
                    th3 = th4;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th3;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th5) {
            cursor = null;
            th3 = th5;
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final /* synthetic */ String getMediationNetwork() {
        this.getMediationNetwork.execute(this.getCurrencyIso4217Code);
        return (String) super.getMediationNetwork();
    }

    public final String getMonetizationNetwork() {
        this.getMediationNetwork.execute(this.getCurrencyIso4217Code);
        return (String) super.getMediationNetwork();
    }
}
