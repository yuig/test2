package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class md implements od, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132821d;

    /* renamed from: e, reason: collision with root package name */
    public final ld f132822e;

    public md(String __typename, ld error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132821d = __typename;
        this.f132822e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132822e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132821d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md)) {
            return false;
        }
        md mdVar = (md) obj;
        return Intrinsics.d(this.f132821d, mdVar.f132821d) && Intrinsics.d(this.f132822e, mdVar.f132822e);
    }

    public final int hashCode() {
        return this.f132822e.hashCode() + (this.f132821d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetConversationQuery(__typename=" + this.f132821d + ", error=" + this.f132822e + ")";
    }
}
