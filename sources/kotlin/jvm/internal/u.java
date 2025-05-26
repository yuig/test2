package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class u extends y implements rl2.j {
    @Override // kotlin.jvm.internal.e
    public rl2.c computeReflected() {
        return k0.f80436a.d(this);
    }

    @Override // rl2.r
    public Object getDelegate() {
        return ((rl2.j) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // rl2.r
    public rl2.q getGetter() {
        return ((rl2.j) getReflected()).getGetter();
    }

    @Override // rl2.m
    public rl2.i getSetter() {
        return ((rl2.j) getReflected()).getSetter();
    }
}
