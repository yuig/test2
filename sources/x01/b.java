package x01;

import com.pinterest.api.model.vh;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import h32.a4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import lh0.z3;
import ll.j;
import ry.d;
import ry.g;
import ry.h;
import tl1.i;
import wt1.c0;
import wt1.k;
import wt1.o;
import wt1.p;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131278i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f131279j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(1);
        this.f131278i = i13;
        this.f131279j = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r03;
        boolean y93;
        List list;
        int i13 = this.f131278i;
        c cVar = this.f131279j;
        switch (i13) {
            case 0:
                c0 c0Var = (c0) obj;
                if (c0Var instanceof k) {
                    j jVar = cVar.f131282c;
                    a4 k03 = ((PinCloseupFragment) cVar.f131280a).getK0();
                    jVar.f83754b = k03;
                    new h(k03).i();
                    new ry.b(19, 0).i();
                    new g(19, 0).i();
                } else if (c0Var instanceof p) {
                    i iVar = c0Var.f131096b;
                    o oVar = iVar instanceof o ? (o) iVar : null;
                    if (oVar == null || (list = oVar.f131124b) == null) {
                        r03 = q0.f80391a;
                    } else {
                        r03 = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof dl1.s) {
                                r03.add(obj2);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (Iterable) r03) {
                        if (obj3 instanceof vh) {
                            arrayList.add(obj3);
                        }
                    }
                    String Z = CollectionsKt.Z(arrayList, ",", null, null, 0, null, a.f131277i, 30);
                    Boolean bool = cVar.f131283d;
                    if (bool != null) {
                        y93 = bool.booleanValue();
                    } else {
                        PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) cVar.f131280a;
                        y93 = pinCloseupFragment.q9().U(z3.DO_NOT_ACTIVATE_EXPERIMENT) ? pinCloseupFragment.y9(pinCloseupFragment.s9()) : pinCloseupFragment.u8();
                    }
                    cVar.f131282c.getClass();
                    new ry.a().i();
                    String str = cVar.f131284e;
                    if (str != null) {
                        Z = str;
                    }
                    new ry.c(y93, Z, cVar.f131281b).i();
                    cVar.f131283d = null;
                    cVar.f131284e = null;
                } else if (c0Var instanceof wt1.i) {
                    cVar.f131282c.getClass();
                    new d(19, 0).i();
                }
                break;
            default:
                cVar.f131282c.getClass();
                new d(19, 0).i();
                break;
        }
        return Unit.f80348a;
    }
}
