package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nv2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9004a;

    public nv2(v81 v81Var) {
        this.f9004a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map modifiers = (Map) this.f9004a.get();
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        return new a.ia(modifiers);
    }
}
