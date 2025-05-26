package l62;

import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81661a;

    public m(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81661a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        String str = ((m) obj).f81661a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81661a, str);
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return this.f81661a.hashCode();
    }

    public final String toString() {
        return a.a.k("ItemClicked(id=", a2.a(this.f81661a), ")");
    }
}
