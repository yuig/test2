package ln2;

import am2.w0;

/* loaded from: classes2.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final vm2.f f84074a;

    /* renamed from: b, reason: collision with root package name */
    public final vm2.i f84075b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f84076c;

    public e0(vm2.f fVar, vm2.i iVar, w0 w0Var) {
        this.f84074a = fVar;
        this.f84075b = iVar;
        this.f84076c = w0Var;
    }

    public abstract ym2.c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
