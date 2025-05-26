package w01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import rq.m4;
import x02.i2;

/* loaded from: classes5.dex */
public final class o0 extends i01.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f127090a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f127091b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f127092c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.d0 f127093d;

    /* renamed from: e, reason: collision with root package name */
    public f30 f127094e;

    public o0(String pinUid, i2 pinRepository, b11.g monolithHeaderConfig, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f127090a = pinUid;
        this.f127091b = pinRepository;
        this.f127092c = monolithHeaderConfig;
        this.f127093d = pinalytics;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        i01.e0 view = (i01.e0) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        ((m4) view).f109381d = true;
        if (this.f127094e == null) {
            addDisposable(nl.b.s(this.f127091b.S(this.f127090a), new dx0.d(this, 28), null, null, 6));
        } else {
            p3();
        }
    }

    public final void p3() {
        f30 pin;
        if (!isBound() || (pin = this.f127094e) == null) {
            return;
        }
        m4 m4Var = (m4) ((i01.e0) getView());
        m4Var.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        b11.g config = this.f127092c;
        Intrinsics.checkNotNullParameter(config, "config");
        nx.d0 pinalytics = this.f127093d;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        m4Var.bindData(true, pin, config, pinalytics);
    }
}
