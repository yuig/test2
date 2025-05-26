package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f90705a;

    public i1(String contentId) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        this.f90705a = contentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && Intrinsics.d(this.f90705a, ((i1) obj).f90705a);
    }

    public final int hashCode() {
        return this.f90705a.hashCode();
    }

    public final String j() {
        return this.f90705a;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OnContextualMenuHidden(contentId="), this.f90705a, ")");
    }
}
