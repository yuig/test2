package gz;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;

/* loaded from: classes3.dex */
public final class p extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final y f66353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, j0 scope, i anketQuestionSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(anketQuestionSEP, "anketQuestionSEP");
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(3, "stateTransformer");
        this.f66353c = a0.b(a0Var, new o(str), new wt.c(anketQuestionSEP, 23), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f66353c.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f66353c.e();
    }
}
