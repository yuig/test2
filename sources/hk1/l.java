package hk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final n f69357a;

    public l(n viewBasedConstructorArgs) {
        Intrinsics.checkNotNullParameter(viewBasedConstructorArgs, "viewBasedConstructorArgs");
        this.f69357a = viewBasedConstructorArgs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f69357a, ((l) obj).f69357a);
    }

    public final int hashCode() {
        return this.f69357a.hashCode();
    }

    public final n j() {
        return this.f69357a;
    }

    public final String toString() {
        return "OverflowSingleTap(viewBasedConstructorArgs=" + this.f69357a + ")";
    }
}
