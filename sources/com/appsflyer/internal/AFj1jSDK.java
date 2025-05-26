package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class AFj1jSDK implements AFj1iSDK {
    private static final BitSet component1;
    final Object AFAdRevenueData;
    private final ExecutorService areAllFieldsValid;
    private final Map<AFj1hSDK, AFj1hSDK> component2;
    private final SensorManager component3;
    private final Map<AFj1hSDK, Map<String, Object>> component4;
    private boolean equals;
    boolean getCurrencyIso4217Code;
    final Runnable getMediationNetwork;
    final Handler getMonetizationNetwork;
    final Runnable getRevenue;
    private final Runnable hashCode;

    /* renamed from: com.appsflyer.internal.AFj1jSDK$3 */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1jSDK.this.AFAdRevenueData) {
                try {
                    AFj1jSDK aFj1jSDK = AFj1jSDK.this;
                    if (aFj1jSDK.getCurrencyIso4217Code) {
                        aFj1jSDK.getMonetizationNetwork.removeCallbacks(aFj1jSDK.getMediationNetwork);
                        AFj1jSDK aFj1jSDK2 = AFj1jSDK.this;
                        aFj1jSDK2.getMonetizationNetwork.removeCallbacks(aFj1jSDK2.getRevenue);
                        AFj1jSDK.this.AFAdRevenueData();
                        AFj1jSDK.this.getCurrencyIso4217Code = false;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFj1jSDK$5 */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1jSDK.this.AFAdRevenueData) {
                AFj1jSDK.this.getRevenue();
                AFj1jSDK aFj1jSDK = AFj1jSDK.this;
                aFj1jSDK.getMonetizationNetwork.postDelayed(aFj1jSDK.getRevenue, 150L);
                AFj1jSDK.this.getCurrencyIso4217Code = true;
            }
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        component1 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1jSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFAdRevenueData = new Object();
        BitSet bitSet = component1;
        this.component2 = new HashMap(bitSet.size());
        this.component4 = new ConcurrentHashMap(bitSet.size());
        this.getMediationNetwork = new Runnable() { // from class: com.appsflyer.internal.AFj1jSDK.5
            public AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1jSDK.this.AFAdRevenueData) {
                    AFj1jSDK.this.getRevenue();
                    AFj1jSDK aFj1jSDK = AFj1jSDK.this;
                    aFj1jSDK.getMonetizationNetwork.postDelayed(aFj1jSDK.getRevenue, 150L);
                    AFj1jSDK.this.getCurrencyIso4217Code = true;
                }
            }
        };
        this.getRevenue = new n(this, 3);
        this.hashCode = new Runnable() { // from class: com.appsflyer.internal.AFj1jSDK.3
            public AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1jSDK.this.AFAdRevenueData) {
                    try {
                        AFj1jSDK aFj1jSDK = AFj1jSDK.this;
                        if (aFj1jSDK.getCurrencyIso4217Code) {
                            aFj1jSDK.getMonetizationNetwork.removeCallbacks(aFj1jSDK.getMediationNetwork);
                            AFj1jSDK aFj1jSDK2 = AFj1jSDK.this;
                            aFj1jSDK2.getMonetizationNetwork.removeCallbacks(aFj1jSDK2.getRevenue);
                            AFj1jSDK.this.AFAdRevenueData();
                            AFj1jSDK.this.getCurrencyIso4217Code = false;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        };
        this.component3 = sensorManager;
        this.getMonetizationNetwork = handler;
        this.areAllFieldsValid = executorService;
    }

    private static boolean AFAdRevenueData(int i13) {
        return i13 >= 0 && component1.get(i13);
    }

    @NonNull
    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.AFAdRevenueData) {
            try {
                if (!this.component2.isEmpty() && this.equals) {
                    Iterator<AFj1hSDK> it = this.component2.values().iterator();
                    while (it.hasNext()) {
                        it.next().getMediationNetwork(this.component4, false);
                    }
                }
                if (this.component4.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.component4.values());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public /* synthetic */ void component1() {
        try {
            for (Sensor sensor : this.component3.getSensorList(-1)) {
                if (AFAdRevenueData(sensor.getType())) {
                    AFj1hSDK aFj1hSDK = new AFj1hSDK(sensor, this.areAllFieldsValid);
                    if (!this.component2.containsKey(aFj1hSDK)) {
                        this.component2.put(aFj1hSDK, aFj1hSDK);
                    }
                    this.component3.registerListener(this.component2.get(aFj1hSDK), sensor, 1, this.getMonetizationNetwork);
                }
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th3);
        }
        this.equals = true;
    }

    @NonNull
    private List<Map<String, Object>> component2() {
        synchronized (this.AFAdRevenueData) {
            try {
                Iterator<AFj1hSDK> it = this.component2.values().iterator();
                while (it.hasNext()) {
                    it.next().getMediationNetwork(this.component4, true);
                }
                if (this.component4.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.component4.values());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public /* synthetic */ void component3() {
        try {
            if (!this.component2.isEmpty()) {
                for (AFj1hSDK aFj1hSDK : this.component2.values()) {
                    this.component3.unregisterListener(aFj1hSDK);
                    aFj1hSDK.getMediationNetwork(this.component4, true);
                }
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th3);
        }
        this.equals = false;
    }

    public /* synthetic */ void component4() {
        synchronized (this.AFAdRevenueData) {
            this.getMonetizationNetwork.post(new n(this, 2));
        }
    }

    @Override // com.appsflyer.internal.AFj1iSDK
    public final void getCurrencyIso4217Code() {
        this.getMonetizationNetwork.post(this.hashCode);
        this.getMonetizationNetwork.post(this.getMediationNetwork);
    }

    @Override // com.appsflyer.internal.AFj1iSDK
    public final synchronized void getMediationNetwork() {
        this.getMonetizationNetwork.post(this.hashCode);
    }

    @Override // com.appsflyer.internal.AFj1iSDK
    @NonNull
    public final Map<String, Object> getMonetizationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> areAllFieldsValid = areAllFieldsValid();
        if (areAllFieldsValid.isEmpty()) {
            List<Map<String, Object>> component2 = component2();
            if (!component2.isEmpty()) {
                concurrentHashMap.put("sensors", component2);
            }
        } else {
            concurrentHashMap.put("sensors", areAllFieldsValid);
        }
        return concurrentHashMap;
    }

    public final void getRevenue() {
        this.getMonetizationNetwork.post(new n(this, 0));
    }

    public final void AFAdRevenueData() {
        this.getMonetizationNetwork.post(new n(this, 1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFj1jSDK(@androidx.annotation.NonNull android.content.Context r3, java.util.concurrent.ExecutorService r4) {
        /*
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "internal"
            r0.<init>(r1)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r2.<init>(r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1jSDK.<init>(android.content.Context, java.util.concurrent.ExecutorService):void");
    }
}
