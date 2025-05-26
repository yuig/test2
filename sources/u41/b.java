package u41;

import kotlin.jvm.internal.Intrinsics;
import p1.x0;
import p1.y0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f120475a;

    /* renamed from: b, reason: collision with root package name */
    public final int f120476b;

    public b(x0 contentPadding, int i13) {
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        this.f120475a = contentPadding;
        this.f120476b = i13;
    }

    public static b a(b bVar, y0 contentPadding) {
        int i13 = bVar.f120476b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        return new b(contentPadding, i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f120475a, bVar.f120475a) && this.f120476b == bVar.f120476b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120476b) + (this.f120475a.hashCode() * 31);
    }

    public final String toString() {
        return "PillBarDisplayStyle(contentPadding=" + this.f120475a + ", spacing=" + this.f120476b + ")";
    }
}
