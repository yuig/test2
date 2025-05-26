package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f136431a;

    public l0(String apdId) {
        Intrinsics.checkNotNullParameter(apdId, "apdId");
        this.f136431a = apdId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f136431a, ((l0) obj).f136431a);
    }

    public final int hashCode() {
        return this.f136431a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OnCheckedPinSpam(apdId="), this.f136431a, ")");
    }
}
