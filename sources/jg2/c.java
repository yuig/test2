package jg2;

import android.os.Process;
import ei2.k;
import ei2.q;
import ei2.v;
import gf2.w;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final zi2.b f76092a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f76093b;

    /* renamed from: c, reason: collision with root package name */
    public final v f76094c;

    /* renamed from: d, reason: collision with root package name */
    public final ki2.a f76095d;

    /* renamed from: e, reason: collision with root package name */
    public final ii2.d f76096e;

    /* renamed from: f, reason: collision with root package name */
    public final lh2.b f76097f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f76098g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f76099h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentLinkedQueue f76100i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f76101j;

    /* renamed from: k, reason: collision with root package name */
    public volatile Long f76102k;

    /* renamed from: l, reason: collision with root package name */
    public volatile String f76103l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Long f76104m;

    /* renamed from: n, reason: collision with root package name */
    public volatile Long f76105n;

    /* renamed from: o, reason: collision with root package name */
    public volatile Long f76106o;

    /* renamed from: p, reason: collision with root package name */
    public volatile Long f76107p;

    /* renamed from: q, reason: collision with root package name */
    public volatile Long f76108q;

    /* renamed from: r, reason: collision with root package name */
    public volatile Long f76109r;

    /* renamed from: s, reason: collision with root package name */
    public volatile Long f76110s;

    /* renamed from: t, reason: collision with root package name */
    public volatile String f76111t;

    /* renamed from: u, reason: collision with root package name */
    public volatile Boolean f76112u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f76113v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f76114w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f76115x;

    public c(zi2.b clock, nd2.a startupServiceProvider, v spanService, ki2.a backgroundWorker, ii2.d versionChecker, lh2.b logger) {
        Long l13;
        long startRequestedElapsedRealtime;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(startupServiceProvider, "startupServiceProvider");
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f76092a = clock;
        this.f76093b = startupServiceProvider;
        this.f76094c = spanService;
        this.f76095d = backgroundWorker;
        this.f76096e = versionChecker;
        this.f76097f = logger;
        this.f76100i = new ConcurrentLinkedQueue();
        this.f76101j = new ConcurrentHashMap();
        long c13 = c() - TimeUnit.NANOSECONDS.toMillis(clock.a());
        ii2.a aVar = (ii2.a) versionChecker;
        if (aVar.a(33)) {
            startRequestedElapsedRealtime = Process.getStartRequestedElapsedRealtime();
            l13 = Long.valueOf(startRequestedElapsedRealtime + c13);
        } else {
            l13 = null;
        }
        this.f76098g = l13;
        this.f76099h = aVar.a(24) ? Long.valueOf(Process.getStartElapsedRealtime() + c13) : null;
        this.f76113v = new AtomicBoolean(false);
        this.f76114w = new AtomicBoolean(false);
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        this.f76115x = aVar.a(29);
    }

    public final void a(q qVar) {
        for (Map.Entry entry : this.f76101j.entrySet()) {
            ((k) qVar).j((String) entry.getKey(), (String) entry.getValue());
        }
        Long b13 = w.b(this.f76098g, this.f76099h);
        if (b13 != null) {
            ((k) qVar).j("process-create-delay-ms", String.valueOf(b13.longValue()));
        }
        String str = this.f76103l;
        if (str != null) {
            ((k) qVar).j("startup-activity-name", str);
        }
        Long l13 = this.f76105n;
        if (l13 != null) {
            ((k) qVar).j("startup-activity-pre-created-ms", String.valueOf(l13.longValue()));
        }
        Long l14 = this.f76107p;
        if (l14 != null) {
            ((k) qVar).j("startup-activity-post-created-ms", String.valueOf(l14.longValue()));
        }
        Boolean bool = this.f76112u;
        if (bool != null) {
            ((k) qVar).j("embrace-init-in-foreground", String.valueOf(bool.booleanValue()));
        }
        Long l15 = this.f76104m;
        if (l15 != null) {
            ((k) qVar).j("first-activity-init-ms", String.valueOf(l15.longValue()));
        }
        String str2 = this.f76111t;
        if (str2 != null) {
            ((k) qVar).j("embrace-init-thread-name", str2);
        }
    }

    public final void b(Function0 function0) {
        if (this.f76114w.get()) {
            return;
        }
        synchronized (this.f76114w) {
            try {
                if (!this.f76114w.get()) {
                    this.f76095d.b(new s81.g(this, 27));
                    if (function0 != null) {
                        function0.invoke();
                    }
                    this.f76114w.set(true);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final long c() {
        return TimeUnit.NANOSECONDS.toMillis(this.f76092a.now());
    }
}
