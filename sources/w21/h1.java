package w21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f127703a;

    public h1(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f127703a = msg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && Intrinsics.d(this.f127703a, ((h1) obj).f127703a);
    }

    public final int hashCode() {
        return this.f127703a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ExitError(msg="), this.f127703a, ")");
    }
}
