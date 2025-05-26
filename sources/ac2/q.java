package ac2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes2.dex */
public final class q implements l8.e, g7.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final lb0.q f2026b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2027c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2028d;

    /* renamed from: e, reason: collision with root package name */
    public final d7.e f2029e;

    /* renamed from: f, reason: collision with root package name */
    public final h1.b f2030f;

    /* renamed from: g, reason: collision with root package name */
    public final l8.b0 f2031g;

    /* renamed from: h, reason: collision with root package name */
    public int f2032h;

    /* renamed from: i, reason: collision with root package name */
    public long f2033i;

    /* renamed from: j, reason: collision with root package name */
    public long f2034j;

    /* renamed from: k, reason: collision with root package name */
    public long f2035k;

    /* renamed from: l, reason: collision with root package name */
    public long f2036l;

    /* renamed from: m, reason: collision with root package name */
    public int f2037m;

    /* renamed from: n, reason: collision with root package name */
    public long f2038n;

    /* renamed from: o, reason: collision with root package name */
    public long f2039o;

    public q(Context context, lb0.q prefsManagerPersisted) {
        String countryCode = d7.n0.y(context);
        Intrinsics.checkNotNullExpressionValue(countryCode, "getCountryCode(...)");
        d7.g0 clock = d7.e.f53809a;
        Intrinsics.checkNotNullExpressionValue(clock, "DEFAULT");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f2026b = prefsManagerPersisted;
        this.f2027c = countryCode;
        this.f2028d = true;
        this.f2029e = clock;
        this.f2030f = new h1.b(22);
        d7.b0 b13 = d7.b0.b(context);
        Intrinsics.checkNotNullExpressionValue(b13, "getInstance(...)");
        this.f2031g = new l8.b0(2000);
        int d2 = b13.d();
        this.f2037m = d2;
        long j13 = l8.o.j(d2, countryCode);
        this.f2038n = i(d2) ? prefsManagerPersisted.a("PREF_BITRATE_ESTIMATE_CELL", j13) : prefsManagerPersisted.a("PREF_BITRATE_ESTIMATE_WIFI", j13);
        b13.h(new d7.y() { // from class: ac2.p
            @Override // d7.y
            public final void a(int i13) {
                q qVar = q.this;
                synchronized (qVar) {
                    int i14 = qVar.f2037m;
                    if (i14 == 0 || qVar.f2028d) {
                        if (i14 == i13) {
                            return;
                        }
                        qVar.f2037m = i13;
                        if (i13 == 0 || i13 == 1 || i13 == 8) {
                            return;
                        }
                        long j14 = l8.o.j(i13, qVar.f2027c);
                        boolean i15 = q.i(i13);
                        lb0.q qVar2 = qVar.f2026b;
                        qVar.f2038n = i15 ? qVar2.a("PREF_BITRATE_ESTIMATE_CELL", j14) : qVar2.a("PREF_BITRATE_ESTIMATE_WIFI", j14);
                        ((d7.g0) qVar.f2029e).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        qVar.j(qVar.f2032h > 0 ? (int) (elapsedRealtime - qVar.f2033i) : 0, qVar.f2034j, qVar.f2038n);
                        qVar.f2033i = elapsedRealtime;
                        qVar.f2034j = 0L;
                        qVar.f2036l = 0L;
                        qVar.f2035k = 0L;
                        l8.b0 b0Var = qVar.f2031g;
                        b0Var.f81997b.clear();
                        b0Var.f81999d = -1;
                        b0Var.f82000e = 0;
                        b0Var.f82001f = 0;
                    }
                }
            }
        }, new d7.w(new Handler(Looper.getMainLooper()), 0));
    }

    public static boolean i(int i13) {
        return i13 == 3 || i13 == 4 || i13 == 5 || i13 == 9 || i13 == 10 || i13 == 6;
    }

    @Override // g7.a0
    public final synchronized void a(g7.f source, g7.i dataSpec, boolean z13) {
        try {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
            if (!z13 || dataSpec.c(8)) {
                return;
            }
            if (this.f2032h == 0) {
                ((d7.g0) this.f2029e).getClass();
                this.f2033i = SystemClock.elapsedRealtime();
            }
            this.f2032h++;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // l8.e
    public final void b(l8.d eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f2030f.k(eventListener);
    }

    @Override // l8.e
    public final g7.a0 c() {
        return this;
    }

    @Override // g7.a0
    public final synchronized void d(g7.f source, g7.i dataSpec, boolean z13) {
        try {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
            if (!z13 || dataSpec.c(8)) {
                return;
            }
            if (this.f2032h <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            ((d7.g0) this.f2029e).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i13 = (int) (elapsedRealtime - this.f2033i);
            this.f2035k += i13;
            long j13 = this.f2036l;
            long j14 = this.f2034j;
            this.f2036l = j13 + j14;
            if (i13 > 0) {
                this.f2031g.a((int) Math.sqrt(j14), (j14 * 8000.0f) / i13);
                if (this.f2035k < CameraPreview.AUTOFOCUS_INTERVAL_MILLIS) {
                    if (this.f2036l >= 524288) {
                    }
                    j(i13, this.f2034j, this.f2038n);
                    this.f2033i = elapsedRealtime;
                    this.f2034j = 0L;
                }
                this.f2038n = (long) this.f2031g.b();
                j(i13, this.f2034j, this.f2038n);
                this.f2033i = elapsedRealtime;
                this.f2034j = 0L;
            }
            this.f2032h--;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // l8.e
    public final synchronized long e() {
        return this.f2038n;
    }

    @Override // g7.a0
    public final void f(g7.f source, g7.i dataSpec) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
    }

    @Override // g7.a0
    public final synchronized void g(g7.f source, g7.i dataSpec, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        if (!z13 || dataSpec.c(8)) {
            return;
        }
        this.f2034j += i13;
    }

    @Override // l8.e
    public final void h(Handler eventHandler, l8.d eventListener) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        h1.b bVar = this.f2030f;
        bVar.getClass();
        eventListener.getClass();
        bVar.k(eventListener);
        ((CopyOnWriteArrayList) bVar.f66449b).add(new l8.c(eventHandler, eventListener));
    }

    public final void j(int i13, long j13, long j14) {
        if (i13 == 0 && j13 == 0 && j14 == this.f2039o) {
            return;
        }
        this.f2039o = j14;
        this.f2030f.a(i13, j13, j14);
        boolean i14 = i(this.f2037m);
        lb0.q qVar = this.f2026b;
        if (i14) {
            qVar.c("PREF_BITRATE_ESTIMATE_CELL", j14);
        } else {
            qVar.c("PREF_BITRATE_ESTIMATE_WIFI", j14);
        }
    }
}
