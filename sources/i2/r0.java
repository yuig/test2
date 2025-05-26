package i2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r0 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f71256a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f71257b;

    public r0(Function1 function1) {
        this.f71256a = function1;
    }

    @Override // i2.q2
    public final void a() {
        this.f71257b = (s0) this.f71256a.invoke(u.f71311g);
    }

    @Override // i2.q2
    public final void b() {
    }

    @Override // i2.q2
    public final void c() {
        s0 s0Var = this.f71257b;
        if (s0Var != null) {
            s0Var.dispose();
        }
        this.f71257b = null;
    }
}
