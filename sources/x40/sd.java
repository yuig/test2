package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sd implements ud, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133267d;

    /* renamed from: e, reason: collision with root package name */
    public final rd f133268e;

    public sd(String __typename, rd error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133267d = __typename;
        this.f133268e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133268e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133267d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj;
        return Intrinsics.d(this.f133267d, sdVar.f133267d) && Intrinsics.d(this.f133268e, sdVar.f133268e);
    }

    public final int hashCode() {
        return this.f133268e.hashCode() + (this.f133267d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3HideConversationMutation(__typename=" + this.f133267d + ", error=" + this.f133268e + ")";
    }
}
