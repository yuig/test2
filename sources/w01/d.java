package w01;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;

/* loaded from: classes5.dex */
public final class d extends i01.c {

    /* renamed from: a, reason: collision with root package name */
    public f30 f126986a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f126987b;

    /* renamed from: c, reason: collision with root package name */
    public final a11.b f126988c;

    /* renamed from: d, reason: collision with root package name */
    public final lh0.a0 f126989d;

    /* renamed from: e, reason: collision with root package name */
    public final rf1.d f126990e;

    /* renamed from: f, reason: collision with root package name */
    public final es.a f126991f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f126992g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f126993h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f30 f30Var, x2 userRepository, nx.d0 pinalytics, a11.b bVar, lh0.a0 experiments, rf1.d attributionMetadataBuilder, es.a adFormats) {
        super(0);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(attributionMetadataBuilder, "attributionMetadataBuilder");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f126986a = f30Var;
        this.f126987b = userRepository;
        this.f126988c = bVar;
        this.f126989d = experiments;
        this.f126990e = attributionMetadataBuilder;
        this.f126991f = adFormats;
        this.f126993h = xk2.m.b(new au0.a(this, 29));
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        i01.s view = (i01.s) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        f30 f30Var = this.f126986a;
        if (f30Var != null) {
            p3(f30Var);
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f126992g = false;
        super.onUnbind();
    }

    public final void p3(f30 f30Var) {
        if (this.f126992g || !isBound()) {
            return;
        }
        this.f126992g = true;
        wy0 L3 = f30Var.L3();
        uj2.b0 b0Var = null;
        String uid = L3 != null ? L3.getUid() : null;
        if (uid != null) {
            wy0 y63 = f30Var.y6();
            boolean d2 = Intrinsics.d(y63 != null ? y63.getUid() : null, uid);
            x2 x2Var = this.f126987b;
            b0Var = (d2 ? x2Var.g0().L(uid).s() : x2Var.L(uid).s()).r(tk2.e.f118017c);
        } else {
            wy0 n13 = b40.n(f30Var);
            if (n13 != null) {
                b0Var = uj2.b0.j(n13);
            }
        }
        if (b0Var == null) {
            return;
        }
        addDisposable(b0Var.l(wj2.c.a()).o(new com.pinterest.feature.pin.i(16, new ky0.b(11, this, f30Var)), new com.pinterest.feature.pin.i(17, b.f126959k)));
    }

    @Override // i01.c
    public final void updatePin(f30 updatedPin) {
        Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
        this.f126986a = updatedPin;
        this.f126992g = false;
        p3(updatedPin);
    }
}
