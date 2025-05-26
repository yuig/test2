package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final sl1.i f96534a;

    public l(sl1.i group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f96534a = group;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f96534a, ((l) obj).f96534a);
    }

    public final int hashCode() {
        return this.f96534a.hashCode();
    }

    public final String toString() {
        return "Collaborators(group=" + this.f96534a + ")";
    }
}
