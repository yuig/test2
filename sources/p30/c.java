package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements e, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f98730d;

    /* renamed from: e, reason: collision with root package name */
    public final b f98731e;

    public c(String __typename, b error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f98730d = __typename;
        this.f98731e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f98731e;
    }

    @Override // z40.b
    public final String b() {
        return this.f98730d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f98730d, cVar.f98730d) && Intrinsics.d(this.f98731e, cVar.f98731e);
    }

    public final int hashCode() {
        return this.f98731e.hashCode() + (this.f98730d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3EmailClickMutation(__typename=" + this.f98730d + ", error=" + this.f98731e + ")";
    }
}
