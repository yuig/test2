package u60;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import dl1.s0;
import dl1.u0;
import java.util.Iterator;
import java.util.List;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120811i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f120812j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(x xVar, int i13) {
        super(1);
        this.f120811i = i13;
        this.f120812j = xVar;
    }

    public final void b(s0 s0Var) {
        Object obj;
        Object obj2;
        List list;
        Object obj3;
        int i13 = this.f120811i;
        x xVar = this.f120812j;
        switch (i13) {
            case 1:
                xVar.f120814a0 = xVar.N.t();
                int i14 = w.f120813a[s0Var.f55285a.ordinal()];
                if (i14 == 1) {
                    ba baVar = (ba) s0Var.f55286b;
                    Iterator it = xVar.d().iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i15 = -1;
                        } else if (!Intrinsics.d(((dl1.s) it.next()).getUid(), baVar.getUid())) {
                            i15++;
                        }
                    }
                    if (i15 >= 0 && i15 < xVar.d().size()) {
                        xVar.u1(i15, baVar);
                        break;
                    }
                } else {
                    com.pinterest.feature.board.detail.b bVar = xVar.O;
                    if (i14 == 2) {
                        if (xVar.f49127q.size() == 0) {
                            xVar.f120815b0 = true;
                        }
                        ((hl0.v) bVar).N3();
                        break;
                    } else if (i14 == 3) {
                        ((hl0.v) bVar).N3();
                        break;
                    }
                }
                break;
            default:
                xVar.f120816c0 = xVar.W.t();
                if (s0Var.f55285a == u0.CREATE) {
                    f30 f30Var = (f30) s0Var.f55286b;
                    if (xVar.f0()) {
                        Iterator it2 = xVar.d().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                dl1.s sVar = (dl1.s) obj;
                                if (!(sVar instanceof vh) || !Intrinsics.d(((vh) sVar).q(), "board_shop_tool_module") || !u2.H0(sVar)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        vh vhVar = obj instanceof vh ? (vh) obj : null;
                        if (vhVar == null || (list = vhVar.f42865w) == null) {
                            obj2 = null;
                        } else {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj3 = it3.next();
                                    dl1.s sVar2 = (dl1.s) obj3;
                                    if (sVar2 instanceof f30) {
                                        f30 f30Var2 = (f30) sVar2;
                                        if (!Intrinsics.d(f30Var.z4(), f30Var2.z4()) && !Intrinsics.d(f30Var.getUid(), f30Var2.getUid())) {
                                        }
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            obj2 = (dl1.s) obj3;
                        }
                        f30 f30Var3 = obj2 instanceof f30 ? (f30) obj2 : null;
                        if (f30Var3 != null) {
                            ((oj0.f) xVar.f120817d0.getValue()).b(f30Var, f30Var3);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        int i13 = this.f120811i;
        x xVar = this.f120812j;
        switch (i13) {
            case 0:
                s0 it = (s0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ba baVar = (ba) it.f55286b;
                xVar.getClass();
                boolean[] zArr = baVar.f36034k;
                if (zArr.length > 2 && zArr[2]) {
                    v7 u13 = baVar.u();
                    if (Intrinsics.d(u13 != null ? u13.getUid() : null, xVar.L)) {
                        z13 = true;
                        return Boolean.valueOf(z13);
                    }
                }
                z13 = false;
                return Boolean.valueOf(z13);
            case 1:
                b((s0) obj);
                return Unit.f80348a;
            case 2:
                switch (i13) {
                    case 2:
                        ((hl0.v) xVar.O).N3();
                        break;
                    default:
                        ((hl0.v) xVar.O).N3();
                        break;
                }
                return Unit.f80348a;
            case 3:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(null, "event");
                String str = xVar.L;
                throw null;
            case 4:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                xVar.i2();
                return Unit.f80348a;
            case 5:
                b((s0) obj);
                return Unit.f80348a;
            default:
                switch (i13) {
                    case 2:
                        ((hl0.v) xVar.O).N3();
                        break;
                    default:
                        ((hl0.v) xVar.O).N3();
                        break;
                }
                return Unit.f80348a;
        }
    }
}
