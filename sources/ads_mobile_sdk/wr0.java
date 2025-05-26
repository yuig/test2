package ads_mobile_sdk;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class wr0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13190a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f13191b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f13192c;

    public wr0(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3) {
        this.f13190a = o8Var;
        this.f13191b = o8Var2;
        this.f13192c = o8Var3;
    }

    @Override // a.v7
    public final Object get() {
        ix2 userAgentProviderImpl = (ix2) this.f13190a.get();
        j0 backgroundScope = (j0) this.f13191b.get();
        sb2 rootTraceCreator = (sb2) this.f13192c.get();
        Intrinsics.checkNotNullParameter(userAgentProviderImpl, "userAgentProviderImpl");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        return new sr0(userAgentProviderImpl, backgroundScope, rootTraceCreator);
    }
}
