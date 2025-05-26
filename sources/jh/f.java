package jh;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class f {
    private volatile String zzA;
    private ConnectionResult zzB;
    private boolean zzC;
    private volatile zzk zzD;
    l0 zza;
    final Handler zzb;

    @NonNull
    protected d zzc;

    @NonNull
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final i zzn;
    private final ih.d zzo;
    private final Object zzp;
    private final Object zzq;
    private k zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private f0 zzu;
    private int zzv;
    private final b zzw;
    private final c zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r10, android.os.Looper r11, int r12, jh.b r13, jh.c r14) {
        /*
            r9 = this;
            jh.k0 r3 = jh.i.a(r10)
            ih.d r4 = ih.d.f72259b
            com.bumptech.glide.d.t(r13)
            com.bumptech.glide.d.t(r14)
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.f.<init>(android.content.Context, android.os.Looper, int, jh.b, jh.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r0.x1() >= r2.x1()) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zzj(jh.f r2, com.google.android.gms.common.internal.zzk r3) {
        /*
            r2.zzD = r3
            boolean r2 = r2.usesClientTelemetry()
            if (r2 == 0) goto L33
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r2 = r3.f30991i
            jh.m r3 = jh.m.a()
            if (r2 != 0) goto L12
            r2 = 0
            goto L16
        L12:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = r2.m2()
        L16:
            monitor-enter(r3)
            if (r2 != 0) goto L21
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = jh.m.f76183c     // Catch: java.lang.Throwable -> L1f
        L1b:
            r3.f76184a = r2     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r3)
            goto L30
        L1f:
            r2 = move-exception
            goto L31
        L21:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r3.f76184a     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1b
            int r0 = r0.x1()     // Catch: java.lang.Throwable -> L1f
            int r1 = r2.x1()     // Catch: java.lang.Throwable -> L1f
            if (r0 >= r1) goto L1d
            goto L1b
        L30:
            return
        L31:
            monitor-exit(r3)
            throw r2
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.f.zzj(jh.f, com.google.android.gms.common.internal.zzk):void");
    }

    public static /* bridge */ /* synthetic */ void zzk(f fVar, int i13) {
        int i14;
        int i15;
        synchronized (fVar.zzp) {
            i14 = fVar.zzv;
        }
        if (i14 == 3) {
            fVar.zzC = true;
            i15 = 5;
        } else {
            i15 = 4;
        }
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(i15, fVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(f fVar, int i13, int i14, IInterface iInterface) {
        synchronized (fVar.zzp) {
            try {
                if (fVar.zzv != i13) {
                    return false;
                }
                fVar.d(i14, iInterface);
                return true;
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(f fVar) {
        if (fVar.zzC || TextUtils.isEmpty(fVar.getServiceDescriptor()) || TextUtils.isEmpty(fVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(fVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void checkAvailabilityAndConnect() {
        int c13 = this.zzo.c(this.zzl, getMinApkVersion());
        if (c13 == 0) {
            connect(new bb.p(this, 12));
        } else {
            d(1, null);
            triggerNotAvailable(new bb.p(this, 12), c13, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(@NonNull d dVar) {
        com.bumptech.glide.d.u(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        d(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public final void d(int i13, IInterface iInterface) {
        l0 l0Var;
        com.bumptech.glide.d.j((i13 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i13;
                this.zzs = iInterface;
                if (i13 == 1) {
                    f0 f0Var = this.zzu;
                    if (f0Var != null) {
                        i iVar = this.zzn;
                        String str = this.zza.f76179a;
                        com.bumptech.glide.d.t(str);
                        String str2 = this.zza.f76180b;
                        zze();
                        iVar.b(str, str2, f0Var, this.zza.f76181c);
                        this.zzu = null;
                    }
                } else if (i13 == 2 || i13 == 3) {
                    f0 f0Var2 = this.zzu;
                    if (f0Var2 != null && (l0Var = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + l0Var.f76179a + " on " + l0Var.f76180b);
                        i iVar2 = this.zzn;
                        String str3 = this.zza.f76179a;
                        com.bumptech.glide.d.t(str3);
                        String str4 = this.zza.f76180b;
                        zze();
                        iVar2.b(str3, str4, f0Var2, this.zza.f76181c);
                        this.zzd.incrementAndGet();
                    }
                    f0 f0Var3 = new f0(this, this.zzd.get());
                    this.zzu = f0Var3;
                    l0 l0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new l0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new l0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = l0Var2;
                    if (l0Var2.f76181c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f76179a)));
                    }
                    i iVar3 = this.zzn;
                    String str5 = this.zza.f76179a;
                    com.bumptech.glide.d.t(str5);
                    if (!iVar3.c(new i0(str5, this.zza.f76180b, this.zza.f76181c), f0Var3, zze(), getBindServiceExecutor())) {
                        l0 l0Var3 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + l0Var3.f76179a + " on " + l0Var3.f76180b);
                        zzl(16, null, this.zzd.get());
                    }
                } else if (i13 == 4) {
                    com.bumptech.glide.d.t(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i13 = 0; i13 < size; i13++) {
                    w wVar = (w) this.zzt.get(i13);
                    synchronized (wVar) {
                        wVar.f76199a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        d(1, null);
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    @NonNull
    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f30989g;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    public final Context getContext() {
        return this.zzl;
    }

    @NonNull
    public String getEndpointPackageName() {
        l0 l0Var;
        if (!isConnected() || (l0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return l0Var.f76180b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    @NonNull
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(j jVar, @NonNull Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i13 = ih.d.f72258a;
        Scope[] scopeArr = GetServiceRequest.f30942t;
        Bundle bundle = new Bundle();
        int i14 = this.zzy;
        Feature[] featureArr = GetServiceRequest.f30943u;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i14, i13, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f30947i = this.zzl.getPackageName();
        getServiceRequest.f30950l = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f30949k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f30951m = account;
            if (jVar != null) {
                getServiceRequest.f30948j = jVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f30951m = getAccount();
        }
        getServiceRequest.f30952n = zze;
        getServiceRequest.f30953o = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f30956r = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    k kVar = this.zzr;
                    if (kVar != null) {
                        ((y) kVar).j(new e0(this, this.zzd.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e13) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e13);
            triggerConnectionSuspended(3);
        } catch (RemoteException e14) {
            e = e14;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e15) {
            throw e15;
        } catch (RuntimeException e16) {
            e = e16;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    @NonNull
    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    @NonNull
    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                com.bumptech.glide.d.u(iInterface, "Client is connected but service is null");
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return iInterface;
    }

    public abstract String getServiceDescriptor();

    public abstract String getStartServiceAction();

    @NonNull
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f30991i;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z13;
        synchronized (this.zzp) {
            z13 = this.zzv == 4;
        }
        return z13;
    }

    public boolean isConnecting() {
        boolean z13;
        synchronized (this.zzp) {
            int i13 = this.zzv;
            z13 = true;
            if (i13 != 2 && i13 != 3) {
                z13 = false;
            }
        }
        return z13;
    }

    public void onConnectedLocked(@NonNull IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zzi = connectionResult.f30732g;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i13) {
        this.zzf = i13;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i13, IBinder iBinder, Bundle bundle, int i14) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i14, -1, new g0(this, i13, iBinder, bundle)));
    }

    public void onUserSignOut(@NonNull e eVar) {
        ((com.google.android.gms.common.api.internal.y) eVar).a();
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(@NonNull String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i13) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i13));
    }

    public void triggerNotAvailable(@NonNull d dVar, int i13, PendingIntent pendingIntent) {
        com.bumptech.glide.d.u(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i13, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    @NonNull
    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i13, Bundle bundle, int i14) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i14, -1, new h0(this, i13)));
    }

    public f(Context context, Looper looper, k0 k0Var, ih.d dVar, int i13, b bVar, c cVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        com.bumptech.glide.d.u(context, "Context must not be null");
        this.zzl = context;
        com.bumptech.glide.d.u(looper, "Looper must not be null");
        this.zzm = looper;
        com.bumptech.glide.d.u(k0Var, "Supervisor must not be null");
        this.zzn = k0Var;
        com.bumptech.glide.d.u(dVar, "API availability must not be null");
        this.zzo = dVar;
        this.zzb = new d0(this, looper);
        this.zzy = i13;
        this.zzw = bVar;
        this.zzx = cVar;
        this.zzz = str;
    }

    public void disconnect(@NonNull String str) {
        this.zzk = str;
        disconnect();
    }
}
