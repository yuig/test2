package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vk1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12553a;

    public vk1(v81 v81Var) {
        this.f12553a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map gmsgHandlers = (Map) this.f12553a.get();
        Intrinsics.checkNotNullParameter(gmsgHandlers, "gmsgHandlers");
        return new qk1(gmsgHandlers);
    }
}
