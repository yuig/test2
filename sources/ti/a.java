package ti;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.v;
import com.bumptech.glide.d;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import oh.e;
import oh.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f117678n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f117679o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f117680p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f117681a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f117682b;

    /* renamed from: c, reason: collision with root package name */
    public int f117683c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f117684d;

    /* renamed from: e, reason: collision with root package name */
    public long f117685e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f117686f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f117687g;

    /* renamed from: h, reason: collision with root package name */
    public ji.a f117688h;

    /* renamed from: i, reason: collision with root package name */
    public final oh.b f117689i;

    /* renamed from: j, reason: collision with root package name */
    public final String f117690j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f117691k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f117692l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f117693m;

    public a(Context context) {
        boolean z13;
        String packageName = context.getPackageName();
        this.f117681a = new Object();
        this.f117683c = 0;
        this.f117686f = new HashSet();
        this.f117687g = true;
        this.f117689i = oh.b.f94454a;
        this.f117691k = new HashMap();
        this.f117692l = new AtomicInteger(0);
        d.p("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f117688h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f117690j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f117690j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb3.toString());
        }
        this.f117682b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = f.f94460a;
        synchronized (f.class) {
            Boolean bool = f.f94462c;
            if (bool != null) {
                z13 = bool.booleanValue();
            } else {
                z13 = d5.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                f.f94462c = Boolean.valueOf(z13);
            }
        }
        if (z13) {
            packageName = e.a(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo c13 = ph.b.a(context).c(0, packageName);
                    if (c13 == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i13 = c13.uid;
                        workSource = new WorkSource();
                        Method method2 = f.f94461b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i13), packageName);
                            } catch (Exception e13) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e13);
                            }
                        } else {
                            Method method3 = f.f94460a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i13));
                                } catch (Exception e14) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e14);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f117682b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e15) {
                    Log.wtf("WakeLock", e15.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f117679o;
        if (scheduledExecutorService == null) {
            synchronized (f117680p) {
                try {
                    scheduledExecutorService = f117679o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f117679o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f117693m = scheduledExecutorService;
    }

    public final void a(long j13) {
        this.f117692l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f117678n), 1L);
        if (j13 > 0) {
            max = Math.min(j13, max);
        }
        synchronized (this.f117681a) {
            try {
                if (!b()) {
                    this.f117688h = ji.a.f76239a;
                    this.f117682b.acquire();
                    this.f117689i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f117683c++;
                if (this.f117687g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f117691k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f117691k.put(null, bVar);
                }
                bVar.f117694a++;
                this.f117689i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j14 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j14 > this.f117685e) {
                    this.f117685e = j14;
                    ScheduledFuture scheduledFuture = this.f117684d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f117684d = this.f117693m.schedule(new v(this, 9), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean b() {
        boolean z13;
        synchronized (this.f117681a) {
            z13 = this.f117683c > 0;
        }
        return z13;
    }

    public final void c() {
        if (this.f117692l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f117690j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f117681a) {
            try {
                if (this.f117687g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f117691k.containsKey(null)) {
                    b bVar = (b) this.f117691k.get(null);
                    if (bVar != null) {
                        int i13 = bVar.f117694a - 1;
                        bVar.f117694a = i13;
                        if (i13 == 0) {
                            this.f117691k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f117690j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f117686f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        ep.b.A(arrayList.get(0));
        throw null;
    }

    public final void e() {
        synchronized (this.f117681a) {
            try {
                if (b()) {
                    if (this.f117687g) {
                        int i13 = this.f117683c - 1;
                        this.f117683c = i13;
                        if (i13 > 0) {
                            return;
                        }
                    } else {
                        this.f117683c = 0;
                    }
                    d();
                    Iterator it = this.f117691k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f117694a = 0;
                    }
                    this.f117691k.clear();
                    ScheduledFuture scheduledFuture = this.f117684d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f117684d = null;
                        this.f117685e = 0L;
                    }
                    if (this.f117682b.isHeld()) {
                        try {
                            try {
                                this.f117682b.release();
                                if (this.f117688h != null) {
                                    this.f117688h = null;
                                }
                            } catch (RuntimeException e13) {
                                if (!e13.getClass().equals(RuntimeException.class)) {
                                    throw e13;
                                }
                                Log.e("WakeLock", String.valueOf(this.f117690j).concat(" failed to release!"), e13);
                                if (this.f117688h != null) {
                                    this.f117688h = null;
                                }
                            }
                        } catch (Throwable th3) {
                            if (this.f117688h != null) {
                                this.f117688h = null;
                            }
                            throw th3;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f117690j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
