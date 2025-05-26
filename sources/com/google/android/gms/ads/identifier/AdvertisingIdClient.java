package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import ep.b;
import ih.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import xh.c;
import xh.d;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    a zza;
    d zzb;
    boolean zzc;
    final Object zzd = new Object();
    zzb zze;
    final long zzf;
    private final Context zzg;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        public Info(String str, boolean z13) {
            this.zza = str;
            this.zzb = z13;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public final String toString() {
            String str = this.zza;
            boolean z13 = this.zzb;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 7);
            sb3.append("{");
            sb3.append(str);
            sb3.append("}");
            sb3.append(z13);
            return sb3.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        com.bumptech.glide.d.t(context);
        Context applicationContext = context.getApplicationContext();
        this.zzg = applicationContext != null ? applicationContext : context;
        this.zzc = false;
        this.zzf = -1L;
    }

    public static void c(Info info2, long j13, Throwable th3) {
        if (Math.random() <= 0.0d) {
            String str = SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;
            HashMap o13 = b.o("app_context", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
            if (info2 != null) {
                if (true != info2.isLimitAdTrackingEnabled()) {
                    str = "0";
                }
                o13.put("limit_ad_tracking", str);
                String id3 = info2.getId();
                if (id3 != null) {
                    o13.put("ad_id_size", Integer.toString(id3.length()));
                }
            }
            if (th3 != null) {
                o13.put("error", th3.getClass().getName());
            }
            o13.put("tag", "AdvertisingIdClient");
            o13.put("time_spent", Long.toString(j13));
            new zza(o13).start();
        }
    }

    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.b();
            Info d2 = advertisingIdClient.d();
            c(d2, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return d2;
        } finally {
        }
    }

    public final void a() {
        com.bumptech.glide.d.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        nh.a.b().c(this.zzg, this.zza);
                    }
                } catch (Throwable th3) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th3);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void b() {
        com.bumptech.glide.d.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    a();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int c13 = ih.d.f72259b.c(context, 12451000);
                    if (c13 != 0 && c13 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    a aVar = new a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!nh.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = aVar;
                        try {
                            IBinder a13 = aVar.a(TimeUnit.MILLISECONDS);
                            int i13 = c.f134960a;
                            IInterface queryLocalInterface = a13.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.zzb = queryLocalInterface instanceof d ? (d) queryLocalInterface : new xh.b(a13);
                            this.zzc = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th3) {
                            throw new IOException(th3);
                        }
                    } finally {
                        IOException iOException = new IOException(th3);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final Info d() {
        Info info2;
        com.bumptech.glide.d.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        zzb zzbVar = this.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        b();
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e13) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e13);
                    }
                }
                com.bumptech.glide.d.t(this.zza);
                com.bumptech.glide.d.t(this.zzb);
                try {
                    xh.b bVar = (xh.b) this.zzb;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z13 = true;
                    Parcel j13 = bVar.j(obtain, 1);
                    String readString = j13.readString();
                    j13.recycle();
                    xh.b bVar2 = (xh.b) this.zzb;
                    bVar2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i13 = xh.a.f134958a;
                    obtain2.writeInt(1);
                    Parcel j14 = bVar2.j(obtain2, 2);
                    if (j14.readInt() == 0) {
                        z13 = false;
                    }
                    j14.recycle();
                    info2 = new Info(readString, z13);
                } catch (RemoteException e14) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e14);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        e();
        return info2;
    }

    public final void e() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j13 = this.zzf;
            if (j13 > 0) {
                this.zze = new zzb(this, j13);
            }
        }
    }

    public final void finalize() {
        a();
        super.finalize();
    }
}
