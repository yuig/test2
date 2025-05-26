package au0;

import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import dl1.l;
import hk2.k;
import jk2.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kt0.x;
import t90.n;
import uj2.a0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20472i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tp f20473j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f20474k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(tp tpVar, d dVar, int i13) {
        super(1);
        this.f20472i = i13;
        this.f20473j = tpVar;
        this.f20474k = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20472i;
        d dVar = this.f20474k;
        switch (i13) {
            case 0:
                tp e13 = tp.e(this.f20473j, null, null, null, null, null, null, null, (String) obj, null, null, null, null, 3967);
                b bVar = new b(dVar, 2);
                e0 M = ((l) dVar.f20475a).M(dVar.f20476b.d());
                a0 a0Var = tk2.e.f118017c;
                k e14 = new hk2.h(M.h(a0Var).e(a0Var), new wr0.l(18, new c(e13, dVar, 1)), 1).e(wj2.c.a());
                hk2.b bVar2 = new hk2.b(new x(18, new n(7, bVar)), new x(19, new n(8, bVar)), ck2.i.f27923c);
                e14.f(bVar2);
                Intrinsics.checkNotNullExpressionValue(bVar2, "subscribe(...)");
                dVar.addDisposable(bVar2);
                break;
            default:
                ln0 data = (ln0) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                ln0 a13 = ln0.a(data, null, this.f20473j, null, null, null, null, false, null, null, null, null, 16379);
                ((l) dVar.f20475a).W(a13);
                tp pageData = a13.getPageData();
                ag1.b bVar3 = dVar.f20476b;
                bVar3.f15133f = pageData;
                bVar3.f(a13.getMetadata());
                break;
        }
        return Unit.f80348a;
    }
}
