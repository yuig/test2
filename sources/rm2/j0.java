package rm2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f108741a;

    public j0(String str) {
        this.f108741a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f108741a, ((j0) obj).f108741a);
    }

    public final int hashCode() {
        return this.f108741a.hashCode();
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("MemberSignature(signature="), this.f108741a, ')');
    }
}
