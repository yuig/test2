package i01;

import com.pinterest.api.model.hz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f70684a;

    /* renamed from: b, reason: collision with root package name */
    public a11.b f70685b;

    /* renamed from: c, reason: collision with root package name */
    public final hz f70686c;

    public p(String str, a11.b arrivalMethod, hz hzVar) {
        Intrinsics.checkNotNullParameter(arrivalMethod, "arrivalMethod");
        this.f70684a = str;
        this.f70685b = arrivalMethod;
        this.f70686c = hzVar;
    }

    public final a11.b a() {
        return this.f70685b;
    }

    public final String b() {
        return this.f70684a;
    }

    public final void c(a11.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f70685b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f70684a, pVar.f70684a) && this.f70685b == pVar.f70685b && Intrinsics.d(this.f70686c, pVar.f70686c);
    }

    public final int hashCode() {
        String str = this.f70684a;
        int hashCode = (this.f70685b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        hz hzVar = this.f70686c;
        return hashCode + (hzVar != null ? hzVar.hashCode() : 0);
    }

    public final String toString() {
        return "NavigationArrivalExtras(feedTrackingParam=" + this.f70684a + ", arrivalMethod=" + this.f70685b + ", landingContext=" + this.f70686c + ")";
    }
}
