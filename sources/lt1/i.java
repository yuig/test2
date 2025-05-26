package lt1;

import et1.h0;
import et1.v0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mt1.j;

/* loaded from: classes4.dex */
public final class i implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f84839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ et1.c f84840b;

    /* renamed from: c, reason: collision with root package name */
    public final j f84841c;

    /* renamed from: d, reason: collision with root package name */
    public final h f84842d;

    public i(h0 simpleProducerFactory, et1.c component, jt1.d entireStreamTimeSpan, long j13) {
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(entireStreamTimeSpan, "entireStreamTimeSpan");
        this.f84839a = j13;
        this.f84840b = component;
        simpleProducerFactory.getClass();
        j jVar = new j();
        this.f84841c = jVar;
        h hVar = new h(entireStreamTimeSpan, this);
        this.f84842d = hVar;
        v0 v0Var = (v0) component;
        v0Var.a(hVar, "Check for Gaps");
        v0Var.a(jVar, "On Gap Detected");
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((v0) this.f84840b).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((v0) this.f84840b).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f84840b.j(callback);
    }
}
