package k31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f78257a;

    /* renamed from: b, reason: collision with root package name */
    public final i f78258b;

    public j(String title, i cta) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta, "cta");
        this.f78257a = title;
        this.f78258b = cta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f78257a, jVar.f78257a) && Intrinsics.d(this.f78258b, jVar.f78258b);
    }

    public final int hashCode() {
        return this.f78258b.hashCode() + (this.f78257a.hashCode() * 31);
    }

    public final String toString() {
        return "UnorganizedIdeasHeaderDisplayState(title=" + this.f78257a + ", cta=" + this.f78258b + ")";
    }
}
