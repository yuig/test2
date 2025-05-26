package s2;

import i2.r3;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f110638e;

    /* renamed from: f, reason: collision with root package name */
    public int f110639f;

    public g(int i13, n nVar, Function1 function1) {
        super(i13, nVar);
        this.f110638e = function1;
        this.f110639f = 1;
    }

    @Override // s2.i
    public final void c() {
        if (this.f110644c) {
            return;
        }
        l();
        super.c();
    }

    @Override // s2.i
    public final Function1 f() {
        return this.f110638e;
    }

    @Override // s2.i
    public final boolean g() {
        return true;
    }

    @Override // s2.i
    public final Function1 i() {
        return null;
    }

    @Override // s2.i
    public final void k() {
        this.f110639f++;
    }

    @Override // s2.i
    public final void l() {
        int i13 = this.f110639f - 1;
        this.f110639f = i13;
        if (i13 == 0) {
            a();
        }
    }

    @Override // s2.i
    public final void m() {
    }

    @Override // s2.i
    public final void n(z zVar) {
        r3 r3Var = p.f110666a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // s2.i
    public final i t(Function1 function1) {
        p.d(this);
        return new e(this.f110643b, this.f110642a, p.l(function1, this.f110638e, true), this);
    }
}
