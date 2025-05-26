package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final rp1.e f104854a;

    public x(rp1.e message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f104854a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f104854a, ((x) obj).f104854a);
    }

    public final int hashCode() {
        return this.f104854a.hashCode();
    }

    public final String toString() {
        return "OnJSMessageReceived(message=" + this.f104854a + ")";
    }
}
