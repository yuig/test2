package ht1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.c f70323a;

    /* renamed from: b, reason: collision with root package name */
    public nt1.c f70324b;

    /* renamed from: c, reason: collision with root package name */
    public final f f70325c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f70326d;

    public q0(et1.c component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f70323a = component;
        f fVar = new f(this, 1);
        this.f70325c = fVar;
        a0 a0Var = new a0(this, 1);
        this.f70326d = a0Var;
        et1.v0 v0Var = (et1.v0) component;
        v0Var.a(a0Var, "Generate Silence");
        v0Var.a(fVar, "Set Audio Format");
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70323a).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70323a).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70323a.j(callback);
    }

    public final String toString() {
        return "SilentAudioGenerator format=[" + this.f70324b + "]";
    }
}
