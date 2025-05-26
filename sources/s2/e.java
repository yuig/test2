package s2;

import i2.r3;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f110625e;

    /* renamed from: f, reason: collision with root package name */
    public final i f110626f;

    public e(int i13, n nVar, Function1 function1, i iVar) {
        super(i13, nVar);
        this.f110625e = function1;
        this.f110626f = iVar;
        iVar.k();
    }

    @Override // s2.i
    public final void c() {
        if (this.f110644c) {
            return;
        }
        int i13 = this.f110643b;
        i iVar = this.f110626f;
        if (i13 != iVar.d()) {
            a();
        }
        iVar.l();
        super.c();
    }

    @Override // s2.i
    public final Function1 f() {
        return this.f110625e;
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
        kg.p.f0();
        throw null;
    }

    @Override // s2.i
    public final void l() {
        kg.p.f0();
        throw null;
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
        return new e(this.f110643b, this.f110642a, p.l(function1, this.f110625e, true), this.f110626f);
    }
}
