package bj2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import jk.v;

/* loaded from: classes4.dex */
public final class k implements si2.f, Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f23003e = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final d f23004a;

    /* renamed from: b, reason: collision with root package name */
    public final jf2.c f23005b;

    /* renamed from: c, reason: collision with root package name */
    public final aj2.h f23006c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23007d;

    public k(mj2.a aVar, Supplier supplier, List list, zi2.b bVar, aj2.i iVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((c) it.next());
        }
        c eVar = arrayList.isEmpty() ? f.f22990a : arrayList.size() == 1 ? (c) arrayList.get(0) : new e(new ArrayList(arrayList));
        this.f23004a = new d(aVar, supplier, eVar, bVar);
        this.f23005b = new jf2.c(new bg.c(this, 2));
        this.f23006c = iVar;
        this.f23007d = eVar instanceof f;
    }

    @Override // si2.f
    public final si2.e a(String str) {
        if (this.f23007d) {
            return ((si2.f) v.q(si2.b.f113009a, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).a(str);
        }
        if (str.isEmpty()) {
            f23003e.fine("Logger requested without instrumentation scope name.");
            str = "unknown";
        }
        return new j(this.f23005b, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().b(TimeUnit.SECONDS);
    }

    @Override // si2.f
    public final si2.d get() {
        return (si2.d) this.f23005b.g(qi2.a.f104005d, "noop", null, null);
    }

    public final zi2.c shutdown() {
        zi2.c cVar;
        if (this.f23004a.f22987f != null) {
            f23003e.log(Level.INFO, "Calling shutdown() multiple times.");
            return zi2.c.f142036e;
        }
        d dVar = this.f23004a;
        synchronized (dVar.f22982a) {
            try {
                if (dVar.f22987f != null) {
                    cVar = dVar.f22987f;
                } else {
                    dVar.f22987f = dVar.f22985d.shutdown();
                    cVar = dVar.f22987f;
                }
            } finally {
            }
        }
        return cVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SdkLoggerProvider{clock=");
        d dVar = this.f23004a;
        sb3.append(dVar.f22986e);
        sb3.append(", resource=");
        sb3.append(dVar.f22983b);
        sb3.append(", logLimits=");
        sb3.append((a) dVar.f22984c.get());
        sb3.append(", logRecordProcessor=");
        sb3.append(dVar.f22985d);
        sb3.append('}');
        return sb3.toString();
    }
}
