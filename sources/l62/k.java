package l62;

import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class k extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81649a;

    public k(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81649a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = ((k) obj).f81649a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81649a, str);
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return this.f81649a.hashCode();
    }

    public final String toString() {
        return a.a.k("HideToggled(id=", a2.a(this.f81649a), ")");
    }
}
