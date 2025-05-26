package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n12 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8504a;

    public n12(a.o8 o8Var) {
        this.f8504a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        hu1 outOfContextTester = (hu1) this.f8504a.get();
        Intrinsics.checkNotNullParameter(outOfContextTester, "outOfContextTester");
        return new ou0(outOfContextTester);
    }
}
