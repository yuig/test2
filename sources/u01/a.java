package u01;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.qk0;
import com.pinterest.api.model.v7;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements j01.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119872a;

    /* renamed from: b, reason: collision with root package name */
    public final b11.g f119873b;

    public a(b11.g monolithHeaderConfig, int i13) {
        this.f119872a = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
                this.f119873b = monolithHeaderConfig;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
                this.f119873b = monolithHeaderConfig;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
                this.f119873b = monolithHeaderConfig;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
                this.f119873b = monolithHeaderConfig;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
                this.f119873b = monolithHeaderConfig;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
                this.f119873b = monolithHeaderConfig;
                break;
            default:
                Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
                this.f119873b = monolithHeaderConfig;
                break;
        }
    }

    @Override // j01.c
    public final r k(f30 pin, boolean z13) {
        v7 D3;
        dl0 v63;
        jo0 q13;
        qk0 k13;
        int i13 = this.f119872a;
        b11.g gVar = this.f119873b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pin, "pin");
                return new b(pin, gVar, z13);
            case 1:
                Intrinsics.checkNotNullParameter(pin, "pin");
                return new k(pin, gVar, (pin.d5().booleanValue() || pin.m5().booleanValue() || b40.D0(pin)) ? false : true, z13);
            case 2:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (hf0.b.n() || (D3 = pin.D3()) == null) {
                    return null;
                }
                v7 a13 = ew.a(D3.getUid());
                if (a13 != null) {
                    D3 = a13;
                }
                if (kh2.w.i0(D3)) {
                    return new l(pin, gVar, z13);
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (pin.d5().booleanValue()) {
                    return null;
                }
                return new n(pin, gVar, z13);
            case 4:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (ph.a.I0(pin) && g0.p0(pin)) {
                    return new o(pin, gVar, z13);
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (pin.d5().booleanValue() || pin.s6() != null || hf0.b.n()) {
                    return null;
                }
                return new p(pin, gVar, z13);
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (!ph.a.I0(pin) || n60.o.B(pin, "getIsPromoted(...)") || (v63 = pin.v6()) == null || (q13 = v63.q()) == null || (k13 = q13.k()) == null || !qg1.d.c(k13)) {
                    return null;
                }
                return new q(pin, gVar, z13);
        }
    }
}
