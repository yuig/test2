package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jm2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6881a;

    public jm2(v81 v81Var) {
        this.f6881a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map gmsgHandlers = (Map) this.f6881a.get();
        Intrinsics.checkNotNullParameter(gmsgHandlers, "gmsgHandlers");
        return new gm2(gmsgHandlers);
    }
}
