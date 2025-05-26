package cv;

import kotlin.jvm.internal.Intrinsics;
import rm1.c;
import rm1.q;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f53254a;

    /* renamed from: b, reason: collision with root package name */
    public final q f53255b;

    /* renamed from: c, reason: collision with root package name */
    public final c f53256c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f53257d;

    public a(CharSequence description, q qVar, c cVar, boolean z13, int i13) {
        qVar = (i13 & 2) != 0 ? null : qVar;
        cVar = (i13 & 4) != 0 ? null : cVar;
        z13 = (i13 & 8) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(description, "description");
        this.f53254a = description;
        this.f53255b = qVar;
        this.f53256c = cVar;
        this.f53257d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f53254a, aVar.f53254a) && this.f53255b == aVar.f53255b && this.f53256c == aVar.f53256c && this.f53257d == aVar.f53257d;
    }

    public final int hashCode() {
        int hashCode = this.f53254a.hashCode() * 31;
        q qVar = this.f53255b;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        c cVar = this.f53256c;
        return Boolean.hashCode(this.f53257d) + ((hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdsReason(description=" + ((Object) this.f53254a) + ", icon=" + this.f53255b + ", iconColor=" + this.f53256c + ", isBulletPoint=" + this.f53257d + ")";
    }
}
