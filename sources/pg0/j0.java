package pg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f100073a;

    /* renamed from: b, reason: collision with root package name */
    public final String f100074b;

    public j0(int i13, String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f100073a = i13;
        this.f100074b = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f100073a == j0Var.f100073a && Intrinsics.d(this.f100074b, j0Var.f100074b);
    }

    public final int hashCode() {
        return this.f100074b.hashCode() + (Integer.hashCode(this.f100073a) * 31);
    }

    public final String toString() {
        return "ShareSheetDismissEvent(source=" + this.f100073a + ", uid=" + this.f100074b + ")";
    }
}
