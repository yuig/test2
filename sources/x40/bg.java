package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bg implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132055a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132056b;

    public bg(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132055a = __typename;
        this.f132056b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132056b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return Intrinsics.d(this.f132055a, bgVar.f132055a) && Intrinsics.d(this.f132056b, bgVar.f132056b);
    }

    public final int hashCode() {
        int hashCode = this.f132055a.hashCode() * 31;
        Boolean bool = this.f132056b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132055a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132056b, ")");
    }
}
