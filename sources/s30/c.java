package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements g {

    /* renamed from: d, reason: collision with root package name */
    public final String f111026d;

    /* renamed from: e, reason: collision with root package name */
    public final b f111027e;

    public c(String __typename, b bVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f111026d = __typename;
        this.f111027e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f111026d, cVar.f111026d) && Intrinsics.d(this.f111027e, cVar.f111027e);
    }

    public final int hashCode() {
        int hashCode = this.f111026d.hashCode() * 31;
        b bVar = this.f111027e;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "AndroidCubesSignInCardResponseV3AndroidCubesSignInQuery(__typename=" + this.f111026d + ", data=" + this.f111027e + ")";
    }
}
