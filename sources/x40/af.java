package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class af implements cf, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f131966d;

    /* renamed from: e, reason: collision with root package name */
    public final ze f131967e;

    public af(String __typename, ze error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f131966d = __typename;
        this.f131967e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f131967e;
    }

    @Override // z40.b
    public final String b() {
        return this.f131966d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return Intrinsics.d(this.f131966d, afVar.f131966d) && Intrinsics.d(this.f131967e, afVar.f131967e);
    }

    public final int hashCode() {
        return this.f131967e.hashCode() + (this.f131966d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3MarkContactRequestReadMutation(__typename=" + this.f131966d + ", error=" + this.f131967e + ")";
    }
}
