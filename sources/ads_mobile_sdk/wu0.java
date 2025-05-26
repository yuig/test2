package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class wu0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13266a;

    public wu0(v81 v81Var) {
        this.f13266a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map gmsgHandlers = (Map) this.f13266a.get();
        Intrinsics.checkNotNullParameter(gmsgHandlers, "gmsgHandlers");
        return new nu0(gmsgHandlers);
    }
}
