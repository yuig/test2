package j30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f74547d;

    public c(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74547d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f74547d, ((c) obj).f74547d);
    }

    public final int hashCode() {
        return this.f74547d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetUserHandlerQuery(__typename="), this.f74547d, ")");
    }
}
