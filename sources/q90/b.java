package q90;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f103031a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f103032b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u50.h0, u50.i0] */
    public b(f0 title, int i13) {
        int i14 = i13 & 1;
        ?? subtitle = h0.f120562a;
        title = i14 != 0 ? subtitle : title;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f103031a = title;
        this.f103032b = subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f103031a, bVar.f103031a) && Intrinsics.d(this.f103032b, bVar.f103032b);
    }

    public final int hashCode() {
        return this.f103032b.hashCode() + (this.f103031a.hashCode() * 31);
    }

    public final String toString() {
        return "CloseupMetadataState(title=" + this.f103031a + ", subtitle=" + this.f103032b + ")";
    }
}
