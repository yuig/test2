package ads_mobile_sdk;

import a.xb;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fm1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5205a;

    public fm1(v81 v81Var) {
        this.f5205a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map modifiers = (Map) this.f5205a.get();
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        return new xb(modifiers);
    }
}
