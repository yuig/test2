package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n4 implements o4 {

    /* renamed from: h, reason: collision with root package name */
    public static final g1.g f31544h = new g1.g(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f31545i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f31546a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f31547b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f31548c;

    /* renamed from: d, reason: collision with root package name */
    public final h6.y f31549d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f31550e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map f31551f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f31552g;

    public n4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        h6.y yVar = new h6.y(this);
        this.f31549d = yVar;
        this.f31550e = new Object();
        this.f31552g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f31546a = contentResolver;
        this.f31547b = uri;
        this.f31548c = runnable;
        contentResolver.registerContentObserver(uri, false, yVar);
    }

    public static n4 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        n4 n4Var;
        synchronized (n4.class) {
            g1.g gVar = f31544h;
            n4Var = (n4) gVar.get(uri);
            if (n4Var == null) {
                try {
                    n4 n4Var2 = new n4(contentResolver, uri, runnable);
                    try {
                        gVar.put(uri, n4Var2);
                    } catch (SecurityException unused) {
                    }
                    n4Var = n4Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return n4Var;
    }

    public static synchronized void c() {
        synchronized (n4.class) {
            try {
                Iterator it = ((g1.e) f31544h.values()).iterator();
                while (it.hasNext()) {
                    n4 n4Var = (n4) it.next();
                    n4Var.f31546a.unregisterContentObserver(n4Var.f31549d);
                }
                f31544h.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    public final Map b() {
        Map map;
        Object j13;
        Map map2 = this.f31551f;
        Map map3 = map2;
        if (map2 == null) {
            synchronized (this.f31550e) {
                try {
                    ?? r03 = this.f31551f;
                    Map map4 = r03;
                    if (r03 == 0) {
                        try {
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bb.p pVar = new bb.p(this, 20);
                                try {
                                    j13 = pVar.j();
                                } catch (SecurityException unused) {
                                    long clearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        j13 = pVar.j();
                                    } finally {
                                        Binder.restoreCallingIdentity(clearCallingIdentity);
                                    }
                                }
                                map = (Map) j13;
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                map = null;
                            }
                            this.f31551f = map;
                            map4 = map;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(r03);
                            throw th3;
                        }
                    }
                } finally {
                }
            }
        }
        return map3 != null ? map3 : Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final /* synthetic */ Object zza(String str) {
        return (String) b().get(str);
    }
}
