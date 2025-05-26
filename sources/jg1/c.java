package jg1;

import et1.h0;
import et1.u0;
import et1.v0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements et1.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final et1.c f75920a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f75921b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f75922c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f75923d;

    /* renamed from: e, reason: collision with root package name */
    public final b f75924e;

    /* renamed from: f, reason: collision with root package name */
    public final b f75925f;

    /* renamed from: g, reason: collision with root package name */
    public final mt1.j f75926g;

    /* renamed from: h, reason: collision with root package name */
    public final mt1.j f75927h;

    public c(h0 simpleProducerFactory, et1.c component) {
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f75920a = component;
        b bVar = new b(this, 0);
        this.f75924e = bVar;
        b bVar2 = new b(this, 1);
        this.f75925f = bVar2;
        simpleProducerFactory.getClass();
        mt1.j jVar = new mt1.j();
        this.f75926g = jVar;
        this.f75927h = jVar;
        v0 v0Var = (v0) component;
        v0Var.a(jVar, "On Try Step Pipeline");
        v0Var.a(bVar2, "Notify Pipeline was Stepped");
        v0Var.a(bVar, "Notify Pipeline Finished");
    }

    @Override // jg1.g
    public final void a() {
        if (this.f75923d) {
            return;
        }
        this.f75923d = true;
        this.f75926g.f();
    }

    @Override // jg1.g
    public final boolean b() {
        return this.f75922c;
    }

    @Override // jg1.g
    public final boolean c() {
        if (this.f75922c) {
            return false;
        }
        nt1.h.b(new ee1.d(this, 12), null);
        boolean z13 = this.f75921b;
        this.f75921b = false;
        return z13;
    }

    @Override // jg1.g
    public final void cancel() {
        ((u0) ((v0) this.f75920a).f60109a).f60108f = true;
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((v0) this.f75920a).d(obj);
    }

    @Override // jg1.g
    public final void f() {
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((v0) this.f75920a).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f75920a.j(callback);
    }

    public final String toString() {
        boolean z13 = this.f75922c;
        boolean z14 = this.f75921b;
        boolean z15 = this.f75923d;
        StringBuilder sb3 = new StringBuilder("Composer Pipeline Adapter finished=[");
        sb3.append(z13);
        sb3.append("] stepped=[");
        sb3.append(z14);
        sb3.append("] signalledDoneProducing=[");
        return a.a.r(sb3, z15, "]");
    }
}
