package iu1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes4.dex */
public final class t implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f73718a;

    public t() {
        Intrinsics.checkNotNullParameter("me", "userId");
        this.f73718a = "me";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f73718a, ((t) obj).f73718a);
    }

    public final int hashCode() {
        return this.f73718a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NavDemoTwoVMState(userId="), this.f73718a, ")");
    }
}
