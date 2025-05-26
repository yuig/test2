package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o9 implements q9, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132954d;

    /* renamed from: e, reason: collision with root package name */
    public final n9 f132955e;

    public o9(String __typename, n9 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132954d = __typename;
        this.f132955e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132955e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132954d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return Intrinsics.d(this.f132954d, o9Var.f132954d) && Intrinsics.d(this.f132955e, o9Var.f132955e);
    }

    public final int hashCode() {
        return this.f132955e.hashCode() + (this.f132954d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetConversationsQuery(__typename=" + this.f132954d + ", error=" + this.f132955e + ")";
    }
}
