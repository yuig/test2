package is0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.zs;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import gb2.i;
import h32.g0;
import h32.u0;
import java.util.List;
import kg.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.f0;
import vb0.j;
import wa2.o;
import wa2.p;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73533i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f73534j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, int i13) {
        super(1);
        this.f73533i = i13;
        this.f73534j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73533i;
        h hVar = this.f73534j;
        switch (i13) {
            case 0:
                f30 f30Var = (f30) obj;
                Intrinsics.f(f30Var);
                hVar.B3(f30Var);
                return Unit.f80348a;
            case 1:
                List<i> list = (List) obj;
                Intrinsics.f(list);
                for (i iVar : list) {
                    if (iVar.f64755c != o.EVENT_ONLY) {
                        hVar.f73559q.put(iVar.f64753a, iVar);
                    }
                }
                return Unit.f80348a;
            case 2:
                ((PinGridHideView) ((hs0.b) hVar.getView())).b();
                return Unit.f80348a;
            default:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                hVar.getClass();
                zs t63 = pin.t6();
                Intrinsics.f(t63);
                f0 f0Var = j.f125466a;
                f0Var.N(t63, "Interest should not be null when reason is FOLLOW_INTEREST", new Object[0]);
                Boolean C = t63.C();
                Intrinsics.checkNotNullExpressionValue(C, "getIsFollowed(...)");
                f0Var.S(C.booleanValue(), "Should currently be following interest", new Object[0]);
                hVar.getPinalytics().F(g0.FLOWED_PIN, u0.INTEREST_UNFOLLOW);
                fk2.f0 q13 = t.a1(hVar.f73547e, t63, !t63.C().booleanValue()).q(new p5.b(pin, p.STATE_UNFOLLOWED_INTEREST));
                Intrinsics.checkNotNullExpressionValue(q13, "toSingleDefault(...)");
                return q13;
        }
    }
}
