package mb;

import android.util.Log;
import e5.k;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import lb.i0;
import lb.t;
import nd.h;
import tb.e;

/* loaded from: classes.dex */
public final class d implements rd.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f86856a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f86857b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f86858c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f86859d;

    /* renamed from: e, reason: collision with root package name */
    public Object f86860e;

    public d(lb.b runnableScheduler, i0 launcher) {
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.f86857b = runnableScheduler;
        this.f86858c = launcher;
        this.f86856a = millis;
        this.f86859d = new Object();
        this.f86860e = new LinkedHashMap();
    }

    public final void a(t token) {
        Runnable runnable;
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this.f86859d) {
            runnable = (Runnable) ((Map) this.f86860e).remove(token);
        }
        if (runnable != null) {
            ((lb.b) this.f86857b).f82572a.removeCallbacks(runnable);
        }
    }

    public final synchronized kd.d b() {
        try {
            if (((kd.d) this.f86860e) == null) {
                this.f86860e = kd.d.m((File) this.f86858c, this.f86856a);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (kd.d) this.f86860e;
    }

    public final void c(t token) {
        Intrinsics.checkNotNullParameter(token, "token");
        k kVar = new k(14, this, token);
        synchronized (this.f86859d) {
        }
        lb.b bVar = (lb.b) this.f86857b;
        bVar.f82572a.postDelayed(kVar, this.f86856a);
    }

    @Override // rd.c
    public final synchronized void clear() {
        try {
            try {
                try {
                    b().d();
                } catch (IOException e13) {
                    if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                        Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e13);
                    }
                    synchronized (this) {
                        this.f86860e = null;
                    }
                }
                synchronized (this) {
                    this.f86860e = null;
                }
            } catch (Throwable th3) {
                synchronized (this) {
                    this.f86860e = null;
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // rd.c
    public final void g(h hVar, rd.b bVar) {
        rd.d dVar;
        kd.d b13;
        boolean z13;
        String g13 = ((e) this.f86857b).g(hVar);
        qq2.c cVar = (qq2.c) this.f86859d;
        synchronized (cVar) {
            dVar = (rd.d) ((Map) cVar.f104883b).get(g13);
            if (dVar == null) {
                rd.e eVar = (rd.e) cVar.f104884c;
                synchronized (eVar.f107497a) {
                    dVar = (rd.d) eVar.f107497a.poll();
                }
                if (dVar == null) {
                    dVar = new rd.d();
                }
                ((Map) cVar.f104883b).put(g13, dVar);
            }
            dVar.f107496b++;
        }
        dVar.f107495a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + g13 + " for for Key: " + hVar);
            }
            try {
                b13 = b();
            } catch (IOException e13) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e13);
                }
            }
            if (b13.h(g13) != null) {
                return;
            }
            m7.c f13 = b13.f(g13);
            if (f13 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(g13));
            }
            try {
                if (bVar.a(f13.b())) {
                    kd.d.a((kd.d) f13.f86118e, f13, true);
                    f13.f86115b = true;
                }
                if (!z13) {
                    try {
                        f13.a();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!f13.f86115b) {
                    try {
                        f13.a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((qq2.c) this.f86859d).r(g13);
        }
    }

    @Override // rd.c
    public final File l(h hVar) {
        String g13 = ((e) this.f86857b).g(hVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + g13 + " for for Key: " + hVar);
        }
        try {
            d h10 = b().h(g13);
            if (h10 != null) {
                return ((File[]) h10.f86859d)[0];
            }
            return null;
        } catch (IOException e13) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e13);
            return null;
        }
    }

    public d(long j13, File file) {
        this.f86859d = new qq2.c(6);
        this.f86858c = file;
        this.f86856a = j13;
        this.f86857b = new e(6);
    }

    public d(kd.d dVar, String str, long j13, File[] fileArr, long[] jArr) {
        this.f86860e = dVar;
        this.f86857b = str;
        this.f86856a = j13;
        this.f86859d = fileArr;
        this.f86858c = jArr;
    }
}
