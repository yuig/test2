package h31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f66800a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66801b;

    public a(String userId, boolean z13) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f66800a = userId;
        this.f66801b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f66800a, aVar.f66800a) && this.f66801b == aVar.f66801b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66801b) + (this.f66800a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadingArgs(userId=" + this.f66800a + ", isMe=" + this.f66801b + ")";
    }
}
