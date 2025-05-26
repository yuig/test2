package ai2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15247a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15248b;

    public a(String id3, boolean z13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f15247a = id3;
        this.f15248b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f15247a, aVar.f15247a) && this.f15248b == aVar.f15248b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15248b) + (this.f15247a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SessionData(id=");
        sb3.append(this.f15247a);
        sb3.append(", isForeground=");
        return cb.m(sb3, this.f15248b, ')');
    }
}
