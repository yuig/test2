package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import bb.p;
import oi.j4;
import oi.u4;
import oi.y3;
import r6.a;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends a implements j4 {

    /* renamed from: c, reason: collision with root package name */
    public p f32013c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f32013c == null) {
            this.f32013c = new p(this);
        }
        p pVar = this.f32013c;
        pVar.getClass();
        y3 y3Var = u4.a(context, null, null).f95205i;
        u4.d(y3Var);
        if (intent == null) {
            y3Var.f95271i.c("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        y3Var.f95276n.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                y3Var.f95271i.c("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        y3Var.f95276n.c("Starting wakeful intent.");
        ((AppMeasurementReceiver) ((j4) pVar.f22464b)).getClass();
        SparseArray sparseArray = a.f106305a;
        synchronized (sparseArray) {
            try {
                int i13 = a.f106306b;
                int i14 = i13 + 1;
                a.f106306b = i14;
                if (i14 <= 0) {
                    a.f106306b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i13);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i13, newWakeLock);
            } finally {
            }
        }
    }
}
