package u60;

import com.pinterest.api.model.v7;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120796i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f120797j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(s sVar, int i13) {
        super(0);
        this.f120796i = i13;
        this.f120797j = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f0 f0Var = vb0.j.f125466a;
        int i13 = this.f120796i;
        boolean z13 = false;
        int i14 = 1;
        s sVar = this.f120797j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        hl0.v vVar = (hl0.v) sVar.R;
                        v7 v7Var = vVar.K;
                        if ((v7Var == null || kh2.w.i0(v7Var)) && !vVar.L3() && !vVar.K3()) {
                            z13 = true;
                        }
                        return Boolean.valueOf(z13);
                    default:
                        return Boolean.valueOf(s.f0(sVar));
                }
            case 1:
                switch (i13) {
                    case 0:
                        hl0.v vVar2 = (hl0.v) sVar.R;
                        v7 v7Var2 = vVar2.K;
                        if ((v7Var2 == null || kh2.w.i0(v7Var2)) && !vVar2.L3() && !vVar2.K3()) {
                            z13 = true;
                        }
                        return Boolean.valueOf(z13);
                    default:
                        return Boolean.valueOf(s.f0(sVar));
                }
            case 2:
                f0Var.M(sVar.V, "OneTapSaveConfig must be provided in order to use OneTapSaveController", tb0.p.BOARD_AND_SECTION_VIEW, new Object[0]);
                oj0.h hVar = sVar.V;
                Intrinsics.f(hVar);
                g0 g0Var = g0.BOARD_SHOP_MODULE;
                u0 u0Var = u0.ONE_TAP_SAVE_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("board_id", sVar.L);
                hashMap.put("board_session_id", sVar.M);
                Unit unit = Unit.f80348a;
                return new oj0.f(sVar.L, null, hVar.f95387a, hVar.f95388b, sVar.O, hVar.f95389c, sVar.T, hVar.f95390d, new oj0.b(g0Var, u0Var, hashMap), (oj0.a) sVar.f120804c0.getValue(), sVar.S, new o(sVar, i14), sVar.W, 1024);
            case 3:
                f0Var.M(sVar.V, "OneTapSaveConfig must be provided in order to use OneTapSaveController", tb0.p.BOARD_AND_SECTION_VIEW, new Object[0]);
                oj0.h hVar2 = sVar.V;
                Intrinsics.f(hVar2);
                oj0.b bVar = oj0.b.f95357d;
                HashMap hashMap2 = bVar.f95360c;
                hashMap2.put("board_id", sVar.L);
                hashMap2.put("board_session_id", sVar.M);
                hashMap2.put("is_saved_to_wishlist", "true");
                Unit unit2 = Unit.f80348a;
                return new oj0.g(hVar2.f95387a, hVar2.f95388b, sVar.O, hVar2.f95389c, sVar.T, hVar2.f95390d, bVar, (oj0.a) sVar.f120804c0.getValue(), hVar2.f95391e, hVar2.f95392f, sVar.W);
            default:
                return new l(sVar, 1);
        }
    }
}
