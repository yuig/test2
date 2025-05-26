package n90;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f89988a;

    /* renamed from: b, reason: collision with root package name */
    public final List f89989b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89990c;

    public a(f0 title, ArrayList cutouts, int i13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cutouts, "cutouts");
        this.f89988a = title;
        this.f89989b = cutouts;
        this.f89990c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f89988a, aVar.f89988a) && Intrinsics.d(this.f89989b, aVar.f89989b) && this.f89990c == aVar.f89990c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89990c) + ep.b.c(this.f89989b, this.f89988a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CarouselCardDisplayState(title=");
        sb3.append(this.f89988a);
        sb3.append(", cutouts=");
        sb3.append(this.f89989b);
        sb3.append(", id=");
        return a.a.n(sb3, this.f89990c, ")");
    }
}
