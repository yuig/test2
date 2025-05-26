package u60;

import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120809i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f120810j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(x xVar, int i13) {
        super(0);
        this.f120809i = i13;
        this.f120810j = xVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f120809i;
        x xVar = this.f120810j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(xVar.f0());
            case 1:
                vb0.j.f125466a.M(xVar.V, "OneTapSaveConfig must be provided in order to use OneTapSaveController", tb0.p.BOARD_AND_SECTION_VIEW, new Object[0]);
                oj0.h hVar = xVar.V;
                Intrinsics.f(hVar);
                g0 g0Var = g0.BOARD_SHOP_MODULE;
                u0 u0Var = u0.ONE_TAP_SAVE_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("board_id", xVar.L);
                hashMap.put("board_session_id", xVar.M);
                Unit unit = Unit.f80348a;
                oj0.b bVar = new oj0.b(g0Var, u0Var, hashMap);
                oj0.a aVar = (oj0.a) xVar.f120818e0.getValue();
                u uVar = new u(xVar, 0);
                return new oj0.f(xVar.L, null, hVar.f95387a, hVar.f95388b, xVar.W, hVar.f95389c, xVar.S, hVar.f95390d, bVar, aVar, xVar.P, uVar, xVar.X, 1024);
            default:
                return new l(xVar, 2);
        }
    }
}
