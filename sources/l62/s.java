package l62;

import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class s extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81688a;

    public s(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81688a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        String str = ((s) obj).f81688a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81688a, str);
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return this.f81688a.hashCode();
    }

    public final String toString() {
        return a.a.k("LockToggled(id=", a2.a(this.f81688a), ")");
    }
}
