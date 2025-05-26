package ads_mobile_sdk;

import a.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xd0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13614a;

    public xd0(xv0 xv0Var) {
        this.f13614a = xv0Var;
    }

    @Override // a.v7
    public final Object get() {
        z1 refreshListener = (z1) this.f13614a.get();
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        return new vd0(refreshListener);
    }
}
