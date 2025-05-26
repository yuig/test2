package ia0;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;

/* loaded from: classes5.dex */
public final class q implements u50.o {

    /* renamed from: c, reason: collision with root package name */
    public static final q f71983c = new q(ra0.d.f106910c, new b((rl1.q) null, (f0) (0 == true ? 1 : 0), 7));

    /* renamed from: a, reason: collision with root package name */
    public final ra0.d f71984a;

    /* renamed from: b, reason: collision with root package name */
    public final b f71985b;

    public q(ra0.d collage, b attribution) {
        Intrinsics.checkNotNullParameter(collage, "collage");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        this.f71984a = collage;
        this.f71985b = attribution;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f71984a, qVar.f71984a) && Intrinsics.d(this.f71985b, qVar.f71985b);
    }

    public final int hashCode() {
        return this.f71985b.hashCode() + (this.f71984a.hashCode() * 31);
    }

    public final String toString() {
        return "CollageState(collage=" + this.f71984a + ", attribution=" + this.f71985b + ")";
    }
}
