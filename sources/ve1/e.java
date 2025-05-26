package ve1;

import ao2.j0;
import d7.g;
import do2.i;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.i0;
import l82.y;
import u50.o;
import u50.r;

/* loaded from: classes5.dex */
public final class e extends l82.b implements wt1.d {

    /* renamed from: c, reason: collision with root package name */
    public final y f125763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        a0 a0Var = new a0(scope);
        a0Var.f82204b = g.n(22, "stateTransformer");
        this.f125763c = a0.b(a0Var, new d(null, null, 7), null, 6);
    }

    @Override // l82.i
    public final i a() {
        return this.f125763c.d();
    }

    @Override // wt1.d
    public final o b(i0 i0Var, boolean z13) {
        d startState = (d) i0Var;
        Intrinsics.checkNotNullParameter(startState, "startState");
        return (c) this.f125763c.j(startState, z13);
    }

    @Override // l82.i
    public final r c() {
        return this.f125763c.e();
    }

    public e() {
        this(new l82.a());
    }
}
