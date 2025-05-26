package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import com.appsflyer.internal.AFj1mSDK;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFj1gSDK extends AFj1xSDK {
    private final AFd1gSDK AFAdRevenueData;

    public AFj1gSDK(Runnable runnable, AFd1gSDK aFd1gSDK) {
        super("store", "samsung", runnable);
        this.AFAdRevenueData = aFd1gSDK;
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    public final void getMonetizationNetwork(Context context) {
        AFc1aSDK<Map<String, Object>> aFc1aSDK = new AFc1aSDK<Map<String, Object>>(context, this.AFAdRevenueData.getMediationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1gSDK.3
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
            
                if (r2 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.getMonetizationNetwork.getPackageManager().resolveContentProvider(r10.AFAdRevenueData, com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN)).packageName;
                r10.getRevenue.getCurrencyIso4217Code.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFb1qSDK.AFAdRevenueData(r10.getMonetizationNetwork, r0)));
                r10.getRevenue.getCurrencyIso4217Code.put("api_ver_name", com.appsflyer.internal.AFb1qSDK.getRevenue(r10.getMonetizationNetwork, r0));
                r10.getRevenue.getRevenue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0117, code lost:
            
                return r10.getRevenue.getCurrencyIso4217Code;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
            
                if (0 == 0) goto L26;
             */
            @Override // com.appsflyer.internal.AFc1aSDK
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.Object> getCurrencyIso4217Code() {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1gSDK.AnonymousClass3.getCurrencyIso4217Code():java.util.Map");
            }

            private static void F_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j13 = cursor.getLong(columnIndex);
                if (j13 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j13));
            }

            private static void G_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFd1pSDK component2 = this.AFAdRevenueData.component2();
        AFb1tSDK.getCurrencyIso4217Code();
        if (AFb1tSDK.getRevenue(component2, false) > 0 || !aFc1aSDK.getRevenue()) {
            return;
        }
        aFc1aSDK.getMediationNetwork.execute(aFc1aSDK.getCurrencyIso4217Code);
        this.component2 = System.currentTimeMillis();
        this.component1 = AFj1mSDK.AFa1zSDK.STARTED;
        addObserver(new AFj1mSDK.AnonymousClass3());
    }
}
