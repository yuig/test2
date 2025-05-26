package l62;

import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class o extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81681a;

    public o(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81681a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        String str = ((o) obj).f81681a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81681a, str);
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return this.f81681a.hashCode();
    }

    public final String toString() {
        return a.a.k("ItemDragTrackingStopped(id=", a2.a(this.f81681a), ")");
    }
}
