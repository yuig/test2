package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c5 implements o4 {

    /* renamed from: g, reason: collision with root package name */
    public static final g1.g f31318g = new g1.g(0);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f31319a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f31320b;

    /* renamed from: c, reason: collision with root package name */
    public final d5 f31321c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f31322d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Map f31323e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f31324f;

    public c5(SharedPreferences sharedPreferences) {
        u4 u4Var = u4.f31657a;
        d5 d5Var = new d5();
        d5Var.f31356a = this;
        this.f31321c = d5Var;
        this.f31322d = new Object();
        this.f31324f = new ArrayList();
        this.f31319a = sharedPreferences;
        this.f31320b = u4Var;
        sharedPreferences.registerOnSharedPreferenceChangeListener(d5Var);
    }

    public static synchronized void a() {
        synchronized (c5.class) {
            try {
                Iterator it = ((g1.e) f31318g.values()).iterator();
                while (it.hasNext()) {
                    c5 c5Var = (c5) it.next();
                    c5Var.f31319a.unregisterOnSharedPreferenceChangeListener(c5Var.f31321c);
                }
                f31318g.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final Object zza(String str) {
        Map<String, ?> map = this.f31323e;
        if (map == null) {
            synchronized (this.f31322d) {
                try {
                    map = this.f31323e;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f31319a.getAll();
                            this.f31323e = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th3;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
