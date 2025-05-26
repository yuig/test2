package u60;

import com.pinterest.api.model.f30;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qa2.h0;
import rl2.g0;

/* loaded from: classes5.dex */
public final class a implements mj0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f120760b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f120759a = i13;
        this.f120760b = obj;
    }

    @Override // mj0.g
    public final boolean a6(f30 pin) {
        switch (this.f120759a) {
            case 0:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (g0.U(pin)) {
                    if (pin.G5() == null) {
                        Boolean H5 = pin.H5();
                        Intrinsics.checkNotNullExpressionValue(H5, "getPinnedToProfile(...)");
                        if (!H5.booleanValue()) {
                        }
                    }
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (g0.U(pin)) {
                    if (pin.G5() == null) {
                        Boolean H52 = pin.H5();
                        Intrinsics.checkNotNullExpressionValue(H52, "getPinnedToProfile(...)");
                        if (!H52.booleanValue()) {
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // mj0.g
    public final void l2(f30 pin, h0 h0Var) {
        int i13 = this.f120759a;
        Object obj = this.f120760b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pin, "pin");
                hl0.v vVar = (hl0.v) ((e) obj).M;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                e02.a.b(vVar.H, pin, false, vVar.I, null, null, bs1.c.o(new Pair("board_id", vVar.f69509a), new Pair("board_session_id", vVar.f69511b)), null, null, null, null, null, vVar.getPresenterPinalytics().i().name(), null, null, null, false, false, null, null, null, gp1.k.BOARD_FEED, null, 3143640);
                break;
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                ((Function1) obj).invoke(pin);
                break;
        }
    }
}
