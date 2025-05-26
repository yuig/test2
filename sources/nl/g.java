package nl;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import ao2.m0;
import com.google.android.gms.internal.measurement.q4;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import sl.m;
import tl.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f91215j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final g1.g f91216k = new g1.g(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f91217a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91218b;

    /* renamed from: c, reason: collision with root package name */
    public final i f91219c;

    /* renamed from: d, reason: collision with root package name */
    public final sl.h f91220d;

    /* renamed from: g, reason: collision with root package name */
    public final m f91223g;

    /* renamed from: h, reason: collision with root package name */
    public final cm.a f91224h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f91221e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f91222f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f91225i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, i iVar, String str) {
        ?? arrayList;
        int i13 = 0;
        new CopyOnWriteArrayList();
        this.f91217a = context;
        com.bumptech.glide.d.o(str);
        this.f91218b = str;
        this.f91219c = iVar;
        a aVar = lm.a.f83829a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new sl.d((String) it.next(), i13));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.INSTANCE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i14 = 1;
        arrayList3.add(new sl.d(new FirebaseCommonRegistrar(), i14));
        arrayList3.add(new sl.d(new ExecutorsRegistrar(), i14));
        arrayList4.add(sl.b.c(context, Context.class, new Class[0]));
        arrayList4.add(sl.b.c(this, g.class, new Class[0]));
        arrayList4.add(sl.b.c(iVar, i.class, new Class[0]));
        com.google.android.gms.common.api.d dVar = new com.google.android.gms.common.api.d(14);
        if (b7.c.C(context) && lm.a.f83830b.get()) {
            arrayList4.add(sl.b.c(aVar, a.class, new Class[0]));
        }
        sl.h hVar = new sl.h(lVar, arrayList3, arrayList4, dVar);
        this.f91220d = hVar;
        Trace.endSection();
        this.f91223g = new m(new c(i13, this, context));
        this.f91224h = hVar.f(am.c.class);
        d dVar2 = new d(this);
        b();
        if (this.f91221e.get()) {
            com.google.android.gms.common.api.internal.c.f30794e.f30795a.get();
        }
        this.f91225i.add(dVar2);
        Trace.endSection();
    }

    public static void a(g gVar, boolean z13) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = gVar.f91225i.iterator();
        while (it.hasNext()) {
            g gVar2 = ((d) it.next()).f91211a;
            if (z13) {
                gVar2.getClass();
            } else {
                ((am.c) gVar2.f91224h.get()).b();
            }
        }
    }

    public static g c() {
        g gVar;
        synchronized (f91215j) {
            try {
                gVar = (g) f91216k.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + oh.c.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((am.c) gVar.f91224h.get()).b();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return gVar;
    }

    public static g f(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f91212a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f91212a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        com.google.android.gms.common.api.internal.c.a(application);
                        com.google.android.gms.common.api.internal.c cVar = com.google.android.gms.common.api.internal.c.f30794e;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.f30797c.add(eVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f91215j) {
            g1.g gVar2 = f91216k;
            com.bumptech.glide.d.w("FirebaseApp name [DEFAULT] already exists!", !gVar2.containsKey("[DEFAULT]"));
            com.bumptech.glide.d.u(context, "Application context cannot be null.");
            gVar = new g(context, iVar, "[DEFAULT]");
            gVar2.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void b() {
        com.bumptech.glide.d.w("FirebaseApp was deleted", !this.f91222f.get());
    }

    public final String d() {
        StringBuilder sb3 = new StringBuilder();
        b();
        sb3.append(m0.s(this.f91218b.getBytes(Charset.defaultCharset())));
        sb3.append("+");
        b();
        sb3.append(m0.s(this.f91219c.f91232b.getBytes(Charset.defaultCharset())));
        return sb3.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!b7.c.C(this.f91217a)) {
            StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            b();
            sb3.append(this.f91218b);
            Log.i("FirebaseApp", sb3.toString());
            f.a(this.f91217a);
            return;
        }
        StringBuilder sb4 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        b();
        sb4.append(this.f91218b);
        Log.i("FirebaseApp", sb4.toString());
        sl.h hVar = this.f91220d;
        b();
        boolean equals = "[DEFAULT]".equals(this.f91218b);
        AtomicReference atomicReference = hVar.f113143f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference.compareAndSet(null, valueOf)) {
                synchronized (hVar) {
                    hashMap = new HashMap(hVar.f113138a);
                }
                hVar.g(hashMap, equals);
                break;
            } else if (atomicReference.get() != null) {
                break;
            }
        }
        ((am.c) this.f91224h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.b();
        return this.f91218b.equals(gVar.f91218b);
    }

    public final int hashCode() {
        return this.f91218b.hashCode();
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f91218b, "name");
        q4Var.m(this.f91219c, "options");
        return q4Var.toString();
    }
}
