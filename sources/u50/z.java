package u50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends k {

    /* renamed from: c, reason: collision with root package name */
    public final List f120590c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(u50.n... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "dimens"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r2 = kotlin.collections.c0.b0(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            u50.y r0 = u50.y.f120589i
            r1.<init>(r2, r0)
            r1.f120590c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u50.z.<init>(u50.n[]):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f120590c, ((z) obj).f120590c);
    }

    public final int hashCode() {
        return this.f120590c.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("MultiplicativeDimen(dimens="), this.f120590c, ")");
    }
}
