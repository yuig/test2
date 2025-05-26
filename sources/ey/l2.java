package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l2 extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final String f60530c;

    public l2(String navigationCause) {
        Intrinsics.checkNotNullParameter(navigationCause, "navigationCause");
        this.f60530c = navigationCause;
    }

    @Override // ey.u1
    public final String e() {
        return "navigation_next_location";
    }
}
