package u01;

import com.pinterest.api.model.f30;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements j01.c {

    /* renamed from: a, reason: collision with root package name */
    public final b11.g f119938a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f119939b;

    /* renamed from: c, reason: collision with root package name */
    public final hs.d f119940c;

    public t(b11.g monolithHeaderConfig, b60.b activeUserManager, hs.d moduleViewabilityHelper) {
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        this.f119938a = monolithHeaderConfig;
        this.f119939b = activeUserManager;
        this.f119940c = moduleViewabilityHelper;
    }

    @Override // j01.c
    public final r k(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (g0.o0(pin, this.f119939b, this.f119940c) && hf0.b.q()) {
            return new h(pin, this.f119938a, z13);
        }
        return null;
    }
}
