package nj2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class m implements ui2.r, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f91035d = Logger.getLogger(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final s f91036a;

    /* renamed from: b, reason: collision with root package name */
    public final jf2.c f91037b = new jf2.c(new bg.c(this, 5));

    /* renamed from: c, reason: collision with root package name */
    public final aj2.h f91038c;

    public m(zi2.b bVar, f fVar, mj2.a aVar, Supplier supplier, rj2.d dVar, ArrayList arrayList, aj2.i iVar) {
        this.f91036a = new s(bVar, fVar, aVar, supplier, dVar, arrayList);
        this.f91038c = iVar;
    }

    @Override // ui2.r
    public final ui2.q a(String str) {
        if (str == null || str.isEmpty()) {
            f91035d.fine("Tracer requested without instrumentation scope name.");
            str = "";
        }
        return new l(this.f91037b, str);
    }

    @Override // ui2.r
    public final ui2.p c(String str) {
        return ((l) a(str)).build();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().b(TimeUnit.SECONDS);
    }

    public final zi2.c shutdown() {
        zi2.c cVar;
        if (this.f91036a.f91057i != null) {
            f91035d.log(Level.INFO, "Calling shutdown() multiple times.");
            return zi2.c.f142036e;
        }
        s sVar = this.f91036a;
        synchronized (sVar.f91049a) {
            try {
                if (sVar.f91057i != null) {
                    cVar = sVar.f91057i;
                } else {
                    sVar.f91057i = sVar.f91056h.shutdown();
                    cVar = sVar.f91057i;
                }
            } finally {
            }
        }
        return cVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SdkTracerProvider{clock=");
        s sVar = this.f91036a;
        sb3.append(sVar.f91050b);
        sb3.append(", idGenerator=");
        sb3.append(sVar.f91051c);
        sb3.append(", resource=");
        sb3.append(sVar.f91053e);
        sb3.append(", spanLimitsSupplier=");
        sb3.append((p) sVar.f91054f.get());
        sb3.append(", sampler=");
        sb3.append(sVar.f91055g);
        sb3.append(", spanProcessor=");
        sb3.append(sVar.f91056h);
        sb3.append('}');
        return sb3.toString();
    }
}
