package um1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.o;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f122786a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f122787b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f122788c;

    /* renamed from: d, reason: collision with root package name */
    public final int f122789d;

    public b(Integer num, i0 contentDescription, fm1.c visibility, int i13) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f122786a = num;
        this.f122787b = contentDescription;
        this.f122788c = visibility;
        this.f122789d = i13;
    }

    public static b e(b bVar, Integer num, fm1.c visibility, int i13, int i14) {
        if ((i14 & 1) != 0) {
            num = bVar.f122786a;
        }
        i0 contentDescription = bVar.f122787b;
        if ((i14 & 4) != 0) {
            visibility = bVar.f122788c;
        }
        if ((i14 & 8) != 0) {
            i13 = bVar.f122789d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new b(num, contentDescription, visibility, i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f122786a, bVar.f122786a) && Intrinsics.d(this.f122787b, bVar.f122787b) && this.f122788c == bVar.f122788c && this.f122789d == bVar.f122789d;
    }

    public final int hashCode() {
        Integer num = this.f122786a;
        return Integer.hashCode(this.f122789d) + d7.g.a(this.f122788c, ep.b.d(this.f122787b, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "DisplayState(count=" + this.f122786a + ", contentDescription=" + this.f122787b + ", visibility=" + this.f122788c + ", id=" + this.f122789d + ")";
    }
}
