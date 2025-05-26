package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class c0 extends e0 implements rl2.t {
    @Override // kotlin.jvm.internal.e
    public final rl2.c computeReflected() {
        return k0.f80436a.g(this);
    }

    @Override // rl2.t
    public final rl2.s getGetter() {
        return ((rl2.t) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
