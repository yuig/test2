package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dy1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4514a;

    public dy1(v81 v81Var) {
        this.f4514a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map gmsgHandlers = (Map) this.f4514a.get();
        Intrinsics.checkNotNullParameter(gmsgHandlers, "gmsgHandlers");
        return new yx1(gmsgHandlers);
    }
}
