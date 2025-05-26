package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u implements z {

    /* renamed from: a, reason: collision with root package name */
    public final e92.e f54193a;

    public u(e92.e message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f54193a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f54193a, ((u) obj).f54193a);
    }

    public final int hashCode() {
        return this.f54193a.hashCode();
    }

    public final String toString() {
        return "OnJSMessageReceived(message=" + this.f54193a + ")";
    }
}
