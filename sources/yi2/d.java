package yi2;

import bj2.k;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import nj2.m;

/* loaded from: classes4.dex */
public final class d implements pi2.b, Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f139176f = Logger.getLogger(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f139177a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final c f139178b;

    /* renamed from: c, reason: collision with root package name */
    public final b f139179c;

    /* renamed from: d, reason: collision with root package name */
    public final a f139180d;

    /* renamed from: e, reason: collision with root package name */
    public final xi2.a f139181e;

    public d(m mVar, fj2.d dVar, k kVar, xi2.a aVar) {
        this.f139178b = new c(mVar);
        this.f139179c = new b(dVar);
        this.f139180d = new a(kVar);
        this.f139181e = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zi2.c c13;
        if (this.f139177a.compareAndSet(false, true)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f139178b.f139175a.shutdown());
            arrayList.add(this.f139179c.f139174a.shutdown());
            arrayList.add(this.f139180d.f139173a.shutdown());
            c13 = zi2.c.c(arrayList);
        } else {
            f139176f.info("Multiple shutdown calls");
            c13 = zi2.c.f142036e;
        }
        c13.b(TimeUnit.SECONDS);
    }

    public final String toString() {
        return "OpenTelemetrySdk{tracerProvider=" + this.f139178b.f139175a + ", meterProvider=" + this.f139179c.f139174a + ", loggerProvider=" + this.f139180d.f139173a + ", propagators=" + this.f139181e + "}";
    }
}
