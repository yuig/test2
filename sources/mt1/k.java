package mt1;

import et1.h0;
import et1.v0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ et1.c f88164a;

    /* renamed from: b, reason: collision with root package name */
    public Long f88165b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88166c;

    /* renamed from: d, reason: collision with root package name */
    public final j f88167d;

    /* renamed from: e, reason: collision with root package name */
    public final j f88168e;

    /* renamed from: f, reason: collision with root package name */
    public final ht1.f f88169f;

    public k(h0 simpleProducerFactory, et1.c component) {
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f88164a = component;
        simpleProducerFactory.getClass();
        j jVar = new j();
        this.f88167d = jVar;
        this.f88168e = jVar;
        ht1.f fVar = new ht1.f(this, 2);
        this.f88169f = fVar;
        v0 v0Var = (v0) component;
        v0Var.a(jVar, "On Run");
        v0Var.a(fVar, "Set Time");
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((v0) this.f88164a).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((v0) this.f88164a).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f88164a.j(callback);
    }

    public final String toString() {
        return "Throttle timeUs [" + this.f88165b + "] receivedEndOfInput? [" + this.f88166c + "]";
    }
}
