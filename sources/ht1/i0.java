package ht1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 implements e0, et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ et1.c f70242a;

    /* renamed from: b, reason: collision with root package name */
    public final lt1.b f70243b;

    /* renamed from: c, reason: collision with root package name */
    public final mt1.d f70244c;

    /* renamed from: d, reason: collision with root package name */
    public final mt1.d f70245d;

    /* renamed from: e, reason: collision with root package name */
    public final mt1.j f70246e;

    public i0(et1.c cVar, lt1.c cVar2, kotlin.jvm.internal.j0 j0Var, g gVar) {
        this.f70242a = cVar;
        this.f70243b = cVar2.f84804i;
        this.f70244c = (mt1.d) j0Var.f80434a;
        this.f70245d = gVar.f70224m;
        mt1.j jVar = cVar2.f84803h;
        Intrinsics.g(jVar, "null cannot be cast to non-null type com.pinterest.mediaPipeline.nodes.IProducer<kotlin.Any?>");
        this.f70246e = jVar;
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70242a).d(obj);
    }

    @Override // ht1.e0
    public final mt1.a e() {
        return this.f70243b;
    }

    @Override // ht1.e0
    public final mt1.d g() {
        return this.f70244c;
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70242a).h(callback);
    }

    @Override // ht1.e0
    public final mt1.d i() {
        return this.f70246e;
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70242a.j(callback);
    }

    @Override // ht1.e0
    public final mt1.d k() {
        return this.f70245d;
    }
}
