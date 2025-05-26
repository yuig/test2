package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p31 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9529a;

    public p31(v81 v81Var) {
        this.f9529a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map gmsgHandlers = (Map) this.f9529a.get();
        Intrinsics.checkNotNullParameter(gmsgHandlers, "gmsgHandlers");
        return new l31(gmsgHandlers);
    }
}
