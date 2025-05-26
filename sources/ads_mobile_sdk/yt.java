package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yt implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14387a;

    public yt(v81 v81Var) {
        this.f14387a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map gmsgHandlers = (Map) this.f14387a.get();
        Intrinsics.checkNotNullParameter(gmsgHandlers, "gmsgHandlers");
        return new xs(gmsgHandlers);
    }
}
