package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes3.dex */
final class zzb extends Thread {
    final CountDownLatch zza = new CountDownLatch(1);
    boolean zzb = false;
    private final WeakReference<AdvertisingIdClient> zzc;
    private final long zzd;

    public zzb(AdvertisingIdClient advertisingIdClient, long j13) {
        this.zzc = new WeakReference<>(advertisingIdClient);
        this.zzd = j13;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        try {
            if (this.zza.await(this.zzd, TimeUnit.MILLISECONDS) || (advertisingIdClient = this.zzc.get()) == null) {
                return;
            }
            advertisingIdClient.a();
            this.zzb = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = this.zzc.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.a();
                this.zzb = true;
            }
        }
    }
}
