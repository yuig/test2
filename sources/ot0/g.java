package ot0;

import com.pinterest.api.model.jq;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import dl1.l;
import dl1.t;
import jk2.e0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kt0.x;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97522i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f97523j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v7 f97524k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v7 v7Var, i iVar) {
        super(1);
        this.f97524k = v7Var;
        this.f97523j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f97522i;
        v7 v7Var = this.f97524k;
        i iVar = this.f97523j;
        switch (i13) {
            case 0:
                ln0 ln0Var = (ln0) obj;
                tp pageData = ln0Var.getPageData();
                if (pageData != null) {
                    String uid = v7Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    Pair X = pageData.X(uid, v7Var);
                    tp tpVar = (tp) X.f80346a;
                    jq jqVar = (jq) X.f80347b;
                    ln0 J2 = ln0Var.J(tpVar, true);
                    t tVar = iVar.f97527z0;
                    if (tVar == null) {
                        Intrinsics.r("storyPinLocalDataRepository");
                        throw null;
                    }
                    ((l) tVar).W(J2);
                    iVar.f7().d(new hv0.e(jqVar.getConfig().getId()));
                    iVar.z(f.f97521i);
                    GestaltTextField gestaltTextField = iVar.F0;
                    if (gestaltTextField == null) {
                        Intrinsics.r("searchBar");
                        throw null;
                    }
                    hf0.b.k(gestaltTextField);
                }
                return Unit.f80348a;
            default:
                t tVar2 = iVar.f97527z0;
                if (tVar2 == null) {
                    Intrinsics.r("storyPinLocalDataRepository");
                    throw null;
                }
                ag1.b bVar = iVar.A0;
                if (bVar == null) {
                    Intrinsics.r("dataManager");
                    throw null;
                }
                e0 M = ((l) tVar2).M(bVar.d());
                hk2.b bVar2 = new hk2.b(new x(6, new g(v7Var, iVar)), new x(7, new h(iVar, 0)), ck2.i.f27923c);
                M.f(bVar2);
                iVar.R6(bVar2);
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, v7 v7Var) {
        super(1);
        this.f97523j = iVar;
        this.f97524k = v7Var;
    }
}
