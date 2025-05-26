package sv;

import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115321i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f115322j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(o oVar, int i13) {
        super(1);
        this.f115321i = i13;
        this.f115322j = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool;
        com.pinterest.api.model.g t33;
        int i13 = this.f115321i;
        o oVar = this.f115322j;
        switch (i13) {
            case 0:
                c0 it = (c0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                l lVar = (l) oVar;
                return c0.b(it, null, lVar.f115305a, lVar.f115306b, 31);
            default:
                i it2 = (i) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                f30 f30Var = ((j) oVar).f115303a;
                if (f30Var == null || (t33 = f30Var.t3()) == null || (bool = t33.f0()) == null) {
                    bool = Boolean.FALSE;
                }
                return i.e(it2, 0, null, null, bool.booleanValue(), f30Var, false, 79);
        }
    }
}
