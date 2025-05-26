package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gv2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5717a;

    public gv2(v81 v81Var) {
        this.f5717a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map gmsgHandlers = (Map) this.f5717a.get();
        Intrinsics.checkNotNullParameter(gmsgHandlers, "gmsgHandlers");
        return new ru2(gmsgHandlers);
    }
}
