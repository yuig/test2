package l62;

import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class n extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81666a;

    public n(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81666a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        String str = ((n) obj).f81666a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81666a, str);
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return this.f81666a.hashCode();
    }

    public final String toString() {
        return a.a.k("ItemDragTrackingStarted(id=", a2.a(this.f81666a), ")");
    }
}
