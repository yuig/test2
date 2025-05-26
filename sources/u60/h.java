package u60;

import com.pinterest.api.model.v7;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120783i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f120784j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(m mVar, int i13) {
        super(0);
        this.f120783i = i13;
        this.f120784j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f120783i;
        boolean z13 = false;
        m mVar = this.f120784j;
        switch (i13) {
            case 0:
                hl0.v vVar = (hl0.v) mVar.P;
                v7 v7Var = vVar.K;
                if ((v7Var == null || kh2.w.i0(v7Var)) && !vVar.L3() && !vVar.K3()) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 1:
                vb0.j.f125466a.M(mVar.S, "OneTapSaveConfig must be provided in order to use OneTapSaveController", tb0.p.BOARD_AND_SECTION_VIEW, new Object[0]);
                oj0.h hVar = mVar.S;
                Intrinsics.f(hVar);
                g0 g0Var = g0.SHOP_YOUR_SAVES_STL;
                u0 u0Var = u0.ONE_TAP_SAVE_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("board_id", mVar.L);
                hashMap.put("board_session_id", mVar.M);
                Unit unit = Unit.f80348a;
                oj0.b bVar = new oj0.b(g0Var, u0Var, hashMap);
                oj0.a aVar = (oj0.a) mVar.Z.getValue();
                i iVar = i.f120785i;
                return new oj0.f(mVar.L, null, hVar.f95387a, hVar.f95388b, mVar.O, hVar.f95389c, mVar.T, hVar.f95390d, bVar, aVar, mVar.Q, iVar, mVar.U, 1024);
            default:
                return new l(mVar, 0);
        }
    }
}
