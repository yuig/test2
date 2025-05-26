package ht1;

import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w0 implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.c f70367a;

    /* renamed from: b, reason: collision with root package name */
    public float f70368b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f70369c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f70370d;

    public w0(float f13, et1.c component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f70367a = component;
        this.f70368b = (float) Math.pow(10.0d, Math.log(((-10069.049997948498d) / (Math.pow(f13 / 1.012373E8d, 0.5000346d) + 1.0d)) + 10069.05d) / Math.log(2.0d));
        this.f70369c = ByteBuffer.allocate(8192);
        lt1.f fVar = new lt1.f(this, 2);
        v0 v0Var = new v0(this);
        this.f70370d = v0Var;
        et1.v0 v0Var2 = (et1.v0) component;
        v0Var2.a(fVar, "Set Volume");
        v0Var2.a(v0Var, "Adjust Volume");
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70367a).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70367a).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70367a.j(callback);
    }

    public final String toString() {
        return "VolumeControl";
    }
}
