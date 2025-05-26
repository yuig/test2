package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class w extends y implements rl2.l {
    @Override // kotlin.jvm.internal.e
    public final rl2.c computeReflected() {
        return k0.f80436a.e(this);
    }

    @Override // rl2.t
    public final rl2.s getGetter() {
        return ((rl2.l) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((x) this).get(obj);
    }

    @Override // rl2.m
    public final rl2.k getSetter() {
        return ((rl2.l) getReflected()).getSetter();
    }
}
