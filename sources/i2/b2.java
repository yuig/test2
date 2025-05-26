package i2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class b2 implements q1, ao2.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f71077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f71078b;

    public b2(q1 q1Var, CoroutineContext coroutineContext) {
        this.f71077a = coroutineContext;
        this.f71078b = q1Var;
    }

    @Override // ao2.j0
    public final CoroutineContext getCoroutineContext() {
        return this.f71077a;
    }

    @Override // i2.v3
    public final Object getValue() {
        return this.f71078b.getValue();
    }

    @Override // i2.q1
    public final void setValue(Object obj) {
        this.f71078b.setValue(obj);
    }
}
