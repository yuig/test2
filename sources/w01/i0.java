package w01;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.lx0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import h32.v0;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rq.j4;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127043i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f127044j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(m0 m0Var, int i13) {
        super(1);
        this.f127043i = i13;
        this.f127044j = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 f30Var;
        wy0 f13;
        nx.d0 pinalytics;
        int i13 = this.f127043i;
        m0 m0Var = this.f127044j;
        switch (i13) {
            case 0:
                z2 z2Var = (z2) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(z2Var);
                        m0.p3(m0Var, new rp0.b(z2Var));
                        break;
                    default:
                        Intrinsics.f(z2Var);
                        m0.q3(m0Var, new rp0.b(z2Var));
                        break;
                }
                break;
            case 1:
                tt1.a aVar = (tt1.a) obj;
                Intrinsics.checkNotNullExpressionValue(aVar.c(), "getData(...)");
                if (!((Collection) r0).isEmpty()) {
                    m0Var.z3((lx0) ((List) aVar.c()).get(0));
                } else {
                    m0Var.f127079s = null;
                }
                break;
            case 2:
                m0Var.f127078r = kotlin.collections.q0.f80391a;
                m0Var.f127079s = null;
                m0Var.f127080t = null;
                m0Var.clearDisposables();
                if (m0Var.isBound() && (f30Var = m0Var.f127062b) != null && (f13 = ((b60.d) m0Var.f127067g).f()) != null) {
                    ((j4) ((i01.r) m0Var.getView())).o(f30Var, f13);
                }
                break;
            case 3:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "validPin");
                if (m0Var.f127062b == null) {
                    m0Var.f127062b = pin;
                } else {
                    m0Var.updatePin(pin);
                }
                wy0 f14 = ((b60.d) m0Var.f127067g).f();
                if (f14 != null) {
                    ((j4) ((i01.r) m0Var.getView())).i(pin, f14);
                    b11.g config = m0Var.f127064d;
                    if (config != null && (pinalytics = m0Var.f127065e) != null) {
                        j4 j4Var = (j4) ((i01.r) m0Var.getView());
                        j4Var.getClass();
                        Intrinsics.checkNotNullParameter(pin, "pin");
                        Intrinsics.checkNotNullParameter(config, "config");
                        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                        j4Var.bindData(true, pin, config, pinalytics);
                    }
                    if (b40.f0(pin) == 0) {
                        m0Var.f127078r = kotlin.collections.q0.f80391a;
                        m0Var.f127079s = null;
                        m0Var.f127080t = null;
                        m0Var.f127076p = true;
                        m0Var.u3();
                    } else {
                        m0Var.u3();
                    }
                    m0Var.s3();
                    String b13 = m0Var.f127074n.b(pin);
                    if (b13 != null) {
                        v0 v0Var = new v0();
                        v0Var.G = b13;
                        m0Var.f127083w = v0Var;
                    }
                }
                break;
            case 4:
                z2 z2Var2 = (z2) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(z2Var2);
                        m0.p3(m0Var, new rp0.b(z2Var2));
                        break;
                    default:
                        Intrinsics.f(z2Var2);
                        m0.q3(m0Var, new rp0.b(z2Var2));
                        break;
                }
                break;
            default:
                az0 az0Var = (az0) obj;
                Intrinsics.f(az0Var);
                m0.q3(m0Var, new rp0.c(az0Var));
                break;
        }
        return Unit.f80348a;
    }
}
