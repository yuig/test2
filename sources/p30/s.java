package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s implements t {

    /* renamed from: d, reason: collision with root package name */
    public final String f98757d;

    public s(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98757d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f98757d, ((s) obj).f98757d);
    }

    public final int hashCode() {
        return this.f98757d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3RedeemInviteMutation(__typename="), this.f98757d, ")");
    }
}
