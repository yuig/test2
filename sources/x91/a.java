package x91;

import a.cb;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f134303a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134304b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f134305c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.a0 f134306d;

    public a(wy0 wy0Var, String query, boolean z13, o82.a0 multiSectionDisplayState) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f134303a = wy0Var;
        this.f134304b = query;
        this.f134305c = z13;
        this.f134306d = multiSectionDisplayState;
    }

    public static a e(a aVar, wy0 wy0Var, String query, boolean z13, o82.a0 multiSectionDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            wy0Var = aVar.f134303a;
        }
        if ((i13 & 2) != 0) {
            query = aVar.f134304b;
        }
        if ((i13 & 4) != 0) {
            z13 = aVar.f134305c;
        }
        if ((i13 & 8) != 0) {
            multiSectionDisplayState = aVar.f134306d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        return new a(wy0Var, query, z13, multiSectionDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f134303a, aVar.f134303a) && Intrinsics.d(this.f134304b, aVar.f134304b) && this.f134305c == aVar.f134305c && Intrinsics.d(this.f134306d, aVar.f134306d);
    }

    public final int hashCode() {
        wy0 wy0Var = this.f134303a;
        return this.f134306d.f93524a.hashCode() + ep.b.e(this.f134305c, cb.d(this.f134304b, (wy0Var == null ? 0 : wy0Var.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "BlockedAccountsDisplayState(alertUser=" + this.f134303a + ", query=" + this.f134304b + ", shouldShowSearchBar=" + this.f134305c + ", multiSectionDisplayState=" + this.f134306d + ")";
    }
}
