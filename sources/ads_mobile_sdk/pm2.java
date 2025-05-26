package ads_mobile_sdk;

import a.h2;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pm2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9744a;

    public pm2(v81 v81Var) {
        this.f9744a = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        Map modifiers = (Map) this.f9744a.get();
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        return new h2(modifiers);
    }
}
