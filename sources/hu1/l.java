package hu1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes4.dex */
public final class l implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f70428a;

    public l() {
        Intrinsics.checkNotNullParameter("me", "userId");
        this.f70428a = "me";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f70428a, ((l) obj).f70428a);
    }

    public final int hashCode() {
        return this.f70428a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NavUserModelLoaderVMState(userId="), this.f70428a, ")");
    }
}
