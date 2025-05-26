package l62;

import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class j extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81644a;

    public j(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81644a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        String str = ((j) obj).f81644a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81644a, str);
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return this.f81644a.hashCode();
    }

    public final String toString() {
        return a.a.k("DuplicatePressed(id=", a2.a(this.f81644a), ")");
    }
}
