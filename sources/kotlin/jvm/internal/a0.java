package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public abstract class a0 extends e0 implements rl2.r {
    @Override // kotlin.jvm.internal.e
    public final rl2.c computeReflected() {
        return k0.f80436a.f(this);
    }

    @Override // rl2.r
    /* renamed from: getGetter */
    public final rl2.q mo176getGetter() {
        return ((rl2.r) getReflected()).mo176getGetter();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }
}
