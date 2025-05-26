package l62;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class r extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81686a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81687b;

    public r(String id3, int i13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81686a = id3;
        this.f81687b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String str = rVar.f81686a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81686a, str) && this.f81687b == rVar.f81687b;
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return Integer.hashCode(this.f81687b) + (this.f81686a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.n(cb.o("ItemZOrderTrackingStopped(id=", a2.a(this.f81686a), ", toZIndex="), this.f81687b, ")");
    }
}
