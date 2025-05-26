package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ey1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4980a;

    public ey1(v81 v81Var) {
        this.f4980a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map modifiers = (Map) this.f4980a.get();
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        return new a.gf(modifiers);
    }
}
