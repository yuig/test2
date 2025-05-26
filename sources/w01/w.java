package w01;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.z2;
import h32.d4;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127118i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f127119j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i13) {
        super(1);
        this.f127118i = i13;
        this.f127119j = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127118i;
        x xVar = this.f127119j;
        switch (i13) {
            case 0:
                xVar.f127132m = null;
                xVar.clearDisposables();
                return Unit.f80348a;
            case 1:
                f30 validPin = (f30) obj;
                Intrinsics.checkNotNullParameter(validPin, "validPin");
                b60.b bVar = xVar.f127122c;
                lh0.a0 a0Var = xVar.f127129j;
                if (a0Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                if (kh2.g0.q0(validPin, bVar, a0Var, xVar.f127126g)) {
                    xVar.updatePin(validPin);
                    if (((b60.d) xVar.f127122c).f() != null) {
                        f30 newPin = xVar.f127120a;
                        d1 d1Var = xVar.f127128i;
                        if (newPin != null) {
                            d4 viewType = ((i01.w) xVar.getView()).getViewType();
                            nx.d0 d0Var = xVar.f127130k.f122379a;
                            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                            qh1.f fVar = new qh1.f(viewType, d0Var);
                            xVar.f127133n = fVar;
                            String b13 = d1Var.b(newPin);
                            Intrinsics.checkNotNullParameter(newPin, "newPin");
                            fVar.f103916c = newPin;
                            fVar.f103917d = b13;
                        }
                        if (d1Var.b(validPin) != null) {
                            z0.d();
                            z0.d();
                        }
                    }
                }
                return Unit.f80348a;
            case 2:
                z2 z2Var = (z2) obj;
                Intrinsics.f(z2Var);
                x.p3(xVar, new rp0.b(z2Var));
                return Unit.f80348a;
            default:
                az0 az0Var = (az0) obj;
                Intrinsics.f(az0Var);
                x.p3(xVar, new rp0.c(az0Var));
                return Unit.f80348a;
        }
    }
}
