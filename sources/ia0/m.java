package ia0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class m implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f71975a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f71976b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f71977c;

    public m(List collages, i0 title, i0 description) {
        Intrinsics.checkNotNullParameter(collages, "collages");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f71975a = collages;
        this.f71976b = title;
        this.f71977c = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f71975a, mVar.f71975a) && Intrinsics.d(this.f71976b, mVar.f71976b) && Intrinsics.d(this.f71977c, mVar.f71977c);
    }

    public final int hashCode() {
        return this.f71977c.hashCode() + ep.b.d(this.f71976b, this.f71975a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageCarouselState(collages=");
        sb3.append(this.f71975a);
        sb3.append(", title=");
        sb3.append(this.f71976b);
        sb3.append(", description=");
        return jq.b.k(sb3, this.f71977c, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m() {
        /*
            r2 = this;
            kotlin.collections.q0 r0 = kotlin.collections.q0.f80391a
            u50.h0 r1 = u50.h0.f120562a
            r2.<init>(r0, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.m.<init>():void");
    }
}
