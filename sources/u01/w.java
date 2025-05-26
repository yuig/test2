package u01;

import com.pinterest.api.model.f30;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;

/* loaded from: classes5.dex */
public final class w implements j01.c {

    /* renamed from: a, reason: collision with root package name */
    public final b11.g f119962a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f119963b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f119964c;

    /* renamed from: d, reason: collision with root package name */
    public final hs.d f119965d;

    public w(b11.g monolithHeaderConfig, b60.b activeUserManager, a0 experiments, hs.d moduleViewabilityHelper) {
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        this.f119962a = monolithHeaderConfig;
        this.f119963b = activeUserManager;
        this.f119964c = experiments;
        this.f119965d = moduleViewabilityHelper;
    }

    @Override // j01.c
    public final r k(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (z13) {
            if (g0.q0(pin, this.f119963b, this.f119964c, this.f119965d)) {
                return new c(pin, this.f119962a, z13);
            }
        }
        return null;
    }
}
