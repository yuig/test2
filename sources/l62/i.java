package l62;

import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class i extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81642a;

    public i(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81642a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        String str = ((i) obj).f81642a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81642a, str);
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return this.f81642a.hashCode();
    }

    public final String toString() {
        return a.a.k("DeletePressed(id=", a2.a(this.f81642a), ")");
    }
}
