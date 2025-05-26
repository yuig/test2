package pn2;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public final on2.u f100778b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f100779c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.l f100780d;

    public d0(on2.u storageManager, Function0 computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f100778b = storageManager;
        this.f100779c = computation;
        on2.q qVar = (on2.q) storageManager;
        qVar.getClass();
        this.f100780d = new on2.l(qVar, computation);
    }

    public final b0 A0() {
        return (b0) this.f100780d.invoke();
    }

    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        on2.l lVar = this.f100780d;
        return (lVar.f96777c == on2.o.NOT_COMPUTED || lVar.f96777c == on2.o.COMPUTING) ? "<Not computed yet>" : A0().toString();
    }

    @Override // pn2.b0
    public final List u0() {
        return A0().u0();
    }

    @Override // pn2.b0
    public final u0 v0() {
        return A0().v0();
    }

    @Override // pn2.b0
    public final in2.n w() {
        return A0().w();
    }

    @Override // pn2.b0
    public final b1 w0() {
        return A0().w0();
    }

    @Override // pn2.b0
    public final boolean x0() {
        return A0().x0();
    }

    @Override // pn2.b0
    public final b0 y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new d0(this.f100778b, new xh2.a(5, kotlinTypeRefiner, this));
    }

    @Override // pn2.b0
    public final v1 z0() {
        b0 A0 = A0();
        while (A0 instanceof d0) {
            A0 = ((d0) A0).A0();
        }
        Intrinsics.g(A0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (v1) A0;
    }
}
