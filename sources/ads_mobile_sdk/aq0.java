package ads_mobile_sdk;

import a.q2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aq0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f2492a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f2493b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f2494c;

    public aq0(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3) {
        this.f2492a = o8Var;
        this.f2493b = o8Var2;
        this.f2494c = o8Var3;
    }

    @Override // a.v7
    public final Object get() {
        oh0 flags = (oh0) this.f2492a.get();
        kp concurrencyObjects = (kp) this.f2493b.get();
        q2 userAgentProvider = (q2) this.f2494c.get();
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        return new zp0(flags, concurrencyObjects.f7427c, userAgentProvider);
    }
}
