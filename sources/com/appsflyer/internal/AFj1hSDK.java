package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class AFj1hSDK implements SensorEventListener {

    @NonNull
    private final String AFAdRevenueData;
    private final float[][] component1 = new float[2][];
    private final long[] component2 = new long[2];
    private long component3;

    @NonNull
    private final Executor component4;

    @NonNull
    private final String getCurrencyIso4217Code;
    private double getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;

    public AFj1hSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.getMonetizationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFAdRevenueData = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getCurrencyIso4217Code = str;
        this.getRevenue = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.component4 = executorService;
    }

    @NonNull
    private static List<Float> AFAdRevenueData(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f13 : fArr) {
            arrayList.add(Float.valueOf(f13));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H_, reason: merged with bridge method [inline-methods] */
    public void I_(SensorEvent sensorEvent) {
        long j13 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component1;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component2[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.component1[1] = copyOf;
            this.component2[1] = currentTimeMillis;
            this.getMediationNetwork = getRevenue(fArr3, copyOf);
            return;
        }
        if (50000000 <= j13 - this.component3) {
            this.component3 = j13;
            if (Arrays.equals(fArr4, fArr)) {
                this.component2[1] = currentTimeMillis;
                return;
            }
            double revenue = getRevenue(fArr3, fArr);
            if (revenue > this.getMediationNetwork) {
                this.component1[1] = Arrays.copyOf(fArr, fArr.length);
                this.component2[1] = currentTimeMillis;
                this.getMediationNetwork = revenue;
            }
        }
    }

    private boolean getMonetizationNetwork(int i13, @NonNull String str, @NonNull String str2) {
        return this.getMonetizationNetwork == i13 && this.AFAdRevenueData.equals(str) && this.getCurrencyIso4217Code.equals(str2);
    }

    private static double getRevenue(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d2 = 0.0d;
        for (int i13 = 0; i13 < min; i13++) {
            d2 += StrictMath.pow(fArr[i13] - fArr2[i13], 2.0d);
        }
        return Math.sqrt(d2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1hSDK)) {
            return false;
        }
        AFj1hSDK aFj1hSDK = (AFj1hSDK) obj;
        return getMonetizationNetwork(aFj1hSDK.getMonetizationNetwork, aFj1hSDK.AFAdRevenueData, aFj1hSDK.getCurrencyIso4217Code);
    }

    public final void getMediationNetwork(@NonNull Map<AFj1hSDK, Map<String, Object>> map, boolean z13) {
        if (!getRevenue()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, AFAdRevenueData());
            return;
        }
        map.put(this, AFAdRevenueData());
        if (z13) {
            int length = this.component1.length;
            for (int i13 = 0; i13 < length; i13++) {
                this.component1[i13] = null;
            }
            int length2 = this.component2.length;
            for (int i14 = 0; i14 < length2; i14++) {
                this.component2[i14] = 0;
            }
            this.getMediationNetwork = 0.0d;
            this.component3 = 0L;
        }
    }

    public final int hashCode() {
        return this.getRevenue;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component4.execute(new l(1, this, sensorEvent));
        } else {
            I_(sensorEvent);
        }
    }

    @NonNull
    private Map<String, Object> AFAdRevenueData() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMonetizationNetwork));
        concurrentHashMap.put("sN", this.AFAdRevenueData);
        concurrentHashMap.put("sV", this.getCurrencyIso4217Code);
        float[] fArr = this.component1[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFAdRevenueData(fArr));
        }
        float[] fArr2 = this.component1[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFAdRevenueData(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getRevenue() {
        return this.component1[0] != null;
    }
}
