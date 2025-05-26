package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n5 implements p5, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132876d;

    /* renamed from: e, reason: collision with root package name */
    public final m5 f132877e;

    public n5(String __typename, m5 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132876d = __typename;
        this.f132877e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132877e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132876d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return Intrinsics.d(this.f132876d, n5Var.f132876d) && Intrinsics.d(this.f132877e, n5Var.f132877e);
    }

    public final int hashCode() {
        return this.f132877e.hashCode() + (this.f132876d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3CreateConversationMutation(__typename=" + this.f132876d + ", error=" + this.f132877e + ")";
    }
}
