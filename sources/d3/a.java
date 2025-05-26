package d3;

import b3.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public n4.b f53644a;

    /* renamed from: b, reason: collision with root package name */
    public n4.k f53645b;

    /* renamed from: c, reason: collision with root package name */
    public u f53646c;

    /* renamed from: d, reason: collision with root package name */
    public long f53647d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f53644a, aVar.f53644a) && this.f53645b == aVar.f53645b && Intrinsics.d(this.f53646c, aVar.f53646c) && a3.f.a(this.f53647d, aVar.f53647d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f53647d) + ((this.f53646c.hashCode() + ((this.f53645b.hashCode() + (this.f53644a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f53644a + ", layoutDirection=" + this.f53645b + ", canvas=" + this.f53646c + ", size=" + ((Object) a3.f.f(this.f53647d)) + ')';
    }
}
