package dl1;

import java.util.ArrayList;
import jk2.i1;
import jk2.i2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55261i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f55262j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f55263k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f55264l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(q0 q0Var, m mVar, Function1 function1, int i13) {
        super(1);
        this.f55261i = i13;
        this.f55262j = q0Var;
        this.f55263k = mVar;
        this.f55264l = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f55261i;
        int i14 = 0;
        m mVar = this.f55263k;
        q0 q0Var = this.f55262j;
        switch (i13) {
            case 0:
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                return new i2(q0Var.p(mVar, true).t(new com.pinterest.framework.multisection.datasource.pagedlist.h(20, new aw0.j(this.f55264l, this.f55262j, this.f55263k, error, 23))), uj2.q.r(new c0(error)), 0);
            default:
                lb0.i optional = (lb0.i) obj;
                Intrinsics.checkNotNullParameter(optional, "optional");
                ArrayList arrayList = new ArrayList();
                s sVar = (s) optional.f82710a;
                if (sVar != null) {
                    i1 y13 = uj2.q.y(sVar);
                    Intrinsics.checkNotNullExpressionValue(y13, "just(...)");
                    arrayList.add(y13);
                }
                jk2.n0 n0Var = new jk2.n0(q0Var.f55269b.c(mVar, (s) optional.f82710a).b(new b22.f(2, new g(q0Var.f55271d, 18))).j().t(new com.pinterest.framework.multisection.datasource.pagedlist.h(17, new d0(q0Var, mVar, 3))), new com.pinterest.framework.multisection.datasource.pagedlist.h(18, new p0(q0Var, mVar, this.f55264l, i14)), false, 3);
                Intrinsics.checkNotNullExpressionValue(n0Var, "onErrorResumeNext(...)");
                arrayList.add(n0Var);
                return uj2.q.k(arrayList);
        }
    }
}
