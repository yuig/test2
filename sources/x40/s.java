package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements u, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133219d;

    /* renamed from: e, reason: collision with root package name */
    public final r f133220e;

    public s(String __typename, r error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133219d = __typename;
        this.f133220e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133220e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133219d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f133219d, sVar.f133219d) && Intrinsics.d(this.f133220e, sVar.f133220e);
    }

    public final int hashCode() {
        return this.f133220e.hashCode() + (this.f133219d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3AddConversationMessageMutation(__typename=" + this.f133219d + ", error=" + this.f133220e + ")";
    }
}
