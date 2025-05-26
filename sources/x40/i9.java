package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i9 implements k9, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132547d;

    /* renamed from: e, reason: collision with root package name */
    public final h9 f132548e;

    public i9(String __typename, h9 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132547d = __typename;
        this.f132548e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132548e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132547d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9)) {
            return false;
        }
        i9 i9Var = (i9) obj;
        return Intrinsics.d(this.f132547d, i9Var.f132547d) && Intrinsics.d(this.f132548e, i9Var.f132548e);
    }

    public final int hashCode() {
        return this.f132548e.hashCode() + (this.f132547d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetConversationQuery(__typename=" + this.f132547d + ", error=" + this.f132548e + ")";
    }
}
