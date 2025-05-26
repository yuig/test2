package u50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: c, reason: collision with root package name */
    public final List f120547c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(u50.n... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "dimens"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r2 = kotlin.collections.c0.b0(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            u50.a r0 = u50.a.f120546i
            r1.<init>(r2, r0)
            r1.f120547c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u50.b.<init>(u50.n[]):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f120547c, ((b) obj).f120547c);
    }

    public final int hashCode() {
        return this.f120547c.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("AdditiveDimen(dimens="), this.f120547c, ")");
    }
}
