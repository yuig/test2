package mt1;

import et1.h0;
import et1.v0;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f88170a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f88171b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f88172c;

    /* renamed from: d, reason: collision with root package name */
    public final et1.c f88173d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f88174e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f88175f;

    /* renamed from: g, reason: collision with root package name */
    public final jg1.b f88176g;

    public l(h0 simpleProducerFactory, id1.a componentProvider) {
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        this.f88170a = 1000000L;
        this.f88171b = simpleProducerFactory;
        this.f88172c = componentProvider;
        et1.c cVar = (et1.c) componentProvider.get();
        this.f88173d = cVar;
        this.f88174e = new LinkedHashMap();
        jg1.b bVar = new jg1.b(this, 2);
        this.f88176g = bVar;
        ((v0) cVar).a(bVar, "Drive Throttle");
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((v0) this.f88173d).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((v0) this.f88173d).h(callback);
    }
}
