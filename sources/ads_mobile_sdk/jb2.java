package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jb2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6741a;

    public jb2(a.o8 o8Var) {
        this.f6741a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.ba rewardedAdRenderer = (a.ba) this.f6741a.get();
        Intrinsics.checkNotNullParameter(rewardedAdRenderer, "rewardedAdRenderer");
        kh2.a1.p(rewardedAdRenderer);
        return rewardedAdRenderer;
    }
}
