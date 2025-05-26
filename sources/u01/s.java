package u01;

import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import kh2.p2;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;
import rl2.g0;
import rq.k0;

/* loaded from: classes5.dex */
public final class s implements j01.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119935a;

    /* renamed from: b, reason: collision with root package name */
    public final b11.g f119936b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f119937c;

    public s(b11.g monolithHeaderConfig, b60.b activeUserManager, int i13) {
        this.f119935a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
            Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
            this.f119936b = monolithHeaderConfig;
            this.f119937c = activeUserManager;
            return;
        }
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f119936b = monolithHeaderConfig;
        this.f119937c = activeUserManager;
    }

    @Override // j01.c
    public final r k(f30 pin, boolean z13) {
        wy0 f13;
        int i13 = this.f119935a;
        b11.g gVar = this.f119936b;
        Object obj = this.f119937c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (!ph.a.I0(pin)) {
                    return null;
                }
                b60.d dVar = (b60.d) ((b60.b) obj);
                wy0 f14 = dVar.f();
                if ((f14 == null || !Intrinsics.d(f14.G3(), Boolean.TRUE)) && ((f13 = dVar.f()) == null || dl2.b.O1(f13, false))) {
                    return null;
                }
                v7 D3 = pin.D3();
                if (D3 != null) {
                    v7 a13 = ew.a(D3.getUid());
                    if (a13 != null) {
                        D3 = a13;
                    }
                    if ((!D3.g1().booleanValue() && g0.W(pin)) || kh2.d.I0(D3)) {
                        return null;
                    }
                }
                return new e(pin, gVar, z13);
            case 1:
                Intrinsics.checkNotNullParameter(pin, "pin");
                wy0 f15 = ((b60.d) ((b60.b) obj)).f();
                boolean d2 = f15 != null ? Intrinsics.d(f15.G3(), Boolean.TRUE) : false;
                if (ph.a.I0(pin) && p2.Z0(pin, f15, er0.a.UNIFIED)) {
                    return new i(pin, gVar, z13, d2);
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (hf0.b.n()) {
                    return null;
                }
                int i14 = k0.f109323r;
                if (g4.u.U(pin, (a0) obj)) {
                    return new f(pin, gVar, z13);
                }
                return null;
        }
    }

    public s(b11.g monolithHeaderConfig, a0 experiments) {
        this.f119935a = 2;
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f119936b = monolithHeaderConfig;
        this.f119937c = experiments;
    }
}
