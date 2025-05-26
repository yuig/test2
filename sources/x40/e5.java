package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e5 implements g5, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132313d;

    /* renamed from: e, reason: collision with root package name */
    public final d5 f132314e;

    public e5(String __typename, d5 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132313d = __typename;
        this.f132314e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132314e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132313d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return Intrinsics.d(this.f132313d, e5Var.f132313d) && Intrinsics.d(this.f132314e, e5Var.f132314e);
    }

    public final int hashCode() {
        return this.f132314e.hashCode() + (this.f132313d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3CreateConversationMutation(__typename=" + this.f132313d + ", error=" + this.f132314e + ")";
    }
}
