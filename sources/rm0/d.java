package rm0;

import kotlin.jvm.internal.Intrinsics;
import u50.h0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class d implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final d f108685c = new d(null, 3);

    /* renamed from: a, reason: collision with root package name */
    public final i0 f108686a;

    /* renamed from: b, reason: collision with root package name */
    public final c f108687b;

    public d(i0 title, int i13) {
        title = (i13 & 1) != 0 ? h0.f120562a : title;
        b icon = b.f108684a;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f108686a = title;
        this.f108687b = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f108686a, dVar.f108686a) && Intrinsics.d(this.f108687b, dVar.f108687b);
    }

    public final int hashCode() {
        int hashCode = this.f108686a.hashCode() * 31;
        this.f108687b.getClass();
        return hashCode + 2005165599;
    }

    public final String toString() {
        return "SectionHeaderState(title=" + this.f108686a + ", icon=" + this.f108687b + ")";
    }
}
