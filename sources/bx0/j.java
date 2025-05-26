package bx0;

import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.i0;
import nt.w0;
import zy.d0;
import zy.q0;

/* loaded from: classes5.dex */
public final class j implements wt1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24063a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final l82.y f24064b;

    public j(androidx.lifecycle.u scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        a0 a0Var = new a0(scope);
        w0 stateTransformer = new w0(new s02.m(1));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f24064b = a0.b(a0Var, new s02.k("", null), null, 6);
    }

    @Override // l82.i
    public final do2.i a() {
        int i13 = this.f24063a;
        l82.y yVar = this.f24064b;
        switch (i13) {
        }
        return yVar.d();
    }

    @Override // wt1.d
    public final u50.o b(i0 startState, boolean z13) {
        int i13 = this.f24063a;
        l82.y yVar = this.f24064b;
        switch (i13) {
            case 0:
                y startState2 = (y) startState;
                Intrinsics.checkNotNullParameter(startState2, "startState");
                return l.e((l) yVar.j(startState2, z13), 0, true, 7935);
            case 1:
                Intrinsics.checkNotNullParameter(startState, "startState");
                return yVar.j(startState, z13);
            default:
                s02.k startState3 = (s02.k) startState;
                Intrinsics.checkNotNullParameter(startState3, "startState");
                return (s02.j) yVar.j(startState3, z13);
        }
    }

    @Override // l82.i
    public final u50.r c() {
        int i13 = this.f24063a;
        l82.y yVar = this.f24064b;
        switch (i13) {
        }
        return yVar.e();
    }

    public j(ho2.c cVar, gx.n nVar) {
        a0 a0Var = new a0(cVar);
        a0Var.f82204b = d7.g.n(14, "stateTransformer");
        l82.y a13 = a0Var.a();
        d0 a14 = ((q0) nVar.f66273b).a();
        a13.a(a14, g.f24037k, g.f24038l, a14.a());
        mb0.a aVar = new mb0.a((ku1.l) nVar.f66274c);
        a13.a(aVar, g.f24039m, g.f24040n, aVar.a());
        this.f24064b = a13;
    }

    public j(l82.y yVar) {
        this.f24064b = yVar;
    }
}
