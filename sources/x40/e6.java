package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e6 implements g6, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132315d;

    /* renamed from: e, reason: collision with root package name */
    public final d6 f132316e;

    public e6(String __typename, d6 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132315d = __typename;
        this.f132316e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132316e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132315d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return Intrinsics.d(this.f132315d, e6Var.f132315d) && Intrinsics.d(this.f132316e, e6Var.f132316e);
    }

    public final int hashCode() {
        return this.f132316e.hashCode() + (this.f132315d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3CreateThreadMutation(__typename=" + this.f132315d + ", error=" + this.f132316e + ")";
    }
}
