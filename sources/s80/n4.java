package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111707a;

    public n4(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f111707a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        String str = ((n4) obj).f111707a;
        int i13 = r72.a2.f106437b;
        return Intrinsics.d(this.f111707a, str);
    }

    public final int hashCode() {
        int i13 = r72.a2.f106437b;
        return this.f111707a.hashCode();
    }

    public final String toString() {
        return a.a.k("DeleteCutout(id=", r72.a2.a(this.f111707a), ")");
    }
}
