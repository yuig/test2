package ba1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f22369a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22370b;

    public h(String str, boolean z13) {
        this.f22369a = str;
        this.f22370b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f22369a, hVar.f22369a) && this.f22370b == hVar.f22370b;
    }

    public final int hashCode() {
        String str = this.f22369a;
        return Boolean.hashCode(this.f22370b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ClaimedAccountsArgs(instagramUsername=" + this.f22369a + ", isConnectedToNewInstagramApi=" + this.f22370b + ")";
    }
}
