package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: j, reason: collision with root package name */
    public static final long f33726j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k, reason: collision with root package name */
    public static s f33727k;

    /* renamed from: l, reason: collision with root package name */
    public static ig.d f33728l;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f33729m;

    /* renamed from: a, reason: collision with root package name */
    public final nl.g f33730a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f33731b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.x f33732c;

    /* renamed from: d, reason: collision with root package name */
    public final p f33733d;

    /* renamed from: e, reason: collision with root package name */
    public final e3.a f33734e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f33735f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f33736g;

    /* renamed from: h, reason: collision with root package name */
    public final m f33737h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33738i;

    public FirebaseMessaging(nl.g gVar, cm.a aVar, cm.a aVar2, dm.f fVar, ig.d dVar, zl.c cVar) {
        gVar.b();
        Context context = gVar.f91217a;
        final m mVar = new m(context);
        gVar.b();
        final androidx.appcompat.widget.x xVar = new androidx.appcompat.widget.x(gVar, mVar, new hh.a(context), aVar, aVar2, fVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new o.c("Firebase-Messaging-Task"));
        final int i13 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new o.c("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o.c("Firebase-Messaging-File-Io"));
        final int i14 = 0;
        this.f33738i = false;
        f33728l = dVar;
        this.f33730a = gVar;
        e3.a aVar3 = new e3.a();
        aVar3.f56999e = this;
        aVar3.f56996b = cVar;
        this.f33734e = aVar3;
        gVar.b();
        final Context context2 = gVar.f91217a;
        this.f33731b = context2;
        c1 c1Var = new c1();
        this.f33737h = mVar;
        this.f33732c = xVar;
        this.f33733d = new p(newSingleThreadExecutor);
        this.f33735f = scheduledThreadPoolExecutor;
        this.f33736g = threadPoolExecutor;
        gVar.b();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c1Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f33786b;

            {
                this.f33786b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r5 = this;
                    int r0 = r2
                    com.google.firebase.messaging.FirebaseMessaging r1 = r5.f33786b
                    switch(r0) {
                        case 0: goto L66;
                        default: goto L7;
                    }
                L7:
                    android.content.Context r0 = r1.f33731b
                    android.content.Context r1 = r0.getApplicationContext()
                    if (r1 != 0) goto L10
                    r1 = r0
                L10:
                    java.lang.String r2 = "com.google.firebase.messaging"
                    r3 = 0
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
                    java.lang.String r2 = "proxy_notification_initialized"
                    boolean r1 = r1.getBoolean(r2, r3)
                    if (r1 == 0) goto L20
                    goto L65
                L20:
                    java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
                    android.content.Context r2 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    r4 = 128(0x80, float:1.8E-43)
                    android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r2 == 0) goto L49
                    android.os.Bundle r3 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    boolean r3 = r3.containsKey(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    boolean r1 = r2.getBoolean(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    goto L4a
                L49:
                    r1 = 1
                L4a:
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r3 = 29
                    if (r2 < r3) goto L61
                    com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
                    r2.<init>()
                    com.google.firebase.messaging.o r3 = new com.google.firebase.messaging.o
                    r3.<init>(r0, r1, r2)
                    r3.run()
                    r2.getTask()
                    goto L65
                L61:
                    r0 = 0
                    com.google.android.gms.tasks.Tasks.forResult(r0)
                L65:
                    return
                L66:
                    e3.a r0 = r1.f33734e
                    boolean r0 = r0.k()
                    if (r0 == 0) goto L89
                    com.google.firebase.messaging.r r0 = r1.e()
                    boolean r0 = r1.h(r0)
                    if (r0 == 0) goto L89
                    monitor-enter(r1)
                    boolean r0 = r1.f33738i     // Catch: java.lang.Throwable -> L83
                    if (r0 != 0) goto L85
                    r2 = 0
                    r1.g(r2)     // Catch: java.lang.Throwable -> L83
                    goto L85
                L83:
                    r0 = move-exception
                    goto L87
                L85:
                    monitor-exit(r1)
                    goto L89
                L87:
                    monitor-exit(r1)
                    throw r0
                L89:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.j.run():void");
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new o.c("Firebase-Messaging-Topics-Io"));
        int i15 = x.f33827j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v vVar;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                m mVar2 = mVar;
                androidx.appcompat.widget.x xVar2 = xVar;
                synchronized (v.class) {
                    try {
                        WeakReference weakReference = v.f33819b;
                        vVar = weakReference != null ? (v) weakReference.get() : null;
                        if (vVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            v vVar2 = new v();
                            synchronized (vVar2) {
                                vVar2.f33820a = com.google.android.gms.common.api.internal.b0.c(sharedPreferences, scheduledExecutorService);
                            }
                            v.f33819b = new WeakReference(vVar2);
                            vVar = vVar2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return new x(firebaseMessaging, mVar2, vVar, xVar2, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new OnSuccessListener() { // from class: com.google.firebase.messaging.i
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                x xVar2 = (x) obj;
                if (!FirebaseMessaging.this.f33734e.k() || xVar2.f33835h.a() == null) {
                    return;
                }
                xVar2.d();
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f33786b;

            {
                this.f33786b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                /*
                    this = this;
                    int r0 = r2
                    com.google.firebase.messaging.FirebaseMessaging r1 = r5.f33786b
                    switch(r0) {
                        case 0: goto L66;
                        default: goto L7;
                    }
                L7:
                    android.content.Context r0 = r1.f33731b
                    android.content.Context r1 = r0.getApplicationContext()
                    if (r1 != 0) goto L10
                    r1 = r0
                L10:
                    java.lang.String r2 = "com.google.firebase.messaging"
                    r3 = 0
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
                    java.lang.String r2 = "proxy_notification_initialized"
                    boolean r1 = r1.getBoolean(r2, r3)
                    if (r1 == 0) goto L20
                    goto L65
                L20:
                    java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
                    android.content.Context r2 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    r4 = 128(0x80, float:1.8E-43)
                    android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r2 == 0) goto L49
                    android.os.Bundle r3 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    boolean r3 = r3.containsKey(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    boolean r1 = r2.getBoolean(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    goto L4a
                L49:
                    r1 = 1
                L4a:
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r3 = 29
                    if (r2 < r3) goto L61
                    com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
                    r2.<init>()
                    com.google.firebase.messaging.o r3 = new com.google.firebase.messaging.o
                    r3.<init>(r0, r1, r2)
                    r3.run()
                    r2.getTask()
                    goto L65
                L61:
                    r0 = 0
                    com.google.android.gms.tasks.Tasks.forResult(r0)
                L65:
                    return
                L66:
                    e3.a r0 = r1.f33734e
                    boolean r0 = r0.k()
                    if (r0 == 0) goto L89
                    com.google.firebase.messaging.r r0 = r1.e()
                    boolean r0 = r1.h(r0)
                    if (r0 == 0) goto L89
                    monitor-enter(r1)
                    boolean r0 = r1.f33738i     // Catch: java.lang.Throwable -> L83
                    if (r0 != 0) goto L85
                    r2 = 0
                    r1.g(r2)     // Catch: java.lang.Throwable -> L83
                    goto L85
                L83:
                    r0 = move-exception
                    goto L87
                L85:
                    monitor-exit(r1)
                    goto L89
                L87:
                    monitor-exit(r1)
                    throw r0
                L89:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.j.run():void");
            }
        });
    }

    public static void b(t tVar, long j13) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f33729m == null) {
                    f33729m = new ScheduledThreadPoolExecutor(1, new o.c("TAG"));
                }
                f33729m.schedule(tVar, j13, TimeUnit.SECONDS);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(nl.g.c());
        }
        return firebaseMessaging;
    }

    public static synchronized s d(Context context) {
        s sVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f33727k == null) {
                    f33727k = new s(context);
                }
                sVar = f33727k;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return sVar;
    }

    public static void f() {
        nl.g c13 = nl.g.c();
        c13.b();
        c13.f91217a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", true).apply();
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull nl.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            gVar.b();
            firebaseMessaging = (FirebaseMessaging) gVar.f91220d.a(FirebaseMessaging.class);
            com.bumptech.glide.d.u(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        r e13 = e();
        if (!h(e13)) {
            return e13.f33808a;
        }
        String b13 = m.b(this.f33730a);
        p pVar = this.f33733d;
        synchronized (pVar) {
            task = (Task) pVar.f33801b.get(b13);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b13);
                }
                androidx.appcompat.widget.x xVar = this.f33732c;
                task = xVar.j(xVar.D(m.b((nl.g) xVar.f16708a), "*", new Bundle())).onSuccessTask(this.f33736g, new l0.d(this, b13, e13, 13)).continueWithTask(pVar.f33800a, new androidx.fragment.app.c(11, pVar, b13));
                pVar.f33801b.put(b13, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + b13);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e14) {
            throw new IOException(e14);
        }
    }

    public final r e() {
        r b13;
        s d2 = d(this.f33731b);
        nl.g gVar = this.f33730a;
        gVar.b();
        String d13 = "[DEFAULT]".equals(gVar.f91218b) ? "" : gVar.d();
        String b14 = m.b(this.f33730a);
        synchronized (d2) {
            b13 = r.b(d2.f33811a.getString(d13 + "|T|" + b14 + "|*", null));
        }
        return b13;
    }

    public final synchronized void g(long j13) {
        b(new t(this, Math.min(Math.max(30L, 2 * j13), f33726j)), j13);
        this.f33738i = true;
    }

    public final boolean h(r rVar) {
        if (rVar != null) {
            String a13 = this.f33737h.a();
            if (System.currentTimeMillis() <= rVar.f33810c + r.f33807d && a13.equals(rVar.f33809b)) {
                return false;
            }
        }
        return true;
    }
}
